package com.glority.android.detection;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.detection.Detection;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOptions;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
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
/* compiled from: Det.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.detection.Det$initSync$1", f = "Det.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
public final class Det$initSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $applicationContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Det this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Det$initSync$1(Det det, Context context, Continuation<? super Det$initSync$1> continuation) {
        super(2, continuation);
        this.this$0 = det;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Det$initSync$1 det$initSync$1 = new Det$initSync$1(this.this$0, this.$applicationContext, continuation);
        det$initSync$1.L$0 = obj;
        return det$initSync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Det$initSync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        BaseInterpreter baseInterpreter;
        Deferred async$default;
        Det det;
        Deferred deferred2;
        Det det2;
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
            Det det3 = this.this$0;
            baseInterpreter = null;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.$applicationContext, this.this$0, null), 3, null);
            det3.initDetModeJob = async$default;
            det = this.this$0;
            deferred2 = det.initDetModeJob;
            if (deferred2 != null) {
                this.L$0 = det;
                this.label = 1;
                Object await = deferred2.await(this);
                if (await == coroutine_suspended) {
                    return coroutine_suspended;
                }
                det2 = det;
                obj = await;
            }
            det.mDetectInterpreter = baseInterpreter;
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        det2 = (Det) this.L$0;
        ResultKt.throwOnFailure(obj);
        baseInterpreter = (BaseInterpreter) obj;
        det = det2;
        det.mDetectInterpreter = baseInterpreter;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Det.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/glority/android/detection/interpreter/BaseInterpreter;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.glority.android.detection.Det$initSync$1$1", f = "Det.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.detection.Det$initSync$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BaseInterpreter>, Object> {
        final /* synthetic */ Context $applicationContext;
        int label;
        final /* synthetic */ Det this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Det det, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$applicationContext = context;
            this.this$0 = det;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$applicationContext, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BaseInterpreter> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            DetectOptions detectOptions;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Detection.Companion companion = Detection.INSTANCE;
                AssetManager assets = this.$applicationContext.getResources().getAssets();
                str = this.this$0.modelFileName;
                InputStream open = assets.open(str);
                Intrinsics.checkNotNullExpressionValue(open, "applicationContext.resou…ssets.open(modelFileName)");
                str2 = this.this$0.decryptKey;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                detectOptions = this.this$0.options;
                return companion.createTFLiteInterpreter(open, str3, detectOptions, this.$applicationContext, new BaseInterpreter.InitStatusCallback() { // from class: com.glority.android.detection.Det.initSync.1.1.1
                    @Override // com.glority.android.detection.interpreter.BaseInterpreter.InitStatusCallback
                    public void onInitFailed(Throwable e) {
                        Intrinsics.checkNotNullParameter(e, "e");
                        new LogEventRequest(RecognizeLogEvents.init_tensorflowerror_click, BundleKt.bundleOf(TuplesKt.to("content", e.getMessage()))).post();
                    }

                    @Override // com.glority.android.detection.interpreter.BaseInterpreter.InitStatusCallback
                    public void onInitSuccess() {
                        new LogEventRequest(RecognizeLogEvents.init_tensorflowsuccess_click, null, 2, null).post();
                    }
                });
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
