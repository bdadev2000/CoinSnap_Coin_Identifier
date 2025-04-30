package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzahq {
    public static final zzaho zza = new zzaho() { // from class: com.google.android.gms.internal.ads.zzahn
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzcd zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaho r13, com.google.android.gms.internal.ads.zzagr r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahq.zza(byte[], int, com.google.android.gms.internal.ads.zzaho, com.google.android.gms.internal.ads.zzagr):com.google.android.gms.internal.ads.zzcd");
    }

    private static int zzb(int i9) {
        return (i9 == 0 || i9 == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i9, int i10) {
        int zzd = zzd(bArr, i9);
        if (i10 == 0 || i10 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd < length - 1) {
                int i11 = zzd + 1;
                if ((zzd - i9) % 2 == 0 && bArr[i11] == 0) {
                    return zzd;
                }
                zzd = zzd(bArr, i11);
            } else {
                return length;
            }
        }
    }

    private static int zzd(byte[] bArr, int i9) {
        while (true) {
            int length = bArr.length;
            if (i9 < length) {
                if (bArr[i9] == 0) {
                    return i9;
                }
                i9++;
            } else {
                return length;
            }
        }
    }

    private static int zze(zzfu zzfuVar, int i9) {
        byte[] zzM = zzfuVar.zzM();
        int zzd = zzfuVar.zzd();
        int i10 = zzd;
        while (true) {
            int i11 = i10 + 1;
            if (i11 < zzd + i9) {
                if ((zzM[i10] & 255) == 255 && zzM[i11] == 0) {
                    System.arraycopy(zzM, i10 + 2, zzM, i11, (i9 - (i10 - zzd)) - 2);
                    i9--;
                }
                i10 = i11;
            } else {
                return i9;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.ads.zzahr zzf(int r35, com.google.android.gms.internal.ads.zzfu r36, boolean r37, int r38, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzaho r39) {
        /*
            Method dump skipped, instructions count: 1531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahq.zzf(int, com.google.android.gms.internal.ads.zzfu, boolean, int, com.google.android.gms.internal.ads.zzaho):com.google.android.gms.internal.ads.zzahr");
    }

    private static zzgbc zzg(byte[] bArr, int i9, int i10) {
        if (i10 >= bArr.length) {
            return zzgbc.zzn("");
        }
        zzgaz zzgazVar = new zzgaz();
        int zzc = zzc(bArr, i10, i9);
        while (i10 < zzc) {
            zzgazVar.zzf(new String(bArr, i10, zzc - i10, zzj(i9)));
            i10 = zzb(i9) + zzc;
            zzc = zzc(bArr, i10, i9);
        }
        zzgbc zzi = zzgazVar.zzi();
        if (zzi.isEmpty()) {
            return zzgbc.zzn("");
        }
        return zzi;
    }

    private static String zzh(byte[] bArr, int i9, int i10, Charset charset) {
        return (i10 <= i9 || i10 > bArr.length) ? "" : new String(bArr, i9, i10 - i9, charset);
    }

    private static String zzi(int i9, int i10, int i11, int i12, int i13) {
        if (i9 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    private static Charset zzj(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return zzfxs.zzb;
                }
                return zzfxs.zzc;
            }
            return zzfxs.zzd;
        }
        return zzfxs.zzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzk(com.google.android.gms.internal.ads.zzfu r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzd()
        L8:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r21.zzg()     // Catch: java.lang.Throwable -> L22
            long r8 = r21.zzu()     // Catch: java.lang.Throwable -> L22
            int r10 = r21.zzq()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lab
        L25:
            int r7 = r21.zzo()     // Catch: java.lang.Throwable -> L22
            int r8 = r21.zzo()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L22
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            goto La7
        L3b:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r24 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
        L48:
            r4 = r6
            goto La7
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L72
            goto L73
        L72:
            r4 = r6
        L73:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            goto L48
        L97:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La1
            goto L48
        La1:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L22
            r1.zzL(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        La7:
            r1.zzK(r2)
            return r4
        Lab:
            r1.zzK(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahq.zzk(com.google.android.gms.internal.ads.zzfu, int, int, boolean):boolean");
    }

    private static byte[] zzl(byte[] bArr, int i9, int i10) {
        if (i10 <= i9) {
            return zzgd.zzf;
        }
        return Arrays.copyOfRange(bArr, i9, i10);
    }
}
