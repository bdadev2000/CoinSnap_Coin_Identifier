package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class wN extends AlY {
    public wN(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    private void AlY(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.Sg.aIu())).setDuration((int) (this.Sg.nc() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(YFl(duration));
    }

    private void Sg(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.Sg.aIu())).setDuration((int) (this.Sg.nc() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.wN.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                wN.this.tN.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(YFl(duration));
    }

    private void tN(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.Sg.aIu())).setDuration((int) (this.Sg.nc() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.wN.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                wN.this.tN.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(YFl(duration));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        char c10;
        ArrayList arrayList = new ArrayList();
        String wXo = this.Sg.wXo();
        switch (wXo.hashCode()) {
            case 3029889:
                if (wXo.equals("both")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3387192:
                if (wXo.equals("none")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 483313230:
                if (wXo.equals("forwards")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1356771568:
                if (wXo.equals("backwards")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            YFl(arrayList);
        } else if (c10 == 1) {
            AlY(arrayList);
        } else if (c10 != 2) {
            tN(arrayList);
        } else {
            Sg(arrayList);
        }
        return arrayList;
    }

    private void YFl(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.Sg.aIu())).setDuration(((int) (this.Sg.nc() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl = this.Sg;
        yFl.vc(yFl.EH() * 2);
        list.add(YFl(duration));
    }
}
