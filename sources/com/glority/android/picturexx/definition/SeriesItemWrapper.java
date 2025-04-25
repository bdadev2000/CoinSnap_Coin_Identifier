package com.glority.android.picturexx.definition;

import com.glority.android.database.entities.SeriesItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesItemWrapper.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/definition/SeriesItemWrapper;", "", "seriesItem", "Lcom/glority/android/database/entities/SeriesItem;", "collectionItemList", "", "", "<init>", "(Lcom/glority/android/database/entities/SeriesItem;Ljava/util/List;)V", "getSeriesItem", "()Lcom/glority/android/database/entities/SeriesItem;", "getCollectionItemList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class SeriesItemWrapper {
    public static final int $stable = 8;
    private final List<String> collectionItemList;
    private final SeriesItem seriesItem;

    /* renamed from: component1, reason: from getter */
    public final SeriesItem getSeriesItem() {
        return this.seriesItem;
    }

    public final List<String> component2() {
        return this.collectionItemList;
    }

    public final SeriesItemWrapper copy(SeriesItem seriesItem, List<String> collectionItemList) {
        Intrinsics.checkNotNullParameter(seriesItem, "seriesItem");
        Intrinsics.checkNotNullParameter(collectionItemList, "collectionItemList");
        return new SeriesItemWrapper(seriesItem, collectionItemList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeriesItemWrapper)) {
            return false;
        }
        SeriesItemWrapper seriesItemWrapper = (SeriesItemWrapper) other;
        return Intrinsics.areEqual(this.seriesItem, seriesItemWrapper.seriesItem) && Intrinsics.areEqual(this.collectionItemList, seriesItemWrapper.collectionItemList);
    }

    public int hashCode() {
        return (this.seriesItem.hashCode() * 31) + this.collectionItemList.hashCode();
    }

    public String toString() {
        return "SeriesItemWrapper(seriesItem=" + this.seriesItem + ", collectionItemList=" + this.collectionItemList + ")";
    }

    public SeriesItemWrapper(SeriesItem seriesItem, List<String> collectionItemList) {
        Intrinsics.checkNotNullParameter(seriesItem, "seriesItem");
        Intrinsics.checkNotNullParameter(collectionItemList, "collectionItemList");
        this.seriesItem = seriesItem;
        this.collectionItemList = collectionItemList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeriesItemWrapper copy$default(SeriesItemWrapper seriesItemWrapper, SeriesItem seriesItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            seriesItem = seriesItemWrapper.seriesItem;
        }
        if ((i & 2) != 0) {
            list = seriesItemWrapper.collectionItemList;
        }
        return seriesItemWrapper.copy(seriesItem, list);
    }

    public final SeriesItem getSeriesItem() {
        return this.seriesItem;
    }

    public final List<String> getCollectionItemList() {
        return this.collectionItemList;
    }
}
