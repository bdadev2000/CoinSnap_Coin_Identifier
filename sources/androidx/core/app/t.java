package androidx.core.app;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class t {
    public static boolean a(NotificationChannel notificationChannel) {
        boolean canBypassDnd;
        canBypassDnd = notificationChannel.canBypassDnd();
        return canBypassDnd;
    }

    public static boolean b(NotificationChannel notificationChannel) {
        boolean canShowBadge;
        canShowBadge = notificationChannel.canShowBadge();
        return canShowBadge;
    }

    public static NotificationChannel c(String str, CharSequence charSequence, int i10) {
        a4.h0.m();
        return a4.h0.c(str, charSequence, i10);
    }

    public static void d(NotificationChannel notificationChannel, boolean z10) {
        notificationChannel.enableLights(z10);
    }

    public static void e(NotificationChannel notificationChannel, boolean z10) {
        notificationChannel.enableVibration(z10);
    }

    public static AudioAttributes f(NotificationChannel notificationChannel) {
        AudioAttributes audioAttributes;
        audioAttributes = notificationChannel.getAudioAttributes();
        return audioAttributes;
    }

    public static String g(NotificationChannel notificationChannel) {
        String description;
        description = notificationChannel.getDescription();
        return description;
    }

    public static String h(NotificationChannel notificationChannel) {
        String group;
        group = notificationChannel.getGroup();
        return group;
    }

    public static String i(NotificationChannel notificationChannel) {
        String id2;
        id2 = notificationChannel.getId();
        return id2;
    }

    public static int j(NotificationChannel notificationChannel) {
        int importance;
        importance = notificationChannel.getImportance();
        return importance;
    }

    public static int k(NotificationChannel notificationChannel) {
        int lightColor;
        lightColor = notificationChannel.getLightColor();
        return lightColor;
    }

    public static int l(NotificationChannel notificationChannel) {
        int lockscreenVisibility;
        lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        return lockscreenVisibility;
    }

    public static CharSequence m(NotificationChannel notificationChannel) {
        CharSequence name;
        name = notificationChannel.getName();
        return name;
    }

    public static Uri n(NotificationChannel notificationChannel) {
        Uri sound;
        sound = notificationChannel.getSound();
        return sound;
    }

    public static long[] o(NotificationChannel notificationChannel) {
        long[] vibrationPattern;
        vibrationPattern = notificationChannel.getVibrationPattern();
        return vibrationPattern;
    }

    public static void p(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    public static void q(NotificationChannel notificationChannel, String str) {
        notificationChannel.setGroup(str);
    }

    public static void r(NotificationChannel notificationChannel, int i10) {
        notificationChannel.setLightColor(i10);
    }

    public static void s(NotificationChannel notificationChannel, boolean z10) {
        notificationChannel.setShowBadge(z10);
    }

    public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static void u(NotificationChannel notificationChannel, long[] jArr) {
        notificationChannel.setVibrationPattern(jArr);
    }

    public static boolean v(NotificationChannel notificationChannel) {
        boolean shouldShowLights;
        shouldShowLights = notificationChannel.shouldShowLights();
        return shouldShowLights;
    }

    public static boolean w(NotificationChannel notificationChannel) {
        boolean shouldVibrate;
        shouldVibrate = notificationChannel.shouldVibrate();
        return shouldVibrate;
    }
}
