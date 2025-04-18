package com.android.billingclient.api;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class AccountIdentifiers {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public AccountIdentifiers(@Nullable String str, @Nullable String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Nullable
    public String getObfuscatedAccountId() {
        return this.zza;
    }

    @Nullable
    public String getObfuscatedProfileId() {
        return this.zzb;
    }
}
