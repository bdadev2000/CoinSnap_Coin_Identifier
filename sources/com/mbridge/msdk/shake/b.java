package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* loaded from: classes4.dex */
public abstract class b implements SensorEventListener {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f15059b;

    /* renamed from: d, reason: collision with root package name */
    public long f15060d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f15061e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f15062f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f15063g = 0.0f;

    public b(int i10, int i11) {
        this.a = i10;
        this.f15059b = i11;
    }

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > r8.a) goto L14;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSensorChanged(android.hardware.SensorEvent r9) {
        /*
            r8 = this;
            float[] r9 = r9.values
            r0 = 0
            r0 = r9[r0]
            float r0 = -r0
            r1 = 1
            r1 = r9[r1]
            float r1 = -r1
            r2 = 2
            r9 = r9[r2]
            float r9 = -r9
            float r2 = r8.f15061e
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L22
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L22:
            float r2 = r8.f15062f
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L35
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L35:
            float r2 = r8.f15063g
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5c
            float r2 = r9 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r8.a
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5c
        L48:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.f15060d
            long r4 = r2 - r4
            int r6 = r8.f15059b
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r8.f15060d = r2
            r8.a()
        L5c:
            r8.f15061e = r0
            r8.f15062f = r1
            r8.f15063g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.shake.b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
