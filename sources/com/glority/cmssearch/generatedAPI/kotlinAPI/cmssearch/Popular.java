package com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Popular.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0014J\t\u0010\u001f\u001a\u00020\bHÂ\u0003J\u0013\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%H\u0016J\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%2\u0006\u0010&\u001a\u00020\"J\b\u0010'\u001a\u00020\bH\u0016J\t\u0010(\u001a\u00020\u000bHÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/Popular;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "cmsUid", "getCmsUid", "()Ljava/lang/String;", "setCmsUid", "(Ljava/lang/String;)V", "imageUrl", "getImageUrl", "setImageUrl", "name", "getName", "setName", "url", "getUrl", "setUrl", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class Popular extends APIModelBase<Popular> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String cmsUid;
    public String imageUrl;
    public String name;
    private int unused;
    public String url;

    public Popular() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ Popular copy$default(Popular popular, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = popular.unused;
        }
        return popular.copy(i);
    }

    public final Popular copy(int unused) {
        return new Popular(unused);
    }

    public String toString() {
        return "Popular(unused=" + this.unused + ')';
    }

    public Popular(int i) {
        this.unused = i;
    }

    public /* synthetic */ Popular(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("name");
        return null;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getCmsUid() {
        String str = this.cmsUid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cmsUid");
        return null;
    }

    public final void setCmsUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cmsUid = str;
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

    public final String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("url");
        return null;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Popular(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("name") && !obj.isNull("name")) {
            String string = obj.getString("name");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"name\")");
            setName(string);
            if (obj.has("cms_uid") && !obj.isNull("cms_uid")) {
                String string2 = obj.getString("cms_uid");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"cms_uid\")");
                setCmsUid(string2);
                if (obj.has("image_url") && !obj.isNull("image_url")) {
                    String string3 = obj.getString("image_url");
                    Intrinsics.checkNotNullExpressionValue(string3, "obj.getString(\"image_url\")");
                    setImageUrl(string3);
                    if (obj.has("url") && !obj.isNull("url")) {
                        String string4 = obj.getString("url");
                        Intrinsics.checkNotNullExpressionValue(string4, "obj.getString(\"url\")");
                        setUrl(string4);
                        return;
                    }
                    throw new ParameterCheckFailException("url is missing in model Popular");
                }
                throw new ParameterCheckFailException("imageUrl is missing in model Popular");
            }
            throw new ParameterCheckFailException("cmsUid is missing in model Popular");
        }
        throw new ParameterCheckFailException("name is missing in model Popular");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", getName());
        hashMap.put("cms_uid", getCmsUid());
        hashMap.put("image_url", getImageUrl());
        hashMap.put("url", getUrl());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Popular)) {
            return false;
        }
        Popular popular = (Popular) other;
        return Intrinsics.areEqual(getName(), popular.getName()) && Intrinsics.areEqual(getCmsUid(), popular.getCmsUid()) && Intrinsics.areEqual(getImageUrl(), popular.getImageUrl()) && Intrinsics.areEqual(getUrl(), popular.getUrl());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + getName().hashCode()) * 31) + getCmsUid().hashCode()) * 31) + getImageUrl().hashCode()) * 31) + getUrl().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Popular popular = new Popular(0, 1, null);
        cloneTo(popular);
        return popular;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            Popular popular = (Popular) o;
            super.cloneTo(popular);
            String cloneField = cloneField(getName());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.name)");
            popular.setName(cloneField);
            String cloneField2 = cloneField(getCmsUid());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.cmsUid)");
            popular.setCmsUid(cloneField2);
            String cloneField3 = cloneField(getImageUrl());
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.imageUrl)");
            popular.setImageUrl(cloneField3);
            String cloneField4 = cloneField(getUrl());
            Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(this.url)");
            popular.setUrl(cloneField4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.Popular");
    }

    /* compiled from: Popular.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/Popular$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getPopularJsonArrayMap", "", "array", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/Popular;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getPopularJsonArrayMap(List<Popular> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Popular) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
