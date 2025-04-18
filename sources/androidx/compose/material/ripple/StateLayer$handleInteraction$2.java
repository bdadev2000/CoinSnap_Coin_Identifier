package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {503}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class StateLayer$handleInteraction$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StateLayer f7477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f7478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$2(StateLayer stateLayer, AnimationSpec animationSpec, g gVar) {
        super(2, gVar);
        this.f7477b = stateLayer;
        this.f7478c = animationSpec;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new StateLayer$handleInteraction$2(this.f7477b, this.f7478c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((StateLayer$handleInteraction$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7476a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f7477b.f7472c;
            Float f2 = new Float(0.0f);
            AnimationSpec animationSpec = this.f7478c;
            this.f7476a = 1;
            if (Animatable.c(animatable, f2, animationSpec, null, null, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
