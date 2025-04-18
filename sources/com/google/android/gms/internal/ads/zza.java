package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zza {
    public static final /* synthetic */ int zzi = 0;
    public final long zza;
    public final int zzb;

    @Deprecated
    public final Uri[] zzc;
    public final zzaw[] zzd;
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

    public zza(long j3) {
        this(0L, -1, -1, new int[0], new zzaw[0], new long[0], 0L, false);
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

    public final int zza(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    @CheckResult
    public final zza zzb(int i10) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, C.TIME_UNSET);
        return new zza(0L, 0, -1, copyOf, (zzaw[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0L, false);
    }

    private zza(long j3, int i10, int i11, int[] iArr, zzaw[] zzawVarArr, long[] jArr, long j10, boolean z10) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzawVarArr.length;
        int i12 = 0;
        zzdb.zzd(length == length2);
        this.zza = 0L;
        this.zzb = i10;
        this.zze = iArr;
        this.zzd = zzawVarArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i12 >= uriArr.length) {
                return;
            }
            zzaw zzawVar = zzawVarArr[i12];
            if (zzawVar == null) {
                uri = null;
            } else {
                zzar zzarVar = zzawVar.zzb;
                zzarVar.getClass();
                uri = zzarVar.zza;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }
}
