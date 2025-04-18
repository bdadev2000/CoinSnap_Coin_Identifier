package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1L, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C1L {
    A04(A01(23, 14, 75)),
    A05(A01(37, 9, 104));

    public static byte[] A01;
    public static String[] A02 = {"v4tKPq3EceuOa5aRsmEiNo1tTprRM6C7", "qa", "1kYj9up9VehuFRcMC7DoHBWV3d6qFcAR", "n4EmHEljxnoAajVVWWaJOomXezwQRR5a", "Whp7rDnlG0MZIiYb9hz51Us4d", "ClcFd5qXD5uybBDL74sHW5rS4sS0N915", "9cSwTyNVqh919HIV87XGH350eC38CJiy", "s6hJEW9RZJJCohfrBHr3vXwOzcsb3wCa"};
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            String[] strArr = A02;
            if (strArr[2].charAt(20) != strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A02[5] = "UwpbEbRNl9IMKeiJ6uSiSZky6ATbVFhh";
            copyOfRange[i13] = (byte) (i14 - 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-9, 3, 2, 8, -7, Ascii.FF, 8, 9, -11, 0, 19, -11, 4, 4, -68, -83, -77, -79, -53, -68, -69, -65, -64, -8, 4, 3, 9, -6, Ascii.CR, 9, 10, -10, 1, -12, -10, 5, 5, 34, 19, Ascii.EM, Ascii.ETB, 17, 34, 33, 37, 38};
    }

    static {
        A02();
    }

    C1L(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C1L A00(String str) {
        char c10;
        switch (str.hashCode()) {
            case 883765328:
                if (str.equals(A01(37, 9, 104))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1434358835:
                if (str.equals(A01(23, 14, 75))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return A04;
            default:
                return A05;
        }
    }
}
