package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Matrix {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f14999a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final long a(float[] fArr, long j2) {
        float g2 = Offset.g(j2);
        float h2 = Offset.h(j2);
        float f2 = 1 / (((fArr[7] * h2) + (fArr[3] * g2)) + fArr[15]);
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return OffsetKt.a(((fArr[4] * h2) + (fArr[0] * g2) + fArr[12]) * f2, ((fArr[5] * h2) + (fArr[1] * g2) + fArr[13]) * f2);
    }

    public static final void b(float[] fArr, MutableRect mutableRect) {
        long a2 = a(fArr, OffsetKt.a(mutableRect.f14910a, mutableRect.f14911b));
        long a3 = a(fArr, OffsetKt.a(mutableRect.f14910a, mutableRect.d));
        long a4 = a(fArr, OffsetKt.a(mutableRect.f14912c, mutableRect.f14911b));
        long a5 = a(fArr, OffsetKt.a(mutableRect.f14912c, mutableRect.d));
        mutableRect.f14910a = Math.min(Math.min(Offset.g(a2), Offset.g(a3)), Math.min(Offset.g(a4), Offset.g(a5)));
        mutableRect.f14911b = Math.min(Math.min(Offset.h(a2), Offset.h(a3)), Math.min(Offset.h(a4), Offset.h(a5)));
        mutableRect.f14912c = Math.max(Math.max(Offset.g(a2), Offset.g(a3)), Math.max(Offset.g(a4), Offset.g(a5)));
        mutableRect.d = Math.max(Math.max(Offset.h(a2), Offset.h(a3)), Math.max(Offset.h(a4), Offset.h(a5)));
    }

    public static final void c(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                fArr[(i3 * 4) + i2] = i2 == i3 ? 1.0f : 0.0f;
                i3++;
            }
            i2++;
        }
    }

    public static final void d(float f2, float[] fArr) {
        double d = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f3 = fArr[0];
        float f4 = fArr[4];
        float f5 = (sin * f4) + (cos * f3);
        float f6 = -sin;
        float f7 = fArr[1];
        float f8 = fArr[5];
        float f9 = (sin * f8) + (cos * f7);
        float f10 = fArr[2];
        float f11 = fArr[6];
        float f12 = (sin * f11) + (cos * f10);
        float f13 = fArr[3];
        float f14 = fArr[7];
        fArr[0] = f5;
        fArr[1] = f9;
        fArr[2] = f12;
        fArr[3] = (sin * f14) + (cos * f13);
        fArr[4] = (f4 * cos) + (f3 * f6);
        fArr[5] = (f8 * cos) + (f7 * f6);
        fArr[6] = (f11 * cos) + (f10 * f6);
        fArr[7] = (cos * f14) + (f6 * f13);
    }

    public static final void e(float f2, float f3, float f4, float[] fArr) {
        fArr[0] = fArr[0] * f2;
        fArr[1] = fArr[1] * f2;
        fArr[2] = fArr[2] * f2;
        fArr[3] = fArr[3] * f2;
        fArr[4] = fArr[4] * f3;
        fArr[5] = fArr[5] * f3;
        fArr[6] = fArr[6] * f3;
        fArr[7] = fArr[7] * f3;
        fArr[8] = fArr[8] * f4;
        fArr[9] = fArr[9] * f4;
        fArr[10] = fArr[10] * f4;
        fArr[11] = fArr[11] * f4;
    }

    public static final void f(float[] fArr, float[] fArr2) {
        float a2 = MatrixKt.a(0, fArr, fArr2, 0);
        float a3 = MatrixKt.a(0, fArr, fArr2, 1);
        float a4 = MatrixKt.a(0, fArr, fArr2, 2);
        float a5 = MatrixKt.a(0, fArr, fArr2, 3);
        float a6 = MatrixKt.a(1, fArr, fArr2, 0);
        float a7 = MatrixKt.a(1, fArr, fArr2, 1);
        float a8 = MatrixKt.a(1, fArr, fArr2, 2);
        float a9 = MatrixKt.a(1, fArr, fArr2, 3);
        float a10 = MatrixKt.a(2, fArr, fArr2, 0);
        float a11 = MatrixKt.a(2, fArr, fArr2, 1);
        float a12 = MatrixKt.a(2, fArr, fArr2, 2);
        float a13 = MatrixKt.a(2, fArr, fArr2, 3);
        float a14 = MatrixKt.a(3, fArr, fArr2, 0);
        float a15 = MatrixKt.a(3, fArr, fArr2, 1);
        float a16 = MatrixKt.a(3, fArr, fArr2, 2);
        float a17 = MatrixKt.a(3, fArr, fArr2, 3);
        fArr[0] = a2;
        fArr[1] = a3;
        fArr[2] = a4;
        fArr[3] = a5;
        fArr[4] = a6;
        fArr[5] = a7;
        fArr[6] = a8;
        fArr[7] = a9;
        fArr[8] = a10;
        fArr[9] = a11;
        fArr[10] = a12;
        fArr[11] = a13;
        fArr[12] = a14;
        fArr[13] = a15;
        fArr[14] = a16;
        fArr[15] = a17;
    }

    public static final void g(float f2, float f3, float f4, float[] fArr) {
        float f5 = (fArr[8] * f4) + (fArr[4] * f3) + (fArr[0] * f2) + fArr[12];
        float f6 = (fArr[9] * f4) + (fArr[5] * f3) + (fArr[1] * f2) + fArr[13];
        float f7 = (fArr[10] * f4) + (fArr[6] * f3) + (fArr[2] * f2) + fArr[14];
        float f8 = (fArr[11] * f4) + (fArr[7] * f3) + (fArr[3] * f2) + fArr[15];
        fArr[12] = f5;
        fArr[13] = f6;
        fArr[14] = f7;
        fArr[15] = f8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Matrix) {
            return p0.a.g(this.f14999a, ((Matrix) obj).f14999a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14999a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f14999a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return p0.a.D0(sb.toString());
    }
}
