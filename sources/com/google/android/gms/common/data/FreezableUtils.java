package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.safedk.android.analytics.events.MaxEvents;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        MaxEvents maxEvents = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            maxEvents.add(arrayList.get(i2).freeze());
        }
        return maxEvents;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        MaxEvents maxEvents = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            maxEvents.add(it.next().freeze());
        }
        return maxEvents;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        MaxEvents maxEvents = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            maxEvents.add(e.freeze());
        }
        return maxEvents;
    }
}
