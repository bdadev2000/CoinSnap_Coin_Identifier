package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.r;

@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1022}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AnchoredDraggableKt$animateTo$4 extends i implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f3012a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AnchoredDragScope f3013b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ DraggableAnchors f3014c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AnchoredDraggableState anchoredDraggableState, g gVar) {
        super(4, gVar);
        this.f3015f = anchoredDraggableState;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.f3015f, (g) obj4);
        anchoredDraggableKt$animateTo$4.f3013b = (AnchoredDragScope) obj;
        anchoredDraggableKt$animateTo$4.f3014c = (DraggableAnchors) obj2;
        anchoredDraggableKt$animateTo$4.d = obj3;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3012a;
        if (i2 == 0) {
            q.m(obj);
            AnchoredDragScope anchoredDragScope = this.f3013b;
            DraggableAnchors draggableAnchors = this.f3014c;
            Object obj2 = this.d;
            AnchoredDraggableState anchoredDraggableState = this.f3015f;
            float c2 = anchoredDraggableState.f3070l.c();
            this.f3013b = null;
            this.f3014c = null;
            this.f3012a = 1;
            if (AnchoredDraggableKt.a(anchoredDraggableState, c2, anchoredDragScope, draggableAnchors, obj2, this) == aVar) {
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
