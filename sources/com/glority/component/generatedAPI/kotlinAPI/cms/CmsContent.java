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

/* compiled from: CmsContent.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0014J\t\u0010\u001b\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\u0016\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u00170!H\u0016J\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u00170!2\u0006\u0010#\u001a\u00020\u001eJ\b\u0010$\u001a\u00020\bH\u0016J\t\u0010%\u001a\u00020\"HÖ\u0001R2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsContent;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsLayout;", "layouts", "getLayouts", "()Ljava/util/List;", "setLayouts", "(Ljava/util/List;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTag;", "tags", "getTags", "setTags", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsContent extends APIModelBase<CmsContent> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<CmsLayout> layouts;
    public List<CmsTag> tags;
    private int unused;

    public CmsContent() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsContent copy$default(CmsContent cmsContent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsContent.unused;
        }
        return cmsContent.copy(i);
    }

    public final CmsContent copy(int unused) {
        return new CmsContent(unused);
    }

    public String toString() {
        return "CmsContent(unused=" + this.unused + ')';
    }

    public CmsContent(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsContent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final List<CmsLayout> getLayouts() {
        List<CmsLayout> list = this.layouts;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layouts");
        return null;
    }

    public final void setLayouts(List<CmsLayout> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.layouts = list;
    }

    public final List<CmsTag> getTags() {
        List<CmsTag> list = this.tags;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tags");
        return null;
    }

    public final void setTags(List<CmsTag> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tags = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsContent(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            r9 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            r9.<init>(r1, r2, r0)
            java.lang.String r0 = "layouts"
            boolean r3 = r10.has(r0)
            if (r3 == 0) goto Lc9
            boolean r3 = r10.isNull(r0)
            if (r3 != 0) goto Lc9
            org.json.JSONArray r0 = r10.getJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r9.setLayouts(r3)
            int r3 = r0.length()
            int r3 = r3 - r2
            java.lang.String r4 = "null cannot be cast to non-null type org.json.JSONObject"
            if (r3 < 0) goto L67
            r5 = r1
        L31:
            int r6 = r5 + 1
            java.lang.Object r7 = r0.get(r5)
            boolean r8 = r7 instanceof org.json.JSONArray
            if (r8 == 0) goto L49
            r8 = r7
            org.json.JSONArray r8 = (org.json.JSONArray) r8
            int r8 = r8.length()
            if (r8 != 0) goto L49
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
        L49:
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsLayout r8 = new com.glority.component.generatedAPI.kotlinAPI.cms.CmsLayout
            if (r7 == 0) goto L61
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            r8.<init>(r7)
            java.util.List r7 = r9.getLayouts()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r7.add(r8)
            if (r5 != r3) goto L5f
            goto L67
        L5f:
            r5 = r6
            goto L31
        L61:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L67:
            java.lang.String r0 = "tags"
            boolean r3 = r10.has(r0)
            if (r3 == 0) goto Lc1
            boolean r3 = r10.isNull(r0)
            if (r3 != 0) goto Lc1
            org.json.JSONArray r10 = r10.getJSONArray(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r9.setTags(r0)
            int r0 = r10.length()
            int r0 = r0 - r2
            if (r0 < 0) goto Lc0
        L8a:
            int r2 = r1 + 1
            java.lang.Object r3 = r10.get(r1)
            boolean r5 = r3 instanceof org.json.JSONArray
            if (r5 == 0) goto La2
            r5 = r3
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r5 = r5.length()
            if (r5 != 0) goto La2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        La2:
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r5 = new com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag
            if (r3 == 0) goto Lba
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r5.<init>(r3)
            java.util.List r3 = r9.getTags()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r3.add(r5)
            if (r1 != r0) goto Lb8
            goto Lc0
        Lb8:
            r1 = r2
            goto L8a
        Lba:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        Lc0:
            return
        Lc1:
            com.glority.android.core.definition.ParameterCheckFailException r10 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "tags is missing in model CmsContent"
            r10.<init>(r0)
            throw r10
        Lc9:
            com.glority.android.core.definition.ParameterCheckFailException r10 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "layouts is missing in model CmsContent"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsContent.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("layouts", CmsLayout.INSTANCE.getCmsLayoutJsonArrayMap(getLayouts()));
        hashMap.put("tags", CmsTag.INSTANCE.getCmsTagJsonArrayMap(getTags()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsContent)) {
            return false;
        }
        CmsContent cmsContent = (CmsContent) other;
        return Intrinsics.areEqual(getLayouts(), cmsContent.getLayouts()) && Intrinsics.areEqual(getTags(), cmsContent.getTags());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getLayouts().hashCode()) * 31) + getTags().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsContent cmsContent = new CmsContent(0, 1, null);
        cloneTo(cmsContent);
        return cmsContent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsContent cmsContent = (CmsContent) o;
            super.cloneTo(cmsContent);
            cmsContent.setLayouts(new ArrayList());
            List<CmsLayout> layouts = getLayouts();
            Intrinsics.checkNotNull(layouts);
            for (CmsLayout cmsLayout : layouts) {
                List<CmsLayout> layouts2 = cmsContent.getLayouts();
                Intrinsics.checkNotNull(layouts2);
                APIModelBase cloneField = cloneField(cmsLayout);
                Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(item)");
                layouts2.add(cloneField);
            }
            cmsContent.setTags(new ArrayList());
            List<CmsTag> tags = getTags();
            Intrinsics.checkNotNull(tags);
            for (CmsTag cmsTag : tags) {
                List<CmsTag> tags2 = cmsContent.getTags();
                Intrinsics.checkNotNull(tags2);
                APIModelBase cloneField2 = cloneField(cmsTag);
                Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(item)");
                tags2.add(cloneField2);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsContent");
    }

    /* compiled from: CmsContent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsContent$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsContentJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsContent;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsContentJsonArrayMap(List<CmsContent> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsContent) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("layouts", CmsLayout.class);
            hashMap.put("tags", CmsTag.class);
            return hashMap;
        }
    }
}
