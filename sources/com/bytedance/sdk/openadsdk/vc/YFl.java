package com.bytedance.sdk.openadsdk.vc;

import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.tN;

/* loaded from: classes.dex */
public class YFl {
    private static volatile YFl YFl;
    private boolean AlY;
    private int[] DSW;
    private int EH;
    private boolean GA;
    private int[] NjR;
    private boolean Sg;
    private int[] YoT;
    private boolean eT;
    private boolean lG;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10841nc;
    private boolean pDU;
    private int[] qsH;
    private boolean rkt;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private int[] f10842vc;
    private int[] wN;

    private YFl() {
        Sg();
    }

    public boolean EH() {
        return this.eT;
    }

    public int[] GA() {
        return this.NjR;
    }

    public boolean Wwa() {
        return this.lG;
    }

    public int[] YoT() {
        return this.qsH;
    }

    public int[] eT() {
        return this.DSW;
    }

    public boolean lG() {
        return this.GA;
    }

    public int[] nc() {
        return this.f10842vc;
    }

    public boolean pDU() {
        return this.f10841nc;
    }

    public int[] rkt() {
        return this.YoT;
    }

    public boolean DSW() {
        return this.tN;
    }

    public int[] NjR() {
        return this.wN;
    }

    public boolean qsH() {
        return this.AlY;
    }

    public int AlY() {
        return this.EH;
    }

    public boolean vc() {
        return this.Sg;
    }

    public boolean wN() {
        return this.rkt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] tN(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int parseInt = Integer.parseInt(str);
                iArr[i10] = parseInt;
                if (parseInt > 0) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void Sg() {
        pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vc.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                YFl.this.pDU = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("feature_switch", false);
                if (!YFl.this.pDU) {
                    return;
                }
                try {
                    YFl.this.lG = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("exclude_banner_native", false);
                    YFl.this.EH = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("feature_timer_interval", 10000);
                    YFl.this.rkt = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("enable_feature_cids", true);
                    String[] split = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("pag_ad_show_cnt", "1,3,5&session").split("&");
                    String[] split2 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("pag_ad_click_cnt", "1,3,5&session").split("&");
                    String[] split3 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("pag_video_play_cnt", "1,3,5&session").split("&");
                    String[] split4 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("pag_dislike_cnt", "1,3,5session").split(",");
                    YFl yFl = YFl.this;
                    yFl.Sg = yFl.YFl(split);
                    YFl yFl2 = YFl.this;
                    yFl2.tN = yFl2.YFl(split2);
                    YFl yFl3 = YFl.this;
                    yFl3.AlY = yFl3.YFl(split3);
                    YFl yFl4 = YFl.this;
                    yFl4.wN = yFl4.Sg(split);
                    YFl yFl5 = YFl.this;
                    yFl5.f10842vc = yFl5.Sg(split2);
                    YFl yFl6 = YFl.this;
                    yFl6.DSW = yFl6.Sg(split3);
                    YFl yFl7 = YFl.this;
                    yFl7.YoT = yFl7.tN(split4);
                    String[] split5 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("pag_landingPage_stay_time", "1,3,5&session").split("&");
                    String[] split6 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("pag_video_stay_time", "1,3,5&session").split("&");
                    YFl yFl8 = YFl.this;
                    yFl8.f10841nc = yFl8.YFl(split5);
                    YFl yFl9 = YFl.this;
                    yFl9.eT = yFl9.YFl(split6);
                    YFl yFl10 = YFl.this;
                    yFl10.qsH = yFl10.Sg(split5);
                    YFl yFl11 = YFl.this;
                    yFl11.NjR = yFl11.Sg(split6);
                    YFl.this.GA = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("pag_video_30p_session", true);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] Sg(String[] strArr) {
        return strArr.length > 0 ? tN(strArr[0].split(",")) : new int[0];
    }

    public static YFl YFl() {
        if (YFl == null) {
            synchronized (tN.class) {
                if (YFl == null) {
                    YFl = new YFl();
                }
            }
        }
        return YFl;
    }

    public boolean tN() {
        return this.pDU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
