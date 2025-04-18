package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import d0.b0;
import h0.g;
import q0.p;

/* loaded from: classes2.dex */
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {

    /* renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState$draggableState$1$dragScope$1 f12855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12856b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1] */
    public AnchoredDraggableState$draggableState$1(final AnchoredDraggableState anchoredDraggableState) {
        this.f12856b = anchoredDraggableState;
        this.f12855a = new DragScope() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public final void a(float f2) {
                AnchoredDraggableState anchoredDraggableState2 = AnchoredDraggableState.this;
                anchoredDraggableState2.f12832o.a(anchoredDraggableState2.f(f2), 0.0f);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object a(p pVar, g gVar) {
        Object a2 = this.f12856b.a(MutatePriority.f2812b, new AnchoredDraggableState$draggableState$1$drag$2(this, pVar, null), gVar);
        return a2 == i0.a.f30806a ? a2 : b0.f30125a;
    }
}
