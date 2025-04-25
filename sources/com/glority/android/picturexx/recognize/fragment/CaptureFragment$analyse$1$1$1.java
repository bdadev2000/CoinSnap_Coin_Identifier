package com.glority.android.picturexx.recognize.fragment;

import com.glority.android.picturexx.recognize.analyzer.AreaStatus;
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

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$analyse$1$1$1", f = "CaptureFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CaptureFragment$analyse$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AreaStatus $areaProcessStatus;
    final /* synthetic */ Ref.ObjectRef<String> $debugText;
    final /* synthetic */ boolean $isOk;
    final /* synthetic */ boolean $isReadyToCaptureBefore;
    final /* synthetic */ long $start;
    final /* synthetic */ Ref.IntRef $textId;
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFragment$analyse$1$1$1(boolean z, Ref.ObjectRef<String> objectRef, long j, CaptureFragment captureFragment, boolean z2, Ref.IntRef intRef, AreaStatus areaStatus, Continuation<? super CaptureFragment$analyse$1$1$1> continuation) {
        super(2, continuation);
        this.$isReadyToCaptureBefore = z;
        this.$debugText = objectRef;
        this.$start = j;
        this.this$0 = captureFragment;
        this.$isOk = z2;
        this.$textId = intRef;
        this.$areaProcessStatus = areaStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureFragment$analyse$1$1$1(this.$isReadyToCaptureBefore, this.$debugText, this.$start, this.this$0, this.$isOk, this.$textId, this.$areaProcessStatus, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$analyse$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$isReadyToCaptureBefore) {
            Ref.ObjectRef<String> objectRef = this.$debugText;
            objectRef.element = ((Object) objectRef.element) + "total time : " + (System.currentTimeMillis() - this.$start);
            CaptureFragment.access$getBinding(this.this$0).modelInfoTv.setText(this.$debugText.element);
        }
        this.this$0.updateCircleStatus(this.$isOk, this.$textId.element, this.$areaProcessStatus);
        return Unit.INSTANCE;
    }
}
