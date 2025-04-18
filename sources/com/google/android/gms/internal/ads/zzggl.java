package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggl extends zzgfe {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    private zzggl(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzggl zzgglVar = new zzggl(listenableFuture);
        zzggi zzggiVar = new zzggi(zzgglVar);
        zzgglVar.zzb = scheduledExecutorService.schedule(zzggiVar, j2, timeUnit);
        listenableFuture.addListener(zzggiVar, zzgfc.INSTANCE);
        return zzgglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String A = androidx.compose.foundation.text.input.a.A("inputFuture=[", listenableFuture.toString(), "]");
        if (scheduledFuture == null) {
            return A;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return A;
        }
        return A + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgec
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
