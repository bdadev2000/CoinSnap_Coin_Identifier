package androidx.compose.animation.core;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class SuspendAnimationKt$animate$7 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimationState f2252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$7(AnimationState animationState) {
        super(0);
        this.f2252a = animationState;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f2252a.f2038g = false;
        return b0.f30125a;
    }
}
