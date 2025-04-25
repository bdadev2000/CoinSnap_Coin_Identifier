package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendSeries.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00013B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010'\u001a\u00020(J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016J\u0013\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020&H\u0016J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010&H\u0014J\t\u00100\u001a\u00020\u0005HÂ\u0003J\u0013\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00102\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeries;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.title, "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "childType", "getChildType", "setChildType", "composition", "getComposition", "setComposition", "seriesDescription", "getSeriesDescription", "setSeriesDescription", "pageHeaderUrl", "getPageHeaderUrl", "setPageHeaderUrl", "details", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesDetail;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class RecommendSeries extends APIModelBase<RecommendSeries> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String childType;
    public String composition;
    public List<RecommendSeriesDetail> details;
    public String pageHeaderUrl;
    public String seriesDescription;
    public String title;
    private int unused;

    public RecommendSeries() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final RecommendSeries copy(int unused) {
        return new RecommendSeries(unused);
    }

    public String toString() {
        return "RecommendSeries(unused=" + this.unused + ")";
    }

    public RecommendSeries(int i) {
        this.unused = i;
    }

    public /* synthetic */ RecommendSeries(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ RecommendSeries copy$default(RecommendSeries recommendSeries, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recommendSeries.unused;
        }
        return recommendSeries.copy(i);
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.title);
        return null;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getChildType() {
        String str = this.childType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("childType");
        return null;
    }

    public final void setChildType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.childType = str;
    }

    public final String getComposition() {
        String str = this.composition;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("composition");
        return null;
    }

    public final void setComposition(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.composition = str;
    }

    public final String getSeriesDescription() {
        String str = this.seriesDescription;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seriesDescription");
        return null;
    }

    public final void setSeriesDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.seriesDescription = str;
    }

    public final String getPageHeaderUrl() {
        String str = this.pageHeaderUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pageHeaderUrl");
        return null;
    }

    public final void setPageHeaderUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageHeaderUrl = str;
    }

    public final List<RecommendSeriesDetail> getDetails() {
        List<RecommendSeriesDetail> list = this.details;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("details");
        return null;
    }

    public final void setDetails(List<RecommendSeriesDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.details = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecommendSeries(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            r2 = 1
            r5.<init>(r1, r2, r0)
            java.lang.String r0 = "title"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto Lf1
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto Lf1
            java.lang.String r0 = r6.getString(r0)
            r5.setTitle(r0)
            java.lang.String r0 = "child_type"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto Le9
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto Le9
            java.lang.String r0 = r6.getString(r0)
            r5.setChildType(r0)
            java.lang.String r0 = "composition"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto Le1
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto Le1
            java.lang.String r0 = r6.getString(r0)
            r5.setComposition(r0)
            java.lang.String r0 = "series_description"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto Ld9
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto Ld9
            java.lang.String r0 = r6.getString(r0)
            r5.setSeriesDescription(r0)
            java.lang.String r0 = "page_header_url"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto Ld1
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto Ld1
            java.lang.String r0 = r6.getString(r0)
            r5.setPageHeaderUrl(r0)
            java.lang.String r0 = "details"
            boolean r3 = r6.has(r0)
            if (r3 == 0) goto Lc9
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto Lc9
            org.json.JSONArray r6 = r6.getJSONArray(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r5.setDetails(r0)
            int r0 = r6.length()
            int r0 = r0 - r2
            if (r0 < 0) goto Lc8
        L97:
            java.lang.Object r2 = r6.get(r1)
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto Lad
            r3 = r2
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r3 = r3.length()
            if (r3 != 0) goto Lad
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        Lad:
            com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail r3 = new com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail
            java.lang.String r4 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r3.<init>(r2)
            java.util.List r2 = r5.getDetails()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r3)
            if (r1 == r0) goto Lc8
            int r1 = r1 + 1
            goto L97
        Lc8:
            return
        Lc9:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "details is missing in model RecommendSeries"
            r6.<init>(r0)
            throw r6
        Ld1:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "pageHeaderUrl is missing in model RecommendSeries"
            r6.<init>(r0)
            throw r6
        Ld9:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "seriesDescription is missing in model RecommendSeries"
            r6.<init>(r0)
            throw r6
        Le1:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "composition is missing in model RecommendSeries"
            r6.<init>(r0)
            throw r6
        Le9:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "childType is missing in model RecommendSeries"
            r6.<init>(r0)
            throw r6
        Lf1:
            com.glority.android.core.definition.ParameterCheckFailException r6 = new com.glority.android.core.definition.ParameterCheckFailException
            java.lang.String r0 = "title is missing in model RecommendSeries"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeries.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.title, getTitle());
        hashMap.put("child_type", getChildType());
        hashMap.put("composition", getComposition());
        hashMap.put("series_description", getSeriesDescription());
        hashMap.put("page_header_url", getPageHeaderUrl());
        hashMap.put("details", RecommendSeriesDetail.INSTANCE.getRecommendSeriesDetailJsonArrayMap(getDetails()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof RecommendSeries)) {
            return false;
        }
        RecommendSeries recommendSeries = (RecommendSeries) other;
        return Intrinsics.areEqual(getTitle(), recommendSeries.getTitle()) && Intrinsics.areEqual(getChildType(), recommendSeries.getChildType()) && Intrinsics.areEqual(getComposition(), recommendSeries.getComposition()) && Intrinsics.areEqual(getSeriesDescription(), recommendSeries.getSeriesDescription()) && Intrinsics.areEqual(getPageHeaderUrl(), recommendSeries.getPageHeaderUrl()) && Intrinsics.areEqual(getDetails(), recommendSeries.getDetails());
    }

    public int hashCode() {
        return (((((((((((getClass().hashCode() * 31) + getTitle().hashCode()) * 31) + getChildType().hashCode()) * 31) + getComposition().hashCode()) * 31) + getSeriesDescription().hashCode()) * 31) + getPageHeaderUrl().hashCode()) * 31) + getDetails().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        RecommendSeries recommendSeries = new RecommendSeries(0, 1, null);
        cloneTo(recommendSeries);
        return recommendSeries;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeries");
        RecommendSeries recommendSeries = (RecommendSeries) o;
        super.cloneTo(recommendSeries);
        recommendSeries.setTitle(cloneField(getTitle()));
        recommendSeries.setChildType(cloneField(getChildType()));
        recommendSeries.setComposition(cloneField(getComposition()));
        recommendSeries.setSeriesDescription(cloneField(getSeriesDescription()));
        recommendSeries.setPageHeaderUrl(cloneField(getPageHeaderUrl()));
        recommendSeries.setDetails(new ArrayList());
        List<RecommendSeriesDetail> details = getDetails();
        Intrinsics.checkNotNull(details);
        for (RecommendSeriesDetail recommendSeriesDetail : details) {
            List<RecommendSeriesDetail> details2 = recommendSeries.getDetails();
            Intrinsics.checkNotNull(details2);
            APIModelBase cloneField = cloneField(recommendSeriesDetail);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            details2.add(cloneField);
        }
    }

    /* compiled from: RecommendSeries.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeries$Companion;", "", "<init>", "()V", "getRecommendSeriesJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeries;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getRecommendSeriesJsonArrayMap(List<RecommendSeries> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RecommendSeries) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("details", RecommendSeriesDetail.class);
            return hashMap;
        }
    }
}
