package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdpq implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;

    public zzdpq(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
        this.zzh = zzhlgVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpo(((zzczc) this.zza).zza(), (Executor) this.zzb.zzb(), (zzdsd) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzdvc) this.zze.zzb(), (zzfoe) this.zzf.zzb(), (zzefz) this.zzg.zzb(), (zzdqy) this.zzh.zzb());
    }
}
