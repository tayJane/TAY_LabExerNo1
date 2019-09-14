package com.tay.labexerno1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("LL", "UST Lover's Lane");
        Log.d("RR", "UST Roque Ruano");
        Log.d("MB", "UST Main Building");
        Log.d("Lib", "UST Library");
    }
}
