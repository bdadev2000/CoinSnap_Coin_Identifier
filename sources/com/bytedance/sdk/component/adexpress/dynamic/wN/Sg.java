package com.bytedance.sdk.component.adexpress.dynamic.wN;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    private double DSW;
    private GA NjR;
    private String qsH;

    /* renamed from: vc, reason: collision with root package name */
    private int f10402vc;
    private double wN;
    public Map<String, tN> YFl = new HashMap();
    public Map<String, tN> Sg = new HashMap();
    public Map<String, tN> tN = new HashMap();
    private double AlY = Math.random();

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$Sg, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0084Sg {
        double AlY;
        int Sg;
        float YFl;
        int tN;
        float wN;

        public static JSONObject YFl(C0084Sg c0084Sg) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0084Sg.YFl);
                jSONObject.put("letterSpacing", c0084Sg.Sg);
                jSONObject.put("lineHeight", c0084Sg.AlY);
                jSONObject.put("maxWidth", c0084Sg.wN);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0084Sg.tN);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements Cloneable {
        boolean Sg;
        float YFl;
        float tN;

        public Object clone() {
            try {
                return (YFl) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class tN {
        float Sg;
        float YFl;

        public tN() {
        }

        public tN(float f10, float f11) {
            this.YFl = f10;
            this.Sg = f11;
        }

        public String toString() {
            return "UnitSize{width=" + this.YFl + ", height=" + this.Sg + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public Sg(double d10, int i10, double d11, String str, GA ga2) {
        this.wN = d10;
        this.f10402vc = i10;
        this.DSW = d11;
        this.qsH = str;
        this.NjR = ga2;
    }

    private tN vc(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, float f10, float f11) {
        new tN();
        com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN = qsh.nc().wN();
        qsh.nc().tN();
        wN.VB();
        float Wwa = wN.Wwa();
        int Cqy = wN.Cqy();
        double Ld = wN.Ld();
        int Jc = wN.Jc();
        boolean zG = wN.zG();
        boolean RX = wN.RX();
        int ko = wN.ko();
        C0084Sg c0084Sg = new C0084Sg();
        c0084Sg.YFl = Wwa;
        c0084Sg.Sg = Cqy;
        c0084Sg.tN = Jc;
        c0084Sg.AlY = Ld;
        c0084Sg.wN = f10;
        return YFl(qsh.nc().tN(), c0084Sg, zG, RX, ko, qsh);
    }

    private tN wN(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, float f10, float f11) {
        String str = qsh.tN() + "_" + f10 + "_" + f11;
        if (this.tN.containsKey(str)) {
            return this.tN.get(str);
        }
        tN vc2 = vc(qsh, f10, f11);
        this.tN.put(str, vc2);
        return vc2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.wN.Sg.tN AlY(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.wN.Sg.AlY(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH, float, float):com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN");
    }

    public tN Sg(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, float f10, float f11) {
        tN tNVar = new tN();
        if (qsh.nc().wN() == null) {
            return tNVar;
        }
        tN wN = wN(qsh, f10, f11);
        float f12 = wN.YFl;
        float f13 = wN.Sg;
        tNVar.YFl = Math.min(f12, f10);
        tNVar.Sg = Math.min(f13, f11);
        return tNVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.wN.Sg.tN YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.AlY.wN r0 = r13.nc()
            java.lang.String r0 = r0.tN()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.AlY.wN r0 = r13.nc()
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc r0 = r0.wN()
            java.lang.String r0 = r0.Vmj()
            if (r0 != 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN r13 = new com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN
            r13.<init>(r1, r1)
            return r13
        L23:
            java.lang.String r0 = "creative-playable-bait"
            boolean r0 = com.applovin.impl.mediation.ads.e.w(r13, r0)
            if (r0 == 0) goto L31
            com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN r13 = new com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN
            r13.<init>(r1, r1)
            return r13
        L31:
            float r0 = r13.qsH()
            float r1 = r13.NjR()
            com.bytedance.sdk.component.adexpress.dynamic.AlY.wN r2 = r13.nc()
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc r2 = r2.wN()
            java.lang.String r3 = r2.dXO()
            java.lang.String r2 = r2.Ga()
            int r4 = r13.GA()
            float r4 = (float) r4
            int r5 = r13.pDU()
            float r5 = (float) r5
            float r6 = r13.EH()
            float r7 = r13.rkt()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L7c
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN r13 = r12.Sg(r13, r0, r1)
            float r13 = r13.Sg
            goto Lab
        L7c:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L95
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN r13 = r12.Sg(r13, r14, r0)
            float r14 = r13.YFl
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r13 = r13.Sg
            goto Lab
        L95:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto Lae
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN r13 = r12.Sg(r13, r0, r1)
            float r13 = r13.Sg
        Lab:
            float r1 = r13 + r7
            goto Laf
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
            com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN r13 = new com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN
            r13.<init>()
            r13.YFl = r14
            r13.Sg = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.wN.Sg.YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH, float, float):com.bytedance.sdk.component.adexpress.dynamic.wN.Sg$tN");
    }

    public tN tN(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, float f10, float f11) {
        if (qsh == null) {
            return null;
        }
        tN YFl2 = YFl(qsh);
        if (YFl2 != null && (YFl2.YFl != 0.0f || YFl2.Sg != 0.0f)) {
            return YFl2;
        }
        tN AlY = AlY(qsh, f10, f11);
        YFl(qsh, AlY);
        return AlY;
    }

    private tN tN(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list, float f10, float f11) {
        float f12;
        AlY(list);
        tN tNVar = new tN();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh : list) {
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN = qsh.nc().wN();
            if (wN.tQ() == 1 || wN.tQ() == 2) {
                arrayList.add(qsh);
            }
            if (wN.tQ() != 1 && wN.tQ() != 2) {
                arrayList2.add(qsh);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tN((com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) it.next(), f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return tNVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(tN((com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) it2.next(), f10, f11).YFl));
        }
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh2 = (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) arrayList2.get(i10);
            String dXO = qsh2.nc().wN().dXO();
            float qsH = qsh2.qsH();
            boolean equals = TextUtils.equals(dXO, "flex");
            if (TextUtils.equals(dXO, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> lG = qsh2.lG();
                if (lG != null && lG.size() > 0) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> it3 = lG.iterator();
                    while (it3.hasNext()) {
                        if (Sg(it3.next())) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            YFl yFl = new YFl();
            if (!equals) {
                qsH = ((Float) arrayList3.get(i10)).floatValue();
            }
            yFl.YFl = qsH;
            yFl.Sg = !equals;
            if (equals) {
                f12 = ((Float) arrayList3.get(i10)).floatValue();
            }
            yFl.tN = f12;
            arrayList4.add(yFl);
            i10++;
        }
        YFl(arrayList4, f10, arrayList2);
        List<YFl> YFl2 = nc.YFl(f10, arrayList4);
        float f13 = 0.0f;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f13 += YFl2.get(i11).YFl;
            if (((Float) arrayList3.get(i11)).floatValue() != YFl2.get(i11).YFl) {
                AlY((com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) arrayList2.get(i11));
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i12++;
            if (!Sg((com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) it4.next())) {
                z10 = false;
                break;
            }
            if (i12 == arrayList2.size()) {
                z10 = true;
            }
        }
        f12 = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh3 = (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) arrayList2.get(i13);
            tN tN2 = tN(qsh3, YFl2.get(i13).YFl, f11);
            if (!Sg(qsh3)) {
                f12 = Math.max(f12, tN2.Sg);
            }
            arrayList5.add(tN2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((tN) it5.next()).Sg));
        }
        if (!z10) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh4 = (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) arrayList2.get(i14);
                if (Sg(qsh4) && ((Float) arrayList6.get(i14)).floatValue() != f12) {
                    AlY(qsh4);
                    tN(qsh4, YFl2.get(i14).YFl, f12);
                }
            }
        }
        tNVar.YFl = f13;
        tNVar.Sg = f12;
        return tNVar;
    }

    private boolean Sg(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list) {
        boolean z10;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> lG;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (TextUtils.equals(it.next().nc().wN().dXO(), "flex")) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return true;
        }
        while (true) {
            boolean z11 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh : list) {
                if (TextUtils.equals(qsh.nc().wN().dXO(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && (lG = qsh.lG()) != null) {
                    int i10 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list2 : lG) {
                        i10++;
                        if (!Sg(list2)) {
                            break;
                        }
                        if (i10 == list2.size()) {
                            z11 = true;
                        }
                    }
                }
            }
            return z11;
        }
    }

    private String wN(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        return qsh.tN();
    }

    private tN Sg(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list, float f10, float f11) {
        tN YFl2 = YFl(list);
        if (YFl2 != null && (YFl2.YFl != 0.0f || YFl2.Sg != 0.0f)) {
            return YFl2;
        }
        tN tN2 = tN(list, f10, f11);
        YFl(list, tN2);
        return tN2;
    }

    private boolean Sg(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        if (qsh == null) {
            return false;
        }
        if (TextUtils.equals(qsh.nc().wN().Ga(), "flex")) {
            return true;
        }
        return tN(qsh);
    }

    private tN YFl(String str, C0084Sg c0084Sg, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        return eT.YFl(str, qsh.nc().Sg(), C0084Sg.YFl(c0084Sg).toString(), z10, z11, i10, qsh, this.wN, this.f10402vc, this.DSW, this.qsH, this.NjR);
    }

    private void AlY(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        this.YFl.remove(wN(qsh));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> lG = qsh.lG();
        if (lG == null || lG.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> it = lG.iterator();
        while (it.hasNext()) {
            tN(it.next());
        }
    }

    private void YFl(List<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (YFl(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list2 : list) {
            YFl yFl = new YFl();
            boolean YFl2 = YFl(list2, !z10);
            yFl.YFl = YFl2 ? 1.0f : Sg(list2, f10, f11).Sg;
            yFl.Sg = !YFl2;
            arrayList.add(yFl);
        }
        List<YFl> YFl3 = nc.YFl(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((YFl) arrayList.get(i10)).YFl != YFl3.get(i10).YFl) {
                List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list3 = list.get(i10);
                tN(list3);
                Sg(list3, f10, YFl3.get(i10).YFl);
            }
        }
    }

    private String AlY(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String tN2 = list.get(i10).tN();
            if (i10 < list.size() - 1) {
                sb2.append(tN2);
                sb2.append("-");
            } else {
                sb2.append(tN2);
            }
        }
        return sb2.toString();
    }

    private boolean YFl(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list, boolean z10) {
        boolean z11;
        for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh : list) {
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN = qsh.nc().wN();
            String Ga = wN.Ga();
            if (TextUtils.equals(Ga, "flex") || (z10 && ((TextUtils.equals(wN.dXO(), "flex") && TextUtils.equals(wN.Ga(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.AlY.wN.YFl.get(qsh.nc().Sg()).intValue() == 7) || TextUtils.equals(Ga, "flex")))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        if (z11) {
            return true;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> it = list.iterator();
        while (it.hasNext()) {
            if (tN(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean tN(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> lG;
        if (!qsh.Wwa() && TextUtils.equals(qsh.nc().wN().Ga(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && (lG = qsh.lG()) != null && lG.size() > 0) {
            if (lG.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> it = lG.get(0).iterator();
                while (it.hasNext()) {
                    if (!Sg(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>> it2 = lG.iterator();
            while (it2.hasNext()) {
                if (YFl(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void YFl(List<YFl> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list2) {
        float f11 = 0.0f;
        for (YFl yFl : list) {
            if (yFl.Sg) {
                f11 += yFl.YFl;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).Sg && list2.get(i11).Ne()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float ceil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    YFl yFl2 = list.get(i12);
                    if (yFl2.Sg && list2.get(i12).Ne()) {
                        yFl2.YFl -= ceil;
                    }
                }
            }
        }
    }

    private void tN(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.Sg.remove(AlY(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> it = list.iterator();
        while (it.hasNext()) {
            AlY(it.next());
        }
    }

    public void YFl() {
        this.tN.clear();
        this.YFl.clear();
        this.Sg.clear();
    }

    public tN YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        return this.YFl.get(wN(qsh));
    }

    public tN YFl(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list) {
        return this.Sg.get(AlY(list));
    }

    private void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, tN tNVar) {
        this.YFl.put(wN(qsh), tNVar);
    }

    private void YFl(List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> list, tN tNVar) {
        this.Sg.put(AlY(list), tNVar);
    }
}
