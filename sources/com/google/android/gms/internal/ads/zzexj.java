package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzexj implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzexj(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexh zzb() {
        zzcau zzcauVar = (zzcau) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzexh(zzcauVar, zzggeVar, ((zzcjj) this.zzc).zza());
    }
}
