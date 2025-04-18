package com.mbridge.msdk.video.signal.a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        ad.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        ad.a("DefaultJSVideoModule", "closeOperte:close=" + i10 + "closeViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        ad.a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        ad.a("DefaultJSVideoModule", "getCurrentProgress");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        ad.a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        com.applovin.impl.mediation.ads.e.y("notifyCloseBtn:", i10, "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        com.applovin.impl.mediation.ads.e.y("progressBarOperate:progressViewVisible=", i10, "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        ad.a("DefaultJSVideoModule", "progressOperate:progress=" + i10 + "progressViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        ad.a("DefaultJSVideoModule", "setCover:" + z10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        ad.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        com.applovin.impl.mediation.ads.e.y("setScaleFitXY:", i10, "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        com.applovin.impl.mediation.ads.e.y("setVisible:", i10, "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        ad.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        ad.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        StringBuilder n10 = a4.j.n("showVideoLocation:marginTop=", i10, ",marginLeft=", i11, ",width=");
        a4.j.y(n10, i12, ",height=", i13, ",radius=");
        a4.j.y(n10, i14, ",borderTop=", i15, ",borderTop=");
        a4.j.y(n10, i15, ",borderLeft=", i16, ",borderWidth=");
        n10.append(i17);
        n10.append(",borderHeight=");
        n10.append(i18);
        ad.a("DefaultJSVideoModule", n10.toString());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        StringBuilder n10 = a4.j.n("soundOperate:mute=", i10, ",soundViewVisible=", i11, ",pt=");
        n10.append(str);
        ad.a("DefaultJSVideoModule", n10.toString());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        com.applovin.impl.mediation.ads.e.y("videoOperate:", i10, "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        ad.a("DefaultJSVideoModule", "soundOperate:mute=" + i10 + ",soundViewVisible=" + i11);
    }
}
