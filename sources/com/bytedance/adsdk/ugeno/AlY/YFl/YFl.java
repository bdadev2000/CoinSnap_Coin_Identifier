package com.bytedance.adsdk.ugeno.AlY.YFl;

import com.bytedance.adsdk.ugeno.AlY.Sg;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class YFl {
    public static final HashSet<String> YFl = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo"));
    protected String AlY;
    protected String DSW;
    protected Sg.YFl Sg;
    protected com.bytedance.adsdk.ugeno.Sg.Sg tN;

    /* renamed from: vc, reason: collision with root package name */
    protected Map<String, String> f10234vc;
    protected String wN;

    /* renamed from: com.bytedance.adsdk.ugeno.AlY.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0060YFl {
        public static YFl YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Sg.YFl yFl) {
            if (yFl == null) {
                return null;
            }
            String Sg = yFl.Sg();
            if (YFl.YFl.contains(Sg)) {
                return new tN(sg2, str, yFl);
            }
            Sg.getClass();
            if (!Sg.equals("update")) {
                if (!Sg.equals("emit")) {
                    return null;
                }
                return new Sg(sg2, str, yFl);
            }
            return new AlY(sg2, str, yFl);
        }
    }

    public YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Sg.YFl yFl) {
        this.tN = sg2;
        this.Sg = yFl;
        this.DSW = str;
        Sg();
    }

    private void Sg() {
        Sg.YFl yFl = this.Sg;
        if (yFl == null) {
            return;
        }
        this.AlY = yFl.YFl();
        this.wN = this.Sg.Sg();
        this.f10234vc = this.Sg.tN();
    }

    public abstract void YFl();
}
