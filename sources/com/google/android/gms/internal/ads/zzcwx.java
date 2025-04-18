package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcwx implements zzcya, zzdff, zzdcv, zzcyq, zzayv {
    private final zzcys zza;
    private final zzfgh zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;

    @Nullable
    private final String zzh;
    private final zzggh zze = zzggh.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcwx(zzcys zzcysVar, zzfgh zzfghVar, ScheduledExecutorService scheduledExecutorService, Executor executor, @Nullable String str) {
        this.zza = zzcysVar;
        this.zzb = zzfghVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
        zzfgh zzfghVar = this.zzb;
        if (zzfghVar.zze == 3) {
            return;
        }
        int i2 = zzfghVar.zzY;
        if (i2 == 0 || i2 == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzld)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(zzayu zzayuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzld)).booleanValue() && zzm() && zzayuVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzds(zzbwm zzbwmVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzf() {
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            try {
                if (this.zze.isDone()) {
                    return;
                }
                this.zze.zzc(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final synchronized void zzj() {
        try {
            if (this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzc(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzk() {
        if (this.zzb.zze == 3) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbz)).booleanValue()) {
            zzfgh zzfghVar = this.zzb;
            if (zzfghVar.zzY == 2) {
                if (zzfghVar.zzq == 0) {
                    this.zza.zza();
                } else {
                    zzgfo.zzr(this.zze, new zzcww(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcwx.this.zzh();
                        }
                    }, this.zzb.zzq, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }
}
