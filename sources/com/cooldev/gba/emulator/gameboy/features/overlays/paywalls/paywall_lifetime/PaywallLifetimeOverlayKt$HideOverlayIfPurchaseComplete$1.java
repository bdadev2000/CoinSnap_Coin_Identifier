package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_lifetime;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_lifetime.PaywallLifetimeOverlayKt$HideOverlayIfPurchaseComplete$1", f = "PaywallLifetimeOverlay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaywallLifetimeOverlayKt$HideOverlayIfPurchaseComplete$1 extends i implements p {
    final /* synthetic */ boolean $premiumAccount;
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallLifetimeOverlayKt$HideOverlayIfPurchaseComplete$1(boolean z2, PurchaseOverlayViewModel purchaseOverlayViewModel, g gVar) {
        super(2, gVar);
        this.$premiumAccount = z2;
        this.$purchaseOverlayViewModel = purchaseOverlayViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new PaywallLifetimeOverlayKt$HideOverlayIfPurchaseComplete$1(this.$premiumAccount, this.$purchaseOverlayViewModel, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((PaywallLifetimeOverlayKt$HideOverlayIfPurchaseComplete$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
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
            this.$purchaseOverlayViewModel.hideOverlay();
        }
        return b0.f30125a;
    }
}
