package com.glority.android.international.firebase;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/* loaded from: classes3.dex */
public class MyJobService extends JobService {
    private static final String TAG = "MyJobService";

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d(TAG, "Performing long running task in scheduled job");
        return false;
    }
}
