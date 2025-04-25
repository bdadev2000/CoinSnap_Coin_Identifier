package com.glority.android.picturexx.recognize.fragment;

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
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1", f = "CaptureFragment.kt", i = {}, l = {952}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CaptureFragment$createAutoZoomInJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFragment$createAutoZoomInJob$1(CaptureFragment captureFragment, Continuation<? super CaptureFragment$createAutoZoomInJob$1> continuation) {
        super(2, continuation);
        this.this$0 = captureFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureFragment$createAutoZoomInJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$createAutoZoomInJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Channel zoomFactorChannel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zoomFactorChannel = this.this$0.getZoomFactorChannel();
            if (zoomFactorChannel == null) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (FlowKt.distinctUntilChanged(FlowKt.consumeAsFlow(zoomFactorChannel), new Function2<AnalysisResult, AnalysisResult, Boolean>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1.1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(AnalysisResult old, AnalysisResult analysisResult) {
                    Intrinsics.checkNotNullParameter(old, "old");
                    Intrinsics.checkNotNullParameter(analysisResult, "new");
                    return Boolean.valueOf(old.getAreaStatus() == analysisResult.getAreaStatus());
                }
            }).collect(new AnonymousClass2(this.this$0, zoomFactorChannel), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaptureFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/glority/android/picturexx/recognize/fragment/AnalysisResult;", "emit", "(Lcom/glority/android/picturexx/recognize/fragment/AnalysisResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    /* renamed from: com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Channel<AnalysisResult> $zoomFactorChannel;
        final /* synthetic */ CaptureFragment this$0;

        AnonymousClass2(CaptureFragment captureFragment, Channel<AnalysisResult> channel) {
            this.this$0 = captureFragment;
            this.$zoomFactorChannel = channel;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.glority.android.picturexx.recognize.fragment.AnalysisResult r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2$emit$1
                if (r0 == 0) goto L14
                r0 = r8
                com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2$emit$1 r0 = (com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.label
                int r8 = r8 - r2
                r0.label = r8
                goto L19
            L14:
                com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2$emit$1 r0 = new com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2$emit$1
                r0.<init>(r6, r8)
            L19:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.L$1
                com.glority.android.picturexx.recognize.fragment.AnalysisResult r7 = (com.glority.android.picturexx.recognize.fragment.AnalysisResult) r7
                java.lang.Object r0 = r0.L$0
                com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1$2 r0 = (com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1.AnonymousClass2) r0
                kotlin.ResultKt.throwOnFailure(r8)
                goto L55
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                kotlin.ResultKt.throwOnFailure(r8)
                com.glority.android.picturexx.recognize.analyzer.AreaStatus r8 = r7.getAreaStatus()
                com.glority.android.picturexx.recognize.analyzer.AreaStatus r2 = com.glority.android.picturexx.recognize.analyzer.AreaStatus.TOO_SMALL
                if (r8 != r2) goto L66
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r3
                r4 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r4, r0)
                if (r8 != r1) goto L54
                return r1
            L54:
                r0 = r6
            L55:
                com.glority.android.picturexx.recognize.fragment.CaptureFragment r8 = r0.this$0
                float r7 = r7.getZoomInFactor()
                com.glority.android.picturexx.recognize.fragment.CaptureFragment.access$autoZoomIn(r8, r7)
                kotlinx.coroutines.channels.Channel<com.glority.android.picturexx.recognize.fragment.AnalysisResult> r7 = r0.$zoomFactorChannel
                kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
                r8 = 0
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r7, r8, r3, r8)
            L66:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.recognize.fragment.CaptureFragment$createAutoZoomInJob$1.AnonymousClass2.emit(com.glority.android.picturexx.recognize.fragment.AnalysisResult, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((AnalysisResult) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
