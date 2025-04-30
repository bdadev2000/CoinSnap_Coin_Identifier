package com.mbridge.msdk.video.signal.a;

import Q7.n0;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i9, int i10, int i11) {
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
    public void notifyCloseBtn(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "notifyCloseBtn:state = ", "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "readyStatus:isReady=", "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i9, int i10, int i11) {
        StringBuilder o3 = n0.o(i9, i10, "showMiniCard width = ", " height = ", " radius = ");
        o3.append(i11);
        ad.a("DefaultJSContainerModule", o3.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        ad.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "showEndcard,type=", "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i9, int i10, int i11, int i12, int i13) {
        StringBuilder o3 = n0.o(i9, i10, "showMiniCard top = ", " left = ", " width = ");
        n0.t(o3, i11, " height = ", i12, " radius = ");
        o3.append(i13);
        ad.a("DefaultJSContainerModule", o3.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "showVideoClickView:", "DefaultJSContainerModule");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        ad.a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "toggleCloseBtn:state=", "DefaultJSContainerModule");
    }
}
