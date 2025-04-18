package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class VC extends AbstractC02350q {
    public static byte[] A01;
    public final /* synthetic */ V2 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.ETB, 42, Base64.padSymbol, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, Base64.padSymbol, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public VC(V2 v22) {
        this.A00 = v22;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC02350q
    public final void A0B(C1188bK c1188bK) {
        this.A00.A1T(c1188bK);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC02350q
    public final void A0C() {
        V1 v12;
        V1 v13;
        v12 = this.A00.A0G;
        if (v12 != null) {
            v13 = this.A00.A0G;
            v13.AAc();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC02350q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC02350q
    public final void A0F(InterfaceC02340p interfaceC02340p) {
        FO fo;
        FO fo2;
        fo = this.A00.A0A;
        if (fo != null) {
            fo2 = this.A00.A0A;
            fo2.A0J();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC02350q
    public final void A0G(C0676Jb c0676Jb) {
        long j3;
        V1 v12;
        V1 v13;
        C0S A0E = this.A00.A11().A0E();
        j3 = this.A00.A00;
        A0E.A2m(C0728Lf.A01(j3), c0676Jb.A03().getErrorCode(), c0676Jb.A04());
        v12 = this.A00.A0G;
        if (v12 != null) {
            v13 = this.A00.A0G;
            v13.ABR(c0676Jb);
        }
    }
}
