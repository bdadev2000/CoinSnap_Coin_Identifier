package androidx.compose.ui.unit;

/* loaded from: classes2.dex */
public final class VelocityKt {
    public static final long a(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }
}
