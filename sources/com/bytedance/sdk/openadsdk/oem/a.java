package com.bytedance.sdk.openadsdk.oem;

import android.app.NotificationChannel;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel b(int i10) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i10);
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel e(String str, String str2, int i10) {
        return new NotificationChannel(str, str2, i10);
    }

    public static /* synthetic */ InMemoryDexClassLoader k(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* synthetic */ void r() {
    }
}
