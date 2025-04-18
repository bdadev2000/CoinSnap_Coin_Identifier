package com.facebook.ads.redexgen.uinode;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1014Wj implements DQ {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    public C1014Wj() {
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final int A6U() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final MediaCodecInfo A6V(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final boolean A9H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 2).equals(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.DQ
    public final boolean AFf() {
        return false;
    }
}
