package com.meta.analytics.dsp.uinode;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1579Wi implements DQ {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{3, -11, -13, 5, 2, -11, -67, 0, -4, -15, 9, -14, -15, -13, -5};
    }

    public C1579Wi(boolean z8) {
        this.A01 = z8 ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final int A6U() {
        A01();
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final MediaCodecInfo A6V(int i9) {
        A01();
        return this.A00[i9];
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean A9H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 99));
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean AFf() {
        return true;
    }
}
