package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class zzdkm {

    @Nullable
    private zzbfz zza;

    public zzdkm(zzdjx zzdjxVar) {
        this.zza = zzdjxVar;
    }

    @Nullable
    public final synchronized zzbfz zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbfz zzbfzVar) {
        this.zza = zzbfzVar;
    }
}
