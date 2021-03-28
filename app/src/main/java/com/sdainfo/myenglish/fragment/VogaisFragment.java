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


public class VogaisFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    public VogaisFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vogais, container, false);

        ImageView um = view.findViewById(R.id.imageViewNum);
        ImageView dois = view.findViewById(R.id.imageViewNdois);
        ImageView tres = view.findViewById(R.id.imageViewNtres);
        ImageView quatro = view.findViewById(R.id.imageViewNquatro);
        ImageView cinco = view.findViewById(R.id.imageViewNcinco);
        ImageView seis = view.findViewById(R.id.imageViewNseis);
        ImageView cao = view.findViewById(R.id.imageViewNcao);
        ImageView gato = view.findViewById(R.id.imageViewNgato);
        ImageView vaca = view.findViewById(R.id.imageViewNvaca);
        ImageView macaco = view.findViewById(R.id.imageViewNmacaco);
        ImageView ovelha = view.findViewById(R.id.imageViewNovelha);
        ImageView leao = view.findViewById(R.id.imageViewNleao);

        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
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
        switch (view.getId()) {
            case R.id.imageViewNum:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.one);
                tocarSom();
                break;
            case R.id.imageViewNdois:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.two);
                tocarSom();
                break;
            case R.id.imageViewNtres:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.three);
                tocarSom();
                break;
            case R.id.imageViewNquatro:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.four);
                tocarSom();
                break;
            case R.id.imageViewNcinco:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.five);
                tocarSom();
                break;
            case R.id.imageViewNseis:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.six);
                tocarSom();
                break;
            case R.id.imageViewNcao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.dog);
                tocarSom();
                break;
            case R.id.imageViewNgato:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cat);
                tocarSom();
                break;
            case R.id.imageViewNvaca:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cow);
                tocarSom();
                break;
            case R.id.imageViewNmacaco:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageViewNovelha:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.sheep);
                tocarSom();
                break;
            case R.id.imageViewNleao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                tocarSom();
                break;
        }
    }

    private void tocarSom() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}