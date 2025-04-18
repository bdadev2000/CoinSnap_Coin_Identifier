package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzepu implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzepu(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzept((ListenableFuture) this.zza.zzb(), zzfkb.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
