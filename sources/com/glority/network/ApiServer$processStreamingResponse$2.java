package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import okio.BufferedSource;

/* compiled from: ApiServer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.ApiServer$processStreamingResponse$2", f = "ApiServer.kt", i = {1}, l = {843, 846}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class ApiServer$processStreamingResponse$2 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ BufferedSource $responseSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiServer$processStreamingResponse$2(BufferedSource bufferedSource, Continuation<? super ApiServer$processStreamingResponse$2> continuation) {
        super(2, continuation);
        this.$responseSource = bufferedSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ApiServer$processStreamingResponse$2 apiServer$processStreamingResponse$2 = new ApiServer$processStreamingResponse$2(this.$responseSource, continuation);
        apiServer$processStreamingResponse$2.L$0 = obj;
        return apiServer$processStreamingResponse$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
        return ((ApiServer$processStreamingResponse$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        String readUtf8Line;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                } else {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        this.$responseSource.close();
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                do {
                    readUtf8Line = this.$responseSource.readUtf8Line();
                    if (readUtf8Line == null) {
                        LogUtils.e("Streaming", "EOF reached");
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector.emit(readUtf8Line, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.$responseSource.close();
                        return Unit.INSTANCE;
                    }
                    this.L$0 = flowCollector;
                    this.label = 2;
                } while (flowCollector.emit(readUtf8Line, this) != coroutine_suspended);
                return coroutine_suspended;
            } catch (Exception e) {
                LogUtils.e("Streaming", "Error reading streaming response", e);
                throw e;
            }
        } catch (Throwable th) {
            this.$responseSource.close();
            throw th;
        }
    }
}
