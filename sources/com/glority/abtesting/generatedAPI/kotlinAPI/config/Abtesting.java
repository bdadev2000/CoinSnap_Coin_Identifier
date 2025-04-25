package com.glority.abtesting.generatedAPI.kotlinAPI.config;

import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingCondition;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.abtesting.generatedAPI.kotlinAPI.enums.AbtestingStatus;
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

/* compiled from: Abtesting.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001;B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010-H\u0014J\t\u00101\u001a\u00020\bHÂ\u0003J\u0013\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0016\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010-07H\u0016J\u001c\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010-072\u0006\u00108\u001a\u000204J\b\u00109\u001a\u00020\bH\u0016J\t\u0010:\u001a\u00020\u0012HÖ\u0001R2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R2\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R&\u0010\u001c\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R&\u0010'\u001a\u00020&2\u0006\u0010\n\u001a\u00020&8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/Abtesting;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingCondition;", "abtestingConditions", "getAbtestingConditions", "()Ljava/util/List;", "setAbtestingConditions", "(Ljava/util/List;)V", "", "abtestingId", "getAbtestingId", "()Ljava/lang/String;", "setAbtestingId", "(Ljava/lang/String;)V", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable;", "abtestingVariables", "getAbtestingVariables", "setAbtestingVariables", "priority", "getPriority", "()I", "setPriority", "recordVariable", "getRecordVariable", "setRecordVariable", "recordVariableData", "getRecordVariableData", "setRecordVariableData", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/AbtestingStatus;", "status", "getStatus", "()Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/AbtestingStatus;", "setStatus", "(Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/AbtestingStatus;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class Abtesting extends APIModelBase<Abtesting> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<AbtestingCondition> abtestingConditions;
    public String abtestingId;
    public List<AbtestingVariable> abtestingVariables;
    private int priority;
    private String recordVariable;
    private String recordVariableData;
    public AbtestingStatus status;
    private int unused;

    public Abtesting() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ Abtesting copy$default(Abtesting abtesting, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = abtesting.unused;
        }
        return abtesting.copy(i);
    }

    public final Abtesting copy(int unused) {
        return new Abtesting(unused);
    }

    public String toString() {
        return "Abtesting(unused=" + this.unused + ")";
    }

    public Abtesting(int i) {
        this.unused = i;
    }

    public /* synthetic */ Abtesting(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getAbtestingId() {
        String str = this.abtestingId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingId");
        }
        return str;
    }

    public final void setAbtestingId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.abtestingId = str;
    }

    public final AbtestingStatus getStatus() {
        AbtestingStatus abtestingStatus = this.status;
        if (abtestingStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("status");
        }
        return abtestingStatus;
    }

    public final void setStatus(AbtestingStatus abtestingStatus) {
        Intrinsics.checkNotNullParameter(abtestingStatus, "<set-?>");
        this.status = abtestingStatus;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public final List<AbtestingCondition> getAbtestingConditions() {
        List<AbtestingCondition> list = this.abtestingConditions;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingConditions");
        }
        return list;
    }

    public final void setAbtestingConditions(List<AbtestingCondition> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.abtestingConditions = list;
    }

    public final List<AbtestingVariable> getAbtestingVariables() {
        List<AbtestingVariable> list = this.abtestingVariables;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingVariables");
        }
        return list;
    }

    public final void setAbtestingVariables(List<AbtestingVariable> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.abtestingVariables = list;
    }

    public final String getRecordVariable() {
        return this.recordVariable;
    }

    public final void setRecordVariable(String str) {
        this.recordVariable = str;
    }

    public final String getRecordVariableData() {
        return this.recordVariableData;
    }

    public final void setRecordVariableData(String str) {
        this.recordVariableData = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Abtesting(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.abtesting.generatedAPI.kotlinAPI.config.Abtesting.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.abtestingId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingId");
        }
        hashMap.put("abtestingId", str);
        AbtestingStatus abtestingStatus = this.status;
        if (abtestingStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("status");
        }
        hashMap.put("status", Integer.valueOf(abtestingStatus.getValue()));
        hashMap.put("priority", Integer.valueOf(this.priority));
        AbtestingCondition.Companion companion = AbtestingCondition.INSTANCE;
        List<AbtestingCondition> list = this.abtestingConditions;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingConditions");
        }
        hashMap.put("abtestingConditions", companion.getAbtestingConditionJsonArrayMap(list));
        AbtestingVariable.Companion companion2 = AbtestingVariable.INSTANCE;
        List<AbtestingVariable> list2 = this.abtestingVariables;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingVariables");
        }
        hashMap.put("abtestingVariables", companion2.getAbtestingVariableJsonArrayMap(list2));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Abtesting)) {
            return false;
        }
        if (this.abtestingId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingId");
        }
        Abtesting abtesting = (Abtesting) other;
        if (abtesting.abtestingId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingId");
        }
        if (!Intrinsics.areEqual(r1, r3)) {
            return false;
        }
        AbtestingStatus abtestingStatus = this.status;
        if (abtestingStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("status");
        }
        AbtestingStatus abtestingStatus2 = abtesting.status;
        if (abtestingStatus2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("status");
        }
        if (abtestingStatus != abtestingStatus2 || this.priority != abtesting.priority) {
            return false;
        }
        if (this.abtestingConditions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingConditions");
        }
        if (abtesting.abtestingConditions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingConditions");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        List<AbtestingVariable> list = this.abtestingVariables;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingVariables");
        }
        List<AbtestingVariable> list2 = abtesting.abtestingVariables;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingVariables");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.abtestingId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingId");
        }
        int hashCode2 = (hashCode + str.hashCode()) * 31;
        AbtestingStatus abtestingStatus = this.status;
        if (abtestingStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("status");
        }
        int hashCode3 = (((hashCode2 + abtestingStatus.hashCode()) * 31) + Integer.valueOf(this.priority).hashCode()) * 31;
        List<AbtestingCondition> list = this.abtestingConditions;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingConditions");
        }
        int hashCode4 = (hashCode3 + list.hashCode()) * 31;
        List<AbtestingVariable> list2 = this.abtestingVariables;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingVariables");
        }
        return hashCode4 + list2.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Abtesting abtesting = new Abtesting(0, 1, null);
        cloneTo(abtesting);
        return abtesting;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            Abtesting abtesting = (Abtesting) o;
            super.cloneTo(abtesting);
            String str = this.abtestingId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("abtestingId");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.abtestingId)");
            abtesting.abtestingId = cloneField;
            Enum r0 = this.status;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("status");
            }
            Enum cloneField2 = cloneField(r0);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.status)");
            abtesting.status = (AbtestingStatus) cloneField2;
            Integer cloneField3 = cloneField(Integer.valueOf(this.priority));
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.priority)");
            abtesting.priority = cloneField3.intValue();
            abtesting.abtestingConditions = new ArrayList();
            List<AbtestingCondition> list = this.abtestingConditions;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("abtestingConditions");
            }
            Intrinsics.checkNotNull(list);
            for (APIModelBase aPIModelBase : list) {
                List<AbtestingCondition> list2 = abtesting.abtestingConditions;
                if (list2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("abtestingConditions");
                }
                Intrinsics.checkNotNull(list2);
                APIModelBase cloneField4 = cloneField(aPIModelBase);
                Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(item)");
                list2.add(cloneField4);
            }
            abtesting.abtestingVariables = new ArrayList();
            List<AbtestingVariable> list3 = this.abtestingVariables;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("abtestingVariables");
            }
            Intrinsics.checkNotNull(list3);
            for (APIModelBase aPIModelBase2 : list3) {
                List<AbtestingVariable> list4 = abtesting.abtestingVariables;
                if (list4 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("abtestingVariables");
                }
                Intrinsics.checkNotNull(list4);
                APIModelBase cloneField5 = cloneField(aPIModelBase2);
                Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(item)");
                list4.add(cloneField5);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.abtesting.generatedAPI.kotlinAPI.config.Abtesting");
    }

    /* compiled from: Abtesting.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/Abtesting$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getAbtestingJsonArrayMap", "", "array", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/Abtesting;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getAbtestingJsonArrayMap(List<Abtesting> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Abtesting) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("abtestingConditions", AbtestingCondition.class);
            hashMap.put("abtestingVariables", AbtestingVariable.class);
            return hashMap;
        }
    }
}
