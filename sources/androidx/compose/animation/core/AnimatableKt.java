package androidx.compose.animation.core;

/* loaded from: classes4.dex */
public final class AnimatableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AnimationVector1D f2003a = new AnimationVector1D(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final AnimationVector2D f2004b = new AnimationVector2D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final AnimationVector3D f2005c = new AnimationVector3D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector4D d = new AnimationVector4D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector1D e = new AnimationVector1D(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final AnimationVector2D f2006f = new AnimationVector2D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final AnimationVector3D f2007g = new AnimationVector3D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final AnimationVector4D f2008h = new AnimationVector4D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static Animatable a(float f2) {
        return new Animatable(Float.valueOf(f2), VectorConvertersKt.f2340a, Float.valueOf(0.01f), 8);
    }
}
