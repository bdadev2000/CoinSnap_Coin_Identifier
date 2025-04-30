package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1578Wh implements DY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-61, -10, -10, -25, -17, -14, -10, -25, -26, -94, -10, -15, -94, -27, -12, -25, -29, -10, -25, -94, -26, -25, -27, -15, -26, -25, -12, -94, -24, -15, -12, -94, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -24, -15, -12, -17, -29, -10, 8, Ascii.ETB, Ascii.ETB, 19, Ascii.DLE, 10, 8, Ascii.ESC, Ascii.DLE, Ascii.SYN, Ascii.NAK, -42, Ascii.DLE, Ascii.VT, -38, -39, -24, -24, -28, -31, -37, -39, -20, -31, -25, -26, -89, -16, -91, -35, -27, -21, -33, -72, -57, -57, -61, -64, -70, -72, -53, -64, -58, -59, -122, -49, -124, -54, -70, -53, -68, -118, -116};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meta.analytics.dsp.uinode.DY
    public final DW A4Y(Format format) {
        char c9;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1248341703:
                if (str.equals(A00(50, 15, 80))) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1154383568:
                if (str.equals(A00(65, 18, 33))) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1652648887:
                if (str.equals(A00(83, 20, 0))) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return new C1575Wd();
            case 1:
                return new C1577Wf();
            case 2:
                return new C1574Wa();
            default:
                throw new IllegalArgumentException(A00(0, 50, 43));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.DY
    public final boolean AGf(Format format) {
        String str = format.A0O;
        String mimeType = A00(50, 15, 80);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(65, 18, 33);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(83, 20, 0);
                if (!mimeType3.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
