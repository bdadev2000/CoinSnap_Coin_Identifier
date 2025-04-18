package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02061r {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ Opcodes.DREM);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73};
    }

    public static void A02(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD, boolean z2, InterfaceC02041p interfaceC02041p) {
        if (!C0608Im.A23(c1045Zs)) {
            C03226f c03226f = new C03226f(c1045Zs);
            C01901b A06 = abstractC1187cD.A1P().A0E().A06();
            c03226f.A0d(new JF(abstractC1187cD.A1U(), c1045Zs.A09()));
            if (A06 == null) {
                interfaceC02041p.AD2(AdError.CACHE_ERROR);
                return;
            }
            if (A06.A0N()) {
                interfaceC02041p.AD3();
                return;
            }
            C03186b c03186b = new C03186b(A06.A0F(), abstractC1187cD.A0l(), abstractC1187cD.A0c());
            c03186b.A04 = true;
            if (C0608Im.A1s(c1045Zs)) {
                c03186b.A03 = A00(0, 5, 86);
            }
            switch (C02031o.A00[A06.A0A().ordinal()]) {
                case 1:
                case 2:
                    c03226f.A0X(c03186b);
                    break;
            }
            c03226f.A0b(new C03206d(abstractC1187cD.A1S().A01(), -1, -1, abstractC1187cD.A0l(), abstractC1187cD.A0c()));
            c03226f.A0b(new C03206d(A06.A0E(), -1, -1, abstractC1187cD.A0l(), abstractC1187cD.A0c()));
            c03226f.A0W(new C1174c0(c1045Zs, interfaceC02041p, c03226f, A06, z2), new C6Y(abstractC1187cD.A0l(), abstractC1187cD.A0c()));
            return;
        }
        interfaceC02041p.AD3();
    }
}
