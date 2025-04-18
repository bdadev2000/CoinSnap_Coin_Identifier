package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class QueryPurchasesParams {
    private final String zza;

    /* loaded from: classes4.dex */
    public static class Builder {
        private String zza;

        private Builder() {
        }

        public /* synthetic */ Builder(zzcn zzcnVar) {
        }

        @NonNull
        public QueryPurchasesParams build() {
            if (this.zza != null) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, zzco zzcoVar) {
        this.zza = builder.zza;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public final String zza() {
        return this.zza;
    }
}
