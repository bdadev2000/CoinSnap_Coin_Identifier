package com.cooldev.gba.emulator.gameboy.features.onboarding.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.onboarding.enums.OnboardingEnum;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes2.dex */
public final class StepOnboardingWidgetKt$ItemStepOnboarding$1 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ OnboardingEnum $tab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepOnboardingWidgetKt$ItemStepOnboarding$1(OnboardingEnum onboardingEnum, int i2) {
        super(2);
        this.$tab = onboardingEnum;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        StepOnboardingWidgetKt.ItemStepOnboarding(this.$tab, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
