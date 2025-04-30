package com.bytedance.sdk.component.adexpress.dynamic.jU;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    private double COT;
    private int HWF;
    private double QR;
    private tG YW;
    private String ku;
    public Map<String, KS> zp = new HashMap();
    public Map<String, KS> lMd = new HashMap();
    public Map<String, KS> KS = new HashMap();
    private double jU = Math.random();

    /* loaded from: classes.dex */
    public static class KS {
        float lMd;
        float zp;

        public KS() {
        }

        public String toString() {
            return "UnitSize{width=" + this.zp + ", height=" + this.lMd + '}';
        }

        public KS(float f9, float f10) {
            this.zp = f9;
            this.lMd = f10;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$lMd, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0078lMd {
        float COT;
        int KS;
        double jU;
        int lMd;
        float zp;

        public static JSONObject zp(C0078lMd c0078lMd) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0078lMd.zp);
                jSONObject.put("letterSpacing", c0078lMd.lMd);
                jSONObject.put("lineHeight", c0078lMd.jU);
                jSONObject.put("maxWidth", c0078lMd.COT);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0078lMd.KS);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* loaded from: classes.dex */
    public static class zp implements Cloneable {
        float KS;
        boolean lMd;
        float zp;

        public Object clone() {
            try {
                return (zp) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public lMd(double d2, int i9, double d9, String str, tG tGVar) {
        this.COT = d2;
        this.HWF = i9;
        this.QR = d9;
        this.ku = str;
        this.YW = tGVar;
    }

    private KS COT(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar, float f9, float f10) {
        String str = kuVar.KS() + "_" + f9 + "_" + f10;
        if (this.KS.containsKey(str)) {
            return this.KS.get(str);
        }
        KS HWF = HWF(kuVar, f9, f10);
        this.KS.put(str, HWF);
        return HWF;
    }

    private KS HWF(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar, float f9, float f10) {
        new KS();
        com.bytedance.sdk.component.adexpress.dynamic.KS.HWF COT = kuVar.dT().COT();
        kuVar.dT().KS();
        COT.oB();
        float vwr = COT.vwr();
        int MBR = COT.MBR();
        double rCC = COT.rCC();
        int fgJ = COT.fgJ();
        boolean aax = COT.aax();
        boolean qtv = COT.qtv();
        int Rg = COT.Rg();
        C0078lMd c0078lMd = new C0078lMd();
        c0078lMd.zp = vwr;
        c0078lMd.lMd = MBR;
        c0078lMd.KS = fgJ;
        c0078lMd.jU = rCC;
        c0078lMd.COT = f9;
        return zp(kuVar.dT().KS(), c0078lMd, aax, qtv, Rg, kuVar);
    }

    public KS KS(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar, float f9, float f10) {
        if (kuVar == null) {
            return null;
        }
        KS zp2 = zp(kuVar);
        if (zp2 != null && (zp2.zp != 0.0f || zp2.lMd != 0.0f)) {
            return zp2;
        }
        KS jU = jU(kuVar, f9, f10);
        zp(kuVar, jU);
        return jU;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.jU.lMd.KS jU(com.bytedance.sdk.component.adexpress.dynamic.KS.ku r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.jU.lMd.jU(com.bytedance.sdk.component.adexpress.dynamic.KS.ku, float, float):com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS");
    }

    public KS lMd(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar, float f9, float f10) {
        KS ks = new KS();
        if (kuVar.dT().COT() == null) {
            return ks;
        }
        KS COT = COT(kuVar, f9, f10);
        float f11 = COT.zp;
        float f12 = COT.lMd;
        ks.zp = Math.min(f11, f9);
        ks.lMd = Math.min(f12, f10);
        return ks;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.jU.lMd.KS zp(com.bytedance.sdk.component.adexpress.dynamic.KS.ku r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.KS.COT r0 = r13.dT()
            java.lang.String r0 = r0.KS()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.KS.COT r0 = r13.dT()
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF r0 = r0.COT()
            java.lang.String r0 = r0.Np()
            if (r0 != 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS r13 = new com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS
            r13.<init>(r1, r1)
            return r13
        L23:
            java.lang.String r0 = "creative-playable-bait"
            boolean r0 = com.applovin.impl.L.x(r13, r0)
            if (r0 == 0) goto L31
            com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS r13 = new com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS
            r13.<init>(r1, r1)
            return r13
        L31:
            float r0 = r13.ku()
            float r1 = r13.YW()
            com.bytedance.sdk.component.adexpress.dynamic.KS.COT r2 = r13.dT()
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF r2 = r2.COT()
            java.lang.String r3 = r2.irS()
            java.lang.String r2 = r2.Gzh()
            int r4 = r13.tG()
            float r4 = (float) r4
            int r5 = r13.rV()
            float r5 = (float) r5
            float r6 = r13.dQp()
            float r7 = r13.KVG()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L7e
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS r13 = r12.lMd(r13, r0, r1)
            float r13 = r13.lMd
        L7b:
            float r1 = r13 + r7
            goto Laf
        L7e:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L97
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS r13 = r12.lMd(r13, r14, r0)
            float r14 = r13.zp
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r13 = r13.lMd
            goto L7b
        L97:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto Lae
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS r13 = r12.lMd(r13, r0, r1)
            float r13 = r13.lMd
            goto L7b
        Lae:
            r14 = r0
        Laf:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto Ld1
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto Lcf
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto Le5
        Lcf:
            r15 = r13
            goto Le5
        Ld1:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto Ldd
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto Le5
        Ldd:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto Le4
            goto Le5
        Le4:
            r15 = r1
        Le5:
            com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS r13 = new com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS
            r13.<init>()
            r13.zp = r14
            r13.lMd = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.jU.lMd.zp(com.bytedance.sdk.component.adexpress.dynamic.KS.ku, float, float):com.bytedance.sdk.component.adexpress.dynamic.jU.lMd$KS");
    }

    private KS KS(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list, float f9, float f10) {
        float f11;
        jU(list);
        KS ks = new KS();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF COT = kuVar.dT().COT();
            if (COT.Vjb() == 1 || COT.Vjb() == 2) {
                arrayList.add(kuVar);
            }
            if (COT.Vjb() != 1 && COT.Vjb() != 2) {
                arrayList2.add(kuVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KS((com.bytedance.sdk.component.adexpress.dynamic.KS.ku) it.next(), f9, f10);
        }
        if (arrayList2.size() <= 0) {
            return ks;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(KS((com.bytedance.sdk.component.adexpress.dynamic.KS.ku) it2.next(), f9, f10).zp));
        }
        ArrayList arrayList4 = new ArrayList();
        int i9 = 0;
        while (true) {
            if (i9 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar2 = (com.bytedance.sdk.component.adexpress.dynamic.KS.ku) arrayList2.get(i9);
            String irS = kuVar2.dT().COT().irS();
            float ku = kuVar2.ku();
            boolean equals = TextUtils.equals(irS, "flex");
            if (TextUtils.equals(irS, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> woN = kuVar2.woN();
                if (woN != null && woN.size() > 0) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> it3 = woN.iterator();
                    while (it3.hasNext()) {
                        if (lMd(it3.next())) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            zp zpVar = new zp();
            if (!equals) {
                ku = ((Float) arrayList3.get(i9)).floatValue();
            }
            zpVar.zp = ku;
            zpVar.lMd = !equals;
            if (equals) {
                f11 = ((Float) arrayList3.get(i9)).floatValue();
            }
            zpVar.KS = f11;
            arrayList4.add(zpVar);
            i9++;
        }
        zp(arrayList4, f9, arrayList2);
        List<zp> zp2 = dT.zp(f9, arrayList4);
        float f12 = 0.0f;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            f12 += zp2.get(i10).zp;
            if (((Float) arrayList3.get(i10)).floatValue() != zp2.get(i10).zp) {
                jU((com.bytedance.sdk.component.adexpress.dynamic.KS.ku) arrayList2.get(i10));
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i11 = 0;
        boolean z8 = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i11++;
            if (!lMd((com.bytedance.sdk.component.adexpress.dynamic.KS.ku) it4.next())) {
                z8 = false;
                break;
            }
            if (i11 == arrayList2.size()) {
                z8 = true;
            }
        }
        f11 = z8 ? f10 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar3 = (com.bytedance.sdk.component.adexpress.dynamic.KS.ku) arrayList2.get(i12);
            KS KS2 = KS(kuVar3, zp2.get(i12).zp, f10);
            if (!lMd(kuVar3)) {
                f11 = Math.max(f11, KS2.lMd);
            }
            arrayList5.add(KS2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((KS) it5.next()).lMd));
        }
        if (!z8) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar4 = (com.bytedance.sdk.component.adexpress.dynamic.KS.ku) arrayList2.get(i13);
                if (lMd(kuVar4) && ((Float) arrayList6.get(i13)).floatValue() != f11) {
                    jU(kuVar4);
                    KS(kuVar4, zp2.get(i13).zp, f11);
                }
            }
        }
        ks.zp = f12;
        ks.lMd = f11;
        return ks;
    }

    private boolean lMd(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> woN;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().dT().COT().irS(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z8 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar : list) {
                if (TextUtils.equals(kuVar.dT().COT().irS(), "auto") && (woN = kuVar.woN()) != null) {
                    int i9 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list2 : woN) {
                        i9++;
                        if (!lMd(list2)) {
                            break;
                        }
                        if (i9 == list2.size()) {
                            z8 = true;
                        }
                    }
                }
            }
            return z8;
        }
    }

    private String COT(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        return kuVar.KS();
    }

    private KS lMd(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list, float f9, float f10) {
        KS zp2 = zp(list);
        if (zp2 != null && (zp2.zp != 0.0f || zp2.lMd != 0.0f)) {
            return zp2;
        }
        KS KS2 = KS(list, f9, f10);
        zp(list, KS2);
        return KS2;
    }

    private boolean lMd(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        if (kuVar == null) {
            return false;
        }
        if (TextUtils.equals(kuVar.dT().COT().Gzh(), "flex")) {
            return true;
        }
        return KS(kuVar);
    }

    private KS zp(String str, C0078lMd c0078lMd, boolean z8, boolean z9, int i9, com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        return Bj.zp(str, kuVar.dT().lMd(), C0078lMd.zp(c0078lMd).toString(), z8, z9, i9, kuVar, this.COT, this.HWF, this.QR, this.ku, this.YW);
    }

    private void jU(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        this.zp.remove(COT(kuVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> woN = kuVar.woN();
        if (woN == null || woN.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> it = woN.iterator();
        while (it.hasNext()) {
            KS(it.next());
        }
    }

    private void zp(List<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> list, float f9, float f10) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> it = list.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (zp(it.next(), false)) {
                z8 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list2 : list) {
            zp zpVar = new zp();
            boolean zp2 = zp(list2, !z8);
            zpVar.zp = zp2 ? 1.0f : lMd(list2, f9, f10).lMd;
            zpVar.lMd = !zp2;
            arrayList.add(zpVar);
        }
        List<zp> zp3 = dT.zp(f10, arrayList);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (((zp) arrayList.get(i9)).zp != zp3.get(i9).zp) {
                List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list3 = list.get(i9);
                KS(list3);
                lMd(list3, f9, zp3.get(i9).zp);
            }
        }
    }

    private String jU(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            String KS2 = list.get(i9).KS();
            if (i9 < list.size() - 1) {
                sb.append(KS2);
                sb.append("-");
            } else {
                sb.append(KS2);
            }
        }
        return sb.toString();
    }

    private boolean zp(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list, boolean z8) {
        for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF COT = kuVar.dT().COT();
            String Gzh = COT.Gzh();
            if (TextUtils.equals(Gzh, "flex") || (z8 && ((TextUtils.equals(COT.irS(), "flex") && TextUtils.equals(COT.Gzh(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.KS.COT.zp.get(kuVar.dT().lMd()).intValue() == 7) || TextUtils.equals(Gzh, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> it = list.iterator();
        while (it.hasNext()) {
            if (KS(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean KS(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> woN;
        if (!kuVar.vwr() && TextUtils.equals(kuVar.dT().COT().Gzh(), "auto") && (woN = kuVar.woN()) != null && woN.size() > 0) {
            if (woN.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> it = woN.get(0).iterator();
                while (it.hasNext()) {
                    if (!lMd(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>> it2 = woN.iterator();
            while (it2.hasNext()) {
                if (zp(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void zp(List<zp> list, float f9, List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list2) {
        float f10 = 0.0f;
        for (zp zpVar : list) {
            if (zpVar.lMd) {
                f10 += zpVar.zp;
            }
        }
        if (f10 > f9) {
            int i9 = 0;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (list.get(i10).lMd && list2.get(i10).ot()) {
                    i9++;
                }
            }
            if (i9 > 0) {
                float ceil = (float) (Math.ceil(((f10 - f9) / i9) * 1000.0f) / 1000.0d);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    zp zpVar2 = list.get(i11);
                    if (zpVar2.lMd && list2.get(i11).ot()) {
                        zpVar2.zp -= ceil;
                    }
                }
            }
        }
    }

    private void KS(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.lMd.remove(jU(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> it = list.iterator();
        while (it.hasNext()) {
            jU(it.next());
        }
    }

    public void zp() {
        this.KS.clear();
        this.zp.clear();
        this.lMd.clear();
    }

    public KS zp(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        return this.zp.get(COT(kuVar));
    }

    public KS zp(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list) {
        return this.lMd.get(jU(list));
    }

    private void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar, KS ks) {
        this.zp.put(COT(kuVar), ks);
    }

    private void zp(List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> list, KS ks) {
        this.lMd.put(jU(list), ks);
    }
}
