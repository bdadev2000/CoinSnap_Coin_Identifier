package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AbstractClickableNode$onPointerEvent$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$1(AbstractClickableNode abstractClickableNode, g gVar) {
        super(2, gVar);
        this.f2438a = abstractClickableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AbstractClickableNode$onPointerEvent$1(this.f2438a, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        AbstractClickableNode$onPointerEvent$1 abstractClickableNode$onPointerEvent$1 = (AbstractClickableNode$onPointerEvent$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        abstractClickableNode$onPointerEvent$1.invokeSuspend(b0Var);
        return b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.compose.foundation.interaction.HoverInteraction$Enter] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        AbstractClickableNode abstractClickableNode = this.f2438a;
        if (abstractClickableNode.B == null) {
            ?? obj2 = new Object();
            MutableInteractionSource mutableInteractionSource = abstractClickableNode.f2407q;
            if (mutableInteractionSource != null) {
                kotlin.jvm.internal.e.v(abstractClickableNode.S1(), null, 0, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, obj2, null), 3);
            }
            abstractClickableNode.B = obj2;
        }
        return b0.f30125a;
    }
}
