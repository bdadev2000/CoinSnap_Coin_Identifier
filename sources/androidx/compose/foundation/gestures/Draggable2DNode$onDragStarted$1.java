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

@e(c = "androidx.compose.foundation.gestures.Draggable2DNode$onDragStarted$1", f = "Draggable2D.kt", l = {427}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Draggable2DNode$onDragStarted$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3351a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Draggable2DNode f3353c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Draggable2DNode$onDragStarted$1(Draggable2DNode draggable2DNode, long j2, g gVar) {
        super(2, gVar);
        this.f3353c = draggable2DNode;
        this.d = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        Draggable2DNode$onDragStarted$1 draggable2DNode$onDragStarted$1 = new Draggable2DNode$onDragStarted$1(this.f3353c, this.d, gVar);
        draggable2DNode$onDragStarted$1.f3352b = obj;
        return draggable2DNode$onDragStarted$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Draggable2DNode$onDragStarted$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3351a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f3352b;
            q0.q qVar = this.f3353c.B;
            Offset offset = new Offset(this.d);
            this.f3351a = 1;
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
