package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class GP extends AbstractC1222cm {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{93, 122, 114, 119, 126, Byte.MAX_VALUE, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
    }

    static {
        A01();
        A03 = GP.class.getSimpleName();
    }

    public GP(C1045Zs c1045Zs, J7 j7, String str, Uri uri, Map<String, String> mExtraData, C01770o c01770o, boolean z2) {
        super(c1045Zs, j7, str, c01770o, z2);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1222cm
    public final EnumC01700g A0D() {
        EnumC01700g enumC01700g = EnumC01700g.A09;
        if (((AbstractC1222cm) this).A02) {
            enumC01700g = A0G();
        }
        A0E(this.A01, enumC01700g);
        return enumC01700g;
    }

    public final EnumC01700g A0G() {
        EnumC01700g enumC01700g = EnumC01700g.A09;
        try {
            L2.A0C(new L2(), ((AbstractC01710h) this).A00, L5.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((AbstractC01710h) this).A02);
            return enumC01700g;
        } catch (Exception unused) {
            String str = A00(0, 25, Opcodes.DNEG) + this.A00.toString();
            return EnumC01700g.A04;
        }
    }
}
