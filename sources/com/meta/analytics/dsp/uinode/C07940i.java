package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07940i {
    public static byte[] A00;
    public static String[] A01 = {"88AoqknPZ4rnlocmRSd1iIvU160OI6Up", "Xa", "c0t0ITAkOrWkNbi2AOUUle7x7Lv9c02n", "B7XNNyfmW5R2wceLmJkXAkDES3fZG3Pt", "MUV", "NALjFYAH0tlSEiNw3RaQSfKZY5jyxbRm", "XF7p93xq3OHri6co5HggQunfVTz3vEaG", "n2FdIZz9zx79PfKUryB9rXi8CBHMM9xX"};
    public static final String A02;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, Ascii.SUB, 78, 85, Ascii.SUB, 74, 91, 72, 73, 95, Ascii.SUB, 80, 73, 85, 84, Ascii.SUB, 94, 91, 78, 91, Ascii.SUB, 83, 84, Ascii.SUB, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, Ascii.DC4, 19, Ascii.SYN, 3, Ascii.SYN, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, Ascii.ESC, 10, Ascii.CAN, Ascii.CAN, Ascii.US, 3, Ascii.EM, 4, Ascii.RS, Ascii.FF, 3, 39, 32, 59, 38, 49, 40, 47, 52, 41, 62, 4, 46, 41, 55, 4, 44, 62, 57, 4, 61, 58, 55, 55, 57, 58, 56, 48, 49, 55, 48, 32, 123, 100, 105, 104, 98, 82, 120, Ascii.DEL, 97};
    }

    static {
        A03();
        A02 = C07940i.class.getSimpleName();
    }

    public static AbstractC07930h A00(C1636Yn c1636Yn, J2 j22, String str, Uri uri, Map<String, String> map, C1U c1u) {
        return A01(c1636Yn, j22, str, uri, map, true, false, c1u);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.meta.analytics.dsp.uinode.AbstractC07930h A01(com.meta.analytics.dsp.uinode.C1636Yn r14, com.meta.analytics.dsp.uinode.J2 r15, java.lang.String r16, android.net.Uri r17, java.util.Map<java.lang.String, java.lang.String> r18, boolean r19, boolean r20, com.meta.analytics.dsp.uinode.C1U r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C07940i.A01(com.facebook.ads.redexgen.X.Yn, com.facebook.ads.redexgen.X.J2, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean, com.facebook.ads.redexgen.X.1U):com.facebook.ads.redexgen.X.0h");
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
