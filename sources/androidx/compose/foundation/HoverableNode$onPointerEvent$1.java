package androidx.compose.foundation;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {Opcodes.DUP2_X2}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HoverableNode$onPointerEvent$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HoverableNode f2738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$onPointerEvent$1(HoverableNode hoverableNode, g gVar) {
        super(2, gVar);
        this.f2738b = hoverableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new HoverableNode$onPointerEvent$1(this.f2738b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((HoverableNode$onPointerEvent$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2737a;
        if (i2 == 0) {
            q.m(obj);
            this.f2737a = 1;
            if (HoverableNode.e2(this.f2738b, this) == aVar) {
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
