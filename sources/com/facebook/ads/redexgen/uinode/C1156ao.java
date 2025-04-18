package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1156ao extends KT {
    public static byte[] A03;
    public InterfaceC02340p A00;
    public String A01;
    public final /* synthetic */ FR A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{105, -116, -119, -104, -100, -115, -102, 72, -100, -111, -107, -115, -105, -99, -100, 86};
    }

    public C1156ao(FR fr, InterfaceC02340p interfaceC02340p, String str) {
        this.A02 = fr;
        this.A00 = interfaceC02340p;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0N(this.A00);
        this.A02.ABR(new C0676Jb(AdErrorType.NETWORK_ERROR, A00(0, 16, 38)));
    }
}
