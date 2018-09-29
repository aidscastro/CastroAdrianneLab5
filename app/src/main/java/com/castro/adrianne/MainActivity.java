package com.castro.adrianne;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, service.class);
        startService(i);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.act1B){

            Intent i = new Intent(MainActivity.this,Main2Activity.class);

            MainActivity.this.startActivity(i);
            Log.i("Content View"," Number 2 ");
        }else if (v.getId() == R.id.act1B2){
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.580413, 120.983675"));

            Intent chooser = Intent.createChooser(i,"Choose your map app:");
            startActivity(chooser);
        }
        }
    }


