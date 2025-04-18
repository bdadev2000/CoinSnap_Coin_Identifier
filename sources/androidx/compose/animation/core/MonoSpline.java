package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@ExperimentalAnimationSpecApi
/* loaded from: classes2.dex */
public final class MonoSpline {
    public MonoSpline(float[] fArr, float[][] fArr2, float f2) {
        int length = fArr.length;
        int length2 = fArr2[0].length;
        float[] fArr3 = new float[length2];
        int i2 = length - 1;
        float[][] fArr4 = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr4[i3] = new float[length2];
        }
        float[][] fArr5 = new float[length];
        for (int i4 = 0; i4 < length; i4++) {
            fArr5[i4] = new float[length2];
        }
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                int i7 = i6 + 1;
                float f3 = fArr[i7] - fArr[i6];
                float[] fArr6 = fArr4[i6];
                float f4 = (fArr2[i7][i5] - fArr2[i6][i5]) / f3;
                fArr6[i5] = f4;
                if (i6 == 0) {
                    fArr5[i6][i5] = f4;
                } else {
                    fArr5[i6][i5] = (fArr4[i6 - 1][i5] + f4) * 0.5f;
                }
                i6 = i7;
            }
            fArr5[i2][i5] = fArr4[length - 2][i5];
        }
        if (!Float.isNaN(f2)) {
            for (int i8 = 0; i8 < length2; i8++) {
                float[] fArr7 = fArr4[length - 2];
                float f5 = (1 - f2) * fArr7[i8];
                float[] fArr8 = fArr4[0];
                float f6 = (fArr8[i8] * f2) + f5;
                fArr8[i8] = f6;
                fArr7[i8] = f6;
                fArr5[i2][i8] = f6;
                fArr5[0][i8] = f6;
            }
        }
        for (int i9 = 0; i9 < i2; i9++) {
            for (int i10 = 0; i10 < length2; i10++) {
                float f7 = fArr4[i9][i10];
                if (f7 == 0.0f) {
                    fArr5[i9][i10] = 0.0f;
                    fArr5[i9 + 1][i10] = 0.0f;
                } else {
                    float f8 = fArr5[i9][i10] / f7;
                    int i11 = i9 + 1;
                    float f9 = fArr5[i11][i10] / f7;
                    float hypot = (float) Math.hypot(f8, f9);
                    if (hypot > 9.0d) {
                        float f10 = 3.0f / hypot;
                        float[] fArr9 = fArr5[i9];
                        float[] fArr10 = fArr4[i9];
                        fArr9[i10] = f8 * f10 * fArr10[i10];
                        fArr5[i11][i10] = f10 * f9 * fArr10[i10];
                    }
                }
            }
        }
    }
}
