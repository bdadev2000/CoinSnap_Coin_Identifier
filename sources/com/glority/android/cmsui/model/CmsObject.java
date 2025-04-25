package com.glority.android.cmsui.model;

import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.exception.ParameterCheckFailException;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.TaxonomyName;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CmsObject.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010\u00010AJ\u001c\u0010@\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010\u00010A2\u0006\u0010B\u001a\u00020CR*\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R6\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R2\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00188F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR&\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020(8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R6\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR2\u00101\u001a\b\u0012\u0004\u0012\u00020(0\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020(0\u00188F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR*\u00104\u001a\u0004\u0018\u00010(2\b\u0010\u0005\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R*\u00107\u001a\u0004\u0018\u00010(2\b\u0010\u0005\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R&\u0010;\u001a\u00020:2\u0006\u0010\u0005\u001a\u00020:8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/glority/android/cmsui/model/CmsObject;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "<set-?>", "Lcom/glority/android/cmsui/model/CmsStaticUrl;", "cmsStaticUrl", "getCmsStaticUrl", "()Lcom/glority/android/cmsui/model/CmsStaticUrl;", "setCmsStaticUrl", "(Lcom/glority/android/cmsui/model/CmsStaticUrl;)V", "Lcom/glority/android/cmsui/model/CmsTag;", "confusion", "getConfusion", "()Lcom/glority/android/cmsui/model/CmsTag;", "setConfusion", "(Lcom/glority/android/cmsui/model/CmsTag;)V", "Lcom/glority/android/cmsui/model/CmsDisease;", CmsUILogEvents.CMS_DISEASE, "getDisease", "()Lcom/glority/android/cmsui/model/CmsDisease;", "setDisease", "(Lcom/glority/android/cmsui/model/CmsDisease;)V", "", "Lcom/glority/android/cmsui/model/CmsLayout;", "layouts", "getLayouts", "()Ljava/util/List;", "setLayouts", "(Ljava/util/List;)V", "Lcom/glority/android/cmsui/model/CmsImage;", "mainImage", "getMainImage", "()Lcom/glority/android/cmsui/model/CmsImage;", "setMainImage", "(Lcom/glority/android/cmsui/model/CmsImage;)V", "matchedSimilarImages", "getMatchedSimilarImages", "setMatchedSimilarImages", "Lcom/glority/android/cmsui/model/TaxonomyName;", "name", "getName", "()Lcom/glority/android/cmsui/model/TaxonomyName;", "setName", "(Lcom/glority/android/cmsui/model/TaxonomyName;)V", "tags", "getTags", "setTags", "taxonomies", "getTaxonomies", "setTaxonomies", "taxonomyFamilyParent", "getTaxonomyFamilyParent", "setTaxonomyFamilyParent", "taxonomyParent", "getTaxonomyParent", "setTaxonomyParent", "", Args.uid, "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "getJsonMap", "", "keepNull", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsObject {
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

    public final String getUid() {
        String str = this.uid;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        }
        return str;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final TaxonomyName getName() {
        TaxonomyName taxonomyName = this.name;
        if (taxonomyName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        return taxonomyName;
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
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxonomies");
        }
        return list;
    }

    public final void setTaxonomies(List<TaxonomyName> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.taxonomies = list;
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
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("matchedSimilarImages");
        }
        return list;
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

    public CmsObject(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
            String string = obj.getString(Args.uid);
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"uid\")");
            this.uid = string;
            if (obj.has("name") && !obj.isNull("name")) {
                Object obj2 = obj.get("name");
                if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                    obj2 = new JSONObject();
                }
                if (obj2 != null) {
                    this.name = new TaxonomyName((JSONObject) obj2);
                    if (obj.has("taxonomy_parent") && !obj.isNull("taxonomy_parent")) {
                        Object obj3 = obj.get("taxonomy_parent");
                        if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                            obj3 = new JSONObject();
                        }
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        this.taxonomyParent = new TaxonomyName((JSONObject) obj3);
                    } else {
                        this.taxonomyParent = null;
                    }
                    if (obj.has("taxonomy_family_parent") && !obj.isNull("taxonomy_family_parent")) {
                        Object obj4 = obj.get("taxonomy_family_parent");
                        if ((obj4 instanceof JSONArray) && ((JSONArray) obj4).length() == 0) {
                            obj4 = new JSONObject();
                        }
                        if (obj4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        this.taxonomyFamilyParent = new TaxonomyName((JSONObject) obj4);
                    } else {
                        this.taxonomyFamilyParent = null;
                    }
                    if (obj.has("taxonomies") && !obj.isNull("taxonomies")) {
                        JSONArray jSONArray = obj.getJSONArray("taxonomies");
                        this.taxonomies = new ArrayList();
                        int length = jSONArray.length() - 1;
                        int i = 0;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                Object obj5 = jSONArray.get(i2);
                                if ((obj5 instanceof JSONArray) && ((JSONArray) obj5).length() == 0) {
                                    obj5 = new JSONObject();
                                }
                                if (obj5 != null) {
                                    TaxonomyName taxonomyName = new TaxonomyName((JSONObject) obj5);
                                    List<TaxonomyName> list = this.taxonomies;
                                    if (list == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("taxonomies");
                                    }
                                    Intrinsics.checkNotNull(list);
                                    list.add(taxonomyName);
                                    if (i2 == length) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                }
                            }
                        }
                        if (obj.has("layouts") && !obj.isNull("layouts")) {
                            JSONArray jSONArray2 = obj.getJSONArray("layouts");
                            this.layouts = new ArrayList();
                            int length2 = jSONArray2.length() - 1;
                            if (length2 >= 0) {
                                int i3 = 0;
                                while (true) {
                                    Object obj6 = jSONArray2.get(i3);
                                    if ((obj6 instanceof JSONArray) && ((JSONArray) obj6).length() == 0) {
                                        obj6 = new JSONObject();
                                    }
                                    if (obj6 != null) {
                                        CmsLayout cmsLayout = new CmsLayout((JSONObject) obj6);
                                        List<CmsLayout> list2 = this.layouts;
                                        Intrinsics.checkNotNull(list2);
                                        list2.add(cmsLayout);
                                        if (i3 == length2) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                    }
                                }
                            }
                        } else {
                            this.layouts = null;
                        }
                        if (obj.has("tags") && !obj.isNull("tags")) {
                            JSONArray jSONArray3 = obj.getJSONArray("tags");
                            this.tags = new ArrayList();
                            int length3 = jSONArray3.length() - 1;
                            if (length3 >= 0) {
                                int i4 = 0;
                                while (true) {
                                    Object obj7 = jSONArray3.get(i4);
                                    if ((obj7 instanceof JSONArray) && ((JSONArray) obj7).length() == 0) {
                                        obj7 = new JSONObject();
                                    }
                                    if (obj7 != null) {
                                        CmsTag cmsTag = new CmsTag((JSONObject) obj7);
                                        List<CmsTag> list3 = this.tags;
                                        Intrinsics.checkNotNull(list3);
                                        list3.add(cmsTag);
                                        if (i4 == length3) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                    }
                                }
                            }
                        } else {
                            this.tags = null;
                        }
                        if (obj.has(CmsUILogEvents.MAIN_IMAGE) && !obj.isNull(CmsUILogEvents.MAIN_IMAGE)) {
                            Object obj8 = obj.get(CmsUILogEvents.MAIN_IMAGE);
                            if ((obj8 instanceof JSONArray) && ((JSONArray) obj8).length() == 0) {
                                obj8 = new JSONObject();
                            }
                            if (obj8 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                            }
                            this.mainImage = new CmsImage((JSONObject) obj8);
                        } else {
                            this.mainImage = null;
                        }
                        if (obj.has("matched_similar_images") && !obj.isNull("matched_similar_images")) {
                            JSONArray jSONArray4 = obj.getJSONArray("matched_similar_images");
                            this.matchedSimilarImages = new ArrayList();
                            int length4 = jSONArray4.length() - 1;
                            if (length4 >= 0) {
                                while (true) {
                                    Object obj9 = jSONArray4.get(i);
                                    if ((obj9 instanceof JSONArray) && ((JSONArray) obj9).length() == 0) {
                                        obj9 = new JSONObject();
                                    }
                                    if (obj9 != null) {
                                        CmsImage cmsImage = new CmsImage((JSONObject) obj9);
                                        List<CmsImage> list4 = this.matchedSimilarImages;
                                        if (list4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("matchedSimilarImages");
                                        }
                                        Intrinsics.checkNotNull(list4);
                                        list4.add(cmsImage);
                                        if (i == length4) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                    }
                                }
                            }
                            if (obj.has("confusion") && !obj.isNull("confusion")) {
                                Object obj10 = obj.get("confusion");
                                if ((obj10 instanceof JSONArray) && ((JSONArray) obj10).length() == 0) {
                                    obj10 = new JSONObject();
                                }
                                if (obj10 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                }
                                this.confusion = new CmsTag((JSONObject) obj10);
                            } else {
                                this.confusion = null;
                            }
                            if (obj.has(CmsUILogEvents.CMS_DISEASE) && !obj.isNull(CmsUILogEvents.CMS_DISEASE)) {
                                Object obj11 = obj.get(CmsUILogEvents.CMS_DISEASE);
                                if ((obj11 instanceof JSONArray) && ((JSONArray) obj11).length() == 0) {
                                    obj11 = new JSONObject();
                                }
                                if (obj11 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                }
                                this.disease = new CmsDisease((JSONObject) obj11);
                            } else {
                                this.disease = null;
                            }
                            if (obj.has("cms_static_url") && !obj.isNull("cms_static_url")) {
                                Object obj12 = obj.get("cms_static_url");
                                if ((obj12 instanceof JSONArray) && ((JSONArray) obj12).length() == 0) {
                                    obj12 = new JSONObject();
                                }
                                if (obj12 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                }
                                this.cmsStaticUrl = new CmsStaticUrl((JSONObject) obj12);
                                return;
                            }
                            this.cmsStaticUrl = null;
                            return;
                        }
                        throw new ParameterCheckFailException("matchedSimilarImages is missing in model CmsName");
                    }
                    throw new ParameterCheckFailException("taxonomies is missing in model CmsName");
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            throw new ParameterCheckFailException("name is missing in model CmsName");
        }
        throw new ParameterCheckFailException("uid is missing in model CmsName");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.uid;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        }
        hashMap.put(Args.uid, str);
        TaxonomyName taxonomyName = this.name;
        if (taxonomyName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        hashMap.put("name", taxonomyName.getJsonMap());
        TaxonomyName taxonomyName2 = this.taxonomyParent;
        if (taxonomyName2 != null) {
            Intrinsics.checkNotNull(taxonomyName2);
            hashMap.put("taxonomy_parent", taxonomyName2.getJsonMap());
        } else if (keepNull) {
            hashMap.put("taxonomy_parent", null);
        }
        TaxonomyName.Companion companion = TaxonomyName.INSTANCE;
        List<TaxonomyName> list = this.taxonomies;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxonomies");
        }
        hashMap.put("taxonomies", companion.getTaxonomyNameJsonArrayMap(list));
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
        CmsImage.Companion companion4 = CmsImage.INSTANCE;
        List<CmsImage> list4 = this.matchedSimilarImages;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("matchedSimilarImages");
        }
        hashMap.put("matched_similar_images", companion4.getCmsImageJsonArrayMap(list4));
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

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }
}
