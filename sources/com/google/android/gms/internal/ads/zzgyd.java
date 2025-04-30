package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgyd {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i9) {
        if (i9 >= 0 && byteBuffer2.remaining() >= i9 && byteBuffer3.remaining() >= i9 && byteBuffer.remaining() >= i9) {
            for (int i10 = 0; i10 < i9; i10++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] zzb(byte[]... bArr) throws GeneralSecurityException {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 < bArr.length) {
                int length = bArr[i9].length;
                if (i10 <= Integer.MAX_VALUE - length) {
                    i10 += length;
                    i9++;
                } else {
                    throw new GeneralSecurityException("exceeded size limit");
                }
            } else {
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                for (byte[] bArr3 : bArr) {
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length2);
                    i11 += length2;
                }
                return bArr2;
            }
        }
    }

    public static final byte[] zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return zzd(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zzd(byte[] bArr, int i9, byte[] bArr2, int i10, int i11) {
        if (bArr.length - i11 >= i9 && bArr2.length - i11 >= i10) {
            byte[] bArr3 = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr3[i12] = (byte) (bArr[i12 + i9] ^ bArr2[i12 + i10]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
}
