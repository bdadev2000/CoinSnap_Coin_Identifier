package com.glority.android.engines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetectionAgent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.engines.DetectionAgent", f = "DetectionAgent.kt", i = {}, l = {77}, m = "detect", n = {}, s = {})
/* loaded from: classes13.dex */
public final class DetectionAgent$detect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DetectionAgent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectionAgent$detect$1(DetectionAgent detectionAgent, Continuation<? super DetectionAgent$detect$1> continuation) {
        super(continuation);
        this.this$0 = detectionAgent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.detect(null, this);
    }
}
