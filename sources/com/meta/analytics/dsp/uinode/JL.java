package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum JL {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 111);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    JL(long j7, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j7;
        this.A01 = mediaCacheFlag;
    }

    public static JL A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (JL jl : values()) {
            if (jl.A01 == mediaCacheFlag) {
                return jl;
            }
        }
        return null;
    }
}
