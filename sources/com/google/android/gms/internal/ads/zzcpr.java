package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcpr implements zzhfx {
    private final zzhgp zza;

    public zzcpr(zzcpk zzcpkVar, zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzt zzn;
        zzcqs zzb = ((zzcqt) this.zza).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmm)).booleanValue()) {
            zzn = zzfzt.zzo(new zzded(zzb, zzcaj.zza));
        } else {
            zzn = zzfzt.zzn();
        }
        zzhgf.zzb(zzn);
        return zzn;
    }
}
