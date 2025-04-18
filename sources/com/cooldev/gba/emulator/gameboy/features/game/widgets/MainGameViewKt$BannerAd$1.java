package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MainGameViewKt$BannerAd$1 extends r implements l {
    final /* synthetic */ BannerAdGameViewModel $bannerAdGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainGameViewKt$BannerAd$1(BannerAdGameViewModel bannerAdGameViewModel) {
        super(1);
        this.$bannerAdGameViewModel = bannerAdGameViewModel;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        this.$bannerAdGameViewModel.retryGetBannerAdView();
        final BannerAdGameViewModel bannerAdGameViewModel = this.$bannerAdGameViewModel;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.game.widgets.MainGameViewKt$BannerAd$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                BannerAdGameViewModel.this.onCleared();
            }
        };
    }
}
