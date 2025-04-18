package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgmx implements zzgfx {
    final String zza;
    final Class zzb;
    final zzgty zzc;

    public zzgmx(String str, Class cls, zzgty zzgtyVar, zzhaq zzhaqVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgtyVar;
    }

    public static zzgfx zzd(String str, Class cls, zzgty zzgtyVar, zzhaq zzhaqVar) {
        return new zzgmx(str, cls, zzgtyVar, zzhaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final zzgua zza(zzgxp zzgxpVar) throws GeneralSecurityException {
        zzguc zza = zzgue.zza();
        zza.zzb(this.zza);
        zza.zzc(zzgxpVar);
        zza.zza(zzgve.RAW);
        zzgow zzgowVar = (zzgow) zzgnz.zzc().zzd(zzgnp.zzb().zza(zzgnz.zzc().zzb(zzgox.zza((zzgue) zza.zzbr())), null), zzgow.class, zzgfv.zza());
        zzgtx zza2 = zzgua.zza();
        zza2.zzb(zzgowVar.zzg());
        zza2.zzc(zzgowVar.zze());
        zza2.zza(zzgowVar.zzb());
        return (zzgua) zza2.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final Object zzc(zzgxp zzgxpVar) throws GeneralSecurityException {
        return zzgnw.zza().zzc(zzgnz.zzc().zza(zzgow.zza(this.zza, zzgxpVar, this.zzc, zzgve.RAW, null), zzgfv.zza()), this.zzb);
    }
}
