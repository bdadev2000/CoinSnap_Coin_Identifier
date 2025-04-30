package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmk extends zzvc {
    private final zzdb zzd;

    public zzmk(zzml zzmlVar, zzdc zzdcVar) {
        super(zzdcVar);
        this.zzd = new zzdb();
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i9, zzcz zzczVar, boolean z8) {
        zzcz zzd = this.zzc.zzd(i9, zzczVar, z8);
        if (this.zzc.zze(zzd.zzd, this.zzd, 0L).zzb()) {
            zzd.zzl(zzczVar.zzb, zzczVar.zzc, zzczVar.zzd, zzczVar.zze, 0L, zzd.zza, true);
        } else {
            zzd.zzg = true;
        }
        return zzd;
    }
}
