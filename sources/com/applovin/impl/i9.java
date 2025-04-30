package com.applovin.impl;

import android.opengl.Matrix;

/* loaded from: classes.dex */
final class i9 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f8272a = new float[16];
    private final float[] b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final fo f8273c = new fo();

    /* renamed from: d, reason: collision with root package name */
    private boolean f8274d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f9 = fArr2[10];
        float f10 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
        float f11 = fArr2[10] / sqrt;
        fArr[0] = f11;
        float f12 = fArr2[8];
        fArr[2] = f12 / sqrt;
        fArr[8] = (-f12) / sqrt;
        fArr[10] = f11;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f9 = fArr2[0];
        float f10 = -fArr2[1];
        float f11 = -fArr2[2];
        float length = Matrix.length(f9, f10, f11);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f9 / length, f10 / length, f11 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean a(float[] fArr, long j7) {
        float[] fArr2 = (float[]) this.f8273c.c(j7);
        if (fArr2 == null) {
            return false;
        }
        b(this.b, fArr2);
        if (!this.f8274d) {
            a(this.f8272a, this.b);
            this.f8274d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f8272a, 0, this.b, 0);
        return true;
    }

    public void a() {
        this.f8273c.a();
        this.f8274d = false;
    }

    public void a(long j7, float[] fArr) {
        this.f8273c.a(j7, fArr);
    }
}
