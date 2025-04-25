package com.glority.android.picturexx.recognize.analyzer;

import android.graphics.Bitmap;
import com.glority.android.core.app.AppContext;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetSingleton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.analyzer.DetSingleton$det$1", f = "DetSingleton.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DetSingleton$det$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Ref.ObjectRef<DetectOutput> $result;
    int label;
    final /* synthetic */ DetSingleton this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetSingleton$det$1(DetSingleton detSingleton, Ref.ObjectRef<DetectOutput> objectRef, Bitmap bitmap, Continuation<? super DetSingleton$det$1> continuation) {
        super(2, continuation);
        this.this$0 = detSingleton;
        this.$result = objectRef;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetSingleton$det$1(this.this$0, this.$result, this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DetSingleton$det$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BaseInterpreter baseInterpreter;
        BaseInterpreter baseInterpreter2;
        T t;
        float f;
        Strategy strategy;
        float f2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            baseInterpreter = this.this$0.mDetectInterpreter;
            if (baseInterpreter == null) {
                this.this$0.initSync(AppContext.INSTANCE.peekContext());
            }
            Ref.ObjectRef<DetectOutput> objectRef = this.$result;
            baseInterpreter2 = this.this$0.mDetectInterpreter;
            if (baseInterpreter2 != null) {
                Bitmap bitmap = this.$bitmap;
                f = this.this$0.mDetectThreshold;
                strategy = this.this$0.mDetectStrategy;
                f2 = this.this$0.mExpendRation;
                t = BaseInterpreter.detect$default(baseInterpreter2, bitmap, f, strategy, f2, 0.0f, 0.0f, 0, StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA, null);
            } else {
                t = 0;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
