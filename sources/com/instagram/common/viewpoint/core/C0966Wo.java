package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0966Wo implements InterfaceC0569Gy {
    public static byte[] A06;
    public static String[] A07 = {"P1QEQSrukY5M5xBERBA96AXfGMpQRJsf", "fyJkILoJ8zO6ExXw4Z", "h2ZhnadmQQVtt", "59wO2YFrHM8LuMJd73h58a1kzdTPZKrY", "SxndWhWbDDrPbMOefSLNszxc26nlxYdY", "LBwvzUorbHEknhZCWQOabtM6HtCL0aoO", "5lhqhPHQff1TfuPnwPh7puTUvGoJGhr7", "0PrGAAoyZelcinCG058YNP9pZpCUk744"};
    public final int A00;
    public final InterfaceC0567Gw A01;
    public final InterfaceC0569Gy A02;
    public final InterfaceC0569Gy A03;
    public final HP A04;
    public final HR A05;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[0].charAt(6) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "vVmF6SpGATWHz9jZKAi0g6CZ8G1CuqUy";
            strArr[3] = "NGHYjAXI4l3csZ1DR9QZwhsoB2pnzImG";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 61);
            i5++;
        }
    }

    public static void A02() {
        A06 = new byte[]{83, 66, 85, 81, 68, 85, 116, 81, 68, 81, 99, 89, 94, 91};
    }

    static {
        A02();
    }

    public C0966Wo(HP hp, InterfaceC0569Gy interfaceC0569Gy, InterfaceC0569Gy interfaceC0569Gy2, InterfaceC0567Gw interfaceC0567Gw, int i2, HR hr) {
        this.A04 = hp;
        this.A03 = interfaceC0569Gy;
        this.A02 = interfaceC0569Gy2;
        this.A01 = interfaceC0567Gw;
        this.A00 = i2;
        this.A05 = hr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0569Gy
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0967Wp A4t() {
        HP hp = this.A04;
        InterfaceC0570Gz A4t = this.A03.A4t();
        InterfaceC0570Gz A4t2 = this.A02.A4t();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 13));
        }
        return new C0967Wp(hp, A4t, A4t2, null, this.A00, null);
    }
}
