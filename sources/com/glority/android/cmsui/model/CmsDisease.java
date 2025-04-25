package com.glority.android.cmsui.model;

import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.p000enum.DiseaseLevel;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010<\u001a\u00020\u0007HÂ\u0003J\u0013\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010A0CJ\u001c\u0010B\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010A0C2\u0006\u0010D\u001a\u00020?J\t\u0010E\u001a\u00020\u0007HÖ\u0001J\t\u0010F\u001a\u00020!HÖ\u0001R&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR6\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\t\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR6\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00102\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R*\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\t\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010'\u001a\u0004\u0018\u00010!2\b\u0010\t\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R*\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\t\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u0004\u0018\u00010!2\b\u0010\t\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R*\u00104\u001a\u0004\u0018\u0001032\b\u0010\t\u001a\u0004\u0018\u0001038F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u00109\u001a\u0004\u0018\u00010!2\b\u0010\t\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/glority/android/cmsui/model/CmsDisease;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/android/cmsui/model/CmsArticle;", "article", "getArticle", "()Lcom/glority/android/cmsui/model/CmsArticle;", "setArticle", "(Lcom/glority/android/cmsui/model/CmsArticle;)V", "", "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsLayouts", "getCmsLayouts", "()Ljava/util/List;", "setCmsLayouts", "(Ljava/util/List;)V", "Lcom/glority/android/cmsui/model/CmsStaticUrl;", "cmsStaticUrl", "getCmsStaticUrl", "()Lcom/glority/android/cmsui/model/CmsStaticUrl;", "setCmsStaticUrl", "(Lcom/glority/android/cmsui/model/CmsStaticUrl;)V", "Lcom/glority/android/cmsui/model/CmsTag;", "cmsTags", "getCmsTags", "setCmsTags", "", "commonName", "getCommonName", "()Ljava/lang/String;", "setCommonName", "(Ljava/lang/String;)V", "desc", "getDesc", "setDesc", "Lcom/glority/android/cmsui/model/DiagnoseDetect;", "diagnoseDetect", "getDiagnoseDetect", "()Lcom/glority/android/cmsui/model/DiagnoseDetect;", "setDiagnoseDetect", "(Lcom/glority/android/cmsui/model/DiagnoseDetect;)V", "diseaseImageUrl", "getDiseaseImageUrl", "setDiseaseImageUrl", "Lcom/glority/android/cmsui/model/enum/DiseaseLevel;", "diseaseLevel", "getDiseaseLevel", "()Lcom/glority/android/cmsui/model/enum/DiseaseLevel;", "setDiseaseLevel", "(Lcom/glority/android/cmsui/model/enum/DiseaseLevel;)V", "symptomSummary", "getSymptomSummary", "setSymptomSummary", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsDisease implements Serializable, Cloneable {

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

    public int hashCode() {
        return Integer.hashCode(this.unused);
    }

    public String toString() {
        return "CmsDisease(unused=" + this.unused + ")";
    }

    public CmsDisease(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsDisease(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Object clone() {
        return super.clone();
    }

    public final CmsArticle getArticle() {
        CmsArticle cmsArticle = this.article;
        if (cmsArticle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("article");
        }
        return cmsArticle;
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
    public CmsDisease(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.CmsDisease.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        CmsArticle cmsArticle = this.article;
        if (cmsArticle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("article");
        }
        hashMap.put("article", cmsArticle.getJsonMap());
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

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsDisease)) {
            return false;
        }
        CmsArticle cmsArticle = this.article;
        if (cmsArticle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("article");
        }
        CmsDisease cmsDisease = (CmsDisease) other;
        CmsArticle cmsArticle2 = cmsDisease.article;
        if (cmsArticle2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("article");
        }
        return ((Intrinsics.areEqual(cmsArticle, cmsArticle2) ^ true) || (Intrinsics.areEqual(this.desc, cmsDisease.desc) ^ true) || (Intrinsics.areEqual(this.diseaseImageUrl, cmsDisease.diseaseImageUrl) ^ true) || (Intrinsics.areEqual(this.cmsLayouts, cmsDisease.cmsLayouts) ^ true) || (Intrinsics.areEqual(this.cmsTags, cmsDisease.cmsTags) ^ true) || (Intrinsics.areEqual(this.commonName, cmsDisease.commonName) ^ true) || (Intrinsics.areEqual(this.symptomSummary, cmsDisease.symptomSummary) ^ true) || (Intrinsics.areEqual(this.cmsStaticUrl, cmsDisease.cmsStaticUrl) ^ true) || this.diseaseLevel != cmsDisease.diseaseLevel || (Intrinsics.areEqual(this.diagnoseDetect, cmsDisease.diagnoseDetect) ^ true)) ? false : true;
    }

    /* compiled from: CmsDisease.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/CmsDisease$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsDiseaseJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/CmsDisease;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
