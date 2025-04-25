package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsLayout;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag;
import com.glority.component.generatedAPI.kotlinAPI.cms.SimpleCmsName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsName.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001XB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010I\u001a\u00020JH\u0016J\u0012\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010JH\u0014J\t\u0010N\u001a\u00020\bHÂ\u0003J\u0013\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010JH\u0096\u0002J\u0016\u0010S\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0006\u0012\u0004\u0018\u00010J0TH\u0016J\u001c\u0010S\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0006\u0012\u0004\u0018\u00010J0T2\u0006\u0010U\u001a\u00020QJ\b\u0010V\u001a\u00020\bH\u0016J\t\u0010W\u001a\u00020CHÖ\u0001R6\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R6\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R*\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\n\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R2\u0010.\u001a\b\u0012\u0004\u0012\u00020(0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020(0\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R&\u00102\u001a\u0002012\u0006\u0010\n\u001a\u0002018F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R6\u00107\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0011R2\u0010:\u001a\b\u0012\u0004\u0012\u0002010\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002010\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R*\u0010=\u001a\u0004\u0018\u0001012\b\u0010\n\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00104\"\u0004\b?\u00106R*\u0010@\u001a\u0004\u0018\u0001012\b\u0010\n\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00104\"\u0004\bB\u00106R&\u0010D\u001a\u00020C2\u0006\u0010\n\u001a\u00020C8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/SimpleCmsName;", "children", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "cmsStaticUrl", "getCmsStaticUrl", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "setCmsStaticUrl", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;", "confusion", "getConfusion", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;", "setConfusion", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsDisease;", CmsUILogEvents.CMS_DISEASE, "getDisease", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsDisease;", "setDisease", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsDisease;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsLayout;", "layouts", "getLayouts", "setLayouts", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "mainImage", "getMainImage", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "setMainImage", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;)V", "matchedSimilarImages", "getMatchedSimilarImages", "setMatchedSimilarImages", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/TaxonomyName;", "name", "getName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/TaxonomyName;", "setName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/TaxonomyName;)V", "tags", "getTags", "setTags", "taxonomies", "getTaxonomies", "setTaxonomies", "taxonomyFamilyParent", "getTaxonomyFamilyParent", "setTaxonomyFamilyParent", "taxonomyParent", "getTaxonomyParent", "setTaxonomyParent", "", Args.uid, "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsName extends APIModelBase<CmsName> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<SimpleCmsName> children;
    private CmsStaticUrl cmsStaticUrl;
    private CmsTag confusion;
    private CmsDisease disease;
    private List<CmsLayout> layouts;
    private CmsImage mainImage;
    public List<CmsImage> matchedSimilarImages;
    public TaxonomyName name;
    private List<CmsTag> tags;
    public List<TaxonomyName> taxonomies;
    private TaxonomyName taxonomyFamilyParent;
    private TaxonomyName taxonomyParent;
    public String uid;
    private int unused;

    public CmsName() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsName copy$default(CmsName cmsName, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsName.unused;
        }
        return cmsName.copy(i);
    }

    public final CmsName copy(int unused) {
        return new CmsName(unused);
    }

    public String toString() {
        return "CmsName(unused=" + this.unused + ')';
    }

    public CmsName(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsName(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getUid() {
        String str = this.uid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        return null;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final TaxonomyName getName() {
        TaxonomyName taxonomyName = this.name;
        if (taxonomyName != null) {
            return taxonomyName;
        }
        Intrinsics.throwUninitializedPropertyAccessException("name");
        return null;
    }

    public final void setName(TaxonomyName taxonomyName) {
        Intrinsics.checkNotNullParameter(taxonomyName, "<set-?>");
        this.name = taxonomyName;
    }

    public final TaxonomyName getTaxonomyParent() {
        return this.taxonomyParent;
    }

    public final void setTaxonomyParent(TaxonomyName taxonomyName) {
        this.taxonomyParent = taxonomyName;
    }

    public final TaxonomyName getTaxonomyFamilyParent() {
        return this.taxonomyFamilyParent;
    }

    public final void setTaxonomyFamilyParent(TaxonomyName taxonomyName) {
        this.taxonomyFamilyParent = taxonomyName;
    }

    public final List<TaxonomyName> getTaxonomies() {
        List<TaxonomyName> list = this.taxonomies;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("taxonomies");
        return null;
    }

    public final void setTaxonomies(List<TaxonomyName> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.taxonomies = list;
    }

    public final List<SimpleCmsName> getChildren() {
        return this.children;
    }

    public final void setChildren(List<SimpleCmsName> list) {
        this.children = list;
    }

    public final List<CmsLayout> getLayouts() {
        return this.layouts;
    }

    public final void setLayouts(List<CmsLayout> list) {
        this.layouts = list;
    }

    public final List<CmsTag> getTags() {
        return this.tags;
    }

    public final void setTags(List<CmsTag> list) {
        this.tags = list;
    }

    public final CmsImage getMainImage() {
        return this.mainImage;
    }

    public final void setMainImage(CmsImage cmsImage) {
        this.mainImage = cmsImage;
    }

    public final List<CmsImage> getMatchedSimilarImages() {
        List<CmsImage> list = this.matchedSimilarImages;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchedSimilarImages");
        return null;
    }

    public final void setMatchedSimilarImages(List<CmsImage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.matchedSimilarImages = list;
    }

    public final CmsTag getConfusion() {
        return this.confusion;
    }

    public final void setConfusion(CmsTag cmsTag) {
        this.confusion = cmsTag;
    }

    public final CmsDisease getDisease() {
        return this.disease;
    }

    public final void setDisease(CmsDisease cmsDisease) {
        this.disease = cmsDisease;
    }

    public final CmsStaticUrl getCmsStaticUrl() {
        return this.cmsStaticUrl;
    }

    public final void setCmsStaticUrl(CmsStaticUrl cmsStaticUrl) {
        this.cmsStaticUrl = cmsStaticUrl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsName(org.json.JSONObject r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsName.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        hashMap.put("name", getName().getJsonMap());
        TaxonomyName taxonomyName = this.taxonomyParent;
        if (taxonomyName != null) {
            Intrinsics.checkNotNull(taxonomyName);
            hashMap.put("taxonomy_parent", taxonomyName.getJsonMap());
        } else if (keepNull) {
            hashMap.put("taxonomy_parent", null);
        }
        TaxonomyName taxonomyName2 = this.taxonomyFamilyParent;
        if (taxonomyName2 != null) {
            Intrinsics.checkNotNull(taxonomyName2);
            hashMap.put("taxonomy_family_parent", taxonomyName2.getJsonMap());
        } else if (keepNull) {
            hashMap.put("taxonomy_family_parent", null);
        }
        hashMap.put("taxonomies", TaxonomyName.INSTANCE.getTaxonomyNameJsonArrayMap(getTaxonomies()));
        if (this.children != null) {
            SimpleCmsName.Companion companion = SimpleCmsName.INSTANCE;
            List<SimpleCmsName> list = this.children;
            Intrinsics.checkNotNull(list);
            hashMap.put("children", companion.getSimpleCmsNameJsonArrayMap(list));
        } else if (keepNull) {
            hashMap.put("children", null);
        }
        if (this.layouts != null) {
            CmsLayout.Companion companion2 = CmsLayout.INSTANCE;
            List<CmsLayout> list2 = this.layouts;
            Intrinsics.checkNotNull(list2);
            hashMap.put("layouts", companion2.getCmsLayoutJsonArrayMap(list2));
        } else if (keepNull) {
            hashMap.put("layouts", null);
        }
        if (this.tags != null) {
            CmsTag.Companion companion3 = CmsTag.INSTANCE;
            List<CmsTag> list3 = this.tags;
            Intrinsics.checkNotNull(list3);
            hashMap.put("tags", companion3.getCmsTagJsonArrayMap(list3));
        } else if (keepNull) {
            hashMap.put("tags", null);
        }
        CmsImage cmsImage = this.mainImage;
        if (cmsImage != null) {
            Intrinsics.checkNotNull(cmsImage);
            hashMap.put(CmsUILogEvents.MAIN_IMAGE, cmsImage.getJsonMap());
        } else if (keepNull) {
            hashMap.put(CmsUILogEvents.MAIN_IMAGE, null);
        }
        hashMap.put("matched_similar_images", CmsImage.INSTANCE.getCmsImageJsonArrayMap(getMatchedSimilarImages()));
        CmsTag cmsTag = this.confusion;
        if (cmsTag != null) {
            Intrinsics.checkNotNull(cmsTag);
            hashMap.put("confusion", cmsTag.getJsonMap());
        } else if (keepNull) {
            hashMap.put("confusion", null);
        }
        CmsDisease cmsDisease = this.disease;
        if (cmsDisease != null) {
            Intrinsics.checkNotNull(cmsDisease);
            hashMap.put(CmsUILogEvents.CMS_DISEASE, cmsDisease.getJsonMap());
        } else if (keepNull) {
            hashMap.put(CmsUILogEvents.CMS_DISEASE, null);
        }
        CmsStaticUrl cmsStaticUrl = this.cmsStaticUrl;
        if (cmsStaticUrl != null) {
            Intrinsics.checkNotNull(cmsStaticUrl);
            hashMap.put("cms_static_url", cmsStaticUrl.getJsonMap());
        } else if (keepNull) {
            hashMap.put("cms_static_url", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsName)) {
            return false;
        }
        CmsName cmsName = (CmsName) other;
        return Intrinsics.areEqual(getUid(), cmsName.getUid()) && Intrinsics.areEqual(getName(), cmsName.getName()) && Intrinsics.areEqual(this.taxonomyParent, cmsName.taxonomyParent) && Intrinsics.areEqual(this.taxonomyFamilyParent, cmsName.taxonomyFamilyParent) && Intrinsics.areEqual(getTaxonomies(), cmsName.getTaxonomies()) && Intrinsics.areEqual(this.children, cmsName.children) && Intrinsics.areEqual(this.layouts, cmsName.layouts) && Intrinsics.areEqual(this.tags, cmsName.tags) && Intrinsics.areEqual(this.mainImage, cmsName.mainImage) && Intrinsics.areEqual(getMatchedSimilarImages(), cmsName.getMatchedSimilarImages()) && Intrinsics.areEqual(this.confusion, cmsName.confusion) && Intrinsics.areEqual(this.disease, cmsName.disease) && Intrinsics.areEqual(this.cmsStaticUrl, cmsName.cmsStaticUrl);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getUid().hashCode()) * 31) + getName().hashCode()) * 31;
        TaxonomyName taxonomyName = this.taxonomyParent;
        int hashCode2 = (hashCode + (taxonomyName != null ? taxonomyName.hashCode() : 0)) * 31;
        TaxonomyName taxonomyName2 = this.taxonomyFamilyParent;
        int hashCode3 = (((hashCode2 + (taxonomyName2 != null ? taxonomyName2.hashCode() : 0)) * 31) + getTaxonomies().hashCode()) * 31;
        List<SimpleCmsName> list = this.children;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<CmsLayout> list2 = this.layouts;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<CmsTag> list3 = this.tags;
        int hashCode6 = (hashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31;
        CmsImage cmsImage = this.mainImage;
        int hashCode7 = (((hashCode6 + (cmsImage != null ? cmsImage.hashCode() : 0)) * 31) + getMatchedSimilarImages().hashCode()) * 31;
        CmsTag cmsTag = this.confusion;
        int hashCode8 = (hashCode7 + (cmsTag != null ? cmsTag.hashCode() : 0)) * 31;
        CmsDisease cmsDisease = this.disease;
        int hashCode9 = (hashCode8 + (cmsDisease != null ? cmsDisease.hashCode() : 0)) * 31;
        CmsStaticUrl cmsStaticUrl = this.cmsStaticUrl;
        return hashCode9 + (cmsStaticUrl != null ? cmsStaticUrl.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsName cmsName = new CmsName(0, 1, null);
        cloneTo(cmsName);
        return cmsName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsName cmsName = (CmsName) o;
            super.cloneTo(cmsName);
            String cloneField = cloneField(getUid());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.uid)");
            cmsName.setUid(cloneField);
            APIModelBase cloneField2 = cloneField(getName());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.name)");
            cmsName.setName((TaxonomyName) cloneField2);
            APIModelBase aPIModelBase = this.taxonomyParent;
            cmsName.taxonomyParent = aPIModelBase != null ? (TaxonomyName) cloneField(aPIModelBase) : null;
            APIModelBase aPIModelBase2 = this.taxonomyFamilyParent;
            cmsName.taxonomyFamilyParent = aPIModelBase2 != null ? (TaxonomyName) cloneField(aPIModelBase2) : null;
            cmsName.setTaxonomies(new ArrayList());
            List<TaxonomyName> taxonomies = getTaxonomies();
            Intrinsics.checkNotNull(taxonomies);
            for (TaxonomyName taxonomyName : taxonomies) {
                List<TaxonomyName> taxonomies2 = cmsName.getTaxonomies();
                Intrinsics.checkNotNull(taxonomies2);
                APIModelBase cloneField3 = cloneField(taxonomyName);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                taxonomies2.add(cloneField3);
            }
            if (this.children == null) {
                cmsName.children = null;
            } else {
                cmsName.children = new ArrayList();
                List<SimpleCmsName> list = this.children;
                Intrinsics.checkNotNull(list);
                for (APIModelBase aPIModelBase3 : list) {
                    List<SimpleCmsName> list2 = cmsName.children;
                    Intrinsics.checkNotNull(list2);
                    APIModelBase cloneField4 = cloneField(aPIModelBase3);
                    Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(item)");
                    list2.add(cloneField4);
                }
            }
            if (this.layouts == null) {
                cmsName.layouts = null;
            } else {
                cmsName.layouts = new ArrayList();
                List<CmsLayout> list3 = this.layouts;
                Intrinsics.checkNotNull(list3);
                for (APIModelBase aPIModelBase4 : list3) {
                    List<CmsLayout> list4 = cmsName.layouts;
                    Intrinsics.checkNotNull(list4);
                    APIModelBase cloneField5 = cloneField(aPIModelBase4);
                    Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(item)");
                    list4.add(cloneField5);
                }
            }
            if (this.tags == null) {
                cmsName.tags = null;
            } else {
                cmsName.tags = new ArrayList();
                List<CmsTag> list5 = this.tags;
                Intrinsics.checkNotNull(list5);
                for (APIModelBase aPIModelBase5 : list5) {
                    List<CmsTag> list6 = cmsName.tags;
                    Intrinsics.checkNotNull(list6);
                    APIModelBase cloneField6 = cloneField(aPIModelBase5);
                    Intrinsics.checkNotNullExpressionValue(cloneField6, "cloneField(item)");
                    list6.add(cloneField6);
                }
            }
            APIModelBase aPIModelBase6 = this.mainImage;
            cmsName.mainImage = aPIModelBase6 != null ? (CmsImage) cloneField(aPIModelBase6) : null;
            cmsName.setMatchedSimilarImages(new ArrayList());
            List<CmsImage> matchedSimilarImages = getMatchedSimilarImages();
            Intrinsics.checkNotNull(matchedSimilarImages);
            for (CmsImage cmsImage : matchedSimilarImages) {
                List<CmsImage> matchedSimilarImages2 = cmsName.getMatchedSimilarImages();
                Intrinsics.checkNotNull(matchedSimilarImages2);
                APIModelBase cloneField7 = cloneField(cmsImage);
                Intrinsics.checkNotNullExpressionValue(cloneField7, "cloneField(item)");
                matchedSimilarImages2.add(cloneField7);
            }
            APIModelBase aPIModelBase7 = this.confusion;
            cmsName.confusion = aPIModelBase7 != null ? (CmsTag) cloneField(aPIModelBase7) : null;
            APIModelBase aPIModelBase8 = this.disease;
            cmsName.disease = aPIModelBase8 != null ? (CmsDisease) cloneField(aPIModelBase8) : null;
            APIModelBase aPIModelBase9 = this.cmsStaticUrl;
            cmsName.cmsStaticUrl = aPIModelBase9 != null ? (CmsStaticUrl) cloneField(aPIModelBase9) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsName");
    }

    /* compiled from: CmsName.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsNameJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsNameJsonArrayMap(List<CmsName> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsName) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("taxonomies", TaxonomyName.class);
            hashMap.put("children", SimpleCmsName.class);
            hashMap.put("layouts", CmsLayout.class);
            hashMap.put("tags", CmsTag.class);
            hashMap.put("matchedSimilarImages", CmsImage.class);
            return hashMap;
        }
    }
}
