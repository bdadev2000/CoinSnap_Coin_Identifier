package com.glority.android.picturexx.splash;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetectionBenchMark.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.DetectionBenchMark", f = "DetectionBenchMark.kt", i = {0, 0}, l = {57}, m = "startEvaluate", n = {"this", "startTime"}, s = {"L$0", "J$0"})
/* loaded from: classes5.dex */
public final class DetectionBenchMark$startEvaluate$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DetectionBenchMark this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectionBenchMark$startEvaluate$1(DetectionBenchMark detectionBenchMark, Continuation<? super DetectionBenchMark$startEvaluate$1> continuation) {
        super(continuation);
        this.this$0 = detectionBenchMark;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startEvaluate(null, this);
    }
}
