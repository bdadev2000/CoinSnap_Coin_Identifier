package com.glority.android.picturexx.recognize.vm;

import com.glority.base.entity.RecognizeImageFile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: CoreViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.vm.CoreViewModel$addCompressJob$1", f = "CoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CoreViewModel$addCompressJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $addDone;
    final /* synthetic */ RecognizeImageFile $recognizeImageFile;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoreViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreViewModel$addCompressJob$1(CoreViewModel coreViewModel, Function0<Unit> function0, RecognizeImageFile recognizeImageFile, Continuation<? super CoreViewModel$addCompressJob$1> continuation) {
        super(2, continuation);
        this.this$0 = coreViewModel;
        this.$addDone = function0;
        this.$recognizeImageFile = recognizeImageFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoreViewModel$addCompressJob$1 coreViewModel$addCompressJob$1 = new CoreViewModel$addCompressJob$1(this.this$0, this.$addDone, this.$recognizeImageFile, continuation);
        coreViewModel$addCompressJob$1.L$0 = obj;
        return coreViewModel$addCompressJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoreViewModel$addCompressJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred<Integer> async$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new CoreViewModel$addCompressJob$1$job$1(this.this$0, this.$recognizeImageFile, null), 3, null);
            this.this$0.getCompressJobs().add(async$default);
            this.$addDone.invoke();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
