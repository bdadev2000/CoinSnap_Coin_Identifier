package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;

/* loaded from: classes4.dex */
public final class IntOffsetKt {
    public static final long a(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final long b(long j2) {
        return (Math.round(Offset.h(j2)) & 4294967295L) | (Math.round(Offset.g(j2)) << 32);
    }
}
