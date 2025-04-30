package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzdre implements zzbmg {
    private final zzdas zza;

    @Nullable
    private final zzbyt zzb;
    private final String zzc;
    private final String zzd;

    public zzdre(zzdas zzdasVar, zzfgt zzfgtVar) {
        this.zza = zzdasVar;
        this.zzb = zzfgtVar.zzm;
        this.zzc = zzfgtVar.zzk;
        this.zzd = zzfgtVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zza(zzbyt zzbytVar) {
        int i9;
        String str;
        zzbyt zzbytVar2 = this.zzb;
        if (zzbytVar2 != null) {
            zzbytVar = zzbytVar2;
        }
        if (zzbytVar != null) {
            str = zzbytVar.zza;
            i9 = zzbytVar.zzb;
        } else {
            i9 = 1;
            str = "";
        }
        this.zza.zzd(new zzbye(str, i9), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzc() {
        this.zza.zzf();
    }
}
