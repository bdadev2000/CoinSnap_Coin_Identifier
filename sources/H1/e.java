package H1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: n, reason: collision with root package name */
    public v1.i f1361n;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f1353c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f1354d = new CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public float f1355f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1356g = false;

    /* renamed from: h, reason: collision with root package name */
    public long f1357h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f1358i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f1359j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f1360k = 0;
    public float l = -2.1474836E9f;
    public float m = 2.1474836E9f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1362o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1363p = false;

    public final float a() {
        v1.i iVar = this.f1361n;
        if (iVar == null) {
            return 0.0f;
        }
        float f9 = this.f1359j;
        float f10 = iVar.l;
        return (f9 - f10) / (iVar.m - f10);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f1353c.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1354d.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.add(animatorUpdateListener);
    }

    public final float b() {
        v1.i iVar = this.f1361n;
        if (iVar == null) {
            return 0.0f;
        }
        float f9 = this.m;
        if (f9 == 2.1474836E9f) {
            return iVar.m;
        }
        return f9;
    }

    public final float c() {
        v1.i iVar = this.f1361n;
        if (iVar == null) {
            return 0.0f;
        }
        float f9 = this.l;
        if (f9 == -2.1474836E9f) {
            return iVar.l;
        }
        return f9;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f1353c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        if (this.f1355f < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        float c9;
        float b;
        boolean z8 = false;
        if (this.f1362o) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        v1.i iVar = this.f1361n;
        if (iVar != null && this.f1362o) {
            long j9 = this.f1357h;
            long j10 = 0;
            if (j9 != 0) {
                j10 = j7 - j9;
            }
            float abs = ((float) j10) / ((1.0E9f / iVar.f23494n) / Math.abs(this.f1355f));
            float f9 = this.f1358i;
            if (d()) {
                abs = -abs;
            }
            float f10 = f9 + abs;
            float c10 = c();
            float b8 = b();
            PointF pointF = g.f1365a;
            if (f10 >= c10 && f10 <= b8) {
                z8 = true;
            }
            boolean z9 = !z8;
            float f11 = this.f1358i;
            float b9 = g.b(f10, c(), b());
            this.f1358i = b9;
            if (this.f1363p) {
                b9 = (float) Math.floor(b9);
            }
            this.f1359j = b9;
            this.f1357h = j7;
            if (!this.f1363p || this.f1358i != f11) {
                f();
            }
            if (z9) {
                if (getRepeatCount() != -1 && this.f1360k >= getRepeatCount()) {
                    if (this.f1355f < 0.0f) {
                        b = c();
                    } else {
                        b = b();
                    }
                    this.f1358i = b;
                    this.f1359j = b;
                    g(true);
                    e(d());
                } else {
                    Iterator it = this.f1353c.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f1360k++;
                    if (getRepeatMode() == 2) {
                        this.f1356g = !this.f1356g;
                        this.f1355f = -this.f1355f;
                    } else {
                        if (d()) {
                            c9 = b();
                        } else {
                            c9 = c();
                        }
                        this.f1358i = c9;
                        this.f1359j = c9;
                    }
                    this.f1357h = j7;
                }
            }
            if (this.f1361n != null) {
                float f12 = this.f1359j;
                if (f12 >= this.l && f12 <= this.m) {
                } else {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.l), Float.valueOf(this.m), Float.valueOf(this.f1359j)));
                }
            }
        }
    }

    public final void e(boolean z8) {
        Iterator it = this.f1353c.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z8);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void f() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z8) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z8) {
            this.f1362o = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float c9;
        float b;
        float c10;
        if (this.f1361n == null) {
            return 0.0f;
        }
        if (d()) {
            c9 = b() - this.f1359j;
            b = b();
            c10 = c();
        } else {
            c9 = this.f1359j - c();
            b = b();
            c10 = c();
        }
        return c9 / (b - c10);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.f1361n == null) {
            return 0L;
        }
        return r0.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f9) {
        if (this.f1358i == f9) {
            return;
        }
        float b = g.b(f9, c(), b());
        this.f1358i = b;
        if (this.f1363p) {
            b = (float) Math.floor(b);
        }
        this.f1359j = b;
        this.f1357h = 0L;
        f();
    }

    public final void i(float f9, float f10) {
        float f11;
        float f12;
        if (f9 <= f10) {
            v1.i iVar = this.f1361n;
            if (iVar == null) {
                f11 = -3.4028235E38f;
            } else {
                f11 = iVar.l;
            }
            if (iVar == null) {
                f12 = Float.MAX_VALUE;
            } else {
                f12 = iVar.m;
            }
            float b = g.b(f9, f11, f12);
            float b8 = g.b(f10, f11, f12);
            if (b != this.l || b8 != this.m) {
                this.l = b;
                this.m = b8;
                h((int) g.b(this.f1359j, b, b8));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f9 + ") must be <= maxFrame (" + f10 + ")");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f1362o;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f1353c.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.b.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f1353c.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1354d.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j7) {
        setDuration(j7);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i9) {
        super.setRepeatMode(i9);
        if (i9 != 2 && this.f1356g) {
            this.f1356g = false;
            this.f1355f = -this.f1355f;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j7) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j7) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
