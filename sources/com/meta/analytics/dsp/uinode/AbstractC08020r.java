package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08020r {
    public static byte[] A04;
    public static String[] A05 = {"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    public boolean A00;
    public final C1636Yn A01;
    public final AbstractC08030s A02;
    public final RE A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public abstract void A06(Map<String, String> map);

    static {
        A01();
    }

    public AbstractC08020r(C1636Yn c1636Yn, AbstractC08030s abstractC08030s, RE re) {
        this.A01 = c1636Yn;
        this.A02 = abstractC08030s;
        this.A03 = re;
    }

    public final void A02() {
        if (this.A00) {
            return;
        }
        AbstractC08030s abstractC08030s = this.A02;
        if (abstractC08030s != null) {
            abstractC08030s.A00();
        }
        Map<String, String> extraData = new C1349Ni().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        L4.A02(this.A01, A00(0, 17, 20));
        AbstractC08030s abstractC08030s2 = this.A02;
    }
}
