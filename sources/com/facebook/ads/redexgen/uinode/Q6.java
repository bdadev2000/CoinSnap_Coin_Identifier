package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Q6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ SM A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.NAK, Ascii.RS, Ascii.DC4, 19, 17, 34, Ascii.DC4, 35};
    }

    public Q6(SM sm) {
        this.A00 = sm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl;
        ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl2;
        if (KL.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0942Tl = this.A00.A02;
            if (viewOnClickListenerC0942Tl == null) {
                return;
            }
            viewOnClickListenerC0942Tl2 = this.A00.A02;
            viewOnClickListenerC0942Tl2.A09(A00(0, 8, 65));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
