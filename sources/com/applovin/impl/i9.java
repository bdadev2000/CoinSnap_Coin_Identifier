package com.applovin.impl;

import android.opengl.Matrix;

/* loaded from: classes.dex */
final class i9 {
    private final float[] a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f5308b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final fo f5309c = new fo();

    /* renamed from: d, reason: collision with root package name */
    private boolean f5310d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / sqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean a(float[] fArr, long j3) {
        float[] fArr2 = (float[]) this.f5309c.c(j3);
        if (fArr2 == null) {
            return false;
        }
        b(this.f5308b, fArr2);
        if (!this.f5310d) {
            a(this.a, this.f5308b);
            this.f5310d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.a, 0, this.f5308b, 0);
        return true;
    }

    public void a() {
        this.f5309c.a();
        this.f5310d = false;
    }

    public void a(long j3, float[] fArr) {
        this.f5309c.a(j3, fArr);
    }
}
