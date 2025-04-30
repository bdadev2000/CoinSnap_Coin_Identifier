package com.bytedance.adsdk.lottie.HWF;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class zp extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> zp = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> lMd = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> KS = new CopyOnWriteArraySet();

    public void COT() {
        Iterator<Animator.AnimatorPauseListener> it = this.KS.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    public void KS() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.zp.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.lMd.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.KS.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.zp.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void jU() {
        Iterator<Animator.AnimatorPauseListener> it = this.KS.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    public void lMd(boolean z8) {
        for (Animator.AnimatorListener animatorListener : this.lMd) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z8);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.lMd.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.zp.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.lMd.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.KS.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.zp.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j7) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void zp(boolean z8) {
        for (Animator.AnimatorListener animatorListener : this.lMd) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z8);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j7) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void lMd() {
        Iterator<Animator.AnimatorListener> it = this.lMd.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    public void zp() {
        Iterator<Animator.AnimatorListener> it = this.lMd.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }
}
