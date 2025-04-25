package com.glority.analysis;

import android.os.Handler;
import com.glority.analysis.utils.AnalysisUtils;
import com.glority.repository.AnalysisRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitAnalysis.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.analysis.InitAnalysis$run$1", f = "InitAnalysis.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class InitAnalysis$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InitAnalysis$run$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new InitAnalysis$run$1(completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InitAnalysis$run$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        if (AnalysisRepository.INSTANCE.getPRODUCT_ID().length() == 0 || Intrinsics.areEqual(AnalysisRepository.INSTANCE.getPRODUCT_ID(), "null")) {
            objectRef.element = "ANALYSIS_PRODUCT_ID is null or empty!!!!";
        }
        if (AnalysisUtils.INSTANCE.getSDK_VERSION().length() == 0 || Intrinsics.areEqual(AnalysisUtils.INSTANCE.getSDK_VERSION(), "null")) {
            objectRef.element = "SDK_VERSION is null or empty!!!!";
        }
        if (((String) objectRef.element) != null) {
            new Handler().postDelayed(new Runnable() { // from class: com.glority.analysis.InitAnalysis$run$1.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    InitAnalysis.INSTANCE.quitEdit("error", (String) Ref.ObjectRef.this.element);
                }
            }, 5000L);
        }
        return Unit.INSTANCE;
    }
}
