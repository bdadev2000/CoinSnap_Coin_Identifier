package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
final class ug implements SensorEventListener {
    private final float[] a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f8392b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f8393c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f8394d = new float[3];

    /* renamed from: f, reason: collision with root package name */
    private final Display f8395f;

    /* renamed from: g, reason: collision with root package name */
    private final a[] f8396g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8397h;

    /* loaded from: classes.dex */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public ug(Display display, a... aVarArr) {
        this.f8395f = display;
        this.f8396g = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f8392b);
        SensorManager.getOrientation(this.f8392b, this.f8394d);
        return this.f8394d[2];
    }

    private void b(float[] fArr) {
        if (!this.f8397h) {
            i9.a(this.f8393c, fArr);
            this.f8397h = true;
        }
        float[] fArr2 = this.f8392b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f8392b, 0, this.f8393c, 0);
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.a, sensorEvent.values);
        a(this.a, this.f8395f.getRotation());
        float a10 = a(this.a);
        c(this.a);
        b(this.a);
        a(this.a, a10);
    }

    private void a(float[] fArr, float f10) {
        for (a aVar : this.f8396g) {
            aVar.a(fArr, f10);
        }
    }

    private void a(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f8392b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f8392b, i11, i12, fArr);
        }
    }
}
