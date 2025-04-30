package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdmj implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdmj(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzepf zzepfVar = (zzepf) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzdha(zzepfVar, zzggeVar);
    }
}
