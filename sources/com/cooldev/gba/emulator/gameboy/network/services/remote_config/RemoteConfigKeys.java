package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes2.dex */
public final class RemoteConfigKeys {
    public static final int $stable = 0;

    @NotNull
    public static final String CONFIG_IN_APP_UPDATE_MODE = "config_in_app_update_mode";

    @NotNull
    public static final String DIRECT_STORE_DESCRIPTION = "subscriptionPolicyInfo";

    @NotNull
    public static final String FREE_PLAY_GAME = "number_free_new_flow";

    @NotNull
    public static final RemoteConfigKeys INSTANCE = new RemoteConfigKeys();

    @NotNull
    public static final String IS_BANNER_AD_ENABLED = "is_banner_ad_enabled";

    @NotNull
    public static final String IS_BANNER_AD_GAME_ENABLED = "is_banner_play_game";

    @NotNull
    public static final String IS_DIRECT_STORE = "is_direct_store";

    @NotNull
    public static final String IS_FIRST_OPEN_ONBOARDING = "is_rating_inapp";

    @NotNull
    public static final String IS_FREE_YEARLY = "isFreeYearly";

    @NotNull
    public static final String IS_INTERSTITIAL_AD_ENABLED = "is_interstitial_ad_enabled";

    @NotNull
    public static final String IS_SHOW_ADD_GAME_NEW_FLOW = "is_show_add_game_new_flow";

    @NotNull
    public static final String IS_SHOW_BANNER_ONBOARDING = "is_show_banner_onboarding";

    @NotNull
    public static final String IS_SHOW_RATING_ONBOARDING = "is_show_rating_onboarding";

    @NotNull
    public static final String IS_SHOW_REWARD_FREE = "is_show_reward_free";

    @NotNull
    public static final String LIMIT_ADD_GAME = "limit_add_game";

    @NotNull
    public static final String LIMIT_PLAY_GAME = "limit_play_game";

    @NotNull
    public static final String MAX_INTERSTITIAL_ADS_COUNT = "max_interstitial_ads_count";

    @NotNull
    public static final String MIN_INTERSTITIAL_TIME_BETWEEN_ADS_IN_SECONDS = "min_interstitial_time_between_ads_in_seconds";

    @NotNull
    public static final String NUMBER_CODE_PAYWALL = "number_code_paywall";

    @NotNull
    public static final String NUMBER_REWARD_FREE = "is_number_reward_free";

    @NotNull
    public static final String SHOW_APP_OPEN_AD_ON_START = "show_app_open_ad_on_start";

    private RemoteConfigKeys() {
    }
}
