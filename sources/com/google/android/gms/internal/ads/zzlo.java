package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzlo extends zzum {
    private final zzcb zzc;

    public zzlo(zzlp zzlpVar, zzcc zzccVar) {
        super(zzccVar);
        this.zzc = new zzcb();
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i2, zzca zzcaVar, boolean z2) {
        zzca zzd = this.zzb.zzd(i2, zzcaVar, z2);
        if (this.zzb.zze(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zzi(zzcaVar.zza, zzcaVar.zzb, zzcaVar.zzc, zzcaVar.zzd, 0L, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
