package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class L3 {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<EnumC1244Je, EnumC1246Jg> A02;

    public static String A06(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, Ascii.EM, 74, Ascii.RS, 93, 76, 91, 95, 74, 91, Ascii.RS, Ascii.DEL, 90, 109, 87, 68, 91, Ascii.RS, 75, 77, 87, 80, 89, Ascii.RS, 74, 86, 87, 77, Ascii.RS, 73, 87, 90, 74, 86, Ascii.RS, 95, 80, 90, Ascii.RS, 86, 91, 87, 89, 86, 74, Ascii.DLE, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        HashMap hashMap = new HashMap();
        A02 = hashMap;
        hashMap.put(EnumC1244Je.A08, EnumC1246Jg.A0C);
        hashMap.put(EnumC1244Je.A06, EnumC1246Jg.A0E);
        hashMap.put(EnumC1244Je.A05, EnumC1246Jg.A0D);
    }

    public static AdSize A00(EnumC1244Je enumC1244Je) {
        return AdSize.fromWidthAndHeight(enumC1244Je.A03(), enumC1244Je.A02());
    }

    public static AdSize A01(EnumC1246Jg enumC1246Jg) {
        for (Map.Entry<EnumC1244Je, EnumC1246Jg> entry : A02.entrySet()) {
            if (entry.getValue() == enumC1246Jg) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static EnumC1244Je A02(int i9) {
        switch (i9) {
            case 4:
                return EnumC1244Je.A04;
            case 5:
                return EnumC1244Je.A05;
            case 6:
                return EnumC1244Je.A06;
            case 7:
                return EnumC1244Je.A08;
            case 100:
                return EnumC1244Je.A07;
            default:
                throw new IllegalArgumentException(A06(48, 20, 63));
        }
    }

    public static EnumC1244Je A03(int i9, int i10) {
        if (EnumC1244Je.A07.A02() == i10 && EnumC1244Je.A07.A03() == i9) {
            EnumC1244Je enumC1244Je = EnumC1244Je.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return enumC1244Je;
        }
        if (EnumC1244Je.A04.A02() == i10 && EnumC1244Je.A04.A03() == i9) {
            return EnumC1244Je.A04;
        }
        if (EnumC1244Je.A05.A02() == i10 && EnumC1244Je.A05.A03() == i9) {
            EnumC1244Je enumC1244Je2 = EnumC1244Je.A05;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
            strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
            return enumC1244Je2;
        }
        if (EnumC1244Je.A06.A02() == i10 && EnumC1244Je.A06.A03() == i9) {
            return EnumC1244Je.A06;
        }
        if (EnumC1244Je.A08.A02() == i10 && EnumC1244Je.A08.A03() == i9) {
            return EnumC1244Je.A08;
        }
        throw new IllegalArgumentException(A06(0, 48, 39));
    }

    public static EnumC1244Je A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC1246Jg A05(EnumC1244Je enumC1244Je) {
        EnumC1246Jg adTemplate = A02.get(enumC1244Je);
        if (adTemplate == null) {
            EnumC1246Jg enumC1246Jg = EnumC1246Jg.A0F;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
            strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
            return enumC1246Jg;
        }
        return adTemplate;
    }
}
