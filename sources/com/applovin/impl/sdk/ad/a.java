package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.e;
import com.applovin.impl.jg;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: l, reason: collision with root package name */
    private final String f7587l;

    /* renamed from: m, reason: collision with root package name */
    private final String f7588m;

    /* renamed from: n, reason: collision with root package name */
    private final String f7589n;

    /* renamed from: o, reason: collision with root package name */
    private final jg f7590o;

    public a(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f7587l = e1();
        this.f7588m = j1();
        this.f7589n = i1();
        this.f7590o = new jg(this);
    }

    private String i1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(ql qlVar) {
        qlVar.b("html", this.f7587l);
        qlVar.b("stream_url", this.f7589n);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean G0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void J0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a(new d(this, 0));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f7587l);
            JsonUtils.putString(this.adObject, "stream_url", this.f7589n);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String P() {
        return this.f7588m;
    }

    public void b(String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public void d(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b(MimeTypes.BASE_TYPE_VIDEO, uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, MimeTypes.BASE_TYPE_VIDEO, uri.toString());
        }
    }

    public String e1() {
        return getStringFromAdObject("html", "");
    }

    public String f1() {
        return getStringFromAdObject(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, "");
    }

    public float g1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        JSONObject jSONObject;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            jSONObject = qlVar.a();
        } else {
            synchronized (this.fullResponseLock) {
                deepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObject = deepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject2, "html", this.f7587l);
            JsonUtils.putString(jSONObject2, MimeTypes.BASE_TYPE_VIDEO, this.f7588m);
            JsonUtils.putString(jSONObject2, "stream_url", this.f7589n);
        }
        return jSONObject;
    }

    public String h1() {
        return this.f7589n;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return s0() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.Y().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject(CampaignEx.JSON_KEY_CLICK_URL, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return j();
    }

    public String j1() {
        return getStringFromAdObject(MimeTypes.BASE_TYPE_VIDEO, "");
    }

    public boolean k1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void l1() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public boolean m1() {
        return getBooleanFromAdObject("should_cache_html_url_contents", Boolean.FALSE);
    }

    public boolean n1() {
        return getBooleanFromAdObject("should_respect_whitelist_when_retrieving_html_from_url", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri s0() {
        String i12 = i1();
        if (StringUtils.isValidString(i12)) {
            return Uri.parse(i12);
        }
        String j12 = j1();
        if (StringUtils.isValidString(j12)) {
            return Uri.parse(j12);
        }
        return null;
    }

    public e.a d1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public jg getAdEventTracker() {
        return this.f7590o;
    }
}
