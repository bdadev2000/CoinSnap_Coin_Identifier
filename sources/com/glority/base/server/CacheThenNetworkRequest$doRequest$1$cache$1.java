package com.glority.base.server;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [Y] */
/* compiled from: CacheThenNetworkRequest.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Y", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.server.CacheThenNetworkRequest$doRequest$1$cache$1", f = "CacheThenNetworkRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CacheThenNetworkRequest$doRequest$1$cache$1<Y> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Y>, Object> {
    int label;
    final /* synthetic */ CacheThenNetworkRequest<X, Y> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheThenNetworkRequest$doRequest$1$cache$1(CacheThenNetworkRequest<X, Y> cacheThenNetworkRequest, Continuation<? super CacheThenNetworkRequest$doRequest$1$cache$1> continuation) {
        super(2, continuation);
        this.this$0 = cacheThenNetworkRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CacheThenNetworkRequest$doRequest$1$cache$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Y> continuation) {
        return ((CacheThenNetworkRequest$doRequest$1$cache$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.cacheRequest();
    }
}
