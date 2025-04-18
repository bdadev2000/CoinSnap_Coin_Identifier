package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgfe extends zzgdy {
    private ua.b zza;
    private ScheduledFuture zzb;

    private zzgfe(ua.b bVar) {
        bVar.getClass();
        this.zza = bVar;
    }

    public static ua.b zzf(ua.b bVar, long j3, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgfe zzgfeVar = new zzgfe(bVar);
        zzgfb zzgfbVar = new zzgfb(zzgfeVar);
        zzgfeVar.zzb = scheduledExecutorService.schedule(zzgfbVar, j3, timeUnit);
        bVar.addListener(zzgfbVar, zzgdw.INSTANCE);
        return zzgfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        ua.b bVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (bVar != null) {
            String f10 = e.f("inputFuture=[", bVar.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return f10 + ", remaining delay=[" + delay + " ms]";
                }
                return f10;
            }
            return f10;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
