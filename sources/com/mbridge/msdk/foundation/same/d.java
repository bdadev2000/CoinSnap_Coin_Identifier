package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.facebook.internal.i;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {
    private static final List<String> a = new LinkedList();

    public static int a(CampaignEx campaignEx, String str) {
        int b3;
        if (campaignEx == null) {
            return -1;
        }
        try {
            if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                b3 = ai.b(campaignEx.getMof_template_url());
            } else {
                b3 = ai.b(str);
            }
            return b3;
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
            return -1;
        }
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str2, com.mbridge.msdk.foundation.same.net.e.d.f().f13393c) || TextUtils.equals(str2, com.mbridge.msdk.foundation.same.net.e.d.f().F)) {
            return false;
        }
        return (TextUtils.equals(str, "download_video") || TextUtils.equals(str, "download_image") || TextUtils.equals(str, "download_template") || TextUtils.equals(str, "") || TextUtils.equals(str, "download_other") || TextUtils.equals(str, "download_html") || TextUtils.equals(str, "applets_model") || TextUtils.equals(str, "campaign") || TextUtils.equals(str, "bid_request") || TextUtils.equals(str, "more_offer") || TextUtils.equals(str, "mraid_js") || TextUtils.equals(str, "om_sdk") || TextUtils.equals(str, "roas") || TextUtils.equals(str, "web_env_check_js") || TextUtils.equals(str, "setting")) && af.a().a("request_track", true);
    }

    public static String a(DownloadRequest<?> downloadRequest) {
        if (downloadRequest == null) {
            return "un_known";
        }
        String str = downloadRequest.get("download_scene", "");
        return TextUtils.isEmpty(str) ? "un_known" : str;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] split = str.split(";");
            if (split.length > 0) {
                return split[0].trim();
            }
            return str.trim();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(String str, File file) {
        List<String> list;
        if (file == null || !file.exists()) {
            return;
        }
        try {
            try {
                list = a;
            } catch (Throwable th2) {
                try {
                    ad.b("SameTools", th2.getMessage());
                    a.add(str);
                    System.gc();
                } catch (Throwable th3) {
                    try {
                        a.add(str);
                        System.gc();
                        Runtime.getRuntime().gc();
                    } catch (Throwable unused) {
                    }
                    throw th3;
                }
            }
            if (list.contains(str)) {
                try {
                    list.add(str);
                    System.gc();
                    Runtime.getRuntime().gc();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            ab.a(com.mbridge.msdk.a.b.c(i.z(MBridgeConstans.OMID_JS_SERVICE_CONTENT, ab.b(file))).getBytes(), file);
            list.add(str);
            System.gc();
            Runtime.getRuntime().gc();
        } catch (Throwable unused3) {
        }
    }
}
