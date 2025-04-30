package com.mbridge.msdk.video.signal.a;

import com.applovin.impl.L;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public String a() {
        ad.a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void b(String str) {
        L.C("setOrientation,landscape=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void c(String str) {
        L.C("handlerPlayableException，msg=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "notifyCloseBtn,state=", "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "toggleCloseBtn,state=", "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        L.C("triggerCloseBtn,state=", str, "js");
    }
}
