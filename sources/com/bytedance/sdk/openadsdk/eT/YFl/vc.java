package com.bytedance.sdk.openadsdk.eT.YFl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.openadsdk.core.hQ;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc extends com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject> {
    private final hQ Sg;
    private final String YFl;

    public vc(String str, hQ hQVar) {
        this.Sg = hQVar;
        this.YFl = str;
    }

    public static void YFl(lG lGVar, hQ hQVar) {
        lGVar.YFl("appInfo", new vc("appInfo", hQVar));
        lGVar.YFl("adInfo", new vc("adInfo", hQVar));
        lGVar.YFl("sendLog", new vc("sendLog", hQVar));
        lGVar.YFl("playable_style", new vc("playable_style", hQVar));
        lGVar.YFl("getTemplateInfo", new vc("getTemplateInfo", hQVar));
        lGVar.YFl("getTeMaiAds", new vc("getTeMaiAds", hQVar));
        lGVar.YFl("isViewable", new vc("isViewable", hQVar));
        lGVar.YFl("getScreenSize", new vc("getScreenSize", hQVar));
        lGVar.YFl("getCloseButtonInfo", new vc("getCloseButtonInfo", hQVar));
        lGVar.YFl("getVolume", new vc("getVolume", hQVar));
        lGVar.YFl("removeLoading", new vc("removeLoading", hQVar));
        lGVar.YFl("sendReward", new vc("sendReward", hQVar));
        lGVar.YFl("subscribe_app_ad", new vc("subscribe_app_ad", hQVar));
        lGVar.YFl("download_app_ad", new vc("download_app_ad", hQVar));
        lGVar.YFl("cancel_download_app_ad", new vc("cancel_download_app_ad", hQVar));
        lGVar.YFl("unsubscribe_app_ad", new vc("unsubscribe_app_ad", hQVar));
        lGVar.YFl("landscape_click", new vc("landscape_click", hQVar));
        lGVar.YFl("clickEvent", new vc("clickEvent", hQVar));
        lGVar.YFl("renderDidFinish", new vc("renderDidFinish", hQVar));
        lGVar.YFl("dynamicTrack", new vc("dynamicTrack", hQVar));
        lGVar.YFl("skipVideo", new vc("skipVideo", hQVar));
        lGVar.YFl("muteVideo", new vc("muteVideo", hQVar));
        lGVar.YFl("changeVideoState", new vc("changeVideoState", hQVar));
        lGVar.YFl("getCurrentVideoState", new vc("getCurrentVideoState", hQVar));
        lGVar.YFl("send_temai_product_ids", new vc("send_temai_product_ids", hQVar));
        lGVar.YFl("getMaterialMeta", new vc("getMaterialMeta", hQVar));
        lGVar.YFl("endcard_load", new vc("endcard_load", hQVar));
        lGVar.YFl("pauseWebView", new vc("pauseWebView", hQVar));
        lGVar.YFl("pauseWebViewTimers", new vc("pauseWebViewTimers", hQVar));
        lGVar.YFl("webview_time_track", new vc("webview_time_track", hQVar));
        lGVar.YFl("openPrivacy", new vc("openPrivacy", hQVar));
        lGVar.YFl("openAdLandPageLinks", new vc("openAdLandPageLinks", hQVar));
        lGVar.YFl("getNativeSiteCustomData", new vc("getNativeSiteCustomData", hQVar));
        lGVar.YFl("close", new vc("close", hQVar));
    }

    @Override // com.bytedance.sdk.component.YFl.wN
    @Nullable
    public JSONObject YFl(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        hQ.Sg sg2 = new hQ.Sg();
        sg2.YFl = NotificationCompat.CATEGORY_CALL;
        sg2.tN = this.YFl;
        sg2.AlY = jSONObject;
        return this.Sg.YFl(sg2, 3);
    }
}
