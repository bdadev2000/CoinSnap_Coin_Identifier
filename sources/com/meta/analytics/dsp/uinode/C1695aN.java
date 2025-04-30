package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1695aN implements C2D {
    public static byte[] A05;
    public static String[] A06 = {"PyT2XUnl", "3EmvKqRjFYzRkizxlD8eotggUBC8U5J9", "Ib6uyfMRsh5ysHZ3i8ryXk3sO16qq9Ys", "q2kkzr74cnXMazMYxmC9c", "9U931lGThJH7Qz6wctlm6EKEWHFtvDAV", "f15MquYM06llw3BWZWASFwAp5egI2HKX", "yMUgiPhi", "t3xZZPMR"};
    public final AbstractC1708aa A00;
    public final AnonymousClass21 A01;
    public final AnonymousClass26 A02;
    public final AnonymousClass29 A03;
    public final C1636Yn A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -42, -110, -31, -44, -36, -41, -43, -26, -110, -37, -27, -110, -32, -25, -34, -34, -115, -96, -103, -113, -105, -112, -86, -112, -93, -97, -99, -116, -98, -86, -106, -112, -92, -74, -78, -79, -27, -44, -39, -43, -34, -45, -43, -66, -43, -28, -25, -33, -30, -37, -87, -82, -76, -65, -91, -78, -78, -81, -78, -65, -93, -81, -92, -91, -65, -85, -91, -71, 4, 7, 6, -1, Ascii.ETB, 1, 6, Ascii.SO, -7, 4, 1, -4, -7, Ascii.FF, 1, 7, 6, Ascii.ETB, Ascii.FF, 1, 5, -3, Ascii.ETB, 3, -3, 17, -61, -37, -23, -23, -41, -35, -37, -80, -106, -66, -38, -28, -28, -38, -33, -40, -111, -45, -26, -33, -43, -35, -42, -111, -41, -32, -29, -111, -34, -42, -28, -28, -46, -40, -42, -97, -95, -94, -96, -83, -109, -96, -96, -99, -96, -83, -101, -109, -95, -95, -113, -107, -109, -83, -103, -109, -89, 4, 19, Ascii.FF};
    }

    static {
        A01();
    }

    public C1695aN(C1636Yn c1636Yn, AnonymousClass26 anonymousClass26, AnonymousClass21 anonymousClass21, AbstractC1708aa abstractC1708aa, AnonymousClass29 anonymousClass29) {
        this.A04 = c1636Yn;
        this.A02 = anonymousClass26;
        this.A01 = anonymousClass21;
        this.A00 = abstractC1708aa;
        this.A03 = anonymousClass29;
    }

    @Override // com.meta.analytics.dsp.uinode.C2D
    public final Bundle A4e(String str) {
        return C2L.A02(str, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.C2D
    public final void A56() {
        this.A03.A0F(1012, null);
        this.A03.A0C();
        this.A02.A0D(null);
    }

    @Override // com.meta.analytics.dsp.uinode.C2D
    public final int A7J() {
        return 1010;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00aa. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    @Override // com.meta.analytics.dsp.uinode.C2D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A8W(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1695aN.A8W(android.os.Message):void");
    }
}
