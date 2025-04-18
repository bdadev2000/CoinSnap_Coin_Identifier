package t0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int f25147t = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public final a f25148b;

    /* renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f25149c;

    /* renamed from: d, reason: collision with root package name */
    public final View f25150d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.activity.i f25151f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f25152g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f25153h;

    /* renamed from: i, reason: collision with root package name */
    public int f25154i;

    /* renamed from: j, reason: collision with root package name */
    public int f25155j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f25156k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f25157l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f25158m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25159n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f25160o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25161p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25162q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25163r;

    /* renamed from: s, reason: collision with root package name */
    public final ListView f25164s;

    public g(ListView listView) {
        a aVar = new a();
        this.f25148b = aVar;
        this.f25149c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f25152g = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f25153h = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f25156k = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f25157l = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f25158m = fArr5;
        this.f25150d = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        fArr5[0] = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr4[0] = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        this.f25154i = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr3[0] = 0.001f;
        this.f25155j = f25147t;
        aVar.a = 500;
        aVar.f25139b = 500;
        this.f25164s = listView;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f25152g
            r0 = r0[r7]
            float[] r1 = r3.f25153h
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f25149c
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
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f25156k
            r0 = r0[r7]
            float[] r1 = r3.f25157l
            r1 = r1[r7]
            float[] r2 = r3.f25158m
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = b(r4, r1, r7)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.g.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f25154i;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 || f10 >= 0.0f) {
                return 0.0f;
            }
            return f10 / (-f11);
        }
        if (f10 >= f11) {
            return 0.0f;
        }
        if (f10 >= 0.0f) {
            return 1.0f - (f10 / f11);
        }
        if (!this.f25162q || i10 != 1) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f25163r
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
            goto L7a
        L16:
            r7.e()
            goto L7a
        L1a:
            r7.f25161p = r2
            r7.f25159n = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f25150d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            t0.a r9 = r7.f25148b
            r9.f25140c = r0
            r9.f25141d = r8
            boolean r8 = r7.f25162q
            if (r8 != 0) goto L7a
            boolean r8 = r7.f()
            if (r8 == 0) goto L7a
            androidx.activity.i r8 = r7.f25151f
            if (r8 != 0) goto L60
            androidx.activity.i r8 = new androidx.activity.i
            r9 = 4
            r8.<init>(r7, r9)
            r7.f25151f = r8
        L60:
            r7.f25162q = r2
            r7.f25160o = r2
            boolean r8 = r7.f25159n
            if (r8 != 0) goto L73
            int r8 = r7.f25155j
            if (r8 <= 0) goto L73
            androidx.activity.i r9 = r7.f25151f
            long r5 = (long) r8
            androidx.core.view.ViewCompat.postOnAnimationDelayed(r4, r9, r5)
            goto L78
        L73:
            androidx.activity.i r8 = r7.f25151f
            r8.run()
        L78:
            r7.f25159n = r2
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.g.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i10 = 0;
        if (this.f25160o) {
            this.f25162q = false;
            return;
        }
        a aVar = this.f25148b;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - aVar.f25142e);
        int i12 = aVar.f25139b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f25146i = i10;
        aVar.f25145h = aVar.a(currentAnimationTimeMillis);
        aVar.f25144g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r8 = this;
            t0.a r0 = r8.f25148b
            float r1 = r0.f25141d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f25140c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L50
            android.widget.ListView r2 = r8.f25164s
            int r3 = r2.getCount()
            r4 = 1
            if (r3 != 0) goto L1c
            goto L4b
        L1c:
            int r5 = r2.getChildCount()
            int r6 = r2.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L3a
            if (r7 < r3) goto L49
            int r5 = r5 - r4
            android.view.View r1 = r2.getChildAt(r5)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L49
            goto L4b
        L3a:
            if (r1 >= 0) goto L4b
            if (r6 > 0) goto L49
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L49
            goto L4b
        L49:
            r1 = r4
            goto L4c
        L4b:
            r1 = r0
        L4c:
            if (r1 != 0) goto L4f
            goto L50
        L4f:
            r0 = r4
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.g.f():boolean");
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
