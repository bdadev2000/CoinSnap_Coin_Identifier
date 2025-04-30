package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcsy implements zzhkp {
    private final zzcsm zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcsy(zzcsm zzcsmVar, zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzcsmVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcaq zzb() {
        return new zzcaq(((zzcjj) this.zzb).zza(), ((zzczc) this.zzc).zza().zzf);
    }
}
