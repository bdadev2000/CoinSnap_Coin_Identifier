package com.bytedance.sdk.openadsdk.qO;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class nc {
    public static WeakReference<YFl> YFl;
    protected static final float[] Sg = new float[3];
    protected static final float[] tN = new float[3];
    protected static final float[] AlY = new float[9];
    protected static final float[] wN = new float[3];

    public static void AlY(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<YFl> weakReference = YFl;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th2) {
                DSW.YFl("SensorHub", "startListenRotationVector err", th2);
            }
        }
    }

    public static void Sg(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<YFl> weakReference = YFl;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th2) {
                DSW.YFl("SensorHub", "startListenGyroscope error", th2);
            }
        }
    }

    public static void YFl(Context context, SensorEventListener sensorEventListener) {
    }

    public static void tN(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<YFl> weakReference = YFl;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th2) {
                DSW.YFl("SensorHub", "startListenLinearAcceleration error", th2);
            }
        }
    }

    public static void YFl(YFl yFl) {
        YFl = new WeakReference<>(yFl);
    }

    public static void YFl(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<YFl> weakReference = YFl;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            DSW.YFl("SensorHub", "startListenAccelerometer error", th2);
        }
    }

    public static void YFl(Context context, long j3) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j3);
    }
}
