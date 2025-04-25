package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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

/* compiled from: SimpleCmsName.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010!H\u0014J\t\u0010%\u001a\u00020\bHÂ\u0003J\u0013\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010!H\u0096\u0002J\u0016\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010!0+H\u0016J\u001c\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010!0+2\u0006\u0010,\u001a\u00020(J\b\u0010-\u001a\u00020\bH\u0016J\t\u0010.\u001a\u00020\u0011HÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R*\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R&\u0010\u001d\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/SimpleCmsName;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "cmsStaticUrl", "getCmsStaticUrl", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "setCmsStaticUrl", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;)V", "", "latinName", "getLatinName", "()Ljava/lang/String;", "setLatinName", "(Ljava/lang/String;)V", "mainImageUrl", "getMainImageUrl", "setMainImageUrl", "preferredName", "getPreferredName", "setPreferredName", Args.uid, "getUid", "setUid", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class SimpleCmsName extends APIModelBase<SimpleCmsName> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CmsStaticUrl cmsStaticUrl;
    private String latinName;
    private String mainImageUrl;
    private String preferredName;
    public String uid;
    private int unused;

    public SimpleCmsName() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ SimpleCmsName copy$default(SimpleCmsName simpleCmsName, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simpleCmsName.unused;
        }
        return simpleCmsName.copy(i);
    }

    public final SimpleCmsName copy(int unused) {
        return new SimpleCmsName(unused);
    }

    public String toString() {
        return "SimpleCmsName(unused=" + this.unused + ')';
    }

    public SimpleCmsName(int i) {
        this.unused = i;
    }

    public /* synthetic */ SimpleCmsName(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final String getPreferredName() {
        return this.preferredName;
    }

    public final void setPreferredName(String str) {
        this.preferredName = str;
    }

    public final String getMainImageUrl() {
        return this.mainImageUrl;
    }

    public final void setMainImageUrl(String str) {
        this.mainImageUrl = str;
    }

    public final String getLatinName() {
        return this.latinName;
    }

    public final void setLatinName(String str) {
        this.latinName = str;
    }

    public final CmsStaticUrl getCmsStaticUrl() {
        return this.cmsStaticUrl;
    }

    public final void setCmsStaticUrl(CmsStaticUrl cmsStaticUrl) {
        this.cmsStaticUrl = cmsStaticUrl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleCmsName(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
            String string = obj.getString(Args.uid);
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"uid\")");
            setUid(string);
            if (obj.has("preferred_name") && !obj.isNull("preferred_name")) {
                this.preferredName = obj.getString("preferred_name");
            } else {
                this.preferredName = null;
            }
            if (obj.has("main_image_url") && !obj.isNull("main_image_url")) {
                this.mainImageUrl = obj.getString("main_image_url");
            } else {
                this.mainImageUrl = null;
            }
            if (obj.has("latin_name") && !obj.isNull("latin_name")) {
                this.latinName = obj.getString("latin_name");
            } else {
                this.latinName = null;
            }
            if (obj.has("cms_static_url") && !obj.isNull("cms_static_url")) {
                Object obj2 = obj.get("cms_static_url");
                if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                    obj2 = new JSONObject();
                }
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                this.cmsStaticUrl = new CmsStaticUrl((JSONObject) obj2);
                return;
            }
            this.cmsStaticUrl = null;
            return;
        }
        throw new ParameterCheckFailException("uid is missing in model SimpleCmsName");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        String str = this.preferredName;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("preferred_name", str);
        } else if (keepNull) {
            hashMap.put("preferred_name", null);
        }
        String str2 = this.mainImageUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("main_image_url", str2);
        } else if (keepNull) {
            hashMap.put("main_image_url", null);
        }
        String str3 = this.latinName;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("latin_name", str3);
        } else if (keepNull) {
            hashMap.put("latin_name", null);
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
        if (other == null || !(other instanceof SimpleCmsName)) {
            return false;
        }
        SimpleCmsName simpleCmsName = (SimpleCmsName) other;
        return Intrinsics.areEqual(getUid(), simpleCmsName.getUid()) && Intrinsics.areEqual(this.preferredName, simpleCmsName.preferredName) && Intrinsics.areEqual(this.mainImageUrl, simpleCmsName.mainImageUrl) && Intrinsics.areEqual(this.latinName, simpleCmsName.latinName) && Intrinsics.areEqual(this.cmsStaticUrl, simpleCmsName.cmsStaticUrl);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + getUid().hashCode()) * 31;
        String str = this.preferredName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mainImageUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.latinName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        CmsStaticUrl cmsStaticUrl = this.cmsStaticUrl;
        return hashCode4 + (cmsStaticUrl != null ? cmsStaticUrl.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        SimpleCmsName simpleCmsName = new SimpleCmsName(0, 1, null);
        cloneTo(simpleCmsName);
        return simpleCmsName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            SimpleCmsName simpleCmsName = (SimpleCmsName) o;
            super.cloneTo(simpleCmsName);
            String cloneField = cloneField(getUid());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.uid)");
            simpleCmsName.setUid(cloneField);
            String str = this.preferredName;
            simpleCmsName.preferredName = str != null ? cloneField(str) : null;
            String str2 = this.mainImageUrl;
            simpleCmsName.mainImageUrl = str2 != null ? cloneField(str2) : null;
            String str3 = this.latinName;
            simpleCmsName.latinName = str3 != null ? cloneField(str3) : null;
            APIModelBase aPIModelBase = this.cmsStaticUrl;
            simpleCmsName.cmsStaticUrl = aPIModelBase != null ? (CmsStaticUrl) cloneField(aPIModelBase) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.SimpleCmsName");
    }

    /* compiled from: SimpleCmsName.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/SimpleCmsName$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getSimpleCmsNameJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/SimpleCmsName;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getSimpleCmsNameJsonArrayMap(List<SimpleCmsName> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SimpleCmsName) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
