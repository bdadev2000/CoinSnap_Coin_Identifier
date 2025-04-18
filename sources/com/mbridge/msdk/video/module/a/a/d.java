package com.mbridge.msdk.video.module.a.a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (this.a) {
            try {
                CampaignEx campaignEx = this.f16034b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    b(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i10 != 105 && i10 != 106 && i10 != 113) {
                if (i10 != 122) {
                    switch (i10) {
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
            com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b);
            if (i10 != 105) {
                String noticeUrl = this.f16034b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(com.mbridge.msdk.foundation.same.a.f13282m)) {
                        noticeUrl = vd.e.h(eb.j.n(noticeUrl, "&"), com.mbridge.msdk.foundation.same.a.f13282m, "=2");
                    } else {
                        noticeUrl = noticeUrl.replace(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder(), com.mbridge.msdk.foundation.same.a.f13282m, "=", Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.f13282m)), com.mbridge.msdk.foundation.same.a.f13282m + "=2");
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b, this.f16039g, noticeUrl, true, false, com.mbridge.msdk.click.a.a.f12482i);
            }
        }
    }
}
