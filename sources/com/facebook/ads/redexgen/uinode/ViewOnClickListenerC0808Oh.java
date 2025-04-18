package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0808Oh implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TT A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-6, -19, -24, -23, -13};
    }

    public ViewOnClickListenerC0808Oh(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        C0815Oo c0815Oo;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (z10) {
                return;
            }
            c0815Oo = this.A00.A0M;
            c0815Oo.A02(A00(0, 5, 58));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
