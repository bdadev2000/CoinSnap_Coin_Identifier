package androidx.compose.animation.core;

/* loaded from: classes4.dex */
final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final FloatDecayAnimationSpec f2078a;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f2078a = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public final VectorizedDecayAnimationSpec b() {
        return new VectorizedFloatDecaySpec(this.f2078a);
    }
}
