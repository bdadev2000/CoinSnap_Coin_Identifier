package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zza {
    public static final /* synthetic */ int zzi = 0;
    public final long zza;
    public final int zzb;

    @Deprecated
    public final Uri[] zzc;
    public final zzbc[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public zza(long j2) {
        this(0L, -1, -1, new int[0], new zzbc[0], new long[0], 0L, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.zzb == zzaVar.zzb && Arrays.equals(this.zzd, zzaVar.zzd) && Arrays.equals(this.zze, zzaVar.zze) && Arrays.equals(this.zzf, zzaVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzf) + ((Arrays.hashCode(this.zze) + ((Arrays.hashCode(this.zzd) + (((this.zzb * 31) - 1) * 961)) * 31)) * 31)) * 961;
    }

    public final int zza(@IntRange int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    @CheckResult
    public final zza zzb(int i2) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zza(0L, 0, -1, copyOf, (zzbc[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0L, false);
    }

    private zza(long j2, int i2, int i3, int[] iArr, zzbc[] zzbcVarArr, long[] jArr, long j3, boolean z2) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzbcVarArr.length;
        int i4 = 0;
        zzdi.zzd(length == length2);
        this.zza = 0L;
        this.zzb = i2;
        this.zze = iArr;
        this.zzd = zzbcVarArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i4 >= uriArr.length) {
                return;
            }
            zzbc zzbcVar = zzbcVarArr[i4];
            if (zzbcVar == null) {
                uri = null;
            } else {
                zzax zzaxVar = zzbcVar.zzb;
                zzaxVar.getClass();
                uri = zzaxVar.zza;
            }
            uriArr[i4] = uri;
            i4++;
        }
    }
}
