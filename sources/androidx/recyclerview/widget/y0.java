package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5127a = new ArrayList();
    public int b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f5128c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f5129d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f5130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f5131f;

    public y0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i9) {
        this.f5131f = staggeredGridLayoutManager;
        this.f5130e = i9;
    }

    public final void a(View view) {
        u0 u0Var = (u0) view.getLayoutParams();
        u0Var.f5098e = this;
        ArrayList arrayList = this.f5127a;
        arrayList.add(view);
        this.f5128c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (u0Var.f4947a.isRemoved() || u0Var.f4947a.isUpdated()) {
            this.f5129d = this.f5131f.mPrimaryOrientation.getDecoratedMeasurement(view) + this.f5129d;
        }
    }

    public final void b() {
        View view = (View) com.mbridge.msdk.foundation.entity.o.g(this.f5127a, 1);
        u0 u0Var = (u0) view.getLayoutParams();
        this.f5128c = this.f5131f.mPrimaryOrientation.getDecoratedEnd(view);
        u0Var.getClass();
    }

    public final void c() {
        this.f5127a.clear();
        this.b = Integer.MIN_VALUE;
        this.f5128c = Integer.MIN_VALUE;
        this.f5129d = 0;
    }

    public final int d() {
        boolean z8 = this.f5131f.mReverseLayout;
        ArrayList arrayList = this.f5127a;
        if (z8) {
            return f(arrayList.size() - 1, -1, false, false, true);
        }
        return f(0, arrayList.size(), false, false, true);
    }

    public final int e() {
        boolean z8 = this.f5131f.mReverseLayout;
        ArrayList arrayList = this.f5127a;
        if (z8) {
            return f(0, arrayList.size(), false, false, true);
        }
        return f(arrayList.size() - 1, -1, false, false, true);
    }

    public final int f(int i9, int i10, boolean z8, boolean z9, boolean z10) {
        int i11;
        boolean z11;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f5131f;
        int startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding();
        int i12 = i9;
        if (i10 > i12) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        while (i12 != i10) {
            View view = (View) this.f5127a.get(i12);
            int decoratedStart = staggeredGridLayoutManager.mPrimaryOrientation.getDecoratedStart(view);
            int decoratedEnd = staggeredGridLayoutManager.mPrimaryOrientation.getDecoratedEnd(view);
            boolean z12 = false;
            if (!z10 ? decoratedStart < endAfterPadding : decoratedStart <= endAfterPadding) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                z12 = true;
            }
            if (z11 && z12) {
                if (z8 && z9) {
                    if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                } else {
                    if (z9) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
            }
            i12 += i11;
        }
        return -1;
    }

    public final int g(int i9) {
        int i10 = this.f5128c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f5127a.size() == 0) {
            return i9;
        }
        b();
        return this.f5128c;
    }

    public final View h(int i9, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f5131f;
        ArrayList arrayList = this.f5127a;
        View view = null;
        if (i10 == -1) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                View view2 = (View) arrayList.get(i11);
                if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) <= i9) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) >= i9) || !view2.hasFocusable())) {
                    break;
                }
                i11++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) >= i9) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) <= i9) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int i(int i9) {
        int i10 = this.b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f5127a.size() == 0) {
            return i9;
        }
        View view = (View) this.f5127a.get(0);
        u0 u0Var = (u0) view.getLayoutParams();
        this.b = this.f5131f.mPrimaryOrientation.getDecoratedStart(view);
        u0Var.getClass();
        return this.b;
    }

    public final void j(View view) {
        u0 u0Var = (u0) view.getLayoutParams();
        u0Var.f5098e = this;
        ArrayList arrayList = this.f5127a;
        arrayList.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f5128c = Integer.MIN_VALUE;
        }
        if (u0Var.f4947a.isRemoved() || u0Var.f4947a.isUpdated()) {
            this.f5129d = this.f5131f.mPrimaryOrientation.getDecoratedMeasurement(view) + this.f5129d;
        }
    }
}
