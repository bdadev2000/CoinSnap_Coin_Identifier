package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08723j {
    public static byte[] A00;
    public static final C08713i A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{115, 114, 82, 121, 111, 104, 121, 120, 76, 110, 121, 79, Ascii.DEL, 110, 115, 112, 112, 6, 7, 39, Ascii.FF, Ascii.SUB, Ascii.GS, Ascii.FF, Ascii.CR, 58, 10, Ascii.ESC, 6, 5, 5, 119, 118, 86, 125, 107, 108, 125, 124, 75, 123, 106, 119, 116, 116, 89, 123, 123, 125, 104, 108, 125, 124, 126, Ascii.DEL, 66, 101, 112, 99, 101, 95, 116, 98, 101, 116, 117, 66, 114, 99, 126, 125, 125, 85, 84, 105, 78, 85, 74, 116, 95, 73, 78, 95, 94, 105, 89, 72, 85, 86, 86};
    }

    static {
        A01();
        if (Build.VERSION.SDK_INT >= 21) {
            A01 = new C1142Ey();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C1671Zx();
        } else {
            A01 = new C08713i();
        }
    }

    public static void A02(ViewParent viewParent, View view, int i9) {
        if (0 != 0) {
            throw new NullPointerException(A00(72, 18, 122));
        }
        if (i9 == 0) {
            A01.A03(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i9, int i10, int i11, int i12, int i13) {
        if (0 != 0) {
            throw new NullPointerException(A00(17, 14, 41));
        }
        if (i13 == 0) {
            A01.A04(viewParent, view, i9, i10, i11, i12);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i9, int i10, int[] iArr, int i11) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 17, 92));
        }
        if (i11 == 0) {
            A01.A05(viewParent, view, i9, i10, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i9, int i10) {
        if (0 != 0) {
            throw new NullPointerException(A00(31, 22, 88));
        }
        if (i10 == 0) {
            A01.A06(viewParent, view, view2, i9);
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f9, float f10) {
        return A01.A07(viewParent, view, f9, f10);
    }

    public static boolean A07(ViewParent viewParent, View view, float f9, float f10, boolean z8) {
        return A01.A08(viewParent, view, f9, f10, z8);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i9, int i10) {
        if (0 != 0) {
            throw new NullPointerException(A00(53, 19, 81));
        }
        if (i10 == 0) {
            return A01.A09(viewParent, view, view2, i9);
        }
        return false;
    }
}
