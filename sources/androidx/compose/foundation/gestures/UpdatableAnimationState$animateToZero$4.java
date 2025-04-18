package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UpdatableAnimationState$animateToZero$4 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UpdatableAnimationState f3667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f3668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f3669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$4(UpdatableAnimationState updatableAnimationState, float f2, l lVar) {
        super(1);
        this.f3667a = updatableAnimationState;
        this.f3668b = f2;
        this.f3669c = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long u02;
        long longValue = ((Number) obj).longValue();
        UpdatableAnimationState updatableAnimationState = this.f3667a;
        if (updatableAnimationState.f3659b == Long.MIN_VALUE) {
            updatableAnimationState.f3659b = longValue;
        }
        float f2 = updatableAnimationState.e;
        AnimationVector1D animationVector1D = new AnimationVector1D(f2);
        float f3 = this.f3668b;
        AnimationVector1D animationVector1D2 = UpdatableAnimationState.f3657f;
        if (f3 == 0.0f) {
            u02 = updatableAnimationState.f3658a.b(new AnimationVector1D(f2), animationVector1D2, updatableAnimationState.f3660c);
        } else {
            u02 = a.u0(((float) (longValue - updatableAnimationState.f3659b)) / f3);
        }
        long j2 = u02;
        float f4 = ((AnimationVector1D) updatableAnimationState.f3658a.g(j2, animationVector1D, animationVector1D2, updatableAnimationState.f3660c)).f2039a;
        updatableAnimationState.f3660c = (AnimationVector1D) updatableAnimationState.f3658a.f(j2, animationVector1D, animationVector1D2, updatableAnimationState.f3660c);
        updatableAnimationState.f3659b = longValue;
        float f5 = updatableAnimationState.e - f4;
        updatableAnimationState.e = f4;
        this.f3669c.invoke(Float.valueOf(f5));
        return b0.f30125a;
    }
}
