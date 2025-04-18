package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager;

import com.google.android.gms.ads.rewarded.RewardItem;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class RewardedAdManager$showAd$5 extends r implements l {
    public static final RewardedAdManager$showAd$5 INSTANCE = new RewardedAdManager$showAd$5();

    public RewardedAdManager$showAd$5() {
        super(1);
    }

    public final void invoke(@NotNull RewardItem rewardItem) {
        p0.a.s(rewardItem, "it");
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RewardItem) obj);
        return b0.f30125a;
    }
}
