package com.example.mario.video;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = (VideoView) findViewById(R.id.videoView);

        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.videoo);

        MediaController controlador = new MediaController(this);

        controlador.setAnchorView(video);

        video.setMediaController(controlador);

        video.start();
    }
}
