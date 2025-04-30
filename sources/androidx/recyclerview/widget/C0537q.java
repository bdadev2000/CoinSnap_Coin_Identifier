package androidx.recyclerview.widget;

import java.util.Arrays;

/* renamed from: androidx.recyclerview.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537q implements U {

    /* renamed from: a, reason: collision with root package name */
    public int f5073a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5074c;

    /* renamed from: d, reason: collision with root package name */
    public int f5075d;

    public final void a(int i9, int i10) {
        if (i9 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f5075d;
                int i12 = i11 * 2;
                int[] iArr = this.f5074c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5074c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i11 * 4];
                    this.f5074c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f5074c;
                iArr4[i12] = i9;
                iArr4[i12 + 1] = i10;
                this.f5075d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void b(RecyclerView recyclerView, boolean z8) {
        this.f5075d = 0;
        int[] iArr = this.f5074c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        W w2 = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && w2 != null && w2.isItemPrefetchEnabled()) {
            if (z8) {
                if (!recyclerView.mAdapterHelper.g()) {
                    w2.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                w2.collectAdjacentPrefetchPositions(this.f5073a, this.b, recyclerView.mState, this);
            }
            int i9 = this.f5075d;
            if (i9 > w2.mPrefetchMaxCountObserved) {
                w2.mPrefetchMaxCountObserved = i9;
                w2.mPrefetchMaxObservedInInitialPrefetch = z8;
                recyclerView.mRecycler.n();
            }
        }
    }
}
