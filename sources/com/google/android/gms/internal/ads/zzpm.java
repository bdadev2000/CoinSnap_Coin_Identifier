package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzpm {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzpn zzb;

    public zzpm(@Nullable Handler handler, @Nullable zzpn zzpnVar) {
        this.zza = zzpnVar == null ? null : handler;
        this.zzb = zzpnVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzpo zzpoVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpe
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzl(zzpoVar);
                }
            });
        }
    }

    public final void zzd(final zzpo zzpoVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpf
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzm(zzpoVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j3, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzn(str, j3, j10);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzhx zzhxVar) {
        zzhxVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpb
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzp(zzhxVar);
                }
            });
        }
    }

    public final void zzh(final zzhx zzhxVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzq(zzhxVar);
                }
            });
        }
    }

    public final void zzi(final zzad zzadVar, @Nullable final zzhy zzhyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzr(zzadVar, zzhyVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzj(Exception exc) {
        int i10 = zzen.zza;
        this.zzb.zza(exc);
    }

    public final /* synthetic */ void zzk(Exception exc) {
        int i10 = zzen.zza;
        this.zzb.zzh(exc);
    }

    public final /* synthetic */ void zzl(zzpo zzpoVar) {
        int i10 = zzen.zza;
        this.zzb.zzi(zzpoVar);
    }

    public final /* synthetic */ void zzm(zzpo zzpoVar) {
        int i10 = zzen.zza;
        this.zzb.zzj(zzpoVar);
    }

    public final /* synthetic */ void zzn(String str, long j3, long j10) {
        int i10 = zzen.zza;
        this.zzb.zzb(str, j3, j10);
    }

    public final /* synthetic */ void zzo(String str) {
        int i10 = zzen.zza;
        this.zzb.zzc(str);
    }

    public final /* synthetic */ void zzp(zzhx zzhxVar) {
        zzhxVar.zza();
        int i10 = zzen.zza;
        this.zzb.zzd(zzhxVar);
    }

    public final /* synthetic */ void zzq(zzhx zzhxVar) {
        int i10 = zzen.zza;
        this.zzb.zze(zzhxVar);
    }

    public final /* synthetic */ void zzr(zzad zzadVar, zzhy zzhyVar) {
        int i10 = zzen.zza;
        this.zzb.zzf(zzadVar, zzhyVar);
    }

    public final /* synthetic */ void zzs(long j3) {
        int i10 = zzen.zza;
        this.zzb.zzg(j3);
    }

    public final /* synthetic */ void zzt(boolean z10) {
        int i10 = zzen.zza;
        this.zzb.zzn(z10);
    }

    public final /* synthetic */ void zzu(int i10, long j3, long j10) {
        int i11 = zzen.zza;
        this.zzb.zzk(i10, j3, j10);
    }

    public final void zzv(final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpc
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzs(j3);
                }
            });
        }
    }

    public final void zzw(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzt(z10);
                }
            });
        }
    }

    public final void zzx(final int i10, final long j3, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                @Override // java.lang.Runnable
                public final void run() {
                    zzpm.this.zzu(i10, j3, j10);
                }
            });
        }
    }
}
