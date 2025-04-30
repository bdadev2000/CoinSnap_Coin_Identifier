package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdvw implements zzhkp {
    private final zzdvq zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdvw(zzdvq zzdvqVar, zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzdvqVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdwa zzdwaVar = (zzdwa) this.zzb.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        Set zzf = zzdvq.zzf(zzdwaVar, zzggeVar);
        zzhkx.zzb(zzf);
        return zzf;
    }
}
