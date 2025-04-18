package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_weekly_non_trial.page;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_weekly_non_trial.page.PaywallWeeklyNonTrialPageKt$NavigateUpIfPurchaseComplete$1$1", f = "PaywallWeeklyNonTrialPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PaywallWeeklyNonTrialPageKt$NavigateUpIfPurchaseComplete$1$1 extends i implements p {
    final /* synthetic */ boolean $premiumAccount;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallWeeklyNonTrialPageKt$NavigateUpIfPurchaseComplete$1$1(boolean z2, g gVar) {
        super(2, gVar);
        this.$premiumAccount = z2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new PaywallWeeklyNonTrialPageKt$NavigateUpIfPurchaseComplete$1$1(this.$premiumAccount, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((PaywallWeeklyNonTrialPageKt$NavigateUpIfPurchaseComplete$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        if (this.$premiumAccount) {
            MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
        }
        return b0.f30125a;
    }
}
