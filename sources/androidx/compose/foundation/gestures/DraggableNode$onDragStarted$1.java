package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {314}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DraggableNode$onDragStarted$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3375a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DraggableNode f3377c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStarted$1(DraggableNode draggableNode, long j2, g gVar) {
        super(2, gVar);
        this.f3377c = draggableNode;
        this.d = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.f3377c, this.d, gVar);
        draggableNode$onDragStarted$1.f3376b = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$onDragStarted$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3375a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f3376b;
            q0.q qVar = this.f3377c.B;
            Offset offset = new Offset(this.d);
            this.f3375a = 1;
            if (qVar.invoke(d0Var, offset, this) == aVar) {
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
