package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgre {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            int i10 = 0;
            while (i10 < 16) {
                int i11 = i10 + 1;
                byte b3 = bArr[i10];
                byte b10 = (byte) ((b3 + b3) & 254);
                bArr2[i10] = b10;
                if (i10 < 15) {
                    bArr2[i10] = (byte) (((bArr[i11] >> 7) & 1) | b10);
                }
                i10 = i11;
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
