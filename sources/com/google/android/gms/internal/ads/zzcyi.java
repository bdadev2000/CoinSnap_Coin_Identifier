package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcyi implements zzczl, zzdgn, zzded, zzdab, zzban {
    private final zzdad zza;
    private final zzfgt zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;

    @Nullable
    private final String zzh;
    private final zzggm zze = zzggm.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcyi(zzdad zzdadVar, zzfgt zzfgtVar, ScheduledExecutorService scheduledExecutorService, Executor executor, @Nullable String str) {
        this.zza = zzdadVar;
        this.zzb = zzfgtVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        if (this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
        zzfgt zzfgtVar = this.zzb;
        if (zzfgtVar.zzf != 3) {
            int i9 = zzfgtVar.zzZ;
            if (i9 == 0 || i9 == 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlw)).booleanValue() && zzm()) {
                    return;
                }
                this.zza.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlw)).booleanValue() && zzm() && zzbamVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(zzbyh zzbyhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
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

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzded
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

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzk() {
        if (this.zzb.zzf != 3) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbx)).booleanValue()) {
                zzfgt zzfgtVar = this.zzb;
                if (zzfgtVar.zzZ == 2) {
                    if (zzfgtVar.zzr == 0) {
                        this.zza.zza();
                    } else {
                        zzgft.zzr(this.zze, new zzcyh(this), this.zzd);
                        this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyg
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcyi.this.zzh();
                            }
                        }, this.zzb.zzr, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzdab
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
