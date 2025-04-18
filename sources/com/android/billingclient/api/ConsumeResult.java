package com.android.billingclient.api;

import android.support.v4.media.d;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class ConsumeResult {

    @NotNull
    private final BillingResult zza;

    @Nullable
    private final String zzb;

    public ConsumeResult(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        a.s(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = str;
    }

    @RecentlyNonNull
    public static /* synthetic */ ConsumeResult copy$default(@RecentlyNonNull ConsumeResult consumeResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str, int i2, @RecentlyNonNull Object obj) {
        if ((i2 & 1) != 0) {
            billingResult = consumeResult.zza;
        }
        if ((i2 & 2) != 0) {
            str = consumeResult.zzb;
        }
        return consumeResult.copy(billingResult, str);
    }

    @NotNull
    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNullable
    public final String component2() {
        return this.zzb;
    }

    @NotNull
    public final ConsumeResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        a.s(billingResult, "billingResult");
        return new ConsumeResult(billingResult, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumeResult)) {
            return false;
        }
        ConsumeResult consumeResult = (ConsumeResult) obj;
        return a.g(this.zza, consumeResult.zza) && a.g(this.zzb, consumeResult.zzb);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNullable
    public final String getPurchaseToken() {
        return this.zzb;
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ConsumeResult(billingResult=");
        sb.append(this.zza);
        sb.append(", purchaseToken=");
        return d.r(sb, this.zzb, ")");
    }
}
