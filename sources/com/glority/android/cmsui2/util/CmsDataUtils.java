package com.glority.android.cmsui2.util;

import android.util.Log;
import com.glority.android.cmsui2.bean.MonthlyValueForGrades;
import com.glority.android.core.app.AppContext;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag;
import com.glority.component.generatedAPI.kotlinAPI.cms.TaxonomyName;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CmsDataUtils.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u0006J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/glority/android/cmsui2/util/CmsDataUtils;", "", "<init>", "()V", "toKnowMoreUrl", "", "", "getToKnowMoreUrl", "language", "processValuesForGrade", "", "Lcom/glority/android/cmsui2/bean/ValueForGradesV2;", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "parseRecognizeYear", "parsePriceRangeByYears", "years", "getPriceFromCms", "parsePricePerYear", "Lcom/glority/android/cmsui2/bean/MonthlyValueForGrades;", "parseYearWithMintmark", "parseYearWithMintmarkV2", "Lcom/glority/android/cmsui2/bean/YearWithMintmarkV2;", "isAmericaCoin", "", "getTagValue", "tag", "getCurrentRightYear", "getCountryFlagIconUrl", "issuerCountryCode", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class CmsDataUtils {
    public static final CmsDataUtils INSTANCE = new CmsDataUtils();
    private static final Map<String, String> toKnowMoreUrl = MapsKt.mapOf(TuplesKt.to("en", "https://en.wikipedia.org/wiki/Sheldon_coin_grading_scale"), TuplesKt.to("fr", "https://fr.wikipedia.org/wiki/%C3%89tat_de_conservation_numismatique"), TuplesKt.to("de", "https://de.wikipedia.org/wiki/Erhaltungsgrade_von_M%C3%BCnzen"));

    private CmsDataUtils() {
    }

    public final String getToKnowMoreUrl(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        Map<String, String> map = toKnowMoreUrl;
        String str = map.get(language);
        if (str != null) {
            return str;
        }
        String str2 = map.get("en");
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0006, B:5:0x000c, B:6:0x0012, B:8:0x0018, B:12:0x002d, B:14:0x0031, B:16:0x0037, B:18:0x0040, B:20:0x0048, B:22:0x0050), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.glority.android.cmsui2.bean.ValueForGradesV2> processValuesForGrade(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cmsName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.util.List r5 = r5.getTags()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L4d
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L65
        L12:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L65
            r2 = r1
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r2 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r2     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r2.getTagName()     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "ValueForGradesV2"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L12
            goto L2d
        L2c:
            r1 = r0
        L2d:
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r1 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r1     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L4d
            java.util.List r5 = r1.getTagValues()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L4d
            r1 = 0
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L65
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L4d
            java.lang.String r1 = "value"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L4d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L65
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L65
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            com.glority.android.cmsui2.util.CmsDataUtils$processValuesForGrade$data$1 r2 = new com.glority.android.cmsui2.util.CmsDataUtils$processValuesForGrade$data$1     // Catch: java.lang.Throwable -> L65
            r2.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Throwable -> L65
            java.lang.Object r5 = r1.fromJson(r5, r2)     // Catch: java.lang.Throwable -> L65
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L65
            return r5
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui2.util.CmsDataUtils.processValuesForGrade(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:23:0x005a, B:25:0x0073, B:28:0x009e), top: B:22:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #0 {all -> 0x00c9, blocks: (B:23:0x005a, B:25:0x0073, B:28:0x009e), top: B:22:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> parseRecognizeYear(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cmsName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.List r10 = r10.getTags()
            r0 = 0
            r1 = 0
            if (r10 == 0) goto L4d
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L13:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r10.next()
            r3 = r2
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r3 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r3
            java.lang.String r3 = r3.getTagName()
            java.lang.String r4 = "Year"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L13
            goto L2e
        L2d:
            r2 = r0
        L2e:
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r2 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r2
            if (r2 == 0) goto L4d
            java.util.List r10 = r2.getTagValues()
            if (r10 == 0) goto L4d
            java.lang.Object r10 = r10.get(r1)
            java.util.Map r10 = (java.util.Map) r10
            if (r10 == 0) goto L4d
            java.lang.String r2 = "value"
            java.lang.Object r10 = r10.get(r2)
            if (r10 == 0) goto L4d
            java.lang.String r10 = r10.toString()
            goto L4e
        L4d:
            r10 = r0
        L4e:
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto Lc9
            int r2 = r2.length()
            if (r2 != 0) goto L5a
            goto Lc9
        L5a:
            r3 = r10
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> Lc9
            r10 = 1
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = " - "
            r4[r1] = r2     // Catch: java.lang.Throwable -> Lc9
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            java.util.List r2 = kotlin.text.StringsKt.split$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc9
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Lc9
            r4 = 2
            if (r3 <= r10) goto L9e
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r4 = r2.get(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc9
            r3[r1] = r4     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r1 = r2.get(r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r3[r10] = r1     // Catch: java.lang.Throwable -> Lc9
            java.util.List r10 = kotlin.collections.CollectionsKt.mutableListOf(r3)     // Catch: java.lang.Throwable -> Lc9
            return r10
        L9e:
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r4 = r2.get(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc9
            r3[r1] = r4     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> Lc9
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r3[r10] = r1     // Catch: java.lang.Throwable -> Lc9
            java.util.List r10 = kotlin.collections.CollectionsKt.mutableListOf(r3)     // Catch: java.lang.Throwable -> Lc9
            return r10
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui2.util.CmsDataUtils.parseRecognizeYear(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName):java.util.List");
    }

    public final String parsePriceRangeByYears(List<String> years, CmsName cmsName) {
        List<MonthlyValueForGrades> parsePricePerYear;
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(years, "years");
        Intrinsics.checkNotNullParameter(cmsName, "cmsName");
        try {
            parsePricePerYear = INSTANCE.parsePricePerYear(cmsName);
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (parsePricePerYear == null) {
            return null;
        }
        if (years.size() > 1) {
            Iterator<T> it = parsePricePerYear.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((MonthlyValueForGrades) obj3).isNonYear()) {
                    break;
                }
            }
            MonthlyValueForGrades monthlyValueForGrades = (MonthlyValueForGrades) obj3;
            if (monthlyValueForGrades != null) {
                return monthlyValueForGrades.getDefaultGradePriceRange();
            }
            return null;
        }
        if (years.size() == 1) {
            Iterator<T> it2 = parsePricePerYear.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((MonthlyValueForGrades) obj).getYear(), CollectionsKt.firstOrNull((List) years))) {
                    break;
                }
            }
            MonthlyValueForGrades monthlyValueForGrades2 = (MonthlyValueForGrades) obj;
            if (monthlyValueForGrades2 == null) {
                Iterator<T> it3 = parsePricePerYear.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next = it3.next();
                    if (((MonthlyValueForGrades) next).isNonYear()) {
                        obj2 = next;
                        break;
                    }
                }
                monthlyValueForGrades2 = (MonthlyValueForGrades) obj2;
            }
            if (monthlyValueForGrades2 != null) {
                return monthlyValueForGrades2.getDefaultGradePriceRange();
            }
            return null;
        }
        Unit unit = Unit.INSTANCE;
        return null;
    }

    public final String getPriceFromCms(CmsName cmsName) {
        List<Map<String, Object>> tagValues;
        Map map;
        Object obj;
        Intrinsics.checkNotNullParameter(cmsName, "cmsName");
        try {
            List<CmsTag> tags = cmsName.getTags();
            if (tags == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : tags) {
                if (Intrinsics.areEqual(((CmsTag) obj2).getTagName(), "Value")) {
                    arrayList.add(obj2);
                }
            }
            CmsTag cmsTag = (CmsTag) CollectionsKt.firstOrNull((List) arrayList);
            if (cmsTag == null || (tagValues = cmsTag.getTagValues()) == null || (map = (Map) CollectionsKt.firstOrNull((List) tagValues)) == null || (obj = map.get("value")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:3:0x0006, B:5:0x000c, B:6:0x0012, B:8:0x0018, B:12:0x002d, B:14:0x0031, B:16:0x0037, B:18:0x0040, B:19:0x0048, B:21:0x004c, B:22:0x0050, B:24:0x0055, B:27:0x005c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.glority.android.cmsui2.bean.MonthlyValueForGrades> parsePricePerYear(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cmsName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.util.List r5 = r5.getTags()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L72
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L72
        L12:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L72
            r2 = r1
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r2 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r2     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.getTagName()     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "MonthlyValueForGrades"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L12
            goto L2d
        L2c:
            r1 = r0
        L2d:
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r1 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r1     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L47
            java.util.List r5 = r1.getTagValues()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            r1 = 0
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L72
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            java.lang.String r1 = "value"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L72
            goto L48
        L47:
            r5 = r0
        L48:
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L4f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L72
            goto L50
        L4f:
            r5 = r0
        L50:
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L71
            int r1 = r1.length()     // Catch: java.lang.Exception -> L72
            if (r1 != 0) goto L5c
            goto L71
        L5c:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            com.glority.android.cmsui2.util.CmsDataUtils$parsePricePerYear$1$data$1 r2 = new com.glority.android.cmsui2.util.CmsDataUtils$parsePricePerYear$1$data$1     // Catch: java.lang.Exception -> L72
            r2.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L72
            java.lang.Object r5 = r1.fromJson(r5, r2)     // Catch: java.lang.Exception -> L72
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L72
            return r5
        L71:
            return r0
        L72:
            r5 = move-exception
            com.glority.android.core.app.AppContext r1 = com.glority.android.core.app.AppContext.INSTANCE
            boolean r1 = r1.isDebugMode()
            if (r1 == 0) goto L88
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.glority.utils.stability.LogUtils.e(r5)
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui2.util.CmsDataUtils.parsePricePerYear(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:3:0x0006, B:5:0x000c, B:6:0x0012, B:8:0x0018, B:12:0x002d, B:14:0x0031, B:16:0x0037, B:18:0x0040, B:19:0x0048, B:21:0x004c, B:22:0x0050, B:24:0x0055, B:27:0x005c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.glority.android.cmsui2.bean.MonthlyValueForGrades> parseYearWithMintmark(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cmsName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.util.List r5 = r5.getTags()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L72
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L72
        L12:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L72
            r2 = r1
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r2 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r2     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.getTagName()     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "YearWithMintmark"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L12
            goto L2d
        L2c:
            r1 = r0
        L2d:
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r1 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r1     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L47
            java.util.List r5 = r1.getTagValues()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            r1 = 0
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L72
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            java.lang.String r1 = "value"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L72
            goto L48
        L47:
            r5 = r0
        L48:
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L4f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L72
            goto L50
        L4f:
            r5 = r0
        L50:
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L71
            int r1 = r1.length()     // Catch: java.lang.Exception -> L72
            if (r1 != 0) goto L5c
            goto L71
        L5c:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            com.glority.android.cmsui2.util.CmsDataUtils$parseYearWithMintmark$1$data$1 r2 = new com.glority.android.cmsui2.util.CmsDataUtils$parseYearWithMintmark$1$data$1     // Catch: java.lang.Exception -> L72
            r2.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L72
            java.lang.Object r5 = r1.fromJson(r5, r2)     // Catch: java.lang.Exception -> L72
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L72
            return r5
        L71:
            return r0
        L72:
            r5 = move-exception
            com.glority.android.core.app.AppContext r1 = com.glority.android.core.app.AppContext.INSTANCE
            boolean r1 = r1.isDebugMode()
            if (r1 == 0) goto L88
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.glority.utils.stability.LogUtils.e(r5)
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui2.util.CmsDataUtils.parseYearWithMintmark(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:3:0x0006, B:5:0x000c, B:6:0x0012, B:8:0x0018, B:12:0x002d, B:14:0x0031, B:16:0x0037, B:18:0x0040, B:19:0x0048, B:21:0x004c, B:22:0x0050, B:24:0x0055, B:27:0x005c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.glority.android.cmsui2.bean.YearWithMintmarkV2> parseYearWithMintmarkV2(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cmsName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.util.List r5 = r5.getTags()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L72
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L72
        L12:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L72
            r2 = r1
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r2 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r2     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.getTagName()     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "YearWithMintmarkV2"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L12
            goto L2d
        L2c:
            r1 = r0
        L2d:
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag r1 = (com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag) r1     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L47
            java.util.List r5 = r1.getTagValues()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            r1 = 0
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L72
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L47
            java.lang.String r1 = "value"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L72
            goto L48
        L47:
            r5 = r0
        L48:
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L4f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L72
            goto L50
        L4f:
            r5 = r0
        L50:
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L71
            int r1 = r1.length()     // Catch: java.lang.Exception -> L72
            if (r1 != 0) goto L5c
            goto L71
        L5c:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            com.glority.android.cmsui2.util.CmsDataUtils$parseYearWithMintmarkV2$1$data$1 r2 = new com.glority.android.cmsui2.util.CmsDataUtils$parseYearWithMintmarkV2$1$data$1     // Catch: java.lang.Exception -> L72
            r2.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L72
            java.lang.Object r5 = r1.fromJson(r5, r2)     // Catch: java.lang.Exception -> L72
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L72
            return r5
        L71:
            return r0
        L72:
            r5 = move-exception
            com.glority.android.core.app.AppContext r1 = com.glority.android.core.app.AppContext.INSTANCE
            boolean r1 = r1.isDebugMode()
            if (r1 == 0) goto L88
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.glority.utils.stability.LogUtils.e(r5)
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui2.util.CmsDataUtils.parseYearWithMintmarkV2(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName):java.util.List");
    }

    public final boolean isAmericaCoin(CmsName cmsName) {
        Object obj;
        Intrinsics.checkNotNullParameter(cmsName, "cmsName");
        Iterator<T> it = cmsName.getTaxonomies().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((TaxonomyName) obj).getTaxonomyTypeName(), "Class")) {
                break;
            }
        }
        TaxonomyName taxonomyName = (TaxonomyName) obj;
        return Intrinsics.areEqual(taxonomyName != null ? taxonomyName.getLatinName() : null, "USA-Coins");
    }

    public final String getTagValue(CmsName cmsName, String tag) {
        List<Map<String, Object>> tagValues;
        Map map;
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (cmsName == null) {
            return null;
        }
        try {
            List<CmsTag> tags = cmsName.getTags();
            if (tags == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : tags) {
                if (Intrinsics.areEqual(((CmsTag) obj2).getTagName(), tag)) {
                    arrayList.add(obj2);
                }
            }
            CmsTag cmsTag = (CmsTag) CollectionsKt.firstOrNull((List) arrayList);
            if (cmsTag == null || (tagValues = cmsTag.getTagValues()) == null || (map = (Map) CollectionsKt.firstOrNull((List) tagValues)) == null || (obj = map.get("value")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }

    public final String getCurrentRightYear(CmsName cmsName) {
        if (cmsName == null) {
            return null;
        }
        String str = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) cmsName.getName().getPreferredName(), new String[]{" "}, false, 0, 6, (Object) null));
        if ((str == null || !StringsKt.contains$default((CharSequence) str, (CharSequence) "~", false, 2, (Object) null)) && (str == null || !StringsKt.contains$default((CharSequence) str, (CharSequence) "-", false, 2, (Object) null))) {
            return str;
        }
        return null;
    }

    public final String getCountryFlagIconUrl(String issuerCountryCode) {
        String str;
        if (issuerCountryCode != null && StringsKt.equals(issuerCountryCode, "TW", true)) {
            return "";
        }
        Object[] objArr = new Object[1];
        if (issuerCountryCode != null) {
            str = issuerCountryCode.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        objArr[0] = str;
        String format = String.format("https://cms-cache.coinidentifierai.com/static/flags/64-5/%s_64.png", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
