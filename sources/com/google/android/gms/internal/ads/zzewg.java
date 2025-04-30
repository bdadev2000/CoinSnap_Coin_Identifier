package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzewg implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzewg(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewf(((zzdzq) this.zza).zzb(), (PackageInfo) this.zzb.zzb(), ((zzcjj) this.zzc).zza(), (zzdux) this.zzd.zzb());
    }
}
