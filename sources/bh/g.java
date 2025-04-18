package bh;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public final class g {
    public static final f Companion = new f(null);
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

    /* renamed from: id, reason: collision with root package name */
    private final String f2434id;
    private final String info;
    private final List<String> loadAdUrls;
    private final List<String> notification;
    private final Integer showClose;
    private final Integer showCloseIncentivized;
    private final Integer sleep;
    private final String templateId;
    private final q templateSettings;
    private final String templateType;
    private final String templateURL;
    private final Integer timestamp;
    private final Map<String, List<String>> tpat;
    private final u viewability;

    public g() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Map) null, (String) null, (String) null, (String) null, (q) null, (String) null, (String) null, (String) null, (Integer) null, (u) null, (String) null, (List) null, (List) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 67108863, (DefaultConstructorMarker) null);
    }

    @SerialName("ad_market_id")
    public static /* synthetic */ void getAdMarketId$annotations() {
    }

    @SerialName(MBridgeConstans.APP_ID)
    public static /* synthetic */ void getAdvAppId$annotations() {
    }

    @SerialName("bid_token")
    public static /* synthetic */ void getBidToken$annotations() {
    }

    @SerialName("click_coordinates_enabled")
    public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
    }

    @SerialName("error_code")
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @SerialName("load_ad")
    public static /* synthetic */ void getLoadAdUrls$annotations() {
    }

    @SerialName("template_type")
    public static /* synthetic */ void getTemplateType$annotations() {
    }

    @Serializable(with = r.class)
    public static /* synthetic */ void getTpat$annotations() {
    }

    @JvmStatic
    public static final void write$Self(g self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        Integer num;
        boolean z33;
        Integer num2;
        boolean z34;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z35 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f2434id != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.f2434id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adType != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.adType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adSource != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.adSource);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.campaign != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.campaign);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.expiry != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.expiry);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.advAppId != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.advAppId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.callToActionUrl != null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.callToActionUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.deeplinkUrl != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.deeplinkUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.clickCoordinatesEnabled != null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.clickCoordinatesEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.tpat != null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z19) {
            output.encodeNullableSerializableElement(serialDesc, 9, r.INSTANCE, self.tpat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.templateURL != null) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (z20) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.templateURL);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.templateId != null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (z21) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.templateId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.templateType != null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z22) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.templateType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.templateSettings != null) {
            z23 = true;
        } else {
            z23 = false;
        }
        if (z23) {
            output.encodeNullableSerializableElement(serialDesc, 13, o.INSTANCE, self.templateSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.bidToken != null) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (z24) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.bidToken);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.adMarketId != null) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (z25) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.adMarketId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.info != null) {
            z26 = true;
        } else {
            z26 = false;
        }
        if (z26) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.info);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.sleep != null) {
            z27 = true;
        } else {
            z27 = false;
        }
        if (z27) {
            output.encodeNullableSerializableElement(serialDesc, 17, IntSerializer.INSTANCE, self.sleep);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.viewability != null) {
            z28 = true;
        } else {
            z28 = false;
        }
        if (z28) {
            output.encodeNullableSerializableElement(serialDesc, 18, s.INSTANCE, self.viewability);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.adExt != null) {
            z29 = true;
        } else {
            z29 = false;
        }
        if (z29) {
            output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.adExt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.notification != null) {
            z30 = true;
        } else {
            z30 = false;
        }
        if (z30) {
            output.encodeNullableSerializableElement(serialDesc, 20, new ArrayListSerializer(StringSerializer.INSTANCE), self.notification);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.loadAdUrls != null) {
            z31 = true;
        } else {
            z31 = false;
        }
        if (z31) {
            output.encodeNullableSerializableElement(serialDesc, 21, new ArrayListSerializer(StringSerializer.INSTANCE), self.loadAdUrls);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.timestamp != null) {
            z32 = true;
        } else {
            z32 = false;
        }
        if (z32) {
            output.encodeNullableSerializableElement(serialDesc, 22, IntSerializer.INSTANCE, self.timestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || (num = self.showCloseIncentivized) == null || num.intValue() != 0) {
            z33 = true;
        } else {
            z33 = false;
        }
        if (z33) {
            output.encodeNullableSerializableElement(serialDesc, 23, IntSerializer.INSTANCE, self.showCloseIncentivized);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || (num2 = self.showClose) == null || num2.intValue() != 0) {
            z34 = true;
        } else {
            z34 = false;
        }
        if (z34) {
            output.encodeNullableSerializableElement(serialDesc, 24, IntSerializer.INSTANCE, self.showClose);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || self.errorCode != null) {
            z35 = true;
        }
        if (z35) {
            output.encodeNullableSerializableElement(serialDesc, 25, IntSerializer.INSTANCE, self.errorCode);
        }
    }

    public final String component1() {
        return this.f2434id;
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

    public final q component14() {
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

    public final u component19() {
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

    public final g copy(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map<String, ? extends List<String>> map, String str8, String str9, String str10, q qVar, String str11, String str12, String str13, Integer num2, u uVar, String str14, List<String> list, List<String> list2, Integer num3, Integer num4, Integer num5, Integer num6) {
        return new g(str, str2, str3, str4, num, str5, str6, str7, bool, map, str8, str9, str10, qVar, str11, str12, str13, num2, uVar, str14, list, list2, num3, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f2434id, gVar.f2434id) && Intrinsics.areEqual(this.adType, gVar.adType) && Intrinsics.areEqual(this.adSource, gVar.adSource) && Intrinsics.areEqual(this.campaign, gVar.campaign) && Intrinsics.areEqual(this.expiry, gVar.expiry) && Intrinsics.areEqual(this.advAppId, gVar.advAppId) && Intrinsics.areEqual(this.callToActionUrl, gVar.callToActionUrl) && Intrinsics.areEqual(this.deeplinkUrl, gVar.deeplinkUrl) && Intrinsics.areEqual(this.clickCoordinatesEnabled, gVar.clickCoordinatesEnabled) && Intrinsics.areEqual(this.tpat, gVar.tpat) && Intrinsics.areEqual(this.templateURL, gVar.templateURL) && Intrinsics.areEqual(this.templateId, gVar.templateId) && Intrinsics.areEqual(this.templateType, gVar.templateType) && Intrinsics.areEqual(this.templateSettings, gVar.templateSettings) && Intrinsics.areEqual(this.bidToken, gVar.bidToken) && Intrinsics.areEqual(this.adMarketId, gVar.adMarketId) && Intrinsics.areEqual(this.info, gVar.info) && Intrinsics.areEqual(this.sleep, gVar.sleep) && Intrinsics.areEqual(this.viewability, gVar.viewability) && Intrinsics.areEqual(this.adExt, gVar.adExt) && Intrinsics.areEqual(this.notification, gVar.notification) && Intrinsics.areEqual(this.loadAdUrls, gVar.loadAdUrls) && Intrinsics.areEqual(this.timestamp, gVar.timestamp) && Intrinsics.areEqual(this.showCloseIncentivized, gVar.showCloseIncentivized) && Intrinsics.areEqual(this.showClose, gVar.showClose) && Intrinsics.areEqual(this.errorCode, gVar.errorCode);
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
        return this.f2434id;
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

    public final q getTemplateSettings() {
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

    public final u getViewability() {
        return this.viewability;
    }

    public int hashCode() {
        String str = this.f2434id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adSource;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.campaign;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.expiry;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.advAppId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.callToActionUrl;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deeplinkUrl;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.clickCoordinatesEnabled;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, List<String>> map = this.tpat;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.templateURL;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.templateId;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.templateType;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        q qVar = this.templateSettings;
        int hashCode14 = (hashCode13 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str11 = this.bidToken;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.adMarketId;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.info;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num2 = this.sleep;
        int hashCode18 = (hashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        u uVar = this.viewability;
        int hashCode19 = (hashCode18 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str14 = this.adExt;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<String> list = this.notification;
        int hashCode21 = (hashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.loadAdUrls;
        int hashCode22 = (hashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.timestamp;
        int hashCode23 = (hashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.showCloseIncentivized;
        int hashCode24 = (hashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.showClose;
        int hashCode25 = (hashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.errorCode;
        return hashCode25 + (num6 != null ? num6.hashCode() : 0);
    }

    public String toString() {
        return "AdUnit(id=" + this.f2434id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", campaign=" + this.campaign + ", expiry=" + this.expiry + ", advAppId=" + this.advAppId + ", callToActionUrl=" + this.callToActionUrl + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", tpat=" + this.tpat + ", templateURL=" + this.templateURL + ", templateId=" + this.templateId + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", bidToken=" + this.bidToken + ", adMarketId=" + this.adMarketId + ", info=" + this.info + ", sleep=" + this.sleep + ", viewability=" + this.viewability + ", adExt=" + this.adExt + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", timestamp=" + this.timestamp + ", showCloseIncentivized=" + this.showCloseIncentivized + ", showClose=" + this.showClose + ", errorCode=" + this.errorCode + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map<String, ? extends List<String>> map, String str8, String str9, String str10, q qVar, String str11, String str12, String str13, Integer num2, u uVar, String str14, List<String> list, List<String> list2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.f2434id = str;
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
        this.templateSettings = qVar;
        this.bidToken = str11;
        this.adMarketId = str12;
        this.info = str13;
        this.sleep = num2;
        this.viewability = uVar;
        this.adExt = str14;
        this.notification = list;
        this.loadAdUrls = list2;
        this.timestamp = num3;
        this.showCloseIncentivized = num4;
        this.showClose = num5;
        this.errorCode = num6;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ g(int i10, String str, String str2, String str3, String str4, Integer num, @SerialName("app_id") String str5, String str6, String str7, @SerialName("click_coordinates_enabled") Boolean bool, @Serializable(with = r.class) Map map, String str8, String str9, @SerialName("template_type") String str10, q qVar, @SerialName("bid_token") String str11, @SerialName("ad_market_id") String str12, String str13, Integer num2, u uVar, String str14, List list, @SerialName("load_ad") List list2, Integer num3, Integer num4, Integer num5, @SerialName("error_code") Integer num6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, e.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f2434id = null;
        } else {
            this.f2434id = str;
        }
        if ((i10 & 2) == 0) {
            this.adType = null;
        } else {
            this.adType = str2;
        }
        if ((i10 & 4) == 0) {
            this.adSource = null;
        } else {
            this.adSource = str3;
        }
        if ((i10 & 8) == 0) {
            this.campaign = null;
        } else {
            this.campaign = str4;
        }
        if ((i10 & 16) == 0) {
            this.expiry = null;
        } else {
            this.expiry = num;
        }
        if ((i10 & 32) == 0) {
            this.advAppId = null;
        } else {
            this.advAppId = str5;
        }
        if ((i10 & 64) == 0) {
            this.callToActionUrl = null;
        } else {
            this.callToActionUrl = str6;
        }
        if ((i10 & 128) == 0) {
            this.deeplinkUrl = null;
        } else {
            this.deeplinkUrl = str7;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.clickCoordinatesEnabled = null;
        } else {
            this.clickCoordinatesEnabled = bool;
        }
        if ((i10 & 512) == 0) {
            this.tpat = null;
        } else {
            this.tpat = map;
        }
        if ((i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
            this.templateURL = null;
        } else {
            this.templateURL = str8;
        }
        if ((i10 & 2048) == 0) {
            this.templateId = null;
        } else {
            this.templateId = str9;
        }
        if ((i10 & 4096) == 0) {
            this.templateType = null;
        } else {
            this.templateType = str10;
        }
        if ((i10 & 8192) == 0) {
            this.templateSettings = null;
        } else {
            this.templateSettings = qVar;
        }
        if ((i10 & JsonLexerKt.BATCH_SIZE) == 0) {
            this.bidToken = null;
        } else {
            this.bidToken = str11;
        }
        if ((32768 & i10) == 0) {
            this.adMarketId = null;
        } else {
            this.adMarketId = str12;
        }
        if ((65536 & i10) == 0) {
            this.info = null;
        } else {
            this.info = str13;
        }
        if ((131072 & i10) == 0) {
            this.sleep = null;
        } else {
            this.sleep = num2;
        }
        if ((262144 & i10) == 0) {
            this.viewability = null;
        } else {
            this.viewability = uVar;
        }
        if ((524288 & i10) == 0) {
            this.adExt = null;
        } else {
            this.adExt = str14;
        }
        if ((1048576 & i10) == 0) {
            this.notification = null;
        } else {
            this.notification = list;
        }
        if ((2097152 & i10) == 0) {
            this.loadAdUrls = null;
        } else {
            this.loadAdUrls = list2;
        }
        if ((4194304 & i10) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = num3;
        }
        if ((8388608 & i10) == 0) {
            this.showCloseIncentivized = 0;
        } else {
            this.showCloseIncentivized = num4;
        }
        if ((16777216 & i10) == 0) {
            this.showClose = 0;
        } else {
            this.showClose = num5;
        }
        if ((i10 & 33554432) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num6;
        }
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map map, String str8, String str9, String str10, q qVar, String str11, String str12, String str13, Integer num2, u uVar, String str14, List list, List list2, Integer num3, Integer num4, Integer num5, Integer num6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool, (i10 & 512) != 0 ? null : map, (i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : str8, (i10 & 2048) != 0 ? null : str9, (i10 & 4096) != 0 ? null : str10, (i10 & 8192) != 0 ? null : qVar, (i10 & JsonLexerKt.BATCH_SIZE) != 0 ? null : str11, (i10 & 32768) != 0 ? null : str12, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str13, (i10 & 131072) != 0 ? null : num2, (i10 & 262144) != 0 ? null : uVar, (i10 & 524288) != 0 ? null : str14, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list, (i10 & 2097152) != 0 ? null : list2, (i10 & 4194304) != 0 ? null : num3, (i10 & 8388608) != 0 ? 0 : num4, (i10 & 16777216) != 0 ? 0 : num5, (i10 & 33554432) != 0 ? null : num6);
    }
}
