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

/* loaded from: classes4.dex */
public final class c {
    public final com.mbridge.msdk.video.dynview.c a(Context context, List<CampaignEx> list) {
        String str;
        int i10;
        int i11;
        int i12;
        if (list == null) {
            return null;
        }
        try {
            float f10 = ai.f(com.mbridge.msdk.foundation.controller.c.m().c());
            float e2 = ai.e(com.mbridge.msdk.foundation.controller.c.m().c());
            List<String> arrayList = new ArrayList<>();
            if (list.size() <= 0 || list.get(0) == null) {
                str = "";
                i10 = 1;
                i11 = 0;
                i12 = 0;
            } else {
                CampaignEx campaignEx = list.get(0);
                i10 = (campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? 1 : campaignEx.getRewardTemplateMode().b();
                i11 = list.get(0).getMof_tplid();
                str = list.get(0).getMof_template_url();
                i12 = list.get(0).getDynamicTempCode();
            }
            if (i11 != 0 && !TextUtils.isEmpty(str)) {
                arrayList = ab.a(n.a(0, i11 + "", str), "template_" + i11 + "_" + i10);
            }
            String str2 = "mbridge_same_choice_one_layout_portrait";
            if (i10 != 1) {
                if (i10 != 2) {
                    if (context.getResources().getConfiguration().orientation == 2) {
                        str2 = "mbridge_same_choice_one_layout_landscape";
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                } else {
                    str2 = "mbridge_same_choice_one_layout_landscape";
                }
            }
            return new c.a().a(context).a(str2).a(1).a(e2).b(f10).a(list).b(i10).b(arrayList).e(i12).d(i11).a();
        } catch (Exception e10) {
            ad.b("ViewOptionWrapper", e10.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.video.dynview.c b(View view, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.d.c a = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId(), false);
            int g10 = a != null ? a.g() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            return new c.a().a("mbridge_reward_layer_floor_bottom").a(3).a(arrayList).a(view.getContext()).a(view).c(g10).b(z.r(view.getContext())).a();
        } catch (Exception e2) {
            ad.b("ViewOptionWrapper", e2.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.video.dynview.c b(Context context, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float f10 = ai.f(com.mbridge.msdk.foundation.controller.c.m().c());
                    float e2 = ai.e(com.mbridge.msdk.foundation.controller.c.m().c());
                    List<String> arrayList = new ArrayList<>();
                    int dynamicTempCode = list.get(0).getDynamicTempCode();
                    int mof_tplid = list.get(0).getMof_tplid();
                    String mof_template_url = list.get(0).getMof_template_url();
                    int r6 = z.r(context);
                    if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                        arrayList = ab.a(n.a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + "_" + r6);
                    }
                    return new c.a().a(r6 == 1 ? "mbridge_order_layout_list_portrait" : "mbridge_order_layout_list_landscape").a(5).a(context).a(e2).b(f10).a(list).b(r6).b(arrayList).e(dynamicTempCode).d(mof_tplid).a();
                }
            } catch (Exception e10) {
                ad.b("ViewOptionWrapper", e10.getMessage());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:6:0x0008, B:9:0x001a, B:10:0x002d, B:17:0x003f, B:18:0x004e, B:20:0x0054, B:21:0x0078, B:23:0x0094, B:24:0x0098), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:6:0x0008, B:9:0x001a, B:10:0x002d, B:17:0x003f, B:18:0x004e, B:20:0x0054, B:21:0x0078, B:23:0x0094, B:24:0x0098), top: B:5:0x0008 }] */
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
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lef
            r3.<init>()     // Catch: java.lang.Exception -> Lef
            java.lang.String r4 = r13.getCampaignUnitId()     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.foundation.entity.CampaignEx$c r5 = r13.getRewardTemplateMode()     // Catch: java.lang.Exception -> Lef
            java.lang.String r6 = ""
            r7 = 0
            if (r5 == 0) goto L2b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r5 = r13.getRewardTemplateMode()     // Catch: java.lang.Exception -> Lef
            int r5 = r5.f()     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r13.getRewardTemplateMode()     // Catch: java.lang.Exception -> Lef
            java.lang.String r8 = r8.e()     // Catch: java.lang.Exception -> Lef
            goto L2d
        L2b:
            r8 = r6
            r5 = r7
        L2d:
            java.lang.String r9 = "ia_tp"
            r10 = -5
            int r9 = com.mbridge.msdk.foundation.tools.ai.a(r8, r9, r10)     // Catch: java.lang.Exception -> Lef
            if (r5 == 0) goto L4c
            r10 = 102(0x66, float:1.43E-43)
            if (r5 == r10) goto L4c
            r10 = 202(0xca, float:2.83E-43)
            if (r5 != r10) goto L3f
            goto L4c
        L3f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lef
            r10.<init>(r1)     // Catch: java.lang.Exception -> Lef
            r10.append(r5)     // Catch: java.lang.Exception -> Lef
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Exception -> Lef
            goto L4e
        L4c:
            java.lang.String r1 = "mbridge_reward_layer_floor"
        L4e:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> Lef
            if (r10 != 0) goto L78
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lef
            r3.<init>()     // Catch: java.lang.Exception -> Lef
            r3.append(r5)     // Catch: java.lang.Exception -> Lef
            r3.append(r6)     // Catch: java.lang.Exception -> Lef
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lef
            r6 = 1
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.n.a(r6, r3, r8)     // Catch: java.lang.Exception -> Lef
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lef
            r6.<init>(r0)     // Catch: java.lang.Exception -> Lef
            r6.append(r5)     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> Lef
            java.util.List r3 = com.mbridge.msdk.foundation.tools.ab.a(r3, r0)     // Catch: java.lang.Exception -> Lef
        L78:
            boolean r0 = com.mbridge.msdk.video.dynview.i.a.a(r8)     // Catch: java.lang.Exception -> Lef
            java.lang.String r6 = "whs_chn"
            java.lang.String r6 = com.mbridge.msdk.video.dynview.i.a.a(r8, r6)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.videocommon.d.b r8 = com.mbridge.msdk.videocommon.d.b.a()     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> Lef
            java.lang.String r10 = r10.k()     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.videocommon.d.c r4 = r8.a(r10, r4, r7)     // Catch: java.lang.Exception -> Lef
            if (r4 == 0) goto L98
            int r7 = r4.g()     // Catch: java.lang.Exception -> Lef
        L98:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lef
            r4.<init>()     // Catch: java.lang.Exception -> Lef
            r4.add(r13)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$a r8 = new com.mbridge.msdk.video.dynview.c$a     // Catch: java.lang.Exception -> Lef
            r8.<init>()     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r1 = r8.a(r1)     // Catch: java.lang.Exception -> Lef
            r8 = 2
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r8)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r4)     // Catch: java.lang.Exception -> Lef
            android.content.Context r4 = r12.getContext()     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r4)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r1 = r1.a(r12)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r1 = r1.c(r7)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r1 = r1.f(r9)     // Catch: java.lang.Exception -> Lef
            android.content.Context r12 = r12.getContext()     // Catch: java.lang.Exception -> Lef
            int r12 = com.mbridge.msdk.foundation.tools.z.r(r12)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r12 = r1.b(r12)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r12 = r12.d(r5)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r12 = r12.a(r0)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r12 = r12.c(r6)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r12 = r12.b(r3)     // Catch: java.lang.Exception -> Lef
            int r13 = r13.getDynamicTempCode()     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c$b r12 = r12.e(r13)     // Catch: java.lang.Exception -> Lef
            com.mbridge.msdk.video.dynview.c r12 = r12.a()     // Catch: java.lang.Exception -> Lef
            return r12
        Lef:
            r12 = move-exception
            java.lang.String r13 = "ViewOptionWrapper"
            java.lang.String r12 = r12.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r13, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.j.c.a(android.view.View, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.video.dynview.c");
    }

    public final com.mbridge.msdk.video.dynview.c a(Context context, CampaignEx campaignEx, int i10, String str) {
        String str2;
        String str3;
        if (campaignEx == null) {
            return null;
        }
        try {
            long ecTemplateId = campaignEx.getEcTemplateId();
            int r6 = z.r(context);
            int a = ai.a(campaignEx.getendcard_url(), "n_logo", 1);
            if (ecTemplateId == 1302) {
                if (r6 == 1) {
                    str2 = "mbridge_reward_end_card_layout_portrait_" + ecTemplateId;
                } else {
                    str2 = "mbridge_reward_end_card_layout_landscape_" + ecTemplateId;
                }
                str3 = "template_" + str + r6 + "_" + ecTemplateId;
            } else {
                str2 = r6 == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape";
                str3 = "template_" + str + r6;
            }
            List<String> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                arrayList = ab.a(n.a(2, i10 + "", campaignEx.getendcard_url()), str3);
            }
            return new c.a().a(str2).a(4).a(context).b(z.r(context)).b(arrayList).e(campaignEx.getDynamicTempCode()).d(i10).b(str).g(a).a();
        } catch (Exception e2) {
            ad.b("ViewOptionWrapper", e2.getMessage());
            return null;
        }
    }
}
