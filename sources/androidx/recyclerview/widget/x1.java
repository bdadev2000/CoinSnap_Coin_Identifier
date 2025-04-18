package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x1 {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f2076b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2077c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f2078d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2080f;

    public x1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f2080f = staggeredGridLayoutManager;
        this.f2079e = i10;
    }

    public static t1 j(View view) {
        return (t1) view.getLayoutParams();
    }

    public final void a(View view) {
        t1 t1Var = (t1) view.getLayoutParams();
        t1Var.f2039e = this;
        ArrayList arrayList = this.a;
        arrayList.add(view);
        this.f2077c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f2076b = Integer.MIN_VALUE;
        }
        if (t1Var.c() || t1Var.b()) {
            this.f2078d = this.f2080f.mPrimaryOrientation.getDecoratedMeasurement(view) + this.f2078d;
        }
    }

    public final void b() {
        View view = (View) this.a.get(r0.size() - 1);
        t1 j3 = j(view);
        this.f2077c = this.f2080f.mPrimaryOrientation.getDecoratedEnd(view);
        j3.getClass();
    }

    public final void c() {
        this.a.clear();
        this.f2076b = Integer.MIN_VALUE;
        this.f2077c = Integer.MIN_VALUE;
        this.f2078d = 0;
    }

    public final int d() {
        boolean z10 = this.f2080f.mReverseLayout;
        ArrayList arrayList = this.a;
        if (z10) {
            return f(arrayList.size() - 1, -1, false, false, true);
        }
        return f(0, arrayList.size(), false, false, true);
    }

    public final int e() {
        boolean z10 = this.f2080f.mReverseLayout;
        ArrayList arrayList = this.a;
        if (z10) {
            return f(0, arrayList.size(), false, false, true);
        }
        return f(arrayList.size() - 1, -1, false, false, true);
    }

    public final int f(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        boolean z13;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2080f;
        int startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding();
        int i13 = i10;
        if (i11 > i13) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i13 != i11) {
            View view = (View) this.a.get(i13);
            int decoratedStart = staggeredGridLayoutManager.mPrimaryOrientation.getDecoratedStart(view);
            int decoratedEnd = staggeredGridLayoutManager.mPrimaryOrientation.getDecoratedEnd(view);
            boolean z14 = false;
            if (!z12 ? decoratedStart < endAfterPadding : decoratedStart <= endAfterPadding) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z12 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                z14 = true;
            }
            if (z13 && z14) {
                if (z10 && z11) {
                    if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                } else {
                    if (z11) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
            }
            i13 += i12;
        }
        return -1;
    }

    public final int g(int i10, int i11, boolean z10) {
        return f(i10, i11, z10, true, false);
    }

    public final int h(int i10) {
        int i11 = this.f2077c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.a.size() == 0) {
            return i10;
        }
        b();
        return this.f2077c;
    }

    public final View i(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2080f;
        ArrayList arrayList = this.a;
        View view = null;
        if (i11 == -1) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                View view2 = (View) arrayList.get(i12);
                if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) <= i10) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) >= i10) || !view2.hasFocusable())) {
                    break;
                }
                i12++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) >= i10) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) <= i10) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int k(int i10) {
        int i11 = this.f2076b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        t1 j3 = j(view);
        this.f2076b = this.f2080f.mPrimaryOrientation.getDecoratedStart(view);
        j3.getClass();
        return this.f2076b;
    }

    public final void l(View view) {
        t1 t1Var = (t1) view.getLayoutParams();
        t1Var.f2039e = this;
        ArrayList arrayList = this.a;
        arrayList.add(0, view);
        this.f2076b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f2077c = Integer.MIN_VALUE;
        }
        if (t1Var.c() || t1Var.b()) {
            this.f2078d = this.f2080f.mPrimaryOrientation.getDecoratedMeasurement(view) + this.f2078d;
        }
    }
}
