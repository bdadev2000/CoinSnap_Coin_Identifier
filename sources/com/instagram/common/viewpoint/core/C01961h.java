package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01961h {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C03226f A00;
    public OC A01 = OC.A05;
    public ArrayList<C0772Pb> A02 = new ArrayList<>();
    public final C1E A03;
    public final InterfaceC01951g A04;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 73, 74, Utf8.REPLACEMENT_BYTE, 74, Utf8.REPLACEMENT_BYTE, 55, 66};
    }

    static {
        A06();
    }

    public C01961h(C1045Zs c1045Zs, C02091u c02091u, InterfaceC01951g interfaceC01951g, String str) {
        JSONObject dataObject = c02091u.A03();
        this.A03 = A01(c1045Zs, c02091u, str, dataObject);
        this.A04 = interfaceC01951g;
    }

    private AdError A00(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD) {
        if (abstractC1187cD == null || abstractC1187cD.A1W().isEmpty()) {
            c1045Zs.A07().AA0(A04(62, 3, 33), C8E.A0Z, new C8F(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1E A01(C1045Zs c1045Zs, C02091u c02091u, String str, JSONObject jSONObject) {
        C1E c1e = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                c1e = C1185cB.A03(jSONObject, c1045Zs, true);
                c1e.A0x(true);
                c1e.A0u(A04(96, 12, Opcodes.LNEG));
            } catch (JSONException unused) {
            }
        }
        if (c1e == null) {
            c1e = C0535Fm.A02(jSONObject, c1045Zs);
        }
        c1e.A0t(str);
        C8X A01 = c02091u.A01();
        if (A01 != null) {
            c1e.A0p(A01.A06());
        }
        return c1e;
    }

    private C03226f A03(C1045Zs c1045Zs) {
        return this.A00 != null ? this.A00 : new C03226f(c1045Zs);
    }

    private void A08(C1045Zs c1045Zs, C0535Fm c0535Fm) {
        C01901b playableData = c0535Fm.A1P().A0E().A06();
        A0B(playableData != null ? playableData.A0B() : OC.A05);
        C1176c2 c1176c2 = new C1176c2(this);
        C03226f c03226f = new C03226f(c1045Zs);
        boolean z2 = C0608Im.A26(c1045Zs) && AnonymousClass65.A0A(c0535Fm.A0o());
        if (z2) {
            AnonymousClass65 unifiedAssetsLoader = new AnonymousClass65(c03226f, c0535Fm.A0o(), c0535Fm.A0c(), c0535Fm.A0l(), z2, new C1175c1(this));
            c03226f.A0d(new JF(c0535Fm.A1U(), c1045Zs.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC02061r.A02(c1045Zs, c0535Fm, true, c1176c2);
    }

    private void A09(C1045Zs c1045Zs, EnumSet<CacheFlag> enumSet, AbstractC1187cD abstractC1187cD, int i2, InterfaceC01951g interfaceC01951g) {
        boolean A19 = abstractC1187cD.A19();
        C03226f A03 = A03(c1045Zs);
        A03.A0d(new JF(abstractC1187cD.A1U(), c1045Zs.A09()));
        boolean z2 = C0608Im.A26(c1045Zs) && AnonymousClass65.A0A(abstractC1187cD.A0o());
        if (z2) {
            new AnonymousClass65(A03, abstractC1187cD.A0o(), abstractC1187cD.A0c(), abstractC1187cD.A0l(), z2, new C1179c5(this, c1045Zs, A19, abstractC1187cD, interfaceC01951g)).A0B();
            return;
        }
        String A04 = A04(96, 12, Opcodes.LNEG);
        if (A19) {
            C03186b c03186b = new C03186b(abstractC1187cD.A0Z(), abstractC1187cD.A0l(), A04);
            c03186b.A04 = true;
            c03186b.A03 = A04(0, 5, 78);
            A03.A0X(c03186b);
        }
        A03.A0c(new C03206d(abstractC1187cD.A1S().A01(), QJ.A04, QJ.A04, abstractC1187cD.A0l(), A04(96, 12, Opcodes.LNEG)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i3 = 0;
        boolean A2n = C0608Im.A2n(c1045Zs, RS.A03());
        for (C1F adInfo : abstractC1187cD.A1W()) {
            C03206d c03206d = new C03206d(adInfo.A0E().A07(), AbstractC02021n.A00(adInfo.A0E()), AbstractC02021n.A01(adInfo.A0E()), abstractC1187cD.A0l(), A04(96, 12, Opcodes.LNEG));
            if (i3 == 0) {
                A03.A0b(c03206d);
            } else {
                A03.A0c(c03206d);
            }
            Iterator<String> it = adInfo.A0H().A01().iterator();
            while (it.hasNext()) {
                A03.A0c(new C03206d(it.next(), -1, -1, abstractC1187cD.A0l(), A04(96, 12, Opcodes.LNEG)));
            }
            if (contains && !TextUtils.isEmpty(adInfo.A0E().A08())) {
                C03186b c03186b2 = new C03186b(adInfo.A0E().A08(), abstractC1187cD.A0l(), A04(96, 12, Opcodes.LNEG), adInfo.A0E().A05());
                c03186b2.A04 = false;
                if (i3 == 0) {
                    if (A19 && !A2n) {
                        A03.A0X(c03186b2);
                    } else {
                        A03.A0a(c03186b2);
                    }
                } else if (A19 && !A2n) {
                    A03.A0Y(c03186b2);
                } else {
                    A03.A0Z(c03186b2);
                }
            }
            i3++;
        }
        A03.A0W(new C1177c3(this, c1045Zs, A19, abstractC1187cD, interfaceC01951g), new C6Y(abstractC1187cD.A0l(), A04, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1045Zs c1045Zs, EnumSet<CacheFlag> enumSet, C1185cB c1185cB, AbstractC1187cD abstractC1187cD, int i2, InterfaceC01951g interfaceC01951g) {
        A09(c1045Zs, enumSet, abstractC1187cD, i2, new C1181c7(this, c1045Zs, abstractC1187cD, c1185cB, i2, interfaceC01951g, enumSet));
    }

    private void A0B(OC oc) {
        this.A01 = oc;
    }

    private boolean A0C(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD) {
        AdError A00 = A00(c1045Zs, abstractC1187cD);
        if (A00 != null) {
            this.A04.AB4(A00);
            return true;
        }
        return false;
    }

    public final C1E A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return com.instagram.common.viewpoint.core.KG.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        return com.instagram.common.viewpoint.core.KG.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.KG A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.1E r0 = r5.A03
            boolean r0 = r0.A15()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.KG r0 = com.instagram.common.viewpoint.core.KG.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.1E r4 = r5.A03
            com.facebook.ads.redexgen.X.cD r4 = (com.instagram.common.viewpoint.core.AbstractC1187cD) r4
            boolean r0 = r4.A19()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.KG r0 = com.instagram.common.viewpoint.core.KG.A06
            return r0
        L18:
            java.util.List r0 = r4.A1W()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.KG r0 = com.instagram.common.viewpoint.core.KG.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.1F r0 = r4.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            com.facebook.ads.redexgen.X.1b r3 = r0.A06()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C01961h.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C01961h.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L50
            com.facebook.ads.redexgen.X.KG r0 = com.instagram.common.viewpoint.core.KG.A0C
            return r0
        L50:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C01961h.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C01961h.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L74
        L6e:
            com.facebook.ads.redexgen.X.KG r0 = com.instagram.common.viewpoint.core.KG.A0D
            return r0
        L71:
            if (r3 == 0) goto L74
            goto L6e
        L74:
            com.facebook.ads.redexgen.X.KG r0 = com.instagram.common.viewpoint.core.KG.A0B
            return r0
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C01961h.A0E():com.facebook.ads.redexgen.X.KG");
    }

    public final OC A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A15()) {
            return ((C1185cB) this.A03).A1Q();
        }
        return ((AbstractC1187cD) this.A03).A1U();
    }

    public final void A0H() {
        this.A04.AHE();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0r(rewardData);
        this.A03.A0v(str);
        if (A0D().A15()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1045Zs c1045Zs, EnumSet<CacheFlag> enumSet) {
        if (A0E() == KG.A04) {
            C1185cB c1185cB = (C1185cB) this.A03;
            AbstractC1187cD A1M = c1185cB.A1M();
            if (A0C(c1045Zs, A1M) || A1M == null) {
                return;
            }
            this.A04.AEv();
            A0A(c1045Zs, enumSet, c1185cB, A1M, 0, this.A04);
            return;
        }
        AbstractC1187cD abstractC1187cD = (AbstractC1187cD) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1045Zs, abstractC1187cD)) {
            return;
        }
        this.A04.AEv();
        if (A0E() == KG.A0C) {
            C0535Fm c0535Fm = (C0535Fm) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1045Zs, c0535Fm);
                return;
            } else {
                A08(c1045Zs, c0535Fm);
                return;
            }
        }
        A09(c1045Zs, enumSet, (C0535Fm) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A11();
    }

    public final boolean A0L(AbstractC1187cD abstractC1187cD) {
        return !TextUtils.isEmpty(abstractC1187cD.A1P().A0E().A08());
    }
}
