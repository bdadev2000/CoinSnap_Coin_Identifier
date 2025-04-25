package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.component.generatedAPI.kotlinAPI.enums.LayoutType;
import com.glority.component.generatedAPI.kotlinAPI.enums.LayoutTypeSet;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001;B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010-H\u0014J\t\u00101\u001a\u00020\bHÂ\u0003J\u0013\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0016\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010-07H\u0016J\u001c\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010-072\u0006\u00108\u001a\u000204J\b\u00109\u001a\u00020\bH\u0016J\t\u0010:\u001a\u00020\u0011HÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R6\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00172\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR6\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00172\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR&\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020 8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010'\u001a\u00020&2\u0006\u0010\n\u001a\u00020&8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsLayout;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;", "cmsTitle", "getCmsTitle", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;", "setCmsTitle", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTitle;)V", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "", "subPageTagNames", "getSubPageTagNames", "()Ljava/util/List;", "setSubPageTagNames", "(Ljava/util/List;)V", "tagNames", "getTagNames", "setTagNames", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutType;", "type", "getType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutType;", "setType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutType;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutTypeSet;", "typeSet", "getTypeSet", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutTypeSet;", "setTypeSet", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutTypeSet;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsLayout extends APIModelBase<CmsLayout> implements Serializable, Cloneable {

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
        return "CmsLayout(unused=" + this.unused + ')';
    }

    public CmsLayout(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsLayout(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final LayoutType getType() {
        LayoutType layoutType = this.type;
        if (layoutType != null) {
            return layoutType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    public final void setType(LayoutType layoutType) {
        Intrinsics.checkNotNullParameter(layoutType, "<set-?>");
        this.type = layoutType;
    }

    public final LayoutTypeSet getTypeSet() {
        LayoutTypeSet layoutTypeSet = this.typeSet;
        if (layoutTypeSet != null) {
            return layoutTypeSet;
        }
        Intrinsics.throwUninitializedPropertyAccessException("typeSet");
        return null;
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
    public CmsLayout(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsLayout.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", getName());
        hashMap.put("type", Integer.valueOf(getType().getValue()));
        hashMap.put("type_set", Integer.valueOf(getTypeSet().getValue()));
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

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsLayout)) {
            return false;
        }
        CmsLayout cmsLayout = (CmsLayout) other;
        return Intrinsics.areEqual(getName(), cmsLayout.getName()) && getType() == cmsLayout.getType() && getTypeSet() == cmsLayout.getTypeSet() && Intrinsics.areEqual(this.tagNames, cmsLayout.tagNames) && Intrinsics.areEqual(this.subPageTagNames, cmsLayout.subPageTagNames) && Intrinsics.areEqual(this.cmsTitle, cmsLayout.cmsTitle);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + getName().hashCode()) * 31) + getType().hashCode()) * 31) + getTypeSet().hashCode()) * 31;
        List<String> list = this.tagNames;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.subPageTagNames;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        CmsTitle cmsTitle = this.cmsTitle;
        return hashCode3 + (cmsTitle != null ? cmsTitle.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsLayout cmsLayout = new CmsLayout(0, 1, null);
        cloneTo(cmsLayout);
        return cmsLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsLayout cmsLayout = (CmsLayout) o;
            super.cloneTo(cmsLayout);
            String cloneField = cloneField(getName());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.name)");
            cmsLayout.setName(cloneField);
            Enum cloneField2 = cloneField(getType());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.type)");
            cmsLayout.setType((LayoutType) cloneField2);
            Enum cloneField3 = cloneField(getTypeSet());
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.typeSet)");
            cmsLayout.setTypeSet((LayoutTypeSet) cloneField3);
            if (this.tagNames == null) {
                cmsLayout.tagNames = null;
            } else {
                cmsLayout.tagNames = new ArrayList();
                List<String> list = this.tagNames;
                Intrinsics.checkNotNull(list);
                for (String str : list) {
                    List<String> list2 = cmsLayout.tagNames;
                    Intrinsics.checkNotNull(list2);
                    String cloneField4 = cloneField(str);
                    Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(item)");
                    list2.add(cloneField4);
                }
            }
            if (this.subPageTagNames == null) {
                cmsLayout.subPageTagNames = null;
            } else {
                cmsLayout.subPageTagNames = new ArrayList();
                List<String> list3 = this.subPageTagNames;
                Intrinsics.checkNotNull(list3);
                for (String str2 : list3) {
                    List<String> list4 = cmsLayout.subPageTagNames;
                    Intrinsics.checkNotNull(list4);
                    String cloneField5 = cloneField(str2);
                    Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(item)");
                    list4.add(cloneField5);
                }
            }
            APIModelBase aPIModelBase = this.cmsTitle;
            cmsLayout.cmsTitle = aPIModelBase != null ? (CmsTitle) cloneField(aPIModelBase) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsLayout");
    }

    /* compiled from: CmsLayout.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsLayout$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsLayoutJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsLayout;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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
