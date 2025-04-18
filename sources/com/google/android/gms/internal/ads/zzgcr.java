package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzgcr extends zzgcs {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int zzb(long j3) {
        boolean z10;
        int i10 = (int) j3;
        if (i10 == j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzh(z10, "Out of range: %s", j3);
        return i10;
    }

    public static int zzc(int i10, int i11, int i12) {
        zzfwq.zzi(true, "min (%s) must be less than or equal to max (%s)", i11, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        return Math.min(Math.max(i10, i11), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public static int zzd(byte[] bArr) {
        boolean z10;
        int length = bArr.length;
        if (length >= 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzi(z10, "array too small: %s < %s", length, 4);
        return (bArr[3] & UByte.MAX_VALUE) | (bArr[0] << Ascii.CAN) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8);
    }

    public static int zze(long j3) {
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }

    public static Integer zzf(String str, int i10) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i11 = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i11 = 1;
            }
            if (i11 != str.length()) {
                int i12 = i11 + 1;
                int zza = zzgct.zza(str.charAt(i11));
                if (zza >= 0 && zza < 10) {
                    long j3 = -zza;
                    while (true) {
                        if (i12 < str.length()) {
                            int i13 = i12 + 1;
                            int zza2 = zzgct.zza(str.charAt(i12));
                            if (zza2 < 0 || zza2 >= 10 || j3 < -922337203685477580L) {
                                break;
                            }
                            long j10 = j3 * 10;
                            long j11 = zza2;
                            if (j10 < Long.MIN_VALUE + j11) {
                                break;
                            }
                            j3 = j10 - j11;
                            i12 = i13;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j3);
                        } else if (j3 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j3);
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
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzgcq(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
