package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaju {
    public final zzajr zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaju(zzajr zzajrVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzdi.zzd(length == length2);
        int length3 = jArr.length;
        zzdi.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdi.zzd(length4 == length2);
        this.zza = zzajrVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i2;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j2;
        this.zzb = length3;
        if (length4 > 0) {
            int i3 = length4 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }

    public final int zza(long j2) {
        for (int zzc = zzeu.zzc(this.zzf, j2, true, false); zzc >= 0; zzc--) {
            if ((this.zzg[zzc] & 1) != 0) {
                return zzc;
            }
        }
        return -1;
    }

    public final int zzb(long j2) {
        for (int zza = zzeu.zza(this.zzf, j2, true, false); zza < this.zzf.length; zza++) {
            if ((this.zzg[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }
}
