package com.bytedance.sdk.openadsdk.rV.zp;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class COT {
    private static final Map<Integer, lMd> zp = new ConcurrentHashMap();

    private static boolean KS(woN won) {
        if (won == null) {
            return false;
        }
        String zp2 = YhE.zp(won);
        if ((!"open_ad".equals(zp2) && !"fullscreen_interstitial_ad".equals(zp2) && !"rewarded_video".equals(zp2)) || cz.lMd(won) || won.rV() == 5 || won.rV() == 33 || !woN.COT(won) || won.eWG() == null) {
            return false;
        }
        return true;
    }

    public static void lMd(Integer num) {
        zp.remove(num);
    }

    public static void zp(View view, woN won, int i9) {
        if (view == null || won == null || won.etV()) {
            return;
        }
        boolean KS = KS(won);
        if (cz.lMd(won)) {
            i9 = -1;
        }
        zp(zp(view, won, KS, i9));
    }

    public static Integer lMd(woN won) {
        return Integer.valueOf((won.Gor() + won.fgJ()).hashCode());
    }

    private static lMd zp(View view, woN won, boolean z8, int i9) {
        if (view == null || won == null || won.fgJ() == null) {
            return null;
        }
        Integer lMd = lMd(won);
        Map<Integer, lMd> map = zp;
        if (map.containsKey(lMd)) {
            lMd lmd = map.get(lMd);
            if (lmd != null) {
                lmd.zp(view);
            }
            return lmd;
        }
        lMd zp2 = lMd.zp(z8, lMd, view, won, i9);
        map.put(lMd, zp2);
        return zp2;
    }

    private static void zp(lMd lmd) {
        if (lmd == null) {
            return;
        }
        lmd.zp();
    }

    public static void zp(woN won, int i9) {
        if (won == null || won.fgJ() == null) {
            return;
        }
        zp(zp.get(lMd(won)), i9);
    }

    public static void zp(lMd lmd, int i9) {
        if (lmd == null) {
            return;
        }
        lmd.zp(i9);
    }

    public static void zp(woN won) {
        if (won == null || won.fgJ() == null) {
            return;
        }
        Integer lMd = lMd(won);
        Map<Integer, lMd> map = zp;
        lMd lmd = map.get(lMd);
        if (lmd != null) {
            lmd.dT();
        }
        lMd(lMd);
        if (map.size() <= 0) {
            QR.zp();
        }
    }

    public static lMd zp(Integer num) {
        return zp.get(num);
    }
}
