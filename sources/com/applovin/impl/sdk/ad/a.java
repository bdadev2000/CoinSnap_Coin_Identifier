package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.e;
import com.applovin.impl.ng;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tl;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: l */
    private final String f26545l;

    /* renamed from: m */
    private final String f26546m;

    /* renamed from: n */
    private final String f26547n;

    /* renamed from: o */
    private final ng f26548o;

    public a(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f26545l = j1();
        this.f26546m = o1();
        this.f26547n = n1();
        this.f26548o = new ng(this);
    }

    private String n1() {
        return getStringFromAdObject("stream_url", "");
    }

    public /* synthetic */ void w(tl tlVar) {
        tlVar.b(CreativeInfo.al, this.f26545l);
        tlVar.b("stream_url", this.f26547n);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean I0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void L0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a(new d(this, 0));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, CreativeInfo.al, this.f26545l);
            JsonUtils.putString(this.adObject, "stream_url", this.f26547n);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String P() {
        return this.f26546m;
    }

    public void b(String str) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b(CreativeInfo.al, str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, CreativeInfo.al, str);
        }
    }

    public void d(Uri uri) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public ng getAdEventTracker() {
        return this.f26548o;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        JSONObject jSONObject;
        tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            jSONObject = tlVar.a();
        } else {
            synchronized (this.fullResponseLock) {
                deepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObject = deepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject2, CreativeInfo.al, this.f26545l);
            JsonUtils.putString(jSONObject2, "video", this.f26546m);
            JsonUtils.putString(jSONObject2, "stream_url", this.f26547n);
        }
        return jSONObject;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return t0() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri i() {
        String stringFromAdObject = getStringFromAdObject(BrandSafetyEvent.f29776a, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.W().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public String j1() {
        return getStringFromAdObject(CreativeInfo.al, "");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri k0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : i();
    }

    public String k1() {
        return getStringFromAdObject("html_url", "");
    }

    public float l1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public String m1() {
        return this.f26547n;
    }

    public String o1() {
        return getStringFromAdObject("video", "");
    }

    public boolean p1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void q1() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public boolean r1() {
        return getBooleanFromAdObject("should_cache_html_url_contents", Boolean.FALSE);
    }

    public boolean s1() {
        return getBooleanFromAdObject("should_respect_whitelist_when_retrieving_html_from_url", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri t0() {
        String n12 = n1();
        if (StringUtils.isValidString(n12)) {
            return Uri.parse(n12);
        }
        String o12 = o1();
        if (StringUtils.isValidString(o12)) {
            return Uri.parse(o12);
        }
        return null;
    }

    public e.a i1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }
}
