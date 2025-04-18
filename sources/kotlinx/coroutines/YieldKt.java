package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YieldKt {
    public static final Object yield(Continuation<? super Unit> continuation) {
        DispatchedContinuation dispatchedContinuation;
        Object obj;
        CoroutineContext context = continuation.getContext();
        JobKt.ensureActive(context);
        Continuation intercepted = IntrinsicsKt.intercepted(continuation);
        if (intercepted instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) intercepted;
        } else {
            dispatchedContinuation = null;
        }
        if (dispatchedContinuation == null) {
            obj = Unit.INSTANCE;
        } else {
            if (dispatchedContinuation.dispatcher.isDispatchNeeded(context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, Unit.INSTANCE);
            } else {
                YieldContext yieldContext = new YieldContext();
                CoroutineContext plus = context.plus(yieldContext);
                Unit unit = Unit.INSTANCE;
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(plus, unit);
                if (yieldContext.dispatcherWasUnconfined) {
                    if (DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation)) {
                        obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    } else {
                        obj = unit;
                    }
                }
            }
            obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return obj;
        }
        return Unit.INSTANCE;
    }
}
