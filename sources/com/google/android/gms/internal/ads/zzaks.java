package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaks {
    public final zzakp zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaks(zzakp zzakpVar, long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j7) {
        boolean z8;
        boolean z9;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        int length3 = jArr.length;
        if (length3 == length2) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzeq.zzd(z9);
        int length4 = iArr2.length;
        zzeq.zzd(length4 == length2);
        this.zza = zzakpVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i9;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j7;
        this.zzb = length3;
        if (length4 > 0) {
            int i10 = length4 - 1;
            iArr2[i10] = iArr2[i10] | 536870912;
        }
    }

    public final int zza(long j7) {
        for (int zzc = zzgd.zzc(this.zzf, j7, true, false); zzc >= 0; zzc--) {
            if ((this.zzg[zzc] & 1) != 0) {
                return zzc;
            }
        }
        return -1;
    }

    public final int zzb(long j7) {
        for (int zza = zzgd.zza(this.zzf, j7, true, false); zza < this.zzf.length; zza++) {
            if ((this.zzg[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }
}
