package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03736a {
    public static byte[] A08;
    public static String[] A09 = {"XfFEJYzZGPN2q5HAGj6MgKNVfzLwmSZX", "IEOpES1QDH9OfLZ6kJp7GuGkL18XBoIG", "WALKiAt1LYWQmYrQVF547JQW7ZyvBxoS", "camCesiVcQ", "gegEJgEL8kfxybdRvZS3nVx2Pjrjbaxz", "VPdzUQ79XvyfUeAOXKMfgbC8CxalnODj", "j10tNg164Uuijv40qzFG2IFbsKPXtge5", "FPgW5aqA35oZNLthCad5U5lgXJ4OAu7U"};
    public C6i A00;
    public String A01 = A00(0, 4, 69);
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A09;
        if (strArr[1].charAt(7) == strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[0] = "MYUg0L4zDuLwpF69sKnSAkLFZGAyisTY";
        strArr2[3] = "z6mwSfGh97";
        A08 = new byte[]{Ascii.VT, 8, 6, 3};
    }

    static {
        A01();
    }

    public C03736a(String str, int i10, int i11, String str2, String str3) {
        this.A07 = str;
        this.A03 = i10;
        this.A04 = i11;
        this.A06 = str2;
        this.A05 = str3;
    }
}
