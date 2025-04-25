package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
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

/* compiled from: CmsTitle.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"H\u0016J\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"2\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020\bH\u0016J\t\u0010%\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R*\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "darkModeIconUrl", "getDarkModeIconUrl", "()Ljava/lang/String;", "setDarkModeIconUrl", "(Ljava/lang/String;)V", "displayName", "getDisplayName", "setDisplayName", "lightModeIconUrl", "getLightModeIconUrl", "setLightModeIconUrl", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsTitle extends APIModelBase<CmsTitle> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String darkModeIconUrl;
    private String displayName;
    private String lightModeIconUrl;
    private int unused;

    public CmsTitle() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsTitle copy$default(CmsTitle cmsTitle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsTitle.unused;
        }
        return cmsTitle.copy(i);
    }

    public final CmsTitle copy(int unused) {
        return new CmsTitle(unused);
    }

    public String toString() {
        return "CmsTitle(unused=" + this.unused + ')';
    }

    public CmsTitle(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTitle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final String getLightModeIconUrl() {
        return this.lightModeIconUrl;
    }

    public final void setLightModeIconUrl(String str) {
        this.lightModeIconUrl = str;
    }

    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    public final void setDarkModeIconUrl(String str) {
        this.darkModeIconUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsTitle(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("display_name") && !obj.isNull("display_name")) {
            this.displayName = obj.getString("display_name");
        } else {
            this.displayName = null;
        }
        if (obj.has("light_mode_icon_url") && !obj.isNull("light_mode_icon_url")) {
            this.lightModeIconUrl = obj.getString("light_mode_icon_url");
        } else {
            this.lightModeIconUrl = null;
        }
        if (obj.has("dark_mode_icon_url") && !obj.isNull("dark_mode_icon_url")) {
            this.darkModeIconUrl = obj.getString("dark_mode_icon_url");
        } else {
            this.darkModeIconUrl = null;
        }
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.displayName;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("display_name", str);
        } else if (keepNull) {
            hashMap.put("display_name", null);
        }
        String str2 = this.lightModeIconUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("light_mode_icon_url", str2);
        } else if (keepNull) {
            hashMap.put("light_mode_icon_url", null);
        }
        String str3 = this.darkModeIconUrl;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("dark_mode_icon_url", str3);
        } else if (keepNull) {
            hashMap.put("dark_mode_icon_url", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTitle)) {
            return false;
        }
        CmsTitle cmsTitle = (CmsTitle) other;
        return Intrinsics.areEqual(this.displayName, cmsTitle.displayName) && Intrinsics.areEqual(this.lightModeIconUrl, cmsTitle.lightModeIconUrl) && Intrinsics.areEqual(this.darkModeIconUrl, cmsTitle.darkModeIconUrl);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.lightModeIconUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.darkModeIconUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsTitle cmsTitle = new CmsTitle(0, 1, null);
        cloneTo(cmsTitle);
        return cmsTitle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsTitle cmsTitle = (CmsTitle) o;
            super.cloneTo(cmsTitle);
            String str = this.displayName;
            cmsTitle.displayName = str != null ? cloneField(str) : null;
            String str2 = this.lightModeIconUrl;
            cmsTitle.lightModeIconUrl = str2 != null ? cloneField(str2) : null;
            String str3 = this.darkModeIconUrl;
            cmsTitle.darkModeIconUrl = str3 != null ? cloneField(str3) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsTitle");
    }

    /* compiled from: CmsTitle.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsTitleJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsTitleJsonArrayMap(List<CmsTitle> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsTitle) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
