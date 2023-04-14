package com.example.interactiveuicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.xml.KonfettiView;

//public class MainActivity extends AppCompatActivity {

    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_main);
    //}

    //public void logInClicked(View view) {
        //Log.d("na", "logInClicked: Login Clicked");



  //  }

public class MainActivity extends AppCompatActivity {
    private KonfettiView konfettiView = null;
    private Shape.DrawableShape drawableShape = null;
    private Party party = null;

    private Party shortParty = null;

    private Party longParty = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        konfettiView = findViewById(R.id.konfettiView);

        EmitterConfig emitterConfig = new Emitter(200, TimeUnit.MILLISECONDS).perSecond(50);
        party = new PartyFactory(emitterConfig)
                .spread(360)
                .colors(Arrays.asList(0xfce18a, 0xff726d, 0xf4306d, 0xb48def))
                .setSpeedBetween(0f, 30f)
                .position(new Position.Relative(0.5, 0.3))
                .build();


        EmitterConfig emitterConfig1 = new Emitter(200, TimeUnit.MILLISECONDS).perSecond(50);
        shortParty = new PartyFactory(emitterConfig1)
                .spread(360)
                .colors(Arrays.asList(0xfce18a, 0xff726d, 0xf4306d, 0xb48def))
                .setSpeedBetween(0f, 30f)
                .position(new Position.Relative(0.5, 0.3))
                .build();


        EmitterConfig emitterConfig2 = new Emitter(2000, TimeUnit.MILLISECONDS).perSecond(750);
        longParty = new PartyFactory(emitterConfig2)
                .spread(360)
                .colors(Arrays.asList(0xfce18a, 0xff726d, 0xf4306d, 0xb48def))
                .setSpeedBetween(0f, 30f)
                .position(new Position.Relative(0.5, 0.3))
                .build();

    }

    public void showKonfetti(View view) {
        konfettiView.start(party);
    }


    public void showShortKonfetti(View view) {
        konfettiView.start(shortParty);
    }

    public void showLongKonfetti(View view) {
        konfettiView.start(longParty);
    }


}
