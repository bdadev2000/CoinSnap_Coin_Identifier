package com.bytedance.sdk.component.adexpress.dynamic.wN;

import com.bytedance.sdk.component.adexpress.dynamic.wN.Sg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class nc {
    public static float YFl(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<Sg.YFl> YFl(float f10, List<Sg.YFl> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Sg.YFl> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Sg.YFl) it.next().clone());
        }
        Iterator it2 = arrayList.iterator();
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        while (it2.hasNext()) {
            Sg.YFl yFl = (Sg.YFl) it2.next();
            if (yFl.Sg) {
                i10 = (int) (i10 + yFl.YFl);
            } else {
                i11 = (int) (i11 + yFl.YFl);
                z10 = false;
            }
        }
        if (z10 && f10 > i10) {
            return arrayList;
        }
        float f11 = i10;
        float f12 = f10 < f11 ? f10 / f11 : 1.0f;
        float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
        if (f13 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            boolean z11 = false;
            while (it3.hasNext()) {
                Sg.YFl yFl2 = (Sg.YFl) it3.next();
                if (!yFl2.Sg) {
                    float f14 = yFl2.tN;
                    if (f14 != 0.0f && yFl2.YFl * f13 > f14) {
                        yFl2.YFl = f14;
                        yFl2.Sg = true;
                        z11 = true;
                    }
                }
                arrayList2.add(yFl2);
            }
            if (z11) {
                return YFl(f10, arrayList2);
            }
        }
        Iterator it4 = arrayList.iterator();
        int i12 = 0;
        while (it4.hasNext()) {
            Sg.YFl yFl3 = (Sg.YFl) it4.next();
            if (yFl3.Sg) {
                yFl3.YFl = YFl(yFl3.YFl * f12);
            } else {
                yFl3.YFl = YFl(yFl3.YFl * f13);
            }
            i12 = (int) (i12 + yFl3.YFl);
        }
        float f15 = i12;
        if (f15 < f10) {
            float f16 = f10 - f15;
            for (int i13 = 0; i13 < arrayList.size() && f16 > 0.0f; i13 = (i13 + 1) % arrayList.size()) {
                Sg.YFl yFl4 = (Sg.YFl) arrayList.get(i13);
                if ((f10 < f11 && yFl4.Sg) || (f10 > f11 && !yFl4.Sg)) {
                    yFl4.YFl += 0.0625f;
                    f16 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
