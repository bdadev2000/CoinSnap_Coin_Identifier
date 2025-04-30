package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
abstract class zzhfc {
    public static final String zzd(ByteBuffer byteBuffer, int i9, int i10) throws zzhcd {
        int i11;
        if ((((byteBuffer.limit() - i9) - i10) | i9 | i10) >= 0) {
            int i12 = i9 + i10;
            char[] cArr = new char[i10];
            int i13 = 0;
            while (i9 < i12) {
                byte b = byteBuffer.get(i9);
                if (!zzhfb.zzd(b)) {
                    break;
                }
                i9++;
                cArr[i13] = (char) b;
                i13++;
            }
            int i14 = i13;
            while (i9 < i12) {
                int i15 = i9 + 1;
                byte b8 = byteBuffer.get(i9);
                if (zzhfb.zzd(b8)) {
                    cArr[i14] = (char) b8;
                    i14++;
                    i9 = i15;
                    while (i9 < i12) {
                        byte b9 = byteBuffer.get(i9);
                        if (zzhfb.zzd(b9)) {
                            i9++;
                            cArr[i14] = (char) b9;
                            i14++;
                        }
                    }
                } else {
                    if (zzhfb.zzf(b8)) {
                        if (i15 < i12) {
                            i11 = i14 + 1;
                            i9 += 2;
                            zzhfb.zzc(b8, byteBuffer.get(i15), cArr, i14);
                        } else {
                            throw zzhcd.zzd();
                        }
                    } else if (zzhfb.zze(b8)) {
                        if (i15 < i12 - 1) {
                            i11 = i14 + 1;
                            int i16 = i9 + 2;
                            i9 += 3;
                            zzhfb.zzb(b8, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i14);
                        } else {
                            throw zzhcd.zzd();
                        }
                    } else if (i15 < i12 - 2) {
                        byte b10 = byteBuffer.get(i15);
                        int i17 = i9 + 3;
                        byte b11 = byteBuffer.get(i9 + 2);
                        i9 += 4;
                        zzhfb.zza(b8, b10, b11, byteBuffer.get(i17), cArr, i14);
                        i14 += 2;
                    } else {
                        throw zzhcd.zzd();
                    }
                    i14 = i11;
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    public abstract int zza(int i9, byte[] bArr, int i10, int i11);

    public abstract String zzb(byte[] bArr, int i9, int i10) throws zzhcd;

    public final boolean zzc(byte[] bArr, int i9, int i10) {
        if (zza(0, bArr, i9, i10) != 0) {
            return false;
        }
        return true;
    }
}
