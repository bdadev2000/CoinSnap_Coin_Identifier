package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* loaded from: classes.dex */
public class f0 extends y0 {
    public RecyclerView a;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f1907b = new r1(this);

    /* renamed from: c, reason: collision with root package name */
    public OrientationHelper f1908c;

    /* renamed from: d, reason: collision with root package name */
    public OrientationHelper f1909d;

    public static int c(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.getDecoratedMeasurement(view) / 2) + orientationHelper.getDecoratedStart(view)) - ((orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding());
    }

    public static View d(v0 v0Var, OrientationHelper orientationHelper) {
        int childCount = v0Var.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int totalSpace = (orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = v0Var.getChildAt(i11);
            int abs = Math.abs(((orientationHelper.getDecoratedMeasurement(childAt) / 2) + orientationHelper.getDecoratedStart(childAt)) - totalSpace);
            if (abs < i10) {
                view = childAt;
                i10 = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            r1 r1Var = this.f1907b;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(r1Var);
                this.a.setOnFlingListener(null);
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    this.a.addOnScrollListener(r1Var);
                    this.a.setOnFlingListener(this);
                    new Scroller(this.a.getContext(), new DecelerateInterpolator());
                    h();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final int[] b(v0 v0Var, View view) {
        int[] iArr = new int[2];
        if (v0Var.canScrollHorizontally()) {
            iArr[0] = c(view, f(v0Var));
        } else {
            iArr[0] = 0;
        }
        if (v0Var.canScrollVertically()) {
            iArr[1] = c(view, g(v0Var));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View e(v0 v0Var) {
        if (v0Var.canScrollVertically()) {
            return d(v0Var, g(v0Var));
        }
        if (v0Var.canScrollHorizontally()) {
            return d(v0Var, f(v0Var));
        }
        return null;
    }

    public final OrientationHelper f(v0 v0Var) {
        OrientationHelper orientationHelper = this.f1909d;
        if (orientationHelper == null || orientationHelper.mLayoutManager != v0Var) {
            this.f1909d = OrientationHelper.createHorizontalHelper(v0Var);
        }
        return this.f1909d;
    }

    public final OrientationHelper g(v0 v0Var) {
        OrientationHelper orientationHelper = this.f1908c;
        if (orientationHelper == null || orientationHelper.mLayoutManager != v0Var) {
            this.f1908c = OrientationHelper.createVerticalHelper(v0Var);
        }
        return this.f1908c;
    }

    public final void h() {
        v0 layoutManager;
        View e2;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (e2 = e(layoutManager)) != null) {
            int[] b3 = b(layoutManager, e2);
            int i10 = b3[0];
            if (i10 != 0 || b3[1] != 0) {
                this.a.smoothScrollBy(i10, b3[1]);
            }
        }
    }
}
