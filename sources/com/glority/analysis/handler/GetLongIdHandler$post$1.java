package com.glority.analysis.handler;

import android.util.Log;
import com.glority.analysis.InitAnalysis;
import com.glority.android.core.route.RouteRequest;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.repository.AnalysisRepository;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: GetLongIdHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.analysis.handler.GetLongIdHandler$post$1", f = "GetLongIdHandler.kt", i = {}, l = {33, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class GetLongIdHandler$post$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteRequest $request;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLongIdHandler$post$1(RouteRequest routeRequest, Continuation continuation) {
        super(2, continuation);
        this.$request = routeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new GetLongIdHandler$post$1(this.$request, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetLongIdHandler$post$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Object, com.glority.network.model.Resource] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ?? longIdMessage = AnalysisRepository.INSTANCE.getLongIdMessage();
            Log.i("GetLongIdHandler", "post: " + longIdMessage.getStatus());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = longIdMessage;
            LogUtils.i(InitAnalysis.TAG, "status = " + ((Resource) objectRef.element).getStatus());
            if (((Resource) objectRef.element).getStatus() == Status.SUCCESS) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1 getLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1 = new GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1(objectRef, null, this);
                this.L$0 = longIdMessage;
                this.label = 1;
                if (BuildersKt.withContext(main, getLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (((Resource) objectRef.element).getStatus() == Status.ERROR) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$2 getLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$2 = new GetLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$2(null, this);
                this.L$0 = longIdMessage;
                this.label = 2;
                if (BuildersKt.withContext(main2, getLongIdHandler$post$1$invokeSuspend$$inlined$apply$lambda$2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
