package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OW implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0933Tc A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 111, 99, 101, 103};
    }

    public OW(C0933Tc c0933Tc) {
        this.A00 = c0933Tc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 47));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
