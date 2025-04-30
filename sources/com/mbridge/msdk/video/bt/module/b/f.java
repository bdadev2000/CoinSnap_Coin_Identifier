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

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18561a = "com.mbridge.msdk.video.bt.module.b.f";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                o a6 = o.a(com.mbridge.msdk.foundation.db.g.a(context));
                if (TextUtils.isEmpty(str) || a6 == null || a6.a() <= 0) {
                    return;
                }
                List<n> a9 = a6.a("m_download_end");
                List<n> a10 = a6.a("2000021");
                List<n> a11 = a6.a("2000039");
                List<n> a12 = a6.a("m_download_end");
                List<n> a13 = a6.a("m_download_end");
                List<n> a14 = a6.a("2000044");
                String e4 = n.e(a10);
                String a15 = n.a(a9);
                String c9 = n.c(a11);
                String b = n.b(a12);
                String f9 = n.f(a13);
                String d2 = n.d(a14);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(e4)) {
                    sb.append(e4);
                }
                if (!TextUtils.isEmpty(a15)) {
                    sb.append(a15);
                }
                if (!TextUtils.isEmpty(c9)) {
                    sb.append(c9);
                }
                if (!TextUtils.isEmpty(b)) {
                    sb.append(b);
                }
                if (!TextUtils.isEmpty(f9)) {
                    sb.append(f9);
                }
                if (!TextUtils.isEmpty(d2)) {
                    sb.append(d2);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    return;
                }
                String sb2 = sb.toString();
                if (TextUtils.isEmpty(sb2) || TextUtils.isEmpty(str)) {
                    return;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2);
            } catch (Exception e9) {
                e9.printStackTrace();
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

    public static void a(Context context, CampaignEx campaignEx, String str, int i9) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("key=2000054&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("reason=&");
            stringBuffer.append("templateshowtype=" + i9 + " offer show success&");
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
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i9) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                stringBuffer.append("cid=" + campaignEx.getId() + "&");
                stringBuffer.append("reason=" + str2 + "&");
                stringBuffer.append("templateshowtype=" + i9 + "&");
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
        } catch (Throwable th) {
            th.printStackTrace();
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
            for (int i9 = 0; i9 < list.size(); i9++) {
                arrayList.add(list.get(i9).getId());
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
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, String str2) {
        if (context == null || list == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                String[] strArr = new String[list.size()];
                for (int i9 = 0; i9 < list.size(); i9++) {
                    strArr[i9] = list.get(i9).getId();
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
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i9) {
        try {
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c9 == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("key=2000115&");
            stringBuffer.append("network_type=" + z.l(c9) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("play_cur_time=" + i9 + "&");
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
            a(c9, stringBuffer.toString(), str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
