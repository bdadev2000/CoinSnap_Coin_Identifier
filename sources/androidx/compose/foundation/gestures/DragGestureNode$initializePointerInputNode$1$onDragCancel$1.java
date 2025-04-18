package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import d0.b0;
import d1.f;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragGestureNode$initializePointerInputNode$1$onDragCancel$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDragCancel$1(DragGestureNode dragGestureNode) {
        super(0);
        this.f3311a = dragGestureNode;
    }

    @Override // q0.a
    public final Object invoke() {
        f fVar = this.f3311a.f3296u;
        if (fVar != null) {
            fVar.b(DragEvent.DragCancelled.f3170a);
        }
        return b0.f30125a;
    }
}
