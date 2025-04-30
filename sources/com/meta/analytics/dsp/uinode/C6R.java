package com.meta.analytics.dsp.uinode;

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
    public final C1635Ym A02;
    public final InterfaceC1454Rj A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 114);
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

    public C6R(C1635Ym c1635Ym, InterfaceC1201Hj interfaceC1201Hj, C6S c6s, C6T c6t) {
        this.A02 = c1635Ym;
        InterfaceC1454Rj A4i = interfaceC1201Hj.A4i(EnumC1455Rk.A06);
        this.A03 = A4i;
        this.A00 = c6s;
        this.A01 = c6t;
        A4i.A3R(new C1644Yv(this));
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
                if (!A04 || C1225Ih.A0f(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
