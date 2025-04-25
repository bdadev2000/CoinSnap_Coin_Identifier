package com.glority.android.cmsui.model;

import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CmsMain.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010(\u001a\u00020\u0007HÂ\u0003J\u0013\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010-0/J\u001c\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010-0/2\u0006\u00100\u001a\u00020+J\t\u00101\u001a\u00020\u0007HÖ\u0001J\t\u00102\u001a\u00020\"HÖ\u0001R&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R&\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001c8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010#\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\"8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/glority/android/cmsui/model/CmsMain;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/android/cmsui/model/CmsImage;", "mainImage", "getMainImage", "()Lcom/glority/android/cmsui/model/CmsImage;", "setMainImage", "(Lcom/glority/android/cmsui/model/CmsImage;)V", "Lcom/glority/android/cmsui/model/TaxonomyName;", "name", "getName", "()Lcom/glority/android/cmsui/model/TaxonomyName;", "setName", "(Lcom/glority/android/cmsui/model/TaxonomyName;)V", "taxonomyFamilyParent", "getTaxonomyFamilyParent", "setTaxonomyFamilyParent", "taxonomyParent", "getTaxonomyParent", "setTaxonomyParent", "Lcom/glority/android/cmsui/model/CmsTagValueType;", "type", "getType", "()Lcom/glority/android/cmsui/model/CmsTagValueType;", "setType", "(Lcom/glority/android/cmsui/model/CmsTagValueType;)V", "", Args.uid, "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "keepNull", "hashCode", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsMain implements Serializable, Cloneable {
    public CmsImage mainImage;
    public TaxonomyName name;
    private TaxonomyName taxonomyFamilyParent;
    private TaxonomyName taxonomyParent;
    public CmsTagValueType type;
    public String uid;
    private int unused;

    public CmsMain() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsMain copy$default(CmsMain cmsMain, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsMain.unused;
        }
        return cmsMain.copy(i);
    }

    public final CmsMain copy(int unused) {
        return new CmsMain(unused);
    }

    public int hashCode() {
        return Integer.hashCode(this.unused);
    }

    public String toString() {
        return "CmsMain(unused=" + this.unused + ")";
    }

    public CmsMain(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsMain(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final CmsImage getMainImage() {
        CmsImage cmsImage = this.mainImage;
        if (cmsImage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainImage");
        }
        return cmsImage;
    }

    public final void setMainImage(CmsImage cmsImage) {
        Intrinsics.checkNotNullParameter(cmsImage, "<set-?>");
        this.mainImage = cmsImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsMain(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("type") && !obj.isNull("type")) {
            this.type = CmsTagValueType.INSTANCE.fromValue(obj.getInt("type"));
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
                        if (obj.has(CmsUILogEvents.MAIN_IMAGE) && !obj.isNull(CmsUILogEvents.MAIN_IMAGE)) {
                            Object obj5 = obj.get(CmsUILogEvents.MAIN_IMAGE);
                            if ((obj5 instanceof JSONArray) && ((JSONArray) obj5).length() == 0) {
                                obj5 = new JSONObject();
                            }
                            if (obj5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                            }
                            this.mainImage = new CmsImage((JSONObject) obj5);
                            return;
                        }
                        throw new ParameterCheckFailException("mainImage is missing in model CmsMain");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                throw new ParameterCheckFailException("name is missing in model CmsMain");
            }
            throw new ParameterCheckFailException("uid is missing in model CmsMain");
        }
        throw new ParameterCheckFailException("type is missing in model CmsMain");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        hashMap.put("type", Integer.valueOf(cmsTagValueType.getValue()));
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
        TaxonomyName taxonomyName3 = this.taxonomyFamilyParent;
        if (taxonomyName3 != null) {
            Intrinsics.checkNotNull(taxonomyName3);
            hashMap.put("taxonomy_family_parent", taxonomyName3.getJsonMap());
        } else if (keepNull) {
            hashMap.put("taxonomy_family_parent", null);
        }
        CmsImage cmsImage = this.mainImage;
        if (cmsImage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainImage");
        }
        hashMap.put(CmsUILogEvents.MAIN_IMAGE, cmsImage.getJsonMap());
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsMain)) {
            return false;
        }
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        CmsMain cmsMain = (CmsMain) other;
        CmsTagValueType cmsTagValueType2 = cmsMain.type;
        if (cmsTagValueType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        if (cmsTagValueType != cmsTagValueType2) {
            return false;
        }
        if (this.uid == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        }
        if (cmsMain.uid == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        }
        if (!Intrinsics.areEqual(r1, r3)) {
            return false;
        }
        if (this.name == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        if (cmsMain.name == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        if ((!Intrinsics.areEqual(r1, r4)) || (!Intrinsics.areEqual(this.taxonomyParent, cmsMain.taxonomyParent)) || (!Intrinsics.areEqual(this.taxonomyFamilyParent, cmsMain.taxonomyFamilyParent))) {
            return false;
        }
        CmsImage cmsImage = this.mainImage;
        if (cmsImage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainImage");
        }
        CmsImage cmsImage2 = cmsMain.mainImage;
        if (cmsImage2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainImage");
        }
        return !(Intrinsics.areEqual(cmsImage, cmsImage2) ^ true);
    }
}
