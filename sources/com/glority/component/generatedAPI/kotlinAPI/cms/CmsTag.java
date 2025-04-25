package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.component.generatedAPI.kotlinAPI.enums.CmsTagValueType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsTag.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001;B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010/\u001a\u00020\u001cH\u0016J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0014J\t\u00103\u001a\u00020\bHÂ\u0003J\u0013\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00105\u001a\u00020(2\b\u00106\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\u0016\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016J\u001c\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u00108\u001a\u00020(J\b\u00109\u001a\u00020\bH\u0016J\t\u0010:\u001a\u00020\u0011HÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016RN\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b0\u001a2\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b0\u001a8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\"8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\n\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006<"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;", "cmsTitle", "getCmsTitle", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;", "setCmsTitle", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;)V", "", "sourceUrl", "getSourceUrl", "()Ljava/lang/String;", "setSourceUrl", "(Ljava/lang/String;)V", "tagName", "getTagName", "setTagName", "", "", "", "tagValues", "getTagValues", "()Ljava/util/List;", "setTagValues", "(Ljava/util/List;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "type", "getType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "setType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;)V", "", "withEdibleOrMedicalInfo", "getWithEdibleOrMedicalInfo", "()Ljava/lang/Boolean;", "setWithEdibleOrMedicalInfo", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "clone", "cloneTo", "", "o", "component1", "copy", "equals", "other", "getJsonMap", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsTag extends APIModelBase<CmsTag> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CmsTitle cmsTitle;
    private String sourceUrl;
    public String tagName;
    public List<Map<String, Object>> tagValues;
    public CmsTagValueType type;
    private int unused;
    private Boolean withEdibleOrMedicalInfo;

    public CmsTag() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsTag copy$default(CmsTag cmsTag, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsTag.unused;
        }
        return cmsTag.copy(i);
    }

    public final CmsTag copy(int unused) {
        return new CmsTag(unused);
    }

    public String toString() {
        return "CmsTag(unused=" + this.unused + ')';
    }

    public CmsTag(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTag(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final String getTagName() {
        String str = this.tagName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tagName");
        return null;
    }

    public final void setTagName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagName = str;
    }

    public final CmsTitle getCmsTitle() {
        return this.cmsTitle;
    }

    public final void setCmsTitle(CmsTitle cmsTitle) {
        this.cmsTitle = cmsTitle;
    }

    public final List<Map<String, Object>> getTagValues() {
        List<Map<String, Object>> list = this.tagValues;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tagValues");
        return null;
    }

    public final void setTagValues(List<Map<String, Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tagValues = list;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    public final Boolean getWithEdibleOrMedicalInfo() {
        return this.withEdibleOrMedicalInfo;
    }

    public final void setWithEdibleOrMedicalInfo(Boolean bool) {
        this.withEdibleOrMedicalInfo = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsTag(org.json.JSONObject r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType().getValue()));
        hashMap.put("tag_name", getTagName());
        CmsTitle cmsTitle = this.cmsTitle;
        if (cmsTitle != null) {
            Intrinsics.checkNotNull(cmsTitle);
            hashMap.put("cms_title", cmsTitle.getJsonMap());
        } else if (keepNull) {
            hashMap.put("cms_title", null);
        }
        hashMap.put("tag_values", getTagValues());
        String str = this.sourceUrl;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("source_url", str);
        } else if (keepNull) {
            hashMap.put("source_url", null);
        }
        Boolean bool = this.withEdibleOrMedicalInfo;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            hashMap.put("with_edible_or_medical_info", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        } else if (keepNull) {
            hashMap.put("with_edible_or_medical_info", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTag)) {
            return false;
        }
        CmsTag cmsTag = (CmsTag) other;
        return getType() == cmsTag.getType() && Intrinsics.areEqual(getTagName(), cmsTag.getTagName()) && Intrinsics.areEqual(this.cmsTitle, cmsTag.cmsTitle) && Intrinsics.areEqual(getTagValues(), cmsTag.getTagValues()) && Intrinsics.areEqual(this.sourceUrl, cmsTag.sourceUrl) && Intrinsics.areEqual(this.withEdibleOrMedicalInfo, cmsTag.withEdibleOrMedicalInfo);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getType().hashCode()) * 31) + getTagName().hashCode()) * 31;
        CmsTitle cmsTitle = this.cmsTitle;
        int hashCode2 = (((hashCode + (cmsTitle != null ? cmsTitle.hashCode() : 0)) * 31) + getTagValues().hashCode()) * 31;
        String str = this.sourceUrl;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.withEdibleOrMedicalInfo;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsTag cmsTag = new CmsTag(0, 1, null);
        cloneTo(cmsTag);
        return cmsTag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsTag cmsTag = (CmsTag) o;
            super.cloneTo(cmsTag);
            Enum cloneField = cloneField(getType());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.type)");
            cmsTag.setType((CmsTagValueType) cloneField);
            String cloneField2 = cloneField(getTagName());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.tagName)");
            cmsTag.setTagName(cloneField2);
            APIModelBase aPIModelBase = this.cmsTitle;
            cmsTag.cmsTitle = aPIModelBase != null ? (CmsTitle) cloneField(aPIModelBase) : null;
            cmsTag.setTagValues(new ArrayList());
            List<Map<String, Object>> tagValues = getTagValues();
            Intrinsics.checkNotNull(tagValues);
            for (Map<String, Object> map : tagValues) {
                List<Map<String, Object>> tagValues2 = cmsTag.getTagValues();
                Intrinsics.checkNotNull(tagValues2);
                Map<String, Object> cloneField3 = cloneField(map);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                tagValues2.add(cloneField3);
            }
            String str = this.sourceUrl;
            cmsTag.sourceUrl = str != null ? cloneField(str) : null;
            Boolean bool = this.withEdibleOrMedicalInfo;
            cmsTag.withEdibleOrMedicalInfo = bool != null ? cloneField(bool) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag");
    }

    /* compiled from: CmsTag.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsTagJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsTagJsonArrayMap(List<CmsTag> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsTag) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("tagValues", Map.class);
            return hashMap;
        }
    }
}
