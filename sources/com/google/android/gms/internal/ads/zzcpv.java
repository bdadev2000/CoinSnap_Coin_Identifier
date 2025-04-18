package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcpv implements zzhfx {
    private final zzcpk zza;
    private final zzhgp zzb;

    public zzcpv(zzcpk zzcpkVar, zzhgp zzhgpVar) {
        this.zza = zzcpkVar;
        this.zzb = zzhgpVar;
    }

    public static zzded zza(zzcpk zzcpkVar, zzcrd zzcrdVar) {
        return new zzded(zzcrdVar, zzcaj.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcrd) this.zzb.zzb());
    }
}
