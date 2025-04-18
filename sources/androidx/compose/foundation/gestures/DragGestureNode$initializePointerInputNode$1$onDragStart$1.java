package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import com.google.android.gms.common.api.Api;
import d0.b0;
import d1.f;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import p0.a;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragGestureNode$initializePointerInputNode$1$onDragStart$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f3315b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDragStart$1(DragGestureNode dragGestureNode, VelocityTracker velocityTracker) {
        super(3);
        this.f3314a = dragGestureNode;
        this.f3315b = velocityTracker;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
        long j2 = ((Offset) obj3).f14913a;
        DragGestureNode dragGestureNode = this.f3314a;
        if (((Boolean) dragGestureNode.f3293r.invoke(pointerInputChange)).booleanValue()) {
            if (!dragGestureNode.w) {
                if (dragGestureNode.f3296u == null) {
                    dragGestureNode.f3296u = a.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 6);
                }
                dragGestureNode.w = true;
                e.v(dragGestureNode.S1(), null, 0, new DragGestureNode$startListeningForEvents$1(dragGestureNode, null), 3);
            }
            VelocityTrackerKt.a(this.f3315b, pointerInputChange);
            long j3 = Offset.j(pointerInputChange2.f15591c, j2);
            f fVar = dragGestureNode.f3296u;
            if (fVar != null) {
                fVar.b(new DragEvent.DragStarted(j3));
            }
        }
        return b0.f30125a;
    }
}
