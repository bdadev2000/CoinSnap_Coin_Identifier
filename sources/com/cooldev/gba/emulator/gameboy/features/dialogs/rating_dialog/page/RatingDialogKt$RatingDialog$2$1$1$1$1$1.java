package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.page;

import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.RatingDialogEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class RatingDialogKt$RatingDialog$2$1$1$1$1$1 extends r implements a {
    final /* synthetic */ boolean $isInBoarding;
    final /* synthetic */ OnboardingViewModel $onboardingViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.page.RatingDialogKt$RatingDialog$2$1$1$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(boolean z2) {
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDialogKt$RatingDialog$2$1$1$1$1$1(OnboardingViewModel onboardingViewModel, boolean z2) {
        super(0);
        this.$onboardingViewModel = onboardingViewModel;
        this.$isInBoarding = z2;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m180invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m180invoke() {
        RatingDialogEvents.INSTANCE.logClickCancelRatingDialog();
        this.$onboardingViewModel.hideRatingDialog(this.$isInBoarding, AnonymousClass1.INSTANCE);
    }
}
