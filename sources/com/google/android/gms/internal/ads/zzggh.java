package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzggh extends zzgfn implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzggh(f4.c cVar, ScheduledFuture scheduledFuture) {
        super(cVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        boolean cancel = zzb().cancel(z8);
        if (cancel) {
            this.zza.cancel(z8);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
