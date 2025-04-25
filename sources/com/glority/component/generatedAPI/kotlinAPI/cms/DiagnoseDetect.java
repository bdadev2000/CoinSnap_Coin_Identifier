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

/* compiled from: DiagnoseDetect.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0014J\t\u0010\u0017\u001a\u00020\bHÂ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0016\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001dH\u0016J\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001d2\u0006\u0010\u001f\u001a\u00020\u001aJ\b\u0010 \u001a\u00020\bH\u0016J\t\u0010!\u001a\u00020\u001eHÖ\u0001R2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/DiagnoseDetect;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/DiagnoseDetectRegion;", "regions", "getRegions", "()Ljava/util/List;", "setRegions", "(Ljava/util/List;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
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
        return "DiagnoseDetect(unused=" + this.unused + ')';
    }

    public DiagnoseDetect(int i) {
        this.unused = i;
    }

    public /* synthetic */ DiagnoseDetect(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final List<DiagnoseDetectRegion> getRegions() {
        List<DiagnoseDetectRegion> list = this.regions;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regions");
        return null;
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
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r5.setRegions(r0)
            int r0 = r6.length()
            int r0 = r0 - r2
            if (r0 < 0) goto L66
        L2e:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L46
            r4 = r3
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r4 = r4.length()
            if (r4 != 0) goto L46
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L46:
            com.glority.component.generatedAPI.kotlinAPI.cms.DiagnoseDetectRegion r4 = new com.glority.component.generatedAPI.kotlinAPI.cms.DiagnoseDetectRegion
            if (r3 == 0) goto L5e
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r4.<init>(r3)
            java.util.List r3 = r5.getRegions()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r3.add(r4)
            if (r1 != r0) goto L5c
            goto L66
        L5c:
            r1 = r2
            goto L2e
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
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.DiagnoseDetect.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("regions", DiagnoseDetectRegion.INSTANCE.getDiagnoseDetectRegionJsonArrayMap(getRegions()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        return other != null && (other instanceof DiagnoseDetect) && Intrinsics.areEqual(getRegions(), ((DiagnoseDetect) other).getRegions());
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + getRegions().hashCode();
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
            diagnoseDetect.setRegions(new ArrayList());
            List<DiagnoseDetectRegion> regions = getRegions();
            Intrinsics.checkNotNull(regions);
            for (DiagnoseDetectRegion diagnoseDetectRegion : regions) {
                List<DiagnoseDetectRegion> regions2 = diagnoseDetect.getRegions();
                Intrinsics.checkNotNull(regions2);
                APIModelBase cloneField = cloneField(diagnoseDetectRegion);
                Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(item)");
                regions2.add(cloneField);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.DiagnoseDetect");
    }

    /* compiled from: DiagnoseDetect.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/DiagnoseDetect$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getDiagnoseDetectJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/DiagnoseDetect;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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
