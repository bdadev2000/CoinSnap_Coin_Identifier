package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", l = {416}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Draggable2DNode$drag$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3346a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3348c;
    public final /* synthetic */ Draggable2DNode d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Drag2DScope f3349a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Draggable2DNode f3350b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Drag2DScope drag2DScope, Draggable2DNode draggable2DNode) {
            super(1);
            this.f3349a = drag2DScope;
            this.f3350b = draggable2DNode;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Offset.l(((DragEvent.DragDelta) obj).f3171a, this.f3350b.A ? -1.0f : 1.0f);
            this.f3349a.a();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Draggable2DNode$drag$2(p pVar, Draggable2DNode draggable2DNode, g gVar) {
        super(2, gVar);
        this.f3348c = pVar;
        this.d = draggable2DNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        Draggable2DNode$drag$2 draggable2DNode$drag$2 = new Draggable2DNode$drag$2(this.f3348c, this.d, gVar);
        draggable2DNode$drag$2.f3347b = obj;
        return draggable2DNode$drag$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Draggable2DNode$drag$2) create((Drag2DScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3346a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Drag2DScope) this.f3347b, this.d);
            this.f3346a = 1;
            if (this.f3348c.invoke(anonymousClass1, this) == aVar) {
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
