package com.bytedance.adsdk.Sg;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Wwa {
    private boolean YFl = false;
    private final Set<Object> Sg = new YFl();
    private final Map<String, com.bytedance.adsdk.Sg.vc.AlY> tN = new HashMap();
    private final Comparator<Pair<String, Float>> AlY = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.Sg.Wwa.1
        @Override // java.util.Comparator
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
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

    public void YFl(boolean z10) {
        this.YFl = z10;
    }

    public void YFl(String str, float f10) {
        if (this.YFl) {
            com.bytedance.adsdk.Sg.vc.AlY alY = this.tN.get(str);
            if (alY == null) {
                alY = new com.bytedance.adsdk.Sg.vc.AlY();
                this.tN.put(str, alY);
            }
            alY.YFl(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.Sg.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
