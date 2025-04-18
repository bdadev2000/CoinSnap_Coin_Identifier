package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1027Za implements InterfaceC0837Ro {
    public static byte[] A01;
    public final C1044Zr A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, Byte.MAX_VALUE, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    public C1027Za(C1044Zr c1044Zr) {
        this.A00 = c1044Zr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0837Ro
    public final Map<String, String> A6A(boolean z2) {
        HashMap hashMap = new HashMap();
        if (!C6H.A00().A04()) {
            hashMap.put(A00(0, 23, 64), C03738q.A00().A01(this.A00, true).A03());
        }
        hashMap.put(A00(23, 10, 51), AbstractC03768t.A06(new C8O(this.A00), this.A00, z2));
        return hashMap;
    }
}
