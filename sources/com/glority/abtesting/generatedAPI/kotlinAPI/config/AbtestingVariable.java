package com.glority.abtesting.generatedAPI.kotlinAPI.config;

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

/* compiled from: AbtestingVariable.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001'B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0014J\t\u0010\u001d\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\u0016\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00190#H\u0016J\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00190#2\u0006\u0010$\u001a\u00020 J\b\u0010%\u001a\u00020\bH\u0016J\t\u0010&\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\t¨\u0006("}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "variable", "getVariable", "()Ljava/lang/String;", "setVariable", "(Ljava/lang/String;)V", "variableData", "getVariableData", "setVariableData", "weight", "getWeight", "()I", "setWeight", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class AbtestingVariable extends APIModelBase<AbtestingVariable> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int unused;
    public String variable;
    private String variableData;
    private int weight;

    public AbtestingVariable() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ AbtestingVariable copy$default(AbtestingVariable abtestingVariable, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = abtestingVariable.unused;
        }
        return abtestingVariable.copy(i);
    }

    public final AbtestingVariable copy(int unused) {
        return new AbtestingVariable(unused);
    }

    public String toString() {
        return "AbtestingVariable(unused=" + this.unused + ")";
    }

    public AbtestingVariable(int i) {
        this.unused = i;
    }

    public /* synthetic */ AbtestingVariable(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getVariable() {
        String str = this.variable;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        return str;
    }

    public final void setVariable(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.variable = str;
    }

    public final String getVariableData() {
        return this.variableData;
    }

    public final void setVariableData(String str) {
        this.variableData = str;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbtestingVariable(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("variable") && !obj.isNull("variable")) {
            String string = obj.getString("variable");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"variable\")");
            this.variable = string;
            if (obj.has("variableData") && !obj.isNull("variableData")) {
                this.variableData = obj.getString("variableData");
            } else {
                this.variableData = null;
            }
            if (obj.has("weight") && !obj.isNull("weight")) {
                this.weight = obj.getInt("weight");
                return;
            }
            throw new ParameterCheckFailException("weight is missing in model AbtestingVariable");
        }
        throw new ParameterCheckFailException("variable is missing in model AbtestingVariable");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.variable;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        hashMap.put("variable", str);
        String str2 = this.variableData;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("variableData", str2);
        } else if (keepNull) {
            hashMap.put("variableData", null);
        }
        hashMap.put("weight", Integer.valueOf(this.weight));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof AbtestingVariable)) {
            return false;
        }
        String str = this.variable;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        AbtestingVariable abtestingVariable = (AbtestingVariable) other;
        String str2 = abtestingVariable.variable;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        return ((Intrinsics.areEqual(str, str2) ^ true) || (Intrinsics.areEqual(this.variableData, abtestingVariable.variableData) ^ true) || this.weight != abtestingVariable.weight) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.variable;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        int hashCode2 = (hashCode + str.hashCode()) * 31;
        String str2 = this.variableData;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.valueOf(this.weight).hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        AbtestingVariable abtestingVariable = new AbtestingVariable(0, 1, null);
        cloneTo(abtestingVariable);
        return abtestingVariable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            AbtestingVariable abtestingVariable = (AbtestingVariable) o;
            super.cloneTo(abtestingVariable);
            String str = this.variable;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("variable");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.variable)");
            abtestingVariable.variable = cloneField;
            String str2 = this.variableData;
            abtestingVariable.variableData = str2 != null ? cloneField(str2) : null;
            Integer cloneField2 = cloneField(Integer.valueOf(this.weight));
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.weight)");
            abtestingVariable.weight = cloneField2.intValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable");
    }

    /* compiled from: AbtestingVariable.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getAbtestingVariableJsonArrayMap", "", "array", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getAbtestingVariableJsonArrayMap(List<AbtestingVariable> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbtestingVariable) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
