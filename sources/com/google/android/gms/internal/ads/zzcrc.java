package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcrc implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcrc(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbaj zzbajVar = (zzbaj) this.zza.zzb();
        zzbqq zzbqqVar = (zzbqq) this.zzb.zzb();
        zzgge zza = zzfkg.zza();
        zzhkx.zzb(zza);
        return new zzcqv(zzbajVar.zzc(), zzbqqVar, zza);
    }
}
