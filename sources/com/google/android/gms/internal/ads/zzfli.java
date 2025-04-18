package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzfli implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzfli(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar2;
        this.zzb = zzhjaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzflg(zzfkb.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzflj) this.zzb).zzb());
    }
}
