package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OW implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1499Tc A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 111, 99, 101, 103};
    }

    public OW(C1499Tc c1499Tc) {
        this.A00 = c1499Tc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 47));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
