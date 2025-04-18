package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import androidx.compose.runtime.internal.StabilityInferred;
import h0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PaywallSettingsConfig {
    public static final int $stable = 8;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    public PaywallSettingsConfig(@NotNull RemoteConfigService remoteConfigService) {
        a.s(remoteConfigService, "remoteConfigService");
        this.remoteConfigService = remoteConfigService;
    }

    @Nullable
    public final Object getNumberCodePaywall(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.NUMBER_CODE_PAYWALL, new Integer(3), gVar);
    }

    @Nullable
    public final Object getSubscriptionPolicyInfo(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.DIRECT_STORE_DESCRIPTION, "\nPremium Subscription:\n• Subscribed users have unlimited use of the app and access to all of its Premium features, without any ads.\n• Non-subscribed users can continuously use the app with advertisements, and have a limited daily quota for use of Premium features.\n• Users can subscribe to different plans: {FREE_TRIAL_TITLE} trial package - start {FREE_TRIAL_DURATION} free trial then {FREE_TRIAL_PRICE} per {FREE_TRIAL_PERIOD}, auto renew every {FREE_TRIAL_PERIOD}, {MONTHLY_TITLE} package - {MONTHLY_PRICE} per {MONTHLY_PERIOD}, auto renew every {MONTHLY_PERIOD}.\n• Alternatively, users can purchase the full app ({LIFETIME_TITLE}) for a one-time payment of {LIFETIME_PRICE}. All updates and new features are received\n• Payment will be charged to your Google Account at confirmation of purchase.\n• Subscriptions automatically renew unless auto-renew is disabled at least 24 hours before the end of the current period.\n• Account will be charged for renewal within 24-hour prior to the end of the current period and identify the cost of renewal.\n• Any unused portion of a free trial period, if offered, will be forfeited when the user purchases a subscription to that publication, where applicable.\n• Subscriptions may be managed by the user and auto-renewal may be turned off by going to the user's Account Settings after purchase. Note that uninstalling the app will not cancel your subscription.\n1. On your Android phone or tablet, open the Google Play Store\n2. Check if you're signed into the correct Google Account.\n3. Tap Menu Subscriptions.\n4. Select the subscription you want to cancel.\n5. Tap Cancel subscription.\n6. Follow the instructions.\n", gVar);
    }

    @Nullable
    public final Object getValueIsDirectStore(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_DIRECT_STORE, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getValueIsFreeYearly(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_FREE_YEARLY, Boolean.TRUE, gVar);
    }
}
