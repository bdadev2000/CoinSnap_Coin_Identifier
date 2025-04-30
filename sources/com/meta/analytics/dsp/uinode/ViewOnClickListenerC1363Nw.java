package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1363Nw implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"l4N2Kcxoefptdq", "", "xCyGfauY8Cv8y6z1j6nB0", "I2vrbV9C0ptJWrRodxY1O", "AmZ6eVz7znw", "py", "GJkVNgHUEop", "nCT0hemhHj6ffYmr5ag1r7dDnEHHnadR"};
    public final /* synthetic */ BK A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[7].charAt(24) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "onCZLFvGkKiXvi8omTZne";
        strArr[3] = "abRPxd6rYbi4uG3hrN9CP";
        A01 = new byte[]{70, 66, 78, 72, 74};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1363Nw(BK bk) {
        this.A00 = bk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1508Tl ctaButton;
        if (KL.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 74));
        } catch (Throwable th) {
            KL.A00(th, this);
            if (A02[0].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "DOCXsrSX8m5";
            strArr[1] = "";
        }
    }
}
