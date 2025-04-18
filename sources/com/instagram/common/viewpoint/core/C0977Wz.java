package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0977Wz implements I6<String> {
    public static byte[] A00;
    public static String[] A01 = {"uH4cRPiNAtd6hIF4d2nHkiKOYdeJaHzO", "JLNchjpJQuqbhh", "FWMzr4wbAebCjAMdCNncG5waeot5HoRB", "MfzvzGDE906n0IsIni7", "UQ8hk87iKtjST5OwSTOxRTAmcFw5heUv", "WkhjXxlb50SSewekCHh9frN5EhGMAbac", "AG13Y1v", "zPzrjTlkXgIdZhcUl4R5"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-94, -82, -89, -90, -29, -44, -25, -29, -81, -96, -77, -81, 106, -79, -81, -81, -119, 126, 125};
    }

    static {
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.I6
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final boolean A5x(String str) {
        String A0M = IK.A0M(str);
        if (!TextUtils.isEmpty(A0M) && ((!A0M.contains(A00(4, 4, 100)) || A0M.contains(A00(8, 8, 48))) && !A0M.contains(A00(0, 4, 47)))) {
            boolean contains = A0M.contains(A00(16, 3, 6));
            String[] strArr = A01;
            if (strArr[4].charAt(9) != strArr[0].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "NsSUytDbyDHOAvFQAY0dcpKHGU0KX3yK";
            strArr2[2] = "9aubWKHbvVA5AKhHWjYseXE5rNVVWtMF";
            if (!contains) {
                return true;
            }
        }
        return false;
    }
}
