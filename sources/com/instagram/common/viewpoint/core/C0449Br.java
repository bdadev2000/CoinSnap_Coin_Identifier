package com.instagram.common.viewpoint.core;

import android.content.Intent;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0449Br extends VV {
    public static byte[] A01;
    public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};
    public final /* synthetic */ C0705Mm A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
            strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 4);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-102};
    }

    static {
        A01();
    }

    public C0449Br(C0705Mm c0705Mm) {
        this.A00 = c0705Mm;
    }

    @Override // com.instagram.common.viewpoint.core.MR
    public final void A4P(String str) {
        String str2;
        C1045Zs c1045Zs;
        StringBuilder append = new StringBuilder().append(str).append(A00(0, 1, 92));
        str2 = this.A00.A0A;
        Intent intent = new Intent(append.append(str2).toString());
        c1045Zs = this.A00.A02;
        C02292o.A00(c1045Zs).A07(intent);
    }
}
