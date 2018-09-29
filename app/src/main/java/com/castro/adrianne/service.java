package com.castro.adrianne;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class service extends IntentService {
    public service() {
        super("service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4itc", "service is running....");
    }
}