package com.bytedance.sdk.openadsdk.vDp;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* loaded from: classes.dex */
public class COT {
    public static int Bj = 16;
    protected static long COT = 15360;
    public static int HWF = 0;
    protected static int KS = 1;
    public static int QR = 1;
    public static int YW = 4;
    public static int dT = 8;
    protected static int jU = 30;
    public static int ku = 2;
    protected static String lMd = null;
    public static int vDp = 32;
    protected static String zp = "images";

    public static boolean lMd(Context context, String str) {
        if (context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static boolean zp(Context context, String str) {
        return false;
    }

    public static Bitmap zp(String str) {
        byte[] decode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static boolean zp(Context context, int i9) {
        boolean zp2;
        boolean zp3;
        if (HWF == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zp2 = zp(context, "android.permission.READ_MEDIA_IMAGES");
                zp3 = true;
            } else {
                zp2 = zp(context, "android.permission.READ_EXTERNAL_STORAGE");
                zp3 = zp(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zp4 = zp(context, "android.permission.CAMERA");
            boolean zp5 = zp(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zp2 && zp3) {
                HWF |= QR;
            }
            if (zp4 && packageManager.hasSystemFeature("android.hardware.camera")) {
                HWF |= ku;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                HWF |= YW;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                HWF |= dT;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                HWF |= Bj;
            }
            if (zp5 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                HWF |= vDp;
            }
        }
        return (HWF & i9) != 0;
    }

    public static boolean zp(Context context) {
        boolean z8;
        boolean z9;
        if (Build.VERSION.SDK_INT >= 33) {
            z8 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z8 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z9 = false;
                return !z9 && z8;
            }
        }
        z9 = true;
        if (z9) {
        }
    }
}
