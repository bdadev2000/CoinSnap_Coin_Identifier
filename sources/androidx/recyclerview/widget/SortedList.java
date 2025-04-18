package androidx.recyclerview.widget;

import java.util.Comparator;

/* loaded from: classes2.dex */
public class SortedList<T> {

    /* loaded from: classes2.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
    }
}
