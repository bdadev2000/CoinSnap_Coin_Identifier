package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0790Pt implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ A6 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 23, 23, 24, 39, 20, 28, 31, 38};
    }

    public ViewOnClickListenerC0790Pt(A6 a6) {
        this.A00 = a6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        PD pd;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A00.A0K;
            if (!z2) {
                pd = this.A00.A0H;
                pd.A02(A00(0, 9, 103));
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
