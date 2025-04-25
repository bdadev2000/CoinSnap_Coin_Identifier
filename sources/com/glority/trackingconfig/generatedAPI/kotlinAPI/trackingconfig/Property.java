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

/* compiled from: Property.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"H\u0016J\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"2\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020\bH\u0016J\t\u0010%\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Property;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "propertyId", "getPropertyId", "()Ljava/lang/String;", "setPropertyId", "(Ljava/lang/String;)V", "propertyName", "getPropertyName", "setPropertyName", "propertyType", "getPropertyType", "setPropertyType", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class Property extends APIModelBase<Property> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String propertyId;
    public String propertyName;
    public String propertyType;
    private int unused;

    public Property() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ Property copy$default(Property property, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = property.unused;
        }
        return property.copy(i);
    }

    public final Property copy(int unused) {
        return new Property(unused);
    }

    public String toString() {
        return "Property(unused=" + this.unused + ")";
    }

    public Property(int i) {
        this.unused = i;
    }

    public /* synthetic */ Property(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final String getPropertyType() {
        String str = this.propertyType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        return str;
    }

    public final void setPropertyType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.propertyType = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Property(JSONObject obj) throws Exception {
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
                String string2 = obj.getString("propertyType");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"propertyType\")");
                this.propertyType = string2;
                return;
            }
            throw new ParameterCheckFailException("propertyType is missing in model Property");
        }
        throw new ParameterCheckFailException("propertyName is missing in model Property");
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
        String str3 = this.propertyType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        hashMap.put("propertyType", str3);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Property)) {
            return false;
        }
        Property property = (Property) other;
        if (!Intrinsics.areEqual(this.propertyId, property.propertyId)) {
            return false;
        }
        if (this.propertyName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyName");
        }
        if (property.propertyName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyName");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        String str = this.propertyType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        String str2 = property.propertyType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        return !(Intrinsics.areEqual(str, str2) ^ true);
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
        String str3 = this.propertyType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propertyType");
        }
        return hashCode3 + str3.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Property property = new Property(0, 1, null);
        cloneTo(property);
        return property;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            Property property = (Property) o;
            super.cloneTo(property);
            String str = this.propertyId;
            property.propertyId = str != null ? cloneField(str) : null;
            String str2 = this.propertyName;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("propertyName");
            }
            String cloneField = cloneField(str2);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.propertyName)");
            property.propertyName = cloneField;
            String str3 = this.propertyType;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("propertyType");
            }
            String cloneField2 = cloneField(str3);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.propertyType)");
            property.propertyType = cloneField2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.Property");
    }

    /* compiled from: Property.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Property$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getPropertyJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Property;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getPropertyJsonArrayMap(List<Property> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Property) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
