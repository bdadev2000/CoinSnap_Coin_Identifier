package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0809Oi implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"0HsLQMHMjdf9XxY0FoFJM6DI5mSYk5cq", "dhr4behIProWKSykj", "GE701vnHE9lzBn3SwA4tW4e1BtUaptEm", "cLSMigQ4cfHVDaX8bfW4FJ5X08fXhUZC", "1xDVph1vyW65p7zSnZeJ5giXq27He7tX", "cas2Jd68DEdp6", "xZiGDxwVLZDgesSRv509BK1mAeaT2HFq", "7L9x50qsEvVQf3Iy1"};
    public final /* synthetic */ TT A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(10) != 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "t4xutyPnAWvSKPJUD0NJxEchNrBIH7fo";
            strArr[0] = "mOxo7NoxjINZF7CLuWUnFWlPSsoX4esJ";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 114);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{48, 52, 40, 46, 44};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0809Oi(TT tt) {
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
            c0815Oo.A02(A00(0, 5, 85));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
