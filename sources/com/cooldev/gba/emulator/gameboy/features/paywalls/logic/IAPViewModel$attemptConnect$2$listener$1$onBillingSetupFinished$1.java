package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import b1.d0;
import b1.f0;
import b1.k;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1", f = "IAPViewModel.kt", l = {Opcodes.IF_ICMPLT}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1 extends i implements p {
    final /* synthetic */ k $continuation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IAPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1(k kVar, IAPViewModel iAPViewModel, g gVar) {
        super(2, gVar);
        this.$continuation = kVar;
        this.this$0 = iAPViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1 iAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1 = new IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1(this.$continuation, this.this$0, gVar);
        iAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1.L$0 = obj;
        return iAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        try {
        } catch (Exception unused) {
            this.$continuation.resumeWith(Boolean.FALSE);
        }
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.L$0;
            if (this.$continuation.isActive()) {
                List v2 = f0.v(kotlin.jvm.internal.e.f(d0Var, null, new IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1$billingAndPurchaseTasks$1(this.this$0, null), 3), kotlin.jvm.internal.e.f(d0Var, null, new IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1$billingAndPurchaseTasks$2(this.this$0, null), 3));
                this.label = 1;
                if (p0.a.h(v2, this) == aVar) {
                    return aVar;
                }
            }
            return b0.f30125a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        this.$continuation.resumeWith(Boolean.TRUE);
        return b0.f30125a;
    }
}
