package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.network.exception.RequestFailException;
import com.glority.network.model.Resource;
import com.google.android.exoplayer2.Renderer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ApiServer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/glority/network/model/Resource;", ""}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.ApiServer$sendMessageStreaming$5", f = "ApiServer.kt", i = {}, l = {Renderer.MSG_SET_WAKEUP_LISTENER}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ApiServer$sendMessageStreaming$5 extends SuspendLambda implements Function2<FlowCollector<? super Resource<? extends String>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RequestFailException $exception;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiServer$sendMessageStreaming$5(RequestFailException requestFailException, Continuation<? super ApiServer$sendMessageStreaming$5> continuation) {
        super(2, continuation);
        this.$exception = requestFailException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ApiServer$sendMessageStreaming$5 apiServer$sendMessageStreaming$5 = new ApiServer$sendMessageStreaming$5(this.$exception, continuation);
        apiServer$sendMessageStreaming$5.L$0 = obj;
        return apiServer$sendMessageStreaming$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Resource<? extends String>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Resource<String>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Resource<String>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ApiServer$sendMessageStreaming$5) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((FlowCollector) this.L$0).emit(Resource.INSTANCE.error(this.$exception.getMessage(), null, this.$exception), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
