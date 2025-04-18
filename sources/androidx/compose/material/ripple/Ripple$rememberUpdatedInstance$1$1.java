package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Ripple$rememberUpdatedInstance$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7403a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f7405c;
    public final /* synthetic */ RippleIndicationInstance d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, g gVar) {
        super(2, gVar);
        this.f7405c = interactionSource;
        this.d = rippleIndicationInstance;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1 = new Ripple$rememberUpdatedInstance$1$1(this.f7405c, this.d, gVar);
        ripple$rememberUpdatedInstance$1$1.f7404b = obj;
        return ripple$rememberUpdatedInstance$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Ripple$rememberUpdatedInstance$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7403a;
        if (i2 == 0) {
            q.m(obj);
            final d0 d0Var = (d0) this.f7404b;
            h c2 = this.f7405c.c();
            final RippleIndicationInstance rippleIndicationInstance = this.d;
            e1.i iVar = new e1.i() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1.1
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z2 = interaction instanceof PressInteraction.Press;
                    d0 d0Var2 = d0Var;
                    RippleIndicationInstance rippleIndicationInstance2 = RippleIndicationInstance.this;
                    if (z2) {
                        rippleIndicationInstance2.b((PressInteraction.Press) interaction, d0Var2);
                    } else if (interaction instanceof PressInteraction.Release) {
                        rippleIndicationInstance2.c(((PressInteraction.Release) interaction).f3742a);
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        rippleIndicationInstance2.c(((PressInteraction.Cancel) interaction).f3740a);
                    } else {
                        rippleIndicationInstance2.f7449b.b(interaction, d0Var2);
                    }
                    return b0.f30125a;
                }
            };
            this.f7403a = 1;
            if (c2.collect(iVar, this) == aVar) {
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
