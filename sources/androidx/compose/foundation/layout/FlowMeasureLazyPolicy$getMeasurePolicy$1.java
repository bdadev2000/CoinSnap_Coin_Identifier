package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import e0.x;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class FlowMeasureLazyPolicy$getMeasurePolicy$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowMeasureLazyPolicy f3975a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowMeasureLazyPolicy$getMeasurePolicy$1(FlowMeasureLazyPolicy flowMeasureLazyPolicy) {
        super(2);
        this.f3975a = flowMeasureLazyPolicy;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
        long j2 = ((Constraints) obj2).f17480a;
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.f3975a;
        int i2 = flowMeasureLazyPolicy.f3969g;
        if (i2 > 0 && flowMeasureLazyPolicy.f3970h != 0 && flowMeasureLazyPolicy.f3971i != 0) {
            int h2 = Constraints.h(j2);
            FlowLayoutOverflowState flowLayoutOverflowState = flowMeasureLazyPolicy.f3972j;
            if (h2 != 0 || flowLayoutOverflowState.f3942a == FlowLayoutOverflow.OverflowType.f3938a) {
                ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(new FlowMeasureLazyPolicy$measure$measurablesIterator$1(flowMeasureLazyPolicy, subcomposeMeasureScope), i2);
                flowLayoutOverflowState.getClass();
                FlowMeasureLazyPolicy$measure$2 flowMeasureLazyPolicy$measure$2 = new FlowMeasureLazyPolicy$measure$2(flowMeasureLazyPolicy, subcomposeMeasureScope);
                flowLayoutOverflowState.d = 0;
                flowLayoutOverflowState.f3950k = flowMeasureLazyPolicy$measure$2;
                flowLayoutOverflowState.b(flowMeasureLazyPolicy, (Measurable) flowMeasureLazyPolicy$measure$2.invoke(Boolean.TRUE, 0), (Measurable) flowMeasureLazyPolicy$measure$2.invoke(Boolean.FALSE, 0), j2);
                return FlowLayoutKt.b(subcomposeMeasureScope, flowMeasureLazyPolicy, contextualFlowItemIterator, flowMeasureLazyPolicy.d, flowMeasureLazyPolicy.f3968f, OrientationIndependentConstraints.a(j2, flowMeasureLazyPolicy.f3965a ? LayoutOrientation.f4037a : LayoutOrientation.f4038b), flowMeasureLazyPolicy.f3971i, flowMeasureLazyPolicy.f3970h, flowMeasureLazyPolicy.f3972j);
            }
        }
        return subcomposeMeasureScope.T(0, 0, x.f30219a, FlowMeasureLazyPolicy$measure$1.f3976a);
    }
}
