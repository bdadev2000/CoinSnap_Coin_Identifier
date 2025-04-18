package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzbih {
    private final com.google.android.gms.ads.formats.zzg zza;

    @Nullable
    private final com.google.android.gms.ads.formats.zzf zzb;

    @Nullable
    @GuardedBy
    private zzbgx zzc;

    public zzbih(com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.formats.zzf zza(zzbih zzbihVar) {
        return zzbihVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzbgx zze(zzbih zzbihVar, zzbgw zzbgwVar) {
        return zzbihVar.zzf(zzbgwVar);
    }

    public final synchronized zzbgx zzf(zzbgw zzbgwVar) {
        zzbgx zzbgxVar = this.zzc;
        if (zzbgxVar != null) {
            return zzbgxVar;
        }
        zzbgx zzbgxVar2 = new zzbgx(zzbgwVar);
        this.zzc = zzbgxVar2;
        return zzbgxVar2;
    }

    @Nullable
    public final zzbhg zzc() {
        zzbid zzbidVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbie(this, zzbidVar);
    }

    public final zzbhj zzd() {
        return new zzbig(this, null);
    }
}
