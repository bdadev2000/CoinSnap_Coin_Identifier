package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PU implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0928Sx A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 50, 50, 49, 63, 60, 47};
    }

    public PU(C0928Sx c0928Sx) {
        this.A00 = c0928Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        C0815Oo c0815Oo;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (z10) {
                return;
            }
            c0815Oo = this.A00.A0H;
            c0815Oo.A02(A00(0, 7, 124));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
