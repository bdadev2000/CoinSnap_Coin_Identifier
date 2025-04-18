package androidx.compose.material3.internal;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;
import q0.q;

@e(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableState$draggableState$1$drag$2 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public int f12857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState$draggableState$1 f12858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f12859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, p pVar, g gVar) {
        super(3, gVar);
        this.f12858b = anchoredDraggableState$draggableState$1;
        this.f12859c = pVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.f12858b, this.f12859c, (g) obj3).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12857a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1 = this.f12858b.f12855a;
            this.f12857a = 1;
            if (this.f12859c.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == aVar) {
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
