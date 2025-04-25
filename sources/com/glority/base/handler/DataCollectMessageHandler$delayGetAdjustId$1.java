package com.glority.base.handler;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataCollectMessageHandler.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.handler.DataCollectMessageHandler", f = "DataCollectMessageHandler.kt", i = {0, 0}, l = {31, 34}, m = "delayGetAdjustId", n = {"this", "count"}, s = {"L$0", "I$0"})
/* loaded from: classes6.dex */
public final class DataCollectMessageHandler$delayGetAdjustId$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataCollectMessageHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCollectMessageHandler$delayGetAdjustId$1(DataCollectMessageHandler dataCollectMessageHandler, Continuation<? super DataCollectMessageHandler$delayGetAdjustId$1> continuation) {
        super(continuation);
        this.this$0 = dataCollectMessageHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object delayGetAdjustId;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        delayGetAdjustId = this.this$0.delayGetAdjustId(0, this);
        return delayGetAdjustId;
    }
}
