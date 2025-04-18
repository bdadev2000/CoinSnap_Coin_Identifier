package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import okio.internal.Buffer;

/* loaded from: classes4.dex */
public final class zzgdu extends zzgdv {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static int zzb(long j2) {
        int i2 = (int) j2;
        zzfxz.zzg(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int zzc(int i2, int i3, int i4) {
        zzfxz.zzh(true, "min (%s) must be less than or equal to max (%s)", i3, 1073741823);
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzfxz.zzh(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & UnsignedBytes.MAX_VALUE) | (bArr[0] << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static int zze(long j2) {
        if (j2 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static Integer zzf(String str, int i2) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i3 = charAt == '-' ? 1 : 0;
            if (i3 != str.length()) {
                int i4 = i3 + 1;
                int zza = zzgdw.zza(str.charAt(i3));
                if (zza >= 0 && zza < 10) {
                    long j2 = -zza;
                    while (true) {
                        if (i4 < str.length()) {
                            int i5 = i4 + 1;
                            int zza2 = zzgdw.zza(str.charAt(i4));
                            if (zza2 < 0 || zza2 >= 10 || j2 < Buffer.OVERFLOW_ZONE) {
                                break;
                            }
                            long j3 = j2 * 10;
                            long j4 = zza2;
                            if (j3 < Long.MIN_VALUE + j4) {
                                break;
                            }
                            j2 = j3 - j4;
                            i4 = i5;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j2);
                        } else if (j2 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j2);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new zzgdt(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
