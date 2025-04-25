package com.glority.android.picturexx.recognize.fragment;

import android.content.Context;
import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.detection.singleton.GoogleServiceTFSingleton;
import com.glority.android.picturexx.recognize.analyzer.BlurSingleton;
import com.glority.android.picturexx.recognize.analyzer.DetSingleton;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$doCreateView$2", f = "CaptureFragment.kt", i = {0}, l = {179, 183}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class CaptureFragment$doCreateView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFragment$doCreateView$2(CaptureFragment captureFragment, Continuation<? super CaptureFragment$doCreateView$2> continuation) {
        super(2, continuation);
        this.this$0 = captureFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CaptureFragment$doCreateView$2 captureFragment$doCreateView$2 = new CaptureFragment$doCreateView$2(this.this$0, continuation);
        captureFragment$doCreateView$2.L$0 = obj;
        return captureFragment$doCreateView$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$doCreateView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        boolean enableAnalyse;
        CaptureFragment captureFragment;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            GoogleServiceTFSingleton companion = GoogleServiceTFSingleton.INSTANCE.getInstance();
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            if (companion.isInstalled(requireContext)) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            captureFragment = (CaptureFragment) this.L$0;
            ResultKt.throwOnFailure(obj);
            BlurSingleton companion2 = BlurSingleton.INSTANCE.getInstance();
            Context requireContext2 = captureFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            companion2.initInterpreter(requireContext2, "blur.tflite");
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            enableAnalyse = this.this$0.getEnableAnalyse();
            if (enableAnalyse) {
                CaptureFragment captureFragment2 = this.this$0;
                DetSingleton companion3 = DetSingleton.INSTANCE.getInstance();
                Context requireContext3 = captureFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                companion3.initInterpreter(requireContext3);
                this.L$0 = captureFragment2;
                this.label = 2;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                captureFragment = captureFragment2;
                BlurSingleton companion22 = BlurSingleton.INSTANCE.getInstance();
                Context requireContext22 = captureFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext22, "requireContext(...)");
                companion22.initInterpreter(requireContext22, "blur.tflite");
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
