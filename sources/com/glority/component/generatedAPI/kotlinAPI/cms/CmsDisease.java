package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsLayout;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag;
import com.glority.component.generatedAPI.kotlinAPI.enums.DiseaseLevel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsDisease.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001LB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010>H\u0014J\t\u0010B\u001a\u00020\bHÂ\u0003J\u0013\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010>H\u0096\u0002J\u0016\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010>0HH\u0016J\u001c\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010>0H2\u0006\u0010I\u001a\u00020EJ\b\u0010J\u001a\u00020\bH\u0016J\t\u0010K\u001a\u00020\"HÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R6\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR6\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00112\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R*\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010(\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R*\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\n\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00101\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R*\u00105\u001a\u0004\u0018\u0001042\b\u0010\n\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010:\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsDisease;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsArticle;", "article", "getArticle", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsArticle;", "setArticle", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsArticle;)V", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsLayout;", "cmsLayouts", "getCmsLayouts", "()Ljava/util/List;", "setCmsLayouts", "(Ljava/util/List;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "cmsStaticUrl", "getCmsStaticUrl", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "setCmsStaticUrl", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;", "cmsTags", "getCmsTags", "setCmsTags", "", "commonName", "getCommonName", "()Ljava/lang/String;", "setCommonName", "(Ljava/lang/String;)V", "desc", "getDesc", "setDesc", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/DiagnoseDetect;", "diagnoseDetect", "getDiagnoseDetect", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/DiagnoseDetect;", "setDiagnoseDetect", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/DiagnoseDetect;)V", "diseaseImageUrl", "getDiseaseImageUrl", "setDiseaseImageUrl", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DiseaseLevel;", "diseaseLevel", "getDiseaseLevel", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/DiseaseLevel;", "setDiseaseLevel", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DiseaseLevel;)V", "symptomSummary", "getSymptomSummary", "setSymptomSummary", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsDisease extends APIModelBase<CmsDisease> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CmsArticle article;
    private List<CmsLayout> cmsLayouts;
    private CmsStaticUrl cmsStaticUrl;
    private List<CmsTag> cmsTags;
    private String commonName;
    private String desc;
    private DiagnoseDetect diagnoseDetect;
    private String diseaseImageUrl;
    private DiseaseLevel diseaseLevel;
    private String symptomSummary;
    private int unused;

    public CmsDisease() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsDisease copy$default(CmsDisease cmsDisease, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsDisease.unused;
        }
        return cmsDisease.copy(i);
    }

    public final CmsDisease copy(int unused) {
        return new CmsDisease(unused);
    }

    public String toString() {
        return "CmsDisease(unused=" + this.unused + ')';
    }

    public CmsDisease(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsDisease(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final CmsArticle getArticle() {
        CmsArticle cmsArticle = this.article;
        if (cmsArticle != null) {
            return cmsArticle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("article");
        return null;
    }

    public final void setArticle(CmsArticle cmsArticle) {
        Intrinsics.checkNotNullParameter(cmsArticle, "<set-?>");
        this.article = cmsArticle;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final String getDiseaseImageUrl() {
        return this.diseaseImageUrl;
    }

    public final void setDiseaseImageUrl(String str) {
        this.diseaseImageUrl = str;
    }

    public final List<CmsLayout> getCmsLayouts() {
        return this.cmsLayouts;
    }

    public final void setCmsLayouts(List<CmsLayout> list) {
        this.cmsLayouts = list;
    }

    public final List<CmsTag> getCmsTags() {
        return this.cmsTags;
    }

    public final void setCmsTags(List<CmsTag> list) {
        this.cmsTags = list;
    }

    public final String getCommonName() {
        return this.commonName;
    }

    public final void setCommonName(String str) {
        this.commonName = str;
    }

    public final String getSymptomSummary() {
        return this.symptomSummary;
    }

    public final void setSymptomSummary(String str) {
        this.symptomSummary = str;
    }

    public final CmsStaticUrl getCmsStaticUrl() {
        return this.cmsStaticUrl;
    }

    public final void setCmsStaticUrl(CmsStaticUrl cmsStaticUrl) {
        this.cmsStaticUrl = cmsStaticUrl;
    }

    public final DiseaseLevel getDiseaseLevel() {
        return this.diseaseLevel;
    }

    public final void setDiseaseLevel(DiseaseLevel diseaseLevel) {
        this.diseaseLevel = diseaseLevel;
    }

    public final DiagnoseDetect getDiagnoseDetect() {
        return this.diagnoseDetect;
    }

    public final void setDiagnoseDetect(DiagnoseDetect diagnoseDetect) {
        this.diagnoseDetect = diagnoseDetect;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsDisease(org.json.JSONObject r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsDisease.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("article", getArticle().getJsonMap());
        String str = this.desc;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("desc", str);
        } else if (keepNull) {
            hashMap.put("desc", null);
        }
        String str2 = this.diseaseImageUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("disease_image_url", str2);
        } else if (keepNull) {
            hashMap.put("disease_image_url", null);
        }
        if (this.cmsLayouts != null) {
            CmsLayout.Companion companion = CmsLayout.INSTANCE;
            List<CmsLayout> list = this.cmsLayouts;
            Intrinsics.checkNotNull(list);
            hashMap.put("cms_layouts", companion.getCmsLayoutJsonArrayMap(list));
        } else if (keepNull) {
            hashMap.put("cms_layouts", null);
        }
        if (this.cmsTags != null) {
            CmsTag.Companion companion2 = CmsTag.INSTANCE;
            List<CmsTag> list2 = this.cmsTags;
            Intrinsics.checkNotNull(list2);
            hashMap.put("cms_tags", companion2.getCmsTagJsonArrayMap(list2));
        } else if (keepNull) {
            hashMap.put("cms_tags", null);
        }
        String str3 = this.commonName;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("common_name", str3);
        } else if (keepNull) {
            hashMap.put("common_name", null);
        }
        String str4 = this.symptomSummary;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("symptom_summary", str4);
        } else if (keepNull) {
            hashMap.put("symptom_summary", null);
        }
        CmsStaticUrl cmsStaticUrl = this.cmsStaticUrl;
        if (cmsStaticUrl != null) {
            Intrinsics.checkNotNull(cmsStaticUrl);
            hashMap.put("cms_static_url", cmsStaticUrl.getJsonMap());
        } else if (keepNull) {
            hashMap.put("cms_static_url", null);
        }
        DiseaseLevel diseaseLevel = this.diseaseLevel;
        if (diseaseLevel != null) {
            Intrinsics.checkNotNull(diseaseLevel);
            hashMap.put("disease_level", Integer.valueOf(diseaseLevel.getValue()));
        } else if (keepNull) {
            hashMap.put("disease_level", null);
        }
        DiagnoseDetect diagnoseDetect = this.diagnoseDetect;
        if (diagnoseDetect != null) {
            Intrinsics.checkNotNull(diagnoseDetect);
            hashMap.put("diagnose_detect", diagnoseDetect.getJsonMap());
        } else if (keepNull) {
            hashMap.put("diagnose_detect", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsDisease)) {
            return false;
        }
        CmsDisease cmsDisease = (CmsDisease) other;
        return Intrinsics.areEqual(getArticle(), cmsDisease.getArticle()) && Intrinsics.areEqual(this.desc, cmsDisease.desc) && Intrinsics.areEqual(this.diseaseImageUrl, cmsDisease.diseaseImageUrl) && Intrinsics.areEqual(this.cmsLayouts, cmsDisease.cmsLayouts) && Intrinsics.areEqual(this.cmsTags, cmsDisease.cmsTags) && Intrinsics.areEqual(this.commonName, cmsDisease.commonName) && Intrinsics.areEqual(this.symptomSummary, cmsDisease.symptomSummary) && Intrinsics.areEqual(this.cmsStaticUrl, cmsDisease.cmsStaticUrl) && this.diseaseLevel == cmsDisease.diseaseLevel && Intrinsics.areEqual(this.diagnoseDetect, cmsDisease.diagnoseDetect);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + getArticle().hashCode()) * 31;
        String str = this.desc;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.diseaseImageUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<CmsLayout> list = this.cmsLayouts;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<CmsTag> list2 = this.cmsTags;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.commonName;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.symptomSummary;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        CmsStaticUrl cmsStaticUrl = this.cmsStaticUrl;
        int hashCode8 = (hashCode7 + (cmsStaticUrl != null ? cmsStaticUrl.hashCode() : 0)) * 31;
        DiseaseLevel diseaseLevel = this.diseaseLevel;
        int hashCode9 = (hashCode8 + (diseaseLevel != null ? diseaseLevel.hashCode() : 0)) * 31;
        DiagnoseDetect diagnoseDetect = this.diagnoseDetect;
        return hashCode9 + (diagnoseDetect != null ? diagnoseDetect.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsDisease cmsDisease = new CmsDisease(0, 1, null);
        cloneTo(cmsDisease);
        return cmsDisease;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsDisease cmsDisease = (CmsDisease) o;
            super.cloneTo(cmsDisease);
            APIModelBase cloneField = cloneField(getArticle());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.article)");
            cmsDisease.setArticle((CmsArticle) cloneField);
            String str = this.desc;
            cmsDisease.desc = str != null ? cloneField(str) : null;
            String str2 = this.diseaseImageUrl;
            cmsDisease.diseaseImageUrl = str2 != null ? cloneField(str2) : null;
            if (this.cmsLayouts == null) {
                cmsDisease.cmsLayouts = null;
            } else {
                cmsDisease.cmsLayouts = new ArrayList();
                List<CmsLayout> list = this.cmsLayouts;
                Intrinsics.checkNotNull(list);
                for (APIModelBase aPIModelBase : list) {
                    List<CmsLayout> list2 = cmsDisease.cmsLayouts;
                    Intrinsics.checkNotNull(list2);
                    APIModelBase cloneField2 = cloneField(aPIModelBase);
                    Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(item)");
                    list2.add(cloneField2);
                }
            }
            if (this.cmsTags == null) {
                cmsDisease.cmsTags = null;
            } else {
                cmsDisease.cmsTags = new ArrayList();
                List<CmsTag> list3 = this.cmsTags;
                Intrinsics.checkNotNull(list3);
                for (APIModelBase aPIModelBase2 : list3) {
                    List<CmsTag> list4 = cmsDisease.cmsTags;
                    Intrinsics.checkNotNull(list4);
                    APIModelBase cloneField3 = cloneField(aPIModelBase2);
                    Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                    list4.add(cloneField3);
                }
            }
            String str3 = this.commonName;
            cmsDisease.commonName = str3 != null ? cloneField(str3) : null;
            String str4 = this.symptomSummary;
            cmsDisease.symptomSummary = str4 != null ? cloneField(str4) : null;
            APIModelBase aPIModelBase3 = this.cmsStaticUrl;
            cmsDisease.cmsStaticUrl = aPIModelBase3 != null ? (CmsStaticUrl) cloneField(aPIModelBase3) : null;
            Enum r0 = this.diseaseLevel;
            cmsDisease.diseaseLevel = r0 != null ? (DiseaseLevel) cloneField(r0) : null;
            APIModelBase aPIModelBase4 = this.diagnoseDetect;
            cmsDisease.diagnoseDetect = aPIModelBase4 != null ? (DiagnoseDetect) cloneField(aPIModelBase4) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsDisease");
    }

    /* compiled from: CmsDisease.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsDisease$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsDiseaseJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsDisease;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsDiseaseJsonArrayMap(List<CmsDisease> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsDisease) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("cmsLayouts", CmsLayout.class);
            hashMap.put("cmsTags", CmsTag.class);
            return hashMap;
        }
    }
}
