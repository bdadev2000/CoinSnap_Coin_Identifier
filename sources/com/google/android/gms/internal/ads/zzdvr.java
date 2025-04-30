package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdvr implements zzhkp {
    private final zzdvq zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdvr(zzdvq zzdvqVar, zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzdvqVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdwa zzdwaVar = (zzdwa) this.zzb.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        Set zza = zzdvq.zza(zzdwaVar, zzggeVar);
        zzhkx.zzb(zza);
        return zza;
    }
}
