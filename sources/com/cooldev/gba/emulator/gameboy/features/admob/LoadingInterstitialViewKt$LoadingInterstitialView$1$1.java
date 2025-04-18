package com.cooldev.gba.emulator.gameboy.features.admob;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import b1.d0;
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

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.LoadingInterstitialViewKt$LoadingInterstitialView$1$1", f = "LoadingInterstitialView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LoadingInterstitialViewKt$LoadingInterstitialView$1$1 extends i implements p {
    final /* synthetic */ State<InterstitialAdState> $interstitialAdState$delegate;
    final /* synthetic */ MutableState<Boolean> $isInterAdShowed$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingInterstitialViewKt$LoadingInterstitialView$1$1(State<InterstitialAdState> state, MutableState<Boolean> mutableState, g gVar) {
        super(2, gVar);
        this.$interstitialAdState$delegate = state;
        this.$isInterAdShowed$delegate = mutableState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new LoadingInterstitialViewKt$LoadingInterstitialView$1$1(this.$interstitialAdState$delegate, this.$isInterAdShowed$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((LoadingInterstitialViewKt$LoadingInterstitialView$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InterstitialAdState LoadingInterstitialView$lambda$3;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        MutableState<Boolean> mutableState = this.$isInterAdShowed$delegate;
        LoadingInterstitialView$lambda$3 = LoadingInterstitialViewKt.LoadingInterstitialView$lambda$3(this.$interstitialAdState$delegate);
        LoadingInterstitialViewKt.LoadingInterstitialView$lambda$2(mutableState, LoadingInterstitialView$lambda$3.getLoadingInterstitialAd());
        return b0.f30125a;
    }
}
