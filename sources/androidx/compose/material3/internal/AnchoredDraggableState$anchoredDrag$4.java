package androidx.compose.material3.internal;

import d0.b0;
import d0.k;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;
import q0.r;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {569}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$anchoredDrag$4 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f12846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12848c;
    public final /* synthetic */ r d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends kotlin.jvm.internal.r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState f12849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState anchoredDraggableState) {
            super(0);
            this.f12849a = anchoredDraggableState;
        }

        @Override // q0.a
        public final Object invoke() {
            AnchoredDraggableState anchoredDraggableState = this.f12849a;
            return new k(anchoredDraggableState.e(), anchoredDraggableState.f12825h.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {571}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f12850a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12851b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f12852c;
        public final /* synthetic */ AnchoredDraggableState d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(r rVar, AnchoredDraggableState anchoredDraggableState, g gVar) {
            super(2, gVar);
            this.f12852c = rVar;
            this.d = anchoredDraggableState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f12852c, this.d, gVar);
            anonymousClass2.f12851b = obj;
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((k) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f12850a;
            if (i2 == 0) {
                q.m(obj);
                k kVar = (k) this.f12851b;
                DraggableAnchors draggableAnchors = (DraggableAnchors) kVar.f30134a;
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.d.f12832o;
                this.f12850a = 1;
                if (this.f12852c.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, kVar.f30135b, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState anchoredDraggableState, Object obj, r rVar, g gVar) {
        super(1, gVar);
        this.f12847b = anchoredDraggableState;
        this.f12848c = obj;
        this.d = rVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AnchoredDraggableState$anchoredDrag$4(this.f12847b, this.f12848c, this.d, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$4) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12846a;
        if (i2 == 0) {
            q.m(obj);
            AnchoredDraggableState anchoredDraggableState = this.f12847b;
            anchoredDraggableState.i(this.f12848c);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDraggableState);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, anchoredDraggableState, null);
            this.f12846a = 1;
            if (AnchoredDraggableKt.b(anonymousClass1, anonymousClass2, this) == aVar) {
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
