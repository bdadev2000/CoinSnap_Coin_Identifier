package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzegw implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzegw(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegv zzb() {
        return new zzegv((zzcqh) this.zza.zzb(), ((zzegd) this.zzb).zzb(), (zzcwo) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzfin.zzc(), (zzdsh) this.zze.zzb());
    }
}
