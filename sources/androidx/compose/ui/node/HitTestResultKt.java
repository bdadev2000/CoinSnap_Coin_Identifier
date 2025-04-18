package androidx.compose.ui.node;

/* loaded from: classes4.dex */
public final class HitTestResultKt {
    public static final long a(float f2, boolean z2) {
        return ((z2 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
    }
}
