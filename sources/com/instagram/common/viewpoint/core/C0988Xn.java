package com.instagram.common.viewpoint.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0988Xn implements DV {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{33, 55, 49, 39, 32, 55, Byte.MAX_VALUE, 34, 62, 51, 43, 48, 51, 49, 57};
    }

    public C0988Xn(boolean z2) {
        this.A01 = z2 ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final int A6s() {
        A01();
        return this.A00.length;
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final MediaCodecInfo A6t(int i2) {
        A01();
        return this.A00[i2];
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final boolean A9g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 95));
    }

    @Override // com.instagram.common.viewpoint.core.DV
    public final boolean AG5() {
        return true;
    }
}
