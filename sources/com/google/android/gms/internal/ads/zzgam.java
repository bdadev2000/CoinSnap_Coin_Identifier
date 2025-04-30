package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
final class zzgam {
    public static int zza(int i9) {
        return (i9 + 1) * (i9 < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        zze(r11, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = com.google.android.gms.internal.ads.zzgau.zzb(r8)
            r1 = r0 & r10
            int r2 = zzc(r11, r1)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = r3
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = com.google.android.gms.internal.ads.zzfya.zza(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = com.google.android.gms.internal.ads.zzfya.zza(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            zze(r11, r1, r7)
            goto L38
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
        L38:
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgam.zzb(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int zzc(Object obj, int i9) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i9] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i9];
        }
        return ((int[]) obj)[i9];
    }

    public static Object zzd(int i9) {
        if (i9 >= 2 && i9 <= 1073741824 && Integer.highestOneBit(i9) == i9) {
            if (i9 <= 256) {
                return new byte[i9];
            }
            if (i9 <= 65536) {
                return new short[i9];
            }
            return new int[i9];
        }
        throw new IllegalArgumentException(o.h(i9, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void zze(Object obj, int i9, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }
}
