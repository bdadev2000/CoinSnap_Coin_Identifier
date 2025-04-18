package androidx.compose.animation.core;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SuspendAnimationKt$animateDecay$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(p pVar) {
        super(1);
        this.f2257a = pVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        this.f2257a.invoke(animationScope.e.getValue(), Float.valueOf(((AnimationVector1D) animationScope.f2030f).f2039a));
        return b0.f30125a;
    }
}
