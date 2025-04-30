package com.mbridge.msdk.video.module.a.a;

import Q7.n0;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i9, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i9, z8);
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i9, Object obj) {
        super.a(i9, obj);
        if (this.f19019a) {
            try {
                CampaignEx campaignEx = this.b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    b(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i9 != 105 && i9 != 106 && i9 != 113) {
                if (i9 != 122) {
                    switch (i9) {
                        case 109:
                            b(2);
                            a(2);
                            return;
                        case 110:
                            b(1);
                            a(1);
                            return;
                        case 111:
                            a(1);
                            return;
                        default:
                            return;
                    }
                }
                a();
                return;
            }
            com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c(), this.b);
            if (i9 != 105) {
                String noticeUrl = this.b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(com.mbridge.msdk.foundation.same.a.m)) {
                        noticeUrl = AbstractC2914a.h(AbstractC2965e.c(noticeUrl, "&"), com.mbridge.msdk.foundation.same.a.m, "=2");
                    } else {
                        noticeUrl = noticeUrl.replace(n0.l(new StringBuilder(), com.mbridge.msdk.foundation.same.a.m, "=", Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.m)), com.mbridge.msdk.foundation.same.a.m + "=2");
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.f19024g, noticeUrl, true, false, com.mbridge.msdk.click.a.a.f14773i);
            }
        }
    }
}
