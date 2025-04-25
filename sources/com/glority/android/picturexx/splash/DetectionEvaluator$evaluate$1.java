package com.glority.android.picturexx.splash;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetectionBenchMark.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.DetectionEvaluator", f = "DetectionBenchMark.kt", i = {0, 1, 1, 2, 3}, l = {70, 83, 88, 119}, m = "evaluate", n = {"this", "this", "bitmap", "this", "time"}, s = {"L$0", "L$0", "L$1", "L$0", "J$0"})
/* loaded from: classes5.dex */
public final class DetectionEvaluator$evaluate$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DetectionEvaluator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectionEvaluator$evaluate$1(DetectionEvaluator detectionEvaluator, Continuation<? super DetectionEvaluator$evaluate$1> continuation) {
        super(continuation);
        this.this$0 = detectionEvaluator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.evaluate(this);
    }
}
