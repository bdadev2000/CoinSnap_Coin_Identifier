package com.applovin.impl;

import android.app.ActivityManager;
import android.content.res.loader.ResourcesLoader;
import java.util.List;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class bv {
    public static /* synthetic */ ResourcesLoader e() {
        return new ResourcesLoader();
    }

    public static /* bridge */ /* synthetic */ List n(ActivityManager activityManager, String str) {
        return activityManager.getHistoricalProcessExitReasons(str, 0, 1);
    }

    public static /* synthetic */ void o() {
    }
}
