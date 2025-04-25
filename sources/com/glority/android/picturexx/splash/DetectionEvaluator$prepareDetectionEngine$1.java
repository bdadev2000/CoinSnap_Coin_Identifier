package com.glority.android.picturexx.splash;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetectionBenchMark.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.DetectionEvaluator", f = "DetectionBenchMark.kt", i = {0, 0, 1, 1}, l = {151, 156}, m = "prepareDetectionEngine", n = {"this", "bitmap", "this", "bitmap"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes5.dex */
public final class DetectionEvaluator$prepareDetectionEngine$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DetectionEvaluator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectionEvaluator$prepareDetectionEngine$1(DetectionEvaluator detectionEvaluator, Continuation<? super DetectionEvaluator$prepareDetectionEngine$1> continuation) {
        super(continuation);
        this.this$0 = detectionEvaluator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object prepareDetectionEngine;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        prepareDetectionEngine = this.this$0.prepareDetectionEngine(null, this);
        return prepareDetectionEngine;
    }
}
