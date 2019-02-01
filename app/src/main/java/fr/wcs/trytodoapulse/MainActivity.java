package fr.wcs.trytodoapulse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.library.PulseView;

public class MainActivity extends AppCompatActivity {

    PulseView pv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pv = (PulseView)findViewById(R.id.pv);

        pv.startPulse();
       // pv.setPulseSpawnPeriod(100);
    }
}
