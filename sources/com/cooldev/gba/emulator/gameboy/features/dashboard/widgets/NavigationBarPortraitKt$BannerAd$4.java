package com.cooldev.gba.emulator.gameboy.features.dashboard.widgets;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.page.BannerAdViewKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* loaded from: classes2.dex */
public final class NavigationBarPortraitKt$BannerAd$4 extends r implements q {
    final /* synthetic */ BannerAdState $bannerState;
    final /* synthetic */ IAPState $iapState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarPortraitKt$BannerAd$4(BannerAdState bannerAdState, IAPState iAPState) {
        super(3);
        this.$bannerState = bannerAdState;
        this.$iapState = iAPState;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer, int i2) {
        a.s(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (!this.$bannerState.getShouldShowBannerAd() || this.$iapState.isPremium()) {
            return;
        }
        BannerAdViewKt.BannerAdView(this.$bannerState.getAdView(), composer, 8);
    }
}
