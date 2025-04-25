package com.glority.android.picturexx.extensions;

import com.glority.android.database.entities.SeriesItem;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesItemListExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0086@¢\u0006\u0002\u0010\b\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\n"}, d2 = {"sortSeriesItemsBy", "", "Lcom/glority/android/database/entities/SeriesItem;", "", "sortType", "Lcom/glority/android/picturexx/extensions/SeriesSortType;", "(Ljava/lang/Iterable;Lcom/glority/android/picturexx/extensions/SeriesSortType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortByUpdatedDateDescending", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortByCollectionProgress", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class SeriesItemListExtKt {

    /* compiled from: SeriesItemListExt.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SeriesSortType.values().length];
            try {
                iArr[SeriesSortType.DATE_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeriesSortType.COLLECTION_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object sortSeriesItemsBy(Iterable<SeriesItem> iterable, SeriesSortType seriesSortType, Continuation<? super List<SeriesItem>> continuation) {
        if (CollectionsKt.none(iterable)) {
            return CollectionsKt.emptyList();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[seriesSortType.ordinal()];
        if (i == 1) {
            return sortByUpdatedDateDescending(iterable, continuation);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return sortByCollectionProgress(iterable);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b A[LOOP:3: B:52:0x0115->B:54:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object sortByUpdatedDateDescending(java.lang.Iterable<com.glority.android.database.entities.SeriesItem> r8, kotlin.coroutines.Continuation<? super java.util.List<com.glority.android.database.entities.SeriesItem>> r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.extensions.SeriesItemListExtKt.sortByUpdatedDateDescending(java.lang.Iterable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final List<SeriesItem> sortByCollectionProgress(Iterable<SeriesItem> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.none(iterable) ? CollectionsKt.emptyList() : CollectionsKt.sortedWith(iterable, new Comparator() { // from class: com.glority.android.picturexx.extensions.SeriesItemListExtKt$sortByCollectionProgress$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Float.valueOf((((SeriesItem) t2).getCurrentCount() != null ? r0.intValue() : 0) / r4.getTotalNum()), Float.valueOf((((SeriesItem) t).getCurrentCount() != null ? r0.intValue() : 0) / r3.getTotalNum()));
            }
        });
    }
}
