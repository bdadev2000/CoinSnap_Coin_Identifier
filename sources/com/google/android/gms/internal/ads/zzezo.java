package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzezo implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzezo(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar6;
        this.zze = zzhgpVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezm((zzbzz) this.zza.zzb(), ((zzeyz) this.zzb).zzb().booleanValue(), ((zzeza) this.zzc).zzb().booleanValue(), zzclm.zza(), zzfin.zzc(), ((zzeyw) this.zzd).zza(), (ScheduledExecutorService) this.zze.zzb());
    }
}
