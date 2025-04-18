package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0582Fe extends AbstractC1203bZ {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {Ascii.SO, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, Base64.padSymbol, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C0582Fe.class.getSimpleName();
    }

    public C0582Fe(C1070Yn c1070Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C02330o c02330o, boolean z10) {
        super(c1070Yn, j22, str, c02330o, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1203bZ
    public final EnumC02260g A0D() {
        EnumC02260g enumC02260g = EnumC02260g.A08;
        if (((AbstractC1203bZ) this).A02) {
            enumC02260g = A0G();
        }
        if (!AbstractC0737Lo.A0e(((AbstractC02270h) this).A00, enumC02260g, this.A01)) {
            A0E(this.A01, enumC02260g);
        }
        return enumC02260g;
    }

    public final EnumC02260g A0G() {
        if (A0F(this.A00)) {
            EnumC02260g actionOutcome = EnumC02260g.A09;
            return actionOutcome;
        }
        try {
            EnumC02260g actionOutcome2 = C0718Kv.A05(new C0718Kv(), ((AbstractC02270h) this).A00, AbstractC0721Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC02270h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC02260g actionOutcome3 = EnumC02260g.A03;
            return actionOutcome3;
        }
    }
}
