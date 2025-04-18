package com.bytedance.adsdk.Sg.vc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class YFl extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> YFl = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> Sg = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> tN = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void AlY() {
        Iterator<Animator.AnimatorPauseListener> it = this.tN.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Sg(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.Sg) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void YFl(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.Sg) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.Sg.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.tN.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.YFl.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.Sg.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.YFl.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.Sg.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.tN.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.YFl.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j3) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void tN() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.YFl.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wN() {
        Iterator<Animator.AnimatorPauseListener> it = this.tN.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j3) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Sg() {
        Iterator<Animator.AnimatorListener> it = this.Sg.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void YFl() {
        Iterator<Animator.AnimatorListener> it = this.Sg.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }
}
