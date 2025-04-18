package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.2T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2T {
    public static C2S A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, Base64.padSymbol, 42, 119, Ascii.CAN, Ascii.GS, 6, Ascii.VT, Ascii.FS, 9, Ascii.SYN, Ascii.VT, Ascii.CR, Ascii.DLE, Ascii.ETB, Ascii.RS, 6, Ascii.SUB, Ascii.SYN, Ascii.ETB, Ascii.US, Ascii.DLE, Ascii.RS};
    }

    public static C2S A00(C1069Ym c1069Ym) {
        if (A00 == null) {
            synchronized (C2S.class) {
                if (A00 == null) {
                    A00 = new C2S(new C1118aC(c1069Ym.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), c1069Ym), 0)));
                }
            }
        }
        return A00;
    }
}
