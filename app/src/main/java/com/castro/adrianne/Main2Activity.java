package com.castro.adrianne;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, service.class);
        startService(i);
    }

    public void process(View view)
    {
        if (view.getId() == R.id.act2B) {
            // doStuff
            Intent i = new Intent(Main2Activity.this, MainActivity.class);
            Main2Activity.this.startActivity(i);
            Log.i("Content View", "Number 1");
        } else if (view.getId() == R.id.act2B2) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.590198, 121.037715"));
            Intent chooser = Intent.createChooser(i,"Choose your map app:");
            startActivity(chooser);
        }
    }
}



