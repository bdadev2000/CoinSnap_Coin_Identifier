package com.glority.analysis.bean;

import com.glority.repository.AnalysisRepository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrackingMessageBean.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u0019\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003Ju\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0005HÖ\u0001J\t\u00107\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013¨\u00068"}, d2 = {"Lcom/glority/analysis/bean/Payload;", "", "user_id", "", "device_type", "", "device_token", "", "app_version", "sdk_version", "vip_type", "from", "event_params", "", "product_id", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getApp_version", "()Ljava/lang/String;", "setApp_version", "(Ljava/lang/String;)V", "getDevice_token", "setDevice_token", "getDevice_type", "()I", "setDevice_type", "(I)V", "getEvent_params", "()Ljava/util/Map;", "setEvent_params", "(Ljava/util/Map;)V", "getFrom", "setFrom", "getProduct_id", "getSdk_version", "setSdk_version", "getUser_id", "()J", "setUser_id", "(J)V", "getVip_type", "setVip_type", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class Payload {
    private String app_version;
    private String device_token;
    private int device_type;
    private Map<String, ? extends Object> event_params;
    private String from;
    private final String product_id;
    private String sdk_version;
    private long user_id;
    private String vip_type;

    /* renamed from: component1, reason: from getter */
    public final long getUser_id() {
        return this.user_id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDevice_type() {
        return this.device_type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDevice_token() {
        return this.device_token;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSdk_version() {
        return this.sdk_version;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVip_type() {
        return this.vip_type;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    public final Map<String, Object> component8() {
        return this.event_params;
    }

    /* renamed from: component9, reason: from getter */
    public final String getProduct_id() {
        return this.product_id;
    }

    public final Payload copy(long user_id, int device_type, String device_token, String app_version, String sdk_version, String vip_type, String from, Map<String, ? extends Object> event_params, String product_id) {
        Intrinsics.checkNotNullParameter(device_token, "device_token");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(sdk_version, "sdk_version");
        Intrinsics.checkNotNullParameter(vip_type, "vip_type");
        Intrinsics.checkNotNullParameter(from, "from");
        return new Payload(user_id, device_type, device_token, app_version, sdk_version, vip_type, from, event_params, product_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) other;
        return this.user_id == payload.user_id && this.device_type == payload.device_type && Intrinsics.areEqual(this.device_token, payload.device_token) && Intrinsics.areEqual(this.app_version, payload.app_version) && Intrinsics.areEqual(this.sdk_version, payload.sdk_version) && Intrinsics.areEqual(this.vip_type, payload.vip_type) && Intrinsics.areEqual(this.from, payload.from) && Intrinsics.areEqual(this.event_params, payload.event_params) && Intrinsics.areEqual(this.product_id, payload.product_id);
    }

    public int hashCode() {
        long j = this.user_id;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.device_type) * 31;
        String str = this.device_token;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.app_version;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sdk_version;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.vip_type;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.from;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.event_params;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str6 = this.product_id;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "Payload(user_id=" + this.user_id + ", device_type=" + this.device_type + ", device_token=" + this.device_token + ", app_version=" + this.app_version + ", sdk_version=" + this.sdk_version + ", vip_type=" + this.vip_type + ", from=" + this.from + ", event_params=" + this.event_params + ", product_id=" + this.product_id + ")";
    }

    public Payload(long j, int i, String device_token, String app_version, String sdk_version, String vip_type, String from, Map<String, ? extends Object> map, String str) {
        Intrinsics.checkNotNullParameter(device_token, "device_token");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(sdk_version, "sdk_version");
        Intrinsics.checkNotNullParameter(vip_type, "vip_type");
        Intrinsics.checkNotNullParameter(from, "from");
        this.user_id = j;
        this.device_type = i;
        this.device_token = device_token;
        this.app_version = app_version;
        this.sdk_version = sdk_version;
        this.vip_type = vip_type;
        this.from = from;
        this.event_params = map;
        this.product_id = str;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final String getDevice_token() {
        return this.device_token;
    }

    public final int getDevice_type() {
        return this.device_type;
    }

    public final long getUser_id() {
        return this.user_id;
    }

    public final void setApp_version(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_version = str;
    }

    public final void setDevice_token(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device_token = str;
    }

    public final void setDevice_type(int i) {
        this.device_type = i;
    }

    public final void setUser_id(long j) {
        this.user_id = j;
    }

    public final Map<String, Object> getEvent_params() {
        return this.event_params;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getSdk_version() {
        return this.sdk_version;
    }

    public final String getVip_type() {
        return this.vip_type;
    }

    public final void setEvent_params(Map<String, ? extends Object> map) {
        this.event_params = map;
    }

    public final void setFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    public final void setSdk_version(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sdk_version = str;
    }

    public final void setVip_type(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vip_type = str;
    }

    public /* synthetic */ Payload(long j, int i, String str, String str2, String str3, String str4, String str5, Map map, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, str2, str3, str4, str5, map, (i2 & 256) != 0 ? AnalysisRepository.INSTANCE.getPRODUCT_ID() : str6);
    }

    public final String getProduct_id() {
        return this.product_id;
    }
}
