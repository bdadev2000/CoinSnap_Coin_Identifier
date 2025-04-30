package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VC extends AbstractC08010q {
    public static byte[] A01;
    public final /* synthetic */ V2 A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.ETB, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public VC(V2 v22) {
        this.A00 = v22;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0B(C1754bK c1754bK) {
        this.A00.A1T(c1754bK);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0C() {
        V1 v12;
        V1 v13;
        v12 = this.A00.A0G;
        if (v12 != null) {
            v13 = this.A00.A0G;
            v13.AAc();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0F(InterfaceC08000p interfaceC08000p) {
        FO fo;
        FO fo2;
        fo = this.A00.A0A;
        if (fo != null) {
            fo2 = this.A00.A0A;
            fo2.A0J();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0G(C1242Jb c1242Jb) {
        long j7;
        V1 v12;
        V1 v13;
        C0S A0E = this.A00.A11().A0E();
        j7 = this.A00.A00;
        A0E.A2m(C1294Lf.A01(j7), c1242Jb.A03().getErrorCode(), c1242Jb.A04());
        v12 = this.A00.A0G;
        if (v12 != null) {
            v13 = this.A00.A0G;
            v13.ABR(c1242Jb);
        }
    }
}
