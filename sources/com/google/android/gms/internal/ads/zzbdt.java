package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzbdt implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzbdt(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbds zzb() {
        return new zzbds((ScheduledExecutorService) this.zza.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zzj) this.zzb.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zza) this.zzc.zzb(), (zzdsr) this.zzd.zzb());
    }
}
