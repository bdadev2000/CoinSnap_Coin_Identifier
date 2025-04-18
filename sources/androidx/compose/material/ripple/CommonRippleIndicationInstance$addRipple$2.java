package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CommonRippleIndicationInstance$addRipple$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RippleAnimation f7393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CommonRippleIndicationInstance f7394c;
    public final /* synthetic */ PressInteraction.Press d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, g gVar) {
        super(2, gVar);
        this.f7393b = rippleAnimation;
        this.f7394c = commonRippleIndicationInstance;
        this.d = press;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.f7393b, this.f7394c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CommonRippleIndicationInstance$addRipple$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7392a;
        PressInteraction.Press press = this.d;
        CommonRippleIndicationInstance commonRippleIndicationInstance = this.f7394c;
        try {
            if (i2 == 0) {
                q.m(obj);
                RippleAnimation rippleAnimation = this.f7393b;
                this.f7392a = 1;
                if (rippleAnimation.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            commonRippleIndicationInstance.f7390h.remove(press);
            return b0.f30125a;
        } catch (Throwable th) {
            commonRippleIndicationInstance.f7390h.remove(press);
            throw th;
        }
    }
}
