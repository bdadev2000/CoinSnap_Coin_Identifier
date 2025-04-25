package com.glority.base.server;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.glority.base.server.CacheThenNetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CacheThenNetworkRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.server.CacheThenNetworkRequest$doRequest$1", f = "CacheThenNetworkRequest.kt", i = {1, 2}, l = {37, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, 57}, m = "invokeSuspend", n = {"cache", "newCache"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
public final class CacheThenNetworkRequest$doRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<CacheThenNetworkRequest.ResultData<Y>> $liveData;
    Object L$0;
    int label;
    final /* synthetic */ CacheThenNetworkRequest<X, Y> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheThenNetworkRequest$doRequest$1(MutableLiveData<CacheThenNetworkRequest.ResultData<Y>> mutableLiveData, CacheThenNetworkRequest<X, Y> cacheThenNetworkRequest, Continuation<? super CacheThenNetworkRequest$doRequest$1> continuation) {
        super(2, continuation);
        this.$liveData = mutableLiveData;
        this.this$0 = cacheThenNetworkRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CacheThenNetworkRequest$doRequest$1(this.$liveData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CacheThenNetworkRequest$doRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #1 {all -> 0x00e6, blocks: (B:8:0x0015, B:9:0x00d2, B:11:0x00da), top: B:7:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.server.CacheThenNetworkRequest$doRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
