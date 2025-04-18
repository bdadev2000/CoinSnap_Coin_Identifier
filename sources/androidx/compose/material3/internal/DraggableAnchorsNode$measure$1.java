package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class DraggableAnchorsNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f12971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DraggableAnchorsNode f12972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Placeable f12973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableAnchorsNode$measure$1(MeasureScope measureScope, DraggableAnchorsNode draggableAnchorsNode, Placeable placeable) {
        super(1);
        this.f12971a = measureScope;
        this.f12972b = draggableAnchorsNode;
        this.f12973c = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        boolean t02 = this.f12971a.t0();
        DraggableAnchorsNode draggableAnchorsNode = this.f12972b;
        float e = t02 ? draggableAnchorsNode.f12967o.e().e(draggableAnchorsNode.f12967o.f12825h.getValue()) : draggableAnchorsNode.f12967o.g();
        Orientation orientation = draggableAnchorsNode.f12969q;
        float f2 = orientation == Orientation.f3395b ? e : 0.0f;
        if (orientation != Orientation.f3394a) {
            e = 0.0f;
        }
        placementScope.e(this.f12973c, p0.a.t0(f2), p0.a.t0(e), 0.0f);
        return b0.f30125a;
    }
}
