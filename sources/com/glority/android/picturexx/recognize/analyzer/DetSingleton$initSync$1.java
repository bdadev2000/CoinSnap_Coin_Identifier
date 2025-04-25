package com.glority.android.picturexx.recognize.analyzer;

import android.content.Context;
import androidx.core.os.BundleKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.detection.Detection;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOptions;
import com.glority.android.detection.p001enum.ModelType;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.utils.stability.LogUtils;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetSingleton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.analyzer.DetSingleton$initSync$1", f = "DetSingleton.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DetSingleton$initSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $applicationContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DetSingleton this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetSingleton$initSync$1(DetSingleton detSingleton, Context context, Continuation<? super DetSingleton$initSync$1> continuation) {
        super(2, continuation);
        this.this$0 = detSingleton;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetSingleton$initSync$1 detSingleton$initSync$1 = new DetSingleton$initSync$1(this.this$0, this.$applicationContext, continuation);
        detSingleton$initSync$1.L$0 = obj;
        return detSingleton$initSync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DetSingleton$initSync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        BaseInterpreter baseInterpreter;
        Deferred async$default;
        DetSingleton detSingleton;
        Deferred deferred2;
        DetSingleton detSingleton2;
        BaseInterpreter baseInterpreter2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            deferred = this.this$0.initDetModeJob;
            if (deferred != null) {
                baseInterpreter2 = this.this$0.mDetectInterpreter;
                if (baseInterpreter2 != null) {
                    return Unit.INSTANCE;
                }
            }
            DetSingleton detSingleton3 = this.this$0;
            baseInterpreter = null;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.$applicationContext, null), 3, null);
            detSingleton3.initDetModeJob = async$default;
            detSingleton = this.this$0;
            deferred2 = detSingleton.initDetModeJob;
            if (deferred2 != null) {
                this.L$0 = detSingleton;
                this.label = 1;
                Object await = deferred2.await(this);
                if (await == coroutine_suspended) {
                    return coroutine_suspended;
                }
                detSingleton2 = detSingleton;
                obj = await;
            }
            detSingleton.mDetectInterpreter = baseInterpreter;
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        detSingleton2 = (DetSingleton) this.L$0;
        ResultKt.throwOnFailure(obj);
        baseInterpreter = (BaseInterpreter) obj;
        detSingleton = detSingleton2;
        detSingleton.mDetectInterpreter = baseInterpreter;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DetSingleton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/glority/android/detection/interpreter/BaseInterpreter;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.recognize.analyzer.DetSingleton$initSync$1$1", f = "DetSingleton.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.recognize.analyzer.DetSingleton$initSync$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BaseInterpreter>, Object> {
        final /* synthetic */ Context $applicationContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$applicationContext = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$applicationContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BaseInterpreter> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                LogUtils.d("DetSingleton initInterpreter");
                Detection.Companion companion = Detection.INSTANCE;
                InputStream open = this.$applicationContext.getResources().getAssets().open("detect.tflite");
                Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                return companion.createTFLiteInterpreter(open, "", new DetectOptions(320, 320, 20, 0.0f, 255.0f, ModelType.Yolov5), this.$applicationContext, new BaseInterpreter.InitStatusCallback() { // from class: com.glority.android.picturexx.recognize.analyzer.DetSingleton.initSync.1.1.1
                    @Override // com.glority.android.detection.interpreter.BaseInterpreter.InitStatusCallback
                    public void onInitFailed(Throwable e) {
                        Intrinsics.checkNotNullParameter(e, "e");
                        LogUtils.e("init tensorflow failed " + e.getMessage());
                        new LogEventRequest(RecognizeLogEvents.init_tensorflowerror_click, BundleKt.bundleOf(TuplesKt.to("content", e.getMessage()))).post();
                    }

                    @Override // com.glority.android.detection.interpreter.BaseInterpreter.InitStatusCallback
                    public void onInitSuccess() {
                        LogUtils.e("init tensorflow success");
                        new LogEventRequest(RecognizeLogEvents.init_tensorflowsuccess_click, null, 2, null).post();
                    }
                });
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
