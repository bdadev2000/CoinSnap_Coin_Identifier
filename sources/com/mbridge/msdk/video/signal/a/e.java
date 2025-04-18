package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        ad.a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        ad.a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        ad.a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        ad.a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        com.applovin.impl.mediation.ads.e.y("notifyCloseBtn:state = ", i10, "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        com.applovin.impl.mediation.ads.e.y("readyStatus:isReady=", i10, "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        StringBuilder n10 = a4.j.n("showMiniCard width = ", i10, " height = ", i11, " radius = ");
        n10.append(i12);
        ad.a("DefaultJSContainerModule", n10.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        ad.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        com.applovin.impl.mediation.ads.e.y("showEndcard,type=", i10, "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        StringBuilder n10 = a4.j.n("showMiniCard top = ", i10, " left = ", i11, " width = ");
        a4.j.y(n10, i12, " height = ", i13, " radius = ");
        n10.append(i14);
        ad.a("DefaultJSContainerModule", n10.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        com.applovin.impl.mediation.ads.e.y("showVideoClickView:", i10, "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        ad.a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        com.applovin.impl.mediation.ads.e.y("toggleCloseBtn:state=", i10, "DefaultJSContainerModule");
    }
}
