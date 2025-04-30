package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzc {
    public final long zzc;
    public final int zzd;

    @Deprecated
    public final Uri[] zze;
    public final zzbu[] zzf;
    public final int[] zzg;
    public final long[] zzh;
    public final long zzi;
    public final boolean zzj;
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    private static final String zzq = Integer.toString(6, 36);
    private static final String zzr = Integer.toString(7, 36);
    static final String zza = Integer.toString(8, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzb
    };

    public zzc(long j7) {
        this(0L, -1, -1, new int[0], new zzbu[0], new long[0], 0L, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzc.class == obj.getClass()) {
            zzc zzcVar = (zzc) obj;
            if (this.zzd == zzcVar.zzd && Arrays.equals(this.zzf, zzcVar.zzf) && Arrays.equals(this.zzg, zzcVar.zzg) && Arrays.equals(this.zzh, zzcVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzh) + ((Arrays.hashCode(this.zzg) + ((Arrays.hashCode(this.zzf) + (((this.zzd * 31) - 1) * 961)) * 31)) * 31)) * 961;
    }

    public final int zza(int i9) {
        int i10;
        int i11 = i9 + 1;
        while (true) {
            int[] iArr = this.zzg;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    @CheckResult
    public final zzc zzb(int i9) {
        int[] iArr = this.zzg;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzh;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, C.TIME_UNSET);
        return new zzc(0L, 0, -1, copyOf, (zzbu[]) Arrays.copyOf(this.zzf, 0), copyOf2, 0L, false);
    }

    private zzc(long j7, int i9, int i10, int[] iArr, zzbu[] zzbuVarArr, long[] jArr, long j9, boolean z8) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzbuVarArr.length;
        int i11 = 0;
        zzeq.zzd(length == length2);
        this.zzc = 0L;
        this.zzd = i9;
        this.zzg = iArr;
        this.zzf = zzbuVarArr;
        this.zzh = jArr;
        this.zzi = 0L;
        this.zzj = false;
        this.zze = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zze;
            if (i11 >= uriArr.length) {
                return;
            }
            zzbu zzbuVar = zzbuVarArr[i11];
            if (zzbuVar == null) {
                uri = null;
            } else {
                zzbn zzbnVar = zzbuVar.zzd;
                zzbnVar.getClass();
                uri = zzbnVar.zzb;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }
}
