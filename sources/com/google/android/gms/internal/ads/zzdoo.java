package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzdoo implements zzbki {
    private final zzcxt zza;

    @Nullable
    private final zzbwv zzb;
    private final String zzc;
    private final String zzd;

    public zzdoo(zzcxt zzcxtVar, zzfet zzfetVar) {
        this.zza = zzcxtVar;
        this.zzb = zzfetVar.zzl;
        this.zzc = zzfetVar.zzj;
        this.zzd = zzfetVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zza(zzbwv zzbwvVar) {
        int i10;
        String str;
        zzbwv zzbwvVar2 = this.zzb;
        if (zzbwvVar2 != null) {
            zzbwvVar = zzbwvVar2;
        }
        if (zzbwvVar != null) {
            str = zzbwvVar.zza;
            i10 = zzbwvVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzbwg(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzc() {
        this.zza.zzf();
    }
}
