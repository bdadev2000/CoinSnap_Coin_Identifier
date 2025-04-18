package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* loaded from: classes3.dex */
public final class zzceh implements zzko {
    private final zzza zza = new zzza(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @VisibleForTesting
    public final void zza(boolean z2) {
        this.zzf = 0;
        this.zzg = false;
        if (z2) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zzb(zzom zzomVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc(zzom zzomVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd(zzom zzomVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zze(zzom zzomVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzf(zzom zzomVar, zzcc zzccVar, zzuy zzuyVar, zzlr[] zzlrVarArr, zzwy zzwyVar, zzyl[] zzylVarArr) {
        int i2 = 0;
        this.zzf = 0;
        while (true) {
            int length = zzlrVarArr.length;
            if (i2 >= 2) {
                this.zza.zzf(this.zzf);
                return;
            } else {
                if (zzylVarArr[i2] != null) {
                    this.zzf += zzlrVarArr[i2].zzb() != 1 ? 131072000 : 13107200;
                }
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(zzom zzomVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzh(zzkn zzknVar) {
        long j2 = zzknVar.zzb;
        boolean z2 = true;
        char c2 = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i2 = this.zzf;
        if (c2 != 2 && (c2 != 1 || !this.zzg || zza >= i2)) {
            z2 = false;
        }
        this.zzg = z2;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzi(zzkn zzknVar) {
        long j2 = zzknVar.zzd ? this.zze : this.zzd;
        return j2 <= 0 || zzknVar.zzb >= j2;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzza zzj() {
        return this.zza;
    }

    public final synchronized void zzk(int i2) {
        this.zzd = i2 * 1000;
    }

    public final synchronized void zzl(int i2) {
        this.zze = i2 * 1000;
    }

    public final synchronized void zzm(int i2) {
        this.zzc = i2 * 1000;
    }

    public final synchronized void zzn(int i2) {
        this.zzb = i2 * 1000;
    }
}
