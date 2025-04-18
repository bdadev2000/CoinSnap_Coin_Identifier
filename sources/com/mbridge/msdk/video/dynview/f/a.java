package com.mbridge.msdk.video.dynview.f;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.click.i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class a {
    private static final String a = "com.mbridge.msdk.video.dynview.f.a";

    public static void a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("key=2000091&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str2 + "&");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                    stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.U + "&");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) {
                    stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.f13276g + "&");
                }
                stringBuffer.append("hb=0&");
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid_n=");
                    stringBuffer.append(str3);
                    stringBuffer.append("&");
                }
                stringBuffer.append("reason=" + str);
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    stringBuffer.append("&dyview=");
                    stringBuffer.append(ai.b(campaignEx.getRewardTemplateMode().e()));
                }
                String stringBuffer2 = stringBuffer.toString();
                if (TextUtils.isEmpty(stringBuffer2)) {
                    return;
                }
                c.a().d(stringBuffer2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.mbridge.msdk.foundation.entity.CampaignUnit r9, int r10, int r11, java.lang.String r12) {
        /*
            if (r9 == 0) goto Lb0
            java.util.ArrayList r0 = r9.getAds()
            if (r0 == 0) goto Lb0
            java.util.ArrayList r0 = r9.getAds()
            int r0 = r0.size()
            if (r0 <= 0) goto Lb0
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto Lb0
            if (r11 != 0) goto L2d
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            boolean r0 = r0.mMoreOfferImpShow
            if (r0 == 0) goto L2d
            return
        L2d:
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r0 = r0.getendcard_url()
            java.lang.String r1 = "mof_testuid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.ao.a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L5b
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r0 = r0.getendcard_url()
            java.lang.String r1 = "mof_uid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.ao.a(r0, r1)
        L5b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L63
            r4 = r12
            goto L64
        L63:
            r4 = r0
        L64:
            if (r11 == 0) goto L80
            r12 = 1
            if (r11 == r12) goto L6f
            java.lang.String r11 = ""
            r12 = 0
            r5 = r11
            r8 = r12
            goto L92
        L6f:
            int r11 = com.mbridge.msdk.click.a.a.f12481h
            java.util.ArrayList r12 = r9.getAds()
            java.lang.Object r12 = r12.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = (com.mbridge.msdk.foundation.entity.CampaignEx) r12
            java.lang.String r12 = r12.getOnlyImpressionURL()
            goto L90
        L80:
            int r11 = com.mbridge.msdk.click.a.a.f12480g
            java.util.ArrayList r12 = r9.getAds()
            java.lang.Object r12 = r12.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = (com.mbridge.msdk.foundation.entity.CampaignEx) r12
            java.lang.String r12 = r12.getImpressionURL()
        L90:
            r8 = r11
            r5 = r12
        L92:
            r6 = 0
            r7 = 1
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto Lb0
            com.mbridge.msdk.foundation.controller.c r11 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r2 = r11.c()
            java.util.ArrayList r9 = r9.getAds()
            java.lang.Object r9 = r9.get(r10)
            r3 = r9
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            com.mbridge.msdk.click.a.a(r2, r3, r4, r5, r6, r7, r8)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.f.a.a(com.mbridge.msdk.foundation.entity.CampaignUnit, int, int, java.lang.String):void");
    }

    public static void a(Context context, CampaignEx campaignEx, String str, View view) {
        if (context == null || campaignEx == null) {
            return;
        }
        if (campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().l() != null) {
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
        }
        com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(context, str);
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) view;
            aVar.a(new i() { // from class: com.mbridge.msdk.video.dynview.f.a.1
                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onFinishRedirection(Campaign campaign, String str2) {
                    if (campaign == null) {
                        return;
                    }
                    ah.a(campaign, viewGroup);
                }

                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onRedirectionFailed(Campaign campaign, String str2) {
                    if (campaign == null) {
                        return;
                    }
                    ah.a(campaign, viewGroup);
                }

                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onStartRedirection(Campaign campaign, String str2) {
                    if (campaign == null) {
                        return;
                    }
                    ah.b(campaign, viewGroup);
                }
            });
        }
        aVar.a(campaignEx);
    }
}
