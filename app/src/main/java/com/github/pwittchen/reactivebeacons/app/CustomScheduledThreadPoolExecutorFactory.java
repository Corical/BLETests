package com.github.pwittchen.reactivebeacons.app;

import android.os.Build;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by Corne on 2016-01-13.
 */
public final class CustomScheduledThreadPoolExecutorFactory {

    public static ScheduledExecutorService GetScheduledExecutorService() {
        ScheduledThreadPoolExecutor executorService = new ScheduledThreadPoolExecutor(1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            executorService.setRemoveOnCancelPolicy(true);
        }
        return executorService;
    }
}
