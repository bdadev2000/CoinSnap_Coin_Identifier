package com.glority.android.picturexx.splash.fragment.splash;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment", f = "SplashFragment.kt", i = {}, l = {716}, m = "startEvaluateDetectEfficiency", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SplashFragment$startEvaluateDetectEfficiency$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$startEvaluateDetectEfficiency$1(SplashFragment splashFragment, Continuation<? super SplashFragment$startEvaluateDetectEfficiency$1> continuation) {
        super(continuation);
        this.this$0 = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startEvaluateDetectEfficiency;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startEvaluateDetectEfficiency = this.this$0.startEvaluateDetectEfficiency(this);
        return startEvaluateDetectEfficiency;
    }
}
