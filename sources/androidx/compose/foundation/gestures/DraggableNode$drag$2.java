package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

@e(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DraggableNode$drag$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3370a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3372c;
    public final /* synthetic */ DraggableNode d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$drag$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DragScope f3373a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DraggableNode f3374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DragScope dragScope, DraggableNode draggableNode) {
            super(1);
            this.f3373a = dragScope;
            this.f3374b = draggableNode;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((DragEvent.DragDelta) obj).f3171a;
            DraggableNode draggableNode = this.f3374b;
            long l2 = Offset.l(j2, draggableNode.D ? -1.0f : 1.0f);
            Orientation orientation = draggableNode.f3369z;
            q qVar = DraggableKt.f3365a;
            this.f3373a.a(orientation == Orientation.f3394a ? Offset.h(l2) : Offset.g(l2));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(p pVar, DraggableNode draggableNode, g gVar) {
        super(2, gVar);
        this.f3372c = pVar;
        this.d = draggableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.f3372c, this.d, gVar);
        draggableNode$drag$2.f3371b = obj;
        return draggableNode$drag$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$drag$2) create((DragScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3370a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((DragScope) this.f3371b, this.d);
            this.f3370a = 1;
            if (this.f3372c.invoke(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
