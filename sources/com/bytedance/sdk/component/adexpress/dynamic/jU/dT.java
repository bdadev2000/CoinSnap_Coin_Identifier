package com.bytedance.sdk.component.adexpress.dynamic.jU;

import com.bytedance.sdk.component.adexpress.dynamic.jU.lMd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class dT {
    public static float zp(float f9) {
        return (float) Math.ceil((f9 * 16.0f) / 16.0f);
    }

    public static List<lMd.zp> zp(float f9, List<lMd.zp> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<lMd.zp> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((lMd.zp) it.next().clone());
        }
        Iterator it2 = arrayList.iterator();
        boolean z8 = true;
        int i9 = 0;
        int i10 = 0;
        while (it2.hasNext()) {
            lMd.zp zpVar = (lMd.zp) it2.next();
            if (zpVar.lMd) {
                i9 = (int) (i9 + zpVar.zp);
            } else {
                i10 = (int) (i10 + zpVar.zp);
                z8 = false;
            }
        }
        if (z8 && f9 > i9) {
            return arrayList;
        }
        float f10 = i9;
        float f11 = f9 < f10 ? f9 / f10 : 1.0f;
        float f12 = f9 > f10 ? (f9 - f10) / i10 : 0.0f;
        if (f12 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            boolean z9 = false;
            while (it3.hasNext()) {
                lMd.zp zpVar2 = (lMd.zp) it3.next();
                if (!zpVar2.lMd) {
                    float f13 = zpVar2.KS;
                    if (f13 != 0.0f && zpVar2.zp * f12 > f13) {
                        zpVar2.zp = f13;
                        zpVar2.lMd = true;
                        z9 = true;
                    }
                }
                arrayList2.add(zpVar2);
            }
            if (z9) {
                return zp(f9, arrayList2);
            }
        }
        Iterator it4 = arrayList.iterator();
        int i11 = 0;
        while (it4.hasNext()) {
            lMd.zp zpVar3 = (lMd.zp) it4.next();
            if (zpVar3.lMd) {
                zpVar3.zp = zp(zpVar3.zp * f11);
            } else {
                zpVar3.zp = zp(zpVar3.zp * f12);
            }
            i11 = (int) (i11 + zpVar3.zp);
        }
        float f14 = i11;
        if (f14 < f9) {
            float f15 = f9 - f14;
            for (int i12 = 0; i12 < arrayList.size() && f15 > 0.0f; i12 = (i12 + 1) % arrayList.size()) {
                lMd.zp zpVar4 = (lMd.zp) arrayList.get(i12);
                if ((f9 < f10 && zpVar4.lMd) || (f9 > f10 && !zpVar4.lMd)) {
                    zpVar4.zp += 0.0625f;
                    f15 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
