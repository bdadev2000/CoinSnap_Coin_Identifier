package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import androidx.compose.runtime.internal.StabilityInferred;
import h0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AdSettingsConfig {
    public static final int $stable = 8;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    public AdSettingsConfig(@NotNull RemoteConfigService remoteConfigService) {
        a.s(remoteConfigService, "remoteConfigService");
        this.remoteConfigService = remoteConfigService;
    }

    @Nullable
    public final Object getMaxInterstitialAdsCount(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.MAX_INTERSTITIAL_ADS_COUNT, new Long(5L), gVar);
    }

    @Nullable
    public final Object getMinInterstitialTimeBetweenAdsInSeconds(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.MIN_INTERSTITIAL_TIME_BETWEEN_ADS_IN_SECONDS, new Long(60L), gVar);
    }

    @Nullable
    public final Object getNumberRewardFree(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.NUMBER_REWARD_FREE, new Integer(3), gVar);
    }

    @Nullable
    public final Object getValueIsAppOpenAdEnabled(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.SHOW_APP_OPEN_AD_ON_START, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getValueIsBannerAdEnabled(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_BANNER_AD_ENABLED, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getValueIsBannerAdGameEnabled(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_BANNER_AD_GAME_ENABLED, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getValueIsInterstitialAdEnabled(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_INTERSTITIAL_AD_ENABLED, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getValueIsShowBannerOnboarding(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_SHOW_BANNER_ONBOARDING, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getValueIsShowRewardFree(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_SHOW_REWARD_FREE, Boolean.TRUE, gVar);
    }
}
