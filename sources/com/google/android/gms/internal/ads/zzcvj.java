package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzcvj implements zzcwm, zzddq, zzdbg, zzcxc, zzaym {
    private final zzcxe zza;
    private final zzfet zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;

    @Nullable
    private final String zzh;
    private final zzgfa zze = zzgfa.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcvj(zzcxe zzcxeVar, zzfet zzfetVar, ScheduledExecutorService scheduledExecutorService, Executor executor, @Nullable String str) {
        this.zza = zzcxeVar;
        this.zzb = zzfetVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzfet zzfetVar = this.zzb;
        if (zzfetVar.zze != 3) {
            int i10 = zzfetVar.zzY;
            if (i10 == 0 || i10 == 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzle)).booleanValue() && zzm()) {
                    return;
                }
                this.zza.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzle)).booleanValue() && zzm() && zzaylVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk() {
        if (this.zzb.zze != 3) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbC)).booleanValue()) {
                zzfet zzfetVar = this.zzb;
                if (zzfetVar.zzY == 2) {
                    if (zzfetVar.zzq == 0) {
                        this.zza.zza();
                    } else {
                        zzgei.zzr(this.zze, new zzcvi(this), this.zzd);
                        this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvh
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcvj.this.zzh();
                            }
                        }, this.zzb.zzq, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }
}
