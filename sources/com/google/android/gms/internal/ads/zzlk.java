package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzlk extends zzuf {
    private final zzbu zzc;

    public zzlk(zzll zzllVar, zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i10, zzbt zzbtVar, boolean z10) {
        zzbt zzd = this.zzb.zzd(i10, zzbtVar, z10);
        if (this.zzb.zze(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zzi(zzbtVar.zza, zzbtVar.zzb, zzbtVar.zzc, zzbtVar.zzd, 0L, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
