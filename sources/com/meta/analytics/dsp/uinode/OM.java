package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class OM {
    public static byte[] A00;
    public static String[] A01 = {"zHQaRI8Z04iZfuq60cOZ3MtOUQtnyLXk", "Py81lTfXTPvOohagzwztlFMwKgIeaa04", "ZBx", "ff4Sljy7OS0rEQC0yVPpTgSrr8dBXGgO", "WJ7E7dTZMlxiqC9ofw7stZL7dYzOgEyn", "lEp0yqe8iFuZgqtiF5MEL7dQIxoaDf7o", "1LQBU", "K3MGC9Pem9CSlPJADsZARPOkTW1wXgVW"};

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{8, 97, 91, 8, 97, 70, 91, 92, 73, 70, 92, 8, 79, 73, 69, 77, 91, 8, 73, 68, 68, 71, 95, 77, 76, Ascii.DC2, 8, 64, 41, 19, 64, 41, Ascii.SO, 19, Ascii.DC4, 1, Ascii.SO, Ascii.DC4, 64, 7, 1, Ascii.CR, 5, 19, 90, 64, 77, 10, 2, 2, 10, 1, 8, 77, Ascii.VT, Ascii.FF, 1, 1, Ascii.SI, Ascii.FF, Ascii.SO, 6, 77, Ascii.CAN, Ascii.US, 1, 77, Ascii.FF, Ascii.ESC, Ascii.FF, 4, 1, Ascii.FF, Ascii.SI, 1, 8, 87, 77, 119, 62, 36, 4, 35, 56, 37, 50, 109, 119, 124, 108, 58, 37, 40, 41, 35, 108, 57, 62, 32, 108, 37, 63, 108, 34, 57, 32, 32, 118, 108, 94, 82, 80, 19, 91, 92, 94, 88, 95, 82, 82, 86, 19, 86, 92, 73, 92, 83, 92, 74, 77, 86, 75, 92, 120, Ascii.DEL, 100, 121, 110, 84, 126, 121, 103, 84, 124, 110, 105, 84, 109, 106, 103, 103, 105, 106, 104, 96, 69, 90, 87, 86, 92, 108, 70, 65, 95};
    }

    static {
        A02();
    }

    public static OL A00(OP op, Bundle bundle, boolean z8) {
        OL c1499Tc;
        op.A05().A0F().A00(false);
        C1G A0x = op.A04().A0x();
        double A002 = OI.A00(A0x);
        boolean A0N = op.A04().A0x().A0N();
        boolean A06 = OI.A06(op.A00(), op.A01(), A002);
        AbstractC07930h A003 = C07940i.A00(op.A05(), op.A06(), A01(0, 0, 67), AbstractC1287Ky.A00(op.A04().A0x().A0F().A05()), new HashMap(), op.A04().A0y());
        boolean z9 = !TextUtils.isEmpty(A0x.A0D().A08());
        if (C1225Ih.A1W(op.A05())) {
            op.A05().A0A().AGv(op.A02(), op.A04().A12(), z9);
        }
        boolean A03 = A03(op, z9);
        if ((A0N && (A003 instanceof C1148Fe)) || A03) {
            c1499Tc = new TT(op, A03);
        } else if (z9) {
            c1499Tc = new BI(op);
        } else if (!z9 && C1225Ih.A2A(op.A05())) {
            c1499Tc = new BJ(op, A06);
        } else if (!A06) {
            c1499Tc = new C1499Tc(op, OI.A04(A002));
        } else {
            int A004 = op.A00();
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            A01[6] = "JelR9";
            c1499Tc = new C1502Tf(op, A004 == 2);
        }
        if (z8) {
            c1499Tc.A10(A0x, op.A04().A12(), A002, bundle);
        }
        return c1499Tc;
    }

    public static boolean A03(OP op, boolean z8) {
        boolean z9 = false;
        if (!op.A04().A0p() || !z8) {
            return false;
        }
        Uri A002 = AbstractC1287Ky.A00(op.A04().A0x().A0F().A05());
        String authority = A002.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            op.A05().A0E().AAF();
            return false;
        }
        boolean isInstantGames = authority.equals(A01(128, 5, 126));
        boolean isStoreUrl = A002.getQueryParameter(A01(155, 9, 116)) == null;
        String queryParameter = A002.getQueryParameter(A01(133, 22, 76));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(op.A04().A0Q());
        boolean equals = op.A05().getPackageName().equals(A01(109, 19, 122));
        boolean isVideoUrlNull = op.A04().A0q();
        if (isInstantGames && isStoreUrl && isGoogleFallBackUrlAvailable && (!equals || isVideoUrlNull)) {
            z9 = true;
        }
        if (!z9) {
            int i9 = Build.VERSION.SDK_INT;
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "ixVJz4LKAvkUhWpfUwnrm68OXA5reQsq";
            strArr[1] = "n4hyezKFC81nHjNiPwRfUtRp762j8aVq";
            if (i9 >= 24) {
                op.A05().A0E().AAE(A01(78, 11, 16) + isInstantGames + A01(89, 20, 11) + isStoreUrl + A01(46, 32, 42) + isGoogleFallBackUrlAvailable + A01(27, 19, 39) + equals + A01(0, 27, 111) + isVideoUrlNull);
            }
        }
        return z9;
    }
}
