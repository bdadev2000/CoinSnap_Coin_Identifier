package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzajh {
    public final zzaje zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzajh(zzaje zzajeVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
        boolean z10;
        boolean z11;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        int length3 = jArr.length;
        if (length3 == length2) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdb.zzd(z11);
        int length4 = iArr2.length;
        zzdb.zzd(length4 == length2);
        this.zza = zzajeVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i10;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j3;
        this.zzb = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int zza(long j3) {
        for (int zzd = zzen.zzd(this.zzf, j3, true, false); zzd >= 0; zzd--) {
            if ((this.zzg[zzd] & 1) != 0) {
                return zzd;
            }
        }
        return -1;
    }

    public final int zzb(long j3) {
        for (int zza = zzen.zza(this.zzf, j3, true, false); zza < this.zzf.length; zza++) {
            if ((this.zzg[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }
}
