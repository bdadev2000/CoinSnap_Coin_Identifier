package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes4.dex */
public final class IntRectKt {
    public static final IntRect a(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new IntRect(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    public static final IntRect b(Rect rect) {
        return new IntRect(Math.round(rect.f14914a), Math.round(rect.f14915b), Math.round(rect.f14916c), Math.round(rect.d));
    }
}
