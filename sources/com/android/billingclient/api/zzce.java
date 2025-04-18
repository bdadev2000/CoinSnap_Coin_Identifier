package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzce {

    @Nullable
    private final List zza;
    private final BillingResult zzb;

    public zzce(BillingResult billingResult, @Nullable List list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    public final BillingResult zza() {
        return this.zzb;
    }

    @Nullable
    public final List zzb() {
        return this.zza;
    }
}
