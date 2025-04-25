package com.glority.android.picturexx.recognize.fragment;

import androidx.camera.core.ZoomState;
import androidx.camera.view.LifecycleCameraController;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.glority.android.picturexx.recognize.widget.CoinFocusView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$doCreateView$3", f = "CaptureFragment.kt", i = {}, l = {PsExtractor.AUDIO_STREAM}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CaptureFragment$doCreateView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFragment$doCreateView$3(CaptureFragment captureFragment, Continuation<? super CaptureFragment$doCreateView$3> continuation) {
        super(2, continuation);
        this.this$0 = captureFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureFragment$doCreateView$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$doCreateView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LiveData<ZoomState> zoomState;
        Flow asFlow;
        Flow filterNotNull;
        boolean enableCameraBigCircleStyle;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleCameraController lifecycleCameraController = this.this$0.getLifecycleCameraController();
            if (lifecycleCameraController != null && (zoomState = lifecycleCameraController.getZoomState()) != null && (asFlow = FlowLiveDataConversions.asFlow(zoomState)) != null && (filterNotNull = FlowKt.filterNotNull(asFlow)) != null) {
                this.label = 1;
                obj = FlowKt.firstOrNull(filterNotNull, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ZoomState zoomState2 = (ZoomState) obj;
        if (zoomState2 != null) {
            this.this$0.ultraCamSupported = ((double) zoomState2.getMinZoomRatio()) < 1.0d;
            this.this$0.doCreateViewProcedure(zoomState2.getMinZoomRatio());
            CoinFocusView coinFocusView = CaptureFragment.access$getBinding(this.this$0).cfv;
            enableCameraBigCircleStyle = this.this$0.getEnableCameraBigCircleStyle();
            coinFocusView.setCircleMultiplier(enableCameraBigCircleStyle ? 1.2f : 1.0f);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
