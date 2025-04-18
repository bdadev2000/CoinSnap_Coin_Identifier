package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public enum JQ {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    JQ(long j2, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j2;
        this.A01 = mediaCacheFlag;
    }

    @Nullable
    public static JQ A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (JQ jq : values()) {
            if (jq.A01 == mediaCacheFlag) {
                return jq;
            }
        }
        return null;
    }
}
