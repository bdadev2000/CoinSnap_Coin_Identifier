package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0783Ni {
    public static byte[] A01;
    public static String[] A02 = {"CvydOG1rdpeZVjh1I2HxFGGpkCBtP1uR", "LPAb8wO4e9Bm4297vBHQiNlf50jewka4", "p6i6iSivtdsam", "kr1L5mV", "OjxdnAkOIagRjcigNYlctVvlDEXS237l", "CTcf", "XEPmNqkHOtxVdZCukAC2cQoZWEBCmlPv", "qw43eBE0dfm3vpW8jqKcT1ME9HQ7Rm2E"};
    public final Map<String, String> A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {71, 90, 86, 80, 67, 125, 74, 75, 76, 86, 81, 5, Ascii.RS, 4, Ascii.DC2, Ascii.EM};
        String[] strArr = A02;
        if (strArr[6].charAt(15) == strArr[1].charAt(15)) {
            throw new RuntimeException();
        }
        A02[3] = "rnLFNN7HWa";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C0783Ni() {
        this.A00 = new HashMap();
    }

    public C0783Ni(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C0783Ni A02(C0729Lg c0729Lg) {
        if (c0729Lg != null) {
            this.A00.put(A00(11, 5, 0), LJ.A01(c0729Lg.A04()));
        }
        return this;
    }

    public final C0783Ni A03(RE re2) {
        if (re2 != null) {
            this.A00.putAll(re2.A0S());
        }
        return this;
    }

    public final C0783Ni A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 83), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
