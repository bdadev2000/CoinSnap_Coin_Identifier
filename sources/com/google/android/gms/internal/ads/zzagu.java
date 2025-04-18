package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzagu {
    public static final zzags zza = new Object() { // from class: com.google.android.gms.internal.ads.zzags
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzbk zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzags r13, com.google.android.gms.internal.ads.zzafw r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagu.zza(byte[], int, com.google.android.gms.internal.ads.zzags, com.google.android.gms.internal.ads.zzafw):com.google.android.gms.internal.ads.zzbk");
    }

    private static int zzb(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i2, int i3) {
        int zzd = zzd(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i4 = zzd + 1;
            if ((zzd - i2) % 2 == 0 && bArr[i4] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i4);
        }
    }

    private static int zzd(byte[] bArr, int i2) {
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    private static int zze(zzek zzekVar, int i2) {
        byte[] zzN = zzekVar.zzN();
        int zzd = zzekVar.zzd();
        int i3 = zzd;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= zzd + i2) {
                return i2;
            }
            if ((zzN[i3] & UnsignedBytes.MAX_VALUE) == 255 && zzN[i4] == 0) {
                System.arraycopy(zzN, i3 + 2, zzN, i4, (i2 - (i3 - zzd)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    private static zzgax zzf(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return zzgax.zzo("");
        }
        zzgau zzgauVar = new zzgau();
        int zzc = zzc(bArr, i3, i2);
        while (i3 < zzc) {
            zzgauVar.zzf(new String(bArr, i3, zzc - i3, zzi(i2)));
            i3 = zzb(i2) + zzc;
            zzc = zzc(bArr, i3, i2);
        }
        zzgax zzi = zzgauVar.zzi();
        return zzi.isEmpty() ? zzgax.zzo("") : zzi;
    }

    private static String zzg(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    private static String zzh(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    private static Charset zzi(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? zzfxo.zzb : zzfxo.zzc : zzfxo.zzd : zzfxo.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzj(com.google.android.gms.internal.ads.zzek r21, int r22, int r23, boolean r24) {
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
            r1.zzM(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        La7:
            r1.zzL(r2)
            return r4
        Lab:
            r1.zzL(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagu.zzj(com.google.android.gms.internal.ads.zzek, int, int, boolean):boolean");
    }

    private static byte[] zzk(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? zzeu.zzf : Arrays.copyOfRange(bArr, i2, i3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.ads.zzagv zzl(int r35, com.google.android.gms.internal.ads.zzek r36, boolean r37, int r38, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzags r39) {
        /*
            Method dump skipped, instructions count: 1531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagu.zzl(int, com.google.android.gms.internal.ads.zzek, boolean, int, com.google.android.gms.internal.ads.zzags):com.google.android.gms.internal.ads.zzagv");
    }
}
