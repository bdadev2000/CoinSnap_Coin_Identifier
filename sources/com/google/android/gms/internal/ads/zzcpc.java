package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzcpc implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcpc(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    public static zzcze zzc(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return new zzcze(scheduledExecutorService, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcze zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
