package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets;

import androidx.compose.runtime.MutableState;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets.ClosePaywallYearlyNonTrialKt$CloseIconPaywallYearlyNonTrial$1$1", f = "ClosePaywallYearlyNonTrial.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClosePaywallYearlyNonTrialKt$CloseIconPaywallYearlyNonTrial$1$1 extends i implements p {
    final /* synthetic */ MutableState<Boolean> $closeButtonVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosePaywallYearlyNonTrialKt$CloseIconPaywallYearlyNonTrial$1$1(MutableState<Boolean> mutableState, g gVar) {
        super(2, gVar);
        this.$closeButtonVisible$delegate = mutableState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new ClosePaywallYearlyNonTrialKt$CloseIconPaywallYearlyNonTrial$1$1(this.$closeButtonVisible$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((ClosePaywallYearlyNonTrialKt$CloseIconPaywallYearlyNonTrial$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            this.label = 1;
            if (p0.a.L(0L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        ClosePaywallYearlyNonTrialKt.CloseIconPaywallYearlyNonTrial$lambda$2(this.$closeButtonVisible$delegate, true);
        return b0.f30125a;
    }
}
