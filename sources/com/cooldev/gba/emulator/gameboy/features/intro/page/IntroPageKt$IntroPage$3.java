package com.cooldev.gba.emulator.gameboy.features.intro.page;

import androidx.compose.runtime.State;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppState;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.intro.page.IntroPageKt$IntroPage$3", f = "IntroPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IntroPageKt$IntroPage$3 extends i implements p {
    final /* synthetic */ AppState $appState;
    final /* synthetic */ State<Boolean> $isConnected$delegate;
    final /* synthetic */ boolean $isOnboardingVisible;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPageKt$IntroPage$3(boolean z2, AppState appState, PaywallNavigationViewModel paywallNavigationViewModel, State<Boolean> state, g gVar) {
        super(2, gVar);
        this.$isOnboardingVisible = z2;
        this.$appState = appState;
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
        this.$isConnected$delegate = state;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new IntroPageKt$IntroPage$3(this.$isOnboardingVisible, this.$appState, this.$paywallNavigationViewModel, this.$isConnected$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IntroPageKt$IntroPage$3) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean IntroPage$lambda$0;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        IntroPage$lambda$0 = IntroPageKt.IntroPage$lambda$0(this.$isConnected$delegate);
        if (!IntroPage$lambda$0) {
            IntroPageKt.navigateBasedOnAppState(this.$isOnboardingVisible, this.$appState.getShouldShowPurchase(), false, this.$paywallNavigationViewModel);
        }
        return b0.f30125a;
    }
}
