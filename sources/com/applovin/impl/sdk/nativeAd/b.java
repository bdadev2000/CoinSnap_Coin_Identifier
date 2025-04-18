package com.applovin.impl.sdk.nativeAd;

import a4.j;
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
import h.o0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends xl implements a.InterfaceC0035a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* renamed from: h */
    private final JSONObject f7851h;

    /* renamed from: i */
    private final JSONObject f7852i;

    /* renamed from: j */
    private final AppLovinNativeAdLoadListener f7853j;

    /* renamed from: k */
    private String f7854k;

    /* renamed from: l */
    private String f7855l;

    /* renamed from: m */
    private String f7856m;

    /* renamed from: n */
    private Double f7857n;

    /* renamed from: o */
    private String f7858o;

    /* renamed from: p */
    private Uri f7859p;

    /* renamed from: q */
    private Uri f7860q;

    /* renamed from: r */
    private bq f7861r;

    /* renamed from: s */
    private Uri f7862s;

    /* renamed from: t */
    private Uri f7863t;
    private Uri u;

    /* renamed from: v */
    private Uri f7864v;

    /* renamed from: w */
    private final List f7865w;

    /* renamed from: x */
    private final List f7866x;

    /* renamed from: y */
    private final List f7867y;

    /* renamed from: z */
    private final List f7868z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f7854k = "";
        this.f7855l = "";
        this.f7856m = "";
        this.f7857n = null;
        this.f7858o = "";
        this.f7859p = null;
        this.f7860q = null;
        this.f7862s = null;
        this.f7863t = null;
        this.u = null;
        this.f7864v = null;
        this.f7865w = new ArrayList();
        this.f7866x = new ArrayList();
        this.f7867y = new ArrayList();
        this.f7868z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f7851h = jSONObject;
        this.f7852i = jSONObject2;
        this.f7853j = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.u = Uri.parse(string);
            if (t.a()) {
                this.f9061c.a(this.f9060b, "Processed click destination URL: " + this.u);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f7864v = Uri.parse(string2);
            if (t.a()) {
                this.f9061c.a(this.f9060b, "Processed click destination backup URL: " + this.f7864v);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.f7865w.addAll(JsonUtils.toList(jSONArray));
                if (t.a()) {
                    this.f9061c.a(this.f9060b, "Processed click tracking URLs: " + this.f7865w);
                }
            } catch (Throwable th2) {
                if (t.a()) {
                    this.f9061c.a(this.f9060b, "Failed to render click tracking URLs", th2);
                }
            }
        }
    }

    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (t.a()) {
            this.f9061c.a(this.f9060b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (t.a()) {
                this.f9061c.a(this.f9060b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f7853j.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th2) {
            if (t.a()) {
                this.f9061c.a(this.f9060b, "Failed to prepare native ad view components", th2);
            }
            b(th2.getMessage());
            this.a.B().a(this.f9060b, "prepareNativeComponents", th2);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new o0(20, this, appLovinNativeAdImpl));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (t.a()) {
            this.f9061c.a(this.f9060b, "VAST ad rendered successfully");
        }
        this.f7861r = (bq) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (t.a()) {
            this.f9061c.b(this.f9060b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f7851h, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f7862s = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f7851h, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f7863t = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f7851h, "ortb_response", (JSONObject) null);
        if (jSONObject != null && jSONObject.length() != 0) {
            String string3 = JsonUtils.getString(jSONObject, "version", null);
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, (JSONObject) null);
            if (t.a()) {
                j.v("Rendering native ad for oRTB version: ", string3, this.f9061c, this.f9060b);
            }
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
            a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                String str = "";
                int i10 = 0;
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r32);
                    if (jSONObject4.has(CampaignEx.JSON_KEY_TITLE)) {
                        this.f7854k = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, CampaignEx.JSON_KEY_TITLE, (JSONObject) r32), MimeTypes.BASE_TYPE_TEXT, r32);
                        if (t.a()) {
                            this.f9061c.a(this.f9060b, "Processed title: " + this.f7854k);
                        }
                    } else if (jSONObject4.has("link")) {
                        a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r32));
                    } else if (jSONObject4.has("img")) {
                        int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r32);
                        int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string4 = JsonUtils.getString(jSONObject5, "url", r32);
                        if (i12 != 1 && 3 != i11) {
                            if (i12 != 3 && 2 != i11) {
                                if (t.a()) {
                                    this.f9061c.k(this.f9060b, "Unrecognized image: " + jSONObject4);
                                }
                                int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                                int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                                if (i13 > 0 && i14 > 0) {
                                    if (i13 / i14 > 1.0d) {
                                        if (t.a()) {
                                            this.f9061c.a(this.f9060b, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Inferring main image from ", i13, "x", i14, "..."));
                                        }
                                        this.f7860q = Uri.parse(string4);
                                    } else {
                                        if (t.a()) {
                                            this.f9061c.a(this.f9060b, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Inferring icon image from ", i13, "x", i14, "..."));
                                        }
                                        this.f7859p = Uri.parse(string4);
                                    }
                                } else if (t.a()) {
                                    this.f9061c.k(this.f9060b, "Skipping...");
                                }
                            } else {
                                this.f7860q = Uri.parse(string4);
                                if (t.a()) {
                                    this.f9061c.a(this.f9060b, "Processed main image URL: " + this.f7860q);
                                }
                            }
                        } else {
                            this.f7859p = Uri.parse(string4);
                            if (t.a()) {
                                this.f9061c.a(this.f9060b, "Processed icon URL: " + this.f7859p);
                            }
                        }
                    } else if (jSONObject4.has(MimeTypes.BASE_TYPE_VIDEO)) {
                        String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, MimeTypes.BASE_TYPE_VIDEO, (JSONObject) null), "vasttag", null);
                        if (StringUtils.isValidString(string5)) {
                            if (t.a()) {
                                this.f9061c.a(this.f9060b, "Processed VAST video");
                            }
                        } else if (t.a()) {
                            this.f9061c.k(this.f9060b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                        }
                        str = string5;
                    } else if (jSONObject4.has(DataSchemeDataSource.SCHEME_DATA)) {
                        int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, DataSchemeDataSource.SCHEME_DATA, (JSONObject) null);
                        int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string6 = JsonUtils.getString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
                        if (i16 != 1 && i15 != 8) {
                            if (i16 != 2 && i15 != 4) {
                                if (i16 != 12 && i15 != 5) {
                                    if (i16 != 3 && i15 != 6) {
                                        if (t.a()) {
                                            this.f9061c.k(this.f9060b, "Skipping unsupported data: " + jSONObject4);
                                        }
                                    } else {
                                        double a = zp.a(string6, -1.0d);
                                        if (a == -1.0d) {
                                            if (t.a()) {
                                                j.v("Received invalid star rating: ", string6, this.f9061c, this.f9060b);
                                            }
                                        } else {
                                            this.f7857n = Double.valueOf(a);
                                            if (t.a()) {
                                                this.f9061c.a(this.f9060b, "Processed star rating: " + this.f7857n);
                                            }
                                        }
                                    }
                                } else {
                                    this.f7858o = string6;
                                    if (t.a()) {
                                        this.f9061c.a(this.f9060b, "Processed cta: " + this.f7858o);
                                    }
                                }
                            } else {
                                this.f7856m = string6;
                                if (t.a()) {
                                    this.f9061c.a(this.f9060b, "Processed body: " + this.f7856m);
                                }
                            }
                        } else {
                            this.f7855l = string6;
                            if (t.a()) {
                                this.f9061c.a(this.f9060b, "Processed advertiser: " + this.f7855l);
                            }
                        }
                    } else if (t.a()) {
                        this.f9061c.b(this.f9060b, "Unsupported asset object: " + jSONObject4);
                    }
                    i10++;
                    r32 = 0;
                }
                String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
                if (StringUtils.isValidString(string7)) {
                    this.f7866x.add(string7);
                    if (t.a()) {
                        j.v("Processed jstracker: ", string7, this.f9061c, this.f9060b);
                    }
                }
                Object obj = null;
                JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
                if (jSONArray2 != null) {
                    int i17 = 0;
                    while (i17 < jSONArray2.length()) {
                        Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                        if (objectAtIndex instanceof String) {
                            String str2 = (String) objectAtIndex;
                            if (!TextUtils.isEmpty(str2)) {
                                this.f7867y.add(new e.a(this.a).b(str2).b(false).a(false).a());
                                if (t.a()) {
                                    j.v("Processed imptracker URL: ", str2, this.f9061c, this.f9060b);
                                }
                            }
                        }
                        i17++;
                        obj = null;
                    }
                }
                ?? r33 = 0;
                JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
                if (jSONArray3 != null) {
                    int i18 = 0;
                    while (i18 < jSONArray3.length()) {
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r33);
                        int i19 = JsonUtils.getInt(jSONObject7, NotificationCompat.CATEGORY_EVENT, -1);
                        int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                        String string8 = JsonUtils.getString(jSONObject7, "url", r33);
                        if (!TextUtils.isEmpty(string8)) {
                            if (i20 != 1 && i20 != 2) {
                                if (t.a()) {
                                    this.f9061c.b(this.f9060b, "Unsupported method for event tracker: " + jSONObject7);
                                }
                            } else if (i20 == 2 && string8.startsWith("<script")) {
                                this.f7866x.add(string8);
                            } else {
                                boolean z10 = false;
                                e.a a10 = new e.a(this.a).b(string8).b(false).a(false);
                                if (i20 == 2) {
                                    z10 = true;
                                }
                                e a11 = a10.h(z10).a();
                                if (i19 == 1) {
                                    this.f7867y.add(a11);
                                    if (t.a()) {
                                        j.v("Processed impression URL: ", string8, this.f9061c, this.f9060b);
                                    }
                                } else if (i19 == 2) {
                                    this.f7868z.add(a11);
                                    if (t.a()) {
                                        j.v("Processed viewable MRC50 URL: ", string8, this.f9061c, this.f9060b);
                                    }
                                } else {
                                    if (i19 == 3) {
                                        this.A.add(a11);
                                        if (t.a()) {
                                            j.v("Processed viewable MRC100 URL: ", string8, this.f9061c, this.f9060b);
                                        }
                                    } else if (i19 == 4) {
                                        this.B.add(a11);
                                        if (t.a()) {
                                            j.v("Processed viewable video 50 URL: ", string8, this.f9061c, this.f9060b);
                                        }
                                    } else if (i19 == 555) {
                                        if (t.a()) {
                                            j.v("Ignoring processing of OMID URL: ", string8, this.f9061c, this.f9060b);
                                        }
                                    } else if (t.a()) {
                                        this.f9061c.b(this.f9060b, "Unsupported event tracker: " + jSONObject7);
                                    }
                                    i18++;
                                    r33 = 0;
                                }
                            }
                        }
                        i18++;
                        r33 = 0;
                    }
                }
                if (StringUtils.isValidString(str)) {
                    if (t.a()) {
                        this.f9061c.a(this.f9060b, "Processing VAST video...");
                    }
                    this.a.l0().a(bn.a(str, JsonUtils.shallowCopy(this.f7851h), JsonUtils.shallowCopy(this.f7852i), this, this.a));
                    return;
                }
                e();
                return;
            }
            if (t.a()) {
                this.f9061c.b(this.f9060b, "Unable to retrieve assets - failing ad load: " + this.f7851h);
            }
            b("Unable to retrieve assets");
            return;
        }
        if (t.a()) {
            this.f9061c.b(this.f9060b, "No oRtb response provided: " + this.f7851h);
        }
        b("No oRtb response provided");
    }

    private void e() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f7851h), JsonUtils.shallowCopy(this.f7852i), this.a).setTitle(this.f7854k).setAdvertiser(this.f7855l).setBody(this.f7856m).setCallToAction(this.f7858o).setStarRating(this.f7857n).setIconUri(this.f7859p).setMainImageUri(this.f7860q).setPrivacyIconUri(this.f7862s).setVastAd(this.f7861r).setPrivacyDestinationUri(this.f7863t).setClickDestinationUri(this.u).setClickDestinationBackupUri(this.f7864v).setClickTrackingUrls(this.f7865w).setJsTrackers(this.f7866x).setImpressionRequests(this.f7867y).setViewableMRC50Requests(this.f7868z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        build.getAdEventTracker().e();
        if (t.a()) {
            this.f9061c.a(this.f9060b, "Starting cache task for type: " + build.getType() + "...");
        }
        this.a.l0().a((xl) new a(build, this.a, this), sm.b.CORE);
    }

    private void b(String str) {
        this.f7853j.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0035a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (t.a()) {
            this.f9061c.a(this.f9060b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
