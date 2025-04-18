package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.layout.PinnableContainer;

/* loaded from: classes4.dex */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4823a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyLayoutPinnedItemList f4824b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f4825c = SnapshotIntStateKt.a(-1);
    public final ParcelableSnapshotMutableIntState d = SnapshotIntStateKt.a(0);
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4826f;

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f4823a = obj;
        this.f4824b = lazyLayoutPinnedItemList;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.e = f2;
        f3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f4826f = f3;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public final PinnableContainer.PinnedHandle a() {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.d;
        if (parcelableSnapshotMutableIntState.g() == 0) {
            this.f4824b.f4833a.add(this);
            PinnableContainer pinnableContainer = (PinnableContainer) this.f4826f.getValue();
            this.e.setValue(pinnableContainer != null ? pinnableContainer.a() : null);
        }
        parcelableSnapshotMutableIntState.b(parcelableSnapshotMutableIntState.g() + 1);
        return this;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public final int getIndex() {
        return this.f4825c.g();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public final Object getKey() {
        return this.f4823a;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public final void release() {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.d;
        if (parcelableSnapshotMutableIntState.g() <= 0) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        parcelableSnapshotMutableIntState.b(parcelableSnapshotMutableIntState.g() - 1);
        if (parcelableSnapshotMutableIntState.g() == 0) {
            this.f4824b.f4833a.remove(this);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.e;
            PinnableContainer.PinnedHandle pinnedHandle = (PinnableContainer.PinnedHandle) parcelableSnapshotMutableState.getValue();
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            parcelableSnapshotMutableState.setValue(null);
        }
    }
}
