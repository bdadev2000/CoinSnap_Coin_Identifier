package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class HG extends AbstractC1225cp<C0Q> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public HG(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225cp
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C0Y A04(C0Q c0q) {
        return new C0Y(this, c0q == null ? A00(0, 4, 46) : A00(0, 0, 18) + c0q.A03());
    }
}
