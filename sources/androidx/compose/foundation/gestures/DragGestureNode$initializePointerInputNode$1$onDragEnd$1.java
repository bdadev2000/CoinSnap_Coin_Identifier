package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import d0.b0;
import d1.f;
import e0.q;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DragGestureNode$initializePointerInputNode$1$onDragEnd$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f3312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDragEnd$1(DragGestureNode dragGestureNode, VelocityTracker velocityTracker) {
        super(1);
        this.f3312a = velocityTracker;
        this.f3313b = dragGestureNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        VelocityTracker velocityTracker = this.f3312a;
        VelocityTrackerKt.a(velocityTracker, (PointerInputChange) obj);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.f16445q;
        DragGestureNode dragGestureNode = this.f3313b;
        float f2 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(dragGestureNode, staticProvidableCompositionLocal)).f();
        long a2 = VelocityKt.a(f2, f2);
        if (Velocity.b(a2) <= 0.0f || Velocity.c(a2) <= 0.0f) {
            InlineClassHelperKt.b("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.g(a2)));
            throw null;
        }
        float b2 = Velocity.b(a2);
        VelocityTracker1D velocityTracker1D = velocityTracker.f15673a;
        float b3 = velocityTracker1D.b(b2);
        float c2 = Velocity.c(a2);
        VelocityTracker1D velocityTracker1D2 = velocityTracker.f15674b;
        long a3 = VelocityKt.a(b3, velocityTracker1D2.b(c2));
        q.Z(velocityTracker1D.d);
        velocityTracker1D.e = 0;
        q.Z(velocityTracker1D2.d);
        velocityTracker1D2.e = 0;
        velocityTracker.f15675c = 0L;
        f fVar = dragGestureNode.f3296u;
        if (fVar != null) {
            q0.q qVar = DraggableKt.f3365a;
            fVar.b(new DragEvent.DragStopped(VelocityKt.a(Float.isNaN(Velocity.b(a3)) ? 0.0f : Velocity.b(a3), Float.isNaN(Velocity.c(a3)) ? 0.0f : Velocity.c(a3))));
        }
        return b0.f30125a;
    }
}
