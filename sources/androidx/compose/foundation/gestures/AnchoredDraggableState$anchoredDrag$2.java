package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;
import q0.q;

@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {835}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AnchoredDraggableState$anchoredDrag$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f3074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3076c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState f3077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState anchoredDraggableState) {
            super(0);
            this.f3077a = anchoredDraggableState;
        }

        @Override // q0.a
        public final Object invoke() {
            return this.f3077a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {836}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3078a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3079b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f3080c;
        public final /* synthetic */ AnchoredDraggableState d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnchoredDraggableState anchoredDraggableState, g gVar, q qVar) {
            super(2, gVar);
            this.f3080c = qVar;
            this.d = anchoredDraggableState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, gVar, this.f3080c);
            anonymousClass2.f3079b = obj;
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((DraggableAnchors) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f3078a;
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.f3079b;
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.d.f3073o;
                this.f3078a = 1;
                if (this.f3080c.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this) == aVar) {
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
        this.f3075b = anchoredDraggableState;
        this.f3076c = qVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AnchoredDraggableState$anchoredDrag$2(this.f3075b, gVar, this.f3076c);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f3074a;
        AnchoredDraggableState anchoredDraggableState = this.f3075b;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDraggableState);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(anchoredDraggableState, null, this.f3076c);
            this.f3074a = 1;
            if (AnchoredDraggableKt.b(anonymousClass1, anonymousClass2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        DraggableAnchors b2 = anchoredDraggableState.b();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = anchoredDraggableState.f3068j;
        Object b3 = b2.b(parcelableSnapshotMutableFloatState.c());
        if (b3 != null) {
            if (Math.abs(parcelableSnapshotMutableFloatState.c() - anchoredDraggableState.b().e(b3)) < 0.5f && ((Boolean) anchoredDraggableState.e.invoke(b3)).booleanValue()) {
                anchoredDraggableState.f3066h.setValue(b3);
                anchoredDraggableState.f3065g.setValue(b3);
            }
        }
        return b0.f30125a;
    }
}
