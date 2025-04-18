package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {321}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DraggableNode$onDragStopped$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3378a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DraggableNode f3380c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStopped$1(DraggableNode draggableNode, long j2, g gVar) {
        super(2, gVar);
        this.f3380c = draggableNode;
        this.d = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DraggableNode$onDragStopped$1 draggableNode$onDragStopped$1 = new DraggableNode$onDragStopped$1(this.f3380c, this.d, gVar);
        draggableNode$onDragStopped$1.f3379b = obj;
        return draggableNode$onDragStopped$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$onDragStopped$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3378a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f3379b;
            DraggableNode draggableNode = this.f3380c;
            q0.q qVar = draggableNode.C;
            long f2 = Velocity.f(this.d, draggableNode.D ? -1.0f : 1.0f);
            Orientation orientation = draggableNode.f3369z;
            q0.q qVar2 = DraggableKt.f3365a;
            Float f3 = new Float(orientation == Orientation.f3394a ? Velocity.c(f2) : Velocity.b(f2));
            this.f3378a = 1;
            if (qVar.invoke(d0Var, f3, this) == aVar) {
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
