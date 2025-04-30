package com.bytedance.sdk.openadsdk.lMd;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class lMd {
    public static final Set<String> zp = new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log"));

    /* renamed from: com.bytedance.sdk.openadsdk.lMd.lMd$lMd, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0123lMd {
        public static int KS = 100;
        public static int lMd = 2;
        public static int zp = 1;
    }

    /* loaded from: classes.dex */
    public static class zp {
        public static String KS = "direct";
        public static String lMd = "openAdLandPageLinks";
        public static String zp = "openDetailPage";
    }

    public static boolean zp(String str) {
        if (!"embeded_ad".equals(str) && !"banner_ad".equals(str) && !"interaction".equals(str) && !"slide_banner_ad".equals(str)) {
            return false;
        }
        return true;
    }
}
