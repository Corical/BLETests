package com.github.pwittchen.reactivebeacons.app;

/**
 * Created by Corne on 2016-01-13.
 */

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    private final ScheduledExecutorService scheduler;

    public Scheduler() {
        scheduler = CustomScheduledThreadPoolExecutorFactory.GetScheduledExecutorService();
    }

    public ScheduledFuture<?> GetScheduledInstance(Runnable timer) {
        return scheduler.schedule(timer, 10, TimeUnit.SECONDS);
    }

}