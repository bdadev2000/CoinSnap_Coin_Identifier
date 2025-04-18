package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzcvk implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzcvk(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcvj((zzcxe) this.zza.zzb(), ((zzcsh) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), zzfin.zzc(), ((zzcsi) this.zzd).zza());
    }
}
