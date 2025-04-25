package com.glority.base.server;

import com.glority.base.server.CacheThenNetworkRequest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CacheThenNetworkRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.server.CacheThenNetworkRequest$doRequest$1$isSame$1", f = "CacheThenNetworkRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CacheThenNetworkRequest$doRequest$1$isSame$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Y $cache;
    final /* synthetic */ Y $newCache;
    int label;
    final /* synthetic */ CacheThenNetworkRequest<X, Y> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheThenNetworkRequest$doRequest$1$isSame$1(Y y, Y y2, CacheThenNetworkRequest<X, Y> cacheThenNetworkRequest, Continuation<? super CacheThenNetworkRequest$doRequest$1$isSame$1> continuation) {
        super(2, continuation);
        this.$newCache = y;
        this.$cache = y2;
        this.this$0 = cacheThenNetworkRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CacheThenNetworkRequest$doRequest$1$isSame$1(this.$newCache, this.$cache, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CacheThenNetworkRequest$doRequest$1$isSame$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean areEqual;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$newCache == 0) {
            areEqual = this.$cache == 0;
        } else {
            JsonObject asJsonObject = new Gson().toJsonTree(this.$newCache).getAsJsonObject();
            JsonObject asJsonObject2 = new Gson().toJsonTree(this.$cache).getAsJsonObject();
            Gson gson = new Gson();
            CacheThenNetworkRequest<X, Y> cacheThenNetworkRequest = this.this$0;
            Intrinsics.checkNotNull(asJsonObject2);
            CacheThenNetworkRequest.DefaultImpls.removeCreateAtAndResponseAt(cacheThenNetworkRequest, asJsonObject2);
            String json = gson.toJson(Unit.INSTANCE);
            Gson gson2 = new Gson();
            CacheThenNetworkRequest<X, Y> cacheThenNetworkRequest2 = this.this$0;
            Intrinsics.checkNotNull(asJsonObject);
            CacheThenNetworkRequest.DefaultImpls.removeCreateAtAndResponseAt(cacheThenNetworkRequest2, asJsonObject);
            areEqual = Intrinsics.areEqual(json, gson2.toJson(Unit.INSTANCE));
        }
        return Boxing.boxBoolean(areEqual);
    }
}
