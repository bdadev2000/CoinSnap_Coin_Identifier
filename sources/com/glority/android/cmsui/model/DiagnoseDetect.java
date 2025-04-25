package com.glority.android.cmsui.model;

import com.glority.android.cmsui.model.DiagnoseDetectRegion;
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

/* compiled from: DiagnoseDetect.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0014J\t\u0010\u0017\u001a\u00020\bHÂ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0016\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001dH\u0016J\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001d2\u0006\u0010\u001f\u001a\u00020\u001aJ\b\u0010 \u001a\u00020\bH\u0016J\t\u0010!\u001a\u00020\u001eHÖ\u0001R2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/glority/android/cmsui/model/DiagnoseDetect;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "Lcom/glority/android/cmsui/model/DiagnoseDetectRegion;", "regions", "getRegions", "()Ljava/util/List;", "setRegions", "(Ljava/util/List;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class DiagnoseDetect extends APIModelBase<DiagnoseDetect> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<DiagnoseDetectRegion> regions;
    private int unused;

    public DiagnoseDetect() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ DiagnoseDetect copy$default(DiagnoseDetect diagnoseDetect, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = diagnoseDetect.unused;
        }
        return diagnoseDetect.copy(i);
    }

    public final DiagnoseDetect copy(int unused) {
        return new DiagnoseDetect(unused);
    }

    public String toString() {
        return "DiagnoseDetect(unused=" + this.unused + ")";
    }

    public DiagnoseDetect(int i) {
        this.unused = i;
    }

    public /* synthetic */ DiagnoseDetect(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final List<DiagnoseDetectRegion> getRegions() {
        List<DiagnoseDetectRegion> list = this.regions;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("regions");
        }
        return list;
    }

    public final void setRegions(List<DiagnoseDetectRegion> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.regions = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DiagnoseDetect(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            r5.<init>(r1, r2, r0)
            java.lang.String r0 = "regions"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto L67
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L67
            org.json.JSONArray r6 = r6.getJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r5.regions = r3
            int r3 = r6.length()
            int r3 = r3 - r2
            if (r3 < 0) goto L66
        L2d:
            java.lang.Object r2 = r6.get(r1)
            boolean r4 = r2 instanceof org.json.JSONArray
            if (r4 == 0) goto L43
            r4 = r2
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r4 = r4.length()
            if (r4 != 0) goto L43
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L43:
            com.glority.android.cmsui.model.DiagnoseDetectRegion r4 = new com.glority.android.cmsui.model.DiagnoseDetectRegion
            if (r2 == 0) goto L5e
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r4.<init>(r2)
            java.util.List<com.glority.android.cmsui.model.DiagnoseDetectRegion> r2 = r5.regions
            if (r2 != 0) goto L53
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L53:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            if (r1 == r3) goto L66
            int r1 = r1 + 1
            goto L2d
        L5e:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type org.json.JSONObject"
            r6.<init>(r0)
            throw r6
        L66:
            return
        L67:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "regions is missing in model DiagnoseDetect"
            r6.<init>(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.DiagnoseDetect.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        DiagnoseDetectRegion.Companion companion = DiagnoseDetectRegion.INSTANCE;
        List<DiagnoseDetectRegion> list = this.regions;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("regions");
        }
        hashMap.put("regions", companion.getDiagnoseDetectRegionJsonArrayMap(list));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof DiagnoseDetect)) {
            return false;
        }
        List<DiagnoseDetectRegion> list = this.regions;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("regions");
        }
        List<DiagnoseDetectRegion> list2 = ((DiagnoseDetect) other).regions;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("regions");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        List<DiagnoseDetectRegion> list = this.regions;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("regions");
        }
        return hashCode + list.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        DiagnoseDetect diagnoseDetect = new DiagnoseDetect(0, 1, null);
        cloneTo(diagnoseDetect);
        return diagnoseDetect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            DiagnoseDetect diagnoseDetect = (DiagnoseDetect) o;
            super.cloneTo(diagnoseDetect);
            diagnoseDetect.regions = new ArrayList();
            List<DiagnoseDetectRegion> list = this.regions;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("regions");
            }
            Intrinsics.checkNotNull(list);
            for (APIModelBase aPIModelBase : list) {
                List<DiagnoseDetectRegion> list2 = diagnoseDetect.regions;
                if (list2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("regions");
                }
                Intrinsics.checkNotNull(list2);
                APIModelBase cloneField = cloneField(aPIModelBase);
                Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(item)");
                list2.add(cloneField);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.cmsui.model.DiagnoseDetect");
    }

    /* compiled from: DiagnoseDetect.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/DiagnoseDetect$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getDiagnoseDetectJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/DiagnoseDetect;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getDiagnoseDetectJsonArrayMap(List<DiagnoseDetect> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DiagnoseDetect) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("regions", DiagnoseDetectRegion.class);
            return hashMap;
        }
    }
}
