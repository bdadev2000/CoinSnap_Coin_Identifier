package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import b1.d0;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientKotlinKt;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchaseState;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$handlePurchase$2", f = "IAPViewModel.kt", l = {333}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IAPViewModel$handlePurchase$2 extends i implements p {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ b0 $responseCode;
    int label;
    final /* synthetic */ IAPViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$handlePurchase$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ Purchase $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Purchase purchase) {
            super(1);
            this.$purchase = purchase;
        }

        @Override // q0.l
        @NotNull
        public final IAPState invoke(@NotNull IAPState iAPState) {
            a.s(iAPState, "it");
            return IAPState.copy$default(iAPState, null, null, false, false, this.$purchase, 15, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$handlePurchase$2(IAPViewModel iAPViewModel, Purchase purchase, b0 b0Var, g gVar) {
        super(2, gVar);
        this.this$0 = iAPViewModel;
        this.$purchase = purchase;
        this.$responseCode = b0Var;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new IAPViewModel$handlePurchase$2(this.this$0, this.$purchase, this.$responseCode, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IAPViewModel$handlePurchase$2) create(d0Var, gVar)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        boolean z2 = true;
        if (i2 == 0) {
            q.m(obj);
            BillingClient billingClient = this.this$0.billingClient;
            AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(this.$purchase.getPurchaseToken()).build();
            a.r(build, "build(...)");
            this.label = 1;
            obj = BillingClientKotlinKt.acknowledgePurchase(billingClient, build, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        b0 b0Var = this.$responseCode;
        if (((BillingResult) obj).getResponseCode() == 0) {
            this.this$0.updatePurchaseState(PurchaseState.PurchasedAndAcknowledged.INSTANCE);
            this.this$0.updateState(new AnonymousClass1(this.$purchase));
        } else {
            this.this$0.updatePurchaseState(PurchaseState.Purchased.INSTANCE);
            z2 = false;
        }
        b0Var.f30919a = z2;
        return d0.b0.f30125a;
    }
}
