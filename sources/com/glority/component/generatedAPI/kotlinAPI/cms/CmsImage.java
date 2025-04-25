package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: CmsImage.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0014J\t\u0010\"\u001a\u00020\bHÂ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0016\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001e0(H\u0016J\u001c\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001e0(2\u0006\u0010)\u001a\u00020%J\b\u0010*\u001a\u00020\bH\u0016J\t\u0010+\u001a\u00020\u0011HÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00178F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/Copyright;", "imageCopyright", "getImageCopyright", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/Copyright;", "setImageCopyright", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/Copyright;)V", "", "imageUrl", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "type", "getType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "setType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsImage extends APIModelBase<CmsImage> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Copyright imageCopyright;
    public String imageUrl;
    public CmsTagValueType type;
    private int unused;

    public CmsImage() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsImage copy$default(CmsImage cmsImage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsImage.unused;
        }
        return cmsImage.copy(i);
    }

    public final CmsImage copy(int unused) {
        return new CmsImage(unused);
    }

    public String toString() {
        return "CmsImage(unused=" + this.unused + ')';
    }

    public CmsImage(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsImage(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final String getImageUrl() {
        String str = this.imageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageUrl");
        return null;
    }

    public final void setImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final Copyright getImageCopyright() {
        return this.imageCopyright;
    }

    public final void setImageCopyright(Copyright copyright) {
        this.imageCopyright = copyright;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsImage(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("type") && !obj.isNull("type")) {
            setType(CmsTagValueType.INSTANCE.fromValue(obj.getInt("type")));
            if (obj.has("image_url") && !obj.isNull("image_url")) {
                String string = obj.getString("image_url");
                Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"image_url\")");
                setImageUrl(string);
                if (obj.has("image_copyright") && !obj.isNull("image_copyright")) {
                    Object obj2 = obj.get("image_copyright");
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    this.imageCopyright = new Copyright((JSONObject) obj2);
                    return;
                }
                this.imageCopyright = null;
                return;
            }
            throw new ParameterCheckFailException("imageUrl is missing in model CmsImage");
        }
        throw new ParameterCheckFailException("type is missing in model CmsImage");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType().getValue()));
        hashMap.put("image_url", getImageUrl());
        Copyright copyright = this.imageCopyright;
        if (copyright != null) {
            Intrinsics.checkNotNull(copyright);
            hashMap.put("image_copyright", copyright.getJsonMap());
        } else if (keepNull) {
            hashMap.put("image_copyright", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsImage)) {
            return false;
        }
        CmsImage cmsImage = (CmsImage) other;
        return getType() == cmsImage.getType() && Intrinsics.areEqual(getImageUrl(), cmsImage.getImageUrl()) && Intrinsics.areEqual(this.imageCopyright, cmsImage.imageCopyright);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getType().hashCode()) * 31) + getImageUrl().hashCode()) * 31;
        Copyright copyright = this.imageCopyright;
        return hashCode + (copyright != null ? copyright.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsImage cmsImage = new CmsImage(0, 1, null);
        cloneTo(cmsImage);
        return cmsImage;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsImage cmsImage = (CmsImage) o;
            super.cloneTo(cmsImage);
            Enum cloneField = cloneField(getType());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.type)");
            cmsImage.setType((CmsTagValueType) cloneField);
            String cloneField2 = cloneField(getImageUrl());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.imageUrl)");
            cmsImage.setImageUrl(cloneField2);
            APIModelBase aPIModelBase = this.imageCopyright;
            cmsImage.imageCopyright = aPIModelBase != null ? (Copyright) cloneField(aPIModelBase) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsImage");
    }

    /* compiled from: CmsImage.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsImageJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsImage;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsImageJsonArrayMap(List<CmsImage> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsImage) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
