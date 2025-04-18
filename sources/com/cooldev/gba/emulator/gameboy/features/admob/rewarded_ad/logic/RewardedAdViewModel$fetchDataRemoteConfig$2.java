package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class RewardedAdViewModel$fetchDataRemoteConfig$2 extends r implements l {
    final /* synthetic */ boolean $isShowAdsRewarded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdViewModel$fetchDataRemoteConfig$2(boolean z2) {
        super(1);
        this.$isShowAdsRewarded = z2;
    }

    @Override // q0.l
    @NotNull
    public final RewardedAdState invoke(@NotNull RewardedAdState rewardedAdState) {
        a.s(rewardedAdState, "it");
        return RewardedAdState.copy$default(rewardedAdState, this.$isShowAdsRewarded, false, 2, null);
    }
}
