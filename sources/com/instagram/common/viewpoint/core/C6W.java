package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6W {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C1044Zr A00;
    public String A01;
    public final C0670Ld A02 = new C0670Ld(300000000000L, new C1052Zz(this));

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, -50, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, -64, -78, -64, -64, -74, -68, -69, -52, -63, -74, -70, -78};
    }

    static {
        A04();
        A04 = new AtomicBoolean(false);
    }

    public static InterfaceC03708n A00(C1044Zr c1044Zr) {
        return C0608Im.A15(c1044Zr) ? C03718o.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12)) : C03718o.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1044Zr c1044Zr;
        synchronized (this) {
            c1044Zr = this.A00;
        }
        if (c1044Zr == null) {
            return;
        }
        String A042 = C03738q.A00().A01(c1044Zr, true).A04(A00(c1044Zr));
        synchronized (this) {
            this.A01 = A042;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C1044Zr c1044Zr) {
        this.A00 = c1044Zr;
        this.A00.A07().AAl();
        this.A00.A03().ABQ(c1044Zr);
        if (this.A00.A06().AGj() || ((A04.get() && C0608Im.A1r(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
