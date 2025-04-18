package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1108au implements InterfaceC02784m {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-95, -74, -50, -60, -54, -55, 117, -59, -60, -56, -66, -55, -66, -60, -61, -56, 117, -62, -54, -56, -55, 117, -73, -70, 117, -61, -60, -61, -126, -61, -70, -68, -74, -55, -66, -53, -70, -117, -92, -77, -96, -89, 91, -97, -92, -82, -81, -100, -87, -98, -96, 91, -88, -80, -82, -81, 91, -99, -96, 91, -87, -86, -87, 104, -87, -96, -94, -100, -81, -92, -79, -96};
    }

    public final void A02() {
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i2, int i3) {
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void A04(FL fl, boolean z2) {
        this.A00 = 0;
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        AbstractC02804o abstractC02804o = fl.A06;
        if (fl.A04 != null && abstractC02804o != null && abstractC02804o.A1U()) {
            if (z2) {
                if (!fl.A00.A0B()) {
                    abstractC02804o.A1r(fl.A04.A0E(), this);
                }
            } else if (!fl.A1p()) {
                abstractC02804o.A1q(this.A01, this.A02, fl.A0s, this);
            }
            if (this.A00 > abstractC02804o.A00) {
                abstractC02804o.A00 = this.A00;
                abstractC02804o.A08 = z2;
                fl.A0r.A0O();
            }
        }
    }

    public final boolean A05(int i2) {
        if (this.A03 != null) {
            int i3 = this.A00 * 2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                int count = this.A03[i4];
                if (count == i2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02784m
    public final void A3o(int i2, int i3) {
        if (i2 >= 0) {
            if (i3 >= 0) {
                int i4 = this.A00 * 2;
                if (this.A03 == null) {
                    this.A03 = new int[4];
                    Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = this.A03.length;
                    if (i4 >= storagePosition) {
                        int[] iArr = this.A03;
                        int storagePosition2 = i4 * 2;
                        this.A03 = new int[storagePosition2];
                        System.arraycopy(iArr, 0, this.A03, 0, iArr.length);
                    }
                }
                this.A03[i4] = i2;
                int storagePosition3 = i4 + 1;
                this.A03[storagePosition3] = i3;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 8));
        }
        throw new IllegalArgumentException(A00(0, 37, 34));
    }
}
