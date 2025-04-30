package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class COT extends jU {
    public COT(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    private void KS(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.lMd.cz())).setDuration((int) (this.lMd.dT() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zp.COT.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                COT.this.KS.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(zp(duration));
    }

    private void jU(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.lMd.cz())).setDuration((int) (this.lMd.dT() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(zp(duration));
    }

    private void lMd(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.lMd.cz())).setDuration((int) (this.lMd.dT() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zp.COT.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                COT.this.KS.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(zp(duration));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        char c9;
        ArrayList arrayList = new ArrayList();
        String FP = this.lMd.FP();
        switch (FP.hashCode()) {
            case 3029889:
                if (FP.equals("both")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 3387192:
                if (FP.equals("none")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 483313230:
                if (FP.equals("forwards")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1356771568:
                if (FP.equals("backwards")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0) {
            zp(arrayList);
        } else if (c9 == 1) {
            jU(arrayList);
        } else if (c9 != 2) {
            KS(arrayList);
        } else {
            lMd(arrayList);
        }
        return arrayList;
    }

    private void zp(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.lMd.cz())).setDuration(((int) (this.lMd.dT() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar = this.lMd;
        zpVar.HWF(zpVar.dQp() * 2);
        list.add(zp(duration));
    }
}
