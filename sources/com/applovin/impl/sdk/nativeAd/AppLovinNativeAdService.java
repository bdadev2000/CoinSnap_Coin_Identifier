package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.e4;
import com.applovin.impl.gc;
import com.applovin.impl.nm;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import com.applovin.impl.w;
import com.applovin.impl.yl;
import com.applovin.impl.ym;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final n logger;
    private final j sdk;

    public AppLovinNativeAdService(j jVar) {
        this.sdk = jVar;
        this.logger = jVar.J();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            n.h(TAG, "Empty ad token");
            gc.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        w wVar = new w(trim, this.sdk);
        if (wVar.c() == w.a.REGULAR) {
            if (n.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + wVar);
            }
            this.sdk.j0().a((yl) new nm(wVar, appLovinNativeAdLoadListener, this.sdk), tm.b.CORE);
            return;
        }
        if (wVar.c() != w.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            n.h(TAG, "Invalid token type");
            gc.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject a2 = wVar.a();
        if (a2 == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            n.h(TAG, str2);
            gc.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        e4.c(a2, this.sdk);
        e4.b(a2, this.sdk);
        e4.a(a2, this.sdk);
        if (JsonUtils.getJSONArray(a2, "ads", new JSONArray()).length() > 0) {
            if (n.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + wVar);
            }
            this.sdk.j0().a((yl) new ym(a2, appLovinNativeAdLoadListener, this.sdk), tm.b.CORE);
            return;
        }
        if (n.a()) {
            this.logger.b(TAG, "No ad returned from the server for token: " + wVar);
        }
        gc.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
