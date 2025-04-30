package com.mbridge.msdk.thrid.okio;

import java.nio.charset.Charset;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
final class Util {
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Util() {
    }

    public static boolean arrayRangeEquals(byte[] bArr, int i9, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i9] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static void checkOffsetAndCount(long j7, long j9, long j10) {
        if ((j9 | j10) >= 0 && j9 <= j7 && j7 - j9 >= j10) {
            return;
        }
        StringBuilder a6 = AbstractC2933a.a("size=", j7, " offset=");
        a6.append(j9);
        a6.append(" byteCount=");
        a6.append(j10);
        throw new ArrayIndexOutOfBoundsException(a6.toString());
    }

    public static int reverseBytesInt(int i9) {
        return ((i9 & 255) << 24) | (((-16777216) & i9) >>> 24) | ((16711680 & i9) >>> 8) | ((65280 & i9) << 8);
    }

    public static long reverseBytesLong(long j7) {
        return ((j7 & 255) << 56) | (((-72057594037927936L) & j7) >>> 56) | ((71776119061217280L & j7) >>> 40) | ((280375465082880L & j7) >>> 24) | ((1095216660480L & j7) >>> 8) | ((4278190080L & j7) << 8) | ((16711680 & j7) << 24) | ((65280 & j7) << 40);
    }

    public static short reverseBytesShort(short s5) {
        return (short) (((s5 & 255) << 8) | ((65280 & s5) >>> 8));
    }

    public static void sneakyRethrow(Throwable th) {
        sneakyThrow2(th);
    }

    private static <T extends Throwable> void sneakyThrow2(Throwable th) throws Throwable {
        throw th;
    }
}
