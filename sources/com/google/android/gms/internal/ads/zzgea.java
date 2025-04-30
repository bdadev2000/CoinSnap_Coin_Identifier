package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgea extends zzgeb {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i9, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] != i9) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public static int zzb(long j7) {
        boolean z8;
        int i9 = (int) j7;
        if (i9 == j7) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzg(z8, "Out of range: %s", j7);
        return i9;
    }

    public static int zzc(int i9, int i10, int i11) {
        zzfyg.zzh(true, "min (%s) must be less than or equal to max (%s)", i10, 1073741823);
        return Math.min(Math.max(i9, i10), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        boolean z8;
        int length = bArr.length;
        if (length >= 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzh(z8, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << Ascii.CAN) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static List zzf(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzgdz(iArr, 0, length);
    }

    public static int[] zzg(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = array[i9];
            obj.getClass();
            iArr[i9] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
