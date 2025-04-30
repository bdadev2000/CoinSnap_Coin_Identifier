package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzbka {
    private final com.google.android.gms.ads.formats.zzg zza;

    @Nullable
    private final com.google.android.gms.ads.formats.zzf zzb;

    @Nullable
    private zzbiq zzc;

    public zzbka(com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    public final synchronized zzbiq zzf(zzbip zzbipVar) {
        zzbiq zzbiqVar = this.zzc;
        if (zzbiqVar != null) {
            return zzbiqVar;
        }
        zzbiq zzbiqVar2 = new zzbiq(zzbipVar);
        this.zzc = zzbiqVar2;
        return zzbiqVar2;
    }

    @Nullable
    public final zzbiz zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbjx(this, null);
    }

    public final zzbjc zzd() {
        return new zzbjz(this, null);
    }
}
