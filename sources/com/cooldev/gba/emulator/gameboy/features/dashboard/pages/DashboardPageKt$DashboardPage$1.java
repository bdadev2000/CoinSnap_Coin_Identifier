package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes.dex */
public final class DashboardPageKt$DashboardPage$1 extends r implements l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ OnboardingViewModel $onboardingViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$DashboardPage$1(HomeViewModel homeViewModel, Context context, Activity activity, OnboardingViewModel onboardingViewModel, UserGuideViewModel userGuideViewModel) {
        super(1);
        this.$homeViewModel = homeViewModel;
        this.$context = context;
        this.$activity = activity;
        this.$onboardingViewModel = onboardingViewModel;
        this.$userGuideViewModel = userGuideViewModel;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Uri) obj);
        return b0.f30125a;
    }

    public final void invoke(@Nullable Uri uri) {
        if (uri != null) {
            this.$homeViewModel.fetchGamesInFolder(uri, new DashboardPageKt$DashboardPage$1$1$1(this.$context, this.$activity, this.$onboardingViewModel, this.$userGuideViewModel));
        }
    }
}
