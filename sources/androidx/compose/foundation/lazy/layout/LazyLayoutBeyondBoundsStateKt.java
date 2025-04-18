package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.collection.MutableVector;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import w0.e;
import w0.g;

/* loaded from: classes4.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List a(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        e eVar;
        if (!lazyLayoutBeyondBoundsInfo.f4695a.m() && lazyLayoutPinnedItemList.f4833a.isEmpty()) {
            return w.f30218a;
        }
        ArrayList arrayList = new ArrayList();
        MutableVector mutableVector = lazyLayoutBeyondBoundsInfo.f4695a;
        if (!mutableVector.m()) {
            eVar = g.d;
        } else {
            if (mutableVector.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = mutableVector.f14142a;
            int i2 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr[0]).f4696a;
            int i3 = mutableVector.f14144c;
            if (i3 > 0) {
                int i4 = 0;
                do {
                    int i5 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr[i4]).f4696a;
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    i4++;
                } while (i4 < i3);
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("negative minIndex".toString());
            }
            if (mutableVector.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = mutableVector.f14142a;
            int i6 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr2[0]).f4697b;
            int i7 = mutableVector.f14144c;
            if (i7 > 0) {
                int i8 = 0;
                do {
                    int i9 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr2[i8]).f4697b;
                    if (i9 > i6) {
                        i6 = i9;
                    }
                    i8++;
                } while (i8 < i7);
            }
            eVar = new e(i2, Math.min(i6, lazyLayoutItemProvider.getItemCount() - 1), 1);
        }
        int size = lazyLayoutPinnedItemList.f4833a.size();
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) lazyLayoutPinnedItemList.get(i10);
            int a2 = LazyLayoutItemProviderKt.a(pinnedItem.getIndex(), lazyLayoutItemProvider, pinnedItem.getKey());
            int i11 = eVar.f31406a;
            if ((a2 > eVar.f31407b || i11 > a2) && a2 >= 0 && a2 < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(a2));
            }
        }
        int i12 = eVar.f31406a;
        int i13 = eVar.f31407b;
        if (i12 <= i13) {
            while (true) {
                arrayList.add(Integer.valueOf(i12));
                if (i12 == i13) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }
}
