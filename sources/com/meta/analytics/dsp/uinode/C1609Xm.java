package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1609Xm implements InterfaceC1077Bv {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC1074Bs> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{38, 83, 83, 80, 83, 1, 74, 79, 84, 85, 66, 79, 85, 74, 66, 85, 74, 79, 72, 1, 39, 45, 34, 36, 1, 70, 89, 85, 70, 79, 84, 74, 80, 79, 42, 67, 58, 77, 69, 58, 56, 73, 58, 57, -11, 58, 71, 71, 68, 71, -11, 56, 71, 58, 54, 73, 62, 67, 60, -11, Ascii.ESC, 33, Ascii.SYN, Ascii.CAN, -11, 58, 77, 73, 71, 54, 56, 73, 68, 71, Ascii.CAN, 36, 34, -29, Ascii.ESC, Ascii.SYN, Ascii.CAN, Ascii.SUB, Ascii.ETB, 36, 36, 32, -29, Ascii.SYN, Ascii.EM, 40, -29, Ascii.RS, 35, 41, Ascii.SUB, 39, 35, Ascii.SYN, 33, -29, Ascii.SUB, 45, 36, 37, 33, Ascii.SYN, 46, Ascii.SUB, 39, -25, -29, Ascii.SUB, 45, 41, -29, Ascii.ESC, 33, Ascii.SYN, Ascii.CAN, -29, -5, 33, Ascii.SYN, Ascii.CAN, -6, 45, 41, 39, Ascii.SYN, Ascii.CAN, 41, 36, 39};
    }

    static {
        A01();
        Constructor<? extends InterfaceC1074Bs> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 61)).asSubclass(InterfaceC1074Bs.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e4) {
            throw new RuntimeException(A00(0, 34, 105), e4);
        }
        A07 = constructor;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1077Bv
    public final synchronized InterfaceC1074Bs[] A4b() {
        InterfaceC1074Bs[] extractors;
        Constructor<? extends InterfaceC1074Bs> constructor = A07;
        extractors = new InterfaceC1074Bs[constructor == null ? 12 : 13];
        extractors[0] = new XX(this.A01);
        extractors[1] = new XN(this.A00);
        extractors[2] = new XL(this.A03);
        extractors[3] = new XU(this.A02);
        extractors[4] = new X7();
        extractors[5] = new XA();
        extractors[6] = new C1585Wo(this.A05, this.A04);
        extractors[7] = new C1601Xe();
        extractors[8] = new XF();
        extractors[9] = new C1591Wu();
        extractors[10] = new C1583Wm();
        extractors[11] = new C1604Xh();
        if (constructor != null) {
            try {
                extractors[12] = constructor.newInstance(new Object[0]);
            } catch (Exception e4) {
                throw new IllegalStateException(A00(34, 40, 93), e4);
            }
        }
        return extractors;
    }
}
