package com.cooldev.gba.emulator.gameboy.features.onboarding.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class OnboardingViewModel$hideRatingDialog$1 extends r implements l {
    public static final OnboardingViewModel$hideRatingDialog$1 INSTANCE = new OnboardingViewModel$hideRatingDialog$1();

    public OnboardingViewModel$hideRatingDialog$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final OnboardingState invoke(@NotNull OnboardingState onboardingState) {
        a.s(onboardingState, "it");
        return OnboardingState.copy$default(onboardingState, null, false, 1, null);
    }
}
