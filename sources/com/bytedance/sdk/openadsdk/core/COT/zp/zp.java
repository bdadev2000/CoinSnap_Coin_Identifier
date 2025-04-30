package com.bytedance.sdk.openadsdk.core.COT.zp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class zp implements Application.ActivityLifecycleCallbacks {
    private static volatile zp zp;
    private final lMd lMd;

    private zp(Application application) {
        this.lMd = lMd.zp(application);
    }

    public static zp zp(Application application) {
        if (zp == null) {
            synchronized (zp.class) {
                try {
                    if (zp == null) {
                        zp = new zp(application);
                        application.registerActivityLifecycleCallbacks(zp);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        lMd lmd = this.lMd;
        if (lmd != null) {
            lmd.zp(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        lMd lmd = this.lMd;
        if (lmd != null) {
            lmd.lMd(activity);
        }
    }

    public String zp(String str, long j7, int i9) {
        lMd lmd = this.lMd;
        if (lmd != null) {
            return lmd.zp(str, j7, i9);
        }
        return "null";
    }
}
