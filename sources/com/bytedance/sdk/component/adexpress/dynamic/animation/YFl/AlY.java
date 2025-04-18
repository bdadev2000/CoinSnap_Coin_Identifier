package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GS;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class AlY implements GS {
    com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl Sg;
    public View tN;
    private Set<ScheduledFuture<?>> AlY = new HashSet();
    public List<ObjectAnimator> YFl = YFl();

    /* loaded from: classes.dex */
    public class YFl implements Runnable {
        ScheduledFuture<?> Sg;
        ObjectAnimator YFl;

        public YFl(ObjectAnimator objectAnimator) {
            this.YFl = objectAnimator;
        }

        public void YFl(ScheduledFuture<?> scheduledFuture) {
            this.Sg = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN() != null) {
                com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().tN().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY.YFl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        YFl.this.YFl.resume();
                    }
                });
                if (this.Sg != null) {
                    AlY.this.AlY.remove(this.Sg);
                }
            }
        }
    }

    public AlY(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        this.tN = view;
        this.Sg = yFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GS
    public void Sg() {
        List<ObjectAnimator> list = this.YFl;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.AlY.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public abstract List<ObjectAnimator> YFl();

    public void tN() {
        List<ObjectAnimator> list = this.YFl;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.Sg.lG() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        YFl yFl = new YFl(objectAnimator);
                        ScheduledFuture<?> YFl2 = com.bytedance.sdk.component.adexpress.AlY.AlY.YFl(yFl, (long) (AlY.this.Sg.lG() * 1000.0d), TimeUnit.MILLISECONDS);
                        yFl.YFl(YFl2);
                        AlY.this.AlY.add(YFl2);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    public ObjectAnimator YFl(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.Sg.pDU() * 1000.0d));
        if (this.Sg.EH() > 0) {
            objectAnimator.setRepeatCount(this.Sg.EH() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.Sg.rkt())) {
            if (!"alternate".equals(this.Sg.rkt()) && !"alternate-reverse".equals(this.Sg.rkt())) {
                objectAnimator.setRepeatMode(1);
            } else {
                objectAnimator.setRepeatMode(2);
            }
        }
        if ("ease-in-out".equals(this.Sg.GA())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.Sg.rkt())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.Sg.rkt())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    AlY.this.tN.setVisibility(0);
                    if (AlY.this.tN.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc) {
                        ((View) AlY.this.tN.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
