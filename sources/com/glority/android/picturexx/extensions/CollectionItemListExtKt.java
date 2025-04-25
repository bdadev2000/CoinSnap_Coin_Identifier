package com.glority.android.picturexx.extensions;

import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.definition.CollectionSortType;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionItemListExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\n"}, d2 = {"sortBy", "", "Lcom/glority/android/database/entities/CollectionItem;", "", "collectionSortType", "Lcom/glority/android/picturexx/definition/CollectionSortType;", "sortByYear", "sortByPrice", "sortByDateDescending", "sortByDateAscending", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionItemListExtKt {

    /* compiled from: CollectionItemListExt.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CollectionSortType.values().length];
            try {
                iArr[CollectionSortType.RELEASE_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CollectionSortType.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CollectionSortType.COLLECTION_DATE_ADDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<CollectionItem> sortBy(Iterable<CollectionItem> iterable, CollectionSortType collectionSortType) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(collectionSortType, "collectionSortType");
        int i = WhenMappings.$EnumSwitchMapping$0[collectionSortType.ordinal()];
        if (i == 1) {
            return sortByYear(iterable);
        }
        if (i == 2) {
            return sortByPrice(iterable);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return sortByDateDescending(iterable);
    }

    public static final List<CollectionItem> sortByYear(Iterable<CollectionItem> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.sortedWith(iterable, new Comparator() { // from class: com.glority.android.picturexx.extensions.CollectionItemListExtKt$sortByYear$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String year = ((CollectionItem) t).getYear();
                if (year == null) {
                    year = "2147483647";
                }
                String str = year;
                String year2 = ((CollectionItem) t2).getYear();
                return ComparisonsKt.compareValues(str, year2 != null ? year2 : "2147483647");
            }
        });
    }

    public static final List<CollectionItem> sortByPrice(Iterable<CollectionItem> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.sortedWith(iterable, new Comparator() { // from class: com.glority.android.picturexx.extensions.CollectionItemListExtKt$sortByPrice$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                PriceValue marketValue = ((CollectionItem) t).getMarketValue();
                Double valueOf = Double.valueOf(marketValue != null ? marketValue.getValue() : 0.0d);
                PriceValue marketValue2 = ((CollectionItem) t2).getMarketValue();
                return ComparisonsKt.compareValues(valueOf, Double.valueOf(marketValue2 != null ? marketValue2.getValue() : 0.0d));
            }
        });
    }

    public static final List<CollectionItem> sortByDateDescending(Iterable<CollectionItem> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.sortedWith(iterable, new Comparator() { // from class: com.glority.android.picturexx.extensions.CollectionItemListExtKt$sortByDateDescending$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((CollectionItem) t2).getCollectionId()), Integer.valueOf(((CollectionItem) t).getCollectionId()));
            }
        });
    }

    public static final List<CollectionItem> sortByDateAscending(Iterable<CollectionItem> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.sortedWith(iterable, new Comparator() { // from class: com.glority.android.picturexx.extensions.CollectionItemListExtKt$sortByDateAscending$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((CollectionItem) t).getCollectionId()), Integer.valueOf(((CollectionItem) t2).getCollectionId()));
            }
        });
    }
}
