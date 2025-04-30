package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1375Oi implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"0HsLQMHMjdf9XxY0FoFJM6DI5mSYk5cq", "dhr4behIProWKSykj", "GE701vnHE9lzBn3SwA4tW4e1BtUaptEm", "cLSMigQ4cfHVDaX8bfW4FJ5X08fXhUZC", "1xDVph1vyW65p7zSnZeJ5giXq27He7tX", "cas2Jd68DEdp6", "xZiGDxwVLZDgesSRv509BK1mAeaT2HFq", "7L9x50qsEvVQf3Iy1"};
    public final /* synthetic */ TT A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(10) != 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "t4xutyPnAWvSKPJUD0NJxEchNrBIH7fo";
            strArr[0] = "mOxo7NoxjINZF7CLuWUnFWlPSsoX4esJ";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 114);
            i12++;
        }
    }

    public static void A01() {
        A01 = new byte[]{48, 52, 40, 46, 44};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1375Oi(TT tt) {
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
            c1381Oo.A02(A00(0, 5, 85));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
