package com.glority.android.picturexx.splash.fragment.splashguide;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashGuideAnimationFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public /* synthetic */ class OnBoardingSplashGuideFragment$doCreateView$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OnBoardingSplashGuideFragment$doCreateView$1$2$1(Object obj) {
        super(0, obj, OnBoardingSplashGuideFragment.class, "onAnimationFinish", "onAnimationFinish()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnBoardingSplashGuideFragment) this.receiver).onAnimationFinish();
    }
}
