package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* loaded from: classes.dex */
public class E extends Z {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f4929a;
    public final s0 b = new s0(this);

    /* renamed from: c, reason: collision with root package name */
    public OrientationHelper f4930c;

    /* renamed from: d, reason: collision with root package name */
    public OrientationHelper f4931d;

    public static int c(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.getDecoratedMeasurement(view) / 2) + orientationHelper.getDecoratedStart(view)) - ((orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding());
    }

    public static View d(W w2, OrientationHelper orientationHelper) {
        int childCount = w2.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int totalSpace = (orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding();
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = w2.getChildAt(i10);
            int abs = Math.abs(((orientationHelper.getDecoratedMeasurement(childAt) / 2) + orientationHelper.getDecoratedStart(childAt)) - totalSpace);
            if (abs < i9) {
                view = childAt;
                i9 = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4929a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        s0 s0Var = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(s0Var);
            this.f4929a.setOnFlingListener(null);
        }
        this.f4929a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f4929a.addOnScrollListener(s0Var);
                this.f4929a.setOnFlingListener(this);
                new Scroller(this.f4929a.getContext(), new DecelerateInterpolator());
                h();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public final int[] b(W w2, View view) {
        int[] iArr = new int[2];
        if (w2.canScrollHorizontally()) {
            iArr[0] = c(view, f(w2));
        } else {
            iArr[0] = 0;
        }
        if (w2.canScrollVertically()) {
            iArr[1] = c(view, g(w2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View e(W w2) {
        if (w2.canScrollVertically()) {
            return d(w2, g(w2));
        }
        if (w2.canScrollHorizontally()) {
            return d(w2, f(w2));
        }
        return null;
    }

    public final OrientationHelper f(W w2) {
        OrientationHelper orientationHelper = this.f4931d;
        if (orientationHelper == null || orientationHelper.mLayoutManager != w2) {
            this.f4931d = OrientationHelper.createHorizontalHelper(w2);
        }
        return this.f4931d;
    }

    public final OrientationHelper g(W w2) {
        OrientationHelper orientationHelper = this.f4930c;
        if (orientationHelper == null || orientationHelper.mLayoutManager != w2) {
            this.f4930c = OrientationHelper.createVerticalHelper(w2);
        }
        return this.f4930c;
    }

    public final void h() {
        W layoutManager;
        View e4;
        RecyclerView recyclerView = this.f4929a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (e4 = e(layoutManager)) == null) {
            return;
        }
        int[] b = b(layoutManager, e4);
        int i9 = b[0];
        if (i9 != 0 || b[1] != 0) {
            this.f4929a.smoothScrollBy(i9, b[1]);
        }
    }
}
