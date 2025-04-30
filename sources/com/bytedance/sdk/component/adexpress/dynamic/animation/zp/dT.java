package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class dT extends jU {
    private float COT;
    private float HWF;
    private zp jU;

    /* loaded from: classes.dex */
    public class zp {
        private View lMd;

        public zp(View view) {
            this.lMd = view;
        }

        public void zp(int i9) {
            if ("top".equals(dT.this.lMd.zp())) {
                if (dT.this.KS instanceof ViewGroup) {
                    for (int i10 = 0; i10 < ((ViewGroup) dT.this.KS).getChildCount(); i10++) {
                        ((ViewGroup) dT.this.KS).getChildAt(i10).setTranslationY(i9 - dT.this.COT);
                    }
                }
                dT dTVar = dT.this;
                dTVar.KS.setTranslationY(dTVar.COT - i9);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.lMd.getLayoutParams();
            layoutParams.height = i9;
            this.lMd.setLayoutParams(layoutParams);
            this.lMd.requestLayout();
        }
    }

    public dT(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        int i9;
        String str;
        View view = this.KS;
        if ((view instanceof ImageView) && (view.getParent() instanceof DynamicBaseWidget)) {
            this.KS = (View) this.KS.getParent();
        }
        this.KS.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "alpha", 0.0f, 1.0f).setDuration((int) (this.lMd.dT() * 1000.0d));
        this.jU = new zp(this.KS);
        final int i10 = this.KS.getLayoutParams().height;
        this.COT = i10;
        this.HWF = this.KS.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.lMd.zp()) || TtmlNode.RIGHT.equals(this.lMd.zp())) {
            i9 = (int) this.HWF;
            str = "width";
        } else {
            str = "height";
            i9 = i10;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.jU, str, 0, i9).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        arrayList.add(zp(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zp.dT.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z8) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                dT.this.jU.zp(i10);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z8) {
            }
        });
        return arrayList;
    }
}
