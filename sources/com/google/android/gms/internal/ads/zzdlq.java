package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzdlq {

    @Nullable
    private zzbhs zza;

    public zzdlq(zzdlc zzdlcVar) {
        this.zza = zzdlcVar;
    }

    @Nullable
    public final synchronized zzbhs zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbhs zzbhsVar) {
        this.zza = zzbhsVar;
    }
}
