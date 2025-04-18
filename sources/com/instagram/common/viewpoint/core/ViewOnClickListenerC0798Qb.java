package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0798Qb implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TJ A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 51, 57, 62, 60, 47, 57, 46};
    }

    public ViewOnClickListenerC0798Qb(TJ tj) {
        this.A00 = tj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC0909Ui viewOnClickListenerC0909Ui;
        ViewOnClickListenerC0909Ui viewOnClickListenerC0909Ui2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0909Ui = this.A00.A02;
            if (viewOnClickListenerC0909Ui == null) {
                return;
            }
            viewOnClickListenerC0909Ui2 = this.A00.A02;
            viewOnClickListenerC0909Ui2.A09(A00(0, 8, 103));
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
