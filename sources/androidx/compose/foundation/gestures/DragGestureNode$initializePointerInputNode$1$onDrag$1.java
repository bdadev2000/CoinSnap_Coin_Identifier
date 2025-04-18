package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import d0.b0;
import d1.f;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragGestureNode$initializePointerInputNode$1$onDrag$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f3309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDrag$1(DragGestureNode dragGestureNode, VelocityTracker velocityTracker) {
        super(2);
        this.f3309a = velocityTracker;
        this.f3310b = dragGestureNode;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((Offset) obj2).f14913a;
        VelocityTrackerKt.a(this.f3309a, (PointerInputChange) obj);
        f fVar = this.f3310b.f3296u;
        if (fVar != null) {
            fVar.b(new DragEvent.DragDelta(j2));
        }
        return b0.f30125a;
    }
}
