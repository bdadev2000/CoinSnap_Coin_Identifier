package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.Arrays;

@StabilityInferred
/* loaded from: classes3.dex */
public final class OffsetMappingCalculator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f6465a = new int[30];

    /* renamed from: b, reason: collision with root package name */
    public int f6466b;

    public static long b(int i2, int i3, int i4, int i5, boolean z2) {
        int i6 = z2 ? i4 : i5;
        if (z2) {
            i4 = i5;
        }
        if (i2 < i3) {
            return TextRangeKt.a(i2, i2);
        }
        if (i2 == i3) {
            return i6 == 0 ? TextRangeKt.a(i3, i4 + i3) : TextRangeKt.a(i3, i3);
        }
        if (i2 < i3 + i6) {
            return i4 == 0 ? TextRangeKt.a(i3, i3) : TextRangeKt.a(i3, i4 + i3);
        }
        int i7 = (i2 - i6) + i4;
        return TextRangeKt.a(i7, i7);
    }

    public final long a(int i2, boolean z2) {
        int i3;
        int i4;
        int[] iArr = this.f6465a;
        int i5 = this.f6466b;
        boolean z3 = !z2;
        if (i5 < 0) {
            i3 = i2;
            i4 = i3;
        } else if (z3) {
            i4 = i2;
            int i6 = i5 - 1;
            i3 = i4;
            while (-1 < i6) {
                int i7 = i6 * 3;
                int i8 = iArr[i7];
                int i9 = iArr[i7 + 1];
                int i10 = iArr[i7 + 2];
                long b2 = b(i3, i8, i9, i10, z2);
                long b3 = b(i4, i8, i9, i10, z2);
                int i11 = TextRange.f17057c;
                int min = Math.min((int) (b2 >> 32), (int) (b3 >> 32));
                i4 = Math.max((int) (b2 & 4294967295L), (int) (b3 & 4294967295L));
                i6--;
                i3 = min;
            }
        } else {
            int i12 = i2;
            int i13 = i12;
            for (int i14 = 0; i14 < i5; i14++) {
                int i15 = i14 * 3;
                int i16 = iArr[i15];
                int i17 = iArr[i15 + 1];
                int i18 = iArr[i15 + 2];
                long b4 = b(i13, i16, i17, i18, z2);
                long b5 = b(i12, i16, i17, i18, z2);
                int i19 = TextRange.f17057c;
                i13 = Math.min((int) (b4 >> 32), (int) (b5 >> 32));
                i12 = Math.max((int) (b4 & 4294967295L), (int) (b5 & 4294967295L));
            }
            i3 = i13;
            i4 = i12;
        }
        return TextRangeKt.a(i3, i4);
    }

    public final void c(int i2, int i3, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Expected newLen to be ≥ 0, was ", i4).toString());
        }
        int min = Math.min(i2, i3);
        int max = Math.max(min, i3) - min;
        if (max >= 2 || max != i4) {
            int i5 = this.f6466b + 1;
            int[] iArr = this.f6465a;
            if (i5 > iArr.length / 3) {
                int[] copyOf = Arrays.copyOf(this.f6465a, Math.max(i5 * 2, (iArr.length / 3) * 2) * 3);
                p0.a.r(copyOf, "copyOf(this, newSize)");
                this.f6465a = copyOf;
            }
            int[] iArr2 = this.f6465a;
            int i6 = this.f6466b * 3;
            iArr2[i6] = min;
            iArr2[i6 + 1] = max;
            iArr2[i6 + 2] = i4;
            this.f6466b = i5;
        }
    }
}
