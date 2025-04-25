package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.component.generatedAPI.kotlinAPI.enums.CmsTagValueType;
import com.glority.component.generatedAPI.kotlinAPI.enums.TaxonomyType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsTaxonomyName.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010*H\u0014J\t\u0010.\u001a\u00020\bHÂ\u0003J\u0013\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0016\u00103\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010*04H\u0016J\u001c\u00103\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010*042\u0006\u00105\u001a\u000201J\b\u00106\u001a\u00020\bH\u0016J\t\u00107\u001a\u00020\fHÖ\u0001R6\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R&\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R&\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020#8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTaxonomyName;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "", "commonNames", "getCommonNames", "()Ljava/util/List;", "setCommonNames", "(Ljava/util/List;)V", "latinName", "getLatinName", "()Ljava/lang/String;", "setLatinName", "(Ljava/lang/String;)V", "preferredName", "getPreferredName", "setPreferredName", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/TaxonomyType;", "taxonomyType", "getTaxonomyType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/TaxonomyType;", "setTaxonomyType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/TaxonomyType;)V", "taxonomyTypeName", "getTaxonomyTypeName", "setTaxonomyTypeName", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "type", "getType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "setType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsTaxonomyName extends APIModelBase<CmsTaxonomyName> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<String> commonNames;
    public String latinName;
    public String preferredName;
    public TaxonomyType taxonomyType;
    private String taxonomyTypeName;
    public CmsTagValueType type;
    private int unused;

    public CmsTaxonomyName() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsTaxonomyName copy$default(CmsTaxonomyName cmsTaxonomyName, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsTaxonomyName.unused;
        }
        return cmsTaxonomyName.copy(i);
    }

    public final CmsTaxonomyName copy(int unused) {
        return new CmsTaxonomyName(unused);
    }

    public String toString() {
        return "CmsTaxonomyName(unused=" + this.unused + ')';
    }

    public CmsTaxonomyName(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTaxonomyName(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final CmsTagValueType getType() {
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType != null) {
            return cmsTagValueType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    public final void setType(CmsTagValueType cmsTagValueType) {
        Intrinsics.checkNotNullParameter(cmsTagValueType, "<set-?>");
        this.type = cmsTagValueType;
    }

    public final TaxonomyType getTaxonomyType() {
        TaxonomyType taxonomyType = this.taxonomyType;
        if (taxonomyType != null) {
            return taxonomyType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("taxonomyType");
        return null;
    }

    public final void setTaxonomyType(TaxonomyType taxonomyType) {
        Intrinsics.checkNotNullParameter(taxonomyType, "<set-?>");
        this.taxonomyType = taxonomyType;
    }

    public final String getTaxonomyTypeName() {
        return this.taxonomyTypeName;
    }

    public final void setTaxonomyTypeName(String str) {
        this.taxonomyTypeName = str;
    }

    public final String getPreferredName() {
        String str = this.preferredName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preferredName");
        return null;
    }

    public final void setPreferredName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.preferredName = str;
    }

    public final String getLatinName() {
        String str = this.latinName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("latinName");
        return null;
    }

    public final void setLatinName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.latinName = str;
    }

    public final List<String> getCommonNames() {
        return this.commonNames;
    }

    public final void setCommonNames(List<String> list) {
        this.commonNames = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsTaxonomyName(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            r5.<init>(r0, r1, r2)
            java.lang.String r3 = "type"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Le1
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Le1
            com.glority.component.generatedAPI.kotlinAPI.enums.CmsTagValueType$Companion r4 = com.glority.component.generatedAPI.kotlinAPI.enums.CmsTagValueType.INSTANCE
            int r3 = r6.getInt(r3)
            com.glority.component.generatedAPI.kotlinAPI.enums.CmsTagValueType r3 = r4.fromValue(r3)
            r5.setType(r3)
            java.lang.String r3 = "taxonomy_type"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Ld9
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Ld9
            com.glority.component.generatedAPI.kotlinAPI.enums.TaxonomyType$Companion r4 = com.glority.component.generatedAPI.kotlinAPI.enums.TaxonomyType.INSTANCE
            int r3 = r6.getInt(r3)
            com.glority.component.generatedAPI.kotlinAPI.enums.TaxonomyType r3 = r4.fromValue(r3)
            r5.setTaxonomyType(r3)
            java.lang.String r3 = "taxonomy_type_name"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto L56
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto L56
            java.lang.String r3 = r6.getString(r3)
            r5.taxonomyTypeName = r3
            goto L58
        L56:
            r5.taxonomyTypeName = r2
        L58:
            java.lang.String r3 = "preferred_name"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Ld1
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Ld1
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = "obj.getString(\"preferred_name\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.setPreferredName(r3)
            java.lang.String r3 = "latin_name"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lc9
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lc9
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = "obj.getString(\"latin_name\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.setLatinName(r3)
            java.lang.String r3 = "common_names"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lc6
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lc6
            org.json.JSONArray r6 = r6.getJSONArray(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r5.commonNames = r2
            int r2 = r6.length()
            int r2 = r2 - r1
            if (r2 < 0) goto Lc8
        Lae:
            int r1 = r0 + 1
            java.lang.String r3 = r6.getString(r0)
            java.lang.String r4 = "__commonNames.getString(i0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.List<java.lang.String> r4 = r5.commonNames
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r4.add(r3)
            if (r0 != r2) goto Lc4
            goto Lc8
        Lc4:
            r0 = r1
            goto Lae
        Lc6:
            r5.commonNames = r2
        Lc8:
            return
        Lc9:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "latinName is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            throw r6
        Ld1:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "preferredName is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            throw r6
        Ld9:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "taxonomyType is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            throw r6
        Le1:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "type is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsTaxonomyName.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType().getValue()));
        hashMap.put("taxonomy_type", Integer.valueOf(getTaxonomyType().getValue()));
        String str = this.taxonomyTypeName;
        if (str != null) {
            hashMap.put("taxonomy_type_name", str);
        } else if (keepNull) {
            hashMap.put("taxonomy_type_name", null);
        }
        hashMap.put("preferred_name", getPreferredName());
        hashMap.put("latin_name", getLatinName());
        List<String> list = this.commonNames;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("common_names", list);
        } else if (keepNull) {
            hashMap.put("common_names", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTaxonomyName)) {
            return false;
        }
        CmsTaxonomyName cmsTaxonomyName = (CmsTaxonomyName) other;
        return getType() == cmsTaxonomyName.getType() && getTaxonomyType() == cmsTaxonomyName.getTaxonomyType() && Intrinsics.areEqual(this.taxonomyTypeName, cmsTaxonomyName.taxonomyTypeName) && Intrinsics.areEqual(getPreferredName(), cmsTaxonomyName.getPreferredName()) && Intrinsics.areEqual(getLatinName(), cmsTaxonomyName.getLatinName()) && Intrinsics.areEqual(this.commonNames, cmsTaxonomyName.commonNames);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getType().hashCode()) * 31) + getTaxonomyType().hashCode()) * 31;
        String str = this.taxonomyTypeName;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + getPreferredName().hashCode()) * 31) + getLatinName().hashCode()) * 31;
        List<String> list = this.commonNames;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsTaxonomyName cmsTaxonomyName = new CmsTaxonomyName(0, 1, null);
        cloneTo(cmsTaxonomyName);
        return cmsTaxonomyName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsTaxonomyName cmsTaxonomyName = (CmsTaxonomyName) o;
            super.cloneTo(cmsTaxonomyName);
            Enum cloneField = cloneField(getType());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.type)");
            cmsTaxonomyName.setType((CmsTagValueType) cloneField);
            Enum cloneField2 = cloneField(getTaxonomyType());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.taxonomyType)");
            cmsTaxonomyName.setTaxonomyType((TaxonomyType) cloneField2);
            cmsTaxonomyName.taxonomyTypeName = cloneField(this.taxonomyTypeName);
            String cloneField3 = cloneField(getPreferredName());
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.preferredName)");
            cmsTaxonomyName.setPreferredName(cloneField3);
            String cloneField4 = cloneField(getLatinName());
            Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(this.latinName)");
            cmsTaxonomyName.setLatinName(cloneField4);
            if (this.commonNames == null) {
                cmsTaxonomyName.commonNames = null;
                return;
            }
            cmsTaxonomyName.commonNames = new ArrayList();
            List<String> list = this.commonNames;
            Intrinsics.checkNotNull(list);
            for (String str : list) {
                List<String> list2 = cmsTaxonomyName.commonNames;
                Intrinsics.checkNotNull(list2);
                String cloneField5 = cloneField(str);
                Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(item)");
                list2.add(cloneField5);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsTaxonomyName");
    }

    /* compiled from: CmsTaxonomyName.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTaxonomyName$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsTaxonomyNameJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTaxonomyName;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsTaxonomyNameJsonArrayMap(List<CmsTaxonomyName> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsTaxonomyName) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("commonNames", String.class);
            return hashMap;
        }
    }
}
