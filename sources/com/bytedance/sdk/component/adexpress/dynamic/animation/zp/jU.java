package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class jU implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.COT {
    public View KS;
    com.bytedance.sdk.component.adexpress.dynamic.KS.zp lMd;
    private Set<ScheduledFuture<?>> jU = new HashSet();
    public List<ObjectAnimator> zp = zp();

    /* loaded from: classes.dex */
    public class zp implements Runnable {
        ScheduledFuture<?> lMd;
        ObjectAnimator zp;

        public zp(ObjectAnimator objectAnimator) {
            this.zp = objectAnimator;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS() != null) {
                com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().KS().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zp.this.zp.resume();
                    }
                });
                if (this.lMd != null) {
                    jU.this.jU.remove(this.lMd);
                }
            }
        }

        public void zp(ScheduledFuture<?> scheduledFuture) {
            this.lMd = scheduledFuture;
        }
    }

    public jU(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        this.KS = view;
        this.lMd = zpVar;
    }

    public void KS() {
        List<ObjectAnimator> list = this.zp;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.lMd.woN() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        zp zpVar = new zp(objectAnimator);
                        ScheduledFuture<?> zp2 = com.bytedance.sdk.component.adexpress.jU.KS.zp(zpVar, (long) (jU.this.lMd.woN() * 1000.0d), TimeUnit.MILLISECONDS);
                        zpVar.zp(zp2);
                        jU.this.jU.add(zp2);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.COT
    public void lMd() {
        List<ObjectAnimator> list = this.zp;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.jU.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public abstract List<ObjectAnimator> zp();

    public ObjectAnimator zp(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.lMd.rV() * 1000.0d));
        if (this.lMd.dQp() > 0) {
            objectAnimator.setRepeatCount(this.lMd.dQp() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.lMd.KVG())) {
            if (!"alternate".equals(this.lMd.KVG()) && !"alternate-reverse".equals(this.lMd.KVG())) {
                objectAnimator.setRepeatMode(1);
            } else {
                objectAnimator.setRepeatMode(2);
            }
        }
        if ("ease-in-out".equals(this.lMd.tG())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.lMd.KVG())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.lMd.KVG())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    jU.this.KS.setVisibility(0);
                    if (jU.this.KS.getParent() instanceof DynamicBaseWidgetImp) {
                        ((View) jU.this.KS.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
