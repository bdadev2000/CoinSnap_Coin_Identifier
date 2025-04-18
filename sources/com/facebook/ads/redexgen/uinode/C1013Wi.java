package com.facebook.ads.redexgen.uinode;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1013Wi implements DQ {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{3, -11, -13, 5, 2, -11, -67, 0, -4, -15, 9, -14, -15, -13, -5};
    }

    public C1013Wi(boolean z10) {
        this.A01 = z10 ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final int A6U() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final MediaCodecInfo A6V(int i10) {
        A01();
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final boolean A9H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 99));
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final boolean AFf() {
        return true;
    }
}
