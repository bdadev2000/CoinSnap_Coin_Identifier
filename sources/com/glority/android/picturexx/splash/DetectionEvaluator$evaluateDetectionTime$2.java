package com.glority.android.picturexx.splash;

import android.graphics.Bitmap;
import com.glority.android.detection.item.DetectOutput;
import com.glority.android.picturexx.recognize.analyzer.DetSingleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetectionBenchMark.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/glority/android/detection/item/DetectOutput;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.DetectionEvaluator$evaluateDetectionTime$2", f = "DetectionBenchMark.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DetectionEvaluator$evaluateDetectionTime$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends DetectOutput, ? extends Long>>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectionEvaluator$evaluateDetectionTime$2(Bitmap bitmap, Continuation<? super DetectionEvaluator$evaluateDetectionTime$2> continuation) {
        super(2, continuation);
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetectionEvaluator$evaluateDetectionTime$2(this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends DetectOutput, ? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<DetectOutput, Long>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<DetectOutput, Long>> continuation) {
        return ((DetectionEvaluator$evaluateDetectionTime$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TuplesKt.to(DetSingleton.INSTANCE.getInstance().det(this.$bitmap), Boxing.boxLong(System.currentTimeMillis() - System.currentTimeMillis()));
    }
}
