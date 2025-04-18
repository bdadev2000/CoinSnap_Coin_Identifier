package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FlowLayoutOverflowState$setOverflowMeasurables$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowLayoutOverflowState f3953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowLineMeasurePolicy f3954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutOverflowState$setOverflowMeasurables$4$1(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy) {
        super(1);
        this.f3953a = flowLayoutOverflowState;
        this.f3954b = flowLineMeasurePolicy;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        int i3;
        Placeable placeable = (Placeable) obj;
        if (placeable != null) {
            FlowLineMeasurePolicy flowLineMeasurePolicy = this.f3954b;
            i2 = flowLineMeasurePolicy.d(placeable);
            i3 = flowLineMeasurePolicy.e(placeable);
        } else {
            i2 = 0;
            i3 = 0;
        }
        IntIntPair intIntPair = new IntIntPair(IntIntPair.a(i2, i3));
        FlowLayoutOverflowState flowLayoutOverflowState = this.f3953a;
        flowLayoutOverflowState.f3949j = intIntPair;
        flowLayoutOverflowState.f3947h = placeable;
        return b0.f30125a;
    }
}
