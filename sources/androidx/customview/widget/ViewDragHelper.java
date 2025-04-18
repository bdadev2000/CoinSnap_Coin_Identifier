package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ViewDragHelper {

    /* renamed from: v, reason: collision with root package name */
    public static final Interpolator f18929v = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int f18930a;

    /* renamed from: b, reason: collision with root package name */
    public int f18931b;
    public float[] d;
    public float[] e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f18933f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f18934g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f18935h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f18936i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f18937j;

    /* renamed from: k, reason: collision with root package name */
    public int f18938k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f18939l;

    /* renamed from: m, reason: collision with root package name */
    public final float f18940m;

    /* renamed from: n, reason: collision with root package name */
    public final float f18941n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18942o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f18943p;

    /* renamed from: q, reason: collision with root package name */
    public final Callback f18944q;

    /* renamed from: r, reason: collision with root package name */
    public View f18945r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18946s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f18947t;

    /* renamed from: c, reason: collision with root package name */
    public int f18932c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f18948u = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper.this.p(0);
        }
    };

    /* renamed from: androidx.customview.widget.ViewDragHelper$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public int clampViewPositionHorizontal(View view, int i2, int i3) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i2, int i3) {
            return 0;
        }

        public int getOrderedChildIndex(int i2) {
            return i2;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i2, int i3) {
        }

        public boolean onEdgeLock(int i2) {
            return false;
        }

        public void onEdgeTouched(int i2, int i3) {
        }

        public void onViewCaptured(@NonNull View view, int i2) {
        }

        public void onViewDragStateChanged(int i2) {
        }

        public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
        }

        public void onViewReleased(View view, float f2, float f3) {
        }

        public abstract boolean tryCaptureView(View view, int i2);
    }

    public ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f18947t = viewGroup;
        this.f18944q = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f18942o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f18931b = viewConfiguration.getScaledTouchSlop();
        this.f18940m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f18941n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f18943p = new OverScroller(context, f18929v);
    }

    public final void a() {
        this.f18932c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f18933f, 0.0f);
            Arrays.fill(this.f18934g, 0.0f);
            Arrays.fill(this.f18935h, 0);
            Arrays.fill(this.f18936i, 0);
            Arrays.fill(this.f18937j, 0);
            this.f18938k = 0;
        }
        VelocityTracker velocityTracker = this.f18939l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18939l = null;
        }
    }

    public final void b(int i2, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f18947t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f18945r = view;
        this.f18932c = i2;
        this.f18944q.onViewCaptured(view, i2);
        p(1);
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        Math.abs(f2);
        Math.abs(f3);
        int i4 = this.f18935h[i2];
        return false;
    }

    public final boolean d(float f2, float f3, View view) {
        if (view == null) {
            return false;
        }
        Callback callback = this.f18944q;
        boolean z2 = callback.getViewHorizontalDragRange(view) > 0;
        boolean z3 = callback.getViewVerticalDragRange(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f18931b) : z3 && Math.abs(f3) > ((float) this.f18931b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i2 = this.f18931b;
        return f4 > ((float) (i2 * i2));
    }

    public final void e(int i2) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i3 = this.f18938k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.e[i2] = 0.0f;
                this.f18933f[i2] = 0.0f;
                this.f18934g[i2] = 0.0f;
                this.f18935h[i2] = 0;
                this.f18936i[i2] = 0;
                this.f18937j[i2] = 0;
                this.f18938k = (~i4) & i3;
            }
        }
    }

    public final int f(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f18947t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r11 = this;
            int r0 = r11.f18930a
            r1 = 2
            if (r0 != r1) goto L5d
            android.widget.OverScroller r0 = r11.f18943p
            boolean r2 = r0.computeScrollOffset()
            int r9 = r0.getCurrX()
            int r10 = r0.getCurrY()
            android.view.View r3 = r11.f18945r
            int r3 = r3.getLeft()
            int r7 = r9 - r3
            android.view.View r3 = r11.f18945r
            int r3 = r3.getTop()
            int r8 = r10 - r3
            if (r7 == 0) goto L2c
            android.view.View r3 = r11.f18945r
            java.util.WeakHashMap r4 = androidx.core.view.ViewCompat.f18740a
            r3.offsetLeftAndRight(r7)
        L2c:
            if (r8 == 0) goto L35
            android.view.View r3 = r11.f18945r
            java.util.WeakHashMap r4 = androidx.core.view.ViewCompat.f18740a
            r3.offsetTopAndBottom(r8)
        L35:
            if (r7 != 0) goto L39
            if (r8 == 0) goto L42
        L39:
            androidx.customview.widget.ViewDragHelper$Callback r3 = r11.f18944q
            android.view.View r4 = r11.f18945r
            r5 = r9
            r6 = r10
            r3.onViewPositionChanged(r4, r5, r6, r7, r8)
        L42:
            if (r2 == 0) goto L54
            int r3 = r0.getFinalX()
            if (r9 != r3) goto L54
            int r3 = r0.getFinalY()
            if (r10 != r3) goto L54
            r0.abortAnimation()
            goto L56
        L54:
            if (r2 != 0) goto L5d
        L56:
            java.lang.Runnable r0 = r11.f18948u
            android.view.ViewGroup r2 = r11.f18947t
            r2.post(r0)
        L5d:
            int r0 = r11.f18930a
            if (r0 != r1) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = 0
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.g():boolean");
    }

    public final View h(int i2, int i3) {
        ViewGroup viewGroup = this.f18947t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f18944q.getOrderedChildIndex(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f18945r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f18945r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f18943p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f18945r
            float r0 = r10.f18941n
            int r0 = (int) r0
            float r6 = r10.f18940m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
        L3b:
            r14 = r11
            goto L45
        L3d:
            if (r7 <= r6) goto L45
            if (r14 <= 0) goto L43
            r14 = r6
            goto L45
        L43:
            int r11 = -r6
            goto L3b
        L45:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5f
            float r11 = (float) r6
            float r6 = (float) r8
        L5d:
            float r11 = r11 / r6
            goto L62
        L5f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5d
        L62:
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
        L66:
            float r0 = r0 / r6
            goto L6b
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L66
        L6b:
            androidx.customview.widget.ViewDragHelper$Callback r6 = r10.f18944q
            int r7 = r6.getViewHorizontalDragRange(r12)
            int r13 = r10.f(r4, r13, r7)
            int r12 = r6.getViewVerticalDragRange(r12)
            int r12 = r10.f(r5, r14, r12)
            float r13 = (float) r13
            float r13 = r13 * r11
            float r11 = (float) r12
            float r11 = r11 * r0
            float r11 = r11 + r13
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.i(int, int, int, int):boolean");
    }

    public final boolean j(int i2) {
        if ((this.f18938k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r18.f18932c == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.k(android.view.MotionEvent):void");
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f18939l;
        float f2 = this.f18940m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f18939l.getXVelocity(this.f18932c);
        float f3 = this.f18941n;
        float abs = Math.abs(xVelocity);
        float f4 = 0.0f;
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f18939l.getYVelocity(this.f18932c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f3) {
            if (abs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f18946s = true;
        this.f18944q.onViewReleased(this.f18945r, xVelocity, f4);
        this.f18946s = false;
        if (this.f18930a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    public final void m(float f2, float f3, int i2) {
        boolean c2 = c(f2, f3, i2, 1);
        boolean z2 = c2;
        if (c(f3, f2, i2, 4)) {
            z2 = (c2 ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (c(f2, f3, i2, 2)) {
            z3 = (z2 ? 1 : 0) | 2;
        }
        ?? r02 = z3;
        if (c(f3, f2, i2, 8)) {
            r02 = (z3 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f18936i;
            iArr[i2] = iArr[i2] | r02;
            this.f18944q.onEdgeDragStarted(r02, i2);
        }
    }

    public final void n(float f2, float f3, int i2) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f18933f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f18934g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f18935h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f18936i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f18937j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f18933f = fArr4;
            this.f18934g = fArr5;
            this.f18935h = iArr;
            this.f18936i = iArr2;
            this.f18937j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f18933f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.e;
        this.f18934g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f18935h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        ViewGroup viewGroup = this.f18947t;
        int i6 = i4 < viewGroup.getLeft() + this.f18942o ? 1 : 0;
        if (i5 < viewGroup.getTop() + this.f18942o) {
            i6 |= 4;
        }
        if (i4 > viewGroup.getRight() - this.f18942o) {
            i6 |= 2;
        }
        if (i5 > viewGroup.getBottom() - this.f18942o) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.f18938k |= 1 << i2;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (j(pointerId)) {
                float x = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f18933f[pointerId] = x;
                this.f18934g[pointerId] = y2;
            }
        }
    }

    public final void p(int i2) {
        this.f18947t.removeCallbacks(this.f18948u);
        if (this.f18930a != i2) {
            this.f18930a = i2;
            this.f18944q.onViewDragStateChanged(i2);
            if (this.f18930a == 0) {
                this.f18945r = null;
            }
        }
    }

    public final boolean q(int i2, int i3) {
        if (this.f18946s) {
            return i(i2, i3, (int) this.f18939l.getXVelocity(this.f18932c), (int) this.f18939l.getYVelocity(this.f18932c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(int i2, View view) {
        if (view == this.f18945r && this.f18932c == i2) {
            return true;
        }
        if (view == null || !this.f18944q.tryCaptureView(view, i2)) {
            return false;
        }
        this.f18932c = i2;
        b(i2, view);
        return true;
    }
}
