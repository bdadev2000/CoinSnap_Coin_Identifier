package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzesy implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzesy(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevp(((zzetv) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlP)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
