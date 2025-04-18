package qc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class d0 implements Flow {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f23784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f23785c;

    public d0(Flow flow, g0 g0Var) {
        this.f23784b = flow;
        this.f23785c = g0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f23784b.collect(new c0(0, flowCollector, this.f23785c), continuation);
        if (collect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
