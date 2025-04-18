package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class RemoteConfigDefaults {
    public static final int $stable = 0;
    public static final boolean DEFAULT_CONFIG_IN_APP_UPDATE_MODE = false;

    @NotNull
    public static final String DEFAULT_DIRECT_STORE_DESCRIPTION = "\nPremium Subscription:\n• Subscribed users have unlimited use of the app and access to all of its Premium features, without any ads.\n• Non-subscribed users can continuously use the app with advertisements, and have a limited daily quota for use of Premium features.\n• Users can subscribe to different plans: {FREE_TRIAL_TITLE} trial package - start {FREE_TRIAL_DURATION} free trial then {FREE_TRIAL_PRICE} per {FREE_TRIAL_PERIOD}, auto renew every {FREE_TRIAL_PERIOD}, {MONTHLY_TITLE} package - {MONTHLY_PRICE} per {MONTHLY_PERIOD}, auto renew every {MONTHLY_PERIOD}.\n• Alternatively, users can purchase the full app ({LIFETIME_TITLE}) for a one-time payment of {LIFETIME_PRICE}. All updates and new features are received\n• Payment will be charged to your Google Account at confirmation of purchase.\n• Subscriptions automatically renew unless auto-renew is disabled at least 24 hours before the end of the current period.\n• Account will be charged for renewal within 24-hour prior to the end of the current period and identify the cost of renewal.\n• Any unused portion of a free trial period, if offered, will be forfeited when the user purchases a subscription to that publication, where applicable.\n• Subscriptions may be managed by the user and auto-renewal may be turned off by going to the user's Account Settings after purchase. Note that uninstalling the app will not cancel your subscription.\n1. On your Android phone or tablet, open the Google Play Store\n2. Check if you're signed into the correct Google Account.\n3. Tap Menu Subscriptions.\n4. Select the subscription you want to cancel.\n5. Tap Cancel subscription.\n6. Follow the instructions.\n";
    public static final int DEFAULT_FREE_PLAY_GAME = 2;
    public static final boolean DEFAULT_IS_BANNER_AD_ENABLED = true;
    public static final boolean DEFAULT_IS_BANNER_AD_GAME_ENABLED = true;
    public static final boolean DEFAULT_IS_DIRECT_STORE = true;
    public static final boolean DEFAULT_IS_FIRST_OPEN = true;
    public static final boolean DEFAULT_IS_FREE_YEARLY = true;
    public static final boolean DEFAULT_IS_INTERSTITIAL_AD_ENABLED = true;
    public static final boolean DEFAULT_IS_SHOW_ADD_GAME_NEW_FLOW = true;
    public static final boolean DEFAULT_IS_SHOW_BANNER_ONBOARDING = true;
    public static final boolean DEFAULT_IS_SHOW_RATING_ONBOARDING = true;
    public static final boolean DEFAULT_IS_SHOW_REWARD_FREE = true;
    public static final int DEFAULT_LIMIT_ADD_GAME = 3;
    public static final int DEFAULT_LIMIT_PLAY_GAME = 3;
    public static final long DEFAULT_MAX_INTERSTITIAL_ADS_COUNT = 5;
    public static final long DEFAULT_MIN_INTERSTITIAL_TIME_BETWEEN_ADS_IN_SECONDS = 60;
    public static final int DEFAULT_NUMBER_CODE_PAYWALL = 3;
    public static final int DEFAULT_NUMBER_REWARD_FREE = 3;
    public static final boolean DEFAULT_SHOW_APP_OPEN_AD_ON_START = true;

    @NotNull
    public static final RemoteConfigDefaults INSTANCE = new RemoteConfigDefaults();

    private RemoteConfigDefaults() {
    }
}
