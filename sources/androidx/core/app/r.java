package androidx.core.app;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class r {
    public static boolean a(NotificationChannel notificationChannel) {
        return notificationChannel.canBypassDnd();
    }

    public static boolean b(NotificationChannel notificationChannel) {
        return notificationChannel.canShowBadge();
    }

    public static NotificationChannel c(String str, CharSequence charSequence, int i9) {
        return new NotificationChannel(str, charSequence, i9);
    }

    public static void d(NotificationChannel notificationChannel, boolean z8) {
        notificationChannel.enableLights(z8);
    }

    public static void e(NotificationChannel notificationChannel, boolean z8) {
        notificationChannel.enableVibration(z8);
    }

    public static AudioAttributes f(NotificationChannel notificationChannel) {
        return notificationChannel.getAudioAttributes();
    }

    public static String g(NotificationChannel notificationChannel) {
        return notificationChannel.getDescription();
    }

    public static String h(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }

    public static String i(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static int j(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    public static int k(NotificationChannel notificationChannel) {
        return notificationChannel.getLightColor();
    }

    public static int l(NotificationChannel notificationChannel) {
        return notificationChannel.getLockscreenVisibility();
    }

    public static CharSequence m(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    public static Uri n(NotificationChannel notificationChannel) {
        return notificationChannel.getSound();
    }

    public static long[] o(NotificationChannel notificationChannel) {
        return notificationChannel.getVibrationPattern();
    }

    public static void p(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    public static void q(NotificationChannel notificationChannel, String str) {
        notificationChannel.setGroup(str);
    }

    public static void r(NotificationChannel notificationChannel, int i9) {
        notificationChannel.setLightColor(i9);
    }

    public static void s(NotificationChannel notificationChannel, boolean z8) {
        notificationChannel.setShowBadge(z8);
    }

    public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static void u(NotificationChannel notificationChannel, long[] jArr) {
        notificationChannel.setVibrationPattern(jArr);
    }

    public static boolean v(NotificationChannel notificationChannel) {
        return notificationChannel.shouldShowLights();
    }

    public static boolean w(NotificationChannel notificationChannel) {
        return notificationChannel.shouldVibrate();
    }
}
