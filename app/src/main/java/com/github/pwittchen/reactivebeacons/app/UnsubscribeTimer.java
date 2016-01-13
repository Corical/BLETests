package com.github.pwittchen.reactivebeacons.app;

import android.util.Log;

/**
 * Created by Corne on 2016-01-13.
 */
public class UnsubscribeTimer implements Runnable {

    private String _locationIdentifier;

    public UnsubscribeTimer(String locationIdentifier) {
        _locationIdentifier = locationIdentifier;
    }

    @Override
    public void run() {
        Log.i("AppText", "AppText - fired, left location: " + _locationIdentifier);
    }
}
