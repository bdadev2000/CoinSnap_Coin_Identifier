package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class P4 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ UQ A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 95, 90, 91, 101};
    }

    public P4(UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        PD pd;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A00.A0O;
            if (z2) {
                return;
            }
            pd = this.A00.A0M;
            pd.A02(A00(0, 5, Opcodes.LSHL));
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
