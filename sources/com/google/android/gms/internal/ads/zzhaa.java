package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhaa implements zzhbc {
    private static final zzhag zza = new zzgzy();
    private final zzhag zzb;

    public zzhaa() {
        zzhag zzhagVar = zza;
        int i10 = zzhas.zza;
        zzgzz zzgzzVar = new zzgzz(zzgyq.zza(), zzhagVar);
        byte[] bArr = zzgzk.zzb;
        this.zzb = zzgzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhbb zza(Class cls) {
        zzgyi zzgyiVar;
        int i10 = zzhbd.zza;
        if (!zzgyx.class.isAssignableFrom(cls)) {
            int i11 = zzhas.zza;
        }
        zzhaf zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            int i12 = zzhas.zza;
            zzhao zza2 = zzhap.zza();
            zzgzv zza3 = zzgzw.zza();
            zzhbn zzm = zzhbd.zzm();
            if (zzb.zzc() - 1 != 1) {
                zzgyiVar = zzgyk.zza();
            } else {
                zzgyiVar = null;
            }
            return zzhal.zzm(cls, zzb, zza2, zza3, zzm, zzgyiVar, zzhae.zza());
        }
        int i13 = zzhas.zza;
        return zzham.zzc(zzhbd.zzm(), zzgyk.zza(), zzb.zza());
    }
}
