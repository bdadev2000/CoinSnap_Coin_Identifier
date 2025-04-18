package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1220ck extends AbstractC01710h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, Utf8.REPLACEMENT_BYTE, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C1220ck.class.getSimpleName();
    }

    public C1220ck(C1045Zs c1045Zs, J7 j7, String str, Uri uri) {
        super(c1045Zs, j7, str);
        this.A00 = uri;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01710h
    public final EnumC01700g A0C() {
        try {
            L2.A0D(new L2(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC01700g.A09;
    }
}
