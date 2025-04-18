package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import e0.u;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class FlowMeasureLazyPolicy$measure$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowMeasureLazyPolicy f3977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f3978b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowMeasureLazyPolicy$measure$2(FlowMeasureLazyPolicy flowMeasureLazyPolicy, SubcomposeMeasureScope subcomposeMeasureScope) {
        super(2);
        this.f3977a = flowMeasureLazyPolicy;
        this.f3978b = subcomposeMeasureScope;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        int i2 = !booleanValue ? 1 : 0;
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.f3977a;
        p pVar = (p) u.G0(i2, flowMeasureLazyPolicy.f3973k);
        if (pVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(booleanValue);
        sb.append(flowMeasureLazyPolicy.f3969g);
        sb.append(intValue);
        return (Measurable) u.G0(0, this.f3978b.D1(sb.toString(), pVar));
    }
}
