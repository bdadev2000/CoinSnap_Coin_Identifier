package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$retryConnectBillingClient$4", f = "IAPViewModel.kt", l = {Opcodes.LXOR, Opcodes.D2L}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IAPViewModel$retryConnectBillingClient$4 extends i implements p {
    final /* synthetic */ a $onFailure;
    final /* synthetic */ a $onSuccess;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ IAPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$retryConnectBillingClient$4(IAPViewModel iAPViewModel, a aVar, a aVar2, g gVar) {
        super(2, gVar);
        this.this$0 = iAPViewModel;
        this.$onSuccess = aVar;
        this.$onFailure = aVar2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new IAPViewModel$retryConnectBillingClient$4(this.this$0, this.$onSuccess, this.$onFailure, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IAPViewModel$retryConnectBillingClient$4) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:39|(3:40|41|42)|19|20|(2:22|23)|25|26|(1:28)(1:29)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, blocks: (B:20:0x0080, B:22:0x0088), top: B:19:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0127 -> B:6:0x0045). Please report as a decompilation issue!!! */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$retryConnectBillingClient$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
