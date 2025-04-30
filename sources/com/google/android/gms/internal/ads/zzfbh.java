package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzfbh {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzexw zza(zzfal zzfalVar, zzevw zzevwVar, ScheduledExecutorService scheduledExecutorService, int i9) {
        if (i9 == 0) {
            zzfalVar = zzevwVar;
        }
        return new zzewe(zzfalVar, 0L, scheduledExecutorService);
    }

    public static zzexw zzb(zzfav zzfavVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzewe(zzfavVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzee)).longValue(), scheduledExecutorService);
    }

    public static zzexw zzc(zzfbq zzfbqVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzewe(zzfbqVar, 0L, scheduledExecutorService);
    }
}
