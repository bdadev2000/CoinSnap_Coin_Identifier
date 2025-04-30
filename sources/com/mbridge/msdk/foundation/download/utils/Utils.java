package com.mbridge.msdk.foundation.download.utils;

/* loaded from: classes3.dex */
public final class Utils {
    private Utils() {
    }

    public static int getDownloadRate(long j7, long j9) {
        if (j7 == 0 || j9 == 0) {
            return 0;
        }
        if (j7 == j9) {
            return 100;
        }
        return (int) (((j9 * 1.0d) / (j7 * 1.0d)) * 100.0d);
    }
}
