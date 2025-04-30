package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1374Oh implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TT A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-6, -19, -24, -23, -13};
    }

    public ViewOnClickListenerC1374Oh(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        C1381Oo c1381Oo;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0O;
            if (z8) {
                return;
            }
            c1381Oo = this.A00.A0M;
            c1381Oo.A02(A00(0, 5, 58));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
