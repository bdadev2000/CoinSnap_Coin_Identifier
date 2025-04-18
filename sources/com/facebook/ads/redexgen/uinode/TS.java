package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public abstract class TS extends OL {
    public static byte[] A00;
    public static String[] A01 = {"tJRtfPKHoy7gQ0Hrrag4OkVDHQvHpM6e", "ntrk62ddU7J9c8B2GtO4dhepCrAVPpDV", "iQ54QNqjdD5kyZO2OLG", "4R7BJQoUCBFINf313UyvxR7fWPUp11Dk", "Ad2P", "mQFjJcGEaXO3GAoxmnr0yBCCZwtlhd6p", "65xONPI2i6gPpcf6kW2ve41HMoO1k057", "z69fhWo2iasYfVs3h6jnYZwontL4UpVs"};

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 94);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{43, 46, 46, 47, 62, 43, 51, 54, Base64.padSymbol};
    }

    public abstract void A14();

    public abstract void A15();

    public abstract void A16();

    public abstract boolean A17();

    public abstract boolean A18();

    static {
        A0D();
    }

    public TS(OP op, boolean z10) {
        super(op, z10);
        if (C0659Ih.A0y(op.A05())) {
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A13() {
        if (C0659Ih.A0y(this.A06.A05()) && this.A06.A08() != null) {
            this.A06.A08().setCTAClickListener(getCtaButton());
        }
    }

    public void setAdDetailsClickListener(AbstractC0789No abstractC0789No) {
        if (C0659Ih.A0y(this.A06.A05()) && abstractC0789No != null) {
            ViewOnClickListenerC0942Tl ctaButton = getCtaButton();
            if (A01[1].charAt(21) != 'h') {
                throw new RuntimeException();
            }
            A01[3] = "am5A0dIgunRuJRLaM18rzwVTPisxqXDR";
            abstractC0789No.setOnClickListener(OI.A03(ctaButton, A0C(0, 9, 108)));
        }
    }

    public void setupNativeCtaExtension(C0842Pp c0842Pp) {
    }
}
