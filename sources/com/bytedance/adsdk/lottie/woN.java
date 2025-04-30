package com.bytedance.adsdk.lottie;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class woN {
    private boolean zp = false;
    private final Set<Object> lMd = new zp();
    private final Map<String, com.bytedance.adsdk.lottie.HWF.jU> KS = new HashMap();
    private final Comparator<Pair<String, Float>> jU = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.lottie.woN.1
        @Override // java.util.Comparator
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    public void zp(boolean z8) {
        this.zp = z8;
    }

    public void zp(String str, float f9) {
        if (this.zp) {
            com.bytedance.adsdk.lottie.HWF.jU jUVar = this.KS.get(str);
            if (jUVar == null) {
                jUVar = new com.bytedance.adsdk.lottie.HWF.jU();
                this.KS.put(str, jUVar);
            }
            jUVar.zp(f9);
            if (str.equals("__container")) {
                Iterator<Object> it = this.lMd.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
