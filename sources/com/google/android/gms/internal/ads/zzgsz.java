package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsz {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            int i9 = 0;
            while (i9 < 16) {
                int i10 = i9 + 1;
                byte b = bArr[i9];
                byte b8 = (byte) ((b + b) & 254);
                bArr2[i9] = b8;
                if (i9 < 15) {
                    bArr2[i9] = (byte) (((bArr[i10] >> 7) & 1) | b8);
                }
                i9 = i10;
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
