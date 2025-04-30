package com.meta.analytics.dsp.uinode;

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

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 111);
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
        ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl;
        ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl2;
        if (KL.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1508Tl = this.A00.A02;
            if (viewOnClickListenerC1508Tl == null) {
                return;
            }
            viewOnClickListenerC1508Tl2 = this.A00.A02;
            viewOnClickListenerC1508Tl2.A09(A00(0, 8, 65));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
