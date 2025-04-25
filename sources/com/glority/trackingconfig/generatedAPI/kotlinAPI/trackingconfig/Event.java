package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.android.core.definition.APIModelBase;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventParam;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Event.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001LB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010>H\u0014J\t\u0010B\u001a\u00020\bHÂ\u0003J\u0013\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010>H\u0096\u0002J\u0016\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010>0HH\u0016J\u001c\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010>0H2\u0006\u0010I\u001a\u00020EJ\b\u0010J\u001a\u00020\bH\u0016J\t\u0010K\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R*\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R*\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R*\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R&\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R6\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R&\u00100\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R&\u00103\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u0010\tR2\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0&8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010:\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019¨\u0006M"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Event;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "comment", "getComment", "setComment", "Ljava/util/Date;", "createAt", "getCreateAt", "()Ljava/util/Date;", "setCreateAt", "(Ljava/util/Date;)V", "dataVType", "getDataVType", "setDataVType", "deviceType", "getDeviceType", "setDeviceType", "eventId", "getEventId", "setEventId", "eventName", "getEventName", "setEventName", "", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParam;", "eventParams", "getEventParams", "()Ljava/util/List;", "setEventParams", "(Ljava/util/List;)V", "productId", "getProductId", "setProductId", "realtime", "getRealtime", "setRealtime", "status", "getStatus", "()I", "setStatus", "trackingChannel", "getTrackingChannel", "setTrackingChannel", "updateAt", "getUpdateAt", "setUpdateAt", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class Event extends APIModelBase<Event> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String appVersion;
    private String comment;
    private Date createAt;
    public String dataVType;
    private String deviceType;
    private String eventId;
    public String eventName;
    private List<EventParam> eventParams;
    public String productId;
    public String realtime;
    private int status;
    public List<String> trackingChannel;
    private int unused;
    private Date updateAt;

    public Event() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ Event copy$default(Event event, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = event.unused;
        }
        return event.copy(i);
    }

    public final Event copy(int unused) {
        return new Event(unused);
    }

    public String toString() {
        return "Event(unused=" + this.unused + ")";
    }

    public Event(int i) {
        this.unused = i;
    }

    public /* synthetic */ Event(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final String getEventName() {
        String str = this.eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        return str;
    }

    public final void setEventName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final String getProductId() {
        String str = this.productId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        return str;
    }

    public final void setProductId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }

    public final List<EventParam> getEventParams() {
        return this.eventParams;
    }

    public final void setEventParams(List<EventParam> list) {
        this.eventParams = list;
    }

    public final List<String> getTrackingChannel() {
        List<String> list = this.trackingChannel;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackingChannel");
        }
        return list;
    }

    public final void setTrackingChannel(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.trackingChannel = list;
    }

    public final String getComment() {
        return this.comment;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final String getDataVType() {
        String str = this.dataVType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataVType");
        }
        return str;
    }

    public final void setDataVType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataVType = str;
    }

    public final String getRealtime() {
        String str = this.realtime;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtime");
        }
        return str;
    }

    public final void setRealtime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.realtime = str;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final Date getCreateAt() {
        return this.createAt;
    }

    public final void setCreateAt(Date date) {
        this.createAt = date;
    }

    public final Date getUpdateAt() {
        return this.updateAt;
    }

    public final void setUpdateAt(Date date) {
        this.updateAt = date;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Event(org.json.JSONObject r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.Event.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.eventId;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("eventId", str);
        } else if (keepNull) {
            hashMap.put("eventId", null);
        }
        String str2 = this.eventName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        hashMap.put("eventName", str2);
        String str3 = this.productId;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        hashMap.put("productId", str3);
        if (this.eventParams != null) {
            EventParam.Companion companion = EventParam.INSTANCE;
            List<EventParam> list = this.eventParams;
            Intrinsics.checkNotNull(list);
            hashMap.put("eventParams", companion.getEventParamJsonArrayMap(list));
        } else if (keepNull) {
            hashMap.put("eventParams", null);
        }
        List<String> list2 = this.trackingChannel;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackingChannel");
        }
        hashMap.put("trackingChannel", list2);
        String str4 = this.comment;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("comment", str4);
        } else if (keepNull) {
            hashMap.put("comment", null);
        }
        hashMap.put("status", Integer.valueOf(this.status));
        String str5 = this.dataVType;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataVType");
        }
        hashMap.put("dataVType", str5);
        String str6 = this.realtime;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtime");
        }
        hashMap.put("realtime", str6);
        String str7 = this.deviceType;
        if (str7 != null) {
            Intrinsics.checkNotNull(str7);
            hashMap.put("deviceType", str7);
        } else if (keepNull) {
            hashMap.put("deviceType", null);
        }
        String str8 = this.appVersion;
        if (str8 != null) {
            Intrinsics.checkNotNull(str8);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str8);
        } else if (keepNull) {
            hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, null);
        }
        Date date = this.createAt;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("createAt", Long.valueOf(date.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("createAt", null);
        }
        Date date2 = this.updateAt;
        if (date2 != null) {
            Intrinsics.checkNotNull(date2);
            hashMap.put("updateAt", Long.valueOf(date2.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("updateAt", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        if (!Intrinsics.areEqual(this.eventId, event.eventId)) {
            return false;
        }
        if (this.eventName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        if (event.eventName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        if (this.productId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        if (event.productId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        if ((!Intrinsics.areEqual(r1, r4)) || (!Intrinsics.areEqual(this.eventParams, event.eventParams))) {
            return false;
        }
        if (this.trackingChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackingChannel");
        }
        if (event.trackingChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackingChannel");
        }
        if ((!Intrinsics.areEqual(r1, r4)) || (!Intrinsics.areEqual(this.comment, event.comment)) || this.status != event.status) {
            return false;
        }
        if (this.dataVType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataVType");
        }
        if (event.dataVType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataVType");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        String str = this.realtime;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtime");
        }
        String str2 = event.realtime;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtime");
        }
        return ((Intrinsics.areEqual(str, str2) ^ true) || (Intrinsics.areEqual(this.deviceType, event.deviceType) ^ true) || (Intrinsics.areEqual(this.appVersion, event.appVersion) ^ true) || (Intrinsics.areEqual(this.createAt, event.createAt) ^ true) || (Intrinsics.areEqual(this.updateAt, event.updateAt) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.eventId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.eventName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        int hashCode3 = (hashCode2 + str2.hashCode()) * 31;
        String str3 = this.productId;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        int hashCode4 = (hashCode3 + str3.hashCode()) * 31;
        List<EventParam> list = this.eventParams;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.trackingChannel;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackingChannel");
        }
        int hashCode6 = (hashCode5 + list2.hashCode()) * 31;
        String str4 = this.comment;
        int hashCode7 = (((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.valueOf(this.status).hashCode()) * 31;
        String str5 = this.dataVType;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataVType");
        }
        int hashCode8 = (hashCode7 + str5.hashCode()) * 31;
        String str6 = this.realtime;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtime");
        }
        int hashCode9 = (hashCode8 + str6.hashCode()) * 31;
        String str7 = this.deviceType;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.appVersion;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Date date = this.createAt;
        int hashCode12 = (hashCode11 + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.updateAt;
        return hashCode12 + (date2 != null ? date2.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Event event = new Event(0, 1, null);
        cloneTo(event);
        return event;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            Event event = (Event) o;
            super.cloneTo(event);
            String str = this.eventId;
            event.eventId = str != null ? cloneField(str) : null;
            String str2 = this.eventName;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventName");
            }
            String cloneField = cloneField(str2);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.eventName)");
            event.eventName = cloneField;
            String str3 = this.productId;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productId");
            }
            String cloneField2 = cloneField(str3);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.productId)");
            event.productId = cloneField2;
            if (this.eventParams == null) {
                event.eventParams = null;
            } else {
                event.eventParams = new ArrayList();
                List<EventParam> list = this.eventParams;
                Intrinsics.checkNotNull(list);
                for (APIModelBase aPIModelBase : list) {
                    List<EventParam> list2 = event.eventParams;
                    Intrinsics.checkNotNull(list2);
                    APIModelBase cloneField3 = cloneField(aPIModelBase);
                    Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                    list2.add(cloneField3);
                }
            }
            event.trackingChannel = new ArrayList();
            List<String> list3 = this.trackingChannel;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackingChannel");
            }
            Intrinsics.checkNotNull(list3);
            for (String str4 : list3) {
                List<String> list4 = event.trackingChannel;
                if (list4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("trackingChannel");
                }
                Intrinsics.checkNotNull(list4);
                String cloneField4 = cloneField(str4);
                Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(item)");
                list4.add(cloneField4);
            }
            String str5 = this.comment;
            event.comment = str5 != null ? cloneField(str5) : null;
            Integer cloneField5 = cloneField(Integer.valueOf(this.status));
            Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(this.status)");
            event.status = cloneField5.intValue();
            String str6 = this.dataVType;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataVType");
            }
            String cloneField6 = cloneField(str6);
            Intrinsics.checkNotNullExpressionValue(cloneField6, "cloneField(this.dataVType)");
            event.dataVType = cloneField6;
            String str7 = this.realtime;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("realtime");
            }
            String cloneField7 = cloneField(str7);
            Intrinsics.checkNotNullExpressionValue(cloneField7, "cloneField(this.realtime)");
            event.realtime = cloneField7;
            String str8 = this.deviceType;
            event.deviceType = str8 != null ? cloneField(str8) : null;
            String str9 = this.appVersion;
            event.appVersion = str9 != null ? cloneField(str9) : null;
            Date date = this.createAt;
            event.createAt = date != null ? cloneField(date) : null;
            Date date2 = this.updateAt;
            event.updateAt = date2 != null ? cloneField(date2) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.Event");
    }

    /* compiled from: Event.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Event$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getEventJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Event;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getEventJsonArrayMap(List<Event> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Event) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("eventParams", EventParam.class);
            hashMap.put("trackingChannel", String.class);
            return hashMap;
        }
    }
}
