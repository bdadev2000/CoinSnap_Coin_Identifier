package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OK implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"", "HBnrsW65aYWVvlJTMpWxFuU7z6MV4xxJ", "tXIuQqWBvr", "", "VtieTS2CshWtQMI3l6Acm9um24vRFq1J", "25ZZ2FxRZN7AWJhoRaY84f3F1yf7l7BH", "QBWydbCUfoNWyqRHIYB4mtuveM9uMuB5", "ip309lScFF5SkXTTlyumKzm4Zaw9hedS"};
    public final /* synthetic */ C0936Tf A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A02[2].length() == 2) {
                throw new RuntimeException();
            }
            A02[4] = "tqBSefJA8FkovjSgYNKxEGKjBcizSh9O";
            copyOfRange[i13] = (byte) (i14 ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{114, 118, 122, 124, 126};
    }

    static {
        A01();
    }

    public OK(C0936Tf c0936Tf) {
        this.A00 = c0936Tf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 20));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
