package com.glority.abtesting.generatedAPI.kotlinAPI.config;

import com.glority.abtesting.generatedAPI.kotlinAPI.config.Abtesting;
import com.glority.abtesting.generatedAPI.kotlinAPI.enums.RecordType;
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

/* compiled from: AbtestingGroup.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00016B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010(H\u0014J\t\u0010,\u001a\u00020\bHÂ\u0003J\u0013\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0016\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010(02H\u0016J\u001c\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010(022\u0006\u00103\u001a\u00020/J\b\u00104\u001a\u00020\bH\u0016J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010$\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingGroup;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "abtestingId", "", "getAbtestingId", "()Ljava/lang/String;", "setAbtestingId", "(Ljava/lang/String;)V", "<set-?>", "", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/Abtesting;", "abtestings", "getAbtestings", "()Ljava/util/List;", "setAbtestings", "(Ljava/util/List;)V", "recordInGroupVariable", "getRecordInGroupVariable", "setRecordInGroupVariable", "recordInGroupVariableData", "getRecordInGroupVariableData", "setRecordInGroupVariableData", "recordType", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/RecordType;", "getRecordType", "()Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/RecordType;", "setRecordType", "(Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/RecordType;)V", "test", "getTest", "setTest", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class AbtestingGroup extends APIModelBase<AbtestingGroup> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String abtestingId;
    public List<Abtesting> abtestings;
    private String recordInGroupVariable;
    private String recordInGroupVariableData;
    private RecordType recordType;
    public String test;
    private int unused;

    public AbtestingGroup() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ AbtestingGroup copy$default(AbtestingGroup abtestingGroup, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = abtestingGroup.unused;
        }
        return abtestingGroup.copy(i);
    }

    public final AbtestingGroup copy(int unused) {
        return new AbtestingGroup(unused);
    }

    public String toString() {
        return "AbtestingGroup(unused=" + this.unused + ")";
    }

    public AbtestingGroup(int i) {
        this.unused = i;
        this.recordType = RecordType.NOT_RECORD;
    }

    public /* synthetic */ AbtestingGroup(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final List<Abtesting> getAbtestings() {
        List<Abtesting> list = this.abtestings;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestings");
        }
        return list;
    }

    public final void setAbtestings(List<Abtesting> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.abtestings = list;
    }

    public final RecordType getRecordType() {
        return this.recordType;
    }

    public final void setRecordType(RecordType recordType) {
        Intrinsics.checkNotNullParameter(recordType, "<set-?>");
        this.recordType = recordType;
    }

    public final String getRecordInGroupVariable() {
        return this.recordInGroupVariable;
    }

    public final void setRecordInGroupVariable(String str) {
        this.recordInGroupVariable = str;
    }

    public final String getRecordInGroupVariableData() {
        return this.recordInGroupVariableData;
    }

    public final void setRecordInGroupVariableData(String str) {
        this.recordInGroupVariableData = str;
    }

    public final String getAbtestingId() {
        return this.abtestingId;
    }

    public final void setAbtestingId(String str) {
        this.abtestingId = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbtestingGroup(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            r5.<init>(r1, r2, r0)
            java.lang.String r0 = "test"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto La9
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto La9
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r3 = "obj.getString(\"test\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r5.test = r0
            java.lang.String r0 = "recordType"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L3f
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L3f
            com.glority.abtesting.generatedAPI.kotlinAPI.enums.RecordType$Companion r3 = com.glority.abtesting.generatedAPI.kotlinAPI.enums.RecordType.INSTANCE
            int r0 = r6.getInt(r0)
            com.glority.abtesting.generatedAPI.kotlinAPI.enums.RecordType r0 = r3.fromValue(r0)
            r5.recordType = r0
            goto L43
        L3f:
            com.glority.abtesting.generatedAPI.kotlinAPI.enums.RecordType r0 = com.glority.abtesting.generatedAPI.kotlinAPI.enums.RecordType.RECORD_ON_AB
            r5.recordType = r0
        L43:
            java.lang.String r0 = "abtestings"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L9f
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L9f
            org.json.JSONArray r6 = r6.getJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r5.abtestings = r3
            int r3 = r6.length()
            int r3 = r3 - r2
            if (r3 < 0) goto L9e
        L65:
            java.lang.Object r2 = r6.get(r1)
            boolean r4 = r2 instanceof org.json.JSONArray
            if (r4 == 0) goto L7b
            r4 = r2
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r4 = r4.length()
            if (r4 != 0) goto L7b
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L7b:
            com.glority.abtesting.generatedAPI.kotlinAPI.config.Abtesting r4 = new com.glority.abtesting.generatedAPI.kotlinAPI.config.Abtesting
            if (r2 == 0) goto L96
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r4.<init>(r2)
            java.util.List<com.glority.abtesting.generatedAPI.kotlinAPI.config.Abtesting> r2 = r5.abtestings
            if (r2 != 0) goto L8b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L8b:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            if (r1 == r3) goto L9e
            int r1 = r1 + 1
            goto L65
        L96:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type org.json.JSONObject"
            r6.<init>(r0)
            throw r6
        L9e:
            return
        L9f:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "abtestings is missing in model AbtestingGroup"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        La9:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "test is missing in model AbtestingGroup"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingGroup.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.test;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        hashMap.put("test", str);
        hashMap.put("recordType", Integer.valueOf(this.recordType.getValue()));
        Abtesting.Companion companion = Abtesting.INSTANCE;
        List<Abtesting> list = this.abtestings;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestings");
        }
        hashMap.put("abtestings", companion.getAbtestingJsonArrayMap(list));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof AbtestingGroup)) {
            return false;
        }
        if (this.test == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        AbtestingGroup abtestingGroup = (AbtestingGroup) other;
        if (abtestingGroup.test == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        if ((!Intrinsics.areEqual(r1, r3)) || this.recordType != abtestingGroup.recordType) {
            return false;
        }
        List<Abtesting> list = this.abtestings;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestings");
        }
        List<Abtesting> list2 = abtestingGroup.abtestings;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestings");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.test;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("test");
        }
        int hashCode2 = (((hashCode + str.hashCode()) * 31) + this.recordType.hashCode()) * 31;
        List<Abtesting> list = this.abtestings;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestings");
        }
        return hashCode2 + list.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        AbtestingGroup abtestingGroup = new AbtestingGroup(0, 1, null);
        cloneTo(abtestingGroup);
        return abtestingGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            AbtestingGroup abtestingGroup = (AbtestingGroup) o;
            super.cloneTo(abtestingGroup);
            String str = this.test;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("test");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.test)");
            abtestingGroup.test = cloneField;
            Enum cloneField2 = cloneField(this.recordType);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.recordType)");
            abtestingGroup.recordType = (RecordType) cloneField2;
            abtestingGroup.abtestings = new ArrayList();
            List<Abtesting> list = this.abtestings;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("abtestings");
            }
            Intrinsics.checkNotNull(list);
            for (APIModelBase aPIModelBase : list) {
                List<Abtesting> list2 = abtestingGroup.abtestings;
                if (list2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("abtestings");
                }
                Intrinsics.checkNotNull(list2);
                APIModelBase cloneField3 = cloneField(aPIModelBase);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                list2.add(cloneField3);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingGroup");
    }

    /* compiled from: AbtestingGroup.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingGroup$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getAbtestingGroupJsonArrayMap", "", "array", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingGroup;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getAbtestingGroupJsonArrayMap(List<AbtestingGroup> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbtestingGroup) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("abtestings", Abtesting.class);
            return hashMap;
        }
    }
}
