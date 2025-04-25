package com.glority.android.cmsui.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsTaxonomyName.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0007HÂ\u0003J\u0013\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0/J\u001c\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0/2\u0006\u00100\u001a\u00020+J\b\u00101\u001a\u00020\u0007H\u0016J\t\u00102\u001a\u00020\u000bHÖ\u0001R6\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R&\u0010#\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\"8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/glority/android/cmsui/model/CmsTaxonomyName;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "", "commonNames", "getCommonNames", "()Ljava/util/List;", "setCommonNames", "(Ljava/util/List;)V", "latinName", "getLatinName", "()Ljava/lang/String;", "setLatinName", "(Ljava/lang/String;)V", "preferredName", "getPreferredName", "setPreferredName", "Lcom/glority/android/cmsui/model/TaxonomyType;", "taxonomyType", "getTaxonomyType", "()Lcom/glority/android/cmsui/model/TaxonomyType;", "setTaxonomyType", "(Lcom/glority/android/cmsui/model/TaxonomyType;)V", "taxonomyTypeName", "getTaxonomyTypeName", "setTaxonomyTypeName", "Lcom/glority/android/cmsui/model/CmsTagValueType;", "type", "getType", "()Lcom/glority/android/cmsui/model/CmsTagValueType;", "setType", "(Lcom/glority/android/cmsui/model/CmsTagValueType;)V", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "keepNull", "hashCode", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsTaxonomyName implements Serializable, Cloneable {
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
        return "CmsTaxonomyName(unused=" + this.unused + ")";
    }

    public CmsTaxonomyName(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTaxonomyName(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Object clone() {
        return super.clone();
    }

    public final CmsTagValueType getType() {
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return cmsTagValueType;
    }

    public final void setType(CmsTagValueType cmsTagValueType) {
        Intrinsics.checkNotNullParameter(cmsTagValueType, "<set-?>");
        this.type = cmsTagValueType;
    }

    public final TaxonomyType getTaxonomyType() {
        TaxonomyType taxonomyType = this.taxonomyType;
        if (taxonomyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxonomyType");
        }
        return taxonomyType;
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
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferredName");
        }
        return str;
    }

    public final void setPreferredName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.preferredName = str;
    }

    public final String getLatinName() {
        String str = this.latinName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("latinName");
        }
        return str;
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
            if (r4 == 0) goto Le7
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Le7
            com.glority.android.cmsui.model.CmsTagValueType$Companion r4 = com.glority.android.cmsui.model.CmsTagValueType.INSTANCE
            int r3 = r6.getInt(r3)
            com.glority.android.cmsui.model.CmsTagValueType r3 = r4.fromValue(r3)
            r5.type = r3
            java.lang.String r3 = "taxonomy_type"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Ldd
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Ldd
            com.glority.android.cmsui.model.TaxonomyType$Companion r4 = com.glority.android.cmsui.model.TaxonomyType.INSTANCE
            int r3 = r6.getInt(r3)
            com.glority.android.cmsui.model.TaxonomyType r3 = r4.fromValue(r3)
            r5.taxonomyType = r3
            java.lang.String r3 = "taxonomy_type_name"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto L54
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto L54
            java.lang.String r3 = r6.getString(r3)
            r5.taxonomyTypeName = r3
            goto L59
        L54:
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            r5.taxonomyTypeName = r2
        L59:
            java.lang.String r3 = "preferred_name"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Ld3
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Ld3
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = "obj.getString(\"preferred_name\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.preferredName = r3
            java.lang.String r3 = "latin_name"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lc9
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lc9
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = "obj.getString(\"latin_name\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.latinName = r3
            java.lang.String r3 = "common_names"
            boolean r4 = r6.has(r3)
            if (r4 == 0) goto Lc3
            boolean r4 = r6.isNull(r3)
            if (r4 != 0) goto Lc3
            org.json.JSONArray r6 = r6.getJSONArray(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r5.commonNames = r2
            int r2 = r6.length()
            int r2 = r2 - r1
            if (r2 < 0) goto Lc8
        Lad:
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r3 = "__commonNames.getString(i0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.util.List<java.lang.String> r3 = r5.commonNames
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r3.add(r1)
            if (r0 == r2) goto Lc8
            int r0 = r0 + 1
            goto Lad
        Lc3:
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r5.commonNames = r2
        Lc8:
            return
        Lc9:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "latinName is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        Ld3:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "preferredName is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        Ldd:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "taxonomyType is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        Le7:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "type is missing in model CmsTaxonomyName"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.CmsTaxonomyName.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        hashMap.put("type", Integer.valueOf(cmsTagValueType.getValue()));
        TaxonomyType taxonomyType = this.taxonomyType;
        if (taxonomyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxonomyType");
        }
        hashMap.put("taxonomy_type", Integer.valueOf(taxonomyType.getValue()));
        String str = this.taxonomyTypeName;
        if (str != null) {
            hashMap.put("taxonomy_type_name", str);
        } else if (keepNull) {
            hashMap.put("taxonomy_type_name", null);
        }
        String str2 = this.preferredName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferredName");
        }
        hashMap.put("preferred_name", str2);
        String str3 = this.latinName;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("latinName");
        }
        hashMap.put("latin_name", str3);
        List<String> list = this.commonNames;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("common_names", list);
        } else if (keepNull) {
            hashMap.put("common_names", null);
        }
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTaxonomyName)) {
            return false;
        }
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        CmsTaxonomyName cmsTaxonomyName = (CmsTaxonomyName) other;
        CmsTagValueType cmsTagValueType2 = cmsTaxonomyName.type;
        if (cmsTagValueType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        if (cmsTagValueType != cmsTagValueType2) {
            return false;
        }
        TaxonomyType taxonomyType = this.taxonomyType;
        if (taxonomyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxonomyType");
        }
        TaxonomyType taxonomyType2 = cmsTaxonomyName.taxonomyType;
        if (taxonomyType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxonomyType");
        }
        if (taxonomyType != taxonomyType2 || (!Intrinsics.areEqual(this.taxonomyTypeName, cmsTaxonomyName.taxonomyTypeName))) {
            return false;
        }
        if (this.preferredName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferredName");
        }
        if (cmsTaxonomyName.preferredName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferredName");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        String str = this.latinName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("latinName");
        }
        String str2 = cmsTaxonomyName.latinName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("latinName");
        }
        return ((Intrinsics.areEqual(str, str2) ^ true) || (Intrinsics.areEqual(this.commonNames, cmsTaxonomyName.commonNames) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        int hashCode2 = (hashCode + cmsTagValueType.hashCode()) * 31;
        TaxonomyType taxonomyType = this.taxonomyType;
        if (taxonomyType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxonomyType");
        }
        int hashCode3 = (hashCode2 + taxonomyType.hashCode()) * 31;
        String str = this.taxonomyTypeName;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.preferredName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferredName");
        }
        int hashCode5 = (hashCode4 + str2.hashCode()) * 31;
        String str3 = this.latinName;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("latinName");
        }
        int hashCode6 = (hashCode5 + str3.hashCode()) * 31;
        List<String> list = this.commonNames;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }
}
