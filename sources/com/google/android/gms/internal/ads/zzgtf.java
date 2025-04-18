package com.google.android.gms.internal.ads;

import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class zzgtf {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            byte b3 = (byte) ((b2 + b2) & 254);
            bArr2[i2] = b3;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((bArr[i3] >> 7) & 1) | b3);
            }
            i2 = i3;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & Opcodes.I2D)) ^ bArr2[15]);
        return bArr2;
    }
}
