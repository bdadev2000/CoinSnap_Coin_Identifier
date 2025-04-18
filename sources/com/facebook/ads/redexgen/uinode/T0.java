package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class T0 extends KT {
    public static byte[] A01;
    public final /* synthetic */ C0928Sx A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{35, 54, 49, 50, 60, -19, 68, 46, 64, -19, 59, 50, 67, 50, 63, -19, Base64.padSymbol, 63, 50, Base64.padSymbol, 46, 63, 50, 49};
    }

    public T0(C0928Sx c0928Sx) {
        this.A00 = c0928Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        InterfaceC0830Pd interfaceC0830Pd;
        z10 = this.A00.A0S;
        if (!z10) {
            interfaceC0830Pd = this.A00.A0X;
            interfaceC0830Pd.ADX(A00(0, 24, 79));
        }
    }
}
