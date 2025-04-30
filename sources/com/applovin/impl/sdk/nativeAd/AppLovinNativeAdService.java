package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.C0769w;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.mm;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
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
        C0769w c0769w = new C0769w(str2, this.sdk);
        if (c0769w.c() == C0769w.a.REGULAR) {
            if (t.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + c0769w);
            }
            this.sdk.l0().a((xl) new mm(c0769w, appLovinNativeAdLoadListener, this.sdk), sm.b.CORE);
            return;
        }
        if (c0769w.c() == C0769w.a.AD_RESPONSE_JSON) {
            JSONObject a6 = c0769w.a();
            if (a6 != null) {
                c4.c(a6, this.sdk);
                c4.b(a6, this.sdk);
                c4.a(a6, this.sdk);
                if (JsonUtils.getJSONArray(a6, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
                    if (t.a()) {
                        this.logger.a(TAG, "Rendering ad for token: " + c0769w);
                    }
                    this.sdk.l0().a((xl) new xm(a6, appLovinNativeAdLoadListener, this.sdk), sm.b.CORE);
                    return;
                }
                if (t.a()) {
                    this.logger.b(TAG, "No ad returned from the server for token: " + c0769w);
                }
                bc.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
                return;
            }
            String str3 = "Unable to retrieve ad response JSON from token: " + c0769w.b();
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
