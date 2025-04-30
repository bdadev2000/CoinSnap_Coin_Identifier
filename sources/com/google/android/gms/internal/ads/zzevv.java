package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzevv implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzevv(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzevt(zzggeVar, ((zzczc) this.zzb).zza(), (PackageInfo) this.zzc.zzb(), ((zzcjh) this.zzd).zzb());
    }
}
