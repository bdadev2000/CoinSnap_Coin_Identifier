package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class b0 extends j1 {

    /* renamed from: k, reason: collision with root package name */
    public PointF f1869k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f1870l;

    /* renamed from: n, reason: collision with root package name */
    public float f1872n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f1867i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f1868j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f1871m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f1873o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f1874p = 0;

    public b0(Context context) {
        this.f1870l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // androidx.recyclerview.widget.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r6, androidx.recyclerview.widget.k1 r7, androidx.recyclerview.widget.h1 r8) {
        /*
            r5 = this;
            android.graphics.PointF r7 = r5.f1869k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L15
            float r7 = r7.x
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L15
        Lf:
            if (r7 <= 0) goto L13
            r7 = r0
            goto L16
        L13:
            r7 = r1
            goto L16
        L15:
            r7 = r3
        L16:
            int r7 = r5.f(r6, r7)
            android.graphics.PointF r4 = r5.f1869k
            if (r4 == 0) goto L29
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L29
        L25:
            if (r2 <= 0) goto L2a
            r1 = r0
            goto L2a
        L29:
            r1 = r3
        L2a:
            int r6 = r5.g(r6, r1)
            int r1 = r7 * r7
            int r2 = r6 * r6
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r5.i(r1)
            double r1 = (double) r1
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r7 = -r7
            int r6 = -r6
            android.view.animation.DecelerateInterpolator r2 = r5.f1868j
            r8.a = r7
            r8.f1923b = r6
            r8.f1924c = r1
            r8.f1926e = r2
            r8.f1927f = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b0.c(android.view.View, androidx.recyclerview.widget.k1, androidx.recyclerview.widget.h1):void");
    }

    public int f(View view, int i10) {
        v0 v0Var = this.f1941c;
        if (v0Var != null && v0Var.canScrollHorizontally()) {
            w0 w0Var = (w0) view.getLayoutParams();
            return e(v0Var.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, v0Var.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, v0Var.getPaddingLeft(), v0Var.getWidth() - v0Var.getPaddingRight(), i10);
        }
        return 0;
    }

    public int g(View view, int i10) {
        v0 v0Var = this.f1941c;
        if (v0Var != null && v0Var.canScrollVertically()) {
            w0 w0Var = (w0) view.getLayoutParams();
            return e(v0Var.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) w0Var).topMargin, v0Var.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin, v0Var.getPaddingTop(), v0Var.getHeight() - v0Var.getPaddingBottom(), i10);
        }
        return 0;
    }

    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int i(int i10) {
        float abs = Math.abs(i10);
        if (!this.f1871m) {
            this.f1872n = h(this.f1870l);
            this.f1871m = true;
        }
        return (int) Math.ceil(abs * this.f1872n);
    }
}
