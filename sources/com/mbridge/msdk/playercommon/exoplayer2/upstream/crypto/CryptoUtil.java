package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

/* loaded from: classes4.dex */
final class CryptoUtil {
    private CryptoUtil() {
    }

    public static long getFNV64Hash(String str) {
        long j3 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            long charAt = j3 ^ str.charAt(i10);
            j3 = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j3;
    }
}
