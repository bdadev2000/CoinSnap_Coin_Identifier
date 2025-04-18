package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class KR implements S6 {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{75, 14, 48, 28, 29, 7, 22, 29, 7, 73, 83, 42, 29, 27, 29, 17, 14, 29, 88, 13, 10, 20, 66, 88, 30, 57, 44, 57, 56, 62, 119, 109};
    }

    public KR(boolean z2) {
        this.A00 = z2;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.S6
    public final boolean A9X() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.S6
    public final void AAO(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 13) + ((String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.instagram.common.viewpoint.core.S6
    public final void AAP(InterfaceC0838Rp interfaceC0838Rp) {
        if (interfaceC0838Rp != null) {
            String str = A00(11, 13, 6) + interfaceC0838Rp.getUrl();
            String str2 = A00(24, 8, 51) + interfaceC0838Rp.A8R();
            A02(interfaceC0838Rp.A7X());
        }
    }
}
