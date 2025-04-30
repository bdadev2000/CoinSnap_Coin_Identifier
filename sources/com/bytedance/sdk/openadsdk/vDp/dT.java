package com.bytedance.sdk.openadsdk.vDp;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;

/* loaded from: classes.dex */
public class dT {
    public static zp zp;
    protected static final float[] lMd = new float[3];
    protected static final float[] KS = new float[3];
    protected static final float[] jU = new float[9];
    protected static final float[] COT = new float[3];

    public static void KS(Context context, SensorEventListener sensorEventListener, int i9) {
    }

    public static void jU(Context context, SensorEventListener sensorEventListener, int i9) {
    }

    public static void lMd(Context context, SensorEventListener sensorEventListener, int i9) {
    }

    public static void zp(Context context, SensorEventListener sensorEventListener) {
    }

    public static void zp(Context context, SensorEventListener sensorEventListener, int i9) {
    }

    public static void zp(zp zpVar) {
        zp = zpVar;
    }

    public static void zp(Context context, long j7) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j7);
    }
}
