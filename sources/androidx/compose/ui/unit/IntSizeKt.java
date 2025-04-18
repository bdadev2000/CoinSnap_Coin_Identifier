package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.SizeKt;

/* loaded from: classes4.dex */
public final class IntSizeKt {
    public static final long a(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final long b(long j2) {
        return (((j2 << 32) >> 33) & 4294967295L) | ((j2 >> 33) << 32);
    }

    public static final long c(long j2) {
        return SizeKt.a((int) (j2 >> 32), (int) (j2 & 4294967295L));
    }
}
