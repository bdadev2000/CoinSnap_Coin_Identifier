package com.glority.android.picturexx.extensions;

import com.glority.android.database.entities.SeriesItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSeriesListExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"findMostCollectedSeries", "Lcom/glority/android/database/entities/SeriesItem;", "", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class UserSeriesListExtKt {
    public static final SeriesItem findMostCollectedSeries(Collection<SeriesItem> collection) {
        Integer currentCount;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Object obj = null;
        if (collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            SeriesItem seriesItem = (SeriesItem) obj2;
            if (seriesItem.getTotalNum() > 0 && (currentCount = seriesItem.getCurrentCount()) != null && currentCount.intValue() > 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            SeriesItem seriesItem2 = (SeriesItem) obj3;
            Integer currentCount2 = seriesItem2.getCurrentCount();
            int totalNum = seriesItem2.getTotalNum();
            if (currentCount2 == null || currentCount2.intValue() != totalNum) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                float intValue = (((SeriesItem) obj).getCurrentCount() != null ? r2.intValue() : 0) / r0.getTotalNum();
                do {
                    Object next = it.next();
                    float intValue2 = (((SeriesItem) next).getCurrentCount() != null ? r5.intValue() : 0) / r4.getTotalNum();
                    if (Float.compare(intValue, intValue2) < 0) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        return (SeriesItem) obj;
    }
}
