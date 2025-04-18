package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.mm;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.w;
import com.applovin.impl.xl;
import com.applovin.impl.xm;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final t logger;
    private final k sdk;

    public AppLovinNativeAdService(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.L();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String str2;
        if (str != null) {
            str2 = str.trim();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            t.h(TAG, "Empty ad token");
            bc.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        w wVar = new w(str2, this.sdk);
        if (wVar.c() == w.a.REGULAR) {
            if (t.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + wVar);
            }
            this.sdk.l0().a((xl) new mm(wVar, appLovinNativeAdLoadListener, this.sdk), sm.b.CORE);
            return;
        }
        if (wVar.c() == w.a.AD_RESPONSE_JSON) {
            JSONObject a = wVar.a();
            if (a != null) {
                c4.c(a, this.sdk);
                c4.b(a, this.sdk);
                c4.a(a, this.sdk);
                if (JsonUtils.getJSONArray(a, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
                    if (t.a()) {
                        this.logger.a(TAG, "Rendering ad for token: " + wVar);
                    }
                    this.sdk.l0().a((xl) new xm(a, appLovinNativeAdLoadListener, this.sdk), sm.b.CORE);
                    return;
                }
                if (t.a()) {
                    this.logger.b(TAG, "No ad returned from the server for token: " + wVar);
                }
                bc.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
                return;
            }
            String str3 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            AppLovinError appLovinError = new AppLovinError(-8, str3);
            t.h(TAG, str3);
            bc.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
        t.h(TAG, "Invalid token type");
        bc.b(appLovinNativeAdLoadListener, appLovinError2);
    }
}
