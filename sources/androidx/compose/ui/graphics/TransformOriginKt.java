package androidx.compose.ui.graphics;

/* loaded from: classes2.dex */
public final class TransformOriginKt {
    public static final long a(float f2, float f3) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i2 = TransformOrigin.f15060c;
        return floatToRawIntBits;
    }
}
