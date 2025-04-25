package com.glority.android.picturexx.splash.fragment.splash;

import com.glority.android.adapterhelper.BaseQuickAdapter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment", f = "SplashFragment.kt", i = {0}, l = {BaseQuickAdapter.LOADING_VIEW, 555}, m = "doAfterAgreement", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
public final class SplashFragment$doAfterAgreement$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$doAfterAgreement$1(SplashFragment splashFragment, Continuation<? super SplashFragment$doAfterAgreement$1> continuation) {
        super(continuation);
        this.this$0 = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object doAfterAgreement;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doAfterAgreement = this.this$0.doAfterAgreement(this);
        return doAfterAgreement;
    }
}
