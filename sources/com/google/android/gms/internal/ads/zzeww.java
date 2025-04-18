package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeww implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;

    public zzeww(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar4;
        this.zzd = zzhgpVar5;
        this.zze = zzhgpVar6;
        this.zzf = zzhgpVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewt(((zzcho) this.zza).zzb(), ((zzchq) this.zzb).zza(), zzfin.zzc(), (ScheduledExecutorService) this.zzc.zzb(), ((zzefa) this.zzd).zzb(), ((zzcwd) this.zze).zza(), ((zzcid) this.zzf).zza());
    }
}
