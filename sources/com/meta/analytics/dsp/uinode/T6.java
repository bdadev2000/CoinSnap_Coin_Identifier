package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T6 extends KT {
    public static byte[] A02;
    public static String[] A03 = {"4qrMQlq4f90xl1sy4BzZM", "TcWoGCf457Qot5JyT1l2C", "saLQkhnkoxI5nJaIrtjAxQtmEyR3", "z6v9quSHtiIGt9EK5mEYj706uJD6", "bFad0nk8xPS9ndShlqLlSujGxs36pdRI", "6trDbbUtZicDuXYkeWIP0roMCqYrQYo", "jn4cH53pZ3UPJni0h7BbN5PLusC2Bi2v", "yFv6h44bSGU1wJ6ZfOcWL3O4oMR1XmQT"};
    public final /* synthetic */ T4 A00;
    public final /* synthetic */ AnonymousClass93 A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = (copyOfRange[i12] - i11) - 118;
            if (A03[5].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "MzDMZ7tTu5yBCDFfOWXXt";
            strArr[1] = "2jCL4DZ8aFTQz1DFqzIUv";
            copyOfRange[i12] = (byte) i13;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-68, -17, -32, -32, -33, -20, -29, -24, -31, -102, -29, -24, -34, -33, -32, -29, -24, -29, -18, -33, -26, -13};
    }

    static {
        A02();
    }

    public T6(T4 t42, AnonymousClass93 anonymousClass93) {
        this.A00 = t42;
        this.A01 = anonymousClass93;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        SA sa;
        SA sa2;
        InterfaceC1396Pd interfaceC1396Pd;
        sa = this.A00.A0I;
        if (sa.getState() == RB.A02) {
            sa2 = this.A00.A0I;
            if (sa2.getCurrentPositionInMillis() == A00()) {
                interfaceC1396Pd = this.A00.A0F;
                interfaceC1396Pd.ADX(A00(0, 22, 4));
            }
        }
    }
}
