package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1722ao extends KT {
    public static byte[] A03;
    public InterfaceC08000p A00;
    public String A01;
    public final /* synthetic */ FR A02;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{105, -116, -119, -104, -100, -115, -102, 72, -100, -111, -107, -115, -105, -99, -100, 86};
    }

    public C1722ao(FR fr, InterfaceC08000p interfaceC08000p, String str) {
        this.A02 = fr;
        this.A00 = interfaceC08000p;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0N(this.A00);
        this.A02.ABR(new C1242Jb(AdErrorType.NETWORK_ERROR, A00(0, 16, 38)));
    }
}
