package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import eb.j;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u0004\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"checkFlowContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "checkFlowContext$FlowKt__ContextKt", "buffer", "Lkotlinx/coroutines/flow/Flow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "cancellable", "conflate", "flowOn", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class FlowKt__ContextKt {
    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i10, BufferOverflow bufferOverflow) {
        int i11;
        BufferOverflow bufferOverflow2;
        boolean z10 = true;
        if (i10 >= 0 || i10 == -2 || i10 == -1) {
            if (i10 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 == -1) {
                bufferOverflow2 = BufferOverflow.DROP_OLDEST;
                i11 = 0;
            } else {
                i11 = i10;
                bufferOverflow2 = bufferOverflow;
            }
            return flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, null, i11, bufferOverflow2, 1, null) : new ChannelFlowOperatorImpl(flow, null, i11, bufferOverflow2, 2, null);
        }
        throw new IllegalArgumentException(j.i("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i10).toString());
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        if (!(flow instanceof CancellableFlow)) {
            return new CancellableFlowImpl(flow);
        }
        return flow;
    }

    private static final void checkFlowContext$FlowKt__ContextKt(CoroutineContext coroutineContext) {
        boolean z10;
        if (coroutineContext.get(Job.INSTANCE) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        Flow<T> buffer$default;
        buffer$default = buffer$default(flow, -1, null, 2, null);
        return buffer$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        checkFlowContext$FlowKt__ContextKt(coroutineContext);
        if (!Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            if (flow instanceof FusibleFlow) {
                return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, coroutineContext, 0, null, 6, null);
            }
            return new ChannelFlowOperatorImpl(flow, coroutineContext, 0, null, 12, null);
        }
        return flow;
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i10, int i11, Object obj) {
        Flow buffer;
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        buffer = buffer(flow, i10);
        return buffer;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ Flow buffer(Flow flow, int i10) {
        Flow buffer$default;
        buffer$default = buffer$default(flow, i10, null, 2, null);
        return buffer$default;
    }
}
