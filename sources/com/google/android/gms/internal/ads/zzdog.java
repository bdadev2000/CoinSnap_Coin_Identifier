package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzdog implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdog(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.util.zzbq zzbqVar = (com.google.android.gms.ads.internal.util.zzbq) this.zza.zzb();
        Clock clock = (Clock) this.zzb.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzdof(zzbqVar, clock, zzggeVar);
    }
}
