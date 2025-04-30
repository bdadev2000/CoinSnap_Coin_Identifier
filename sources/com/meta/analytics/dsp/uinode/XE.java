package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XE extends AbstractC1093Co {
    public static byte[] A01;
    public static String[] A02 = {"sf1snlIsJ6W0T2FnClxHrZdECoWprGfm", "N", "", "r2HEyqcTBk5ynLpIwHNeKGT5pvsr0hUz", "VJBF4MChRorpvGWaO0TH3IkbIinT6ci", "gVX", "V2gxFGplaBAwDTpDKBzIrO8nmlXbG3Ru", "XRqJkaMKHgiwUJro7qWKl9bCL3sckU6K"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{42, Ascii.NAK, Ascii.DLE, Ascii.SYN, 79, 91, 74, 71, 65, 1, 65, 94, 91, 93};
    }

    static {
        A02();
        A03 = IF.A08(A01(0, 4, 111));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i9;
        int i10;
        int frames = bArr[0] & 255;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i9 = 1;
                break;
            case 1:
            case 2:
                i9 = 2;
                break;
            default:
                int toc2 = bArr[1];
                i9 = toc2 & 63;
                break;
        }
        int frames2 = frames >> 3;
        int i11 = frames2 & 3;
        if (frames2 >= 16) {
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            A02[5] = "Fg3";
            i10 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i11;
        } else if (frames2 >= 12) {
            int toc3 = i11 & 1;
            i10 = 10000 << toc3;
        } else {
            if (A02[2].length() == 12) {
                throw new RuntimeException();
            }
            A02[2] = "pnsJXiCpejNcXc3iNsNdzofu9hZ";
            if (i11 == 3) {
                i10 = 60000;
            } else {
                i10 = 10000 << i11;
            }
        }
        return i9 * i10;
    }

    private void A03(List<byte[]> initializationData, int i9) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i9 * C.NANOS_PER_SECOND) / 48000).array());
    }

    public static boolean A04(C1217Hz c1217Hz) {
        int A042 = c1217Hz.A04();
        byte[] bArr = A04;
        if (A042 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c1217Hz.A0c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final long A07(C1217Hz c1217Hz) {
        return A04(A00(c1217Hz.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final void A09(boolean z8) {
        super.A09(z8);
        if (z8) {
            this.A00 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final boolean A0A(C1217Hz c1217Hz, long j7, C1092Cn c1092Cn) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(c1217Hz.A00, c1217Hz.A07());
            int i9 = copyOf[9] & 255;
            int i10 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, i10);
            A03(arrayList, 3840);
            c1092Cn.A00 = Format.A07(null, A01(4, 10, 36), null, -1, -1, i9, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z8 = c1217Hz.A08() == A03;
        c1217Hz.A0Y(0);
        return z8;
    }
}
