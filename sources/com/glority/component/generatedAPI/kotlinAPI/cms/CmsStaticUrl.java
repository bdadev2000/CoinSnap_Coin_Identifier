package com.glority.component.generatedAPI.kotlinAPI.cms;

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

/* compiled from: CmsStaticUrl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0014J\t\u0010\u0019\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\u0016\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001fH\u0016J\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001f2\u0006\u0010 \u001a\u00020\u001cJ\b\u0010!\u001a\u00020\bH\u0016J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "darkUrl", "getDarkUrl", "()Ljava/lang/String;", "setDarkUrl", "(Ljava/lang/String;)V", "lightUrl", "getLightUrl", "setLightUrl", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsStaticUrl extends APIModelBase<CmsStaticUrl> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String darkUrl;
    public String lightUrl;
    private int unused;

    public CmsStaticUrl() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsStaticUrl copy$default(CmsStaticUrl cmsStaticUrl, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsStaticUrl.unused;
        }
        return cmsStaticUrl.copy(i);
    }

    public final CmsStaticUrl copy(int unused) {
        return new CmsStaticUrl(unused);
    }

    public String toString() {
        return "CmsStaticUrl(unused=" + this.unused + ')';
    }

    public CmsStaticUrl(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsStaticUrl(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getLightUrl() {
        String str = this.lightUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lightUrl");
        return null;
    }

    public final void setLightUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lightUrl = str;
    }

    public final String getDarkUrl() {
        String str = this.darkUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("darkUrl");
        return null;
    }

    public final void setDarkUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsStaticUrl(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("light_url") && !obj.isNull("light_url")) {
            String string = obj.getString("light_url");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"light_url\")");
            setLightUrl(string);
            if (obj.has("dark_url") && !obj.isNull("dark_url")) {
                String string2 = obj.getString("dark_url");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"dark_url\")");
                setDarkUrl(string2);
                return;
            }
            throw new ParameterCheckFailException("darkUrl is missing in model CmsStaticUrl");
        }
        throw new ParameterCheckFailException("lightUrl is missing in model CmsStaticUrl");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("light_url", getLightUrl());
        hashMap.put("dark_url", getDarkUrl());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsStaticUrl)) {
            return false;
        }
        CmsStaticUrl cmsStaticUrl = (CmsStaticUrl) other;
        return Intrinsics.areEqual(getLightUrl(), cmsStaticUrl.getLightUrl()) && Intrinsics.areEqual(getDarkUrl(), cmsStaticUrl.getDarkUrl());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getLightUrl().hashCode()) * 31) + getDarkUrl().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsStaticUrl cmsStaticUrl = new CmsStaticUrl(0, 1, null);
        cloneTo(cmsStaticUrl);
        return cmsStaticUrl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsStaticUrl cmsStaticUrl = (CmsStaticUrl) o;
            super.cloneTo(cmsStaticUrl);
            String cloneField = cloneField(getLightUrl());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.lightUrl)");
            cmsStaticUrl.setLightUrl(cloneField);
            String cloneField2 = cloneField(getDarkUrl());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.darkUrl)");
            cmsStaticUrl.setDarkUrl(cloneField2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl");
    }

    /* compiled from: CmsStaticUrl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsStaticUrlJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsStaticUrlJsonArrayMap(List<CmsStaticUrl> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsStaticUrl) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
