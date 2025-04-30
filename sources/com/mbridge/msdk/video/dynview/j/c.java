package com.mbridge.msdk.video.dynview.j;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.video.dynview.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {
    public final com.mbridge.msdk.video.dynview.c a(Context context, List<CampaignEx> list) {
        String str;
        int i9;
        int i10;
        int i11;
        if (list == null) {
            return null;
        }
        try {
            float f9 = ai.f(com.mbridge.msdk.foundation.controller.c.m().c());
            float e4 = ai.e(com.mbridge.msdk.foundation.controller.c.m().c());
            List<String> arrayList = new ArrayList<>();
            if (list.size() <= 0 || list.get(0) == null) {
                str = "";
                i9 = 1;
                i10 = 0;
                i11 = 0;
            } else {
                CampaignEx campaignEx = list.get(0);
                i9 = (campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? 1 : campaignEx.getRewardTemplateMode().b();
                i10 = list.get(0).getMof_tplid();
                str = list.get(0).getMof_template_url();
                i11 = list.get(0).getDynamicTempCode();
            }
            if (i10 != 0 && !TextUtils.isEmpty(str)) {
                arrayList = ab.a(n.a(0, i10 + "", str), "template_" + i10 + "_" + i9);
            }
            String str2 = "mbridge_same_choice_one_layout_portrait";
            if (i9 != 1) {
                if (i9 == 2) {
                    str2 = "mbridge_same_choice_one_layout_landscape";
                } else if (context.getResources().getConfiguration().orientation == 2) {
                    str2 = "mbridge_same_choice_one_layout_landscape";
                    i9 = 2;
                } else {
                    i9 = 1;
                }
            }
            return new c.a().a(context).a(str2).a(1).a(e4).b(f9).a(list).b(i9).b(arrayList).e(i11).d(i10).a();
        } catch (Exception e9) {
            ad.b("ViewOptionWrapper", e9.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.video.dynview.c b(View view, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.d.c a6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId(), false);
            int g9 = a6 != null ? a6.g() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            return new c.a().a("mbridge_reward_layer_floor_bottom").a(3).a(arrayList).a(view.getContext()).a(view).c(g9).b(z.r(view.getContext())).a();
        } catch (Exception e4) {
            ad.b("ViewOptionWrapper", e4.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.video.dynview.c b(Context context, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float f9 = ai.f(com.mbridge.msdk.foundation.controller.c.m().c());
                    float e4 = ai.e(com.mbridge.msdk.foundation.controller.c.m().c());
                    List<String> arrayList = new ArrayList<>();
                    int dynamicTempCode = list.get(0).getDynamicTempCode();
                    int mof_tplid = list.get(0).getMof_tplid();
                    String mof_template_url = list.get(0).getMof_template_url();
                    int r9 = z.r(context);
                    if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                        arrayList = ab.a(n.a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + "_" + r9);
                    }
                    return new c.a().a(r9 == 1 ? "mbridge_order_layout_list_portrait" : "mbridge_order_layout_list_landscape").a(5).a(context).a(e4).b(f9).a(list).b(r9).b(arrayList).e(dynamicTempCode).d(mof_tplid).a();
                }
            } catch (Exception e9) {
                ad.b("ViewOptionWrapper", e9.getMessage());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:6:0x0008, B:9:0x001a, B:10:0x0030, B:17:0x0042, B:18:0x0051, B:20:0x0057, B:21:0x007b, B:23:0x0097, B:24:0x009b), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:6:0x0008, B:9:0x001a, B:10:0x0030, B:17:0x0042, B:18:0x0051, B:20:0x0057, B:21:0x007b, B:23:0x0097, B:24:0x009b), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.video.dynview.c a(android.view.View r12, com.mbridge.msdk.foundation.entity.CampaignEx r13) {
        /*
            r11 = this;
            java.lang.String r0 = "template_"
            java.lang.String r1 = "mbridge_reward_layer_floor_"
            r2 = 0
            if (r13 != 0) goto L8
            return r2
        L8:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            r3.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r13.getCampaignUnitId()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r5 = r13.getRewardTemplateMode()     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = ""
            r7 = 0
            if (r5 == 0) goto L2e
            com.mbridge.msdk.foundation.entity.CampaignEx$c r5 = r13.getRewardTemplateMode()     // Catch: java.lang.Exception -> L2b
            int r5 = r5.f()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r13.getRewardTemplateMode()     // Catch: java.lang.Exception -> L2b
            java.lang.String r8 = r8.e()     // Catch: java.lang.Exception -> L2b
            goto L30
        L2b:
            r12 = move-exception
            goto Lf2
        L2e:
            r8 = r6
            r5 = r7
        L30:
            java.lang.String r9 = "ia_tp"
            r10 = -5
            int r9 = com.mbridge.msdk.foundation.tools.ai.a(r8, r9, r10)     // Catch: java.lang.Exception -> L2b
            if (r5 == 0) goto L4f
            r10 = 102(0x66, float:1.43E-43)
            if (r5 == r10) goto L4f
            r10 = 202(0xca, float:2.83E-43)
            if (r5 != r10) goto L42
            goto L4f
        L42:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r10.<init>(r1)     // Catch: java.lang.Exception -> L2b
            r10.append(r5)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Exception -> L2b
            goto L51
        L4f:
            java.lang.String r1 = "mbridge_reward_layer_floor"
        L51:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L2b
            if (r10 != 0) goto L7b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r3.<init>()     // Catch: java.lang.Exception -> L2b
            r3.append(r5)     // Catch: java.lang.Exception -> L2b
            r3.append(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L2b
            r6 = 1
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.n.a(r6, r3, r8)     // Catch: java.lang.Exception -> L2b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r6.<init>(r0)     // Catch: java.lang.Exception -> L2b
            r6.append(r5)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> L2b
            java.util.List r3 = com.mbridge.msdk.foundation.tools.ab.a(r3, r0)     // Catch: java.lang.Exception -> L2b
        L7b:
            boolean r0 = com.mbridge.msdk.video.dynview.i.a.a(r8)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "whs_chn"
            java.lang.String r6 = com.mbridge.msdk.video.dynview.i.a.a(r8, r6)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.videocommon.d.b r8 = com.mbridge.msdk.videocommon.d.b.a()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L2b
            java.lang.String r10 = r10.k()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.videocommon.d.c r4 = r8.a(r10, r4, r7)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L9b
            int r7 = r4.g()     // Catch: java.lang.Exception -> L2b
        L9b:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            r4.<init>()     // Catch: java.lang.Exception -> L2b
            r4.add(r13)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$a r8 = new com.mbridge.msdk.video.dynview.c$a     // Catch: java.lang.Exception -> L2b
            r8.<init>()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r1 = r8.a(r1)     // Catch: java.lang.Exception -> L2b
            r8 = 2
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r8)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r4)     // Catch: java.lang.Exception -> L2b
            android.content.Context r4 = r12.getContext()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r4)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r12)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r1 = r1.c(r7)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r1 = r1.f(r9)     // Catch: java.lang.Exception -> L2b
            android.content.Context r12 = r12.getContext()     // Catch: java.lang.Exception -> L2b
            int r12 = com.mbridge.msdk.foundation.tools.z.r(r12)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r12 = r1.b(r12)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r12 = r12.d(r5)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r12 = r12.a(r0)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r12 = r12.c(r6)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r12 = r12.b(r3)     // Catch: java.lang.Exception -> L2b
            int r13 = r13.getDynamicTempCode()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c$b r12 = r12.e(r13)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.video.dynview.c r12 = r12.a()     // Catch: java.lang.Exception -> L2b
            return r12
        Lf2:
            java.lang.String r13 = "ViewOptionWrapper"
            java.lang.String r12 = r12.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r13, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.j.c.a(android.view.View, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.video.dynview.c");
    }

    public final com.mbridge.msdk.video.dynview.c a(Context context, CampaignEx campaignEx, int i9, String str) {
        String str2;
        String str3;
        if (campaignEx == null) {
            return null;
        }
        try {
            long ecTemplateId = campaignEx.getEcTemplateId();
            int r9 = z.r(context);
            int a6 = ai.a(campaignEx.getendcard_url(), "n_logo", 1);
            if (ecTemplateId == 1302) {
                if (r9 != 1) {
                    str2 = "mbridge_reward_end_card_layout_landscape_" + ecTemplateId;
                } else {
                    str2 = "mbridge_reward_end_card_layout_portrait_" + ecTemplateId;
                }
                str3 = "template_" + str + r9 + "_" + ecTemplateId;
            } else {
                str2 = r9 == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape";
                str3 = "template_" + str + r9;
            }
            List<String> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                arrayList = ab.a(n.a(2, i9 + "", campaignEx.getendcard_url()), str3);
            }
            return new c.a().a(str2).a(4).a(context).b(z.r(context)).b(arrayList).e(campaignEx.getDynamicTempCode()).d(i9).b(str).g(a6).a();
        } catch (Exception e4) {
            ad.b("ViewOptionWrapper", e4.getMessage());
            return null;
        }
    }
}
