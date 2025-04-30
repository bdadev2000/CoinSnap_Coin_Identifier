package v1;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: S, reason: collision with root package name */
    public static final boolean f23521S;

    /* renamed from: T, reason: collision with root package name */
    public static final List f23522T;

    /* renamed from: U, reason: collision with root package name */
    public static final ThreadPoolExecutor f23523U;

    /* renamed from: A, reason: collision with root package name */
    public Canvas f23524A;

    /* renamed from: B, reason: collision with root package name */
    public Rect f23525B;

    /* renamed from: C, reason: collision with root package name */
    public RectF f23526C;

    /* renamed from: D, reason: collision with root package name */
    public D1.i f23527D;

    /* renamed from: E, reason: collision with root package name */
    public Rect f23528E;

    /* renamed from: F, reason: collision with root package name */
    public Rect f23529F;

    /* renamed from: G, reason: collision with root package name */
    public RectF f23530G;

    /* renamed from: H, reason: collision with root package name */
    public RectF f23531H;

    /* renamed from: I, reason: collision with root package name */
    public Matrix f23532I;

    /* renamed from: J, reason: collision with root package name */
    public Matrix f23533J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f23534K;

    /* renamed from: L, reason: collision with root package name */
    public EnumC2840a f23535L;

    /* renamed from: M, reason: collision with root package name */
    public final Semaphore f23536M;

    /* renamed from: N, reason: collision with root package name */
    public Handler f23537N;
    public s O;

    /* renamed from: P, reason: collision with root package name */
    public final s f23538P;

    /* renamed from: Q, reason: collision with root package name */
    public float f23539Q;

    /* renamed from: R, reason: collision with root package name */
    public int f23540R;
    public i b;

    /* renamed from: c, reason: collision with root package name */
    public final H1.e f23541c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23542d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23543f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23544g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23545h;

    /* renamed from: i, reason: collision with root package name */
    public z1.a f23546i;

    /* renamed from: j, reason: collision with root package name */
    public String f23547j;

    /* renamed from: k, reason: collision with root package name */
    public F1.i f23548k;
    public Map l;
    public String m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23549n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23550o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23551p;

    /* renamed from: q, reason: collision with root package name */
    public D1.c f23552q;

    /* renamed from: r, reason: collision with root package name */
    public int f23553r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23554s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23555t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23556u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23557v;

    /* renamed from: w, reason: collision with root package name */
    public EnumC2839E f23558w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23559x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f23560y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f23561z;

    static {
        boolean z8;
        if (Build.VERSION.SDK_INT <= 25) {
            z8 = true;
        } else {
            z8 = false;
        }
        f23521S = z8;
        f23522T = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f23523U = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new H1.d());
    }

    public v() {
        H1.e eVar = new H1.e();
        this.f23541c = eVar;
        this.f23542d = true;
        this.f23543f = false;
        this.f23544g = false;
        this.f23540R = 1;
        this.f23545h = new ArrayList();
        this.f23550o = false;
        this.f23551p = true;
        this.f23553r = 255;
        this.f23557v = false;
        this.f23558w = EnumC2839E.b;
        this.f23559x = false;
        this.f23560y = new Matrix();
        this.f23534K = false;
        U3.h hVar = new U3.h(this, 2);
        this.f23536M = new Semaphore(1);
        this.f23538P = new s(this, 1);
        this.f23539Q = -3.4028235E38f;
        eVar.addUpdateListener(hVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final A1.e eVar, final Object obj, final E1.d dVar) {
        D1.c cVar = this.f23552q;
        if (cVar == null) {
            this.f23545h.add(new u() { // from class: v1.p
                @Override // v1.u
                public final void run() {
                    v.this.a(eVar, obj, dVar);
                }
            });
            return;
        }
        boolean z8 = true;
        if (eVar == A1.e.f21c) {
            cVar.g(dVar, obj);
        } else {
            A1.f fVar = eVar.b;
            if (fVar != null) {
                fVar.g(dVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f23552q.h(eVar, 0, arrayList, new A1.e(new String[0]));
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((A1.e) arrayList.get(i9)).b.g(dVar, obj);
                }
                z8 = true ^ arrayList.isEmpty();
            }
        }
        if (z8) {
            invalidateSelf();
            if (obj == y.f23600z) {
                s(this.f23541c.a());
            }
        }
    }

    public final boolean b() {
        if (!this.f23542d && !this.f23543f) {
            return false;
        }
        return true;
    }

    public final void c() {
        i iVar = this.b;
        if (iVar == null) {
            return;
        }
        a7.b bVar = F1.r.f1104a;
        Rect rect = iVar.f23493k;
        D1.c cVar = new D1.c(this, new D1.e(Collections.emptyList(), iVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new B1.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null, 1), iVar.f23492j, iVar);
        this.f23552q = cVar;
        if (this.f23555t) {
            cVar.r(true);
        }
        this.f23552q.f670I = this.f23551p;
    }

    public final void d() {
        H1.e eVar = this.f23541c;
        if (eVar.f1362o) {
            eVar.cancel();
            if (!isVisible()) {
                this.f23540R = 1;
            }
        }
        this.b = null;
        this.f23552q = null;
        this.f23546i = null;
        this.f23539Q = -3.4028235E38f;
        eVar.f1361n = null;
        eVar.l = -2.1474836E9f;
        eVar.m = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        i iVar;
        D1.c cVar = this.f23552q;
        if (cVar == null) {
            return;
        }
        EnumC2840a enumC2840a = this.f23535L;
        if (enumC2840a == null) {
            enumC2840a = EnumC2840a.b;
        }
        if (enumC2840a == EnumC2840a.f23468c) {
            z8 = true;
        } else {
            z8 = false;
        }
        ThreadPoolExecutor threadPoolExecutor = f23523U;
        Semaphore semaphore = this.f23536M;
        s sVar = this.f23538P;
        H1.e eVar = this.f23541c;
        if (z8) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (z8) {
                    semaphore.release();
                    if (cVar.f669H == eVar.a()) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                if (z8) {
                    semaphore.release();
                    if (cVar.f669H != eVar.a()) {
                        threadPoolExecutor.execute(sVar);
                    }
                }
                throw th;
            }
        }
        if (z8 && (iVar = this.b) != null) {
            float f9 = this.f23539Q;
            float a6 = eVar.a();
            this.f23539Q = a6;
            if (Math.abs(a6 - f9) * iVar.b() >= 50.0f) {
                s(eVar.a());
            }
        }
        if (this.f23544g) {
            try {
                if (this.f23559x) {
                    k(canvas, cVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                H1.c.f1349a.getClass();
            }
        } else if (this.f23559x) {
            k(canvas, cVar);
        } else {
            g(canvas);
        }
        this.f23534K = false;
        if (z8) {
            semaphore.release();
            if (cVar.f669H == eVar.a()) {
                return;
            }
            threadPoolExecutor.execute(sVar);
        }
    }

    public final void e() {
        i iVar = this.b;
        if (iVar == null) {
            return;
        }
        EnumC2839E enumC2839E = this.f23558w;
        int i9 = Build.VERSION.SDK_INT;
        boolean z8 = iVar.f23495o;
        int i10 = iVar.f23496p;
        int ordinal = enumC2839E.ordinal();
        boolean z9 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z8 && i9 < 28) || i10 > 4 || i9 <= 25))) {
            z9 = true;
        }
        this.f23559x = z9;
    }

    public final void g(Canvas canvas) {
        D1.c cVar = this.f23552q;
        i iVar = this.b;
        if (cVar != null && iVar != null) {
            Matrix matrix = this.f23560y;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preScale(r3.width() / iVar.f23493k.width(), r3.height() / iVar.f23493k.height());
                matrix.preTranslate(r3.left, r3.top);
            }
            cVar.e(canvas, matrix, this.f23553r);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f23553r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        i iVar = this.b;
        if (iVar == null) {
            return -1;
        }
        return iVar.f23493k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        i iVar = this.b;
        if (iVar == null) {
            return -1;
        }
        return iVar.f23493k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final F1.i h() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f23548k == null) {
            F1.i iVar = new F1.i(getCallback());
            this.f23548k = iVar;
            String str = this.m;
            if (str != null) {
                iVar.f1088h = str;
            }
        }
        return this.f23548k;
    }

    public final void i() {
        this.f23545h.clear();
        H1.e eVar = this.f23541c;
        eVar.g(true);
        Iterator it = eVar.f1354d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (!isVisible()) {
            this.f23540R = 1;
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
        if (this.f23534K) {
            return;
        }
        this.f23534K = true;
        if ((!f23521S || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        H1.e eVar = this.f23541c;
        if (eVar == null) {
            return false;
        }
        return eVar.f1362o;
    }

    public final void j() {
        float c9;
        float b;
        if (this.f23552q == null) {
            this.f23545h.add(new t(this, 1));
            return;
        }
        e();
        boolean b8 = b();
        H1.e eVar = this.f23541c;
        if (b8 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f1362o = true;
                boolean d2 = eVar.d();
                Iterator it = eVar.f1353c.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(eVar, d2);
                    } else {
                        animatorListener.onAnimationStart(eVar);
                    }
                }
                if (eVar.d()) {
                    c9 = eVar.b();
                } else {
                    c9 = eVar.c();
                }
                eVar.h((int) c9);
                eVar.f1357h = 0L;
                eVar.f1360k = 0;
                if (eVar.f1362o) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f23540R = 1;
            } else {
                this.f23540R = 2;
            }
        }
        if (!b()) {
            Iterator it2 = f23522T.iterator();
            A1.h hVar = null;
            while (it2.hasNext()) {
                hVar = this.b.d((String) it2.next());
                if (hVar != null) {
                    break;
                }
            }
            if (hVar != null) {
                m((int) hVar.b);
            } else {
                if (eVar.f1355f < 0.0f) {
                    b = eVar.c();
                } else {
                    b = eVar.b();
                }
                m((int) b);
            }
            eVar.g(true);
            eVar.e(eVar.d());
            if (!isVisible()) {
                this.f23540R = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r10, D1.c r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.v.k(android.graphics.Canvas, D1.c):void");
    }

    public final void l() {
        float b;
        if (this.f23552q == null) {
            this.f23545h.add(new t(this, 0));
            return;
        }
        e();
        boolean b8 = b();
        H1.e eVar = this.f23541c;
        if (b8 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f1362o = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f1357h = 0L;
                if (eVar.d() && eVar.f1359j == eVar.c()) {
                    eVar.h(eVar.b());
                } else if (!eVar.d() && eVar.f1359j == eVar.b()) {
                    eVar.h(eVar.c());
                }
                Iterator it = eVar.f1354d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f23540R = 1;
            } else {
                this.f23540R = 3;
            }
        }
        if (!b()) {
            if (eVar.f1355f < 0.0f) {
                b = eVar.c();
            } else {
                b = eVar.b();
            }
            m((int) b);
            eVar.g(true);
            eVar.e(eVar.d());
            if (!isVisible()) {
                this.f23540R = 1;
            }
        }
    }

    public final void m(int i9) {
        if (this.b == null) {
            this.f23545h.add(new o(this, i9, 2));
        } else {
            this.f23541c.h(i9);
        }
    }

    public final void n(int i9) {
        if (this.b == null) {
            this.f23545h.add(new o(this, i9, 0));
            return;
        }
        H1.e eVar = this.f23541c;
        eVar.i(eVar.l, i9 + 0.99f);
    }

    public final void o(String str) {
        i iVar = this.b;
        if (iVar == null) {
            this.f23545h.add(new n(this, str, 1));
            return;
        }
        A1.h d2 = iVar.d(str);
        if (d2 != null) {
            n((int) (d2.b + d2.f25c));
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Cannot find marker with name ", str, "."));
    }

    public final void p(String str) {
        i iVar = this.b;
        ArrayList arrayList = this.f23545h;
        if (iVar == null) {
            arrayList.add(new n(this, str, 0));
            return;
        }
        A1.h d2 = iVar.d(str);
        if (d2 != null) {
            int i9 = (int) d2.b;
            int i10 = ((int) d2.f25c) + i9;
            if (this.b == null) {
                arrayList.add(new r(this, i9, i10));
                return;
            } else {
                this.f23541c.i(i9, i10 + 0.99f);
                return;
            }
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Cannot find marker with name ", str, "."));
    }

    public final void q(int i9) {
        if (this.b == null) {
            this.f23545h.add(new o(this, i9, 1));
        } else {
            this.f23541c.i(i9, (int) r0.m);
        }
    }

    public final void r(String str) {
        i iVar = this.b;
        if (iVar == null) {
            this.f23545h.add(new n(this, str, 2));
            return;
        }
        A1.h d2 = iVar.d(str);
        if (d2 != null) {
            q((int) d2.b);
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Cannot find marker with name ", str, "."));
    }

    public final void s(float f9) {
        i iVar = this.b;
        if (iVar == null) {
            this.f23545h.add(new q(this, f9, 2));
        } else {
            this.f23541c.h(H1.g.e(iVar.l, iVar.m, f9));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f23553r = i9;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        H1.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        boolean z10 = !isVisible();
        boolean visible = super.setVisible(z8, z9);
        if (z8) {
            int i9 = this.f23540R;
            if (i9 == 2) {
                j();
            } else if (i9 == 3) {
                l();
            }
        } else if (this.f23541c.f1362o) {
            i();
            this.f23540R = 3;
        } else if (!z10) {
            this.f23540R = 1;
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
        this.f23545h.clear();
        H1.e eVar = this.f23541c;
        eVar.g(true);
        eVar.e(eVar.d());
        if (!isVisible()) {
            this.f23540R = 1;
        }
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
