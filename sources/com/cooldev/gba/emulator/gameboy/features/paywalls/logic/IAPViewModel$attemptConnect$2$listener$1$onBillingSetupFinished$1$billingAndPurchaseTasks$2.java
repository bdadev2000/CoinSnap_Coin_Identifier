package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1$billingAndPurchaseTasks$2", f = "IAPViewModel.kt", l = {Opcodes.IF_ICMPEQ}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1$billingAndPurchaseTasks$2 extends i implements p {
    int label;
    final /* synthetic */ IAPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1$billingAndPurchaseTasks$2(IAPViewModel iAPViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = iAPViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1$billingAndPurchaseTasks$2(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1$billingAndPurchaseTasks$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object currentPurchased;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            IAPViewModel iAPViewModel = this.this$0;
            this.label = 1;
            currentPurchased = iAPViewModel.getCurrentPurchased(this);
            if (currentPurchased == aVar) {
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
