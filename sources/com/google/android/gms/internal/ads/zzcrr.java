package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcrr implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzcrr(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevp(((zzeul) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzma)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
