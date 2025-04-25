package com.glority.android.picturexx.entity;

import androidx.compose.runtime.MutableState;
import com.glority.android.cmsui2.bean.VarietyV2Entity;
import com.glority.android.cmsui2.bean.YearWithMintmarkV2;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ValueCheckUiEntity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006J\u0012\u00105\u001a\u0004\u0018\u00010\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\u0012\u00106\u001a\u0004\u0018\u00010\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\b\u00107\u001a\u0004\u0018\u00010\u0006J\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013J\u0014\u00109\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R/\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#R/\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010#R/\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010#R/\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u0010#¨\u0006:"}, d2 = {"Lcom/glority/android/picturexx/entity/ValueCheckUiEntity;", "", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "engineRecognizeYearMap", "", "", "uidYearDefaultVarietyUidMap", "mergeImage", "grade", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getCmsName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getUidYearDefaultVarietyUidMap", "()Ljava/util/Map;", "getMergeImage", "()Ljava/lang/String;", "yearWithMintMarkV2List", "", "Lcom/glority/android/cmsui2/bean/YearWithMintmarkV2;", "getYearWithMintMarkV2List", "()Ljava/util/List;", "fullVarietyList", "Lcom/glority/android/cmsui2/bean/VarietyV2Entity;", "getFullVarietyList", "yearRange", "getYearRange", "yearRangeDesc", Args.title, "getTitle", "<set-?>", "selectedYear", "getSelectedYear", "setSelectedYear", "(Ljava/lang/String;)V", "selectedYear$delegate", "Landroidx/compose/runtime/MutableState;", "selectedVarietyUid", "getSelectedVarietyUid", "setSelectedVarietyUid", "selectedVarietyUid$delegate", "selectedSpeciesUid", "getSelectedSpeciesUid", "setSelectedSpeciesUid", "selectedSpeciesUid$delegate", "selectedGrade", "getSelectedGrade", "setSelectedGrade", "selectedGrade$delegate", "setYear", "", Args.year, "getDefaultVarietyUid", "getDefaultSpeciesUid", "getSelectedVarietyDisplayName", "getCurrentYearVarietyList", "getYearRangeDesc", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ValueCheckUiEntity {
    public static final int $stable = 8;
    private final CmsName cmsName;
    private final List<VarietyV2Entity> fullVarietyList;
    private final String mergeImage;

    /* renamed from: selectedGrade$delegate, reason: from kotlin metadata */
    private final MutableState selectedGrade;

    /* renamed from: selectedSpeciesUid$delegate, reason: from kotlin metadata */
    private final MutableState selectedSpeciesUid;

    /* renamed from: selectedVarietyUid$delegate, reason: from kotlin metadata */
    private final MutableState selectedVarietyUid;

    /* renamed from: selectedYear$delegate, reason: from kotlin metadata */
    private final MutableState selectedYear;
    private final String title;
    private final Map<String, Object> uidYearDefaultVarietyUidMap;
    private final List<String> yearRange;
    private final String yearRangeDesc;
    private final List<YearWithMintmarkV2> yearWithMintMarkV2List;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r3 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r3 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ValueCheckUiEntity(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4, java.util.Map<java.lang.String, ? extends java.lang.Object> r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.entity.ValueCheckUiEntity.<init>(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName, java.util.Map, java.util.Map, java.lang.String, java.lang.String):void");
    }

    public final CmsName getCmsName() {
        return this.cmsName;
    }

    public final Map<String, Object> getUidYearDefaultVarietyUidMap() {
        return this.uidYearDefaultVarietyUidMap;
    }

    public final String getMergeImage() {
        return this.mergeImage;
    }

    public final List<YearWithMintmarkV2> getYearWithMintMarkV2List() {
        return this.yearWithMintMarkV2List;
    }

    public final List<VarietyV2Entity> getFullVarietyList() {
        return this.fullVarietyList;
    }

    public final List<String> getYearRange() {
        return this.yearRange;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedYear() {
        return (String) this.selectedYear.getValue();
    }

    public final void setSelectedYear(String str) {
        this.selectedYear.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedVarietyUid() {
        return (String) this.selectedVarietyUid.getValue();
    }

    public final void setSelectedVarietyUid(String str) {
        this.selectedVarietyUid.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedSpeciesUid() {
        return (String) this.selectedSpeciesUid.getValue();
    }

    public final void setSelectedSpeciesUid(String str) {
        this.selectedSpeciesUid.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedGrade() {
        return (String) this.selectedGrade.getValue();
    }

    public final void setSelectedGrade(String str) {
        this.selectedGrade.setValue(str);
    }

    public final void setYear(String year) {
        Intrinsics.checkNotNullParameter(year, "year");
        setSelectedYear(year);
        setSelectedVarietyUid(getDefaultVarietyUid(year));
        setSelectedSpeciesUid(getDefaultSpeciesUid(year));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getDefaultVarietyUid(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.uidYearDefaultVarietyUidMap     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L10
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r2 = r5.cmsName     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = r2.getUid()     // Catch: java.lang.Exception -> L28
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L28
            goto L11
        L10:
            r1 = r0
        L11:
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L28
            if (r2 == 0) goto L18
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L28
            goto L19
        L18:
            r1 = r0
        L19:
            if (r1 == 0) goto L20
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Exception -> L28
            goto L21
        L20:
            r1 = r0
        L21:
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L28
            if (r2 == 0) goto L3e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L28
            goto L3f
        L28:
            r1 = move-exception
            com.glority.android.core.app.AppContext r2 = com.glority.android.core.app.AppContext.INSTANCE
            boolean r2 = r2.isDebugMode()
            if (r2 == 0) goto L3e
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.glority.utils.stability.LogUtils.e(r1)
        L3e:
            r1 = r0
        L3f:
            if (r1 == 0) goto L42
            return r1
        L42:
            java.util.List<com.glority.android.cmsui2.bean.YearWithMintmarkV2> r1 = r5.yearWithMintMarkV2List
            if (r1 == 0) goto L68
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L4c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.glority.android.cmsui2.bean.YearWithMintmarkV2 r3 = (com.glority.android.cmsui2.bean.YearWithMintmarkV2) r3
            java.lang.String r3 = r3.getYear()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)
            if (r3 == 0) goto L4c
            goto L65
        L64:
            r2 = r0
        L65:
            com.glority.android.cmsui2.bean.YearWithMintmarkV2 r2 = (com.glority.android.cmsui2.bean.YearWithMintmarkV2) r2
            goto L69
        L68:
            r2 = r0
        L69:
            if (r2 == 0) goto L9c
            java.util.List r6 = r2.getVarietyList()
            if (r6 == 0) goto L9c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L77:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r6.next()
            r3 = r1
            com.glority.android.cmsui2.bean.VarietyV2Entity r3 = (com.glority.android.cmsui2.bean.VarietyV2Entity) r3
            java.lang.String r3 = r3.getVarietyUid()
            java.lang.String r4 = r2.getDefaultMintMark()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L77
            goto L94
        L93:
            r1 = r0
        L94:
            com.glority.android.cmsui2.bean.VarietyV2Entity r1 = (com.glority.android.cmsui2.bean.VarietyV2Entity) r1
            if (r1 == 0) goto L9c
            java.lang.String r0 = r1.getVarietyUid()
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.entity.ValueCheckUiEntity.getDefaultVarietyUid(java.lang.String):java.lang.String");
    }

    private final String getDefaultSpeciesUid(String year) {
        YearWithMintmarkV2 yearWithMintmarkV2;
        List<VarietyV2Entity> varietyList;
        Object obj;
        Object obj2;
        List<YearWithMintmarkV2> list = this.yearWithMintMarkV2List;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((YearWithMintmarkV2) obj2).getYear(), year)) {
                    break;
                }
            }
            yearWithMintmarkV2 = (YearWithMintmarkV2) obj2;
        } else {
            yearWithMintmarkV2 = null;
        }
        if (yearWithMintmarkV2 == null || (varietyList = yearWithMintmarkV2.getVarietyList()) == null) {
            return null;
        }
        Iterator<T> it2 = varietyList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.areEqual(((VarietyV2Entity) obj).getMintmark(), yearWithMintmarkV2.getDefaultMintMark())) {
                break;
            }
        }
        VarietyV2Entity varietyV2Entity = (VarietyV2Entity) obj;
        if (varietyV2Entity != null) {
            return varietyV2Entity.getSpeciesUid();
        }
        return null;
    }

    public final String getSelectedVarietyDisplayName() {
        Object obj;
        Iterator<T> it = this.fullVarietyList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((VarietyV2Entity) obj).getVarietyUid(), getSelectedVarietyUid())) {
                break;
            }
        }
        VarietyV2Entity varietyV2Entity = (VarietyV2Entity) obj;
        if (varietyV2Entity != null) {
            return varietyV2Entity.getMintmark();
        }
        return null;
    }

    public final List<VarietyV2Entity> getCurrentYearVarietyList() {
        Object obj;
        List<YearWithMintmarkV2> list = this.yearWithMintMarkV2List;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((YearWithMintmarkV2) obj).getYear(), getSelectedYear())) {
                break;
            }
        }
        YearWithMintmarkV2 yearWithMintmarkV2 = (YearWithMintmarkV2) obj;
        if (yearWithMintmarkV2 != null) {
            return yearWithMintmarkV2.getVarietyList();
        }
        return null;
    }

    public final String getYearRangeDesc(List<String> yearRange) {
        Intrinsics.checkNotNullParameter(yearRange, "yearRange");
        if (yearRange.isEmpty()) {
            return "";
        }
        if (!Intrinsics.areEqual(CollectionsKt.first((List) yearRange), CollectionsKt.last((List) yearRange))) {
            return CollectionsKt.first((List<? extends Object>) yearRange) + " - " + CollectionsKt.last((List) yearRange);
        }
        return ((String) CollectionsKt.first((List) yearRange)).toString();
    }
}
