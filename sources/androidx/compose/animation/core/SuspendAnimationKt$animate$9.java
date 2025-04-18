package androidx.compose.animation.core;

import d0.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SuspendAnimationKt$animate$9 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f2253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animation f2255c;
    public final /* synthetic */ AnimationState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f2256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$9(f0 f0Var, float f2, Animation animation, AnimationState animationState, l lVar) {
        super(1);
        this.f2253a = f0Var;
        this.f2254b = f2;
        this.f2255c = animation;
        this.d = animationState;
        this.f2256f = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f2253a.f30930a;
        p0.a.p(obj2);
        SuspendAnimationKt.h((AnimationScope) obj2, longValue, this.f2254b, this.f2255c, this.d, this.f2256f);
        return b0.f30125a;
    }
}
