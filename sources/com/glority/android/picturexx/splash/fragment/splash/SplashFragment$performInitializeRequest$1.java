package com.glority.android.picturexx.splash.fragment.splash;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment", f = "SplashFragment.kt", i = {0, 0}, l = {561}, m = "performInitializeRequest", n = {"this", "startupTime"}, s = {"L$0", "J$0"})
/* loaded from: classes5.dex */
public final class SplashFragment$performInitializeRequest$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$performInitializeRequest$1(SplashFragment splashFragment, Continuation<? super SplashFragment$performInitializeRequest$1> continuation) {
        super(continuation);
        this.this$0 = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object performInitializeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performInitializeRequest = this.this$0.performInitializeRequest(this);
        return performInitializeRequest;
    }
}
