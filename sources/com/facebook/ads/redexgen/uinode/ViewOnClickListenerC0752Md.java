package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0752Md implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ UA A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public ViewOnClickListenerC0752Md(UA ua2) {
        this.A00 = ua2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MC mc2;
        if (KL.A02(this)) {
            return;
        }
        try {
            mc2 = this.A00.A06;
            mc2.A43(A00(0, 15, 9));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
