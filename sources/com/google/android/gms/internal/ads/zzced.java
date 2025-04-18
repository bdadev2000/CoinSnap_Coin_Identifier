package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzced implements zzkl {
    private final zzys zza = new zzys(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zzb(zzoj zzojVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzc(zzoj zzojVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzd(zzoj zzojVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zze(zzoj zzojVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzf(zzoj zzojVar, zzbv zzbvVar, zzur zzurVar, zzln[] zzlnVarArr, zzwr zzwrVar, zzyd[] zzydVarArr) {
        int i10;
        int i11 = 0;
        this.zzf = 0;
        while (true) {
            int length = zzlnVarArr.length;
            if (i11 < 2) {
                if (zzydVarArr[i11] != null) {
                    int i12 = this.zzf;
                    if (zzlnVarArr[i11].zzb() != 1) {
                        i10 = 131072000;
                    } else {
                        i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                    }
                    this.zzf = i12 + i10;
                }
                i11++;
            } else {
                this.zza.zzf(this.zzf);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzg(zzoj zzojVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzh(zzkk zzkkVar) {
        long j3 = zzkkVar.zzb;
        boolean z10 = true;
        char c10 = j3 > this.zzc ? (char) 0 : j3 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i10 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || zza >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzi(zzkk zzkkVar) {
        long j3 = zzkkVar.zzd ? this.zze : this.zzd;
        return j3 <= 0 || zzkkVar.zzb >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzys zzj() {
        return this.zza;
    }

    public final synchronized void zzk(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzc = i10 * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzb = i10 * 1000;
    }
}
