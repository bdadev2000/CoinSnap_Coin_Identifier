package com.cooldev.gba.emulator.gameboy.features.dashboard.widgets;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class NavigationBarPortraitKt$BannerAd$1 extends r implements l {
    final /* synthetic */ BannerAdViewModel $bannerAdsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarPortraitKt$BannerAd$1(BannerAdViewModel bannerAdViewModel) {
        super(1);
        this.$bannerAdsViewModel = bannerAdViewModel;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        this.$bannerAdsViewModel.retryGetBannerAdView();
        final BannerAdViewModel bannerAdViewModel = this.$bannerAdsViewModel;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.dashboard.widgets.NavigationBarPortraitKt$BannerAd$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                BannerAdViewModel.this.onCleared();
            }
        };
    }
}
