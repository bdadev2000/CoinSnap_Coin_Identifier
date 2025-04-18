package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgon implements zzghe {
    final String zza;
    final Class zzb;
    final zzgwa zzc;

    public zzgon(String str, Class cls, zzgwa zzgwaVar, zzhcx zzhcxVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgwaVar;
    }

    public static zzghe zzd(String str, Class cls, zzgwa zzgwaVar, zzhcx zzhcxVar) {
        return new zzgon(str, cls, zzgwaVar, zzhcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzghe
    public final zzgwb zza(zzgzs zzgzsVar) throws GeneralSecurityException {
        zzgwe zza = zzgwf.zza();
        zza.zzb(this.zza);
        zza.zzc(zzgzsVar);
        zza.zza(zzgxf.RAW);
        zzgqr zzgqrVar = (zzgqr) zzgpq.zzc().zzd(zzgpg.zzb().zza(zzgpq.zzc().zzb(zzgqs.zza((zzgwf) zza.zzbr())), null), zzgqr.class, zzghc.zza());
        zzgvz zza2 = zzgwb.zza();
        zza2.zzb(zzgqrVar.zzg());
        zza2.zzc(zzgqrVar.zze());
        zza2.zza(zzgqrVar.zzb());
        return (zzgwb) zza2.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzghe
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghe
    public final Object zzc(zzgzs zzgzsVar) throws GeneralSecurityException {
        return zzgpn.zza().zzc(zzgpq.zzc().zza(zzgqr.zza(this.zza, zzgzsVar, this.zzc, zzgxf.RAW, null), zzghc.zza()), this.zzb);
    }
}
