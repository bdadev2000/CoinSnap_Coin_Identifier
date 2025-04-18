package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public final class PurchasesResult {

    @NotNull
    private final BillingResult zza;

    @NotNull
    private final List zzb;

    public PurchasesResult(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> list) {
        a.s(billingResult, "billingResult");
        a.s(list, "purchasesList");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchasesResult copy$default(@RecentlyNonNull PurchasesResult purchasesResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i2, @RecentlyNonNull Object obj) {
        if ((i2 & 1) != 0) {
            billingResult = purchasesResult.zza;
        }
        if ((i2 & 2) != 0) {
            list = purchasesResult.zzb;
        }
        return purchasesResult.copy(billingResult, list);
    }

    @NotNull
    public final BillingResult component1() {
        return this.zza;
    }

    @NotNull
    public final List<Purchase> component2() {
        return this.zzb;
    }

    @NotNull
    public final PurchasesResult copy(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> list) {
        a.s(billingResult, "billingResult");
        a.s(list, "purchasesList");
        return new PurchasesResult(billingResult, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesResult)) {
            return false;
        }
        PurchasesResult purchasesResult = (PurchasesResult) obj;
        return a.g(this.zza, purchasesResult.zza) && a.g(this.zzb, purchasesResult.zzb);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @NotNull
    public final List<Purchase> getPurchasesList() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PurchasesResult(billingResult=" + this.zza + ", purchasesList=" + this.zzb + ")";
    }
}
