package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0703Mk implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0705Mm A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 120, 116, 114, 112};
    }

    public ViewOnClickListenerC0703Mk(C0705Mm c0705Mm) {
        this.A00 = c0705Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VO vo;
        if (KQ.A02(this)) {
            return;
        }
        try {
            vo = this.A00.A06;
            vo.getCTAButton().A09(A00(0, 5, Opcodes.LSHL));
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
