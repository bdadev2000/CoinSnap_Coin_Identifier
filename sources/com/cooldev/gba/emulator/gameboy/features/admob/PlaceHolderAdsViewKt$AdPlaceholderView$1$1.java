package com.cooldev.gba.emulator.gameboy.features.admob;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdState;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.PlaceHolderAdsViewKt$AdPlaceholderView$1$1", f = "PlaceHolderAdsView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PlaceHolderAdsViewKt$AdPlaceholderView$1$1 extends i implements p {
    final /* synthetic */ State<AppOpenAdState> $appOpenAdState$delegate;
    final /* synthetic */ State<InterstitialAdState> $interstitialAdState$delegate;
    final /* synthetic */ MutableState<Boolean> $isAdsShowed$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceHolderAdsViewKt$AdPlaceholderView$1$1(State<AppOpenAdState> state, State<InterstitialAdState> state2, MutableState<Boolean> mutableState, g gVar) {
        super(2, gVar);
        this.$appOpenAdState$delegate = state;
        this.$interstitialAdState$delegate = state2;
        this.$isAdsShowed$delegate = mutableState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new PlaceHolderAdsViewKt$AdPlaceholderView$1$1(this.$appOpenAdState$delegate, this.$interstitialAdState$delegate, this.$isAdsShowed$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((PlaceHolderAdsViewKt$AdPlaceholderView$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AppOpenAdState AdPlaceholderView$lambda$0;
        boolean z2;
        InterstitialAdState AdPlaceholderView$lambda$1;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        MutableState<Boolean> mutableState = this.$isAdsShowed$delegate;
        AdPlaceholderView$lambda$0 = PlaceHolderAdsViewKt.AdPlaceholderView$lambda$0(this.$appOpenAdState$delegate);
        if (!AdPlaceholderView$lambda$0.isAppOpenAdShowing()) {
            AdPlaceholderView$lambda$1 = PlaceHolderAdsViewKt.AdPlaceholderView$lambda$1(this.$interstitialAdState$delegate);
            if (!AdPlaceholderView$lambda$1.isInterstitialAdShowing()) {
                z2 = false;
                PlaceHolderAdsViewKt.AdPlaceholderView$lambda$4(mutableState, z2);
                return b0.f30125a;
            }
        }
        z2 = true;
        PlaceHolderAdsViewKt.AdPlaceholderView$lambda$4(mutableState, z2);
        return b0.f30125a;
    }
}
