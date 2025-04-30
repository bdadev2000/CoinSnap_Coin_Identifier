package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzqn {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzqo zzb;

    public zzqn(@Nullable Handler handler, @Nullable zzqo zzqoVar) {
        this.zza = zzqoVar == null ? null : handler;
        this.zzb = zzqoVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqh
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqi
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzqp zzqpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqf
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzl(zzqpVar);
                }
            });
        }
    }

    public final void zzd(final zzqp zzqpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzm(zzqpVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j7, final long j9) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzql
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzn(str, j7, j9);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqm
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzix zzixVar) {
        zzixVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqc
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzp(zzixVar);
                }
            });
        }
    }

    public final void zzh(final zzix zzixVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqb
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzq(zzixVar);
                }
            });
        }
    }

    public final void zzi(final zzan zzanVar, @Nullable final zziy zziyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqj
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzr(zzanVar, zziyVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzj(Exception exc) {
        int i9 = zzgd.zza;
        this.zzb.zza(exc);
    }

    public final /* synthetic */ void zzk(Exception exc) {
        int i9 = zzgd.zza;
        this.zzb.zzh(exc);
    }

    public final /* synthetic */ void zzl(zzqp zzqpVar) {
        int i9 = zzgd.zza;
        this.zzb.zzi(zzqpVar);
    }

    public final /* synthetic */ void zzm(zzqp zzqpVar) {
        int i9 = zzgd.zza;
        this.zzb.zzj(zzqpVar);
    }

    public final /* synthetic */ void zzn(String str, long j7, long j9) {
        int i9 = zzgd.zza;
        this.zzb.zzb(str, j7, j9);
    }

    public final /* synthetic */ void zzo(String str) {
        int i9 = zzgd.zza;
        this.zzb.zzc(str);
    }

    public final /* synthetic */ void zzp(zzix zzixVar) {
        zzixVar.zza();
        int i9 = zzgd.zza;
        this.zzb.zzd(zzixVar);
    }

    public final /* synthetic */ void zzq(zzix zzixVar) {
        int i9 = zzgd.zza;
        this.zzb.zze(zzixVar);
    }

    public final /* synthetic */ void zzr(zzan zzanVar, zziy zziyVar) {
        int i9 = zzgd.zza;
        this.zzb.zzf(zzanVar, zziyVar);
    }

    public final /* synthetic */ void zzs(long j7) {
        int i9 = zzgd.zza;
        this.zzb.zzg(j7);
    }

    public final /* synthetic */ void zzt(boolean z8) {
        int i9 = zzgd.zza;
        this.zzb.zzn(z8);
    }

    public final /* synthetic */ void zzu(int i9, long j7, long j9) {
        int i10 = zzgd.zza;
        this.zzb.zzk(i9, j7, j9);
    }

    public final void zzv(final long j7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzs(j7);
                }
            });
        }
    }

    public final void zzw(final boolean z8) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqk
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzt(z8);
                }
            });
        }
    }

    public final void zzx(final int i9, final long j7, final long j9) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqe
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.this.zzu(i9, j7, j9);
                }
            });
        }
    }
}
