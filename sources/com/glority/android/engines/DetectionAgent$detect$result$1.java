package com.glority.android.engines;

import android.graphics.Bitmap;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOutput;
import com.glority.android.detection.p001enum.Strategy;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetectionAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/glority/android/detection/item/DetectOutput;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.engines.DetectionAgent$detect$result$1", f = "DetectionAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
public final class DetectionAgent$detect$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DetectOutput>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;
    final /* synthetic */ DetectionAgent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectionAgent$detect$result$1(DetectionAgent detectionAgent, Bitmap bitmap, Continuation<? super DetectionAgent$detect$result$1> continuation) {
        super(2, continuation);
        this.this$0 = detectionAgent;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetectionAgent$detect$result$1(this.this$0, this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DetectOutput> continuation) {
        return ((DetectionAgent$detect$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BaseInterpreter baseInterpreter;
        float f;
        Strategy strategy;
        float f2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            baseInterpreter = this.this$0.mDetectInterpreter;
            if (baseInterpreter == null) {
                return null;
            }
            Bitmap bitmap = this.$bitmap;
            f = this.this$0.mDetectThreshold;
            strategy = this.this$0.mDetectStrategy;
            f2 = this.this$0.mExpendRation;
            return BaseInterpreter.detect$default(baseInterpreter, bitmap, f, strategy, f2, 0.0f, 0.0f, 0, StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
