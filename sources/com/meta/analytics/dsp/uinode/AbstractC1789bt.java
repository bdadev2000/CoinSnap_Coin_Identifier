package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1789bt {
    public static byte[] A00;
    public static final C1788bs A01;
    public static final GK[] A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-2, 2, 7, -1, -4, 1, -63, 5, -8, -7, -1, -8, -10, 7, -63, -3, 9, 0, -63, -4, 1, 7, -8, 5, 1, -12, -1, -63, -27, -8, -7, -1, -8, -10, 7, -4, 2, 1, -39, -12, -10, 7, 2, 5, Ascii.FF, -36, 0, 3, -1};
    }

    static {
        C1788bs impl;
        try {
            A02();
            Class<?> implClass = Class.forName(A00(0, 49, 52));
            impl = (C1788bs) implClass.newInstance();
        } catch (ClassCastException unused) {
            impl = null;
        } catch (ClassNotFoundException unused2) {
            impl = null;
        } catch (IllegalAccessException unused3) {
            impl = null;
        } catch (InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new C1788bs();
        }
        A01 = impl;
        A02 = new GK[0];
    }

    public static String A01(AbstractC09516o abstractC09516o) {
        return A01.A03(abstractC09516o);
    }
}
