package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1767bX extends AbstractC07930h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, Byte.MIN_VALUE, 50, 126, 123, Byte.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C1767bX.class.getSimpleName();
    }

    public C1767bX(C1636Yn c1636Yn, J2 j22, String str, Uri uri) {
        super(c1636Yn, j22, str);
        this.A00 = uri;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC07930h
    public final EnumC07920g A0C() {
        try {
            C1284Kv.A0D(new C1284Kv(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
        return EnumC07920g.A08;
    }
}
