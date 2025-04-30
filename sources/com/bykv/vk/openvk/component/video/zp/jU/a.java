package com.bykv.vk.openvk.component.video.zp.jU;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ NotificationChannel b(int i9) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i9);
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillManager i(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* synthetic */ InMemoryDexClassLoader j(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return AutofillManager.class;
    }

    public static /* synthetic */ void n() {
    }
}
