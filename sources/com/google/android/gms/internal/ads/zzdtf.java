package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdtf implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdtf(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdts zzdtsVar = (zzdts) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzdha(zzdtsVar, zzggeVar);
    }
}
