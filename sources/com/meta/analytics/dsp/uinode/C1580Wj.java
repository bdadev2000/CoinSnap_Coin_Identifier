package com.meta.analytics.dsp.uinode;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1580Wj implements DQ {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    public C1580Wj() {
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final int A6U() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final MediaCodecInfo A6V(int i9) {
        return MediaCodecList.getCodecInfoAt(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean A9H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 2).equals(str);
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean AFf() {
        return false;
    }
}
