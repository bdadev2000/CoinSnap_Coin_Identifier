package androidx.compose.foundation.shape;

/* loaded from: classes3.dex */
public final class RoundedCornerShapeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final RoundedCornerShape f5392a = a(50);

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.foundation.shape.RoundedCornerShape, androidx.compose.foundation.shape.CornerBasedShape] */
    public static final RoundedCornerShape a(int i2) {
        PercentCornerSize percentCornerSize = new PercentCornerSize(i2);
        return new CornerBasedShape(percentCornerSize, percentCornerSize, percentCornerSize, percentCornerSize);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.shape.RoundedCornerShape, androidx.compose.foundation.shape.CornerBasedShape] */
    public static final RoundedCornerShape b(float f2) {
        CornerSize a2 = CornerSizeKt.a(f2);
        return new CornerBasedShape(a2, a2, a2, a2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.foundation.shape.RoundedCornerShape, androidx.compose.foundation.shape.CornerBasedShape] */
    public static RoundedCornerShape c(float f2, float f3) {
        return new CornerBasedShape(CornerSizeKt.a(f2), CornerSizeKt.a(f3), CornerSizeKt.a(0), CornerSizeKt.a(0));
    }
}
