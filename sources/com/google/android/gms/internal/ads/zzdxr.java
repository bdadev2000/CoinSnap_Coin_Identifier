package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdxr implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdxr(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdxo zzdxoVar = (zzdxo) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzdha(zzdxoVar, zzggeVar);
    }
}
