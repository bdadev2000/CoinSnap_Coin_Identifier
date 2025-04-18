package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import com.safedk.android.internal.d;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f18867r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final ClampedScroller f18868a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f18869b;

    /* renamed from: c, reason: collision with root package name */
    public final View f18870c;
    public Runnable d;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f18871f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f18872g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18873h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18874i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f18875j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f18876k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f18877l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18878m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18879n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18880o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18881p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18882q;

    /* loaded from: classes3.dex */
    public static class ClampedScroller {

        /* renamed from: a, reason: collision with root package name */
        public int f18883a;

        /* renamed from: b, reason: collision with root package name */
        public int f18884b;

        /* renamed from: c, reason: collision with root package name */
        public float f18885c;
        public float d;
        public long e;

        /* renamed from: f, reason: collision with root package name */
        public long f18886f;

        /* renamed from: g, reason: collision with root package name */
        public long f18887g;

        /* renamed from: h, reason: collision with root package name */
        public float f18888h;

        /* renamed from: i, reason: collision with root package name */
        public int f18889i;

        public final float a(long j2) {
            long j3 = this.e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f18887g;
            if (j4 < 0 || j2 < j4) {
                return AutoScrollHelper.d(((float) (j2 - j3)) / this.f18883a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f18888h;
            return (AutoScrollHelper.d(((float) (j2 - j4)) / this.f18889i, 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    /* loaded from: classes3.dex */
    public class ScrollAnimationRunnable implements Runnable {
        public ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.f18881p) {
                boolean z2 = autoScrollHelper.f18879n;
                ClampedScroller clampedScroller = autoScrollHelper.f18868a;
                if (z2) {
                    autoScrollHelper.f18879n = false;
                    clampedScroller.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    clampedScroller.e = currentAnimationTimeMillis;
                    clampedScroller.f18887g = -1L;
                    clampedScroller.f18886f = currentAnimationTimeMillis;
                    clampedScroller.f18888h = 0.5f;
                }
                if ((clampedScroller.f18887g > 0 && AnimationUtils.currentAnimationTimeMillis() > clampedScroller.f18887g + clampedScroller.f18889i) || !autoScrollHelper.h()) {
                    autoScrollHelper.f18881p = false;
                    return;
                }
                boolean z3 = autoScrollHelper.f18880o;
                View view = autoScrollHelper.f18870c;
                if (z3) {
                    autoScrollHelper.f18880o = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (clampedScroller.f18886f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float a2 = clampedScroller.a(currentAnimationTimeMillis2);
                long j2 = currentAnimationTimeMillis2 - clampedScroller.f18886f;
                clampedScroller.f18886f = currentAnimationTimeMillis2;
                autoScrollHelper.g((int) (((float) j2) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * clampedScroller.d));
                WeakHashMap weakHashMap = ViewCompat.f18740a;
                view.postOnAnimation(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.core.widget.AutoScrollHelper$ClampedScroller] */
    public AutoScrollHelper(View view) {
        ?? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.f18887g = -1L;
        obj.f18886f = 0L;
        this.f18868a = obj;
        this.f18869b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f18871f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f18872g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f18875j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f18876k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f18877l = fArr5;
        this.f18870c = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f18873h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f18874i = f18867r;
        obj.f18883a = d.f29936c;
        obj.f18884b = d.f29936c;
    }

    public static float d(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public abstract void a();

    public abstract boolean b(int i2);

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float c(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f18871f
            r0 = r0[r7]
            float[] r1 = r3.f18872g
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = d(r0, r2, r1)
            float r1 = r3.e(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.e(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f18869b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = d(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f18875j
            r0 = r0[r7]
            float[] r1 = r3.f18876k
            r1 = r1[r7]
            float[] r2 = r3.f18877l
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = d(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = d(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.c(float, float, float, int):float");
    }

    public final float e(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f18873h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f18881p && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void f() {
        int i2 = 0;
        if (this.f18879n) {
            this.f18881p = false;
            return;
        }
        ClampedScroller clampedScroller = this.f18868a;
        clampedScroller.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - clampedScroller.e);
        int i4 = clampedScroller.f18884b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        clampedScroller.f18889i = i2;
        clampedScroller.f18888h = clampedScroller.a(currentAnimationTimeMillis);
        clampedScroller.f18887g = currentAnimationTimeMillis;
    }

    public abstract void g(int i2);

    public final boolean h() {
        ClampedScroller clampedScroller = this.f18868a;
        float f2 = clampedScroller.d;
        int abs = (int) (f2 / Math.abs(f2));
        float f3 = clampedScroller.f18885c;
        int abs2 = (int) (f3 / Math.abs(f3));
        if (abs != 0 && b(abs)) {
            return true;
        }
        if (abs2 != 0) {
            a();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f18882q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7d
        L16:
            r7.f()
            goto L7d
        L1a:
            r7.f18880o = r2
            r7.f18878m = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f18870c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.c(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.c(r9, r8, r3, r2)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r9 = r7.f18868a
            r9.f18885c = r0
            r9.d = r8
            boolean r8 = r7.f18881p
            if (r8 != 0) goto L7d
            boolean r8 = r7.h()
            if (r8 == 0) goto L7d
            java.lang.Runnable r8 = r7.d
            if (r8 != 0) goto L5f
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = new androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable
            r8.<init>()
            r7.d = r8
        L5f:
            r7.f18881p = r2
            r7.f18879n = r2
            boolean r8 = r7.f18878m
            if (r8 != 0) goto L74
            int r8 = r7.f18874i
            if (r8 <= 0) goto L74
            java.lang.Runnable r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = androidx.core.view.ViewCompat.f18740a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L74:
            java.lang.Runnable r8 = r7.d
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = (androidx.core.widget.AutoScrollHelper.ScrollAnimationRunnable) r8
            r8.run()
        L7b:
            r7.f18878m = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
