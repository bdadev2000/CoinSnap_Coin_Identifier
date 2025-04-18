package androidx.compose.ui.text;

import p0.a;

/* loaded from: classes3.dex */
public final class TextRangeKt {
    public static final long a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i2 + ", end: " + i3 + ']').toString());
        }
        if (i3 >= 0) {
            long j2 = (i3 & 4294967295L) | (i2 << 32);
            int i4 = TextRange.f17057c;
            return j2;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i2 + ", end: " + i3 + ']').toString());
    }

    public static final long b(int i2, long j2) {
        int i3 = TextRange.f17057c;
        int i4 = (int) (j2 >> 32);
        int A = a.A(i4, 0, i2);
        int i5 = (int) (4294967295L & j2);
        int A2 = a.A(i5, 0, i2);
        return (A == i4 && A2 == i5) ? j2 : a(A, A2);
    }

    public static final String c(long j2, CharSequence charSequence) {
        return charSequence.subSequence(TextRange.f(j2), TextRange.e(j2)).toString();
    }
}
