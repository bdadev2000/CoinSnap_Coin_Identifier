package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class SkuDetailsResult {

    @NotNull
    private final BillingResult zza;

    @Nullable
    private final List zzb;

    public SkuDetailsResult(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends SkuDetails> list) {
        a.s(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ SkuDetailsResult copy$default(@RecentlyNonNull SkuDetailsResult skuDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i2, @RecentlyNonNull Object obj) {
        if ((i2 & 1) != 0) {
            billingResult = skuDetailsResult.zza;
        }
        if ((i2 & 2) != 0) {
            list = skuDetailsResult.zzb;
        }
        return skuDetailsResult.copy(billingResult, list);
    }

    @NotNull
    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<SkuDetails> component2() {
        return this.zzb;
    }

    @NotNull
    public final SkuDetailsResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends SkuDetails> list) {
        a.s(billingResult, "billingResult");
        return new SkuDetailsResult(billingResult, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetailsResult)) {
            return false;
        }
        SkuDetailsResult skuDetailsResult = (SkuDetailsResult) obj;
        return a.g(this.zza, skuDetailsResult.zza) && a.g(this.zzb, skuDetailsResult.zzb);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final List<SkuDetails> getSkuDetailsList() {
        return this.zzb;
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        List list = this.zzb;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "SkuDetailsResult(billingResult=" + this.zza + ", skuDetailsList=" + this.zzb + ")";
    }
}
