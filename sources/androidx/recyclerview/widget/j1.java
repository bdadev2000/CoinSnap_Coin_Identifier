package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1940b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f1941c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1942d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1943e;

    /* renamed from: f, reason: collision with root package name */
    public View f1944f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1946h;
    public int a = -1;

    /* renamed from: g, reason: collision with root package name */
    public final h1 f1945g = new h1();

    public PointF a(int i10) {
        Object obj = this.f1941c;
        if (obj instanceof i1) {
            return ((i1) obj).computeScrollVectorForPosition(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + i1.class.getCanonicalName());
        return null;
    }

    public final void b(int i10, int i11) {
        PointF a;
        RecyclerView recyclerView = this.f1940b;
        if (this.a == -1 || recyclerView == null) {
            d();
        }
        if (this.f1942d && this.f1944f == null && this.f1941c != null && (a = a(this.a)) != null) {
            float f10 = a.x;
            if (f10 != 0.0f || a.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(a.y), null);
            }
        }
        boolean z10 = false;
        this.f1942d = false;
        View view = this.f1944f;
        h1 h1Var = this.f1945g;
        if (view != null) {
            if (this.f1940b.getChildLayoutPosition(view) == this.a) {
                c(this.f1944f, recyclerView.mState, h1Var);
                h1Var.a(recyclerView);
                d();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f1944f = null;
            }
        }
        if (this.f1943e) {
            k1 k1Var = recyclerView.mState;
            b0 b0Var = (b0) this;
            if (b0Var.f1940b.mLayout.getChildCount() == 0) {
                b0Var.d();
            } else {
                int i12 = b0Var.f1873o;
                int i13 = i12 - i10;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                b0Var.f1873o = i13;
                int i14 = b0Var.f1874p;
                int i15 = i14 - i11;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                b0Var.f1874p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF a10 = b0Var.a(b0Var.a);
                    if (a10 != null) {
                        if (a10.x != 0.0f || a10.y != 0.0f) {
                            float f11 = a10.y;
                            float sqrt = (float) Math.sqrt((f11 * f11) + (r9 * r9));
                            float f12 = a10.x / sqrt;
                            a10.x = f12;
                            float f13 = a10.y / sqrt;
                            a10.y = f13;
                            b0Var.f1869k = a10;
                            b0Var.f1873o = (int) (f12 * 10000.0f);
                            b0Var.f1874p = (int) (f13 * 10000.0f);
                            int i16 = b0Var.i(10000);
                            int i17 = (int) (b0Var.f1873o * 1.2f);
                            int i18 = (int) (b0Var.f1874p * 1.2f);
                            LinearInterpolator linearInterpolator = b0Var.f1867i;
                            h1Var.a = i17;
                            h1Var.f1923b = i18;
                            h1Var.f1924c = (int) (i16 * 1.2f);
                            h1Var.f1926e = linearInterpolator;
                            h1Var.f1927f = true;
                        }
                    }
                    h1Var.f1925d = b0Var.a;
                    b0Var.d();
                }
            }
            if (h1Var.f1925d >= 0) {
                z10 = true;
            }
            h1Var.a(recyclerView);
            if (z10 && this.f1943e) {
                this.f1942d = true;
                recyclerView.mViewFlinger.b();
            }
        }
    }

    public abstract void c(View view, k1 k1Var, h1 h1Var);

    public final void d() {
        if (!this.f1943e) {
            return;
        }
        this.f1943e = false;
        b0 b0Var = (b0) this;
        b0Var.f1874p = 0;
        b0Var.f1873o = 0;
        b0Var.f1869k = null;
        this.f1940b.mState.a = -1;
        this.f1944f = null;
        this.a = -1;
        this.f1942d = false;
        this.f1941c.onSmoothScrollerStopped(this);
        this.f1941c = null;
        this.f1940b = null;
    }
}
