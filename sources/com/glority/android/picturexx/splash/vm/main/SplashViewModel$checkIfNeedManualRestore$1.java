package com.glority.android.picturexx.splash.vm.main;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.vm.main.SplashViewModel", f = "SplashViewModel.kt", i = {0, 0}, l = {91}, m = "checkIfNeedManualRestore", n = {"this", "userId"}, s = {"L$0", "J$0"})
/* loaded from: classes5.dex */
public final class SplashViewModel$checkIfNeedManualRestore$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel$checkIfNeedManualRestore$1(SplashViewModel splashViewModel, Continuation<? super SplashViewModel$checkIfNeedManualRestore$1> continuation) {
        super(continuation);
        this.this$0 = splashViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.checkIfNeedManualRestore(this);
    }
}
