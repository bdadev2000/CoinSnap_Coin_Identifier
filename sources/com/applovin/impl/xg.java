package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class xg implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f27911a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f27912b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f27913c = new float[16];
    private final float[] d = new float[3];

    /* renamed from: f, reason: collision with root package name */
    private final Display f27914f;

    /* renamed from: g, reason: collision with root package name */
    private final a[] f27915g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27916h;

    /* loaded from: classes2.dex */
    public interface a {
        void a(float[] fArr, float f2);
    }

    public xg(Display display, a... aVarArr) {
        this.f27914f = display;
        this.f27915g = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Opcodes.LXOR, this.f27912b);
        SensorManager.getOrientation(this.f27912b, this.d);
        return this.d[2];
    }

    private void b(float[] fArr) {
        if (!this.f27916h) {
            k9.a(this.f27913c, fArr);
            this.f27916h = true;
        }
        float[] fArr2 = this.f27912b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f27912b, 0, this.f27913c, 0);
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f27911a, sensorEvent.values);
        a(this.f27911a, this.f27914f.getRotation());
        float a2 = a(this.f27911a);
        c(this.f27911a);
        b(this.f27911a);
        a(this.f27911a, a2);
    }

    private void a(float[] fArr, float f2) {
        for (a aVar : this.f27915g) {
            aVar.a(fArr, f2);
        }
    }

    private void a(float[] fArr, int i2) {
        if (i2 != 0) {
            int i3 = Opcodes.LOR;
            int i4 = 1;
            if (i2 == 1) {
                i4 = 129;
                i3 = 2;
            } else if (i2 == 2) {
                i4 = 130;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                i3 = 130;
            }
            float[] fArr2 = this.f27912b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f27912b, i3, i4, fArr);
        }
    }
}
