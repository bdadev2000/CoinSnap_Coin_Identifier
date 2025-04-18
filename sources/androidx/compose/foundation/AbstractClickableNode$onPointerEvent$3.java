package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3", f = "Clickable.kt", l = {1042}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AbstractClickableNode$onPointerEvent$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2440a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$3(AbstractClickableNode abstractClickableNode, g gVar) {
        super(2, gVar);
        this.f2442c = abstractClickableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AbstractClickableNode$onPointerEvent$3 abstractClickableNode$onPointerEvent$3 = new AbstractClickableNode$onPointerEvent$3(this.f2442c, gVar);
        abstractClickableNode$onPointerEvent$3.f2441b = obj;
        return abstractClickableNode$onPointerEvent$3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$onPointerEvent$3) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2440a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f2441b;
            this.f2440a = 1;
            if (this.f2442c.i2(pointerInputScope, this) == aVar) {
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
