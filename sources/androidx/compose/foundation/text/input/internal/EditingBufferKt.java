package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes4.dex */
public final class EditingBufferKt {
    public static final long a(long j2, long j3) {
        int d;
        int f2 = TextRange.f(j2);
        int e = TextRange.e(j2);
        if (TextRange.f(j3) >= TextRange.e(j2) || TextRange.f(j2) >= TextRange.e(j3)) {
            if (e > TextRange.f(j3)) {
                f2 -= TextRange.d(j3);
                d = TextRange.d(j3);
                e -= d;
            }
        } else if (TextRange.a(j3, j2)) {
            f2 = TextRange.f(j3);
            e = f2;
        } else {
            if (TextRange.a(j2, j3)) {
                d = TextRange.d(j3);
            } else {
                int f3 = TextRange.f(j3);
                if (f2 >= TextRange.e(j3) || f3 > f2) {
                    e = TextRange.f(j3);
                } else {
                    f2 = TextRange.f(j3);
                    d = TextRange.d(j3);
                }
            }
            e -= d;
        }
        return TextRangeKt.a(f2, e);
    }
}
