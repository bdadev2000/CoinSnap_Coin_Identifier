package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcti implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcti(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzcto) this.zza).zzb().booleanValue();
        zzekx zzb = ((zzeky) this.zzb).zzb();
        zzemx zzb2 = ((zzemy) this.zzc).zzb();
        if (true != booleanValue) {
            return zzb2;
        }
        return zzb;
    }
}
