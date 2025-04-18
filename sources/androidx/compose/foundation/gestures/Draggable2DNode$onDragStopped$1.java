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

@e(c = "androidx.compose.foundation.gestures.Draggable2DNode$onDragStopped$1", f = "Draggable2D.kt", l = {436}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Draggable2DNode$onDragStopped$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3354a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Draggable2DNode f3356c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Draggable2DNode$onDragStopped$1(Draggable2DNode draggable2DNode, long j2, g gVar) {
        super(2, gVar);
        this.f3356c = draggable2DNode;
        this.d = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        Draggable2DNode$onDragStopped$1 draggable2DNode$onDragStopped$1 = new Draggable2DNode$onDragStopped$1(this.f3356c, this.d, gVar);
        draggable2DNode$onDragStopped$1.f3355b = obj;
        return draggable2DNode$onDragStopped$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Draggable2DNode$onDragStopped$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3354a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f3355b;
            Draggable2DNode draggable2DNode = this.f3356c;
            q0.q qVar = draggable2DNode.D;
            Velocity velocity = new Velocity(Velocity.f(this.d, draggable2DNode.A ? -1.0f : 1.0f));
            this.f3354a = 1;
            if (qVar.invoke(d0Var, velocity, this) == aVar) {
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
