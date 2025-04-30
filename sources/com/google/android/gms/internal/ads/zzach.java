package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzach {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzaci zzb;

    public zzach(@Nullable Handler handler, @Nullable zzaci zzaciVar) {
        this.zza = zzaciVar == null ? null : handler;
        this.zzb = zzaciVar;
    }

    public final void zza(final String str, final long j7, final long j9) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabx
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzg(str, j7, j9);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacg
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzix zzixVar) {
        zzixVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacf
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzi(zzixVar);
                }
            });
        }
    }

    public final void zzd(final int i9, final long j7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabz
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzj(i9, j7);
                }
            });
        }
    }

    public final void zze(final zzix zzixVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacd
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzk(zzixVar);
                }
            });
        }
    }

    public final void zzf(final zzan zzanVar, @Nullable final zziy zziyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzace
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzl(zzanVar, zziyVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j7, long j9) {
        int i9 = zzgd.zza;
        this.zzb.zzp(str, j7, j9);
    }

    public final /* synthetic */ void zzh(String str) {
        int i9 = zzgd.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzi(zzix zzixVar) {
        zzixVar.zza();
        int i9 = zzgd.zza;
        this.zzb.zzr(zzixVar);
    }

    public final /* synthetic */ void zzj(int i9, long j7) {
        int i10 = zzgd.zza;
        this.zzb.zzl(i9, j7);
    }

    public final /* synthetic */ void zzk(zzix zzixVar) {
        int i9 = zzgd.zza;
        this.zzb.zzs(zzixVar);
    }

    public final /* synthetic */ void zzl(zzan zzanVar, zziy zziyVar) {
        int i9 = zzgd.zza;
        this.zzb.zzu(zzanVar, zziyVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j7) {
        int i9 = zzgd.zza;
        this.zzb.zzm(obj, j7);
    }

    public final /* synthetic */ void zzn(long j7, int i9) {
        int i10 = zzgd.zza;
        this.zzb.zzt(j7, i9);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        int i9 = zzgd.zza;
        this.zzb.zzo(exc);
    }

    public final /* synthetic */ void zzp(zzdv zzdvVar) {
        int i9 = zzgd.zza;
        this.zzb.zzv(zzdvVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaca
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j7, final int i9) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacb
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzn(j7, i9);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacc
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdv zzdvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaby
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.this.zzp(zzdvVar);
                }
            });
        }
    }
}
