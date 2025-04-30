package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdrn implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdrn(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        int i9 = ((zzczc) this.zzc).zza().zzo.zza;
        if (i9 != 0) {
            if (i9 - 1 != 0) {
                return ((zzemy) this.zzb).zzb();
            }
            return ((zzemy) this.zza).zzb();
        }
        throw null;
    }
}
