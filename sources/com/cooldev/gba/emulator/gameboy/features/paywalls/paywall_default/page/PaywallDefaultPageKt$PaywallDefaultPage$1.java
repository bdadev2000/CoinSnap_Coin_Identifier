package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.page;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.TypeReference;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.page.PaywallDefaultPageKt$PaywallDefaultPage$1", f = "PaywallDefaultPage.kt", l = {TypeReference.NEW}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaywallDefaultPageKt$PaywallDefaultPage$1 extends i implements p {
    final /* synthetic */ IAPViewModel $iapViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDefaultPageKt$PaywallDefaultPage$1(IAPViewModel iAPViewModel, g gVar) {
        super(2, gVar);
        this.$iapViewModel = iAPViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new PaywallDefaultPageKt$PaywallDefaultPage$1(this.$iapViewModel, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((PaywallDefaultPageKt$PaywallDefaultPage$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            IAPViewModel iAPViewModel = this.$iapViewModel;
            this.label = 1;
            if (IAPViewModel.retryConnectBillingClient$default(iAPViewModel, null, null, this, 3, null) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
