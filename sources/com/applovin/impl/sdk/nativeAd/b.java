package com.applovin.impl.sdk.nativeAd;

import Q7.n0;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.bn;
import com.applovin.impl.bq;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class b extends xl implements a.InterfaceC0035a, AppLovinAdLoadListener {

    /* renamed from: A */
    private final List f11023A;

    /* renamed from: B */
    private final List f11024B;

    /* renamed from: h */
    private final JSONObject f11025h;

    /* renamed from: i */
    private final JSONObject f11026i;

    /* renamed from: j */
    private final AppLovinNativeAdLoadListener f11027j;

    /* renamed from: k */
    private String f11028k;
    private String l;
    private String m;

    /* renamed from: n */
    private Double f11029n;

    /* renamed from: o */
    private String f11030o;

    /* renamed from: p */
    private Uri f11031p;

    /* renamed from: q */
    private Uri f11032q;

    /* renamed from: r */
    private bq f11033r;

    /* renamed from: s */
    private Uri f11034s;

    /* renamed from: t */
    private Uri f11035t;

    /* renamed from: u */
    private Uri f11036u;

    /* renamed from: v */
    private Uri f11037v;

    /* renamed from: w */
    private final List f11038w;

    /* renamed from: x */
    private final List f11039x;

    /* renamed from: y */
    private final List f11040y;

    /* renamed from: z */
    private final List f11041z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f11028k = "";
        this.l = "";
        this.m = "";
        this.f11029n = null;
        this.f11030o = "";
        this.f11031p = null;
        this.f11032q = null;
        this.f11034s = null;
        this.f11035t = null;
        this.f11036u = null;
        this.f11037v = null;
        this.f11038w = new ArrayList();
        this.f11039x = new ArrayList();
        this.f11040y = new ArrayList();
        this.f11041z = new ArrayList();
        this.f11023A = new ArrayList();
        this.f11024B = new ArrayList();
        this.f11025h = jSONObject;
        this.f11026i = jSONObject2;
        this.f11027j = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f11036u = Uri.parse(string);
            if (t.a()) {
                this.f12279c.a(this.b, "Processed click destination URL: " + this.f11036u);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f11037v = Uri.parse(string2);
            if (t.a()) {
                this.f12279c.a(this.b, "Processed click destination backup URL: " + this.f11037v);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.f11038w.addAll(JsonUtils.toList(jSONArray));
                if (t.a()) {
                    this.f12279c.a(this.b, "Processed click tracking URLs: " + this.f11038w);
                }
            } catch (Throwable th) {
                if (t.a()) {
                    this.f12279c.a(this.b, "Failed to render click tracking URLs", th);
                }
            }
        }
    }

    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (t.a()) {
            this.f12279c.a(this.b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (t.a()) {
                this.f12279c.a(this.b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f11027j.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (t.a()) {
                this.f12279c.a(this.b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f12278a.B().a(this.b, "prepareNativeComponents", th);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new A4.d(19, this, appLovinNativeAdImpl));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (t.a()) {
            this.f12279c.a(this.b, "VAST ad rendered successfully");
        }
        this.f11033r = (bq) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i9) {
        if (t.a()) {
            this.f12279c.b(this.b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        boolean z8;
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f11025h, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f11034s = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f11025h, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f11035t = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f11025h, "ortb_response", (JSONObject) null);
        if (jSONObject != null && jSONObject.length() != 0) {
            String string3 = JsonUtils.getString(jSONObject, "version", null);
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, (JSONObject) null);
            if (t.a()) {
                n0.s("Rendering native ad for oRTB version: ", string3, this.f12279c, this.b);
            }
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
            a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                String str = "";
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
                    if (jSONObject4.has(CampaignEx.JSON_KEY_TITLE)) {
                        this.f11028k = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, CampaignEx.JSON_KEY_TITLE, (JSONObject) null), MimeTypes.BASE_TYPE_TEXT, null);
                        if (t.a()) {
                            this.f12279c.a(this.b, "Processed title: " + this.f11028k);
                        }
                    } else if (jSONObject4.has("link")) {
                        a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
                    } else if (jSONObject4.has("img")) {
                        int i10 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                        int i11 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string4 = JsonUtils.getString(jSONObject5, "url", null);
                        if (i11 != 1 && 3 != i10) {
                            if (i11 != 3 && 2 != i10) {
                                if (t.a()) {
                                    this.f12279c.k(this.b, "Unrecognized image: " + jSONObject4);
                                }
                                int i12 = JsonUtils.getInt(jSONObject5, "w", -1);
                                int i13 = JsonUtils.getInt(jSONObject5, "h", -1);
                                if (i12 > 0 && i13 > 0) {
                                    if (i12 / i13 > 1.0d) {
                                        if (t.a()) {
                                            this.f12279c.a(this.b, AbstractC2914a.c(i12, i13, "Inferring main image from ", "x", "..."));
                                        }
                                        this.f11032q = Uri.parse(string4);
                                    } else {
                                        if (t.a()) {
                                            this.f12279c.a(this.b, AbstractC2914a.c(i12, i13, "Inferring icon image from ", "x", "..."));
                                        }
                                        this.f11031p = Uri.parse(string4);
                                    }
                                } else if (t.a()) {
                                    this.f12279c.k(this.b, "Skipping...");
                                }
                            } else {
                                this.f11032q = Uri.parse(string4);
                                if (t.a()) {
                                    this.f12279c.a(this.b, "Processed main image URL: " + this.f11032q);
                                }
                            }
                        } else {
                            this.f11031p = Uri.parse(string4);
                            if (t.a()) {
                                this.f12279c.a(this.b, "Processed icon URL: " + this.f11031p);
                            }
                        }
                    } else if (jSONObject4.has(MimeTypes.BASE_TYPE_VIDEO)) {
                        String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, MimeTypes.BASE_TYPE_VIDEO, (JSONObject) null), "vasttag", null);
                        if (StringUtils.isValidString(string5)) {
                            if (t.a()) {
                                this.f12279c.a(this.b, "Processed VAST video");
                            }
                        } else if (t.a()) {
                            this.f12279c.k(this.b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                        }
                        str = string5;
                    } else if (jSONObject4.has(DataSchemeDataSource.SCHEME_DATA)) {
                        int i14 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, DataSchemeDataSource.SCHEME_DATA, (JSONObject) null);
                        int i15 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string6 = JsonUtils.getString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
                        if (i15 != 1 && i14 != 8) {
                            if (i15 != 2 && i14 != 4) {
                                if (i15 != 12 && i14 != 5) {
                                    if (i15 != 3 && i14 != 6) {
                                        if (t.a()) {
                                            this.f12279c.k(this.b, "Skipping unsupported data: " + jSONObject4);
                                        }
                                    } else {
                                        double a6 = zp.a(string6, -1.0d);
                                        if (a6 == -1.0d) {
                                            if (t.a()) {
                                                n0.s("Received invalid star rating: ", string6, this.f12279c, this.b);
                                            }
                                        } else {
                                            this.f11029n = Double.valueOf(a6);
                                            if (t.a()) {
                                                this.f12279c.a(this.b, "Processed star rating: " + this.f11029n);
                                            }
                                        }
                                    }
                                } else {
                                    this.f11030o = string6;
                                    if (t.a()) {
                                        this.f12279c.a(this.b, "Processed cta: " + this.f11030o);
                                    }
                                }
                            } else {
                                this.m = string6;
                                if (t.a()) {
                                    this.f12279c.a(this.b, "Processed body: " + this.m);
                                }
                            }
                        } else {
                            this.l = string6;
                            if (t.a()) {
                                this.f12279c.a(this.b, "Processed advertiser: " + this.l);
                            }
                        }
                    } else if (t.a()) {
                        this.f12279c.b(this.b, "Unsupported asset object: " + jSONObject4);
                    }
                }
                String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
                if (StringUtils.isValidString(string7)) {
                    this.f11039x.add(string7);
                    if (t.a()) {
                        n0.s("Processed jstracker: ", string7, this.f12279c, this.b);
                    }
                }
                JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
                if (jSONArray2 != null) {
                    for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                        Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i16, null);
                        if (objectAtIndex instanceof String) {
                            String str2 = (String) objectAtIndex;
                            if (!TextUtils.isEmpty(str2)) {
                                this.f11040y.add(new e.a(this.f12278a).b(str2).b(false).a(false).a());
                                if (t.a()) {
                                    n0.s("Processed imptracker URL: ", str2, this.f12279c, this.b);
                                }
                            }
                        }
                    }
                }
                JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
                if (jSONArray3 != null) {
                    int i17 = 0;
                    while (i17 < jSONArray3.length()) {
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i17, (JSONObject) r32);
                        int i18 = JsonUtils.getInt(jSONObject7, NotificationCompat.CATEGORY_EVENT, -1);
                        int i19 = JsonUtils.getInt(jSONObject7, "method", -1);
                        String string8 = JsonUtils.getString(jSONObject7, "url", r32);
                        if (!TextUtils.isEmpty(string8)) {
                            if (i19 != 1 && i19 != 2) {
                                if (t.a()) {
                                    this.f12279c.b(this.b, "Unsupported method for event tracker: " + jSONObject7);
                                }
                            } else if (i19 == 2 && string8.startsWith("<script")) {
                                this.f11039x.add(string8);
                            } else {
                                e.a a9 = new e.a(this.f12278a).b(string8).b(false).a(false);
                                if (i19 == 2) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                e a10 = a9.h(z8).a();
                                if (i18 == 1) {
                                    this.f11040y.add(a10);
                                    if (t.a()) {
                                        n0.s("Processed impression URL: ", string8, this.f12279c, this.b);
                                    }
                                } else if (i18 == 2) {
                                    this.f11041z.add(a10);
                                    if (t.a()) {
                                        n0.s("Processed viewable MRC50 URL: ", string8, this.f12279c, this.b);
                                    }
                                } else if (i18 == 3) {
                                    this.f11023A.add(a10);
                                    if (t.a()) {
                                        n0.s("Processed viewable MRC100 URL: ", string8, this.f12279c, this.b);
                                    }
                                } else {
                                    if (i18 == 4) {
                                        this.f11024B.add(a10);
                                        if (t.a()) {
                                            n0.s("Processed viewable video 50 URL: ", string8, this.f12279c, this.b);
                                        }
                                    } else if (i18 == 555) {
                                        if (t.a()) {
                                            n0.s("Ignoring processing of OMID URL: ", string8, this.f12279c, this.b);
                                        }
                                    } else if (t.a()) {
                                        this.f12279c.b(this.b, "Unsupported event tracker: " + jSONObject7);
                                    }
                                    i17++;
                                    r32 = 0;
                                }
                                i17++;
                                r32 = 0;
                            }
                        }
                        i17++;
                        r32 = 0;
                    }
                }
                if (StringUtils.isValidString(str)) {
                    if (t.a()) {
                        this.f12279c.a(this.b, "Processing VAST video...");
                    }
                    this.f12278a.l0().a(bn.a(str, JsonUtils.shallowCopy(this.f11025h), JsonUtils.shallowCopy(this.f11026i), this, this.f12278a));
                    return;
                }
                e();
                return;
            }
            if (t.a()) {
                this.f12279c.b(this.b, "Unable to retrieve assets - failing ad load: " + this.f11025h);
            }
            b("Unable to retrieve assets");
            return;
        }
        if (t.a()) {
            this.f12279c.b(this.b, "No oRtb response provided: " + this.f11025h);
        }
        b("No oRtb response provided");
    }

    private void e() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f11025h), JsonUtils.shallowCopy(this.f11026i), this.f12278a).setTitle(this.f11028k).setAdvertiser(this.l).setBody(this.m).setCallToAction(this.f11030o).setStarRating(this.f11029n).setIconUri(this.f11031p).setMainImageUri(this.f11032q).setPrivacyIconUri(this.f11034s).setVastAd(this.f11033r).setPrivacyDestinationUri(this.f11035t).setClickDestinationUri(this.f11036u).setClickDestinationBackupUri(this.f11037v).setClickTrackingUrls(this.f11038w).setJsTrackers(this.f11039x).setImpressionRequests(this.f11040y).setViewableMRC50Requests(this.f11041z).setViewableMRC100Requests(this.f11023A).setViewableVideo50Requests(this.f11024B).build();
        build.getAdEventTracker().e();
        if (t.a()) {
            this.f12279c.a(this.b, "Starting cache task for type: " + build.getType() + "...");
        }
        this.f12278a.l0().a((xl) new a(build, this.f12278a, this), sm.b.CORE);
    }

    private void b(String str) {
        this.f11027j.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0035a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (t.a()) {
            this.f12279c.a(this.b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
