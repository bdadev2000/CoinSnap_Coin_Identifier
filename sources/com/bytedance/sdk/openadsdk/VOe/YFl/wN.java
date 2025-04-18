package com.bytedance.sdk.openadsdk.VOe.YFl;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class wN {
    private static final Map<Integer, Sg> YFl = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class YFl {
        public int Sg = -1;
        public int YFl;

        public YFl(int i10) {
            this.YFl = i10;
        }
    }

    public static void Sg(Integer num) {
        YFl.remove(num);
    }

    public static void YFl(View view, Wwa wwa, YFl yFl) {
        if (view == null || wwa == null || wwa.HVP()) {
            return;
        }
        boolean tN = tN(wwa);
        if (Ne.Sg(wwa) && yFl != null) {
            yFl.YFl = -1;
        }
        YFl(YFl(view, wwa, tN, yFl));
    }

    private static boolean tN(Wwa wwa) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (wwa == null) {
            return false;
        }
        String YFl2 = Sco.YFl(wwa);
        if (!"open_ad".equals(YFl2) && !"fullscreen_interstitial_ad".equals(YFl2) && !"rewarded_video".equals(YFl2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && !Ne.Sg(wwa)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && wwa.rkt() != 5) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && wwa.rkt() != 33) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 || !Wwa.wN(wwa) || wwa.BPI() == null) {
            return false;
        }
        return true;
    }

    public static Integer Sg(Wwa wwa) {
        return Integer.valueOf((wwa.ivp() + wwa.zz()).hashCode());
    }

    private static Sg YFl(View view, Wwa wwa, boolean z10, YFl yFl) {
        if (view == null || wwa == null || wwa.zz() == null) {
            return null;
        }
        Integer Sg = Sg(wwa);
        Map<Integer, Sg> map = YFl;
        if (map.containsKey(Sg)) {
            Sg sg2 = map.get(Sg);
            if (sg2 != null) {
                sg2.YFl(view);
            }
            return sg2;
        }
        Sg YFl2 = Sg.YFl(z10, Sg, view, wwa, yFl);
        map.put(Sg, YFl2);
        return YFl2;
    }

    private static void YFl(Sg sg2) {
        if (sg2 == null) {
            return;
        }
        sg2.YFl();
    }

    public static void YFl(Wwa wwa, int i10) {
        if (wwa == null || wwa.zz() == null) {
            return;
        }
        YFl(YFl.get(Sg(wwa)), i10);
    }

    public static void YFl(Sg sg2, int i10) {
        if (sg2 == null) {
            return;
        }
        sg2.YFl(i10);
    }

    public static void YFl(Wwa wwa) {
        if (wwa == null || wwa.zz() == null) {
            return;
        }
        Integer Sg = Sg(wwa);
        Map<Integer, Sg> map = YFl;
        Sg sg2 = map.get(Sg);
        if (sg2 != null) {
            sg2.nc();
        }
        Sg(Sg);
        if (map.size() <= 0) {
            DSW.YFl();
        }
    }

    public static Sg YFl(Integer num) {
        return YFl.get(num);
    }
}
