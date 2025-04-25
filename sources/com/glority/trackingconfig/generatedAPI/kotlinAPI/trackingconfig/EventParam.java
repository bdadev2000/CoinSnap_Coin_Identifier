package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: EventParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0014J\t\u0010\u001f\u001a\u00020\bHÂ\u0003J\u0013\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%H\u0016J\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%2\u0006\u0010&\u001a\u00020\"J\b\u0010'\u001a\u00020\bH\u0016J\t\u0010(\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R*\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R&\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParam;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "comment", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "eventId", "getEventId", "setEventId", "paramId", "getParamId", "setParamId", "paramName", "getParamName", "setParamName", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class EventParam extends APIModelBase<EventParam> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String comment;
    public String eventId;
    private String paramId;
    public String paramName;
    private int unused;

    public EventParam() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ EventParam copy$default(EventParam eventParam, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventParam.unused;
        }
        return eventParam.copy(i);
    }

    public final EventParam copy(int unused) {
        return new EventParam(unused);
    }

    public String toString() {
        return "EventParam(unused=" + this.unused + ")";
    }

    public EventParam(int i) {
        this.unused = i;
    }

    public /* synthetic */ EventParam(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getEventId() {
        String str = this.eventId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventId");
        }
        return str;
    }

    public final void setEventId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventId = str;
    }

    public final String getParamId() {
        return this.paramId;
    }

    public final void setParamId(String str) {
        this.paramId = str;
    }

    public final String getParamName() {
        String str = this.paramName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramName");
        }
        return str;
    }

    public final void setParamName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paramName = str;
    }

    public final String getComment() {
        return this.comment;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventParam(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("eventId") && !obj.isNull("eventId")) {
            String string = obj.getString("eventId");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"eventId\")");
            this.eventId = string;
            if (obj.has("paramId") && !obj.isNull("paramId")) {
                this.paramId = obj.getString("paramId");
            } else {
                this.paramId = null;
            }
            if (obj.has("paramName") && !obj.isNull("paramName")) {
                String string2 = obj.getString("paramName");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"paramName\")");
                this.paramName = string2;
                if (obj.has("comment") && !obj.isNull("comment")) {
                    this.comment = obj.getString("comment");
                    return;
                } else {
                    this.comment = null;
                    return;
                }
            }
            throw new ParameterCheckFailException("paramName is missing in model EventParam");
        }
        throw new ParameterCheckFailException("eventId is missing in model EventParam");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.eventId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventId");
        }
        hashMap.put("eventId", str);
        String str2 = this.paramId;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("paramId", str2);
        } else if (keepNull) {
            hashMap.put("paramId", null);
        }
        String str3 = this.paramName;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramName");
        }
        hashMap.put("paramName", str3);
        String str4 = this.comment;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("comment", str4);
        } else if (keepNull) {
            hashMap.put("comment", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof EventParam)) {
            return false;
        }
        if (this.eventId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventId");
        }
        EventParam eventParam = (EventParam) other;
        if (eventParam.eventId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventId");
        }
        if ((!Intrinsics.areEqual(r1, r3)) || (!Intrinsics.areEqual(this.paramId, eventParam.paramId))) {
            return false;
        }
        String str = this.paramName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramName");
        }
        String str2 = eventParam.paramName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramName");
        }
        return ((Intrinsics.areEqual(str, str2) ^ true) || (Intrinsics.areEqual(this.comment, eventParam.comment) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.eventId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventId");
        }
        int hashCode2 = (hashCode + str.hashCode()) * 31;
        String str2 = this.paramId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.paramName;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramName");
        }
        int hashCode4 = (hashCode3 + str3.hashCode()) * 31;
        String str4 = this.comment;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        EventParam eventParam = new EventParam(0, 1, null);
        cloneTo(eventParam);
        return eventParam;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            EventParam eventParam = (EventParam) o;
            super.cloneTo(eventParam);
            String str = this.eventId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventId");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.eventId)");
            eventParam.eventId = cloneField;
            String str2 = this.paramId;
            eventParam.paramId = str2 != null ? cloneField(str2) : null;
            String str3 = this.paramName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paramName");
            }
            String cloneField2 = cloneField(str3);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.paramName)");
            eventParam.paramName = cloneField2;
            String str4 = this.comment;
            eventParam.comment = str4 != null ? cloneField(str4) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventParam");
    }

    /* compiled from: EventParam.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParam$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getEventParamJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParam;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getEventParamJsonArrayMap(List<EventParam> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EventParam) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
