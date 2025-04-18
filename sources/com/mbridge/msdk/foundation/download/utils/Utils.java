package com.mbridge.msdk.foundation.download.utils;

/* loaded from: classes4.dex */
public final class Utils {
    private Utils() {
    }

    public static int getDownloadRate(long j3, long j10) {
        if (j3 == 0 || j10 == 0) {
            return 0;
        }
        if (j3 == j10) {
            return 100;
        }
        return (int) (((j10 * 1.0d) / (j3 * 1.0d)) * 100.0d);
    }
}
