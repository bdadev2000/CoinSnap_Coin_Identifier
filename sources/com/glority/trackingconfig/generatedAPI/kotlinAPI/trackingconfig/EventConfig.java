package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.android.core.definition.APIModelBase;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010&H\u0014J\t\u0010*\u001a\u00020\bHÂ\u0003J\u0013\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0016\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010&0/H\u0016J\u001c\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010&0/2\u0006\u00100\u001a\u00020\u001fJ\b\u00101\u001a\u00020\bH\u0016J\t\u00102\u001a\u00020\u000fHÖ\u0001R&\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\tR&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R&\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventConfig;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "dataVType", "getDataVType", "()I", "setDataVType", "", "eventName", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParams;", "eventParams", "getEventParams", "()Ljava/util/List;", "setEventParams", "(Ljava/util/List;)V", "productId", "getProductId", "setProductId", "", "realtime", "getRealtime", "()Z", "setRealtime", "(Z)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class EventConfig extends APIModelBase<EventConfig> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int dataVType;
    public String eventName;
    public List<EventParams> eventParams;
    public String productId;
    private boolean realtime;
    private int unused;

    public EventConfig() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ EventConfig copy$default(EventConfig eventConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventConfig.unused;
        }
        return eventConfig.copy(i);
    }

    public final EventConfig copy(int unused) {
        return new EventConfig(unused);
    }

    public String toString() {
        return "EventConfig(unused=" + this.unused + ")";
    }

    public EventConfig(int i) {
        this.unused = i;
    }

    public /* synthetic */ EventConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
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

    public final boolean getRealtime() {
        return this.realtime;
    }

    public final void setRealtime(boolean z) {
        this.realtime = z;
    }

    public final int getDataVType() {
        return this.dataVType;
    }

    public final void setDataVType(int i) {
        this.dataVType = i;
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

    public final List<EventParams> getEventParams() {
        List<EventParams> list = this.eventParams;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventParams");
        }
        return list;
    }

    public final void setEventParams(List<EventParams> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.eventParams = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EventConfig(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventConfig.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        hashMap.put("eventName", str);
        hashMap.put("realtime", Integer.valueOf(this.realtime ? 1 : 0));
        hashMap.put("dataVType", Integer.valueOf(this.dataVType));
        String str2 = this.productId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        hashMap.put("productId", str2);
        EventParams.Companion companion = EventParams.INSTANCE;
        List<EventParams> list = this.eventParams;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventParams");
        }
        hashMap.put("eventParams", companion.getEventParamsJsonArrayMap(list));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof EventConfig)) {
            return false;
        }
        if (this.eventName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        EventConfig eventConfig = (EventConfig) other;
        if (eventConfig.eventName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        if ((!Intrinsics.areEqual(r1, r3)) || this.realtime != eventConfig.realtime || this.dataVType != eventConfig.dataVType) {
            return false;
        }
        if (this.productId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        if (eventConfig.productId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        List<EventParams> list = this.eventParams;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventParams");
        }
        List<EventParams> list2 = eventConfig.eventParams;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventParams");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        int hashCode2 = (((((hashCode + str.hashCode()) * 31) + Boolean.valueOf(this.realtime).hashCode()) * 31) + Integer.valueOf(this.dataVType).hashCode()) * 31;
        String str2 = this.productId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productId");
        }
        int hashCode3 = (hashCode2 + str2.hashCode()) * 31;
        List<EventParams> list = this.eventParams;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventParams");
        }
        return hashCode3 + list.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        EventConfig eventConfig = new EventConfig(0, 1, null);
        cloneTo(eventConfig);
        return eventConfig;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            EventConfig eventConfig = (EventConfig) o;
            super.cloneTo(eventConfig);
            String str = this.eventName;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventName");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.eventName)");
            eventConfig.eventName = cloneField;
            Boolean cloneField2 = cloneField(Boolean.valueOf(this.realtime));
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.realtime)");
            eventConfig.realtime = cloneField2.booleanValue();
            Integer cloneField3 = cloneField(Integer.valueOf(this.dataVType));
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.dataVType)");
            eventConfig.dataVType = cloneField3.intValue();
            String str2 = this.productId;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productId");
            }
            String cloneField4 = cloneField(str2);
            Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(this.productId)");
            eventConfig.productId = cloneField4;
            eventConfig.eventParams = new ArrayList();
            List<EventParams> list = this.eventParams;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventParams");
            }
            Intrinsics.checkNotNull(list);
            for (APIModelBase aPIModelBase : list) {
                List<EventParams> list2 = eventConfig.eventParams;
                if (list2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventParams");
                }
                Intrinsics.checkNotNull(list2);
                APIModelBase cloneField5 = cloneField(aPIModelBase);
                Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(item)");
                list2.add(cloneField5);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventConfig");
    }

    /* compiled from: EventConfig.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventConfig$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getEventConfigJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventConfig;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getEventConfigJsonArrayMap(List<EventConfig> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EventConfig) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("eventParams", EventParams.class);
            return hashMap;
        }
    }
}
