package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzdiv {

    @Nullable
    private zzbfv zza;

    public zzdiv(zzdig zzdigVar) {
        this.zza = zzdigVar;
    }

    @Nullable
    public final synchronized zzbfv zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbfv zzbfvVar) {
        this.zza = zzbfvVar;
    }
}
