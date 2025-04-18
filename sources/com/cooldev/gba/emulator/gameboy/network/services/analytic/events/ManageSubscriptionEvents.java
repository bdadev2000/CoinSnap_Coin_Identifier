package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ManageSubscriptionEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_VIEW_YOUR_PLAN_MANAGE_SUBSCRIPTION = "click_view_your_plan_manage_subscription";

    @NotNull
    public static final ManageSubscriptionEvents INSTANCE = new ManageSubscriptionEvents();

    private ManageSubscriptionEvents() {
    }

    public final void logClickViewYourPlanManageSubscription() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_VIEW_YOUR_PLAN_MANAGE_SUBSCRIPTION, null, 2, null);
    }
}
