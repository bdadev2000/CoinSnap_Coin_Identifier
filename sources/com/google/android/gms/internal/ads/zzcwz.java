package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcwz extends zzdcc implements zzcwq {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwz(zzcwy zzcwyVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcwyVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcwr
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcwq) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcws
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcwq) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc(final zzdgu zzdguVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcwu
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcwq) obj).zzc(zzdgu.this);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdgu("Timeout for show call succeed."));
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
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwt
            @Override // java.lang.Runnable
            public final void run() {
                zzcwz.this.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkq)).intValue(), TimeUnit.MILLISECONDS);
    }
}
