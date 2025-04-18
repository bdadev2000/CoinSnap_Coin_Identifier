package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.i;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class BrandSafetyEvent extends StatsEvent implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29776a = "click_url";
    public static final String aI = "revenue_event";
    public static final String aJ = "is_redirect";
    public static final String aK = "is_expand";
    public static final String aL = "is_auto_expand";
    public static final String aM = "redirect_url";
    public static final String aN = "redirect_request_url";
    public static final String aO = "redirect_type";
    private static final String a_ = "BrandSafetyEvent";
    public static final String ac = "max_network_name";
    public static final String ad = "network_name";
    public static final String ae = "dsp_name";
    public static final String af = "custom_js_network_name";
    public static final String ag = "is_first_session";
    public static final String ah = "event_id";
    public static final String ao = "max_creative_id";
    public static final String ap = "creative_id";
    public static final String aq = "did_fail_display_received";
    public static final String ar = "will_display_received";
    public static final String as = "is_banner_view_detected";
    public static final String at = "image_slot";
    public static final String au = "interval_between_display_messages";
    public static final String av = "detected_view_proportions";
    public static final String aw = "device_orientation";
    public static final String ay = "multi_ad_uuid";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29777b = "foreground_activity";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29778c = "impression_id";
    public static final String d = "viewing_time";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29779f = "zone_id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29780g = "app_package_name";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29781h = "dsp_domains";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29782i = "ad_format";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29783j = "ad_format_type";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29784k = "third_party_ad_placement_id";

    /* renamed from: m, reason: collision with root package name */
    public static final String f29786m = "sdk_version";

    /* renamed from: n, reason: collision with root package name */
    public static final String f29787n = "impression";

    /* renamed from: o, reason: collision with root package name */
    public static final String f29788o = "image_file_size";

    /* renamed from: p, reason: collision with root package name */
    public static final String f29789p = "image_uniformity";

    /* renamed from: q, reason: collision with root package name */
    public static final String f29790q = "image_id";

    /* renamed from: r, reason: collision with root package name */
    public static final String f29791r = "image_orientation";

    /* renamed from: s, reason: collision with root package name */
    public static final String f29792s = "is_animated";
    private static final long serialVersionUID = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final String f29793t = "is_clicked";

    /* renamed from: u, reason: collision with root package name */
    public static final String f29794u = "ad_recommendations";

    /* renamed from: v, reason: collision with root package name */
    public static final String f29795v = "is_next_session";
    private int L;
    private String M;
    private String N;
    private transient Bundle O;
    private String P;
    private String Q;
    private long R;
    private String S;
    private String T;
    private String U;
    private boolean V;
    private String W;
    private boolean X;
    private long Y;
    private float Z;
    private String aA;
    private String aB;
    private String aC;
    private String aD;
    private String aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    String aP;
    HashSet<String> aQ;
    HashSet<String> aR;
    private String aS;
    private String aT;
    private String aU;
    private boolean aV;
    private RedirectData aW;
    private int aX;
    private BrandSafetyUtils.ScreenShotOrientation aa;
    private boolean ai;
    private boolean aj;
    private int ak;
    private long al;
    private float am;
    private String an;
    public static final String e = "slot_number";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29785l = "max_ad_unit_id";
    private static final Set<String> ab = new HashSet(Arrays.asList("impression_id", StatsEvent.f29841z, "sdk_uuid", e, "ad_format_type", "zone_id", f29785l));

    /* loaded from: classes3.dex */
    public enum AdFormatType {
        INTER,
        REWARD,
        BANNER,
        LEADER,
        MREC,
        APPOPEN,
        NATIVE
    }

    public String a() {
        return this.W;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, long viewingTime, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean isAnimated, long imageFileSize, float imageUniformity, int imageSlot, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, HashSet<String> resourceUrlList, HashSet<String> dspUrlList, boolean isScarAdMobAd) {
        super(sdk, StatsCollector.EventType.BrandSafety);
        this.P = null;
        this.Q = null;
        this.V = false;
        this.W = null;
        this.X = false;
        this.aE = null;
        this.aP = null;
        this.aF = false;
        this.aG = false;
        this.aV = false;
        this.ai = false;
        this.aj = false;
        this.ak = 0;
        this.al = 0L;
        this.am = 0.0f;
        this.an = null;
        this.aH = false;
        this.aW = null;
        this.aX = 0;
        synchronized (this) {
            this.L = slotNumber;
            if (timestamp > 0) {
                this.G = k.b(timestamp);
            }
            Logger.d(a_, "BrandSafetyEvent ctor creative info: " + creativeInfo + ", isOnUiThread = " + k.c());
            this.aQ = new HashSet<>();
            this.aR = new HashSet<>();
            if (creativeInfo != null) {
                if (creativeInfo.Q().equals(sdk)) {
                    Logger.d(a_, "creative info sdk is equal to event SDK");
                    this.N = creativeInfo.G();
                    this.O = creativeInfo.d();
                    Logger.d(a_, "addedCreativeInfoValues " + this.O);
                    if (clickUrl == null) {
                        Logger.d(a_, "self click url is null, setting creative info click url");
                        clickUrl = creativeInfo.M();
                    }
                    Logger.d(a_, "webview_resource_urls removing resource urls list and dsp urls list.");
                } else {
                    Logger.d(a_, "creative info sdk != sdk. creative info sdk: " + creativeInfo.Q() + ", actual sdk: " + creativeInfo.R() + ", sdk: " + sdk);
                }
                if (resourceUrlList != null) {
                    creativeInfo.b(new ArrayList<>(resourceUrlList));
                }
                if (dspUrlList != null) {
                    creativeInfo.a(new ArrayList<>(dspUrlList));
                }
                Logger.d(a_, "webview_resource_urls setting resource urls list  = " + resourceUrlList);
                Logger.d(a_, "webview_resource_urls setting dsp urls list = " + dspUrlList);
            } else {
                boolean a2 = CreativeInfoManager.a(sdk, AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
                Logger.d(a_, "the don't report webview resource is: " + a2);
                if (!a2) {
                    if (resourceUrlList != null) {
                        this.aQ.addAll(resourceUrlList);
                    }
                    if (dspUrlList != null) {
                        this.aR.addAll(dspUrlList);
                    }
                }
                Logger.d(a_, "webview_resource_urls setting resource urls list  = " + resourceUrlList);
                Logger.d(a_, "webview_resource_urls setting dsp urls list = " + dspUrlList);
            }
            if (clickUrl != null && !clickUrl.isEmpty()) {
                clickUrl = i.a(clickUrl);
            }
            this.M = clickUrl;
            this.V = clicked;
            this.P = foregroundActivityName;
            this.Q = impressionMd5;
            this.aS = multiAdUuid;
            this.R = viewingTime;
            this.aB = maxCreativeId;
            if (applovinData != null) {
                this.S = applovinData.getString(f29785l);
                this.aA = applovinData.getString(ad);
                this.T = b(applovinData.getString("ad_format"));
                this.U = applovinData.getString(f29784k);
                this.aC = applovinData.getString("dsp_name");
                this.aD = applovinData.getString(af);
                if (maxCreativeId == null) {
                    this.aB = applovinData.getString("creative_id");
                }
            }
            this.I = isMature;
            if (creativeInfo != null) {
                this.W = hashValue;
                this.aa = screenShotOrientation;
                this.X = isAnimated;
                if (hashValue != null) {
                    this.Y = imageFileSize;
                    this.Z = imageUniformity;
                    this.ak = imageSlot;
                }
            }
            this.az = isFirstSession;
            if (eventId != null) {
                Logger.d(a_, "eventId = " + eventId);
                this.aE = eventId;
            }
            this.aF = didFailDisplayReceived;
            this.aT = debugInfo;
            this.aU = impressionLog;
            this.aP = revenueEventValue;
            this.aH = isScarAdMobAd;
            Logger.d(a_, "Revenue event value = " + revenueEventValue);
            if (creativeInfo != null && isMature) {
                creativeInfo.a((String) null, (String) null);
            }
        }
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isBannerViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> resourceUrlList, HashSet<String> dspUrlList) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, resourceUrlList, dspUrlList, isScarAdMobAd);
        this.aG = true;
        this.ai = willDisplayReceived;
        this.aj = isBannerViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
        this.aW = redirectData;
        this.aX = redirectCount;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isAdViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, (HashSet<String>) null, (HashSet<String>) null, false);
        this.aV = true;
        this.ai = willDisplayReceived;
        this.aj = isAdViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.BrandSafety;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        return this.Q;
    }

    public void d() {
        this.W = null;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized void a(StatsEvent statsEvent) {
        boolean z2 = false;
        synchronized (this) {
            BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) statsEvent;
            Logger.d(a_, "doAggregation removing resource urls list and dsp urls list. local resourceUrlList = " + this.aQ + ", isOnUiThread = " + k.c());
            this.aQ = new HashSet<>();
            this.aR = new HashSet<>();
            Bundle bundle = brandSafetyEvent.O;
            if (bundle != null) {
                Logger.d(a_, "Aggregating downstream struct. eventCreativeValues=" + bundle);
                this.O = bundle;
                this.N = brandSafetyEvent.N;
            } else {
                Logger.d(a_, "webview_resource_urls doAggregation setting resource urls list and dsp urls list.");
                if (brandSafetyEvent.aQ != null) {
                    this.aQ.addAll(brandSafetyEvent.aQ);
                }
                if (brandSafetyEvent.aR != null) {
                    this.aR.addAll(brandSafetyEvent.aR);
                }
            }
            String str = brandSafetyEvent.M;
            if (!TextUtils.isEmpty(str)) {
                this.M = str;
            }
            long j2 = statsEvent.j();
            if (j2 != 0 && j2 < this.G) {
                this.G = j2;
            }
            long j3 = brandSafetyEvent.R;
            if (j3 > 0 && j3 > this.R) {
                this.R = j3;
            }
            if (brandSafetyEvent.W != null) {
                Logger.d(a_, "doAggregation updating screenShotHashValue to '" + brandSafetyEvent.W + "' , image_file_size to " + brandSafetyEvent.Y + " and image_max_uniform_pixels to " + brandSafetyEvent.Z);
                this.W = brandSafetyEvent.W;
                this.Y = brandSafetyEvent.Y;
                this.Z = brandSafetyEvent.Z;
                this.ak = brandSafetyEvent.ak;
                BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = brandSafetyEvent.aa;
                if (screenShotOrientation != null && screenShotOrientation != BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) {
                    Logger.d(a_, "doAggregation updating screenShotOrientation to '" + screenShotOrientation + "'");
                    this.aa = screenShotOrientation;
                }
            } else {
                Logger.d(a_, "doAggregation updating image hash to null");
                this.W = null;
                this.Y = 0L;
                this.ak = 0;
                this.aa = null;
                this.Z = 0.0f;
            }
            boolean z3 = brandSafetyEvent.V;
            if (z3) {
                if (z3 && brandSafetyEvent.aS == null) {
                    z2 = true;
                }
                this.V = z2;
                Logger.d(a_, "doAggregation updating clicked to " + this.V);
            } else if (brandSafetyEvent.aS != null) {
                this.V = false;
                Logger.d(a_, "doAggregation reset clicked due to multi ad");
            }
            this.X = brandSafetyEvent.X;
            this.aB = brandSafetyEvent.aB;
            this.aS = brandSafetyEvent.aS;
            if (this.aE == null && brandSafetyEvent.aE != null) {
                this.aE = brandSafetyEvent.aE;
                Logger.d(a_, "doAggregation updating eventId to " + this.aE);
            }
            if (this.C != null && !this.C.equals(brandSafetyEvent.C) && this.O != null) {
                Logger.d(a_, "doAggregation incompatible SDK. current: " + this.C + ", new: " + brandSafetyEvent.C);
                this.O.putString(CreativeInfo.f29619g, this.O.getString(CreativeInfo.f29619g, "") + "|sdk=" + this.C + ";newSdk=" + brandSafetyEvent.C);
            }
            if (this.aP == null && brandSafetyEvent.aP != null) {
                this.aP = brandSafetyEvent.aP;
                Logger.d(a_, "doAggregation updating revenueEventValue to " + this.aP);
            }
            if (this.P == null) {
                this.P = brandSafetyEvent.P;
                Logger.d(a_, "doAggregation updating foregroundActivityName to " + this.P);
            }
            this.ai = brandSafetyEvent.ai;
            this.aj = brandSafetyEvent.aj;
            this.al = brandSafetyEvent.al;
            this.aW = brandSafetyEvent.aW;
            this.aX = brandSafetyEvent.aX;
            this.am = brandSafetyEvent.am;
            this.aT = brandSafetyEvent.aT;
            this.aU = brandSafetyEvent.aU;
            this.aF = brandSafetyEvent.aF;
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized Bundle e() {
        Bundle e2;
        e2 = super.e();
        if (this.L > 0) {
            e2.putInt(e, this.L);
        }
        if (!TextUtils.isEmpty(this.M)) {
            e2.putString(f29776a, this.M);
        }
        if (this.O != null) {
            e2.putAll(this.O);
        } else if (this.aH) {
            e2.putString(CreativeInfo.f29629q, "/scar-admob");
        } else {
            Logger.d(a_, "toBundle webview_resource_urls : dspUrlList = " + this.aR + " , resourceUrlList = " + this.aQ);
            if (this.aR != null && !this.aR.isEmpty()) {
                e2.putStringArrayList(f29781h, new ArrayList<>(this.aR));
            }
            if (this.aQ != null && !this.aQ.isEmpty()) {
                e2.putStringArrayList(CreativeInfo.f29635y, new ArrayList<>(this.aQ));
            }
        }
        if (!TextUtils.isEmpty(this.P)) {
            e2.putString("foreground_activity", this.P);
        }
        e2.putString("impression_id", this.Q);
        if (this.aS != null) {
            e2.putString(ay, this.aS);
        }
        if (this.R > 0) {
            e2.putLong(d, this.R);
        }
        if (this.S != null) {
            e2.putString(f29785l, this.S);
        }
        if (this.aA != null) {
            e2.putString(ac, this.aA);
        }
        if (this.aB != null) {
            e2.putString(ao, this.aB);
        }
        if (this.aD != null) {
            e2.putString(af, this.aD);
        }
        if (this.aC != null && !e2.containsKey(CreativeInfo.L)) {
            e2.putString(CreativeInfo.L, this.aC);
        }
        if (this.C != null) {
            if (e2.getString("ad_format_type") == null || g.f30056k.equals(this.C) || g.f30061p.equals(this.C)) {
                e2.putString("ad_format_type", this.T);
            }
            if (e2.getString("zone_id") == null || g.f30056k.equals(this.C) || g.f30061p.equals(this.C)) {
                e2.putString("zone_id", this.U);
            }
        } else {
            Logger.d(a_, "Sdk field value is null.");
        }
        if (e2.getString("ad_format_type") == null && this.aW != null && this.aW.f29336k != null) {
            e2.putString("ad_format_type", this.aW.f29336k.name());
        }
        e2.putString(StatsEvent.f29841z, "impression");
        if (this.W != null) {
            e2.putString("image_id", this.W);
            if (!this.aG && !this.aV) {
                e2.putBoolean(f29792s, this.X);
            }
            if (this.aa != null) {
                e2.putString("image_orientation", this.aa.name().toLowerCase());
            }
            e2.putLong(f29788o, this.Y);
            e2.putFloat(f29789p, this.Z);
            e2.putInt(at, this.ak);
        }
        e2.putBoolean(f29793t, this.V);
        e2.putBoolean(f29795v, this.J);
        if (!TextUtils.isEmpty(this.aT)) {
            String string = e2.getString(CreativeInfo.f29619g);
            if (string != null) {
                e2.putString(CreativeInfo.f29619g, string + ImpressionLog.P + this.aT);
            } else {
                e2.putString(CreativeInfo.f29619g, this.aT);
            }
        }
        if (!TextUtils.isEmpty(this.aU)) {
            e2.putString(CreativeInfo.an, this.aU);
        }
        if (this.aG || this.aV) {
            e2.putBoolean(ar, this.ai);
            e2.putBoolean(as, this.aj);
            if (this.aG) {
                e2.putLong(au, this.al);
            }
            if (this.am > 0.0f) {
                e2.putFloat(av, this.am);
            }
            e2.putString(aw, this.an);
            if (this.aG && this.aW != null) {
                if (this.aW.f29328a && this.aW.f29330c) {
                    e2.putBoolean(aJ, true);
                }
                if (this.aW.f29329b && !this.aW.f29330c) {
                    e2.putBoolean(aK, true);
                }
                if (this.aW.f29329b && this.aW.f29330c) {
                    e2.putBoolean(aL, true);
                }
                if (!TextUtils.isEmpty(this.aW.d)) {
                    e2.putString("redirect_url", this.aW.d);
                }
                if (!TextUtils.isEmpty(this.aW.e)) {
                    e2.putString(aN, this.aW.e);
                }
                if (!TextUtils.isEmpty(this.aW.f29331f)) {
                    e2.putString("redirect_type", this.aW.f29331f);
                }
                this.aW.a("RedirectCount=" + this.aX);
                if (!TextUtils.isEmpty(this.aW.f29333h)) {
                    String string2 = e2.getString(CreativeInfo.f29619g);
                    if (string2 != null) {
                        e2.putString(CreativeInfo.f29619g, string2 + ImpressionLog.P + this.aW.f29333h);
                    } else {
                        e2.putString(CreativeInfo.f29619g, this.aW.f29333h);
                    }
                }
            }
        }
        e2.putBoolean(ag, this.az);
        if (this.aE != null) {
            e2.putString("event_id", this.aE);
        }
        e2.putBoolean(aq, this.aF);
        if (this.aP != null) {
            e2.putString("revenue_event", this.aP);
        }
        return e2;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Set<String> f() {
        HashSet hashSet = new HashSet(ab);
        if (this.C != null && this.C.equals(g.f30053h)) {
            hashSet.add(f29776a);
        }
        return hashSet;
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.O != null) {
            objectOutputStream.writeObject(a(this.O));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        try {
            Map map = (Map) objectInputStream.readObject();
            if (map != null) {
                this.O = a((Map<String, Object>) map);
            }
        } catch (OptionalDataException e2) {
            if (e2.eof && e2.length == 0) {
                Logger.d(a_, "OptionalDataException in readObject (due to no CI object)");
            } else {
                Logger.d(a_, "OptionalDataException in readObject: eof: " + e2.eof + ", length: " + e2.length, e2);
            }
        }
    }

    private static Map<String, Object> a(Bundle bundle) {
        HashMap hashMap = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    private static Bundle a(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) obj);
            }
        }
        return bundle;
    }

    private String b(String str) {
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType called, input=" + str);
        String str2 = null;
        if (BrandSafetyUtils.f29187j.equals(str)) {
            str2 = AdFormatType.INTER.toString();
        } else if (BrandSafetyUtils.f29188k.equals(str)) {
            str2 = AdFormatType.REWARD.toString();
        } else if (BrandSafetyUtils.f29190m.equals(str) || BrandSafetyUtils.f29191n.equals(str)) {
            str2 = AdFormatType.BANNER.toString();
        } else if (BrandSafetyUtils.f29189l.equals(str)) {
            str2 = AdFormatType.APPOPEN.toString();
        } else if (BrandSafetyUtils.f29192o.equals(str)) {
            str2 = AdFormatType.MREC.toString();
        } else if ("NATIVE".equals(str)) {
            str2 = AdFormatType.NATIVE.toString();
        }
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType returned  " + str2);
        return str2;
    }

    public String g() {
        return this.aP;
    }

    public void a(String str) {
        this.aP = str;
    }
}
