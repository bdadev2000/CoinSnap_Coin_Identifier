package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzabf {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzabg zzb;

    public zzabf(@Nullable Handler handler, @Nullable zzabg zzabgVar) {
        this.zza = zzabgVar == null ? null : handler;
        this.zzb = zzabgVar;
    }

    public final void zza(final String str, final long j3, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaav
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzg(str, j3, j10);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhx zzhxVar) {
        zzhxVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabd
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzi(zzhxVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaax
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzj(i10, j3);
                }
            });
        }
    }

    public final void zze(final zzhx zzhxVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabb
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzk(zzhxVar);
                }
            });
        }
    }

    public final void zzf(final zzad zzadVar, @Nullable final zzhy zzhyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabc
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzl(zzadVar, zzhyVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j3, long j10) {
        int i10 = zzen.zza;
        this.zzb.zzp(str, j3, j10);
    }

    public final /* synthetic */ void zzh(String str) {
        int i10 = zzen.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzi(zzhx zzhxVar) {
        zzhxVar.zza();
        int i10 = zzen.zza;
        this.zzb.zzr(zzhxVar);
    }

    public final /* synthetic */ void zzj(int i10, long j3) {
        int i11 = zzen.zza;
        this.zzb.zzl(i10, j3);
    }

    public final /* synthetic */ void zzk(zzhx zzhxVar) {
        int i10 = zzen.zza;
        this.zzb.zzs(zzhxVar);
    }

    public final /* synthetic */ void zzl(zzad zzadVar, zzhy zzhyVar) {
        int i10 = zzen.zza;
        this.zzb.zzu(zzadVar, zzhyVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j3) {
        int i10 = zzen.zza;
        this.zzb.zzm(obj, j3);
    }

    public final /* synthetic */ void zzn(long j3, int i10) {
        int i11 = zzen.zza;
        this.zzb.zzt(j3, i10);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        int i10 = zzen.zza;
        this.zzb.zzo(exc);
    }

    public final /* synthetic */ void zzp(zzci zzciVar) {
        int i10 = zzen.zza;
        this.zzb.zzv(zzciVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaay
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j3, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaz
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzn(j3, i10);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaba
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzci zzciVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaw
                @Override // java.lang.Runnable
                public final void run() {
                    zzabf.this.zzp(zzciVar);
                }
            });
        }
    }
}
