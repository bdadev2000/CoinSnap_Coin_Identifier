package org.jacoco.core.internal.data;

/* loaded from: classes3.dex */
public final class CRC64 {
    private static final long[] LOOKUPTABLE = new long[256];
    private static final long POLY64REV = -2882303761517117440L;

    static {
        for (int i2 = 0; i2 < 256; i2++) {
            long j2 = i2;
            for (int i3 = 0; i3 < 8; i3++) {
                j2 = (j2 & 1) == 1 ? (j2 >>> 1) ^ POLY64REV : j2 >>> 1;
            }
            LOOKUPTABLE[i2] = j2;
        }
    }

    private CRC64() {
    }

    public static long classId(byte[] bArr) {
        return (bArr.length > 7 && bArr[6] == 0 && bArr[7] == 53) ? update(update(update(0L, bArr, 0, 7), (byte) 52), bArr, 8, bArr.length) : update(0L, bArr, 0, bArr.length);
    }

    private static long update(long j2, byte b2) {
        return (j2 >>> 8) ^ LOOKUPTABLE[(b2 ^ ((int) j2)) & 255];
    }

    private static long update(long j2, byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            j2 = update(j2, bArr[i2]);
            i2++;
        }
        return j2;
    }
}
