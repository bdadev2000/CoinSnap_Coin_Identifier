package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzesz implements zzhii {
    private final zzhja zza;

    public zzesz(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevp(zzetz.zza(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlO)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
