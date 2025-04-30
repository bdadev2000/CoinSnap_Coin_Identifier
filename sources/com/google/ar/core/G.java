package com.google.ar.core;

import android.app.NotificationChannel;
import android.content.res.Configuration;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class G {
    public static /* bridge */ /* synthetic */ int a(Configuration configuration) {
        return configuration.colorMode;
    }

    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("warning_ads", "Warning Ads", 2);
    }

    public static /* synthetic */ NotificationChannel d(int i9, String str, String str2) {
        return new NotificationChannel(str, str2, i9);
    }

    public static /* bridge */ /* synthetic */ void j(Configuration configuration, int i9) {
        configuration.colorMode = i9;
    }
}
