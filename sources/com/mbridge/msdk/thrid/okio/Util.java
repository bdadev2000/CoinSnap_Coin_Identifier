package com.mbridge.msdk.thrid.okio;

import java.nio.charset.Charset;
import kotlin.UShort;

/* loaded from: classes4.dex */
final class Util {
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Util() {
    }

    public static boolean arrayRangeEquals(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static void checkOffsetAndCount(long j3, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j3 && j3 - j10 >= j11) {
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j3), Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static int reverseBytesInt(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static long reverseBytesLong(long j3) {
        return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
    }

    public static short reverseBytesShort(short s5) {
        int i10 = s5 & UShort.MAX_VALUE;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static void sneakyRethrow(Throwable th2) {
        sneakyThrow2(th2);
    }

    private static <T extends Throwable> void sneakyThrow2(Throwable th2) throws Throwable {
        throw th2;
    }
}
