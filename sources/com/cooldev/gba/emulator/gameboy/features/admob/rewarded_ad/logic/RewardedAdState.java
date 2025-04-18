package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes2.dex */
public final class RewardedAdState {
    public static final int $stable = 8;
    private boolean isRewardedAdShowing;
    private boolean isShowAdsRewardedRemoteConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RewardedAdState() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdState.<init>():void");
    }

    public static /* synthetic */ RewardedAdState copy$default(RewardedAdState rewardedAdState, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = rewardedAdState.isShowAdsRewardedRemoteConfig;
        }
        if ((i2 & 2) != 0) {
            z3 = rewardedAdState.isRewardedAdShowing;
        }
        return rewardedAdState.copy(z2, z3);
    }

    public final boolean component1() {
        return this.isShowAdsRewardedRemoteConfig;
    }

    public final boolean component2() {
        return this.isRewardedAdShowing;
    }

    @NotNull
    public final RewardedAdState copy(boolean z2, boolean z3) {
        return new RewardedAdState(z2, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardedAdState)) {
            return false;
        }
        RewardedAdState rewardedAdState = (RewardedAdState) obj;
        return this.isShowAdsRewardedRemoteConfig == rewardedAdState.isShowAdsRewardedRemoteConfig && this.isRewardedAdShowing == rewardedAdState.isRewardedAdShowing;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRewardedAdShowing) + (Boolean.hashCode(this.isShowAdsRewardedRemoteConfig) * 31);
    }

    public final boolean isRewardedAdShowing() {
        return this.isRewardedAdShowing;
    }

    public final boolean isShowAdsRewardedRemoteConfig() {
        return this.isShowAdsRewardedRemoteConfig;
    }

    public final void setRewardedAdShowing(boolean z2) {
        this.isRewardedAdShowing = z2;
    }

    public final void setShowAdsRewardedRemoteConfig(boolean z2) {
        this.isShowAdsRewardedRemoteConfig = z2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RewardedAdState(isShowAdsRewardedRemoteConfig=");
        sb.append(this.isShowAdsRewardedRemoteConfig);
        sb.append(", isRewardedAdShowing=");
        return d.s(sb, this.isRewardedAdShowing, ')');
    }

    public RewardedAdState(boolean z2, boolean z3) {
        this.isShowAdsRewardedRemoteConfig = z2;
        this.isRewardedAdShowing = z3;
    }

    public /* synthetic */ RewardedAdState(boolean z2, boolean z3, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3);
    }
}
