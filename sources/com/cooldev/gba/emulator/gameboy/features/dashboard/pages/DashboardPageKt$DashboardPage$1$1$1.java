package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import android.app.Activity;
import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.in_app_review.InAppReviewManager;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class DashboardPageKt$DashboardPage$1$1$1 extends r implements a {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ OnboardingViewModel $onboardingViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$DashboardPage$1$1$1(Context context, Activity activity, OnboardingViewModel onboardingViewModel, UserGuideViewModel userGuideViewModel) {
        super(0);
        this.$context = context;
        this.$activity = activity;
        this.$onboardingViewModel = onboardingViewModel;
        this.$userGuideViewModel = userGuideViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m125invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m125invoke() {
        new InAppReviewManager(this.$context).startInAppReview(this.$activity);
        this.$onboardingViewModel.firstlyAddGame(this.$activity);
        this.$userGuideViewModel.moveToNextGuide();
    }
}
