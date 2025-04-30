package c7;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.ar.core.ImageMetadata;
import e8.C2228c;
import e8.C2231f;
import java.util.List;
import java.util.Map;

/* renamed from: c7.g */
/* loaded from: classes3.dex */
public final class C0628g {
    public static final C0626f Companion = new C0626f(null);
    private final String adExt;
    private final String adMarketId;
    private final String adSource;
    private final String adType;
    private final String advAppId;
    private final String bidToken;
    private final String callToActionUrl;
    private final String campaign;
    private final Boolean clickCoordinatesEnabled;
    private final String deeplinkUrl;
    private final Integer errorCode;
    private final Integer expiry;
    private final String id;
    private final String info;
    private final List<String> loadAdUrls;
    private final List<String> notification;
    private final Integer showClose;
    private final Integer showCloseIncentivized;
    private final Integer sleep;
    private final String templateId;
    private final C0648q templateSettings;
    private final String templateType;
    private final String templateURL;
    private final Integer timestamp;
    private final Map<String, List<String>> tpat;
    private final C0655u viewability;

    public C0628g() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Map) null, (String) null, (String) null, (String) null, (C0648q) null, (String) null, (String) null, (String) null, (Integer) null, (C0655u) null, (String) null, (List) null, (List) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 67108863, (G7.f) null);
    }

    public static final void write$Self(C0628g c0628g, d8.b bVar, c8.g gVar) {
        Integer num;
        Integer num2;
        G7.j.e(c0628g, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0628g.id != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, c0628g.id);
        }
        if (bVar.o(gVar) || c0628g.adType != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, c0628g.adType);
        }
        if (bVar.o(gVar) || c0628g.adSource != null) {
            bVar.u(gVar, 2, e8.k0.f20172a, c0628g.adSource);
        }
        if (bVar.o(gVar) || c0628g.campaign != null) {
            bVar.u(gVar, 3, e8.k0.f20172a, c0628g.campaign);
        }
        if (bVar.o(gVar) || c0628g.expiry != null) {
            bVar.u(gVar, 4, e8.K.f20127a, c0628g.expiry);
        }
        if (bVar.o(gVar) || c0628g.advAppId != null) {
            bVar.u(gVar, 5, e8.k0.f20172a, c0628g.advAppId);
        }
        if (bVar.o(gVar) || c0628g.callToActionUrl != null) {
            bVar.u(gVar, 6, e8.k0.f20172a, c0628g.callToActionUrl);
        }
        if (bVar.o(gVar) || c0628g.deeplinkUrl != null) {
            bVar.u(gVar, 7, e8.k0.f20172a, c0628g.deeplinkUrl);
        }
        if (bVar.o(gVar) || c0628g.clickCoordinatesEnabled != null) {
            bVar.u(gVar, 8, C2231f.f20162a, c0628g.clickCoordinatesEnabled);
        }
        if (bVar.o(gVar) || c0628g.tpat != null) {
            bVar.u(gVar, 9, r.INSTANCE, c0628g.tpat);
        }
        if (bVar.o(gVar) || c0628g.templateURL != null) {
            bVar.u(gVar, 10, e8.k0.f20172a, c0628g.templateURL);
        }
        if (bVar.o(gVar) || c0628g.templateId != null) {
            bVar.u(gVar, 11, e8.k0.f20172a, c0628g.templateId);
        }
        if (bVar.o(gVar) || c0628g.templateType != null) {
            bVar.u(gVar, 12, e8.k0.f20172a, c0628g.templateType);
        }
        if (bVar.o(gVar) || c0628g.templateSettings != null) {
            bVar.u(gVar, 13, C0644o.INSTANCE, c0628g.templateSettings);
        }
        if (bVar.o(gVar) || c0628g.bidToken != null) {
            bVar.u(gVar, 14, e8.k0.f20172a, c0628g.bidToken);
        }
        if (bVar.o(gVar) || c0628g.adMarketId != null) {
            bVar.u(gVar, 15, e8.k0.f20172a, c0628g.adMarketId);
        }
        if (bVar.o(gVar) || c0628g.info != null) {
            bVar.u(gVar, 16, e8.k0.f20172a, c0628g.info);
        }
        if (bVar.o(gVar) || c0628g.sleep != null) {
            bVar.u(gVar, 17, e8.K.f20127a, c0628g.sleep);
        }
        if (bVar.o(gVar) || c0628g.viewability != null) {
            bVar.u(gVar, 18, C0651s.INSTANCE, c0628g.viewability);
        }
        if (bVar.o(gVar) || c0628g.adExt != null) {
            bVar.u(gVar, 19, e8.k0.f20172a, c0628g.adExt);
        }
        if (bVar.o(gVar) || c0628g.notification != null) {
            bVar.u(gVar, 20, new C2228c(e8.k0.f20172a, 0), c0628g.notification);
        }
        if (bVar.o(gVar) || c0628g.loadAdUrls != null) {
            bVar.u(gVar, 21, new C2228c(e8.k0.f20172a, 0), c0628g.loadAdUrls);
        }
        if (bVar.o(gVar) || c0628g.timestamp != null) {
            bVar.u(gVar, 22, e8.K.f20127a, c0628g.timestamp);
        }
        if (bVar.o(gVar) || (num2 = c0628g.showCloseIncentivized) == null || num2.intValue() != 0) {
            bVar.u(gVar, 23, e8.K.f20127a, c0628g.showCloseIncentivized);
        }
        if (bVar.o(gVar) || (num = c0628g.showClose) == null || num.intValue() != 0) {
            bVar.u(gVar, 24, e8.K.f20127a, c0628g.showClose);
        }
        if (bVar.o(gVar) || c0628g.errorCode != null) {
            bVar.u(gVar, 25, e8.K.f20127a, c0628g.errorCode);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final Map<String, List<String>> component10() {
        return this.tpat;
    }

    public final String component11() {
        return this.templateURL;
    }

    public final String component12() {
        return this.templateId;
    }

    public final String component13() {
        return this.templateType;
    }

    public final C0648q component14() {
        return this.templateSettings;
    }

    public final String component15() {
        return this.bidToken;
    }

    public final String component16() {
        return this.adMarketId;
    }

    public final String component17() {
        return this.info;
    }

    public final Integer component18() {
        return this.sleep;
    }

    public final C0655u component19() {
        return this.viewability;
    }

    public final String component2() {
        return this.adType;
    }

    public final String component20() {
        return this.adExt;
    }

    public final List<String> component21() {
        return this.notification;
    }

    public final List<String> component22() {
        return this.loadAdUrls;
    }

    public final Integer component23() {
        return this.timestamp;
    }

    public final Integer component24() {
        return this.showCloseIncentivized;
    }

    public final Integer component25() {
        return this.showClose;
    }

    public final Integer component26() {
        return this.errorCode;
    }

    public final String component3() {
        return this.adSource;
    }

    public final String component4() {
        return this.campaign;
    }

    public final Integer component5() {
        return this.expiry;
    }

    public final String component6() {
        return this.advAppId;
    }

    public final String component7() {
        return this.callToActionUrl;
    }

    public final String component8() {
        return this.deeplinkUrl;
    }

    public final Boolean component9() {
        return this.clickCoordinatesEnabled;
    }

    public final C0628g copy(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map<String, ? extends List<String>> map, String str8, String str9, String str10, C0648q c0648q, String str11, String str12, String str13, Integer num2, C0655u c0655u, String str14, List<String> list, List<String> list2, Integer num3, Integer num4, Integer num5, Integer num6) {
        return new C0628g(str, str2, str3, str4, num, str5, str6, str7, bool, map, str8, str9, str10, c0648q, str11, str12, str13, num2, c0655u, str14, list, list2, num3, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0628g)) {
            return false;
        }
        C0628g c0628g = (C0628g) obj;
        if (G7.j.a(this.id, c0628g.id) && G7.j.a(this.adType, c0628g.adType) && G7.j.a(this.adSource, c0628g.adSource) && G7.j.a(this.campaign, c0628g.campaign) && G7.j.a(this.expiry, c0628g.expiry) && G7.j.a(this.advAppId, c0628g.advAppId) && G7.j.a(this.callToActionUrl, c0628g.callToActionUrl) && G7.j.a(this.deeplinkUrl, c0628g.deeplinkUrl) && G7.j.a(this.clickCoordinatesEnabled, c0628g.clickCoordinatesEnabled) && G7.j.a(this.tpat, c0628g.tpat) && G7.j.a(this.templateURL, c0628g.templateURL) && G7.j.a(this.templateId, c0628g.templateId) && G7.j.a(this.templateType, c0628g.templateType) && G7.j.a(this.templateSettings, c0628g.templateSettings) && G7.j.a(this.bidToken, c0628g.bidToken) && G7.j.a(this.adMarketId, c0628g.adMarketId) && G7.j.a(this.info, c0628g.info) && G7.j.a(this.sleep, c0628g.sleep) && G7.j.a(this.viewability, c0628g.viewability) && G7.j.a(this.adExt, c0628g.adExt) && G7.j.a(this.notification, c0628g.notification) && G7.j.a(this.loadAdUrls, c0628g.loadAdUrls) && G7.j.a(this.timestamp, c0628g.timestamp) && G7.j.a(this.showCloseIncentivized, c0628g.showCloseIncentivized) && G7.j.a(this.showClose, c0628g.showClose) && G7.j.a(this.errorCode, c0628g.errorCode)) {
            return true;
        }
        return false;
    }

    public final String getAdExt() {
        return this.adExt;
    }

    public final String getAdMarketId() {
        return this.adMarketId;
    }

    public final String getAdSource() {
        return this.adSource;
    }

    public final String getAdType() {
        return this.adType;
    }

    public final String getAdvAppId() {
        return this.advAppId;
    }

    public final String getBidToken() {
        return this.bidToken;
    }

    public final String getCallToActionUrl() {
        return this.callToActionUrl;
    }

    public final String getCampaign() {
        return this.campaign;
    }

    public final Boolean getClickCoordinatesEnabled() {
        return this.clickCoordinatesEnabled;
    }

    public final String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final Integer getExpiry() {
        return this.expiry;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List<String> getLoadAdUrls() {
        return this.loadAdUrls;
    }

    public final List<String> getNotification() {
        return this.notification;
    }

    public final Integer getShowClose() {
        return this.showClose;
    }

    public final Integer getShowCloseIncentivized() {
        return this.showCloseIncentivized;
    }

    public final Integer getSleep() {
        return this.sleep;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final C0648q getTemplateSettings() {
        return this.templateSettings;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final String getTemplateURL() {
        return this.templateURL;
    }

    public final Integer getTimestamp() {
        return this.timestamp;
    }

    public final Map<String, List<String>> getTpat() {
        return this.tpat;
    }

    public final C0655u getViewability() {
        return this.viewability;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        String str = this.id;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.adType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.adSource;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.campaign;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Integer num = this.expiry;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str5 = this.advAppId;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str6 = this.callToActionUrl;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.deeplinkUrl;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Boolean bool = this.clickCoordinatesEnabled;
        if (bool == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Map<String, List<String>> map = this.tpat;
        if (map == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        String str8 = this.templateURL;
        if (str8 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str8.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        String str9 = this.templateId;
        if (str9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str9.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        String str10 = this.templateType;
        if (str10 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str10.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        C0648q c0648q = this.templateSettings;
        if (c0648q == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = c0648q.hashCode();
        }
        int i23 = (i22 + hashCode14) * 31;
        String str11 = this.bidToken;
        if (str11 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str11.hashCode();
        }
        int i24 = (i23 + hashCode15) * 31;
        String str12 = this.adMarketId;
        if (str12 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str12.hashCode();
        }
        int i25 = (i24 + hashCode16) * 31;
        String str13 = this.info;
        if (str13 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str13.hashCode();
        }
        int i26 = (i25 + hashCode17) * 31;
        Integer num2 = this.sleep;
        if (num2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num2.hashCode();
        }
        int i27 = (i26 + hashCode18) * 31;
        C0655u c0655u = this.viewability;
        if (c0655u == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = c0655u.hashCode();
        }
        int i28 = (i27 + hashCode19) * 31;
        String str14 = this.adExt;
        if (str14 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str14.hashCode();
        }
        int i29 = (i28 + hashCode20) * 31;
        List<String> list = this.notification;
        if (list == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = list.hashCode();
        }
        int i30 = (i29 + hashCode21) * 31;
        List<String> list2 = this.loadAdUrls;
        if (list2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = list2.hashCode();
        }
        int i31 = (i30 + hashCode22) * 31;
        Integer num3 = this.timestamp;
        if (num3 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = num3.hashCode();
        }
        int i32 = (i31 + hashCode23) * 31;
        Integer num4 = this.showCloseIncentivized;
        if (num4 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = num4.hashCode();
        }
        int i33 = (i32 + hashCode24) * 31;
        Integer num5 = this.showClose;
        if (num5 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = num5.hashCode();
        }
        int i34 = (i33 + hashCode25) * 31;
        Integer num6 = this.errorCode;
        if (num6 != null) {
            i9 = num6.hashCode();
        }
        return i34 + i9;
    }

    public String toString() {
        return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", campaign=" + this.campaign + ", expiry=" + this.expiry + ", advAppId=" + this.advAppId + ", callToActionUrl=" + this.callToActionUrl + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", tpat=" + this.tpat + ", templateURL=" + this.templateURL + ", templateId=" + this.templateId + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", bidToken=" + this.bidToken + ", adMarketId=" + this.adMarketId + ", info=" + this.info + ", sleep=" + this.sleep + ", viewability=" + this.viewability + ", adExt=" + this.adExt + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", timestamp=" + this.timestamp + ", showCloseIncentivized=" + this.showCloseIncentivized + ", showClose=" + this.showClose + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ C0628g(int i9, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, @a8.g(with = r.class) Map map, String str8, String str9, String str10, C0648q c0648q, String str11, String str12, String str13, Integer num2, C0655u c0655u, String str14, List list, List list2, Integer num3, Integer num4, Integer num5, Integer num6, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i9 & 2) == 0) {
            this.adType = null;
        } else {
            this.adType = str2;
        }
        if ((i9 & 4) == 0) {
            this.adSource = null;
        } else {
            this.adSource = str3;
        }
        if ((i9 & 8) == 0) {
            this.campaign = null;
        } else {
            this.campaign = str4;
        }
        if ((i9 & 16) == 0) {
            this.expiry = null;
        } else {
            this.expiry = num;
        }
        if ((i9 & 32) == 0) {
            this.advAppId = null;
        } else {
            this.advAppId = str5;
        }
        if ((i9 & 64) == 0) {
            this.callToActionUrl = null;
        } else {
            this.callToActionUrl = str6;
        }
        if ((i9 & 128) == 0) {
            this.deeplinkUrl = null;
        } else {
            this.deeplinkUrl = str7;
        }
        if ((i9 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.clickCoordinatesEnabled = null;
        } else {
            this.clickCoordinatesEnabled = bool;
        }
        if ((i9 & 512) == 0) {
            this.tpat = null;
        } else {
            this.tpat = map;
        }
        if ((i9 & 1024) == 0) {
            this.templateURL = null;
        } else {
            this.templateURL = str8;
        }
        if ((i9 & 2048) == 0) {
            this.templateId = null;
        } else {
            this.templateId = str9;
        }
        if ((i9 & 4096) == 0) {
            this.templateType = null;
        } else {
            this.templateType = str10;
        }
        if ((i9 & FragmentTransaction.TRANSIT_EXIT_MASK) == 0) {
            this.templateSettings = null;
        } else {
            this.templateSettings = c0648q;
        }
        if ((i9 & 16384) == 0) {
            this.bidToken = null;
        } else {
            this.bidToken = str11;
        }
        if ((32768 & i9) == 0) {
            this.adMarketId = null;
        } else {
            this.adMarketId = str12;
        }
        if ((65536 & i9) == 0) {
            this.info = null;
        } else {
            this.info = str13;
        }
        if ((131072 & i9) == 0) {
            this.sleep = null;
        } else {
            this.sleep = num2;
        }
        if ((262144 & i9) == 0) {
            this.viewability = null;
        } else {
            this.viewability = c0655u;
        }
        if ((524288 & i9) == 0) {
            this.adExt = null;
        } else {
            this.adExt = str14;
        }
        if ((1048576 & i9) == 0) {
            this.notification = null;
        } else {
            this.notification = list;
        }
        if ((2097152 & i9) == 0) {
            this.loadAdUrls = null;
        } else {
            this.loadAdUrls = list2;
        }
        if ((4194304 & i9) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = num3;
        }
        this.showCloseIncentivized = (8388608 & i9) == 0 ? 0 : num4;
        this.showClose = (16777216 & i9) == 0 ? 0 : num5;
        if ((i9 & 33554432) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0628g(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map<String, ? extends List<String>> map, String str8, String str9, String str10, C0648q c0648q, String str11, String str12, String str13, Integer num2, C0655u c0655u, String str14, List<String> list, List<String> list2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.id = str;
        this.adType = str2;
        this.adSource = str3;
        this.campaign = str4;
        this.expiry = num;
        this.advAppId = str5;
        this.callToActionUrl = str6;
        this.deeplinkUrl = str7;
        this.clickCoordinatesEnabled = bool;
        this.tpat = map;
        this.templateURL = str8;
        this.templateId = str9;
        this.templateType = str10;
        this.templateSettings = c0648q;
        this.bidToken = str11;
        this.adMarketId = str12;
        this.info = str13;
        this.sleep = num2;
        this.viewability = c0655u;
        this.adExt = str14;
        this.notification = list;
        this.loadAdUrls = list2;
        this.timestamp = num3;
        this.showCloseIncentivized = num4;
        this.showClose = num5;
        this.errorCode = num6;
    }

    public static /* synthetic */ void getAdMarketId$annotations() {
    }

    public static /* synthetic */ void getAdvAppId$annotations() {
    }

    public static /* synthetic */ void getBidToken$annotations() {
    }

    public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
    }

    public static /* synthetic */ void getErrorCode$annotations() {
    }

    public static /* synthetic */ void getLoadAdUrls$annotations() {
    }

    public static /* synthetic */ void getTemplateType$annotations() {
    }

    @a8.g(with = r.class)
    public static /* synthetic */ void getTpat$annotations() {
    }

    public /* synthetic */ C0628g(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map map, String str8, String str9, String str10, C0648q c0648q, String str11, String str12, String str13, Integer num2, C0655u c0655u, String str14, List list, List list2, Integer num3, Integer num4, Integer num5, Integer num6, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : str3, (i9 & 8) != 0 ? null : str4, (i9 & 16) != 0 ? null : num, (i9 & 32) != 0 ? null : str5, (i9 & 64) != 0 ? null : str6, (i9 & 128) != 0 ? null : str7, (i9 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool, (i9 & 512) != 0 ? null : map, (i9 & 1024) != 0 ? null : str8, (i9 & 2048) != 0 ? null : str9, (i9 & 4096) != 0 ? null : str10, (i9 & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? null : c0648q, (i9 & 16384) != 0 ? null : str11, (i9 & 32768) != 0 ? null : str12, (i9 & 65536) != 0 ? null : str13, (i9 & 131072) != 0 ? null : num2, (i9 & 262144) != 0 ? null : c0655u, (i9 & ImageMetadata.LENS_APERTURE) != 0 ? null : str14, (i9 & 1048576) != 0 ? null : list, (i9 & 2097152) != 0 ? null : list2, (i9 & 4194304) != 0 ? null : num3, (i9 & 8388608) != 0 ? 0 : num4, (i9 & 16777216) != 0 ? 0 : num5, (i9 & 33554432) != 0 ? null : num6);
    }
}
