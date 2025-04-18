package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzdxw implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;

    public zzdxw(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar5;
        this.zze = zzhgpVar6;
        this.zzf = zzhgpVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxv(((zzchq) this.zza).zza(), ((zzcwd) this.zzb).zza(), ((zzdww) this.zzc).zzb(), zzfin.zzc(), (ScheduledExecutorService) this.zzd.zzb(), (zzecl) this.zze.zzb(), (zzfkl) this.zzf.zzb());
    }
}
