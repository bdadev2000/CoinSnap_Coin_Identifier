package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.page;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.RatingDialogEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class RatingDialogKt$RatingDialog$2$1$1$1$1$2 extends r implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ RatingDialogState $dialogRatingState;
    final /* synthetic */ boolean $isInBoarding;
    final /* synthetic */ OnboardingViewModel $onboardingViewModel;
    final /* synthetic */ RatingDialogViewModel $ratingDialogViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.page.RatingDialogKt$RatingDialog$2$1$1$1$1$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ Context $context;
        final /* synthetic */ RatingDialogState $dialogRatingState;
        final /* synthetic */ RatingDialogViewModel $ratingDialogViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RatingDialogViewModel ratingDialogViewModel, Context context, RatingDialogState ratingDialogState) {
            super(1);
            this.$ratingDialogViewModel = ratingDialogViewModel;
            this.$context = context;
            this.$dialogRatingState = ratingDialogState;
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return b0.f30125a;
        }

        public final void invoke(boolean z2) {
            this.$ratingDialogViewModel.onTapSubmitButton(this.$context, this.$dialogRatingState.getRating(), z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDialogKt$RatingDialog$2$1$1$1$1$2(OnboardingViewModel onboardingViewModel, boolean z2, RatingDialogViewModel ratingDialogViewModel, Context context, RatingDialogState ratingDialogState) {
        super(0);
        this.$onboardingViewModel = onboardingViewModel;
        this.$isInBoarding = z2;
        this.$ratingDialogViewModel = ratingDialogViewModel;
        this.$context = context;
        this.$dialogRatingState = ratingDialogState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m181invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m181invoke() {
        RatingDialogEvents.INSTANCE.logClickSubmitRatingDialog();
        this.$onboardingViewModel.hideRatingDialog(this.$isInBoarding, new AnonymousClass1(this.$ratingDialogViewModel, this.$context, this.$dialogRatingState));
    }
}
