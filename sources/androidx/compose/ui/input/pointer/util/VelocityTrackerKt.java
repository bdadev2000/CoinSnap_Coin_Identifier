package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import e0.q;
import e0.w;
import java.util.List;
import p0.a;

/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    public static final void a(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.a(pointerInputChange)) {
            VelocityTracker1D velocityTracker1D = velocityTracker.f15673a;
            q.Z(velocityTracker1D.d);
            velocityTracker1D.e = 0;
            VelocityTracker1D velocityTracker1D2 = velocityTracker.f15674b;
            q.Z(velocityTracker1D2.d);
            velocityTracker1D2.e = 0;
            velocityTracker.f15675c = 0L;
        }
        boolean c2 = PointerEventKt.c(pointerInputChange);
        long j2 = pointerInputChange.f15590b;
        if (!c2) {
            List list = pointerInputChange.f15597k;
            if (list == null) {
                list = w.f30218a;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                HistoricalChange historicalChange = (HistoricalChange) list.get(i2);
                long j3 = historicalChange.f15548a;
                long j4 = historicalChange.f15550c;
                velocityTracker.f15673a.a(j3, Offset.g(j4));
                velocityTracker.f15674b.a(j3, Offset.h(j4));
            }
            long j5 = pointerInputChange.f15598l;
            velocityTracker.f15673a.a(j2, Offset.g(j5));
            velocityTracker.f15674b.a(j2, Offset.h(j5));
        }
        if (PointerEventKt.c(pointerInputChange) && j2 - velocityTracker.f15675c > 40) {
            VelocityTracker1D velocityTracker1D3 = velocityTracker.f15673a;
            q.Z(velocityTracker1D3.d);
            velocityTracker1D3.e = 0;
            VelocityTracker1D velocityTracker1D4 = velocityTracker.f15674b;
            q.Z(velocityTracker1D4.d);
            velocityTracker1D4.e = 0;
            velocityTracker.f15675c = 0L;
        }
        velocityTracker.f15675c = j2;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    public static final void c(float[] fArr, float[] fArr2, int i2, float[] fArr3) {
        if (i2 == 0) {
            InlineClassHelperKt.a("At least one point must be provided");
            throw null;
        }
        int i3 = 2 >= i2 ? i2 - 1 : 2;
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i2];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i2];
        }
        float[][] fArr6 = new float[i4];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            float[] fArr8 = fArr4[i10];
            a.s(fArr8, "<this>");
            a.s(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i2);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr9 = fArr5[i11];
                float b2 = b(fArr7, fArr9);
                for (int i12 = 0; i12 < i2; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr9[i12] * b2);
                }
            }
            float sqrt = (float) Math.sqrt(b(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f2 = 1.0f / sqrt;
            for (int i13 = 0; i13 < i2; i13++) {
                fArr7[i13] = fArr7[i13] * f2;
            }
            float[] fArr10 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr10[i14] = i14 < i10 ? 0.0f : b(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float b3 = b(fArr5[i15], fArr2);
            float[] fArr11 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    b3 -= fArr11[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = b3 / fArr11[i15];
        }
    }
}
