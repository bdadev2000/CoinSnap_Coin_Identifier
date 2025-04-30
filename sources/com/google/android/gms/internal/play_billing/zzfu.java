package com.google.android.gms.internal.play_billing;

import com.applovin.exoplayer2.common.base.Ascii;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfu {
    public static final /* synthetic */ int zza = 0;
    private static final zzfr zzb;

    static {
        if (zzfp.zzx() && zzfp.zzy()) {
            int i9 = zzbb.zza;
        }
        zzb = new zzfs();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i9, int i10) {
        int i11 = i10 - i9;
        byte b = bArr[i9 - 1];
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    byte b8 = bArr[i9];
                    byte b9 = bArr[i9 + 1];
                    if (b <= -12 && b8 <= -65 && b9 <= -65) {
                        return (b9 << Ascii.DLE) ^ ((b8 << 8) ^ b);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            byte b10 = bArr[i9];
            if (b <= -12 && b10 <= -65) {
                return (b10 << 8) ^ b;
            }
            return -1;
        }
        if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzfu.zzb(java.lang.String, byte[], int, int):int");
    }

    public static int zzc(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i9 += (127 - charAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new zzft(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static boolean zzd(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zze(byte[] bArr, int i9, int i10) {
        return zzb.zzb(bArr, i9, i10);
    }
}
