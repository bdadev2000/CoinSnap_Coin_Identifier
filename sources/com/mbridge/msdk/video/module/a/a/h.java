package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class h extends k {
    public h(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i9, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i9, z8);
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i9, Object obj) {
        if (i9 != 100) {
            if (i9 != 109) {
                if (i9 != 122) {
                    if (i9 != 129) {
                        String str = "";
                        if (i9 != 118) {
                            if (i9 == 119) {
                                if (obj != null && (obj instanceof String)) {
                                    str = (String) obj;
                                }
                                a(4, str);
                            }
                        } else {
                            if (obj != null && (obj instanceof String)) {
                                str = (String) obj;
                            }
                            a(3, str);
                        }
                    } else {
                        CampaignEx campaignEx = this.b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                            g();
                            f();
                            e();
                            a(1);
                        }
                    }
                } else {
                    a();
                }
            } else {
                b(2);
            }
        } else {
            g();
            f();
            e();
            a(2);
        }
        super.a(i9, obj);
    }
}
