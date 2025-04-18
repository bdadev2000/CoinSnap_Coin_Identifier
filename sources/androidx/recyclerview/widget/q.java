package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q implements t0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2010b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2011c;

    /* renamed from: d, reason: collision with root package name */
    public int f2012d;

    public final void a(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.f2012d * 2;
                int[] iArr = this.f2011c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2011c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 2];
                    this.f2011c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2011c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f2012d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void b(RecyclerView recyclerView, boolean z10) {
        this.f2012d = 0;
        int[] iArr = this.f2011c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        v0 v0Var = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && v0Var != null && v0Var.isItemPrefetchEnabled()) {
            if (z10) {
                if (!recyclerView.mAdapterHelper.g()) {
                    v0Var.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                v0Var.collectAdjacentPrefetchPositions(this.a, this.f2010b, recyclerView.mState, this);
            }
            int i10 = this.f2012d;
            if (i10 > v0Var.mPrefetchMaxCountObserved) {
                v0Var.mPrefetchMaxCountObserved = i10;
                v0Var.mPrefetchMaxObservedInInitialPrefetch = z10;
                recyclerView.mRecycler.o();
            }
        }
    }
}
