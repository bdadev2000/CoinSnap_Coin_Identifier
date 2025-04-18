package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public final class PurchaseHistoryResult {

    @NotNull
    private final BillingResult zza;

    @Nullable
    private final List zzb;

    public PurchaseHistoryResult(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> list) {
        a.s(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchaseHistoryResult copy$default(@RecentlyNonNull PurchaseHistoryResult purchaseHistoryResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i2, @RecentlyNonNull Object obj) {
        if ((i2 & 1) != 0) {
            billingResult = purchaseHistoryResult.zza;
        }
        if ((i2 & 2) != 0) {
            list = purchaseHistoryResult.zzb;
        }
        return purchaseHistoryResult.copy(billingResult, list);
    }

    @NotNull
    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> component2() {
        return this.zzb;
    }

    @NotNull
    public final PurchaseHistoryResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> list) {
        a.s(billingResult, "billingResult");
        return new PurchaseHistoryResult(billingResult, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryResult)) {
            return false;
        }
        PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) obj;
        return a.g(this.zza, purchaseHistoryResult.zza) && a.g(this.zzb, purchaseHistoryResult.zzb);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> getPurchaseHistoryRecordList() {
        return this.zzb;
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        List list = this.zzb;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.zza + ", purchaseHistoryRecordList=" + this.zzb + ")";
    }
}
