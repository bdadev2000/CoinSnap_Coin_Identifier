package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzpq {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzpr zzb;

    public zzpq(@Nullable Handler handler, @Nullable zzpr zzprVar) {
        this.zza = zzprVar == null ? null : handler;
        this.zzb = zzprVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzps zzpsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzl(zzpsVar);
                }
            });
        }
    }

    public final void zzd(final zzps zzpsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzm(zzpsVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j2, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzn(str, j2, j3);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpp
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzia zziaVar) {
        zziaVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpf
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzp(zziaVar);
                }
            });
        }
    }

    public final void zzh(final zzia zziaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpe
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzq(zziaVar);
                }
            });
        }
    }

    public final void zzi(final zzaf zzafVar, @Nullable final zzib zzibVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpm
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzr(zzafVar, zzibVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzj(Exception exc) {
        int i2 = zzeu.zza;
        this.zzb.zza(exc);
    }

    public final /* synthetic */ void zzk(Exception exc) {
        int i2 = zzeu.zza;
        this.zzb.zzh(exc);
    }

    public final /* synthetic */ void zzl(zzps zzpsVar) {
        int i2 = zzeu.zza;
        this.zzb.zzi(zzpsVar);
    }

    public final /* synthetic */ void zzm(zzps zzpsVar) {
        int i2 = zzeu.zza;
        this.zzb.zzj(zzpsVar);
    }

    public final /* synthetic */ void zzn(String str, long j2, long j3) {
        int i2 = zzeu.zza;
        this.zzb.zzb(str, j2, j3);
    }

    public final /* synthetic */ void zzo(String str) {
        int i2 = zzeu.zza;
        this.zzb.zzc(str);
    }

    public final /* synthetic */ void zzp(zzia zziaVar) {
        zziaVar.zza();
        int i2 = zzeu.zza;
        this.zzb.zzd(zziaVar);
    }

    public final /* synthetic */ void zzq(zzia zziaVar) {
        int i2 = zzeu.zza;
        this.zzb.zze(zziaVar);
    }

    public final /* synthetic */ void zzr(zzaf zzafVar, zzib zzibVar) {
        int i2 = zzeu.zza;
        this.zzb.zzf(zzafVar, zzibVar);
    }

    public final /* synthetic */ void zzs(long j2) {
        int i2 = zzeu.zza;
        this.zzb.zzg(j2);
    }

    public final /* synthetic */ void zzt(boolean z2) {
        int i2 = zzeu.zza;
        this.zzb.zzn(z2);
    }

    public final /* synthetic */ void zzu(int i2, long j2, long j3) {
        int i3 = zzeu.zza;
        this.zzb.zzk(i2, j2, j3);
    }

    public final void zzv(final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzs(j2);
                }
            });
        }
    }

    public final void zzw(final boolean z2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzt(z2);
                }
            });
        }
    }

    public final void zzx(final int i2, final long j2, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final void run() {
                    zzpq.this.zzu(i2, j2, j3);
                }
            });
        }
    }
}
