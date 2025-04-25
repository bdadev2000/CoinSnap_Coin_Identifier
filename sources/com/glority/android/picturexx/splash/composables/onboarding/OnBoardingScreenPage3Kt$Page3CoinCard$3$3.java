package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: OnBoardingScreenPage3.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/ConstrainScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
final class OnBoardingScreenPage3Kt$Page3CoinCard$3$3 extends Lambda implements Function1<ConstrainScope, Unit> {
    public static final OnBoardingScreenPage3Kt$Page3CoinCard$3$3 INSTANCE = new OnBoardingScreenPage3Kt$Page3CoinCard$3$3();

    OnBoardingScreenPage3Kt$Page3CoinCard$3$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        HorizontalAnchorable.m7376linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
        VerticalAnchorable.m7470linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        VerticalAnchorable.m7470linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
    }
}
