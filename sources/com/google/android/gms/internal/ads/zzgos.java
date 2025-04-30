package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgos implements zzghj {
    final String zza;
    final Class zzb;
    final zzgwg zzc;
    final zzhdm zzd;

    public zzgos(String str, Class cls, zzgwg zzgwgVar, zzhdm zzhdmVar) {
        this.zzd = zzhdmVar;
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgwgVar;
    }

    public static zzghj zzd(String str, Class cls, zzgwg zzgwgVar, zzhdm zzhdmVar) {
        return new zzgos(str, cls, zzgwgVar, zzhdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzghj
    public final zzgwh zza(zzhac zzhacVar) throws GeneralSecurityException {
        zzgwl zza = zzgwm.zza();
        zza.zzb(this.zza);
        zza.zzc(zzhacVar);
        zza.zza(zzgxn.RAW);
        zzgqq zzd = zzgpl.zzc().zzd(zzgpb.zzb().zza(zzgpl.zzc().zzb(zzgqm.zza((zzgwm) zza.zzbr())), null), zzgql.class, zzghh.zza());
        zzgwe zza2 = zzgwh.zza();
        zzgql zzgqlVar = (zzgql) zzd;
        zza2.zzb(zzgqlVar.zzg());
        zza2.zzc(zzgqlVar.zze());
        zza2.zza(zzgqlVar.zzb());
        return (zzgwh) zza2.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzghj
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghj
    public final Object zzc(zzhac zzhacVar) throws GeneralSecurityException {
        return zzgpi.zza().zzc(zzgpl.zzc().zza(zzgql.zza(this.zza, zzhacVar, this.zzc, zzgxn.RAW, null), zzghh.zza()), this.zzb);
    }
}
