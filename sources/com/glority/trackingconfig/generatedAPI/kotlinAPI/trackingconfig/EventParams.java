package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.enums.ParamsType;
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

/* compiled from: EventParams.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0014J\t\u0010 \u001a\u00020\bHÂ\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\u0016\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0016J\u001c\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&2\u0006\u0010'\u001a\u00020#J\b\u0010(\u001a\u00020\bH\u0016J\t\u0010)\u001a\u00020\u000bHÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\tR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParams;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "paramsName", "getParamsName", "()Ljava/lang/String;", "setParamsName", "(Ljava/lang/String;)V", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/ParamsType;", "paramsType", "getParamsType", "()Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/ParamsType;", "setParamsType", "(Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/ParamsType;)V", "required", "getRequired", "()I", "setRequired", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class EventParams extends APIModelBase<EventParams> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String paramsName;
    public ParamsType paramsType;
    private int required;
    private int unused;

    public EventParams() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ EventParams copy$default(EventParams eventParams, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventParams.unused;
        }
        return eventParams.copy(i);
    }

    public final EventParams copy(int unused) {
        return new EventParams(unused);
    }

    public String toString() {
        return "EventParams(unused=" + this.unused + ")";
    }

    public EventParams(int i) {
        this.unused = i;
    }

    public /* synthetic */ EventParams(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getParamsName() {
        String str = this.paramsName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsName");
        }
        return str;
    }

    public final void setParamsName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paramsName = str;
    }

    public final ParamsType getParamsType() {
        ParamsType paramsType = this.paramsType;
        if (paramsType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsType");
        }
        return paramsType;
    }

    public final void setParamsType(ParamsType paramsType) {
        Intrinsics.checkNotNullParameter(paramsType, "<set-?>");
        this.paramsType = paramsType;
    }

    public final int getRequired() {
        return this.required;
    }

    public final void setRequired(int i) {
        this.required = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventParams(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("paramsName") && !obj.isNull("paramsName")) {
            String string = obj.getString("paramsName");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"paramsName\")");
            this.paramsName = string;
            if (obj.has("paramsType") && !obj.isNull("paramsType")) {
                this.paramsType = ParamsType.INSTANCE.fromValue(obj.getInt("paramsType"));
                if (obj.has("required") && !obj.isNull("required")) {
                    this.required = obj.getInt("required");
                    return;
                }
                throw new ParameterCheckFailException("required is missing in model EventParams");
            }
            throw new ParameterCheckFailException("paramsType is missing in model EventParams");
        }
        throw new ParameterCheckFailException("paramsName is missing in model EventParams");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.paramsName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsName");
        }
        hashMap.put("paramsName", str);
        ParamsType paramsType = this.paramsType;
        if (paramsType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsType");
        }
        hashMap.put("paramsType", Integer.valueOf(paramsType.getValue()));
        hashMap.put("required", Integer.valueOf(this.required));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof EventParams)) {
            return false;
        }
        if (this.paramsName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsName");
        }
        EventParams eventParams = (EventParams) other;
        if (eventParams.paramsName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsName");
        }
        if (!Intrinsics.areEqual(r1, r3)) {
            return false;
        }
        ParamsType paramsType = this.paramsType;
        if (paramsType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsType");
        }
        ParamsType paramsType2 = eventParams.paramsType;
        if (paramsType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsType");
        }
        return paramsType == paramsType2 && this.required == eventParams.required;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.paramsName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsName");
        }
        int hashCode2 = (hashCode + str.hashCode()) * 31;
        ParamsType paramsType = this.paramsType;
        if (paramsType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paramsType");
        }
        return ((hashCode2 + paramsType.hashCode()) * 31) + Integer.valueOf(this.required).hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        EventParams eventParams = new EventParams(0, 1, null);
        cloneTo(eventParams);
        return eventParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            EventParams eventParams = (EventParams) o;
            super.cloneTo(eventParams);
            String str = this.paramsName;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paramsName");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.paramsName)");
            eventParams.paramsName = cloneField;
            Enum r0 = this.paramsType;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paramsType");
            }
            Enum cloneField2 = cloneField(r0);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.paramsType)");
            eventParams.paramsType = (ParamsType) cloneField2;
            Integer cloneField3 = cloneField(Integer.valueOf(this.required));
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.required)");
            eventParams.required = cloneField3.intValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventParams");
    }

    /* compiled from: EventParams.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParams$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getEventParamsJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParams;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getEventParamsJsonArrayMap(List<EventParams> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EventParams) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
