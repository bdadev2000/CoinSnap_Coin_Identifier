package com.mbridge.msdk.video.signal.a;

import Q7.n0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        ad.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i9, int i10) {
        ad.a("DefaultJSVideoModule", "closeOperte:close=" + i9 + "closeViewVisible=" + i10);
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
    public void hideAlertView(int i9) {
        ad.a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "notifyCloseBtn:", "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "progressBarOperate:progressViewVisible=", "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i9, int i10) {
        ad.a("DefaultJSVideoModule", "progressOperate:progress=" + i9 + "progressViewVisible=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z8) {
        ad.a("DefaultJSVideoModule", "setCover:" + z8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z8) {
        ad.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "setScaleFitXY:", "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "setVisible:", "DefaultJSVideoModule");
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
    public void showVideoLocation(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        StringBuilder o3 = n0.o(i9, i10, "showVideoLocation:marginTop=", ",marginLeft=", ",width=");
        n0.t(o3, i11, ",height=", i12, ",radius=");
        n0.t(o3, i13, ",borderTop=", i14, ",borderTop=");
        n0.t(o3, i14, ",borderLeft=", i15, ",borderWidth=");
        o3.append(i16);
        o3.append(",borderHeight=");
        o3.append(i17);
        ad.a("DefaultJSVideoModule", o3.toString());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i9, int i10) {
        ad.a("DefaultJSVideoModule", "soundOperate:mute=" + i9 + ",soundViewVisible=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "videoOperate:", "DefaultJSVideoModule");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i9, int i10, String str) {
        StringBuilder o3 = n0.o(i9, i10, "soundOperate:mute=", ",soundViewVisible=", ",pt=");
        o3.append(str);
        ad.a("DefaultJSVideoModule", o3.toString());
    }
}
