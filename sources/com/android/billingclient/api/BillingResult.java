package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.compose.foundation.text.input.a;

/* loaded from: classes2.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    /* loaded from: classes2.dex */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i2) {
            this.zza = i2;
            return this;
        }

        public /* synthetic */ Builder(zzbj zzbjVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    @NonNull
    public String toString() {
        return a.l("Response Code: ", com.google.android.gms.internal.play_billing.zzb.zzh(this.zza), ", Debug Message: ", this.zzb);
    }
}
