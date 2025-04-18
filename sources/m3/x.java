package m3;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class x extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean S;
    public static final ThreadPoolExecutor T;
    public Canvas A;
    public Rect B;
    public RectF C;
    public n3.a D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public Matrix J;
    public boolean K;
    public a L;
    public final Semaphore M;
    public Handler N;
    public p O;
    public final p P;
    public float Q;
    public int R;

    /* renamed from: b, reason: collision with root package name */
    public j f21592b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.d f21593c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21594d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21595f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21596g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f21597h;

    /* renamed from: i, reason: collision with root package name */
    public q3.a f21598i;

    /* renamed from: j, reason: collision with root package name */
    public String f21599j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.appcompat.widget.v f21600k;

    /* renamed from: l, reason: collision with root package name */
    public Map f21601l;

    /* renamed from: m, reason: collision with root package name */
    public String f21602m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21603n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21604o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21605p;

    /* renamed from: q, reason: collision with root package name */
    public u3.c f21606q;

    /* renamed from: r, reason: collision with root package name */
    public int f21607r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21608s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21609t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21610v;

    /* renamed from: w, reason: collision with root package name */
    public g0 f21611w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21612x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f21613y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f21614z;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        S = z10;
        T = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new y3.c());
    }

    public x() {
        y3.d dVar = new y3.d();
        this.f21593c = dVar;
        this.f21594d = true;
        this.f21595f = false;
        this.f21596g = false;
        this.R = 1;
        this.f21597h = new ArrayList();
        this.f21604o = false;
        this.f21605p = true;
        this.f21607r = 255;
        this.f21610v = false;
        this.f21611w = g0.AUTOMATIC;
        this.f21612x = false;
        this.f21613y = new Matrix();
        this.K = false;
        o oVar = new o(this, 0);
        this.M = new Semaphore(1);
        this.P = new p(this, 0);
        this.Q = -3.4028235E38f;
        dVar.addUpdateListener(oVar);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final r3.e eVar, final Object obj, final h.c cVar) {
        u3.c cVar2 = this.f21606q;
        if (cVar2 == null) {
            this.f21597h.add(new w() { // from class: m3.u
                @Override // m3.w
                public final void run() {
                    x.this.a(eVar, obj, cVar);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == r3.e.f23990c) {
            cVar2.d(cVar, obj);
        } else {
            r3.f fVar = eVar.f23991b;
            if (fVar != null) {
                fVar.d(cVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f21606q.c(eVar, 0, arrayList, new r3.e(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((r3.e) arrayList.get(i10)).f23991b.d(cVar, obj);
                }
                z10 = true ^ arrayList.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (obj == a0.E) {
                u(this.f21593c.d());
            }
        }
    }

    public final boolean b() {
        return this.f21594d || this.f21595f;
    }

    public final void c() {
        j jVar = this.f21592b;
        if (jVar == null) {
            return;
        }
        d3.g gVar = w3.r.a;
        Rect rect = jVar.f21560k;
        u3.c cVar = new u3.c(this, new u3.e(Collections.emptyList(), jVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new s3.c(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null, 1), jVar.f21559j, jVar);
        this.f21606q = cVar;
        if (this.f21609t) {
            cVar.p(true);
        }
        this.f21606q.I = this.f21605p;
    }

    public final void d() {
        y3.d dVar = this.f21593c;
        if (dVar.f27906o) {
            dVar.cancel();
            if (!isVisible()) {
                this.R = 1;
            }
        }
        this.f21592b = null;
        this.f21606q = null;
        this.f21598i = null;
        this.Q = -3.4028235E38f;
        dVar.f27905n = null;
        dVar.f27903l = -2.1474836E9f;
        dVar.f27904m = 2.1474836E9f;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[Catch: all -> 0x0062, InterruptedException -> 0x0094, TryCatch #3 {InterruptedException -> 0x0094, all -> 0x0062, blocks: (B:59:0x001f, B:14:0x0024, B:19:0x0045, B:20:0x0029, B:23:0x004c, B:28:0x006f, B:25:0x0064, B:27:0x0068, B:49:0x006c, B:57:0x005c), top: B:58:0x001f }] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            u3.c r0 = r11.f21606q
            if (r0 != 0) goto L5
            return
        L5:
            m3.a r1 = r11.L
            if (r1 == 0) goto La
            goto Lc
        La:
            m3.a r1 = m3.a.AUTOMATIC
        Lc:
            m3.a r2 = m3.a.ENABLED
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r4
        L15:
            java.util.concurrent.ThreadPoolExecutor r2 = m3.x.T
            java.util.concurrent.Semaphore r5 = r11.M
            m3.p r6 = r11.P
            y3.d r7 = r11.f21593c
            if (r1 == 0) goto L22
            r5.acquire()     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
        L22:
            if (r1 == 0) goto L4c
            m3.j r8 = r11.f21592b     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            if (r8 != 0) goto L29
            goto L42
        L29:
            float r9 = r11.Q     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            float r10 = r7.d()     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            r11.Q = r10     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            float r8 = r8.b()     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            float r10 = r10 - r9
            float r9 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            float r9 = r9 * r8
            r8 = 1112014848(0x42480000, float:50.0)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 < 0) goto L42
            goto L43
        L42:
            r3 = r4
        L43:
            if (r3 == 0) goto L4c
            float r3 = r7.d()     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            r11.u(r3)     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
        L4c:
            boolean r3 = r11.f21596g     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            if (r3 == 0) goto L64
            boolean r3 = r11.f21612x     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L58
            r11.k(r12, r0)     // Catch: java.lang.Throwable -> L5c
            goto L6f
        L58:
            r11.g(r12)     // Catch: java.lang.Throwable -> L5c
            goto L6f
        L5c:
            y3.a r12 = y3.b.a     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            r12.getClass()     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            goto L6f
        L62:
            r12 = move-exception
            goto L81
        L64:
            boolean r3 = r11.f21612x     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            if (r3 == 0) goto L6c
            r11.k(r12, r0)     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            goto L6f
        L6c:
            r11.g(r12)     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
        L6f:
            r11.K = r4     // Catch: java.lang.Throwable -> L62 java.lang.InterruptedException -> L94
            if (r1 == 0) goto La6
            r5.release()
            float r12 = r0.H
            float r0 = r7.d()
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 == 0) goto La6
            goto La3
        L81:
            if (r1 == 0) goto L93
            r5.release()
            float r0 = r0.H
            float r1 = r7.d()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L93
            r2.execute(r6)
        L93:
            throw r12
        L94:
            if (r1 == 0) goto La6
            r5.release()
            float r12 = r0.H
            float r0 = r7.d()
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 == 0) goto La6
        La3:
            r2.execute(r6)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.x.draw(android.graphics.Canvas):void");
    }

    public final void e() {
        j jVar = this.f21592b;
        if (jVar == null) {
            return;
        }
        g0 g0Var = this.f21611w;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = jVar.f21564o;
        int i11 = jVar.f21565p;
        int ordinal = g0Var.ordinal();
        boolean z11 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z10 && i10 < 28) || i11 > 4 || i10 <= 25))) {
            z11 = true;
        }
        this.f21612x = z11;
    }

    public final void g(Canvas canvas) {
        u3.c cVar = this.f21606q;
        j jVar = this.f21592b;
        if (cVar != null && jVar != null) {
            Matrix matrix = this.f21613y;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preScale(r3.width() / jVar.f21560k.width(), r3.height() / jVar.f21560k.height());
                matrix.preTranslate(r3.left, r3.top);
            }
            cVar.g(canvas, matrix, this.f21607r);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21607r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        j jVar = this.f21592b;
        if (jVar == null) {
            return -1;
        }
        return jVar.f21560k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        j jVar = this.f21592b;
        if (jVar == null) {
            return -1;
        }
        return jVar.f21560k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final androidx.appcompat.widget.v h() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f21600k == null) {
            androidx.appcompat.widget.v vVar = new androidx.appcompat.widget.v(getCallback());
            this.f21600k = vVar;
            String str = this.f21602m;
            if (str != null) {
                vVar.f1061f = str;
            }
        }
        return this.f21600k;
    }

    public final void i() {
        this.f21597h.clear();
        y3.d dVar = this.f21593c;
        dVar.m(true);
        Iterator it = dVar.f27896d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(dVar);
        }
        if (!isVisible()) {
            this.R = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.K) {
            return;
        }
        this.K = true;
        if ((!S || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        y3.d dVar = this.f21593c;
        if (dVar == null) {
            return false;
        }
        return dVar.f27906o;
    }

    public final void j() {
        float f10;
        float e2;
        int i10 = 1;
        if (this.f21606q == null) {
            this.f21597h.add(new s(this, i10));
            return;
        }
        e();
        boolean b3 = b();
        y3.d dVar = this.f21593c;
        if (b3 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.f27906o = true;
                boolean h10 = dVar.h();
                Iterator it = dVar.f27895c.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        s7.b.n(animatorListener, dVar, h10);
                    } else {
                        animatorListener.onAnimationStart(dVar);
                    }
                }
                if (dVar.h()) {
                    f10 = dVar.e();
                } else {
                    f10 = dVar.f();
                }
                dVar.r((int) f10);
                dVar.f27899h = 0L;
                dVar.f27902k = 0;
                if (dVar.f27906o) {
                    dVar.m(false);
                    Choreographer.getInstance().postFrameCallback(dVar);
                }
                this.R = 1;
            } else {
                this.R = 2;
            }
        }
        if (!b()) {
            if (dVar.f27897f < 0.0f) {
                e2 = dVar.f();
            } else {
                e2 = dVar.e();
            }
            m((int) e2);
            dVar.m(true);
            dVar.i(dVar.h());
            if (!isVisible()) {
                this.R = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r10, u3.c r11) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.x.k(android.graphics.Canvas, u3.c):void");
    }

    public final void l() {
        float e2;
        int i10 = 0;
        if (this.f21606q == null) {
            this.f21597h.add(new s(this, i10));
            return;
        }
        e();
        boolean b3 = b();
        y3.d dVar = this.f21593c;
        if (b3 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.f27906o = true;
                dVar.m(false);
                Choreographer.getInstance().postFrameCallback(dVar);
                dVar.f27899h = 0L;
                if (dVar.h() && dVar.f27901j == dVar.f()) {
                    dVar.r(dVar.e());
                } else if (!dVar.h() && dVar.f27901j == dVar.e()) {
                    dVar.r(dVar.f());
                }
                Iterator it = dVar.f27896d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(dVar);
                }
                this.R = 1;
            } else {
                this.R = 3;
            }
        }
        if (!b()) {
            if (dVar.f27897f < 0.0f) {
                e2 = dVar.f();
            } else {
                e2 = dVar.e();
            }
            m((int) e2);
            dVar.m(true);
            dVar.i(dVar.h());
            if (!isVisible()) {
                this.R = 1;
            }
        }
    }

    public final void m(int i10) {
        if (this.f21592b == null) {
            this.f21597h.add(new r(this, i10, 2));
        } else {
            this.f21593c.r(i10);
        }
    }

    public final void n(int i10) {
        if (this.f21592b == null) {
            this.f21597h.add(new r(this, i10, 1));
            return;
        }
        y3.d dVar = this.f21593c;
        dVar.t(dVar.f27903l, i10 + 0.99f);
    }

    public final void o(String str) {
        j jVar = this.f21592b;
        if (jVar == null) {
            this.f21597h.add(new t(this, str, 0));
            return;
        }
        r3.h d10 = jVar.d(str);
        if (d10 != null) {
            n((int) (d10.f23993b + d10.f23994c));
            return;
        }
        throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("Cannot find marker with name ", str, "."));
    }

    public final void p(float f10) {
        j jVar = this.f21592b;
        if (jVar == null) {
            this.f21597h.add(new q(this, f10, 2));
            return;
        }
        float f11 = jVar.f21561l;
        float f12 = jVar.f21562m;
        PointF pointF = y3.f.a;
        float b3 = vd.e.b(f12, f11, f10, f11);
        y3.d dVar = this.f21593c;
        dVar.t(dVar.f27903l, b3);
    }

    public final void q(String str) {
        j jVar = this.f21592b;
        ArrayList arrayList = this.f21597h;
        if (jVar == null) {
            arrayList.add(new t(this, str, 2));
            return;
        }
        r3.h d10 = jVar.d(str);
        if (d10 != null) {
            int i10 = (int) d10.f23993b;
            int i11 = ((int) d10.f23994c) + i10;
            if (this.f21592b == null) {
                arrayList.add(new v(this, i10, i11));
                return;
            } else {
                this.f21593c.t(i10, i11 + 0.99f);
                return;
            }
        }
        throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("Cannot find marker with name ", str, "."));
    }

    public final void r(int i10) {
        if (this.f21592b == null) {
            this.f21597h.add(new r(this, i10, 0));
        } else {
            this.f21593c.t(i10, (int) r0.f27904m);
        }
    }

    public final void s(String str) {
        j jVar = this.f21592b;
        if (jVar == null) {
            this.f21597h.add(new t(this, str, 1));
            return;
        }
        r3.h d10 = jVar.d(str);
        if (d10 != null) {
            r((int) d10.f23993b);
            return;
        }
        throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("Cannot find marker with name ", str, "."));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f21607r = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        y3.b.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i10 = this.R;
            if (i10 == 2) {
                j();
            } else if (i10 == 3) {
                l();
            }
        } else if (this.f21593c.f27906o) {
            i();
            this.R = 3;
        } else if (!z12) {
            this.R = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f21597h.clear();
        y3.d dVar = this.f21593c;
        dVar.m(true);
        dVar.i(dVar.h());
        if (!isVisible()) {
            this.R = 1;
        }
    }

    public final void t(float f10) {
        j jVar = this.f21592b;
        if (jVar == null) {
            this.f21597h.add(new q(this, f10, 1));
            return;
        }
        float f11 = jVar.f21561l;
        float f12 = jVar.f21562m;
        PointF pointF = y3.f.a;
        r((int) vd.e.b(f12, f11, f10, f11));
    }

    public final void u(float f10) {
        j jVar = this.f21592b;
        if (jVar == null) {
            this.f21597h.add(new q(this, f10, 0));
            return;
        }
        float f11 = jVar.f21561l;
        float f12 = jVar.f21562m;
        PointF pointF = y3.f.a;
        this.f21593c.r(((f12 - f11) * f10) + f11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
