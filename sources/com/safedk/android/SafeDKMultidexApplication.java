package com.safedk.android;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.support.multidex.MultiDexApplication;
import com.safedk.android.utils.Logger;

/* loaded from: classes4.dex */
public class SafeDKMultidexApplication extends MultiDexApplication {
    private static final Handler mHandler = new Handler();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Logger.d("SafeDKMultidexApplication", "onCreate");
        SafeDK.a(getApplicationContext());
        SafeDK.a((Application) this);
    }

    public static final void runOnUiThread(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            mHandler.post(runnable);
        }
    }
}
