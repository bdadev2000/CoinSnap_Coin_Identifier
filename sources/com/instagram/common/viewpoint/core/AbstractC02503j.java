package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02503j {
    public static byte[] A00;
    public static String[] A01 = {"ZL1anCMt3BLp6QH6mLG", "eYchmtpQAx9MOQATO8FYbbZn0Imopvp", "womqJE18VUE38xqqJT9WKISB68M5cIbo", "Ts37DulPc8QB3fV2ykqejrUSGmoT8jSS", "b7DBuf20fhmi4MvO4gTJDnUAFhtFn7QS", "riPo3ZmcE", "zdrgnlBB6epFGiAXytvDtgh2fpyUYHeQ", "pMT1BFzteNKtMElnfmBSO9c56WwnbBlh"};
    public static final C02493i A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(24) != strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            A01[1] = "rrZUd7Y7OcpInh9wY";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 74);
            i5++;
        }
    }

    public static void A01() {
        A00 = new byte[]{13, 12, -20, 3, 17, 18, 3, 2, -18, 16, 3, -15, 1, 16, 13, 10, 10, -56, -57, -89, -66, -52, -51, -66, -67, -84, -68, -53, -56, -59, -59, 52, 51, 19, 42, 56, 57, 42, 41, 24, 40, 55, 52, 49, 49, 6, 40, 40, 42, 53, 57, 42, 41, -55, -56, -83, -50, -69, -52, -50, -88, -65, -51, -50, -65, -66, -83, -67, -52, -55, -58, -58, 41, 40, 13, 46, 41, 42, 8, 31, 45, 46, 31, 30, 13, 29, 44, 41, 38, 38};
    }

    static {
        A01();
        if (Build.VERSION.SDK_INT >= 21) {
            A02 = new FZ();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A02 = new C1116b2();
        } else {
            A02 = new C02493i();
        }
    }

    public static void A02(ViewParent viewParent, View view, int i2) {
        if (0 != 0) {
            throw new NullPointerException(A00(72, 18, 112));
        }
        if (i2 == 0) {
            A02.A03(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6) {
        if (0 != 0) {
            throw new NullPointerException(A00(17, 14, 15));
        }
        if (i6 == 0) {
            A02.A04(viewParent, view, i2, i3, i4, i5);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 17, 84));
        }
        if (i4 == 0) {
            A02.A05(viewParent, view, i2, i3, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (0 != 0) {
            throw new NullPointerException(A00(31, 22, Opcodes.LSHR));
        }
        if (i3 == 0) {
            C02493i c02493i = A02;
            if (A01[1].length() != 12) {
                A01[6] = "zGz2rBeihUtTfGY2pcVtSmEx1y47z9aS";
                c02493i.A06(viewParent, view, view2, i2);
                return;
            }
            throw new RuntimeException();
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f2, float f3) {
        return A02.A07(viewParent, view, f2, f3);
    }

    public static boolean A07(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
        return A02.A08(viewParent, view, f2, f3, z2);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (0 != 0) {
            throw new NullPointerException(A00(53, 19, 16));
        }
        if (i3 == 0) {
            boolean A09 = A02.A09(viewParent, view, view2, i2);
            if (A01[1].length() == 12) {
                throw new RuntimeException();
            }
            A01[6] = "znJUBPw3pDumoyQGyqs8HDKa96hSudPo";
            return A09;
        }
        return false;
    }
}
