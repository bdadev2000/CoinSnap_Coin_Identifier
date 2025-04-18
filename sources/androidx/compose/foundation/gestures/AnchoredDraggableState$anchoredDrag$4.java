package androidx.compose.foundation.gestures;

import d0.b0;
import d0.k;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.a;
import q0.l;
import q0.p;
import q0.r;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {882}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$anchoredDrag$4 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f3084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3086c;
    public final /* synthetic */ r d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends kotlin.jvm.internal.r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState f3087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState anchoredDraggableState) {
            super(0);
            this.f3087a = anchoredDraggableState;
        }

        @Override // q0.a
        public final Object invoke() {
            AnchoredDraggableState anchoredDraggableState = this.f3087a;
            return new k(anchoredDraggableState.b(), anchoredDraggableState.f3067i.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {885}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3088a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3089b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f3090c;
        public final /* synthetic */ AnchoredDraggableState d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(r rVar, AnchoredDraggableState anchoredDraggableState, g gVar) {
            super(2, gVar);
            this.f3090c = rVar;
            this.d = anchoredDraggableState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3090c, this.d, gVar);
            anonymousClass2.f3089b = obj;
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((k) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f3088a;
            if (i2 == 0) {
                q.m(obj);
                k kVar = (k) this.f3089b;
                DraggableAnchors draggableAnchors = (DraggableAnchors) kVar.f30134a;
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.d.f3073o;
                this.f3088a = 1;
                if (this.f3090c.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, kVar.f30135b, this) == aVar) {
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
        this.f3085b = anchoredDraggableState;
        this.f3086c = obj;
        this.d = rVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AnchoredDraggableState$anchoredDrag$4(this.f3085b, this.f3086c, this.d, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$4) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f3084a;
        Object obj2 = this.f3086c;
        AnchoredDraggableState anchoredDraggableState = this.f3085b;
        if (i2 == 0) {
            q.m(obj);
            anchoredDraggableState.f3071m.setValue(obj2);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDraggableState);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, anchoredDraggableState, null);
            this.f3084a = 1;
            if (AnchoredDraggableKt.b(anonymousClass1, anonymousClass2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        if (((Boolean) anchoredDraggableState.e.invoke(obj2)).booleanValue()) {
            anchoredDraggableState.f3073o.a(anchoredDraggableState.b().e(obj2), anchoredDraggableState.f3070l.c());
            anchoredDraggableState.f3066h.setValue(obj2);
            anchoredDraggableState.f3065g.setValue(obj2);
        }
        return b0.f30125a;
    }
}
