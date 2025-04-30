package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class B extends k0 {

    /* renamed from: k, reason: collision with root package name */
    public PointF f4921k;
    public final DisplayMetrics l;

    /* renamed from: n, reason: collision with root package name */
    public float f4922n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f4919i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f4920j = new DecelerateInterpolator();
    public boolean m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f4923o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4924p = 0;

    public B(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i9, int i10, int i11, int i12, int i13) {
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i14 = i11 - i9;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        }
        return i11 - i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // androidx.recyclerview.widget.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r7, androidx.recyclerview.widget.i0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f4921k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.f(r7, r0)
            android.graphics.PointF r5 = r6.f4921k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.g(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.i(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.f4920j
            r8.f4997a = r0
            r8.b = r7
            r8.f4998c = r2
            r8.f5000e = r3
            r8.f5001f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.B.c(android.view.View, androidx.recyclerview.widget.i0):void");
    }

    public int f(View view, int i9) {
        W w2 = this.f5019c;
        if (w2 != null && w2.canScrollHorizontally()) {
            X x9 = (X) view.getLayoutParams();
            return e(w2.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) x9).leftMargin, w2.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) x9).rightMargin, w2.getPaddingLeft(), w2.getWidth() - w2.getPaddingRight(), i9);
        }
        return 0;
    }

    public int g(View view, int i9) {
        W w2 = this.f5019c;
        if (w2 != null && w2.canScrollVertically()) {
            X x9 = (X) view.getLayoutParams();
            return e(w2.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) x9).topMargin, w2.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) x9).bottomMargin, w2.getPaddingTop(), w2.getHeight() - w2.getPaddingBottom(), i9);
        }
        return 0;
    }

    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int i(int i9) {
        float abs = Math.abs(i9);
        if (!this.m) {
            this.f4922n = h(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.f4922n);
    }
}
