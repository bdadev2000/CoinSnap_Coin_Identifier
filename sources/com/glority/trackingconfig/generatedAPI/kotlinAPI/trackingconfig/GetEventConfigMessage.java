package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.enums.TrackingChannel;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetEventConfigMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001LB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010-\u001a\u00020\u0007H\u0016J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\u0005HÄ\u0003J\t\u00101\u001a\u00020\u0007HÄ\u0003J\t\u00102\u001a\u00020\tHÄ\u0003J\t\u00103\u001a\u00020\u0007HÄ\u0003J1\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u00105\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u00020/H\u0016J\u0014\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020;0:H\u0016J\u0014\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002070:H\u0016J\b\u0010=\u001a\u00020\u0011H\u0016J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070?H\u0016¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020/H\u0016J\b\u0010B\u001a\u00020/H\u0016J\u0012\u0010C\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020F2\u0006\u0010J\u001a\u00020KH\u0016R\u001a\u0010\n\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010$\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006M"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventConfigMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "deviceType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "productId", "", "trackingChannel", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/TrackingChannel;", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;Ljava/lang/String;Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/TrackingChannel;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "batchLimit", "", "getBatchLimit", "()I", "setBatchLimit", "(I)V", "blackListEvents", "", "getBlackListEvents", "()Ljava/util/List;", "setBlackListEvents", "(Ljava/util/List;)V", "getDeviceType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "setDeviceType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;)V", "events", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventConfig;", "getEvents", "setEvents", "interval", "getInterval", "setInterval", "getProductId", "setProductId", "getTrackingChannel", "()Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/TrackingChannel;", "setTrackingChannel", "(Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/TrackingChannel;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class GetEventConfigMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String appVersion;
    private int batchLimit;
    private List<String> blackListEvents;
    private DeviceType deviceType;
    public List<EventConfig> events;
    private int interval;
    private String productId;
    private TrackingChannel trackingChannel;

    public static /* synthetic */ GetEventConfigMessage copy$default(GetEventConfigMessage getEventConfigMessage, DeviceType deviceType, String str, TrackingChannel trackingChannel, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceType = getEventConfigMessage.deviceType;
        }
        if ((i & 2) != 0) {
            str = getEventConfigMessage.productId;
        }
        if ((i & 4) != 0) {
            trackingChannel = getEventConfigMessage.trackingChannel;
        }
        if ((i & 8) != 0) {
            str2 = getEventConfigMessage.appVersion;
        }
        return getEventConfigMessage.copy(deviceType, str, trackingChannel, str2);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getProductId() {
        return this.productId;
    }

    /* renamed from: component3, reason: from getter */
    protected final TrackingChannel getTrackingChannel() {
        return this.trackingChannel;
    }

    /* renamed from: component4, reason: from getter */
    protected final String getAppVersion() {
        return this.appVersion;
    }

    public final GetEventConfigMessage copy(DeviceType deviceType, String productId, TrackingChannel trackingChannel, String appVersion) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(trackingChannel, "trackingChannel");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new GetEventConfigMessage(deviceType, productId, trackingChannel, appVersion);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return false;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return false;
    }

    public String toString() {
        return "GetEventConfigMessage(deviceType=" + this.deviceType + ", productId=" + this.productId + ", trackingChannel=" + this.trackingChannel + ", appVersion=" + this.appVersion + ")";
    }

    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    protected final void setDeviceType(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "<set-?>");
        this.deviceType = deviceType;
    }

    protected final String getProductId() {
        return this.productId;
    }

    protected final void setProductId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }

    protected final TrackingChannel getTrackingChannel() {
        return this.trackingChannel;
    }

    protected final void setTrackingChannel(TrackingChannel trackingChannel) {
        Intrinsics.checkNotNullParameter(trackingChannel, "<set-?>");
        this.trackingChannel = trackingChannel;
    }

    protected final String getAppVersion() {
        return this.appVersion;
    }

    protected final void setAppVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public GetEventConfigMessage(DeviceType deviceType, String productId, TrackingChannel trackingChannel, String appVersion) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(trackingChannel, "trackingChannel");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.deviceType = deviceType;
        this.productId = productId;
        this.trackingChannel = trackingChannel;
        this.appVersion = appVersion;
    }

    public final int getBatchLimit() {
        return this.batchLimit;
    }

    public final void setBatchLimit(int i) {
        this.batchLimit = i;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final List<EventConfig> getEvents() {
        List<EventConfig> list = this.events;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        return list;
    }

    public final void setEvents(List<EventConfig> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.events = list;
    }

    public final List<String> getBlackListEvents() {
        return this.blackListEvents;
    }

    public final void setBlackListEvents(List<String> list) {
        this.blackListEvents = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("batchLimit") && !obj.isNull("batchLimit")) {
            this.batchLimit = obj.getInt("batchLimit");
            if (obj.has("interval") && !obj.isNull("interval")) {
                this.interval = obj.getInt("interval");
                if (obj.has("events") && !obj.isNull("events")) {
                    JSONArray jSONArray = obj.getJSONArray("events");
                    this.events = new ArrayList();
                    int length = jSONArray.length() - 1;
                    int i = 0;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            Object obj2 = jSONArray.get(i2);
                            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                                obj2 = new JSONObject();
                            }
                            if (obj2 != null) {
                                EventConfig eventConfig = new EventConfig((JSONObject) obj2);
                                List<EventConfig> list = this.events;
                                if (list == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("events");
                                }
                                Intrinsics.checkNotNull(list);
                                list.add(eventConfig);
                                if (i2 == length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                            }
                        }
                    }
                    if (obj.has("blackListEvents") && !obj.isNull("blackListEvents")) {
                        JSONArray jSONArray2 = obj.getJSONArray("blackListEvents");
                        this.blackListEvents = new ArrayList();
                        int length2 = jSONArray2.length() - 1;
                        if (length2 >= 0) {
                            while (true) {
                                String string = jSONArray2.getString(i);
                                Intrinsics.checkNotNullExpressionValue(string, "__blackListEvents.getString(i0)");
                                List<String> list2 = this.blackListEvents;
                                Intrinsics.checkNotNull(list2);
                                list2.add(string);
                                if (i == length2) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        this.blackListEvents = null;
                    }
                    this._response_at = new Date();
                    return;
                }
                throw new ParameterCheckFailException("events is missing in api GetEventConfig");
            }
            throw new ParameterCheckFailException("interval is missing in api GetEventConfig");
        }
        throw new ParameterCheckFailException("batchLimit is missing in api GetEventConfig");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("deviceType", Integer.valueOf(this.deviceType.getValue()));
        hashMap.put("productId", this.productId);
        hashMap.put("trackingChannel", Integer.valueOf(this.trackingChannel.getValue()));
        hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, this.appVersion);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetEventConfigMessage)) {
            return false;
        }
        GetEventConfigMessage getEventConfigMessage = (GetEventConfigMessage) other;
        return this.deviceType == getEventConfigMessage.deviceType && !(Intrinsics.areEqual(this.productId, getEventConfigMessage.productId) ^ true) && this.trackingChannel == getEventConfigMessage.trackingChannel && !(Intrinsics.areEqual(this.appVersion, getEventConfigMessage.appVersion) ^ true);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{"post", LogEvents.exportemptyalert_close_click_type_get};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof GetEventConfigMessage)) {
            return false;
        }
        GetEventConfigMessage getEventConfigMessage = (GetEventConfigMessage) other;
        if (this.deviceType != getEventConfigMessage.deviceType || (!Intrinsics.areEqual(this.productId, getEventConfigMessage.productId)) || this.trackingChannel != getEventConfigMessage.trackingChannel || (!Intrinsics.areEqual(this.appVersion, getEventConfigMessage.appVersion)) || this.batchLimit != getEventConfigMessage.batchLimit || this.interval != getEventConfigMessage.interval) {
            return false;
        }
        List<EventConfig> list = this.events;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        List<EventConfig> list2 = getEventConfigMessage.events;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        return ((Intrinsics.areEqual(list, list2) ^ true) || (Intrinsics.areEqual(this.blackListEvents, getEventConfigMessage.blackListEvents) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = ((((((((((((getClass().hashCode() * 31) + this.deviceType.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.trackingChannel.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + Integer.valueOf(this.batchLimit).hashCode()) * 31) + Integer.valueOf(this.interval).hashCode()) * 31;
        List<EventConfig> list = this.events;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        int hashCode2 = (hashCode + list.hashCode()) * 31;
        List<String> list2 = this.blackListEvents;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    /* compiled from: GetEventConfigMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventConfigMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v1/trackingconfig/get_event_config";
        }
    }
}
