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


public class NumerosFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    public NumerosFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        ImageView um = view.findViewById(R.id.imageViewUm);
        ImageView dois = view.findViewById(R.id.imageViewDois);
        ImageView tres = view.findViewById(R.id.imageViewTres);
        ImageView quatro = view.findViewById(R.id.imageViewQuatro);
        ImageView cinco = view.findViewById(R.id.imageViewCinco);
        ImageView seis = view.findViewById(R.id.imageViewSeis);

        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageViewUm:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.one);
                tocarSom();
                break;
            case R.id.imageViewDois:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.two);
                tocarSom();
                break;
            case R.id.imageViewTres:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.three);
                tocarSom();
                break;
            case R.id.imageViewQuatro:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.four);
                tocarSom();
                break;
            case R.id.imageViewCinco:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.five);
                tocarSom();
                break;
            case R.id.imageViewSeis:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.six);
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