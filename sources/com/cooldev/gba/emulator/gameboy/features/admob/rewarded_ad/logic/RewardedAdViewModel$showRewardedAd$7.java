package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import android.content.Context;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class RewardedAdViewModel$showRewardedAd$7 extends r implements l {
    final /* synthetic */ l $onAdFailedToShow;
    final /* synthetic */ RewardedAdViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$showRewardedAd$7$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        @NotNull
        public final RewardedAdState invoke(@NotNull RewardedAdState rewardedAdState) {
            a.s(rewardedAdState, "it");
            return RewardedAdState.copy$default(rewardedAdState, false, false, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdViewModel$showRewardedAd$7(RewardedAdViewModel rewardedAdViewModel, l lVar) {
        super(1);
        this.this$0 = rewardedAdViewModel;
        this.$onAdFailedToShow = lVar;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        Context context;
        a.s(str, "error");
        this.this$0.updateState(AnonymousClass1.INSTANCE);
        this.$onAdFailedToShow.invoke(str);
        context = this.this$0.context;
        b0.a.b(context, "An error occurred while processing your request. Please try again.").show();
    }
}
