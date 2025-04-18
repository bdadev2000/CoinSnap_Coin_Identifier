package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class UO extends AbstractC0753Oi {
    public static byte[] A00;

    static {
        A0D();
    }

    public static String A0C(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{106, 111, 111, 110, Byte.MAX_VALUE, 106, 98, 103, 120};
    }

    public abstract void A14();

    public abstract void A15();

    public abstract void A16();

    public abstract boolean A17();

    public abstract boolean A18();

    public UO(C0757Om c0757Om, boolean z2) {
        super(c0757Om, z2);
        if (C0608Im.A12(c0757Om.A05())) {
            if (c0757Om.A09() != null) {
                c0757Om.A09().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A13() {
        if (C0608Im.A12(this.A06.A05()) && this.A06.A09() != null) {
            this.A06.A09().setCTAClickListener(getCtaButton());
        }
    }

    public void setAdDetailsClickListener(OE oe) {
        if (C0608Im.A12(this.A06.A05()) && oe != null) {
            oe.setOnClickListener(AbstractC0750Of.A03(getCtaButton(), A0C(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(QK qk) {
    }
}
