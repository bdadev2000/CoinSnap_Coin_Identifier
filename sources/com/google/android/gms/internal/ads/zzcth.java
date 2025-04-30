package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcth implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcth(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        zzfho zza = ((zzczc) this.zza).zza();
        zzejf zzb = ((zzejg) this.zzb).zzb();
        zzeim zzb2 = ((zzein) this.zzc).zzb();
        if (zza.zza() == null) {
            return zzb2;
        }
        return zzb;
    }
}
