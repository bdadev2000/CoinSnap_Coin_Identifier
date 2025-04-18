package com.google.android.gms.internal.ads;

import eb.j;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzgbw {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzgbw(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.ads.zzfwq.zzg(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.ads.zzfwq.zzg(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbw.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgbw) {
            zzgbw zzgbwVar = (zzgbw) obj;
            if (this.zzi == zzgbwVar.zzi && Arrays.equals(this.zzf, zzgbwVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i10) {
        return this.zzf[i10];
    }

    public final int zzb(char c10) throws zzgbz {
        if (c10 <= 127) {
            byte b3 = this.zzg[c10];
            if (b3 == -1) {
                if (c10 > ' ' && c10 != 127) {
                    throw new zzgbz("Unrecognized character: " + c10);
                }
                throw new zzgbz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
            }
            return b3;
        }
        throw new zzgbz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    public final zzgbw zzc() {
        boolean z10;
        int i10 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i10 < cArr.length) {
                if (zzfwa.zze(cArr[i10])) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < cArr.length) {
                            if (zzfwa.zzd(cArr[i11])) {
                                z10 = true;
                                break;
                            }
                            i11++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    zzfwq.zzl(!z10, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[this.zzf.length];
                    int i12 = 0;
                    while (true) {
                        char[] cArr3 = this.zzf;
                        if (i12 >= cArr3.length) {
                            break;
                        }
                        char c10 = cArr3[i12];
                        if (zzfwa.zze(c10)) {
                            c10 ^= 32;
                        }
                        cArr2[i12] = (char) c10;
                        i12++;
                    }
                    zzgbw zzgbwVar = new zzgbw(this.zze.concat(".lowerCase()"), cArr2);
                    if (this.zzi && !zzgbwVar.zzi) {
                        byte[] bArr = zzgbwVar.zzg;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i13 = 65; i13 <= 90; i13++) {
                            int i14 = i13 | 32;
                            byte[] bArr2 = zzgbwVar.zzg;
                            byte b3 = bArr2[i13];
                            byte b10 = bArr2[i14];
                            if (b3 == -1) {
                                copyOf[i13] = b10;
                            } else {
                                char c11 = (char) i13;
                                char c12 = (char) i14;
                                if (b10 == -1) {
                                    copyOf[i14] = b3;
                                } else {
                                    throw new IllegalStateException(zzfxf.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                }
                            }
                        }
                        return new zzgbw(zzgbwVar.zze.concat(".ignoreCase()"), zzgbwVar.zzf, copyOf, true);
                    }
                    return zzgbwVar;
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public final boolean zzd(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final boolean zze(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgbw(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzc = zzgck.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = zzc;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzc);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = zzc >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzgck.zzb(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z10;
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException(j.i("Illegal alphabet length ", cArr.length), e2);
        }
    }
}
