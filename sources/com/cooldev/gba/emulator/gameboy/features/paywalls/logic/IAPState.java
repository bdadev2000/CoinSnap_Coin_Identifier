package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.BillingEnum;
import com.cooldev.gba.emulator.gameboy.features.paywalls.utils.PurchaseUtil;
import e0.w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class IAPState {
    public static final int $stable = 8;

    @Nullable
    private final Purchase currentPurchase;
    private final boolean isFreeYearlyPurchaseVisible;
    private final boolean isPremium;

    @NotNull
    private final List<SkuDetails> listBilling;

    @Nullable
    private final PurchaseState purchaseState;

    public IAPState() {
        this(null, null, false, false, null, 31, null);
    }

    public static /* synthetic */ IAPState copy$default(IAPState iAPState, List list, PurchaseState purchaseState, boolean z2, boolean z3, Purchase purchase, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = iAPState.listBilling;
        }
        if ((i2 & 2) != 0) {
            purchaseState = iAPState.purchaseState;
        }
        PurchaseState purchaseState2 = purchaseState;
        if ((i2 & 4) != 0) {
            z2 = iAPState.isPremium;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            z3 = iAPState.isFreeYearlyPurchaseVisible;
        }
        boolean z5 = z3;
        if ((i2 & 16) != 0) {
            purchase = iAPState.currentPurchase;
        }
        return iAPState.copy(list, purchaseState2, z4, z5, purchase);
    }

    @NotNull
    public final List<SkuDetails> component1() {
        return this.listBilling;
    }

    @Nullable
    public final PurchaseState component2() {
        return this.purchaseState;
    }

    public final boolean component3() {
        return this.isPremium;
    }

    public final boolean component4() {
        return this.isFreeYearlyPurchaseVisible;
    }

    @Nullable
    public final Purchase component5() {
        return this.currentPurchase;
    }

    @NotNull
    public final IAPState copy(@NotNull List<? extends SkuDetails> list, @Nullable PurchaseState purchaseState, boolean z2, boolean z3, @Nullable Purchase purchase) {
        a.s(list, "listBilling");
        return new IAPState(list, purchaseState, z2, z3, purchase);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IAPState)) {
            return false;
        }
        IAPState iAPState = (IAPState) obj;
        return a.g(this.listBilling, iAPState.listBilling) && a.g(this.purchaseState, iAPState.purchaseState) && this.isPremium == iAPState.isPremium && this.isFreeYearlyPurchaseVisible == iAPState.isFreeYearlyPurchaseVisible && a.g(this.currentPurchase, iAPState.currentPurchase);
    }

    @Nullable
    public final SkuDetails findSkuDetailsBySkuId(@NotNull BillingEnum billingEnum) {
        Object obj;
        a.s(billingEnum, "data");
        Iterator<T> it = this.listBilling.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (a.g(((SkuDetails) obj).getSku(), billingEnum.getSkuId())) {
                break;
            }
        }
        return (SkuDetails) obj;
    }

    @NotNull
    public final List<SkuDetails> getBillings() {
        return PurchaseUtil.INSTANCE.removeDuplicatesByProductId(this.listBilling);
    }

    @Nullable
    public final Purchase getCurrentPurchase() {
        return this.currentPurchase;
    }

    @NotNull
    public final List<SkuDetails> getListBilling() {
        return this.listBilling;
    }

    @Nullable
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public int hashCode() {
        int hashCode = this.listBilling.hashCode() * 31;
        PurchaseState purchaseState = this.purchaseState;
        int g2 = d.g(this.isFreeYearlyPurchaseVisible, d.g(this.isPremium, (hashCode + (purchaseState == null ? 0 : purchaseState.hashCode())) * 31, 31), 31);
        Purchase purchase = this.currentPurchase;
        return g2 + (purchase != null ? purchase.hashCode() : 0);
    }

    public final boolean isFreeYearlyPurchaseVisible() {
        return this.isFreeYearlyPurchaseVisible;
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    @NotNull
    public String toString() {
        return "IAPState(listBilling=" + this.listBilling + ", purchaseState=" + this.purchaseState + ", isPremium=" + this.isPremium + ", isFreeYearlyPurchaseVisible=" + this.isFreeYearlyPurchaseVisible + ", currentPurchase=" + this.currentPurchase + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IAPState(@NotNull List<? extends SkuDetails> list, @Nullable PurchaseState purchaseState, boolean z2, boolean z3, @Nullable Purchase purchase) {
        a.s(list, "listBilling");
        this.listBilling = list;
        this.purchaseState = purchaseState;
        this.isPremium = z2;
        this.isFreeYearlyPurchaseVisible = z3;
        this.currentPurchase = purchase;
    }

    public /* synthetic */ IAPState(List list, PurchaseState purchaseState, boolean z2, boolean z3, Purchase purchase, int i2, k kVar) {
        this((i2 & 1) != 0 ? w.f30218a : list, (i2 & 2) != 0 ? null : purchaseState, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) == 0 ? purchase : null);
    }
}
