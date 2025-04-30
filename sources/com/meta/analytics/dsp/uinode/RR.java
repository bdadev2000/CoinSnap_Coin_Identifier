package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class RR {
    public static byte[] A07;
    public RI A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, Ascii.GS, 4, Ascii.NAK, 17, 9, 17, 92, Ascii.SO, Ascii.EM, 8, Ascii.SO, Ascii.NAK, Ascii.EM, Ascii.SI, 92, 17, 9, Ascii.SI, 8, 92, Ascii.RS, Ascii.EM, 92, Ascii.RS, Ascii.EM, 8, Ascii.VT, Ascii.EM, Ascii.EM, Ascii.DC2, 92, 77, 92, Ascii.GS, Ascii.DC2, Ascii.CAN, 92, 77, 68};
    }

    public final RR A02(int i9) {
        this.A00 = i9;
        return this;
    }

    public final RR A03(int i9) {
        if (i9 >= 1 && i9 <= 18) {
            this.A01 = i9;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final RR A04(int i9) {
        this.A02 = i9;
        return this;
    }

    public final RR A05(int i9) {
        this.A03 = i9;
        return this;
    }

    public final RR A06(int i9) {
        this.A04 = i9;
        return this;
    }

    public final RR A07(RI ri) {
        this.A05 = ri;
        return this;
    }

    public final RR A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final RS A09() {
        return new RS(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
