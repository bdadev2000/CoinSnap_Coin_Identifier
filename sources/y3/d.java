package y3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import m3.j;

/* loaded from: classes.dex */
public final class d extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: n, reason: collision with root package name */
    public j f27905n;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f27894b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f27895c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f27896d = new CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public float f27897f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27898g = false;

    /* renamed from: h, reason: collision with root package name */
    public long f27899h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f27900i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f27901j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f27902k = 0;

    /* renamed from: l, reason: collision with root package name */
    public float f27903l = -2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    public float f27904m = 2.1474836E9f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27906o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27907p = false;

    @Override // android.animation.Animator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f27895c.add(animatorListener);
    }

    @Override // android.animation.Animator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f27896d.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27894b.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f27895c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        i(h());
        m(true);
    }

    public final float d() {
        j jVar = this.f27905n;
        if (jVar == null) {
            return 0.0f;
        }
        float f10 = this.f27901j;
        float f11 = jVar.f21561l;
        return (f10 - f11) / (jVar.f21562m - f11);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        boolean z10;
        float f10;
        float e2;
        if (this.f27906o) {
            m(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        j jVar = this.f27905n;
        if (jVar != null && this.f27906o) {
            long j10 = this.f27899h;
            long j11 = 0;
            if (j10 != 0) {
                j11 = j3 - j10;
            }
            float abs = ((float) j11) / ((1.0E9f / jVar.f21563n) / Math.abs(this.f27897f));
            float f11 = this.f27900i;
            if (h()) {
                abs = -abs;
            }
            float f12 = f11 + abs;
            float f13 = f();
            float e10 = e();
            PointF pointF = f.a;
            if (f12 >= f13 && f12 <= e10) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            float f14 = this.f27900i;
            float b3 = f.b(f12, f(), e());
            this.f27900i = b3;
            if (this.f27907p) {
                b3 = (float) Math.floor(b3);
            }
            this.f27901j = b3;
            this.f27899h = j3;
            if (!this.f27907p || this.f27900i != f14) {
                j();
            }
            if (z11) {
                if (getRepeatCount() != -1 && this.f27902k >= getRepeatCount()) {
                    if (this.f27897f < 0.0f) {
                        e2 = f();
                    } else {
                        e2 = e();
                    }
                    this.f27900i = e2;
                    this.f27901j = e2;
                    m(true);
                    i(h());
                } else {
                    Iterator it = this.f27895c.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f27902k++;
                    if (getRepeatMode() == 2) {
                        this.f27898g = !this.f27898g;
                        this.f27897f = -this.f27897f;
                    } else {
                        if (h()) {
                            f10 = e();
                        } else {
                            f10 = f();
                        }
                        this.f27900i = f10;
                        this.f27901j = f10;
                    }
                    this.f27899h = j3;
                }
            }
            if (this.f27905n != null) {
                float f15 = this.f27901j;
                if (f15 >= this.f27903l && f15 <= this.f27904m) {
                } else {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f27903l), Float.valueOf(this.f27904m), Float.valueOf(this.f27901j)));
                }
            }
        }
    }

    public final float e() {
        j jVar = this.f27905n;
        if (jVar == null) {
            return 0.0f;
        }
        float f10 = this.f27904m;
        if (f10 == 2.1474836E9f) {
            return jVar.f21562m;
        }
        return f10;
    }

    public final float f() {
        j jVar = this.f27905n;
        if (jVar == null) {
            return 0.0f;
        }
        float f10 = this.f27903l;
        if (f10 == -2.1474836E9f) {
            return jVar.f21561l;
        }
        return f10;
    }

    public final long g() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f10;
        float e2;
        float f11;
        if (this.f27905n == null) {
            return 0.0f;
        }
        if (h()) {
            f10 = e() - this.f27901j;
            e2 = e();
            f11 = f();
        } else {
            f10 = this.f27901j - f();
            e2 = e();
            f11 = f();
        }
        return f10 / (e2 - f11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.f27905n == null) {
            return 0L;
        }
        return r0.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ long getStartDelay() {
        g();
        throw null;
    }

    public final boolean h() {
        return this.f27897f < 0.0f;
    }

    public final void i(boolean z10) {
        Iterator it = this.f27895c.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f27906o;
    }

    public final void j() {
        Iterator it = this.f27894b.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void removeAllListeners() {
        this.f27895c.clear();
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void removeAllUpdateListeners() {
        this.f27894b.clear();
    }

    public final void m(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f27906o = false;
        }
    }

    @Override // android.animation.Animator
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f27895c.remove(animatorListener);
    }

    @Override // android.animation.Animator
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f27896d.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27894b.remove(animatorUpdateListener);
    }

    public final ValueAnimator q(long j3) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void r(float f10) {
        if (this.f27900i == f10) {
            return;
        }
        float b3 = f.b(f10, f(), e());
        this.f27900i = b3;
        if (this.f27907p) {
            b3 = (float) Math.floor(b3);
        }
        this.f27901j = b3;
        this.f27899h = 0L;
        j();
    }

    public final void s(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ ValueAnimator setDuration(long j3) {
        q(j3);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setInterpolator(TimeInterpolator timeInterpolator) {
        s(timeInterpolator);
        throw null;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f27898g) {
            this.f27898g = false;
            this.f27897f = -this.f27897f;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setStartDelay(long j3) {
        u(j3);
        throw null;
    }

    public final void t(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            j jVar = this.f27905n;
            if (jVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = jVar.f21561l;
            }
            if (jVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = jVar.f21562m;
            }
            float b3 = f.b(f10, f12, f13);
            float b10 = f.b(f11, f12, f13);
            if (b3 != this.f27903l || b10 != this.f27904m) {
                this.f27903l = b3;
                this.f27904m = b10;
                r((int) f.b(this.f27901j, b3, b10));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public final void u(long j3) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j3) {
        q(j3);
        throw null;
    }
}
