package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {378}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RippleNode$onAttach$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7460a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RippleNode f7462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1(RippleNode rippleNode, g gVar) {
        super(2, gVar);
        this.f7462c = rippleNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RippleNode$onAttach$1 rippleNode$onAttach$1 = new RippleNode$onAttach$1(this.f7462c, gVar);
        rippleNode$onAttach$1.f7461b = obj;
        return rippleNode$onAttach$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleNode$onAttach$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7460a;
        if (i2 == 0) {
            q.m(obj);
            final d0 d0Var = (d0) this.f7461b;
            final RippleNode rippleNode = this.f7462c;
            h c2 = rippleNode.f7452o.c();
            e1.i iVar = new e1.i() { // from class: androidx.compose.material.ripple.RippleNode$onAttach$1.1
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z2 = interaction instanceof PressInteraction;
                    RippleNode rippleNode2 = RippleNode.this;
                    if (!z2) {
                        StateLayer stateLayer = rippleNode2.f7457t;
                        if (stateLayer == null) {
                            stateLayer = new StateLayer(rippleNode2.f7456s, rippleNode2.f7453p);
                            DrawModifierNodeKt.a(rippleNode2);
                            rippleNode2.f7457t = stateLayer;
                        }
                        stateLayer.b(interaction, d0Var);
                    } else if (rippleNode2.w) {
                        rippleNode2.g2((PressInteraction) interaction);
                    } else {
                        rippleNode2.x.b(interaction);
                    }
                    return b0.f30125a;
                }
            };
            this.f7460a = 1;
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
