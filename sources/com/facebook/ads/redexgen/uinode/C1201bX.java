package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1201bX extends AbstractC02270h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, ByteCompanionObject.MIN_VALUE, 50, 126, 123, ByteCompanionObject.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C1201bX.class.getSimpleName();
    }

    public C1201bX(C1070Yn c1070Yn, J2 j22, String str, Uri uri) {
        super(c1070Yn, j22, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC02270h
    public final EnumC02260g A0C() {
        try {
            C0718Kv.A0D(new C0718Kv(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
        return EnumC02260g.A08;
    }
}
