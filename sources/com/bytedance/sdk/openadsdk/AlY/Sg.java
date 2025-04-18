package com.bytedance.sdk.openadsdk.AlY;

import com.bytedance.sdk.openadsdk.AlY.tN.YFl;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class Sg {
    public static final String YFl = YFl.InterfaceC0100YFl.YFl;
    public static final String Sg = YFl.InterfaceC0100YFl.Sg;
    public static final String tN = YFl.InterfaceC0100YFl.tN;
    public static final String AlY = YFl.InterfaceC0100YFl.AlY;
    public static final String wN = YFl.InterfaceC0100YFl.wN;

    /* renamed from: vc, reason: collision with root package name */
    public static final String f10490vc = YFl.InterfaceC0100YFl.f10509vc;
    public static final Set<String> DSW = new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log"));

    /* renamed from: com.bytedance.sdk.openadsdk.AlY.Sg$Sg, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0098Sg {
        public static int Sg = 2;
        public static int YFl = 1;
        public static int tN = 100;
    }

    /* loaded from: classes.dex */
    public static class YFl {
        public static String AlY = "saLandingPageLinks";
        public static String Sg = "openAdLandPageLinks";
        public static String YFl = "openDetailPage";
        public static String tN = "direct";
    }

    public static boolean YFl(String str) {
        if (!"embeded_ad".equals(str) && !"banner_ad".equals(str) && !"interaction".equals(str) && !"slide_banner_ad".equals(str)) {
            return false;
        }
        return true;
    }
}
