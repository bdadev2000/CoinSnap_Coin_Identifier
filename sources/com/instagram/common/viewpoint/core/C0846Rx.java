package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0846Rx {
    public static byte[] A07;
    public static String[] A08 = {"H9a6GPEeuBppqgml", "UMFfHf9K0rtxTnfS4GQ", "HJf7oQJhMr6BjfdBAkNXb1VX0FlaYu0s", "mblZ", "lDa8BWO3GNKgBVoNV1FydEibnHhzaqpi", "BpHqCYEOVY5", "fQPNbuq5zM2Vt99anBRO7vAhC8TCHPEC", "oGui3UnSaV6fb7qd5azTuEEp3mm97meQ"};
    public InterfaceC0837Ro A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{4, 40, 49, 32, 36, 60, 36, 105, 59, 44, 61, 59, 32, 44, 58, 105, 36, 60, 58, 61, 105, 43, 44, 105, 43, 44, 61, 62, 44, 44, 39, 105, 120, 105, 40, 39, 45, 105, 120, 113};
        if (A08[3].length() != 4) {
            throw new RuntimeException();
        }
        A08[4] = "ylxMzgRnic8ELdWNUfQitMVfYj0C1DI2";
    }

    static {
        A01();
    }

    public final C0846Rx A02(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C0846Rx A03(int i2) {
        if (i2 >= 1 && i2 <= 18) {
            this.A01 = i2;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 45));
    }

    public final C0846Rx A04(int i2) {
        this.A02 = i2;
        return this;
    }

    public final C0846Rx A05(int i2) {
        this.A03 = i2;
        return this;
    }

    public final C0846Rx A06(int i2) {
        this.A04 = i2;
        return this;
    }

    public final C0846Rx A07(InterfaceC0837Ro interfaceC0837Ro) {
        this.A05 = interfaceC0837Ro;
        return this;
    }

    public final C0846Rx A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C0847Ry A09() {
        return new C0847Ry(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
