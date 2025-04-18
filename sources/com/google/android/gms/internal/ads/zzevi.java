package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzevi implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;
    private final zzhgp zzg;
    private final zzhgp zzh;

    public zzevi(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7, zzhgp zzhgpVar8, zzhgp zzhgpVar9) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
        this.zzd = zzhgpVar5;
        this.zze = zzhgpVar6;
        this.zzf = zzhgpVar7;
        this.zzg = zzhgpVar8;
        this.zzh = zzhgpVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevg(zzfin.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzelo) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzcwd) this.zze).zza(), (zzelk) this.zzf.zzb(), (zzdqd) this.zzg.zzb(), (zzdur) this.zzh.zzb());
    }
}
