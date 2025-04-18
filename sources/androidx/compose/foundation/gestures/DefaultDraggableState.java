package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import d0.b0;
import h0.g;
import p0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DefaultDraggableState implements DraggableState {

    /* renamed from: a, reason: collision with root package name */
    public final l f3136a;

    /* renamed from: b, reason: collision with root package name */
    public final DefaultDraggableState$dragScope$1 f3137b = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public final void a(float f2) {
            DefaultDraggableState.this.f3136a.invoke(Float.valueOf(f2));
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public final MutatorMutex f3138c = new MutatorMutex();

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1] */
    public DefaultDraggableState(l lVar) {
        this.f3136a = lVar;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object a(p pVar, g gVar) {
        Object J = a.J(new DefaultDraggableState$drag$2(this, MutatePriority.f2812b, pVar, null), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }
}
