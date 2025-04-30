package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzeya implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzeya(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexz zzb() {
        Context zza = ((zzcjj) this.zza).zza();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzexz(zza, zzggeVar, ((zzhld) this.zzc).zzb(), (zzfmn) this.zzd.zzb(), (zzdvc) this.zze.zzb());
    }
}
