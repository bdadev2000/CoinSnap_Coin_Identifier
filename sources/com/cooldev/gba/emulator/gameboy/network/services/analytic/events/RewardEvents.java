package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class RewardEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_CLAIM_REWARD = "click_claim_reward";

    @NotNull
    private static final String CLICK_REWARD = "click_reward";

    @NotNull
    private static final String CLICK_REWARD_UPGRADE = "click_reward_upgrade";

    @NotNull
    public static final RewardEvents INSTANCE = new RewardEvents();

    @NotNull
    private static final String IS_NEW_FLOW_LIMIT_FREE = "is_new_flow_limit_free";

    @NotNull
    private static final String IS_NEW_FLOW_LIMIT_UPGRADE = "is_new_flow_limit_upgrade";

    @NotNull
    private static final String IS_SHOW_REWARD = "is_show_reward";

    @NotNull
    private static final String IS_SHOW_REWARD_UPGRADE = "is_show_reward_upgrade";

    private RewardEvents() {
    }

    public final void logClickClaimReward() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_CLAIM_REWARD, null, 2, null);
    }

    public final void logClickLimitedFree() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, IS_NEW_FLOW_LIMIT_UPGRADE, null, 2, null);
    }

    public final void logClickReward() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_REWARD, null, 2, null);
    }

    public final void logClickRewardUpgrade() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_REWARD_UPGRADE, null, 2, null);
    }

    public final void logShowLimitedFree() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, IS_NEW_FLOW_LIMIT_FREE, null, 2, null);
    }

    public final void logShowReward() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, IS_SHOW_REWARD, null, 2, null);
    }

    public final void logShowRewardUpgrade() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, IS_SHOW_REWARD_UPGRADE, null, 2, null);
    }
}
