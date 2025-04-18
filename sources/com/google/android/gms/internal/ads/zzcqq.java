package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzcqq implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzcqq(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    public static zzdat zzc(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return new zzdat(scheduledExecutorService, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdat zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
