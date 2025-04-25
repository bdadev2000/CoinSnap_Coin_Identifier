package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.SimpleCmsName;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsNameList.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010%H\u0014J\t\u0010)\u001a\u00020\bHÂ\u0003J\u0013\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0016\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0/H\u0016J\u001c\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0/2\u0006\u00100\u001a\u00020,J\b\u00101\u001a\u00020\bH\u0016J\t\u00102\u001a\u00020\fHÖ\u0001R6\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R6\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R*\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R*\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R&\u0010!\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsNameList;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "", "fields", "getFields", "()Ljava/util/List;", "setFields", "(Ljava/util/List;)V", "imageUrl", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/SimpleCmsName;", FirebaseAnalytics.Param.ITEMS, "getItems", "setItems", "summary", "getSummary", "setSummary", Args.title, "getTitle", "setTitle", Args.uid, "getUid", "setUid", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsNameList extends APIModelBase<CmsNameList> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<String> fields;
    private String imageUrl;
    private List<SimpleCmsName> items;
    private String summary;
    private String title;
    public String uid;
    private int unused;

    public CmsNameList() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsNameList copy$default(CmsNameList cmsNameList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsNameList.unused;
        }
        return cmsNameList.copy(i);
    }

    public final CmsNameList copy(int unused) {
        return new CmsNameList(unused);
    }

    public String toString() {
        return "CmsNameList(unused=" + this.unused + ')';
    }

    public CmsNameList(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsNameList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final void setSummary(String str) {
        this.summary = str;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final List<SimpleCmsName> getItems() {
        return this.items;
    }

    public final void setItems(List<SimpleCmsName> list) {
        this.items = list;
    }

    public final List<String> getFields() {
        return this.fields;
    }

    public final void setFields(List<String> list) {
        this.fields = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CmsNameList(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.CmsNameList.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        String str = this.title;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put(Args.title, str);
        } else if (keepNull) {
            hashMap.put(Args.title, null);
        }
        String str2 = this.summary;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("summary", str2);
        } else if (keepNull) {
            hashMap.put("summary", null);
        }
        String str3 = this.imageUrl;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("image_url", str3);
        } else if (keepNull) {
            hashMap.put("image_url", null);
        }
        if (this.items != null) {
            SimpleCmsName.Companion companion = SimpleCmsName.INSTANCE;
            List<SimpleCmsName> list = this.items;
            Intrinsics.checkNotNull(list);
            hashMap.put(FirebaseAnalytics.Param.ITEMS, companion.getSimpleCmsNameJsonArrayMap(list));
        } else if (keepNull) {
            hashMap.put(FirebaseAnalytics.Param.ITEMS, null);
        }
        List<String> list2 = this.fields;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            hashMap.put("fields", list2);
        } else if (keepNull) {
            hashMap.put("fields", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsNameList)) {
            return false;
        }
        CmsNameList cmsNameList = (CmsNameList) other;
        return Intrinsics.areEqual(getUid(), cmsNameList.getUid()) && Intrinsics.areEqual(this.title, cmsNameList.title) && Intrinsics.areEqual(this.summary, cmsNameList.summary) && Intrinsics.areEqual(this.imageUrl, cmsNameList.imageUrl) && Intrinsics.areEqual(this.items, cmsNameList.items) && Intrinsics.areEqual(this.fields, cmsNameList.fields);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + getUid().hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.summary;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<SimpleCmsName> list = this.items;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.fields;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsNameList cmsNameList = new CmsNameList(0, 1, null);
        cloneTo(cmsNameList);
        return cmsNameList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsNameList cmsNameList = (CmsNameList) o;
            super.cloneTo(cmsNameList);
            String cloneField = cloneField(getUid());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.uid)");
            cmsNameList.setUid(cloneField);
            String str = this.title;
            cmsNameList.title = str != null ? cloneField(str) : null;
            String str2 = this.summary;
            cmsNameList.summary = str2 != null ? cloneField(str2) : null;
            String str3 = this.imageUrl;
            cmsNameList.imageUrl = str3 != null ? cloneField(str3) : null;
            if (this.items == null) {
                cmsNameList.items = null;
            } else {
                cmsNameList.items = new ArrayList();
                List<SimpleCmsName> list = this.items;
                Intrinsics.checkNotNull(list);
                for (APIModelBase aPIModelBase : list) {
                    List<SimpleCmsName> list2 = cmsNameList.items;
                    Intrinsics.checkNotNull(list2);
                    APIModelBase cloneField2 = cloneField(aPIModelBase);
                    Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(item)");
                    list2.add(cloneField2);
                }
            }
            if (this.fields == null) {
                cmsNameList.fields = null;
                return;
            }
            cmsNameList.fields = new ArrayList();
            List<String> list3 = this.fields;
            Intrinsics.checkNotNull(list3);
            for (String str4 : list3) {
                List<String> list4 = cmsNameList.fields;
                Intrinsics.checkNotNull(list4);
                String cloneField3 = cloneField(str4);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                list4.add(cloneField3);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsNameList");
    }

    /* compiled from: CmsNameList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsNameList$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsNameListJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsNameList;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsNameListJsonArrayMap(List<CmsNameList> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsNameList) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(FirebaseAnalytics.Param.ITEMS, SimpleCmsName.class);
            hashMap.put("fields", String.class);
            return hashMap;
        }
    }
}
