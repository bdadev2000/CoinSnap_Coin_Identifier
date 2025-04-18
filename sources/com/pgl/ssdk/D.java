package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class D implements SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    private static D f16502f;
    private SensorManager a;

    /* renamed from: b, reason: collision with root package name */
    private int f16503b;

    /* renamed from: c, reason: collision with root package name */
    private int f16504c = 0;

    /* renamed from: d, reason: collision with root package name */
    private float[] f16505d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private List<String> f16506e = new ArrayList();

    private D(Context context) {
        this.a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.a = (SensorManager) applicationContext.getSystemService("sensor");
            } catch (Throwable unused) {
            }
        }
    }

    private synchronized void c() {
        try {
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                int i10 = this.f16503b - 1;
                this.f16503b = i10;
                if (i10 == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r7.a.registerListener(r7, r3.getDefaultSensor(1), 3) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.D.a():void");
    }

    public synchronized String b() {
        String str = "";
        int size = this.f16506e.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return this.f16506e.get(0);
        }
        try {
            List<String> list = this.f16506e;
            int i10 = size - 10;
            if (i10 <= 0) {
                i10 = 0;
            }
            List<String> subList = list.subList(i10, size);
            for (int i11 = 0; i11 < subList.size(); i11++) {
                str = str + subList.get(i11) + "|";
            }
            str = str.substring(0, str.length() - 1);
        } catch (Throwable unused) {
        }
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f16505d = sensorEvent.values;
        this.f16504c = 1;
    }

    public static D a(Context context) {
        if (f16502f == null) {
            synchronized (D.class) {
                if (f16502f == null) {
                    f16502f = new D(context);
                }
            }
        }
        return f16502f;
    }
}
