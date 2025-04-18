package y0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class b0 implements Flow {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f27692b;

    public b0(Flow flow) {
        this.f27692b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f27692b.collect(new s(flowCollector, 1), continuation);
        if (collect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
