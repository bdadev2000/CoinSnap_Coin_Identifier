package com.glority.android.cmsui.model;

import com.glority.android.core.definition.APIModelBase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiagnoseDetectRegion.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0014J\t\u0010\u001f\u001a\u00020\bHÂ\u0003J\u0013\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%H\u0016J\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001b0%2\u0006\u0010'\u001a\u00020\"J\b\u0010(\u001a\u00020\bH\u0016J\t\u0010)\u001a\u00020&HÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/glority/android/cmsui/model/DiagnoseDetectRegion;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "detectionScore", "getDetectionScore", "()D", "setDetectionScore", "(D)V", "", TtmlNode.TAG_REGION, "getRegion", "()Ljava/util/List;", "setRegion", "(Ljava/util/List;)V", "strategyScore", "getStrategyScore", "setStrategyScore", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class DiagnoseDetectRegion extends APIModelBase<DiagnoseDetectRegion> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private double detectionScore;
    public List<Double> region;
    private double strategyScore;
    private int unused;

    public DiagnoseDetectRegion() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ DiagnoseDetectRegion copy$default(DiagnoseDetectRegion diagnoseDetectRegion, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = diagnoseDetectRegion.unused;
        }
        return diagnoseDetectRegion.copy(i);
    }

    public final DiagnoseDetectRegion copy(int unused) {
        return new DiagnoseDetectRegion(unused);
    }

    public String toString() {
        return "DiagnoseDetectRegion(unused=" + this.unused + ")";
    }

    public DiagnoseDetectRegion(int i) {
        this.unused = i;
    }

    public /* synthetic */ DiagnoseDetectRegion(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final List<Double> getRegion() {
        List<Double> list = this.region;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
        }
        return list;
    }

    public final void setRegion(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.region = list;
    }

    public final double getDetectionScore() {
        return this.detectionScore;
    }

    public final void setDetectionScore(double d) {
        this.detectionScore = d;
    }

    public final double getStrategyScore() {
        return this.strategyScore;
    }

    public final void setStrategyScore(double d) {
        this.strategyScore = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DiagnoseDetectRegion(org.json.JSONObject r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            r7.<init>(r1, r2, r0)
            java.lang.String r0 = "region"
            boolean r3 = r8.has(r0)
            if (r3 == 0) goto L84
            boolean r3 = r8.isNull(r0)
            if (r3 != 0) goto L84
            org.json.JSONArray r3 = r8.getJSONArray(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r7.region = r4
            int r4 = r3.length()
            int r4 = r4 - r2
            if (r4 < 0) goto L47
        L2d:
            double r5 = r3.getDouble(r1)
            java.util.List<java.lang.Double> r2 = r7.region
            if (r2 != 0) goto L38
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L38:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r2.add(r5)
            if (r1 == r4) goto L47
            int r1 = r1 + 1
            goto L2d
        L47:
            java.lang.String r0 = "detection_score"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto L7a
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto L7a
            double r0 = r8.getDouble(r0)
            r7.detectionScore = r0
            java.lang.String r0 = "strategy_score"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto L70
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto L70
            double r0 = r8.getDouble(r0)
            r7.strategyScore = r0
            return
        L70:
            com.glority.android.core.definition.ParameterCheckFailException r8 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "strategyScore is missing in model DiagnoseDetectRegion"
            r8.<init>(r0)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L7a:
            com.glority.android.core.definition.ParameterCheckFailException r8 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "detectionScore is missing in model DiagnoseDetectRegion"
            r8.<init>(r0)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L84:
            com.glority.android.core.definition.ParameterCheckFailException r8 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "region is missing in model DiagnoseDetectRegion"
            r8.<init>(r0)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.DiagnoseDetectRegion.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        List<Double> list = this.region;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
        }
        hashMap.put(TtmlNode.TAG_REGION, list);
        hashMap.put("detection_score", Double.valueOf(this.detectionScore));
        hashMap.put("strategy_score", Double.valueOf(this.strategyScore));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof DiagnoseDetectRegion)) {
            return false;
        }
        List<Double> list = this.region;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
        }
        DiagnoseDetectRegion diagnoseDetectRegion = (DiagnoseDetectRegion) other;
        List<Double> list2 = diagnoseDetectRegion.region;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
        }
        return !(Intrinsics.areEqual(list, list2) ^ true) && this.detectionScore == diagnoseDetectRegion.detectionScore && this.strategyScore == diagnoseDetectRegion.strategyScore;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        List<Double> list = this.region;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
        }
        return ((((hashCode + list.hashCode()) * 31) + Double.hashCode(this.detectionScore)) * 31) + Double.hashCode(this.strategyScore);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        DiagnoseDetectRegion diagnoseDetectRegion = new DiagnoseDetectRegion(0, 1, null);
        cloneTo(diagnoseDetectRegion);
        return diagnoseDetectRegion;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            DiagnoseDetectRegion diagnoseDetectRegion = (DiagnoseDetectRegion) o;
            super.cloneTo(diagnoseDetectRegion);
            diagnoseDetectRegion.region = new ArrayList();
            List<Double> list = this.region;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
            }
            Intrinsics.checkNotNull(list);
            Iterator<Double> it = list.iterator();
            while (it.hasNext()) {
                double doubleValue = it.next().doubleValue();
                List<Double> list2 = diagnoseDetectRegion.region;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
                }
                Intrinsics.checkNotNull(list2);
                Double cloneField = cloneField(Double.valueOf(doubleValue));
                Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(item)");
                list2.add(cloneField);
            }
            Double cloneField2 = cloneField(Double.valueOf(this.detectionScore));
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.detectionScore)");
            diagnoseDetectRegion.detectionScore = cloneField2.doubleValue();
            Double cloneField3 = cloneField(Double.valueOf(this.strategyScore));
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.strategyScore)");
            diagnoseDetectRegion.strategyScore = cloneField3.doubleValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.cmsui.model.DiagnoseDetectRegion");
    }

    /* compiled from: DiagnoseDetectRegion.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/DiagnoseDetectRegion$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getDiagnoseDetectRegionJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/DiagnoseDetectRegion;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getDiagnoseDetectRegionJsonArrayMap(List<DiagnoseDetectRegion> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DiagnoseDetectRegion) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(TtmlNode.TAG_REGION, Double.TYPE);
            return hashMap;
        }
    }
}
