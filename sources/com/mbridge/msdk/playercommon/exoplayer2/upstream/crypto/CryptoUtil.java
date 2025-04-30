package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

/* loaded from: classes3.dex */
final class CryptoUtil {
    private CryptoUtil() {
    }

    public static long getFNV64Hash(String str) {
        long j7 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i9 = 0; i9 < str.length(); i9++) {
            long charAt = j7 ^ str.charAt(i9);
            j7 = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j7;
    }
}
