package com.glority.android.picturexx.extensions;

import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionCountrySummaryListExt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, d2 = {"groupByCountry", "", "Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "sortByMaxCount", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionCountrySummaryListExtKt {
    public static final List<CollectionCountrySummaryWrapper> groupByCountry(List<CollectionCountrySummary> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String countryCode = ((CollectionCountrySummary) obj).getIssuerCountry().getCountryCode();
            Object obj2 = linkedHashMap.get(countryCode);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(countryCode, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new CollectionCountrySummaryWrapper((String) entry.getKey(), (List) entry.getValue()));
        }
        return arrayList;
    }

    public static final List<CollectionCountrySummaryWrapper> sortByMaxCount(List<CollectionCountrySummaryWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.sortedWith(list, new Comparator() { // from class: com.glority.android.picturexx.extensions.CollectionCountrySummaryListExtKt$sortByMaxCount$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((CollectionCountrySummaryWrapper) t2).getCount()), Integer.valueOf(((CollectionCountrySummaryWrapper) t).getCount()));
            }
        });
    }
}
