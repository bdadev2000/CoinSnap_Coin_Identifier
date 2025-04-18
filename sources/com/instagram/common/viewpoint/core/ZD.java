package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZD implements InterfaceC0592Hv {
    public static byte[] A04;
    public static String[] A05 = {"y11dLyPunqUC2SNmL", "uVADpA68M0Cfsn3", "aBlYZw3oCoScJFQ4w", "r0ynqY3CAk0tRf6oRkSRXMHPPhoSUYte", "5IdS6oQ5FkjdCe25TD", "axyuAqOl38qaB", "nwjC1v9mDHKhrzym", "tyB4AmDpHjXl7StHIAOspd43HtyDxVTF"};
    public ZA A00;
    public InterfaceC0592Hv A01;
    public final InterfaceC03879e A02;
    public final C0961Wj A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{20, 60, 51, 59, 48, 55, 51, 44, -25, 57, 44, 53, 43, 44, 57, 44, 57, -25, 52, 44, 43, 48, 40, -25, 42, 51, 54, 42, 50, 58, -25, 44, 53, 40, 41, 51, 44, 43, -11};
    }

    static {
        A02();
    }

    public ZD(InterfaceC03879e interfaceC03879e, InterfaceC0579Hi interfaceC0579Hi) {
        this.A02 = interfaceC03879e;
        this.A03 = new C0961Wj(interfaceC0579Hi);
    }

    private void A01() {
        this.A03.A02(this.A01.A88());
        A2 A85 = this.A01.A85();
        if (!A85.equals(this.A03.A85())) {
            this.A03.AGa(A85);
            this.A02.AD4(A85);
        }
    }

    private boolean A03() {
        if (this.A00 != null && !this.A00.A9Q()) {
            ZA za = this.A00;
            if (A05[3].charAt(15) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "9hoxEIkxVF2NPrHo";
            strArr[1] = "wbudfck4dY7yDqE";
            if (za.A9b() || !this.A00.A8z()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j2) {
        this.A03.A02(j2);
    }

    public final void A08(ZA za) {
        if (za == this.A00) {
            if (A05[3].charAt(15) != 'o') {
                throw new RuntimeException();
            }
            A05[4] = "7XXmXHxAZf2MfmaOXy";
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(ZA za) throws C03909h {
        InterfaceC0592Hv A7l = za.A7l();
        if (A7l != null) {
            InterfaceC0592Hv rendererMediaClock = this.A01;
            if (A7l != rendererMediaClock) {
                InterfaceC0592Hv rendererMediaClock2 = this.A01;
                if (rendererMediaClock2 == null) {
                    this.A01 = A7l;
                    this.A00 = za;
                    InterfaceC0592Hv interfaceC0592Hv = this.A01;
                    InterfaceC0592Hv rendererMediaClock3 = this.A03;
                    interfaceC0592Hv.AGa(rendererMediaClock3.A85());
                    A01();
                    return;
                }
                throw C03909h.A02(new IllegalStateException(A00(0, 39, 85)));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final A2 A85() {
        if (this.A01 != null) {
            return this.A01.A85();
        }
        return this.A03.A85();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final long A88() {
        if (A03()) {
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final A2 AGa(A2 a2) {
        if (this.A01 != null) {
            a2 = this.A01.AGa(a2);
        }
        this.A03.AGa(a2);
        this.A02.AD4(a2);
        return a2;
    }
}
