package com.cooldev.gba.emulator.gameboy.features.onboarding.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.onboarding.enums.OnboardingEnum;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class OnboardingState {
    public static final int $stable = 0;
    private final boolean isRatingOnboardingVisible;

    @NotNull
    private final OnboardingEnum onboardingTab;

    public OnboardingState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OnboardingState copy$default(OnboardingState onboardingState, OnboardingEnum onboardingEnum, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            onboardingEnum = onboardingState.onboardingTab;
        }
        if ((i2 & 2) != 0) {
            z2 = onboardingState.isRatingOnboardingVisible;
        }
        return onboardingState.copy(onboardingEnum, z2);
    }

    @NotNull
    public final OnboardingEnum component1() {
        return this.onboardingTab;
    }

    public final boolean component2() {
        return this.isRatingOnboardingVisible;
    }

    @NotNull
    public final OnboardingState copy(@NotNull OnboardingEnum onboardingEnum, boolean z2) {
        a.s(onboardingEnum, "onboardingTab");
        return new OnboardingState(onboardingEnum, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingState)) {
            return false;
        }
        OnboardingState onboardingState = (OnboardingState) obj;
        return this.onboardingTab == onboardingState.onboardingTab && this.isRatingOnboardingVisible == onboardingState.isRatingOnboardingVisible;
    }

    @NotNull
    public final OnboardingEnum getOnboardingTab() {
        return this.onboardingTab;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRatingOnboardingVisible) + (this.onboardingTab.hashCode() * 31);
    }

    public final boolean isRatingOnboardingVisible() {
        return this.isRatingOnboardingVisible;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnboardingState(onboardingTab=");
        sb.append(this.onboardingTab);
        sb.append(", isRatingOnboardingVisible=");
        return d.s(sb, this.isRatingOnboardingVisible, ')');
    }

    public OnboardingState(@NotNull OnboardingEnum onboardingEnum, boolean z2) {
        a.s(onboardingEnum, "onboardingTab");
        this.onboardingTab = onboardingEnum;
        this.isRatingOnboardingVisible = z2;
    }

    public /* synthetic */ OnboardingState(OnboardingEnum onboardingEnum, boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? OnboardingEnum.First : onboardingEnum, (i2 & 2) != 0 ? false : z2);
    }
}
