package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzdxr implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzdxr(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar4;
        this.zzc = zzhgpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxq zzb() {
        return new zzdxq((ScheduledExecutorService) this.zza.zzb(), zzfin.zzc(), zzfir.zzc(), ((zzdyk) this.zzb).zzb(), zzhfw.zza(zzhgi.zza(this.zzc)));
    }
}
