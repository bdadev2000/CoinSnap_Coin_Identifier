package com.applovin.impl;

import android.opengl.Matrix;

/* loaded from: classes.dex */
final class k9 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f24867a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f24868b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final eo f24869c = new eo();
    private boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float f4 = fArr2[10] / sqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / sqrt;
        fArr[8] = (-f5) / sqrt;
        fArr[10] = f4;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f2 = fArr2[0];
        float f3 = -fArr2[1];
        float f4 = -fArr2[2];
        float length = Matrix.length(f2, f3, f4);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean a(float[] fArr, long j2) {
        float[] fArr2 = (float[]) this.f24869c.c(j2);
        if (fArr2 == null) {
            return false;
        }
        b(this.f24868b, fArr2);
        if (!this.d) {
            a(this.f24867a, this.f24868b);
            this.d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f24867a, 0, this.f24868b, 0);
        return true;
    }

    public void a() {
        this.f24869c.a();
        this.d = false;
    }

    public void a(long j2, float[] fArr) {
        this.f24869c.a(j2, fArr);
    }
}
