package Z;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int f3851t = ViewConfiguration.getTapTimeout();
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f3852c;

    /* renamed from: d, reason: collision with root package name */
    public final View f3853d;

    /* renamed from: f, reason: collision with root package name */
    public B3.k f3854f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3855g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f3856h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3857i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3858j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f3859k;
    public final float[] l;
    public final float[] m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3860n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3861o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3862p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3863q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3864r;

    /* renamed from: s, reason: collision with root package name */
    public final ListView f3865s;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, Z.a] */
    public g(ListView listView) {
        ?? obj = new Object();
        obj.f3846e = Long.MIN_VALUE;
        obj.f3848g = -1L;
        obj.f3847f = 0L;
        this.b = obj;
        this.f3852c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3855g = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3856h = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3859k = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.l = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.m = fArr5;
        this.f3853d = listView;
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f9) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f9 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f3857i = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3858j = f3851t;
        obj.f3843a = 500;
        obj.b = 500;
        this.f3865s = listView;
    }

    public static float b(float f9, float f10, float f11) {
        if (f9 > f11) {
            return f11;
        }
        if (f9 < f10) {
            return f10;
        }
        return f9;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3855g
            r0 = r0[r4]
            float[] r1 = r3.f3856h
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f3852c
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f3859k
            r0 = r0[r4]
            float[] r1 = r3.l
            r1 = r1[r4]
            float[] r2 = r3.m
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g.a(int, float, float, float):float");
    }

    public final float c(float f9, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i9 = this.f3857i;
        if (i9 != 0 && i9 != 1) {
            if (i9 == 2 && f9 < 0.0f) {
                return f9 / (-f10);
            }
        } else if (f9 < f10) {
            if (f9 >= 0.0f) {
                return 1.0f - (f9 / f10);
            }
            if (this.f3863q && i9 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i9 = 0;
        if (this.f3861o) {
            this.f3863q = false;
            return;
        }
        a aVar = this.b;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (currentAnimationTimeMillis - aVar.f3846e);
        int i11 = aVar.b;
        if (i10 > i11) {
            i9 = i11;
        } else if (i10 >= 0) {
            i9 = i10;
        }
        aVar.f3850i = i9;
        aVar.f3849h = aVar.a(currentAnimationTimeMillis);
        aVar.f3848g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        ListView listView;
        int count;
        a aVar = this.b;
        float f9 = aVar.f3845d;
        int abs = (int) (f9 / Math.abs(f9));
        Math.abs(aVar.f3844c);
        if (abs == 0 || (count = (listView = this.f3865s).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i9 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i9 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
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
            boolean r0 = r7.f3864r
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
            r7.d()
            goto L7a
        L1a:
            r7.f3862p = r2
            r7.f3860n = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f3853d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            Z.a r9 = r7.b
            r9.f3844c = r0
            r9.f3845d = r8
            boolean r8 = r7.f3863q
            if (r8 != 0) goto L7a
            boolean r8 = r7.e()
            if (r8 == 0) goto L7a
            B3.k r8 = r7.f3854f
            if (r8 != 0) goto L60
            B3.k r8 = new B3.k
            r9 = 7
            r8.<init>(r7, r9)
            r7.f3854f = r8
        L60:
            r7.f3863q = r2
            r7.f3861o = r2
            boolean r8 = r7.f3860n
            if (r8 != 0) goto L73
            int r8 = r7.f3858j
            if (r8 <= 0) goto L73
            B3.k r9 = r7.f3854f
            long r5 = (long) r8
            androidx.core.view.ViewCompat.postOnAnimationDelayed(r4, r9, r5)
            goto L78
        L73:
            B3.k r8 = r7.f3854f
            r8.run()
        L78:
            r7.f3860n = r2
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
