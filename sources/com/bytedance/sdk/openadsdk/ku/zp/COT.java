package com.bytedance.sdk.openadsdk.ku.zp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.zp.woN;
import com.bytedance.sdk.openadsdk.core.RCv;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT extends com.bytedance.sdk.component.zp.COT<JSONObject, JSONObject> {
    private final RCv lMd;
    private final String zp;

    public COT(String str, RCv rCv) {
        this.lMd = rCv;
        this.zp = str;
    }

    public static void zp(woN won, RCv rCv) {
        won.zp("appInfo", new COT("appInfo", rCv));
        won.zp("adInfo", new COT("adInfo", rCv));
        won.zp("sendLog", new COT("sendLog", rCv));
        won.zp("playable_style", new COT("playable_style", rCv));
        won.zp("getTemplateInfo", new COT("getTemplateInfo", rCv));
        won.zp("getTeMaiAds", new COT("getTeMaiAds", rCv));
        won.zp("isViewable", new COT("isViewable", rCv));
        won.zp("getScreenSize", new COT("getScreenSize", rCv));
        won.zp("getCloseButtonInfo", new COT("getCloseButtonInfo", rCv));
        won.zp("getVolume", new COT("getVolume", rCv));
        won.zp("removeLoading", new COT("removeLoading", rCv));
        won.zp("sendReward", new COT("sendReward", rCv));
        won.zp("subscribe_app_ad", new COT("subscribe_app_ad", rCv));
        won.zp("download_app_ad", new COT("download_app_ad", rCv));
        won.zp("cancel_download_app_ad", new COT("cancel_download_app_ad", rCv));
        won.zp("unsubscribe_app_ad", new COT("unsubscribe_app_ad", rCv));
        won.zp("landscape_click", new COT("landscape_click", rCv));
        won.zp("clickEvent", new COT("clickEvent", rCv));
        won.zp("renderDidFinish", new COT("renderDidFinish", rCv));
        won.zp("dynamicTrack", new COT("dynamicTrack", rCv));
        won.zp("skipVideo", new COT("skipVideo", rCv));
        won.zp("muteVideo", new COT("muteVideo", rCv));
        won.zp("changeVideoState", new COT("changeVideoState", rCv));
        won.zp("getCurrentVideoState", new COT("getCurrentVideoState", rCv));
        won.zp("send_temai_product_ids", new COT("send_temai_product_ids", rCv));
        won.zp("getMaterialMeta", new COT("getMaterialMeta", rCv));
        won.zp("endcard_load", new COT("endcard_load", rCv));
        won.zp("pauseWebView", new COT("pauseWebView", rCv));
        won.zp("pauseWebViewTimers", new COT("pauseWebViewTimers", rCv));
        won.zp("webview_time_track", new COT("webview_time_track", rCv));
        won.zp("openPrivacy", new COT("openPrivacy", rCv));
        won.zp("openAdLandPageLinks", new COT("openAdLandPageLinks", rCv));
        won.zp("getNativeSiteCustomData", new COT("getNativeSiteCustomData", rCv));
        won.zp("close", new COT("close", rCv));
    }

    @Override // com.bytedance.sdk.component.zp.COT
    @Nullable
    public JSONObject zp(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zp.HWF hwf) throws Exception {
        RCv.lMd lmd = new RCv.lMd();
        lmd.zp = NotificationCompat.CATEGORY_CALL;
        lmd.KS = this.zp;
        lmd.jU = jSONObject;
        return this.lMd.zp(lmd, 3);
    }
}
