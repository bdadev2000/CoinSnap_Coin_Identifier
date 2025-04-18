package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i extends b {
    public static final String a = "i";

    public static boolean a() {
        try {
            return System.currentTimeMillis() - com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS > ((Long) al.a(com.mbridge.msdk.foundation.controller.c.m().c(), "privateAuthorityTimesTamp", 0L)).longValue();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    private static void b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().d(str);
    }

    public static void c() {
        try {
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    String[] list;
                    try {
                        String a10 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_CRASH_INFO);
                        if (TextUtils.isEmpty(a10)) {
                            return;
                        }
                        File file = new File(a10);
                        if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                            for (String str : list) {
                                File file2 = new File(a10 + "/" + str);
                                if (file2.exists()) {
                                    String b3 = ab.b(file2);
                                    if (!TextUtils.isEmpty(b3)) {
                                        String[] split = b3.split("====");
                                        if (split.length > 0) {
                                            new h(com.mbridge.msdk.foundation.controller.c.m().c()).a(split[0], file2);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        ad.b(i.a, th2.getMessage());
                    }
                }
            });
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }

    public static void b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&network_type=");
            stringBuffer.append(z.l(context));
            stringBuffer.append("&unit_id=");
            stringBuffer.append(str);
            stringBuffer.append("&cid=");
            stringBuffer.append(campaignEx.getId());
            stringBuffer.append("&reason=&result=2&");
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append(str2);
            }
            if (campaignEx.getAdType() == 287) {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append("&ad_type=3&");
            } else if (campaignEx.getAdType() == 94) {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append("&ad_type=1&");
            } else if (campaignEx.getAdType() == 296) {
                stringBuffer.append("ad_type=5&creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append("&");
            } else if (campaignEx.getAdType() == 297) {
                stringBuffer.append("ad_type=6&creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append("&");
            } else if (campaignEx.getAdType() == 298) {
                stringBuffer.append("ad_type=7&creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append("&");
            } else {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append("&ad_type=1&");
            }
            stringBuffer.append("devid=");
            stringBuffer.append(com.mbridge.msdk.foundation.tools.e.c());
            stringBuffer.append("&");
            if (campaignEx.isBidCampaign()) {
                stringBuffer.append("hb=1&");
            }
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&rid_n=");
            stringBuffer.append(campaignEx.getRequestIdNotice());
            stringBuffer.append("&adspace_t=");
            stringBuffer.append(campaignEx.getAdSpaceT());
            a(context, stringBuffer.toString(), str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static String a(Campaign campaign, int i10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put("label", i10);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put(CampaignEx.JSON_KEY_TITLE, campaign.getAppName());
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
            } else {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
            }
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
        }
        return jSONObject.toString();
    }

    public static com.mbridge.msdk.foundation.same.net.f.e a(Context context) {
        String str = "1";
        com.mbridge.msdk.foundation.same.net.f.e eVar = new com.mbridge.msdk.foundation.same.net.f.e();
        try {
            eVar.a("platform", "1");
            eVar.a(CampaignEx.JSON_KEY_PACKAGE_NAME, URLEncoder.encode(z.e(context)));
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("os_version", Build.VERSION.RELEASE);
                eVar.a("brand", URLEncoder.encode(z.x()));
                eVar.a("model", URLEncoder.encode(z.h()));
                if (com.mbridge.msdk.e.b.a()) {
                    eVar.a("gaid", "");
                } else {
                    eVar.a("gaid", com.mbridge.msdk.foundation.tools.e.c());
                }
                eVar.a("mnc", z.k(context));
                eVar.a("mcc", z.j(context));
                int l10 = z.l(context);
                eVar.a("network_type", l10 + "");
                eVar.a("network_str", z.a(context, l10));
                eVar.a("language", URLEncoder.encode(z.s(context)));
                eVar.a("timezone", URLEncoder.encode(z.y()));
                eVar.a("ua", URLEncoder.encode(z.g()));
                eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
                if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
                    str = "0";
                }
                eVar.a("adid_limit_dev", str);
            }
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("app_version_name", URLEncoder.encode(z.p(context)));
            eVar.a("orientation", URLEncoder.encode(z.r(context) + ""));
            eVar.a("screen_size", z.i(context) + "x" + z.g(context));
            if (com.mbridge.msdk.e.b.a()) {
                com.mbridge.msdk.foundation.same.net.f.f.b(eVar);
            }
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null) {
                com.mbridge.msdk.c.h.a();
                b3 = com.mbridge.msdk.c.i.a();
            }
            if (b3 != null) {
                JSONObject a10 = j.a(context, b3);
                if (!TextUtils.isEmpty(a10.toString())) {
                    String b10 = x.b(a10.toString());
                    if (!TextUtils.isEmpty(b10)) {
                        eVar.a("dvi", b10);
                    }
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return eVar;
    }

    public static void b() {
        try {
            al.b(com.mbridge.msdk.foundation.controller.c.m().c(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder("key=2000090&reason=");
            sb2.append(TextUtils.isEmpty(str) ? "" : str);
            sb2.append("&result=");
            sb2.append(!TextUtils.isEmpty(str));
            com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
        }
    }

    public static JSONObject a(Context context, com.mbridge.msdk.c.g gVar) throws Exception {
        return j.a(context, gVar);
    }

    public static String a(String str, Map<String, Object> map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("key=" + str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                sb2.append("&" + entry.getKey() + "=" + entry.getValue());
            }
        }
        sb2.append("\n");
        return sb2.toString();
    }

    private static void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().d(str);
    }

    public static void a(Context context, String str, String str2, int i10, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("key=2000076&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str2 + "&");
                stringBuffer.append("reason=" + str3 + "&");
                stringBuffer.append("result=" + i10 + "&");
                StringBuilder sb2 = new StringBuilder("url=");
                sb2.append(URLEncoder.encode(str, "utf-8"));
                stringBuffer.append(sb2.toString());
                a(context, stringBuffer.toString(), str2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, String str3, int i11) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("key=2000073&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("reason=" + str3 + "&");
            stringBuffer.append("result=" + i10 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            if (i11 != -1) {
                stringBuffer.append("d_t=" + i11 + "&");
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, "utf-8"));
            a(context, stringBuffer.toString(), str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, int i11, int i12) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("key=2000075&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("type=" + i10 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            stringBuffer.append("statue=" + i11 + "&");
            if (i12 != -1) {
                stringBuffer.append("d_t=" + i12 + "&");
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, "utf-8"));
            a(context, stringBuffer.toString(), str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, int i11) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("key=2000074&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("type=" + i10 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            if (i11 != -1) {
                stringBuffer.append("d_t=" + i11 + "&");
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, "utf-8"));
            a(context, stringBuffer.toString(), str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, boolean z10, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("key=2000047&");
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.a.f13020b.get(str2);
                    StringBuilder sb2 = new StringBuilder("u_stid=");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb2.append(str3);
                    sb2.append("&");
                    stringBuffer.append(sb2.toString());
                }
                if (campaignEx != null) {
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("adtp=" + campaignEx.getAdType() + "&");
                    stringBuffer.append("rid=" + campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                }
                stringBuffer.append("st=" + System.currentTimeMillis() + "&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str2 + "&");
                stringBuffer.append("hb=");
                stringBuffer.append(z10 ? 1 : 0);
                stringBuffer.append("&");
                stringBuffer.append("reason=" + str);
                b(context, stringBuffer.toString());
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, boolean z10) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.size() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000048&");
            stringBuffer.append("st=" + System.currentTimeMillis() + "&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            CampaignEx campaignEx = list.get(0);
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            if (z10) {
                stringBuffer.append("hb=");
                stringBuffer.append(1);
                stringBuffer.append("&");
            }
            String requestId = campaignEx.getRequestId();
            if (!TextUtils.isEmpty(requestId)) {
                stringBuffer.append("rid=");
                stringBuffer.append(requestId);
                stringBuffer.append("&");
            }
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (!TextUtils.isEmpty(requestIdNotice)) {
                stringBuffer.append("rid_n=");
                stringBuffer.append(requestIdNotice);
                stringBuffer.append("&");
            }
            StringBuilder sb2 = new StringBuilder("rtins_type=");
            for (int i10 = 0; i10 < list.size(); i10++) {
                CampaignEx campaignEx2 = list.get(i10);
                if (i10 < list.size() - 1) {
                    sb2.append(campaignEx2.getRtinsType());
                    sb2.append(",");
                } else {
                    sb2.append(campaignEx2.getRtinsType());
                }
            }
            stringBuffer.append((CharSequence) sb2);
            a(context, stringBuffer.toString(), str);
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }

    public static void a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().d(str);
    }

    public static void a(Context context, String str, String str2, boolean z10, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("key=2000104&");
                if (!TextUtils.isEmpty(str2)) {
                    String str7 = com.mbridge.msdk.foundation.controller.a.f13020b.get(str2);
                    StringBuilder sb2 = new StringBuilder("u_stid=");
                    if (str7 == null) {
                        str7 = "";
                    }
                    sb2.append(str7);
                    sb2.append("&");
                    stringBuffer.append(sb2.toString());
                }
                stringBuffer.append("network_type=" + z.l(context) + "&");
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid=" + str3 + "&");
                }
                if (!TextUtils.isEmpty(str4)) {
                    stringBuffer.append("rid_n=" + str4 + "&");
                }
                if (!TextUtils.isEmpty(str5)) {
                    stringBuffer.append("cid=" + str5 + "&");
                }
                if (!TextUtils.isEmpty(str6)) {
                    stringBuffer.append("template_id=" + str6 + "&");
                }
                stringBuffer.append("unit_id=" + str2 + "&");
                stringBuffer.append("hb=");
                stringBuffer.append(z10 ? 1 : 0);
                stringBuffer.append("&");
                stringBuffer.append("reason=" + str);
                b(context, stringBuffer.toString());
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + z.l(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                        if (campaignEx.getAdType() == 287) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=3&");
                        } else if (campaignEx.getAdType() == 94) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        } else if (campaignEx.getAdType() == 296) {
                            stringBuffer.append("ad_type=5&");
                            stringBuffer.append("creative=" + campaignEx.getCreativeId() + "&");
                        } else if (campaignEx.getAdType() == 297) {
                            stringBuffer.append("ad_type=6&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else if (campaignEx.getAdType() == 298) {
                            stringBuffer.append("ad_type=7&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    a(context, stringBuffer.toString(), str);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10, int i11, String str2, int i12, int i13, int i14, String str3) {
        com.mbridge.msdk.foundation.same.report.d.b bVar;
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("key", URLEncoder.encode("2000094", "utf-8"));
            if (campaignEx != null) {
                dVar.a("rid", URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
                dVar.a("rid_n", URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
                dVar.a(BidResponsedEx.KEY_CID, URLEncoder.encode(campaignEx.getId(), "utf-8"));
                bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            } else {
                bVar = null;
            }
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str, "utf-8"));
            if (i10 == 0) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "0";
                }
                dVar.a("video_prg", str3 + "");
            } else {
                dVar.a("video_prg", i10 + "");
            }
            dVar.a("phase", i11 + "");
            dVar.a("feedback_content", URLEncoder.encode(str2, "utf-8"));
            dVar.a("feedback_close", i12 + "");
            dVar.a("type", i14 + "");
            dVar.a("ad_type", i13 + "");
            dVar.a("network_type", URLEncoder.encode(String.valueOf(z.l(com.mbridge.msdk.foundation.controller.c.m().c())), "utf-8"));
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.d(str);
            bVar.b(i13);
            bVar.a("2000094", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000094", bVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                return;
            }
            String str2 = "key=2000088&state=" + str;
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null || b.a(b3, str2)) {
                com.mbridge.msdk.foundation.same.report.d.c.a().d(str2);
            }
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, int i10, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer("key=2000114&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            StringBuilder sb2 = new StringBuilder("gh_id=");
            String str3 = "";
            sb2.append(TextUtils.isEmpty(campaignEx.getGhId()) ? "" : URLEncoder.encode(campaignEx.getGhId(), "utf-8"));
            sb2.append("&");
            stringBuffer.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder("gh_path=");
            sb3.append(TextUtils.isEmpty(campaignEx.getGhPath()) ? "" : URLEncoder.encode(campaignEx.getGhPath(), "utf-8"));
            sb3.append("&");
            stringBuffer.append(sb3.toString());
            stringBuffer.append("unit_id=" + str2 + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            stringBuffer.append("result=" + i10 + "&");
            StringBuilder sb4 = new StringBuilder("reason=");
            if (!TextUtils.isEmpty(str)) {
                str3 = URLEncoder.encode(str, "utf-8");
            }
            sb4.append(str3);
            sb4.append("&");
            stringBuffer.append(sb4.toString());
            stringBuffer.append("cid=" + campaignEx.getId());
            a(context, stringBuffer.toString(), str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(int i10, String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.d.c.a().d("key=2000080&reason=" + str2 + "&ad_type=" + i10 + "&url=" + URLEncoder.encode(str, "utf-8"));
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10, int i11, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.d.c.a().d("key=" + URLEncoder.encode("2000121", "utf-8") + "&rid=" + URLEncoder.encode(campaignEx.getRequestId(), "utf-8") + "&rid_n=" + URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8") + "&cid=" + URLEncoder.encode(campaignEx.getId(), "utf-8") + "&unit_id=" + URLEncoder.encode(str, "utf-8") + "&type=" + i10 + "&result=" + i11 + "&reason=" + URLEncoder.encode(str2, "utf-8"));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, int i10, int i11, String str2, int i12, String str3) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("key", URLEncoder.encode("m_water_mark_result", "utf-8"));
            dVar.a("water_mark_result", i11 + "");
            dVar.a("water_mark_error_msg", URLEncoder.encode(str2, "utf-8"));
            dVar.a("render_result", i12 + "");
            dVar.a("water_mark_str", URLEncoder.encode(str3, "utf-8"));
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.b(i10);
            bVar.d(str);
            bVar.a("m_water_mark_result", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_water_mark_result", bVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
