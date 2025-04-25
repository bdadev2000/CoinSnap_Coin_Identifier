package com.glority.android.cmsui.model;

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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0007HÂ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001dJ\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\t\u0010 \u001a\u00020\nHÖ\u0001R*\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR*\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/glority/android/cmsui/model/CmsTitle;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "darkModeIconUrl", "getDarkModeIconUrl", "()Ljava/lang/String;", "setDarkModeIconUrl", "(Ljava/lang/String;)V", "displayName", "getDisplayName", "setDisplayName", "lightModeIconUrl", "getLightModeIconUrl", "setLightModeIconUrl", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsTitle implements Serializable, Cloneable {

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
        return "CmsTitle(unused=" + this.unused + ")";
    }

    public CmsTitle(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTitle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Object clone() {
        return super.clone();
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

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTitle)) {
            return false;
        }
        CmsTitle cmsTitle = (CmsTitle) other;
        return ((Intrinsics.areEqual(this.displayName, cmsTitle.displayName) ^ true) || (Intrinsics.areEqual(this.lightModeIconUrl, cmsTitle.lightModeIconUrl) ^ true) || (Intrinsics.areEqual(this.darkModeIconUrl, cmsTitle.darkModeIconUrl) ^ true)) ? false : true;
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

    /* compiled from: CmsTitle.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/CmsTitle$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsTitleJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/CmsTitle;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
