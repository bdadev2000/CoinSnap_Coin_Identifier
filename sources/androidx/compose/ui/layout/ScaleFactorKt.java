package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;

/* loaded from: classes2.dex */
public final class ScaleFactorKt {
    public static final long a(float f2, float f3) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i2 = ScaleFactor.f15838b;
        return floatToRawIntBits;
    }

    public static final long b(long j2, long j3) {
        return SizeKt.a(ScaleFactor.a(j3) * Size.d(j2), ScaleFactor.b(j3) * Size.b(j2));
    }
}
