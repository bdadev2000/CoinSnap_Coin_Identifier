package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AbstractClickableNode$onPointerEvent$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$2(AbstractClickableNode abstractClickableNode, g gVar) {
        super(2, gVar);
        this.f2439a = abstractClickableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AbstractClickableNode$onPointerEvent$2(this.f2439a, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        AbstractClickableNode$onPointerEvent$2 abstractClickableNode$onPointerEvent$2 = (AbstractClickableNode$onPointerEvent$2) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        abstractClickableNode$onPointerEvent$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        AbstractClickableNode abstractClickableNode = this.f2439a;
        HoverInteraction.Enter enter = abstractClickableNode.B;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = abstractClickableNode.f2407q;
            if (mutableInteractionSource != null) {
                kotlin.jvm.internal.e.v(abstractClickableNode.S1(), null, 0, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3);
            }
            abstractClickableNode.B = null;
        }
        return b0.f30125a;
    }
}
