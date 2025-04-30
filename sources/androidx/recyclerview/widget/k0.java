package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5018a = -1;
    public RecyclerView b;

    /* renamed from: c, reason: collision with root package name */
    public W f5019c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5020d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5021e;

    /* renamed from: f, reason: collision with root package name */
    public View f5022f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f5023g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5024h;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.recyclerview.widget.i0, java.lang.Object] */
    public k0() {
        ?? obj = new Object();
        obj.f4999d = -1;
        obj.f5001f = false;
        obj.f5002g = 0;
        obj.f4997a = 0;
        obj.b = 0;
        obj.f4998c = Integer.MIN_VALUE;
        obj.f5000e = null;
        this.f5023g = obj;
    }

    public PointF a(int i9) {
        Object obj = this.f5019c;
        if (obj instanceof j0) {
            return ((j0) obj).computeScrollVectorForPosition(i9);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + j0.class.getCanonicalName());
        return null;
    }

    public final void b(int i9, int i10) {
        PointF a6;
        RecyclerView recyclerView = this.b;
        if (this.f5018a == -1 || recyclerView == null) {
            d();
        }
        if (this.f5020d && this.f5022f == null && this.f5019c != null && (a6 = a(this.f5018a)) != null) {
            float f9 = a6.x;
            if (f9 != 0.0f || a6.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f9), (int) Math.signum(a6.y), null);
            }
        }
        boolean z8 = false;
        this.f5020d = false;
        View view = this.f5022f;
        i0 i0Var = this.f5023g;
        if (view != null) {
            if (this.b.getChildLayoutPosition(view) == this.f5018a) {
                View view2 = this.f5022f;
                l0 l0Var = recyclerView.mState;
                c(view2, i0Var);
                i0Var.a(recyclerView);
                d();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5022f = null;
            }
        }
        if (this.f5021e) {
            l0 l0Var2 = recyclerView.mState;
            B b = (B) this;
            if (b.b.mLayout.getChildCount() == 0) {
                b.d();
            } else {
                int i11 = b.f4923o;
                int i12 = i11 - i9;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                b.f4923o = i12;
                int i13 = b.f4924p;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                b.f4924p = i14;
                if (i12 == 0 && i14 == 0) {
                    PointF a9 = b.a(b.f5018a);
                    if (a9 != null) {
                        if (a9.x != 0.0f || a9.y != 0.0f) {
                            float f10 = a9.y;
                            float sqrt = (float) Math.sqrt((f10 * f10) + (r9 * r9));
                            float f11 = a9.x / sqrt;
                            a9.x = f11;
                            float f12 = a9.y / sqrt;
                            a9.y = f12;
                            b.f4921k = a9;
                            b.f4923o = (int) (f11 * 10000.0f);
                            b.f4924p = (int) (f12 * 10000.0f);
                            int i15 = b.i(10000);
                            int i16 = (int) (b.f4923o * 1.2f);
                            int i17 = (int) (b.f4924p * 1.2f);
                            LinearInterpolator linearInterpolator = b.f4919i;
                            i0Var.f4997a = i16;
                            i0Var.b = i17;
                            i0Var.f4998c = (int) (i15 * 1.2f);
                            i0Var.f5000e = linearInterpolator;
                            i0Var.f5001f = true;
                        }
                    }
                    i0Var.f4999d = b.f5018a;
                    b.d();
                }
            }
            if (i0Var.f4999d >= 0) {
                z8 = true;
            }
            i0Var.a(recyclerView);
            if (z8 && this.f5021e) {
                this.f5020d = true;
                recyclerView.mViewFlinger.b();
            }
        }
    }

    public abstract void c(View view, i0 i0Var);

    public final void d() {
        if (!this.f5021e) {
            return;
        }
        this.f5021e = false;
        B b = (B) this;
        b.f4924p = 0;
        b.f4923o = 0;
        b.f4921k = null;
        this.b.mState.f5026a = -1;
        this.f5022f = null;
        this.f5018a = -1;
        this.f5020d = false;
        this.f5019c.onSmoothScrollerStopped(this);
        this.f5019c = null;
        this.b = null;
    }
}
