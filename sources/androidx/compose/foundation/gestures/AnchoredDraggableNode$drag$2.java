package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AnchoredDraggableNode$drag$2 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public int f3048a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AnchoredDragScope f3049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3050c;
    public final /* synthetic */ AnchoredDraggableNode d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableNode f3051a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnchoredDragScope f3052b;

        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C00101 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableNode f3053a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnchoredDragScope f3054b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00101(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope) {
                super(1);
                this.f3053a = anchoredDraggableNode;
                this.f3054b = anchoredDragScope;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                long j2 = ((Offset) obj).f14913a;
                AnchoredDraggableNode anchoredDraggableNode = this.f3053a;
                AnchoredDraggableState anchoredDraggableState = anchoredDraggableNode.f3046y;
                Orientation orientation = anchoredDraggableNode.f3047z;
                Orientation orientation2 = Orientation.f3394a;
                float c2 = anchoredDraggableState.c(orientation == orientation2 ? Offset.h(j2) : Offset.g(j2));
                float d = c2 - anchoredDraggableNode.f3046y.d();
                Orientation orientation3 = anchoredDraggableNode.f3047z;
                float f2 = orientation3 == Orientation.f3395b ? d : 0.0f;
                if (orientation3 != orientation2) {
                    d = 0.0f;
                }
                long a2 = OffsetKt.a(f2, d);
                this.f3054b.a(c2, 0.0f);
                return new Offset(a2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope) {
            super(1);
            this.f3051a = anchoredDraggableNode;
            this.f3052b = anchoredDragScope;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            DragEvent.DragDelta dragDelta = (DragEvent.DragDelta) obj;
            AnchoredDraggableNode anchoredDraggableNode = this.f3051a;
            OverscrollEffect overscrollEffect = anchoredDraggableNode.B;
            AnchoredDragScope anchoredDragScope = this.f3052b;
            if (overscrollEffect == null) {
                AnchoredDraggableState anchoredDraggableState = anchoredDraggableNode.f3046y;
                long j2 = dragDelta.f3171a;
                long l2 = anchoredDraggableNode.q2() ? Offset.l(j2, -1.0f) : Offset.l(j2, 1.0f);
                anchoredDragScope.a(anchoredDraggableState.c(anchoredDraggableNode.f3047z == Orientation.f3394a ? Offset.h(l2) : Offset.g(l2)), 0.0f);
            } else {
                long j3 = dragDelta.f3171a;
                overscrollEffect.a(anchoredDraggableNode.q2() ? Offset.l(j3, -1.0f) : Offset.l(j3, 1.0f), 1, new C00101(anchoredDraggableNode, anchoredDragScope));
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(p pVar, AnchoredDraggableNode anchoredDraggableNode, g gVar) {
        super(3, gVar);
        this.f3050c = pVar;
        this.d = anchoredDraggableNode;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.f3050c, this.d, (g) obj3);
        anchoredDraggableNode$drag$2.f3049b = (AnchoredDragScope) obj;
        return anchoredDraggableNode$drag$2.invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3048a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.f3049b);
            this.f3048a = 1;
            if (this.f3050c.invoke(anonymousClass1, this) == aVar) {
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
