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

@e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {Opcodes.SWAP}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HoverableNode$onPointerEvent$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HoverableNode f2740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$onPointerEvent$2(HoverableNode hoverableNode, g gVar) {
        super(2, gVar);
        this.f2740b = hoverableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new HoverableNode$onPointerEvent$2(this.f2740b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((HoverableNode$onPointerEvent$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2739a;
        if (i2 == 0) {
            q.m(obj);
            this.f2739a = 1;
            if (HoverableNode.f2(this.f2740b, this) == aVar) {
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
