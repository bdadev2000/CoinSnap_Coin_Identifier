package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.enums.PropertyType;
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

/* compiled from: EventProperty.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0014J\t\u0010\u001f\u001a\u00020\bHÂ\u0003J\u0013\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%H\u0016J\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%2\u0006\u0010&\u001a\u00020\"J\b\u0010'\u001a\u00020\bH\u0016J\t\u0010(\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00148F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventProperty;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "propertyId", "getPropertyId", "()Ljava/lang/String;", "setPropertyId", "(Ljava/lang/String;)V", "propertyName", "getPropertyName", "setPropertyName", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/PropertyType;", "propertyType", "getPropertyType", "()Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/PropertyType;", "setPropertyType", "(Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/PropertyType;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class EventProperty extends APIModelBase<EventProperty> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String propertyId;
    public String propertyName;
    public PropertyType propertyType;
    private int unused;

    public EventProperty() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ EventProperty copy$default(EventProperty eventProperty, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventProperty.unused;
        }
        return eventProperty.copy(i);
    }

    public final EventProperty copy(int unused) {
        return new EventProperty(unused);
    }

    public String toString() {
        return "EventProperty(unused=" + this.unused + ")";
    }

    public EventProperty(int i) {
        this.unused = i;
    }

    public /* synthetic */ EventProperty(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getPropertyId() {
        return this.propertyId;
    }

    public final void setPropertyId(String str) {
        this.propertyId = str;
    }

    public final String getPropertyName() {
        String str = this.propertyName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyName");
        }
        return str;
    }

    public final void setPropertyName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.propertyName = str;
    }

    public final PropertyType getPropertyType() {
        PropertyType propertyType = this.propertyType;
        if (propertyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        return propertyType;
    }

    public final void setPropertyType(PropertyType propertyType) {
        Intrinsics.checkNotNullParameter(propertyType, "<set-?>");
        this.propertyType = propertyType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventProperty(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("propertyId") && !obj.isNull("propertyId")) {
            this.propertyId = obj.getString("propertyId");
        } else {
            this.propertyId = null;
        }
        if (obj.has("propertyName") && !obj.isNull("propertyName")) {
            String string = obj.getString("propertyName");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"propertyName\")");
            this.propertyName = string;
            if (obj.has("propertyType") && !obj.isNull("propertyType")) {
                this.propertyType = PropertyType.INSTANCE.fromValue(obj.getInt("propertyType"));
                return;
            }
            throw new ParameterCheckFailException("propertyType is missing in model EventProperty");
        }
        throw new ParameterCheckFailException("propertyName is missing in model EventProperty");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.propertyId;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("propertyId", str);
        } else if (keepNull) {
            hashMap.put("propertyId", null);
        }
        String str2 = this.propertyName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyName");
        }
        hashMap.put("propertyName", str2);
        PropertyType propertyType = this.propertyType;
        if (propertyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        hashMap.put("propertyType", Integer.valueOf(propertyType.getValue()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof EventProperty)) {
            return false;
        }
        EventProperty eventProperty = (EventProperty) other;
        if (!Intrinsics.areEqual(this.propertyId, eventProperty.propertyId)) {
            return false;
        }
        if (this.propertyName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyName");
        }
        if (eventProperty.propertyName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyName");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        PropertyType propertyType = this.propertyType;
        if (propertyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        PropertyType propertyType2 = eventProperty.propertyType;
        if (propertyType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        return propertyType == propertyType2;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.propertyId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.propertyName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyName");
        }
        int hashCode3 = (hashCode2 + str2.hashCode()) * 31;
        PropertyType propertyType = this.propertyType;
        if (propertyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        return hashCode3 + propertyType.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        EventProperty eventProperty = new EventProperty(0, 1, null);
        cloneTo(eventProperty);
        return eventProperty;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            EventProperty eventProperty = (EventProperty) o;
            super.cloneTo(eventProperty);
            String str = this.propertyId;
            eventProperty.propertyId = str != null ? cloneField(str) : null;
            String str2 = this.propertyName;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("propertyName");
            }
            String cloneField = cloneField(str2);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.propertyName)");
            eventProperty.propertyName = cloneField;
            Enum r0 = this.propertyType;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("propertyType");
            }
            Enum cloneField2 = cloneField(r0);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.propertyType)");
            eventProperty.propertyType = (PropertyType) cloneField2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventProperty");
    }

    /* compiled from: EventProperty.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventProperty$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getEventPropertyJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventProperty;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getEventPropertyJsonArrayMap(List<EventProperty> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EventProperty) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
