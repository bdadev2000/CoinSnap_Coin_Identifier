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
import vd.e;

/* loaded from: classes4.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static h showRewardListener;

    public static String addQueryParameter(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                String encode = URLEncoder.encode(str2, "UTF-8");
                String encode2 = URLEncoder.encode(str3, "UTF-8");
                StringBuilder sb2 = new StringBuilder(str);
                if (str.contains("?")) {
                    if (!str.endsWith("&") && !str.endsWith("?")) {
                        sb2.append("&");
                    }
                } else {
                    sb2.append("?");
                }
                sb2.append(encode);
                sb2.append("=");
                sb2.append(encode2);
                return sb2.toString();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("MBridgeGlobalCommon", "addQueryParameter", e2);
                }
            }
        }
        return "";
    }

    public static void handlerCampaigns(String str, b bVar, List<CampaignEx> list, List<a> list2) {
        boolean z10;
        if (bVar != null && list != null && list2 != null) {
            for (CampaignEx campaignEx : list) {
                try {
                    campaignEx.setRequestId(bVar.d());
                    try {
                        campaignEx.setLocalRequestId(str);
                        a aVar = new a(bVar);
                        aVar.c(campaignEx.getRequestIdNotice());
                        aVar.b(campaignEx.getAppName());
                        aVar.a(campaignEx.getId());
                        aVar.a(campaignEx);
                        list2.add(aVar);
                        boolean z11 = true;
                        if (!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) && campaignEx.getAdSpaceT() != 2) {
                            String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                            boolean i10 = ai.i(cMPTEntryUrl);
                            if (!i10) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bVar.b(z10);
                            if (!i10) {
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
                            String e2 = rewardTemplateMode.e();
                            if (!TextUtils.isEmpty(e2) && campaignEx.getAdSpaceT() != 2) {
                                boolean i11 = ai.i(e2);
                                if (i11) {
                                    z11 = false;
                                }
                                aVar.a(z11);
                                if (!i11) {
                                    e2 = addQueryParameter(e2, "dyview", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE);
                                }
                                rewardTemplateMode.b(e2);
                                campaignEx.setRewardTemplateMode(rewardTemplateMode);
                            }
                        }
                        String str2 = campaignEx.getendcard_url();
                        if (!TextUtils.isEmpty(str2)) {
                            boolean l10 = ai.l(str2);
                            boolean i12 = ai.i(str2);
                            if (!l10 && !i12) {
                                campaignEx.setendcard_url(addQueryParameter(str2, "isplayableec", "0"));
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        if (MBridgeConstans.DEBUG) {
                            ad.b("MBridgeGlobalCommon", "handlerCampaigns", e);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            bVar.b(list);
            bVar.a(list2);
        }
    }

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context c10 = c.m().c();
        if (!TextUtils.isEmpty(str2)) {
            al.b(c10, e.e("MBridge_ConfirmTitle", str), str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            al.b(c10, e.e("MBridge_ConfirmContent", str), str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            al.b(c10, e.e("MBridge_CancelText", str), str5.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(c10, e.e("MBridge_ConfirmText", str), str4.trim());
        }
    }
}
