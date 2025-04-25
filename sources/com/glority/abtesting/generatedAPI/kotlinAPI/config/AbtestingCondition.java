package com.glority.abtesting.generatedAPI.kotlinAPI.config;

import com.glority.abtesting.generatedAPI.kotlinAPI.enums.ConditionOperator;
import com.glority.android.core.definition.APIModelBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestingCondition.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0014J\t\u0010\"\u001a\u00020\bHÂ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0016\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001e0(H\u0016J\u001c\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001e0(2\u0006\u0010)\u001a\u00020%J\b\u0010*\u001a\u00020\bH\u0016J\t\u0010+\u001a\u00020\u0011HÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingCondition;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/ConditionOperator;", "op", "getOp", "()Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/ConditionOperator;", "setOp", "(Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/ConditionOperator;)V", "", "tagAbtest", "getTagAbtest", "()Ljava/lang/String;", "setTagAbtest", "(Ljava/lang/String;)V", "", "values", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class AbtestingCondition extends APIModelBase<AbtestingCondition> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public ConditionOperator op;
    public String tagAbtest;
    private int unused;
    public List<String> values;

    public AbtestingCondition() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ AbtestingCondition copy$default(AbtestingCondition abtestingCondition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = abtestingCondition.unused;
        }
        return abtestingCondition.copy(i);
    }

    public final AbtestingCondition copy(int unused) {
        return new AbtestingCondition(unused);
    }

    public String toString() {
        return "AbtestingCondition(unused=" + this.unused + ")";
    }

    public AbtestingCondition(int i) {
        this.unused = i;
    }

    public /* synthetic */ AbtestingCondition(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getTagAbtest() {
        String str = this.tagAbtest;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagAbtest");
        }
        return str;
    }

    public final void setTagAbtest(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagAbtest = str;
    }

    public final ConditionOperator getOp() {
        ConditionOperator conditionOperator = this.op;
        if (conditionOperator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("op");
        }
        return conditionOperator;
    }

    public final void setOp(ConditionOperator conditionOperator) {
        Intrinsics.checkNotNullParameter(conditionOperator, "<set-?>");
        this.op = conditionOperator;
    }

    public final List<String> getValues() {
        List<String> list = this.values;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        }
        return list;
    }

    public final void setValues(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.values = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbtestingCondition(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            r5.<init>(r1, r2, r0)
            java.lang.String r0 = "tag"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L90
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L90
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r3 = "obj.getString(\"tag\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r5.tagAbtest = r0
            java.lang.String r0 = "op"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L86
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L86
            com.glority.abtesting.generatedAPI.kotlinAPI.enums.ConditionOperator$Companion r3 = com.glority.abtesting.generatedAPI.kotlinAPI.enums.ConditionOperator.INSTANCE
            int r0 = r6.getInt(r0)
            com.glority.abtesting.generatedAPI.kotlinAPI.enums.ConditionOperator r0 = r3.fromValue(r0)
            r5.op = r0
            java.lang.String r0 = "values"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L7c
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L7c
            org.json.JSONArray r6 = r6.getJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r5.values = r3
            int r3 = r6.length()
            int r3 = r3 - r2
            if (r3 < 0) goto L7b
        L60:
            java.lang.String r2 = r6.getString(r1)
            java.lang.String r4 = "__values.getString(i0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.util.List<java.lang.String> r4 = r5.values
            if (r4 != 0) goto L70
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L70:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r4.add(r2)
            if (r1 == r3) goto L7b
            int r1 = r1 + 1
            goto L60
        L7b:
            return
        L7c:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "values is missing in model AbtestingCondition"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L86:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "op is missing in model AbtestingCondition"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L90:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "tag is missing in model AbtestingCondition"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingCondition.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.tagAbtest;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagAbtest");
        }
        hashMap.put("tag", str);
        ConditionOperator conditionOperator = this.op;
        if (conditionOperator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("op");
        }
        hashMap.put("op", Integer.valueOf(conditionOperator.getValue()));
        List<String> list = this.values;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        }
        hashMap.put("values", list);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof AbtestingCondition)) {
            return false;
        }
        if (this.tagAbtest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagAbtest");
        }
        AbtestingCondition abtestingCondition = (AbtestingCondition) other;
        if (abtestingCondition.tagAbtest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagAbtest");
        }
        if (!Intrinsics.areEqual(r1, r3)) {
            return false;
        }
        ConditionOperator conditionOperator = this.op;
        if (conditionOperator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("op");
        }
        ConditionOperator conditionOperator2 = abtestingCondition.op;
        if (conditionOperator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("op");
        }
        if (conditionOperator != conditionOperator2) {
            return false;
        }
        List<String> list = this.values;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        }
        List<String> list2 = abtestingCondition.values;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.tagAbtest;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagAbtest");
        }
        int hashCode2 = (hashCode + str.hashCode()) * 31;
        ConditionOperator conditionOperator = this.op;
        if (conditionOperator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("op");
        }
        int hashCode3 = (hashCode2 + conditionOperator.hashCode()) * 31;
        List<String> list = this.values;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        }
        return hashCode3 + list.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        AbtestingCondition abtestingCondition = new AbtestingCondition(0, 1, null);
        cloneTo(abtestingCondition);
        return abtestingCondition;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            AbtestingCondition abtestingCondition = (AbtestingCondition) o;
            super.cloneTo(abtestingCondition);
            String str = this.tagAbtest;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tagAbtest");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.tagAbtest)");
            abtestingCondition.tagAbtest = cloneField;
            Enum r0 = this.op;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("op");
            }
            Enum cloneField2 = cloneField(r0);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.op)");
            abtestingCondition.op = (ConditionOperator) cloneField2;
            abtestingCondition.values = new ArrayList();
            List<String> list = this.values;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("values");
            }
            Intrinsics.checkNotNull(list);
            for (String str2 : list) {
                List<String> list2 = abtestingCondition.values;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("values");
                }
                Intrinsics.checkNotNull(list2);
                String cloneField3 = cloneField(str2);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                list2.add(cloneField3);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingCondition");
    }

    /* compiled from: AbtestingCondition.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingCondition$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getAbtestingConditionJsonArrayMap", "", "array", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingCondition;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getAbtestingConditionJsonArrayMap(List<AbtestingCondition> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbtestingCondition) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("values", String.class);
            return hashMap;
        }
    }
}
