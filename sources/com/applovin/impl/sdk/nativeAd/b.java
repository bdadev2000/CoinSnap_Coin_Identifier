package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.adview.t;
import com.applovin.impl.aq;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.zm;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends yl implements a.InterfaceC0098a, AppLovinAdLoadListener {
    private final List A;
    private final List B;
    private final List C;

    /* renamed from: h */
    private final JSONObject f26734h;

    /* renamed from: i */
    private final JSONObject f26735i;

    /* renamed from: j */
    private final AppLovinNativeAdLoadListener f26736j;

    /* renamed from: k */
    private String f26737k;

    /* renamed from: l */
    private String f26738l;

    /* renamed from: m */
    private String f26739m;

    /* renamed from: n */
    private Double f26740n;

    /* renamed from: o */
    private String f26741o;

    /* renamed from: p */
    private Uri f26742p;

    /* renamed from: q */
    private Uri f26743q;

    /* renamed from: r */
    private aq f26744r;

    /* renamed from: s */
    private Uri f26745s;

    /* renamed from: t */
    private Uri f26746t;

    /* renamed from: u */
    private Uri f26747u;

    /* renamed from: v */
    private Uri f26748v;
    private final List w;
    private final List x;

    /* renamed from: y */
    private final List f26749y;

    /* renamed from: z */
    private final List f26750z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, j jVar) {
        super("TaskRenderNativeAd", jVar);
        this.f26737k = "";
        this.f26738l = "";
        this.f26739m = "";
        this.f26740n = null;
        this.f26741o = "";
        this.f26742p = null;
        this.f26743q = null;
        this.f26745s = null;
        this.f26746t = null;
        this.f26747u = null;
        this.f26748v = null;
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.f26749y = new ArrayList();
        this.f26750z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.f26734h = jSONObject;
        this.f26735i = jSONObject2;
        this.f26736j = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f26747u = Uri.parse(string);
            if (n.a()) {
                this.f28218c.a(this.f28217b, "Processed click destination URL: " + this.f26747u);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f26748v = Uri.parse(string2);
            if (n.a()) {
                this.f28218c.a(this.f28217b, "Processed click destination backup URL: " + this.f26748v);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (JsonUtils.getBoolean(this.f26734h, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f28216a.a(sj.h3)).booleanValue()) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i2, null);
                    if (objectAtIndex instanceof String) {
                        String str = (String) objectAtIndex;
                        if (!TextUtils.isEmpty(str)) {
                            this.f26749y.add(new e.a(this.f28216a).b(str).b(false).a(false).h(f()).a());
                        }
                    }
                }
                if (n.a()) {
                    this.f28218c.a(this.f28217b, "Processed click tracking requests: " + this.f26749y);
                    return;
                }
                return;
            }
            try {
                this.w.addAll(JsonUtils.toList(jSONArray));
                if (n.a()) {
                    this.f28218c.a(this.f28217b, "Processed click tracking URLs: " + this.w);
                }
            } catch (Throwable th) {
                if (n.a()) {
                    this.f28218c.a(this.f28217b, "Failed to render click tracking URLs", th);
                }
            }
        }
    }

    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (n.a()) {
            this.f28218c.a(this.f28217b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (n.a()) {
                this.f28218c.a(this.f28217b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f26736j.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (n.a()) {
                this.f28218c.a(this.f28217b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f28216a.E().a(this.f28217b, "prepareNativeComponents", th);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new androidx.core.content.res.a(18, this, appLovinNativeAdImpl));
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f26734h, "fire_native_ad_postbacks_from_webview", (Boolean) this.f28216a.a(sj.g3)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (n.a()) {
            this.f28218c.a(this.f28217b, "VAST ad rendered successfully");
        }
        this.f26744r = (aq) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        if (n.a()) {
            this.f28218c.b(this.f28217b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r3 = 0;
        String string = JsonUtils.getString(this.f26734h, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f26745s = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f26734h, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f26746t = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f26734h, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (n.a()) {
                this.f28218c.b(this.f28217b, "No oRtb response provided: " + this.f26734h);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (n.a()) {
            t.v("Rendering native ad for oRTB version: ", string3, this.f28218c, this.f28217b);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (n.a()) {
                this.f28218c.b(this.f28217b, "Unable to retrieve assets - failing ad load: " + this.f26734h);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject4.has("title")) {
                this.f26737k = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) null), "text", null);
                if (n.a()) {
                    this.f28218c.a(this.f28217b, "Processed title: " + this.f26737k);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
            } else if (jSONObject4.has(ImpressionLog.f29268t)) {
                int i3 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, ImpressionLog.f29268t, (JSONObject) null);
                int i4 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", null);
                if (i4 == 1 || 3 == i3) {
                    this.f26742p = Uri.parse(string4);
                    if (n.a()) {
                        this.f28218c.a(this.f28217b, "Processed icon URL: " + this.f26742p);
                    }
                } else if (i4 == 3 || 2 == i3) {
                    this.f26743q = Uri.parse(string4);
                    if (n.a()) {
                        this.f28218c.a(this.f28217b, "Processed main image URL: " + this.f26743q);
                    }
                } else {
                    if (n.a()) {
                        this.f28218c.k(this.f28217b, "Unrecognized image: " + jSONObject4);
                    }
                    int i5 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i6 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i5 <= 0 || i6 <= 0) {
                        if (n.a()) {
                            this.f28218c.k(this.f28217b, "Skipping...");
                        }
                    } else if (i5 / i6 > 1.0d) {
                        if (n.a()) {
                            this.f28218c.a(this.f28217b, android.support.v4.media.d.l("Inferring main image from ", i5, "x", i6, "..."));
                        }
                        this.f26743q = Uri.parse(string4);
                    } else {
                        if (n.a()) {
                            this.f28218c.a(this.f28217b, android.support.v4.media.d.l("Inferring icon image from ", i5, "x", i6, "..."));
                        }
                        this.f26742p = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (n.a()) {
                        this.f28218c.a(this.f28217b, "Processed VAST video");
                    }
                } else if (n.a()) {
                    this.f28218c.k(this.f28217b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i7 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i8 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i8 == 1 || i7 == 8) {
                    this.f26738l = string6;
                    if (n.a()) {
                        this.f28218c.a(this.f28217b, "Processed advertiser: " + this.f26738l);
                    }
                } else if (i8 == 2 || i7 == 4) {
                    this.f26739m = string6;
                    if (n.a()) {
                        this.f28218c.a(this.f28217b, "Processed body: " + this.f26739m);
                    }
                } else if (i8 == 12 || i7 == 5) {
                    this.f26741o = string6;
                    if (n.a()) {
                        this.f28218c.a(this.f28217b, "Processed cta: " + this.f26741o);
                    }
                } else if (i8 == 3 || i7 == 6) {
                    double a2 = yp.a(string6, -1.0d);
                    if (a2 != -1.0d) {
                        this.f26740n = Double.valueOf(a2);
                        if (n.a()) {
                            this.f28218c.a(this.f28217b, "Processed star rating: " + this.f26740n);
                        }
                    } else if (n.a()) {
                        t.v("Received invalid star rating: ", string6, this.f28218c, this.f28217b);
                    }
                } else if (n.a()) {
                    this.f28218c.k(this.f28217b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (n.a()) {
                this.f28218c.b(this.f28217b, "Unsupported asset object: " + jSONObject4);
            }
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.x.add(string7);
            if (n.a()) {
                t.v("Processed jstracker: ", string7, this.f28218c, this.f28217b);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i9, null);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f26750z.add(new e.a(this.f28216a).b(str2).b(false).a(false).h(f()).a());
                        if (n.a()) {
                            t.v("Processed imptracker URL: ", str2, this.f28218c, this.f28217b);
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i10 = 0;
            while (i10 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i10, (JSONObject) r3);
                int i11 = JsonUtils.getInt(jSONObject7, MaxEvent.f29810a, -1);
                int i12 = JsonUtils.getInt(jSONObject7, FirebaseAnalytics.Param.METHOD, -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r3);
                if (!TextUtils.isEmpty(string8)) {
                    if (i12 == 1 || i12 == 2) {
                        if (i12 == 2 && string8.startsWith("<script")) {
                            this.x.add(string8);
                        } else {
                            e a3 = new e.a(this.f28216a).b(string8).b(false).a(false).h(f() || i12 == 2).a();
                            if (i11 == 1) {
                                this.f26750z.add(a3);
                                if (n.a()) {
                                    t.v("Processed impression URL: ", string8, this.f28218c, this.f28217b);
                                }
                            } else if (i11 == 2) {
                                this.A.add(a3);
                                if (n.a()) {
                                    t.v("Processed viewable MRC50 URL: ", string8, this.f28218c, this.f28217b);
                                }
                            } else if (i11 == 3) {
                                this.B.add(a3);
                                if (n.a()) {
                                    t.v("Processed viewable MRC100 URL: ", string8, this.f28218c, this.f28217b);
                                }
                            } else {
                                if (i11 == 4) {
                                    this.C.add(a3);
                                    if (n.a()) {
                                        t.v("Processed viewable video 50 URL: ", string8, this.f28218c, this.f28217b);
                                    }
                                } else if (i11 == 555) {
                                    if (n.a()) {
                                        t.v("Ignoring processing of OMID URL: ", string8, this.f28218c, this.f28217b);
                                    }
                                } else if (n.a()) {
                                    this.f28218c.b(this.f28217b, "Unsupported event tracker: " + jSONObject7);
                                }
                                i10++;
                                r3 = 0;
                            }
                            i10++;
                            r3 = 0;
                        }
                    } else if (n.a()) {
                        this.f28218c.b(this.f28217b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i10++;
                r3 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (n.a()) {
            this.f28218c.a(this.f28217b, "Processing VAST video...");
        }
        this.f28216a.j0().a(zm.a(str, JsonUtils.shallowCopy(this.f26734h), JsonUtils.shallowCopy(this.f26735i), this, this.f28216a));
    }

    private void e() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f26734h), JsonUtils.shallowCopy(this.f26735i), this.f28216a).setTitle(this.f26737k).setAdvertiser(this.f26738l).setBody(this.f26739m).setCallToAction(this.f26741o).setStarRating(this.f26740n).setIconUri(this.f26742p).setMainImageUri(this.f26743q).setPrivacyIconUri(this.f26745s).setVastAd(this.f26744r).setPrivacyDestinationUri(this.f26746t).setClickDestinationUri(this.f26747u).setClickDestinationBackupUri(this.f26748v).setClickTrackingUrls(this.w).setJsTrackers(this.x).setClickTrackingRequests(this.f26749y).setImpressionRequests(this.f26750z).setViewableMRC50Requests(this.A).setViewableMRC100Requests(this.B).setViewableVideo50Requests(this.C).build();
        build.getAdEventTracker().e();
        if (n.a()) {
            this.f28218c.a(this.f28217b, "Starting cache task for type: " + build.getType() + "...");
        }
        this.f28216a.j0().a((yl) new a(build, this.f28216a, this), tm.b.CORE);
    }

    private void b(String str) {
        this.f26736j.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0098a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (n.a()) {
            this.f28218c.a(this.f28217b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
