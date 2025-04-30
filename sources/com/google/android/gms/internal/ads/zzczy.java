package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzczy extends zzdez implements zzczp {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzczy(zzczx zzczxVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzczxVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzczp) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzb() {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzczr
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzczp) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzc(final zzdjo zzdjoVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzczt
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzczp) obj).zzc(zzdjo.this);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdjo("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczs
            @Override // java.lang.Runnable
            public final void run() {
                zzczy.this.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkJ)).intValue(), TimeUnit.MILLISECONDS);
    }
}
