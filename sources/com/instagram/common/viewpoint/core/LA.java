package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class LA {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<EnumC0627Jj, EnumC0629Jl> A02;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, 12, 95, 11, 72, 89, 78, 74, 95, 78, 11, 106, 79, 120, 66, 81, 78, 11, 94, 88, 66, 69, 76, 11, 95, 67, 66, 88, 11, 92, 66, 79, 95, 67, 11, 74, 69, 79, 11, 67, 78, 66, 76, 67, 95, 5, 50, 9, 12, 9, 8, 16, 9, 71, 38, 3, 52, 14, 29, 2, 71, 19, 30, 23, 2, 73};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(EnumC0627Jj.A09, EnumC0629Jl.A0D);
        A02.put(EnumC0627Jj.A07, EnumC0629Jl.A0F);
        A02.put(EnumC0627Jj.A06, EnumC0629Jl.A0E);
    }

    public static AdSize A00(EnumC0627Jj enumC0627Jj) {
        return AdSize.fromWidthAndHeight(enumC0627Jj.A04(), enumC0627Jj.A03());
    }

    public static AdSize A01(EnumC0629Jl enumC0629Jl) {
        for (Map.Entry<EnumC0627Jj, EnumC0629Jl> entry : A02.entrySet()) {
            if (entry.getValue() == enumC0629Jl) {
                EnumC0627Jj key = entry.getKey();
                if (A01[3].charAt(31) == 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "vUJqh";
                strArr[7] = "m1G2X";
                return A00(key);
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC0627Jj A02(int i2) {
        switch (i2) {
            case 4:
                return EnumC0627Jj.A05;
            case 5:
                return EnumC0627Jj.A06;
            case 6:
                return EnumC0627Jj.A07;
            case 7:
                return EnumC0627Jj.A09;
            case 100:
                return EnumC0627Jj.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, Opcodes.LNEG));
        }
    }

    public static EnumC0627Jj A03(int i2, int i3) {
        if (EnumC0627Jj.A08.A03() == i3 && EnumC0627Jj.A08.A04() == i2) {
            return EnumC0627Jj.A08;
        }
        if (EnumC0627Jj.A05.A03() == i3) {
            int A04 = EnumC0627Jj.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (A04 == i2) {
                return EnumC0627Jj.A05;
            }
        }
        if (EnumC0627Jj.A06.A03() == i3 && EnumC0627Jj.A06.A04() == i2) {
            return EnumC0627Jj.A06;
        }
        if (EnumC0627Jj.A07.A03() == i3 && EnumC0627Jj.A07.A04() == i2) {
            return EnumC0627Jj.A07;
        }
        if (EnumC0627Jj.A09.A03() == i3) {
            EnumC0627Jj enumC0627Jj = EnumC0627Jj.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC0627Jj.A04() == i2) {
                return EnumC0627Jj.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static EnumC0627Jj A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC0629Jl A05(EnumC0627Jj enumC0627Jj) {
        EnumC0629Jl adTemplate = A02.get(enumC0627Jj);
        if (adTemplate == null) {
            return EnumC0629Jl.A0G;
        }
        return adTemplate;
    }
}
