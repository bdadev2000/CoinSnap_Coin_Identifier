package com.glority.analysis.handler;

import com.glority.android.core.route.Router;
import com.glority.network.model.Resource;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.GetLongIdMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetLongIdHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/glority/analysis/handler/GetLongIdHandler$post$1$1$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.analysis.handler.GetLongIdHandler$post$1$1$1", f = "GetLongIdHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef $getLongIdMessage;
    int label;
    final /* synthetic */ GetLongIdHandler$post$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1(Ref.ObjectRef objectRef, Continuation continuation, GetLongIdHandler$post$1 getLongIdHandler$post$1) {
        super(2, continuation);
        this.$getLongIdMessage = objectRef;
        this.this$0 = getLongIdHandler$post$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1(this.$getLongIdMessage, completion, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String id = this.this$0.$request.getId();
        GetLongIdMessage getLongIdMessage = (GetLongIdMessage) ((Resource) this.$getLongIdMessage.element).getData();
        Router.onResponse(id, getLongIdMessage != null ? Boxing.boxLong(getLongIdMessage.getLongId()) : null);
        return Unit.INSTANCE;
    }
}
