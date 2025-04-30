package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1318Md implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ UA A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public ViewOnClickListenerC1318Md(UA ua) {
        this.A00 = ua;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MC mc;
        if (KL.A02(this)) {
            return;
        }
        try {
            mc = this.A00.A06;
            mc.A43(A00(0, 15, 9));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
