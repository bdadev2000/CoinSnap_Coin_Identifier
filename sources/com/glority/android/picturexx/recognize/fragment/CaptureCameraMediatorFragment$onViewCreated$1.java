package com.glority.android.picturexx.recognize.fragment;

import androidx.camera.core.ZoomState;
import androidx.camera.view.LifecycleCameraController;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.glority.android.picturexx.recognize.listeners.OnZoomStateChangedListener;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CaptureCameraMediatorFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$onViewCreated$1", f = "CaptureCameraMediatorFragment.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CaptureCameraMediatorFragment$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CaptureCameraMediatorFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureCameraMediatorFragment$onViewCreated$1(CaptureCameraMediatorFragment captureCameraMediatorFragment, Continuation<? super CaptureCameraMediatorFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = captureCameraMediatorFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureCameraMediatorFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureCameraMediatorFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LiveData<ZoomState> zoomState;
        Flow asFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleCameraController lifecycleCameraController = this.this$0.getLifecycleCameraController();
            if (lifecycleCameraController != null && (zoomState = lifecycleCameraController.getZoomState()) != null && (asFlow = FlowLiveDataConversions.asFlow(zoomState)) != null) {
                final CaptureCameraMediatorFragment captureCameraMediatorFragment = this.this$0;
                this.label = 1;
                if (asFlow.collect(new FlowCollector() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$onViewCreated$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ZoomState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ZoomState zoomState2, Continuation<? super Unit> continuation) {
                        OnZoomStateChangedListener onZoomStateChangedListener;
                        CaptureCameraMediatorFragment.this.maxZoomValue = zoomState2.getMaxZoomRatio();
                        CaptureCameraMediatorFragment.this.minZoomValue = zoomState2.getMinZoomRatio();
                        CaptureCameraMediatorFragment.this.currentZoomValue = zoomState2.getZoomRatio();
                        onZoomStateChangedListener = CaptureCameraMediatorFragment.this.onZoomStateChangedListener;
                        if (onZoomStateChangedListener != null) {
                            Intrinsics.checkNotNull(zoomState2);
                            onZoomStateChangedListener.handleZoomStateChange(zoomState2);
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
