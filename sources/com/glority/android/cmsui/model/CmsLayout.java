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

/* compiled from: CmsLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010*\u001a\u00020\u0006HÂ\u0003J\u0013\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010/01J\u001c\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010/012\u0006\u00102\u001a\u00020-J\b\u00103\u001a\u00020\u0006H\u0016J\t\u00104\u001a\u00020\u000fHÖ\u0001R*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R6\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR6\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR&\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/glority/android/cmsui/model/CmsLayout;", "Ljava/io/Serializable;", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/android/cmsui/model/CmsTitle;", "cmsTitle", "getCmsTitle", "()Lcom/glority/android/cmsui/model/CmsTitle;", "setCmsTitle", "(Lcom/glority/android/cmsui/model/CmsTitle;)V", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "", "subPageTagNames", "getSubPageTagNames", "()Ljava/util/List;", "setSubPageTagNames", "(Ljava/util/List;)V", "tagNames", "getTagNames", "setTagNames", "Lcom/glority/android/cmsui/model/LayoutType;", "type", "getType", "()Lcom/glority/android/cmsui/model/LayoutType;", "setType", "(Lcom/glority/android/cmsui/model/LayoutType;)V", "Lcom/glority/android/cmsui/model/LayoutTypeSet;", "typeSet", "getTypeSet", "()Lcom/glority/android/cmsui/model/LayoutTypeSet;", "setTypeSet", "(Lcom/glority/android/cmsui/model/LayoutTypeSet;)V", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsLayout implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CmsTitle cmsTitle;
    public String name;
    private List<String> subPageTagNames;
    private List<String> tagNames;
    public LayoutType type;
    public LayoutTypeSet typeSet;
    private int unused;

    public CmsLayout() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsLayout copy$default(CmsLayout cmsLayout, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsLayout.unused;
        }
        return cmsLayout.copy(i);
    }

    public final CmsLayout copy(int unused) {
        return new CmsLayout(unused);
    }

    public String toString() {
        return "CmsLayout(unused=" + this.unused + ")";
    }

    public CmsLayout(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsLayout(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getName() {
        String str = this.name;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        return str;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final LayoutType getType() {
        LayoutType layoutType = this.type;
        if (layoutType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return layoutType;
    }

    public final void setType(LayoutType layoutType) {
        Intrinsics.checkNotNullParameter(layoutType, "<set-?>");
        this.type = layoutType;
    }

    public final LayoutTypeSet getTypeSet() {
        LayoutTypeSet layoutTypeSet = this.typeSet;
        if (layoutTypeSet == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeSet");
        }
        return layoutTypeSet;
    }

    public final void setTypeSet(LayoutTypeSet layoutTypeSet) {
        Intrinsics.checkNotNullParameter(layoutTypeSet, "<set-?>");
        this.typeSet = layoutTypeSet;
    }

    public final List<String> getTagNames() {
        return this.tagNames;
    }

    public final void setTagNames(List<String> list) {
        this.tagNames = list;
    }

    public final List<String> getSubPageTagNames() {
        return this.subPageTagNames;
    }

    public final void setSubPageTagNames(List<String> list) {
        this.subPageTagNames = list;
    }

    public final CmsTitle getCmsTitle() {
        return this.cmsTitle;
    }

    public final void setCmsTitle(CmsTitle cmsTitle) {
        this.cmsTitle = cmsTitle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsLayout(org.json.JSONObject r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.CmsLayout.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.name;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        hashMap.put("name", str);
        LayoutType layoutType = this.type;
        if (layoutType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        hashMap.put("type", Integer.valueOf(layoutType.getValue()));
        LayoutTypeSet layoutTypeSet = this.typeSet;
        if (layoutTypeSet == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeSet");
        }
        hashMap.put("type_set", Integer.valueOf(layoutTypeSet.getValue()));
        List<String> list = this.tagNames;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("tag_names", list);
        } else if (keepNull) {
            hashMap.put("tag_names", null);
        }
        List<String> list2 = this.subPageTagNames;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            hashMap.put("sub_page_tag_names", list2);
        } else if (keepNull) {
            hashMap.put("sub_page_tag_names", null);
        }
        CmsTitle cmsTitle = this.cmsTitle;
        if (cmsTitle != null) {
            Intrinsics.checkNotNull(cmsTitle);
            hashMap.put("cms_title", cmsTitle.getJsonMap());
        } else if (keepNull) {
            hashMap.put("cms_title", null);
        }
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsLayout)) {
            return false;
        }
        if (this.name == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        CmsLayout cmsLayout = (CmsLayout) other;
        if (cmsLayout.name == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        if (!Intrinsics.areEqual(r1, r3)) {
            return false;
        }
        LayoutType layoutType = this.type;
        if (layoutType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        LayoutType layoutType2 = cmsLayout.type;
        if (layoutType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        if (layoutType != layoutType2) {
            return false;
        }
        LayoutTypeSet layoutTypeSet = this.typeSet;
        if (layoutTypeSet == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeSet");
        }
        LayoutTypeSet layoutTypeSet2 = cmsLayout.typeSet;
        if (layoutTypeSet2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeSet");
        }
        return (layoutTypeSet != layoutTypeSet2 || (Intrinsics.areEqual(this.tagNames, cmsLayout.tagNames) ^ true) || (Intrinsics.areEqual(this.subPageTagNames, cmsLayout.subPageTagNames) ^ true) || (Intrinsics.areEqual(this.cmsTitle, cmsLayout.cmsTitle) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.name;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        int hashCode2 = (hashCode + str.hashCode()) * 31;
        LayoutType layoutType = this.type;
        if (layoutType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        int hashCode3 = (hashCode2 + layoutType.hashCode()) * 31;
        LayoutTypeSet layoutTypeSet = this.typeSet;
        if (layoutTypeSet == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeSet");
        }
        int hashCode4 = (hashCode3 + layoutTypeSet.hashCode()) * 31;
        List<String> list = this.tagNames;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.subPageTagNames;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        CmsTitle cmsTitle = this.cmsTitle;
        return hashCode6 + (cmsTitle != null ? cmsTitle.hashCode() : 0);
    }

    /* compiled from: CmsLayout.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/CmsLayout$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsLayoutJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getCmsLayoutJsonArrayMap(List<CmsLayout> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsLayout) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("tagNames", String.class);
            hashMap.put("subPageTagNames", String.class);
            return hashMap;
        }
    }
}
