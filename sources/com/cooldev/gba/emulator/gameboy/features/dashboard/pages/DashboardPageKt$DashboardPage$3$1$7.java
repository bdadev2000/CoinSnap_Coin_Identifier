package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import android.app.Activity;
import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.GamePlayCounter;
import com.cooldev.gba.emulator.gameboy.local.storage.RewardAdCounter;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.RewardEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class DashboardPageKt$DashboardPage$3$1$7 extends r implements a {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ RewardedAdViewModel $rewardedAdViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.dashboard.pages.DashboardPageKt$DashboardPage$3$1$7$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements a {
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeViewModel $homeViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeViewModel homeViewModel, Context context) {
            super(0);
            this.$homeViewModel = homeViewModel;
            this.$context = context;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m132invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m132invoke() {
            this.$homeViewModel.showToast();
            RewardAdCounter rewardAdCounter = RewardAdCounter.INSTANCE;
            Context context = this.$context;
            rewardAdCounter.setRewardAdCounter(context, rewardAdCounter.getRewardAdCounter(context) + 1);
            GamePlayCounter.INSTANCE.setGamePlayCounter(this.$context, Math.max(0, r0.getGamePlayCounter(r1) - 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$DashboardPage$3$1$7(HomeViewModel homeViewModel, RewardedAdViewModel rewardedAdViewModel, Activity activity, Context context) {
        super(0);
        this.$homeViewModel = homeViewModel;
        this.$rewardedAdViewModel = rewardedAdViewModel;
        this.$activity = activity;
        this.$context = context;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m131invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m131invoke() {
        this.$homeViewModel.hidePopupOffReward2();
        RewardEvents.INSTANCE.logClickClaimReward();
        RewardedAdViewModel.showRewardedAd$default(this.$rewardedAdViewModel, this.$activity, new AnonymousClass1(this.$homeViewModel, this.$context), null, null, null, null, 60, null);
    }
}
