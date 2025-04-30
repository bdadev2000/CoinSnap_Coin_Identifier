package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1148Fe extends AbstractC1769bZ {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {Ascii.SO, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
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
        A04 = C1148Fe.class.getSimpleName();
    }

    public C1148Fe(C1636Yn c1636Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C07990o c07990o, boolean z8) {
        super(c1636Yn, j22, str, c07990o, z8);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1769bZ
    public final EnumC07920g A0D() {
        EnumC07920g enumC07920g = EnumC07920g.A08;
        if (((AbstractC1769bZ) this).A02) {
            enumC07920g = A0G();
        }
        if (!AbstractC1303Lo.A0e(((AbstractC07930h) this).A00, enumC07920g, this.A01)) {
            A0E(this.A01, enumC07920g);
        }
        return enumC07920g;
    }

    public final EnumC07920g A0G() {
        if (A0F(this.A00)) {
            EnumC07920g actionOutcome = EnumC07920g.A09;
            return actionOutcome;
        }
        try {
            EnumC07920g actionOutcome2 = C1284Kv.A05(new C1284Kv(), ((AbstractC07930h) this).A00, AbstractC1287Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC07930h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC07920g actionOutcome3 = EnumC07920g.A03;
            return actionOutcome3;
        }
    }
}
