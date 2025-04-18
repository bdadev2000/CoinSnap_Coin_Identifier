package com.mbridge.msdk.video.signal.a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        com.applovin.impl.mediation.ads.e.A("triggerCloseBtn,state=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void b(String str) {
        com.applovin.impl.mediation.ads.e.A("setOrientation,landscape=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void c(String str) {
        com.applovin.impl.mediation.ads.e.A("handlerPlayableException，msg=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        com.applovin.impl.mediation.ads.e.y("notifyCloseBtn,state=", i10, "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        com.applovin.impl.mediation.ads.e.y("toggleCloseBtn,state=", i10, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public String a() {
        ad.a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }
}
