package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzduq implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;
    private final zzhgp zzg;
    private final zzhgp zzh;
    private final zzhgp zzi;

    public zzduq(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7, zzhgp zzhgpVar8, zzhgp zzhgpVar9, zzhgp zzhgpVar10) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar5;
        this.zze = zzhgpVar6;
        this.zzf = zzhgpVar7;
        this.zzg = zzhgpVar8;
        this.zzh = zzhgpVar9;
        this.zzi = zzhgpVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdup((Executor) this.zza.zzb(), ((zzchq) this.zzb).zza(), ((zzchr) this.zzc).zza(), zzfin.zzc(), (zzdqd) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdsw) this.zzf.zzb(), ((zzcid) this.zzg).zza(), ((zzddl) this.zzh).zzb(), (zzfko) this.zzi.zzb());
    }
}
