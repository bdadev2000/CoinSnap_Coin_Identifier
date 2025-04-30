package com.mbridge.msdk.newreward.function.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.newreward.function.d.a.a;
import com.mbridge.msdk.newreward.function.d.a.b;
import com.mbridge.msdk.video.bt.module.b.h;
import java.net.URLEncoder;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static h showRewardListener;

    public static String addQueryParameter(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                String encode = URLEncoder.encode(str2, "UTF-8");
                String encode2 = URLEncoder.encode(str3, "UTF-8");
                StringBuilder sb = new StringBuilder(str);
                if (str.contains("?")) {
                    if (!str.endsWith("&") && !str.endsWith("?")) {
                        sb.append("&");
                    }
                } else {
                    sb.append("?");
                }
                sb.append(encode);
                sb.append("=");
                sb.append(encode2);
                return sb.toString();
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("MBridgeGlobalCommon", "addQueryParameter", e4);
                }
            }
        }
        return "";
    }

    public static void handlerCampaigns(String str, b bVar, List<CampaignEx> list, List<a> list2) {
        if (bVar != null && list != null && list2 != null) {
            for (CampaignEx campaignEx : list) {
                try {
                    campaignEx.setRequestId(bVar.d());
                    campaignEx.setLocalRequestId(str);
                    a aVar = new a(bVar);
                    aVar.c(campaignEx.getRequestIdNotice());
                    aVar.b(campaignEx.getAppName());
                    aVar.a(campaignEx.getId());
                    aVar.a(campaignEx);
                    list2.add(aVar);
                    if (!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) && campaignEx.getAdSpaceT() != 2) {
                        String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                        boolean i9 = ai.i(cMPTEntryUrl);
                        bVar.b(!i9);
                        if (!i9) {
                            cMPTEntryUrl = addQueryParameter(cMPTEntryUrl, "dyview", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE);
                        }
                        campaignEx.setCMPTEntryUrl(cMPTEntryUrl);
                    }
                    if (TextUtils.isEmpty(bVar.z())) {
                        bVar.h(campaignEx.getCMPTEntryUrl());
                        bVar.f(campaignEx.getMof_tplid());
                    }
                    long candidateCacheTime = campaignEx.getCandidateCacheTime();
                    if (candidateCacheTime > 0) {
                        bVar.b((candidateCacheTime * 1000) + System.currentTimeMillis());
                    }
                    bVar.h(campaignEx.getVcn());
                    bVar.i(campaignEx.getTokenRule());
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        bVar.g(rewardTemplateMode.b());
                        String e4 = rewardTemplateMode.e();
                        if (!TextUtils.isEmpty(e4) && campaignEx.getAdSpaceT() != 2) {
                            boolean i10 = ai.i(e4);
                            aVar.a(!i10);
                            if (!i10) {
                                e4 = addQueryParameter(e4, "dyview", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE);
                            }
                            rewardTemplateMode.b(e4);
                            campaignEx.setRewardTemplateMode(rewardTemplateMode);
                        }
                    }
                    String str2 = campaignEx.getendcard_url();
                    if (!TextUtils.isEmpty(str2)) {
                        boolean l = ai.l(str2);
                        boolean i11 = ai.i(str2);
                        if (!l && !i11) {
                            campaignEx.setendcard_url(addQueryParameter(str2, "isplayableec", "0"));
                        }
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("MBridgeGlobalCommon", "handlerCampaigns", e9);
                    }
                }
            }
            bVar.b(list);
            bVar.a(list2);
        }
    }

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context c9 = c.m().c();
        if (!TextUtils.isEmpty(str2)) {
            al.b(c9, AbstractC2914a.d("MBridge_ConfirmTitle", str), str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            al.b(c9, AbstractC2914a.d("MBridge_ConfirmContent", str), str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            al.b(c9, AbstractC2914a.d("MBridge_CancelText", str), str5.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(c9, AbstractC2914a.d("MBridge_ConfirmText", str), str4.trim());
        }
    }
}
