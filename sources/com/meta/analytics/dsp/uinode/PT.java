package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1494Sx A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.RS, 33, 33, 34, 49, Ascii.RS, 38, 41, 48};
    }

    public PT(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        C1381Oo c1381Oo;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0K;
            if (z8) {
                return;
            }
            c1381Oo = this.A00.A0H;
            c1381Oo.A02(A00(0, 9, 116));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
