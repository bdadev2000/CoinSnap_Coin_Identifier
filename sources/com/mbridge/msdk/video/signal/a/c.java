package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class c implements com.mbridge.msdk.video.signal.c {
    private static final String a = "c";

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        ad.a(a, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        ad.a(a, "handlerH5Exception");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        ad.a(a, "reactDeveloper");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        ad.a(a, "reportUrls");
    }
}
