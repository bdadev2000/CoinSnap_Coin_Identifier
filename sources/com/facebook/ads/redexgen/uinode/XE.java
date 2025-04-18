package com.facebook.ads.redexgen.uinode;

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
import kotlin.UByte;

/* loaded from: assets/audience_network.dex */
public final class XE extends AbstractC0527Co {
    public static byte[] A01;
    public static String[] A02 = {"sf1snlIsJ6W0T2FnClxHrZdECoWprGfm", "N", "", "r2HEyqcTBk5ynLpIwHNeKGT5pvsr0hUz", "VJBF4MChRorpvGWaO0TH3IkbIinT6ci", "gVX", "V2gxFGplaBAwDTpDKBzIrO8nmlXbG3Ru", "XRqJkaMKHgiwUJro7qWKl9bCL3sckU6K"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
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
        int i10;
        int i11;
        int frames = bArr[0] & UByte.MAX_VALUE;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i10 = 1;
                break;
            case 1:
            case 2:
                i10 = 2;
                break;
            default:
                int toc2 = bArr[1];
                i10 = toc2 & 63;
                break;
        }
        int frames2 = frames >> 3;
        int i12 = frames2 & 3;
        if (frames2 >= 16) {
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            A02[5] = "Fg3";
            i11 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i12;
        } else if (frames2 >= 12) {
            int toc3 = i12 & 1;
            i11 = 10000 << toc3;
        } else {
            if (A02[2].length() == 12) {
                throw new RuntimeException();
            }
            A02[2] = "pnsJXiCpejNcXc3iNsNdzofu9hZ";
            if (i12 == 3) {
                i11 = 60000;
            } else {
                i11 = 10000 << i12;
            }
        }
        return i10 * i11;
    }

    private void A03(List<byte[]> initializationData, int i10) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i10 * C.NANOS_PER_SECOND) / 48000).array());
    }

    public static boolean A04(C0651Hz c0651Hz) {
        int A042 = c0651Hz.A04();
        byte[] bArr = A04;
        if (A042 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c0651Hz.A0c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0527Co
    public final long A07(C0651Hz c0651Hz) {
        return A04(A00(c0651Hz.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0527Co
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0527Co
    public final boolean A0A(C0651Hz c0651Hz, long j3, C0526Cn c0526Cn) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(c0651Hz.A00, c0651Hz.A07());
            int i10 = copyOf[9] & UByte.MAX_VALUE;
            int i11 = ((copyOf[11] & UByte.MAX_VALUE) << 8) | (copyOf[10] & UByte.MAX_VALUE);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, i11);
            A03(arrayList, 3840);
            c0526Cn.A00 = Format.A07(null, A01(4, 10, 36), null, -1, -1, i10, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z10 = c0651Hz.A08() == A03;
        c0651Hz.A0Y(0);
        return z10;
    }
}
