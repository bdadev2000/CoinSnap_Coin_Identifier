package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ey, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1142Ey extends C1671Zx {
    public static byte[] A00;
    public static String[] A01 = {"lLTnlT7kdgZgpONat", "d79paUk3eSzGphhSN42PN5Aq8dj9iVyl", "SPt342n", "OIl1JjPDUNYuj0Z8zSbytdcas", "BSu1Ds7nymHwzPjWE4jzwGDd8JkRRJPQ", "PB1eQ9fbEyjMYRd9wV6iR7DUEeVSeCVP", "JUVWQPWt2QIcAEqAV6T0sxDALqwyj", "zKN2MvPWkZddLmlUYuVLkoywXLI"};

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].length() == 21) {
                throw new RuntimeException();
            }
            A01[7] = "QKmrPpG47xHIA";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 58);
            i12++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, Ascii.VT, 0, 10, Ascii.FS, 79, 1, 0, Ascii.ESC, 79, 6, 2, Ascii.US, 3, 10, 2, 10, 1, Ascii.ESC, 79, 6, 1, Ascii.ESC, 10, Ascii.GS, 9, Ascii.SO, Ascii.FF, 10, 79, 2, 10, Ascii.ESC, 7, 0, Ascii.VT, 79, 0, 1, 33, 10, Ascii.FS, Ascii.ESC, 10, Ascii.VT, 41, 3, 6, 1, 8, 125, 57, 50, 56, 46, 125, 51, 50, 41, 125, 52, 48, 45, 49, 56, 48, 56, 51, 41, 125, 52, 51, 41, 56, 47, 59, 60, 62, 56, 125, 48, 56, 41, 53, 50, 57, 125, 50, 51, 19, 56, 46, 41, 56, 57, Ascii.CR, 47, 56, Ascii.ESC, 49, 52, 51, 58, 5, 65, 74, 64, 86, 5, 75, 74, 81, 5, 76, 72, 85, 73, 64, 72, 64, 75, 81, 5, 76, 75, 81, 64, 87, 67, 68, 70, 64, 5, 72, 64, 81, 77, 74, 65, 5, 74, 75, 107, 64, 86, 81, 64, 65, 117, 87, 64, 118, 70, 87, 74, 73, 73, 3, 71, 76, 70, 80, 3, 77, 76, 87, 3, 74, 78, 83, 79, 70, 78, 70, 77, 87, 3, 74, 77, 87, 70, 81, 69, 66, 64, 70, 3, 78, 70, 87, 75, 76, 71, 3, 76, 77, 109, 70, 80, 87, 70, 71, 112, 64, 81, 76, 79, 79, 35, 103, 108, 102, 112, 35, 109, 108, 119, 35, 106, 110, 115, 111, 102, 110, 102, 109, 119, 35, 106, 109, 119, 102, 113, 101, 98, 96, 102, 35, 110, 102, 119, 107, 108, 103, 35, 108, 109, 77, 102, 112, 119, 102, 103, 80, 96, 113, 108, 111, 111, 66, 96, 96, 102, 115, 119, 102, 103, 81, Ascii.NAK, Ascii.RS, Ascii.DC4, 2, 81, Ascii.US, Ascii.RS, 5, 81, Ascii.CAN, Ascii.FS, 1, Ascii.GS, Ascii.DC4, Ascii.FS, Ascii.DC4, Ascii.US, 5, 81, Ascii.CAN, Ascii.US, 5, Ascii.DC4, 3, Ascii.ETB, Ascii.DLE, Ascii.DC2, Ascii.DC4, 81, Ascii.FS, Ascii.DC4, 5, Ascii.EM, Ascii.RS, Ascii.NAK, 81, Ascii.RS, Ascii.US, 34, 5, Ascii.DLE, 3, 5, 63, Ascii.DC4, 2, 5, Ascii.DC4, Ascii.NAK, 34, Ascii.DC2, 3, Ascii.RS, Ascii.GS, Ascii.GS, 47, 107, 96, 106, 124, 47, 97, 96, 123, 47, 102, 98, Ascii.DEL, 99, 106, 98, 106, 97, 123, 47, 102, 97, 123, 106, 125, 105, 110, 108, 106, 47, 98, 106, 123, 103, 96, 107, 47, 96, 97, 92, 123, 96, Ascii.DEL, 65, 106, 124, 123, 106, 107, 92, 108, 125, 96, 99, 99, 75, 116, 120, 106, 77, 124, 111, 120, 115, 105, 61, 80, 111, 99, 113, 86, 103, 116, 99, 104, 114, 69, 105, 107, 118, 103, 114};
    }

    static {
        A02();
    }

    @Override // com.meta.analytics.dsp.uinode.C08713i
    public final void A03(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (AbstractMethodError e4) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(323, 55, 53), e4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C08713i
    public final void A04(ViewParent viewParent, View view, int i9, int i10, int i11, int i12) {
        try {
            viewParent.onNestedScroll(view, i9, i10, i11, i12);
        } catch (AbstractMethodError e4) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(157, 51, 25), e4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C08713i
    public final void A05(ViewParent viewParent, View view, int i9, int i10, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i9, i10, iArr);
        } catch (AbstractMethodError e4) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(103, 54, 31), e4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C08713i
    public final void A06(ViewParent viewParent, View view, View view2, int i9) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i9);
        } catch (AbstractMethodError e4) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(208, 59, 57), e4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C08713i
    public final boolean A07(ViewParent viewParent, View view, float f9, float f10) {
        try {
            return viewParent.onNestedPreFling(view, f9, f10);
        } catch (AbstractMethodError e4) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(50, 53, 103), e4);
            return false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C08713i
    public final boolean A08(ViewParent viewParent, View view, float f9, float f10, boolean z8) {
        try {
            return viewParent.onNestedFling(view, f9, f10, z8);
        } catch (AbstractMethodError e4) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(0, 50, 85), e4);
            return false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C08713i
    public final boolean A09(ViewParent viewParent, View view, View view2, int i9) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i9);
        } catch (AbstractMethodError e4) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(267, 56, 75), e4);
            return false;
        }
    }
}
