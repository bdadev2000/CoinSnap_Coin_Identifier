package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CmsMain.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010*H\u0014J\t\u0010.\u001a\u00020\bHÂ\u0003J\u0013\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0016\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010*04H\u0016J\u001c\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010*042\u0006\u00105\u001a\u000201J\b\u00106\u001a\u00020\bH\u0016J\t\u00107\u001a\u00020#HÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R*\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020#8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsMain;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "mainImage", "getMainImage", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "setMainImage", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/TaxonomyName;", "name", "getName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/TaxonomyName;", "setName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/TaxonomyName;)V", "taxonomyFamilyParent", "getTaxonomyFamilyParent", "setTaxonomyFamilyParent", "taxonomyParent", "getTaxonomyParent", "setTaxonomyParent", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "type", "getType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "setType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;)V", "", Args.uid, "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsMain extends APIModelBase<CmsMain> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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

    public String toString() {
        return "CmsMain(unused=" + this.unused + ')';
    }

    public CmsMain(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsMain(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final CmsImage getMainImage() {
        CmsImage cmsImage = this.mainImage;
        if (cmsImage != null) {
            return cmsImage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainImage");
        return null;
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
            setType(CmsTagValueType.INSTANCE.fromValue(obj.getInt("type")));
            if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
                String string = obj.getString(Args.uid);
                Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"uid\")");
                setUid(string);
                if (obj.has("name") && !obj.isNull("name")) {
                    Object obj2 = obj.get("name");
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    if (obj2 != null) {
                        setName(new TaxonomyName((JSONObject) obj2));
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
                            setMainImage(new CmsImage((JSONObject) obj5));
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
        hashMap.put("type", Integer.valueOf(getType().getValue()));
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
        hashMap.put(CmsUILogEvents.MAIN_IMAGE, getMainImage().getJsonMap());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsMain)) {
            return false;
        }
        CmsMain cmsMain = (CmsMain) other;
        return getType() == cmsMain.getType() && Intrinsics.areEqual(getUid(), cmsMain.getUid()) && Intrinsics.areEqual(getName(), cmsMain.getName()) && Intrinsics.areEqual(this.taxonomyParent, cmsMain.taxonomyParent) && Intrinsics.areEqual(this.taxonomyFamilyParent, cmsMain.taxonomyFamilyParent) && Intrinsics.areEqual(getMainImage(), cmsMain.getMainImage());
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + getType().hashCode()) * 31) + getUid().hashCode()) * 31) + getName().hashCode()) * 31;
        TaxonomyName taxonomyName = this.taxonomyParent;
        int hashCode2 = (hashCode + (taxonomyName != null ? taxonomyName.hashCode() : 0)) * 31;
        TaxonomyName taxonomyName2 = this.taxonomyFamilyParent;
        return ((hashCode2 + (taxonomyName2 != null ? taxonomyName2.hashCode() : 0)) * 31) + getMainImage().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsMain cmsMain = new CmsMain(0, 1, null);
        cloneTo(cmsMain);
        return cmsMain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsMain cmsMain = (CmsMain) o;
            super.cloneTo(cmsMain);
            Enum cloneField = cloneField(getType());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.type)");
            cmsMain.setType((CmsTagValueType) cloneField);
            String cloneField2 = cloneField(getUid());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.uid)");
            cmsMain.setUid(cloneField2);
            APIModelBase cloneField3 = cloneField(getName());
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.name)");
            cmsMain.setName((TaxonomyName) cloneField3);
            APIModelBase aPIModelBase = this.taxonomyParent;
            cmsMain.taxonomyParent = aPIModelBase != null ? (TaxonomyName) cloneField(aPIModelBase) : null;
            APIModelBase aPIModelBase2 = this.taxonomyFamilyParent;
            cmsMain.taxonomyFamilyParent = aPIModelBase2 != null ? (TaxonomyName) cloneField(aPIModelBase2) : null;
            APIModelBase cloneField4 = cloneField(getMainImage());
            Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(this.mainImage)");
            cmsMain.setMainImage((CmsImage) cloneField4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsMain");
    }

    /* compiled from: CmsMain.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsMain$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsMainJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsMain;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsMainJsonArrayMap(List<CmsMain> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsMain) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
