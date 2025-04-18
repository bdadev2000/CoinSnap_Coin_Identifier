package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$waitForPurchaseLoading$2", f = "IAPViewModel.kt", l = {Opcodes.DASTORE, Opcodes.BASTORE, Opcodes.CASTORE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IAPViewModel$waitForPurchaseLoading$2 extends i implements p {
    int label;
    final /* synthetic */ IAPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$waitForPurchaseLoading$2(IAPViewModel iAPViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = iAPViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new IAPViewModel$waitForPurchaseLoading$2(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IAPViewModel$waitForPurchaseLoading$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058 A[PHI: r6
      0x0058: PHI (r6v12 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x0055, B:6:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.jvm.internal.q.m(r6)
            goto L58
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.jvm.internal.q.m(r6)
            goto L47
        L1f:
            kotlin.jvm.internal.q.m(r6)
            goto L31
        L23:
            kotlin.jvm.internal.q.m(r6)
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel r6 = r5.this$0
            r5.label = r4
            java.lang.Object r6 = com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.access$fetchDataRemoteConfig(r6, r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel r6 = r5.this$0
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.access$connectToPlayBillingService(r6)
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel r6 = r5.this$0
            b1.r r6 = com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.access$getBillingClientReady$p(r6)
            r5.label = r3
            b1.s r6 = (b1.s) r6
            java.lang.Object r6 = r6.t(r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel r6 = r5.this$0
            b1.r r6 = com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.access$isPremiumDeferred$p(r6)
            r5.label = r2
            b1.s r6 = (b1.s) r6
            java.lang.Object r6 = r6.t(r5)
            if (r6 != r0) goto L58
            return r0
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$waitForPurchaseLoading$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
