package com.glority.android.picturexx.vm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradingDetailViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.vm.GradingDetailViewModel", f = "GradingDetailViewModel.kt", i = {}, l = {58}, m = "getSessionId", n = {}, s = {})
/* loaded from: classes5.dex */
public final class GradingDetailViewModel$getSessionId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GradingDetailViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradingDetailViewModel$getSessionId$1(GradingDetailViewModel gradingDetailViewModel, Continuation<? super GradingDetailViewModel$getSessionId$1> continuation) {
        super(continuation);
        this.this$0 = gradingDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSessionId(null, this);
    }
}
