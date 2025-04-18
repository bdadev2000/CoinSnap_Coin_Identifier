package androidx.compose.material3.internal;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {521}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$anchoredDrag$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f12836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f12838c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState f12839a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState anchoredDraggableState) {
            super(0);
            this.f12839a = anchoredDraggableState;
        }

        @Override // q0.a
        public final Object invoke() {
            return this.f12839a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {522}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f12840a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12841b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f12842c;
        public final /* synthetic */ AnchoredDraggableState d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnchoredDraggableState anchoredDraggableState, g gVar, q qVar) {
            super(2, gVar);
            this.f12842c = qVar;
            this.d = anchoredDraggableState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, gVar, this.f12842c);
            anonymousClass2.f12841b = obj;
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((DraggableAnchors) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f12840a;
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.f12841b;
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.d.f12832o;
                this.f12840a = 1;
                if (this.f12842c.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState anchoredDraggableState, g gVar, q qVar) {
        super(1, gVar);
        this.f12837b = anchoredDraggableState;
        this.f12838c = qVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AnchoredDraggableState$anchoredDrag$2(this.f12837b, gVar, this.f12838c);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12836a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            AnchoredDraggableState anchoredDraggableState = this.f12837b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDraggableState);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(anchoredDraggableState, null, this.f12838c);
            this.f12836a = 1;
            if (AnchoredDraggableKt.b(anonymousClass1, anonymousClass2, this) == aVar) {
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
