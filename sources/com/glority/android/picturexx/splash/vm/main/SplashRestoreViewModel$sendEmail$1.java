package com.glority.android.picturexx.splash.vm.main;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashRestoreViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel", f = "SplashRestoreViewModel.kt", i = {}, l = {20}, m = "sendEmail", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SplashRestoreViewModel$sendEmail$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashRestoreViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashRestoreViewModel$sendEmail$1(SplashRestoreViewModel splashRestoreViewModel, Continuation<? super SplashRestoreViewModel$sendEmail$1> continuation) {
        super(continuation);
        this.this$0 = splashRestoreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendEmail(null, this);
    }
}
