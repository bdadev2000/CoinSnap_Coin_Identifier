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

/* compiled from: AbtestingVariableConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"H\u0016J\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"2\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020\bH\u0016J\t\u0010%\u001a\u00020\u000bHÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R*\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006'"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariableConfig;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "test", "getTest", "()Ljava/lang/String;", "setTest", "(Ljava/lang/String;)V", "variable", "getVariable", "setVariable", "variableData", "getVariableData", "setVariableData", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class AbtestingVariableConfig extends APIModelBase<AbtestingVariableConfig> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String test;
    private int unused;
    public String variable;
    private String variableData;

    public AbtestingVariableConfig() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ AbtestingVariableConfig copy$default(AbtestingVariableConfig abtestingVariableConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = abtestingVariableConfig.unused;
        }
        return abtestingVariableConfig.copy(i);
    }

    public final AbtestingVariableConfig copy(int unused) {
        return new AbtestingVariableConfig(unused);
    }

    public String toString() {
        return "AbtestingVariableConfig(unused=" + this.unused + ")";
    }

    public AbtestingVariableConfig(int i) {
        this.unused = i;
    }

    public /* synthetic */ AbtestingVariableConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getTest() {
        String str = this.test;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        return str;
    }

    public final void setTest(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.test = str;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbtestingVariableConfig(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("test")) {
            String string = obj.getString("test");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"test\")");
            this.test = string;
            if (obj.has("variable")) {
                String string2 = obj.getString("variable");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"variable\")");
                this.variable = string2;
                if (obj.has("variableData")) {
                    this.variableData = obj.getString("variableData");
                    return;
                } else {
                    this.variableData = null;
                    return;
                }
            }
            throw new ParameterCheckFailException("variable is missing in model AbtestingVariableConfig");
        }
        throw new ParameterCheckFailException("test is missing in model AbtestingVariableConfig");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.test;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        hashMap.put("test", str);
        String str2 = this.variable;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        hashMap.put("variable", str2);
        String str3 = this.variableData;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("variableData", str3);
        } else if (keepNull) {
            hashMap.put("variableData", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof AbtestingVariableConfig)) {
            return false;
        }
        if (this.test == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        AbtestingVariableConfig abtestingVariableConfig = (AbtestingVariableConfig) other;
        if (abtestingVariableConfig.test == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        if (!Intrinsics.areEqual(r1, r3)) {
            return false;
        }
        String str = this.variable;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        String str2 = abtestingVariableConfig.variable;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        return ((Intrinsics.areEqual(str, str2) ^ true) || (Intrinsics.areEqual(this.variableData, abtestingVariableConfig.variableData) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.test;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        int hashCode2 = (hashCode + str.hashCode()) * 31;
        String str2 = this.variable;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("variable");
        }
        int hashCode3 = (hashCode2 + str2.hashCode()) * 31;
        String str3 = this.variableData;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        AbtestingVariableConfig abtestingVariableConfig = new AbtestingVariableConfig(0, 1, null);
        cloneTo(abtestingVariableConfig);
        return abtestingVariableConfig;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            AbtestingVariableConfig abtestingVariableConfig = (AbtestingVariableConfig) o;
            super.cloneTo(abtestingVariableConfig);
            String str = this.test;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("test");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.test)");
            abtestingVariableConfig.test = cloneField;
            String str2 = this.variable;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("variable");
            }
            String cloneField2 = cloneField(str2);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.variable)");
            abtestingVariableConfig.variable = cloneField2;
            String str3 = this.variableData;
            abtestingVariableConfig.variableData = str3 != null ? cloneField(str3) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariableConfig");
    }

    /* compiled from: AbtestingVariableConfig.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariableConfig$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getAbtestingVariableConfigJsonArrayMap", "", "array", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariableConfig;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getAbtestingVariableConfigJsonArrayMap(List<AbtestingVariableConfig> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbtestingVariableConfig) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
