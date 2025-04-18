package com.bytedance.sdk.openadsdk.qO;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* loaded from: classes.dex */
public class wN {
    protected static int AlY = 30;
    public static int DSW = 1;
    public static int NjR = 4;
    protected static String Sg = null;
    protected static String YFl = "images";
    public static int YoT = 32;
    public static int eT = 16;

    /* renamed from: nc, reason: collision with root package name */
    public static int f10801nc = 8;
    public static int qsH = 2;
    protected static int tN = 1;

    /* renamed from: vc, reason: collision with root package name */
    public static int f10802vc = 0;
    protected static long wN = 15360;

    public static boolean Sg(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean YFl(Context context, String str) {
        return false;
    }

    public static float Sg(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Bitmap YFl(String str) {
        byte[] decode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static boolean YFl(Context context, int i10) {
        boolean YFl2;
        boolean YFl3;
        if (f10802vc == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                YFl2 = YFl(context, "android.permission.READ_MEDIA_IMAGES");
                YFl3 = true;
            } else {
                YFl2 = YFl(context, "android.permission.READ_EXTERNAL_STORAGE");
                YFl3 = YFl(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean YFl4 = YFl(context, "android.permission.CAMERA");
            boolean YFl5 = YFl(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (YFl2 && YFl3) {
                f10802vc |= DSW;
            }
            if (YFl4 && packageManager.hasSystemFeature("android.hardware.camera")) {
                f10802vc |= qsH;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                f10802vc |= NjR;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                f10802vc |= f10801nc;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                f10802vc |= eT;
            }
            if (YFl5 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                f10802vc |= YoT;
            }
        }
        return (f10802vc & i10) != 0;
    }

    public static boolean YFl(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
                return !z11 && z10;
            }
        }
        z11 = true;
        if (z11) {
        }
    }
}
