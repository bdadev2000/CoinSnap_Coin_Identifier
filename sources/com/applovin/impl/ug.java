package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
final class ug implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f11606a = new float[16];
    private final float[] b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f11607c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f11608d = new float[3];

    /* renamed from: f, reason: collision with root package name */
    private final Display f11609f;

    /* renamed from: g, reason: collision with root package name */
    private final a[] f11610g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11611h;

    /* loaded from: classes.dex */
    public interface a {
        void a(float[] fArr, float f9);
    }

    public ug(Display display, a... aVarArr) {
        this.f11609f = display;
        this.f11610g = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.b);
        SensorManager.getOrientation(this.b, this.f11608d);
        return this.f11608d[2];
    }

    private void b(float[] fArr) {
        if (!this.f11611h) {
            i9.a(this.f11607c, fArr);
            this.f11611h = true;
        }
        float[] fArr2 = this.b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.b, 0, this.f11607c, 0);
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i9) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f11606a, sensorEvent.values);
        a(this.f11606a, this.f11609f.getRotation());
        float a6 = a(this.f11606a);
        c(this.f11606a);
        b(this.f11606a);
        a(this.f11606a, a6);
    }

    private void a(float[] fArr, float f9) {
        for (a aVar : this.f11610g) {
            aVar.a(fArr, f9);
        }
    }

    private void a(float[] fArr, int i9) {
        if (i9 != 0) {
            int i10 = 129;
            int i11 = 1;
            if (i9 == 1) {
                i11 = 129;
                i10 = 2;
            } else if (i9 == 2) {
                i11 = 130;
            } else {
                if (i9 != 3) {
                    throw new IllegalStateException();
                }
                i10 = 130;
            }
            float[] fArr2 = this.b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.b, i10, i11, fArr);
        }
    }
}
