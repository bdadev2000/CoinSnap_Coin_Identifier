package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzdzc implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;

    public zzdzc(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4, zzhja zzhjaVar5) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar4;
        this.zzc = zzhjaVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzb zzb() {
        return new zzdzb((ScheduledExecutorService) this.zza.zzb(), zzfkb.zzc(), zzfkf.zzc(), ((zzdzu) this.zzb).zzb(), zzhih.zza(zzhit.zza(this.zzc)));
    }
}
