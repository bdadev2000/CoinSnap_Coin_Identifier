package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzcgb implements zzlk {
    private final zzzv zzb = new zzzv(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    public final void zza(boolean z8) {
        this.zzg = 0;
        this.zzh = false;
        if (z8) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final long zzb(zzpj zzpjVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzc(zzpj zzpjVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzd(zzpj zzpjVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zze(zzpj zzpjVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzf(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, zzmn[] zzmnVarArr, zzxr zzxrVar, zzzg[] zzzgVarArr) {
        int i9;
        int i10 = 0;
        this.zzg = 0;
        while (true) {
            int length = zzmnVarArr.length;
            if (i10 < 2) {
                if (zzzgVarArr[i10] != null) {
                    int i11 = this.zzg;
                    if (zzmnVarArr[i10].zzb() != 1) {
                        i9 = 131072000;
                    } else {
                        i9 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                    }
                    this.zzg = i11 + i9;
                }
                i10++;
            } else {
                this.zzb.zzf(this.zzg);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzg(zzpj zzpjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzh(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j7, long j9, float f9) {
        boolean z8 = true;
        char c9 = j9 > this.zzd ? (char) 0 : j9 < this.zzc ? (char) 2 : (char) 1;
        int zza = this.zzb.zza();
        int i9 = this.zzg;
        if (c9 != 2 && (c9 != 1 || !this.zzh || zza >= i9)) {
            z8 = false;
        }
        this.zzh = z8;
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzi(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j7, float f9, boolean z8, long j9) {
        long j10 = z8 ? this.zzf : this.zze;
        return j10 <= 0 || j7 >= j10;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final zzzv zzj() {
        return this.zzb;
    }

    public final synchronized void zzk(int i9) {
        this.zze = i9 * 1000;
    }

    public final synchronized void zzl(int i9) {
        this.zzf = i9 * 1000;
    }

    public final synchronized void zzm(int i9) {
        this.zzd = i9 * 1000;
    }

    public final synchronized void zzn(int i9) {
        this.zzc = i9 * 1000;
    }
}
