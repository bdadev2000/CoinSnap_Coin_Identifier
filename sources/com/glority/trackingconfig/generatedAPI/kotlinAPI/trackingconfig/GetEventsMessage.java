package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
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

/* compiled from: GetEventsMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB3\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\bH\u0016J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÄ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÄ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\bHÄ\u0003¢\u0006\u0002\u0010\u000eJ\t\u00100\u001a\u00020\nHÄ\u0003J\t\u00101\u001a\u00020\nHÄ\u0003JF\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000106H\u0096\u0002J\b\u00107\u001a\u00020\bH\u0016J\u0014\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:09H\u0016J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020609H\u0016J\b\u0010<\u001a\u00020\nH\u0016J\u0013\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050>H\u0016¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\bH\u0016J\b\u0010A\u001a\u00020\bH\u0016J\u0012\u0010B\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020JH\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015¨\u0006L"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventsMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "eventName", "", "productId", "enable", "", "pageSize", "", "pageNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;II)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "events", "", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Event;", "getEvents", "()Ljava/util/List;", "setEvents", "(Ljava/util/List;)V", "pageInfo", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/PageInfo;", "getPageInfo", "()Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/PageInfo;", "setPageInfo", "(Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/PageInfo;)V", "getPageNo", "()I", "setPageNo", "(I)V", "getPageSize", "setPageSize", "getProductId", "setProductId", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;II)Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventsMessage;", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class GetEventsMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Boolean enable;
    private String eventName;
    public List<Event> events;
    public PageInfo pageInfo;
    private int pageNo;
    private int pageSize;
    private String productId;

    public static /* synthetic */ GetEventsMessage copy$default(GetEventsMessage getEventsMessage, String str, String str2, Boolean bool, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getEventsMessage.eventName;
        }
        if ((i3 & 2) != 0) {
            str2 = getEventsMessage.productId;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            bool = getEventsMessage.enable;
        }
        Boolean bool2 = bool;
        if ((i3 & 8) != 0) {
            i = getEventsMessage.pageSize;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = getEventsMessage.pageNo;
        }
        return getEventsMessage.copy(str, str3, bool2, i4, i2);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getProductId() {
        return this.productId;
    }

    /* renamed from: component3, reason: from getter */
    protected final Boolean getEnable() {
        return this.enable;
    }

    /* renamed from: component4, reason: from getter */
    protected final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: component5, reason: from getter */
    protected final int getPageNo() {
        return this.pageNo;
    }

    public final GetEventsMessage copy(String eventName, String productId, Boolean enable, int pageSize, int pageNo) {
        return new GetEventsMessage(eventName, productId, enable, pageSize, pageNo);
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
        return "GetEventsMessage(eventName=" + this.eventName + ", productId=" + this.productId + ", enable=" + this.enable + ", pageSize=" + this.pageSize + ", pageNo=" + this.pageNo + ")";
    }

    protected final String getEventName() {
        return this.eventName;
    }

    protected final void setEventName(String str) {
        this.eventName = str;
    }

    protected final String getProductId() {
        return this.productId;
    }

    protected final void setProductId(String str) {
        this.productId = str;
    }

    protected final Boolean getEnable() {
        return this.enable;
    }

    protected final void setEnable(Boolean bool) {
        this.enable = bool;
    }

    protected final int getPageSize() {
        return this.pageSize;
    }

    protected final void setPageSize(int i) {
        this.pageSize = i;
    }

    protected final int getPageNo() {
        return this.pageNo;
    }

    protected final void setPageNo(int i) {
        this.pageNo = i;
    }

    public GetEventsMessage(String str, String str2, Boolean bool, int i, int i2) {
        this.eventName = str;
        this.productId = str2;
        this.enable = bool;
        this.pageSize = i;
        this.pageNo = i2;
    }

    public final List<Event> getEvents() {
        List<Event> list = this.events;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        return list;
    }

    public final void setEvents(List<Event> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.events = list;
    }

    public final PageInfo getPageInfo() {
        PageInfo pageInfo = this.pageInfo;
        if (pageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageInfo");
        }
        return pageInfo;
    }

    public final void setPageInfo(PageInfo pageInfo) {
        Intrinsics.checkNotNullParameter(pageInfo, "<set-?>");
        this.pageInfo = pageInfo;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("events") && !obj.isNull("events")) {
            JSONArray jSONArray = obj.getJSONArray("events");
            this.events = new ArrayList();
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    if (obj2 != null) {
                        Event event = new Event((JSONObject) obj2);
                        List<Event> list = this.events;
                        if (list == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("events");
                        }
                        Intrinsics.checkNotNull(list);
                        list.add(event);
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
            }
            if (obj.has("pageInfo") && !obj.isNull("pageInfo")) {
                Object obj3 = obj.get("pageInfo");
                if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                    obj3 = new JSONObject();
                }
                if (obj3 != null) {
                    this.pageInfo = new PageInfo((JSONObject) obj3);
                    this._response_at = new Date();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            throw new ParameterCheckFailException("pageInfo is missing in api GetEvents");
        }
        throw new ParameterCheckFailException("events is missing in api GetEvents");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        String str = this.eventName;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("eventName", str);
        }
        String str2 = this.productId;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("productId", str2);
        }
        Boolean bool = this.enable;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            if (bool == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            hashMap.put("enable", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        hashMap.put("pageSize", Integer.valueOf(this.pageSize));
        hashMap.put("pageNo", Integer.valueOf(this.pageNo));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetEventsMessage)) {
            return false;
        }
        GetEventsMessage getEventsMessage = (GetEventsMessage) other;
        return ((Intrinsics.areEqual(this.eventName, getEventsMessage.eventName) ^ true) || (Intrinsics.areEqual(this.productId, getEventsMessage.productId) ^ true) || (Intrinsics.areEqual(this.enable, getEventsMessage.enable) ^ true) || this.pageSize != getEventsMessage.pageSize || this.pageNo != getEventsMessage.pageNo) ? false : true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{LogEvents.exportemptyalert_close_click_type_get};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof GetEventsMessage)) {
            return false;
        }
        GetEventsMessage getEventsMessage = (GetEventsMessage) other;
        if ((!Intrinsics.areEqual(this.eventName, getEventsMessage.eventName)) || (!Intrinsics.areEqual(this.productId, getEventsMessage.productId)) || (!Intrinsics.areEqual(this.enable, getEventsMessage.enable)) || this.pageSize != getEventsMessage.pageSize || this.pageNo != getEventsMessage.pageNo) {
            return false;
        }
        if (this.events == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        if (getEventsMessage.events == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        PageInfo pageInfo = this.pageInfo;
        if (pageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageInfo");
        }
        PageInfo pageInfo2 = getEventsMessage.pageInfo;
        if (pageInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageInfo");
        }
        return !(Intrinsics.areEqual(pageInfo, pageInfo2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.eventName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.productId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.enable;
        int hashCode4 = (((((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31) + Integer.valueOf(this.pageNo).hashCode()) * 31;
        List<Event> list = this.events;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("events");
        }
        int hashCode5 = (hashCode4 + list.hashCode()) * 31;
        PageInfo pageInfo = this.pageInfo;
        if (pageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageInfo");
        }
        return hashCode5 + pageInfo.hashCode();
    }

    /* compiled from: GetEventsMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventsMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v1/trackingconfig/get_events";
        }
    }
}
