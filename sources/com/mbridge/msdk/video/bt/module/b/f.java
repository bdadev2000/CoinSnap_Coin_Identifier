package com.mbridge.msdk.video.bt.module.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.z;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class f {
    private static final String a = "com.mbridge.msdk.video.bt.module.b.f";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                o a10 = o.a(com.mbridge.msdk.foundation.db.g.a(context));
                if (TextUtils.isEmpty(str) || a10 == null || a10.a() <= 0) {
                    return;
                }
                List<n> a11 = a10.a("m_download_end");
                List<n> a12 = a10.a("2000021");
                List<n> a13 = a10.a("2000039");
                List<n> a14 = a10.a("m_download_end");
                List<n> a15 = a10.a("m_download_end");
                List<n> a16 = a10.a("2000044");
                String e2 = n.e(a12);
                String a17 = n.a(a11);
                String c10 = n.c(a13);
                String b3 = n.b(a14);
                String f10 = n.f(a15);
                String d10 = n.d(a16);
                StringBuilder sb2 = new StringBuilder();
                if (!TextUtils.isEmpty(e2)) {
                    sb2.append(e2);
                }
                if (!TextUtils.isEmpty(a17)) {
                    sb2.append(a17);
                }
                if (!TextUtils.isEmpty(c10)) {
                    sb2.append(c10);
                }
                if (!TextUtils.isEmpty(b3)) {
                    sb2.append(b3);
                }
                if (!TextUtils.isEmpty(f10)) {
                    sb2.append(f10);
                }
                if (!TextUtils.isEmpty(d10)) {
                    sb2.append(d10);
                }
                if (TextUtils.isEmpty(sb2.toString())) {
                    return;
                }
                String sb3 = sb2.toString();
                if (TextUtils.isEmpty(sb3) || TextUtils.isEmpty(str)) {
                    return;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb3);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private static void a(Context context, String str, String str2) {
        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            context = com.mbridge.msdk.foundation.controller.c.m().c();
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().d(str);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, int i10) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("reason=&");
            stringBuffer.append("templateshowtype=" + i10 + " offer show success&");
            stringBuffer.append("result=2&");
            if (campaignEx.getAdType() == 287) {
                stringBuffer.append("ad_type=3&");
            } else if (campaignEx.getAdType() == 94) {
                stringBuffer.append("ad_type=1&");
            } else {
                stringBuffer.append("ad_type=1&");
            }
            String str2 = campaignEx.getendcard_url();
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append("creative=" + URLEncoder.encode(str2) + "&");
            }
            stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
            stringBuffer.append("&adspace_t=");
            stringBuffer.append(campaignEx.getAdSpaceT());
            a(context, stringBuffer.toString(), str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                stringBuffer.append("cid=" + campaignEx.getId() + "&");
                stringBuffer.append("reason=" + str2 + "&");
                stringBuffer.append("templateshowtype=" + i10 + "&");
                stringBuffer.append("reason=" + str2 + "&");
                stringBuffer.append("result=1&");
                if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                    stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                }
                stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                if (campaignEx.getAdType() == 287) {
                    stringBuffer.append("ad_type=3&");
                } else if (campaignEx.getAdType() == 94) {
                    stringBuffer.append("ad_type=1&");
                } else {
                    stringBuffer.append("ad_type=1&");
                }
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append("&");
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append("&");
                stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.size() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(list.get(i10).getId());
            }
            stringBuffer.append("cid=" + arrayList.toString() + "&");
            stringBuffer.append("result=2&");
            if (list.get(0) != null) {
                CampaignEx campaignEx = list.get(0);
                stringBuffer.append("reason=&");
                stringBuffer.append("templateshowtype=two offer ec show success&");
                stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append("&");
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append("&");
                stringBuffer.append("&adspace_t=");
                stringBuffer.append(campaignEx.getAdSpaceT());
            }
            a(context, stringBuffer.toString(), str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, String str2) {
        if (context == null || list == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                String[] strArr = new String[list.size()];
                for (int i10 = 0; i10 < list.size(); i10++) {
                    strArr[i10] = list.get(i10).getId();
                }
                stringBuffer.append("cid=" + strArr + "&");
                stringBuffer.append("reason=" + str2 + "&");
                stringBuffer.append("result=1&");
                stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                if (list.get(0) != null) {
                    CampaignEx campaignEx = list.get(0);
                    stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    stringBuffer.append("&");
                    stringBuffer.append("templateshowtype=" + campaignEx.getMof_tplid());
                    stringBuffer.append("&");
                    stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                }
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10) {
        try {
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c10 == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("key=2000115&");
            stringBuffer.append("network_type=" + z.l(c10) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("play_cur_time=" + i10 + "&");
            stringBuffer.append("reason=close ad in advance " + campaignEx.getMof_tplid() + "&");
            stringBuffer.append("result=1&");
            stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
            stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
            stringBuffer.append("&");
            stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
            a(c10, stringBuffer.toString(), str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
