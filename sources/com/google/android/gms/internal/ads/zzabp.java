package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzabp {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzabq zzb;

    public zzabp(@Nullable Handler handler, @Nullable zzabq zzabqVar) {
        this.zza = zzabqVar == null ? null : handler;
        this.zzb = zzabqVar;
    }

    public final void zza(final String str, final long j2, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabf
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzg(str, j2, j3);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabo
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzia zziaVar) {
        zziaVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzi(zziaVar);
                }
            });
        }
    }

    public final void zzd(final int i2, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabh
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzj(i2, j2);
                }
            });
        }
    }

    public final void zze(final zzia zziaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabl
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzk(zziaVar);
                }
            });
        }
    }

    public final void zzf(final zzaf zzafVar, @Nullable final zzib zzibVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabm
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzl(zzafVar, zzibVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j2, long j3) {
        int i2 = zzeu.zza;
        this.zzb.zzp(str, j2, j3);
    }

    public final /* synthetic */ void zzh(String str) {
        int i2 = zzeu.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzi(zzia zziaVar) {
        zziaVar.zza();
        int i2 = zzeu.zza;
        this.zzb.zzr(zziaVar);
    }

    public final /* synthetic */ void zzj(int i2, long j2) {
        int i3 = zzeu.zza;
        this.zzb.zzl(i2, j2);
    }

    public final /* synthetic */ void zzk(zzia zziaVar) {
        int i2 = zzeu.zza;
        this.zzb.zzs(zziaVar);
    }

    public final /* synthetic */ void zzl(zzaf zzafVar, zzib zzibVar) {
        int i2 = zzeu.zza;
        this.zzb.zzu(zzafVar, zzibVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j2) {
        int i2 = zzeu.zza;
        this.zzb.zzm(obj, j2);
    }

    public final /* synthetic */ void zzn(long j2, int i2) {
        int i3 = zzeu.zza;
        this.zzb.zzt(j2, i2);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        int i2 = zzeu.zza;
        this.zzb.zzo(exc);
    }

    public final /* synthetic */ void zzp(zzcp zzcpVar) {
        int i2 = zzeu.zza;
        this.zzb.zzv(zzcpVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabi
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j2, final int i2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabj
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzn(j2, i2);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabk
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzcp zzcpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabg
                @Override // java.lang.Runnable
                public final void run() {
                    zzabp.this.zzp(zzcpVar);
                }
            });
        }
    }
}
