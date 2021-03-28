package com.sdainfo.myenglish.fragment;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sdainfo.myenglish.R;


public class BichosFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    public BichosFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        ImageView cao = view.findViewById(R.id.imageViewCao);
        ImageView gato = view.findViewById(R.id.imageViewGato);
        ImageView vaca = view.findViewById(R.id.imageViewVacas);
        ImageView macaco = view.findViewById(R.id.imageViewMacaco);
        ImageView ovelha = view.findViewById(R.id.imageViewOvelha);
        ImageView leao = view.findViewById(R.id.imageViewLeao);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        vaca.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        leao.setOnClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageViewCao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.dog);
                tocarSom();
                break;
            case R.id.imageViewGato:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cat);
                tocarSom();
                break;
            case R.id.imageViewVacas:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cow);
                tocarSom();
                break;
            case R.id.imageViewMacaco:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageViewOvelha:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.sheep);
                tocarSom();
                break;
            case R.id.imageViewLeao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                tocarSom();
                break;
        }
    }

    private void tocarSom() {
        if (mediaPlayer != null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}