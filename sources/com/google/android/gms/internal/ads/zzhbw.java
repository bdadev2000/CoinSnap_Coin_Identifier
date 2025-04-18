package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
abstract class zzhbw {
    public static final String zzc(ByteBuffer byteBuffer, int i10, int i11) throws zzgzm {
        if ((((byteBuffer.limit() - i10) - i11) | i10 | i11) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b3 = byteBuffer.get(i10);
                if (!zzhbv.zzd(b3)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b3;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = byteBuffer.get(i10);
                if (zzhbv.zzd(b10)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b10;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 < i12) {
                            byte b11 = byteBuffer.get(i10);
                            if (zzhbv.zzd(b11)) {
                                i10++;
                                i16 = i14 + 1;
                                cArr[i14] = (char) b11;
                            }
                        }
                    }
                } else if (zzhbv.zzf(b10)) {
                    if (i15 < i12) {
                        zzhbv.zzc(b10, byteBuffer.get(i15), cArr, i14);
                        i14++;
                        i10 = i15 + 1;
                    } else {
                        throw new zzgzm("Protocol message had invalid UTF-8.");
                    }
                } else if (zzhbv.zze(b10)) {
                    if (i15 < i12 - 1) {
                        int i17 = i15 + 1;
                        zzhbv.zzb(b10, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                        i14++;
                        i10 = i17 + 1;
                    } else {
                        throw new zzgzm("Protocol message had invalid UTF-8.");
                    }
                } else if (i15 < i12 - 2) {
                    int i18 = i15 + 1;
                    byte b12 = byteBuffer.get(i15);
                    int i19 = i18 + 1;
                    zzhbv.zza(b10, b12, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                    i14 += 2;
                    i10 = i19 + 1;
                } else {
                    throw new zzgzm("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    public abstract String zzb(byte[] bArr, int i10, int i11) throws zzgzm;
}
