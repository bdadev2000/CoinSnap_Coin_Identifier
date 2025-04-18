package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class EQ {
    public static byte[] A05;
    public final InterfaceC0567Gw A00;
    public final InterfaceC0569Gy A01;
    public final InterfaceC0569Gy A02;
    public final HP A03;
    public final I8 A04;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{16, 31, 18, 14, 33, 18, -15, 14, 33, 14, 0, 22, 27, 24};
    }

    public EQ(HP hp, InterfaceC0569Gy interfaceC0569Gy) {
        this(hp, interfaceC0569Gy, null, null, null);
    }

    public EQ(HP hp, InterfaceC0569Gy interfaceC0569Gy, InterfaceC0569Gy interfaceC0569Gy2, InterfaceC0567Gw interfaceC0567Gw, I8 i8) {
        AbstractC0576Hf.A01(interfaceC0569Gy);
        this.A03 = hp;
        this.A02 = interfaceC0569Gy;
        this.A01 = interfaceC0569Gy2;
        this.A00 = interfaceC0567Gw;
        this.A04 = i8;
    }

    public final HP A02() {
        return this.A03;
    }

    public final C0967Wp A03(boolean z2) {
        InterfaceC0570Gz x1;
        if (this.A01 != null) {
            x1 = this.A01.A4t();
        } else {
            x1 = new X1();
        }
        if (z2) {
            return new C0967Wp(this.A03, X2.A02, x1, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, Opcodes.LREM));
        }
        C0968Wq c0968Wq = new C0968Wq(this.A03, 2097152L);
        InterfaceC0570Gz A4t = this.A02.A4t();
        if (this.A04 != null) {
            A4t = new C0972Wu(A4t, this.A04, -1000);
        }
        InterfaceC0570Gz upstream = x1;
        return new C0967Wp(this.A03, A4t, upstream, c0968Wq, 1, null);
    }

    public final I8 A04() {
        return this.A04 != null ? this.A04 : new I8();
    }
}
