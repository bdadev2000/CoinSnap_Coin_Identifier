package com.glority.android.engines;

import android.content.Context;
import android.util.Log;
import com.glority.android.detection.Detection;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOptions;
import com.glority.android.detection.p001enum.ModelType;
import com.glority.android.detection.p001enum.Strategy;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.JobKt;

/* compiled from: DetectionAgent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0087@¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/glority/android/engines/DetectionAgent;", "", "<init>", "()V", "workingThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "mDetectInterpreter", "Lcom/glority/android/detection/interpreter/BaseInterpreter;", "mDetectThreshold", "", "mDetectStrategy", "Lcom/glority/android/detection/enum/Strategy;", "mExpendRation", "initInterpreter", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initSync", "applicationContext", "detect", "Lcom/glority/android/detection/item/DetectOutput;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "Companion", "engines_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class DetectionAgent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<DetectionAgent> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<DetectionAgent>() { // from class: com.glority.android.engines.DetectionAgent$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DetectionAgent invoke() {
            return new DetectionAgent(null);
        }
    });
    private BaseInterpreter mDetectInterpreter;
    private Strategy mDetectStrategy;
    private float mDetectThreshold;
    private float mExpendRation;
    private final ExecutorCoroutineDispatcher workingThread;

    public /* synthetic */ DetectionAgent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DetectionAgent() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.workingThread = ExecutorsKt.from(newSingleThreadExecutor);
        this.mDetectThreshold = 0.5f;
        this.mDetectStrategy = Strategy.smart;
    }

    /* compiled from: DetectionAgent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/engines/DetectionAgent$Companion;", "", "<init>", "()V", "instance", "Lcom/glority/android/engines/DetectionAgent;", "getInstance", "()Lcom/glority/android/engines/DetectionAgent;", "instance$delegate", "Lkotlin/Lazy;", "engines_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DetectionAgent getInstance() {
            return (DetectionAgent) DetectionAgent.instance$delegate.getValue();
        }
    }

    public final Object initInterpreter(Context context, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DetectionAgent$initInterpreter$2(this, context.getApplicationContext(), null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSync(Context applicationContext) {
        BaseInterpreter baseInterpreter;
        if (this.mDetectInterpreter != null) {
            return;
        }
        try {
            Detection.Companion companion = Detection.INSTANCE;
            InputStream open = applicationContext.getResources().getAssets().open("detect.tflite");
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            baseInterpreter = companion.createTFLiteInterpreter(open, "", new DetectOptions(320, 320, 20, 0.0f, 255.0f, ModelType.Yolov5), applicationContext, new BaseInterpreter.InitStatusCallback() { // from class: com.glority.android.engines.DetectionAgent$initSync$1
                @Override // com.glority.android.detection.interpreter.BaseInterpreter.InitStatusCallback
                public void onInitFailed(Throwable e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    Log.e("DetectionAgent", "initInterpreter error " + e);
                }

                @Override // com.glority.android.detection.interpreter.BaseInterpreter.InitStatusCallback
                public void onInitSuccess() {
                    Log.e("DetectionAgent", "initInterpreter success");
                }
            });
        } catch (Throwable unused) {
            baseInterpreter = null;
        }
        this.mDetectInterpreter = baseInterpreter;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object detect(android.graphics.Bitmap r6, kotlin.coroutines.Continuation<? super com.glority.android.detection.item.DetectOutput> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.glority.android.engines.DetectionAgent$detect$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.engines.DetectionAgent$detect$1 r0 = (com.glority.android.engines.DetectionAgent$detect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.engines.DetectionAgent$detect$1 r0 = new com.glority.android.engines.DetectionAgent$detect$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.ExecutorCoroutineDispatcher r7 = r5.workingThread
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.glority.android.engines.DetectionAgent$detect$result$1 r2 = new com.glority.android.engines.DetectionAgent$detect$result$1
            r4 = 0
            r2.<init>(r5, r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.glority.android.detection.item.DetectOutput r7 = (com.glority.android.detection.item.DetectOutput) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.engines.DetectionAgent.detect(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void release() {
        try {
            BaseInterpreter baseInterpreter = this.mDetectInterpreter;
            if (baseInterpreter != null) {
                baseInterpreter.release();
            }
            this.mDetectInterpreter = null;
            JobKt.cancel((CoroutineContext) this.workingThread, new CancellationException("Canceled by release"));
        } catch (Throwable th) {
            Log.e("DetectionAgent", "release error " + th);
        }
    }
}
