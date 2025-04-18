package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6R {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C6S A00;
    public final C6T A01;
    public final C1069Ym A02;
    public final InterfaceC0888Rj A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = C6R.class.getSimpleName();
    }

    public C6R(C1069Ym c1069Ym, InterfaceC0635Hj interfaceC0635Hj, C6S c6s, C6T c6t) {
        this.A02 = c1069Ym;
        InterfaceC0888Rj A4i = interfaceC0635Hj.A4i(EnumC0889Rk.A06);
        this.A03 = A4i;
        this.A00 = c6s;
        this.A01 = c6t;
        A4i.A3R(new C1078Yv(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A03.A9C()) {
                this.A02.A04().A8z();
                return;
            }
            String btExtras = this.A03.A6h().optString(A00(0, 9, 62));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C0659Ih.A0f(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
