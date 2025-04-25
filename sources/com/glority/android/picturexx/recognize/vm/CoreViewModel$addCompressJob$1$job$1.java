package com.glority.android.picturexx.recognize.vm;

import com.glority.base.entity.RecognizeImageFile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoreViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.vm.CoreViewModel$addCompressJob$1$job$1", f = "CoreViewModel.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CoreViewModel$addCompressJob$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ RecognizeImageFile $recognizeImageFile;
    int label;
    final /* synthetic */ CoreViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreViewModel$addCompressJob$1$job$1(CoreViewModel coreViewModel, RecognizeImageFile recognizeImageFile, Continuation<? super CoreViewModel$addCompressJob$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = coreViewModel;
        this.$recognizeImageFile = recognizeImageFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreViewModel$addCompressJob$1$job$1(this.this$0, this.$recognizeImageFile, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((CoreViewModel$addCompressJob$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.compressImageFile(this.$recognizeImageFile, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
