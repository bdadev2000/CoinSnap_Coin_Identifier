package com.instagram.common.viewpoint.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0989Xo implements DV {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{73, 86, 91, 90, 80, 16, 94, 73, 92};
    }

    public C0989Xo() {
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final int A6s() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final MediaCodecInfo A6t(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final boolean A9g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 16).equals(str);
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final boolean AG5() {
        return false;
    }
}
