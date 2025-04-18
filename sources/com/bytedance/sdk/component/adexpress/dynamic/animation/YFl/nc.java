package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class nc extends AlY {
    private YFl AlY;

    /* renamed from: vc, reason: collision with root package name */
    private float f10384vc;
    private float wN;

    /* loaded from: classes.dex */
    public class YFl {
        private View Sg;

        public YFl(View view) {
            this.Sg = view;
        }

        public void YFl(int i10) {
            if ("top".equals(nc.this.Sg.YFl())) {
                if (nc.this.tN instanceof ViewGroup) {
                    for (int i11 = 0; i11 < ((ViewGroup) nc.this.tN).getChildCount(); i11++) {
                        ((ViewGroup) nc.this.tN).getChildAt(i11).setTranslationY(i10 - nc.this.wN);
                    }
                }
                nc ncVar = nc.this;
                ncVar.tN.setTranslationY(ncVar.wN - i10);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.Sg.getLayoutParams();
            layoutParams.height = i10;
            this.Sg.setLayoutParams(layoutParams);
            this.Sg.requestLayout();
        }
    }

    public nc(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        int i10;
        String str;
        View view = this.tN;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN)) {
            this.tN = (View) this.tN.getParent();
        }
        this.tN.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "alpha", 0.0f, 1.0f).setDuration((int) (this.Sg.nc() * 1000.0d));
        this.AlY = new YFl(this.tN);
        final int i11 = this.tN.getLayoutParams().height;
        this.wN = i11;
        this.f10384vc = this.tN.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.Sg.YFl()) || TtmlNode.RIGHT.equals(this.Sg.YFl())) {
            i10 = (int) this.f10384vc;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.AlY, str, 0, i10).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        arrayList.add(YFl(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.nc.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                nc.this.AlY.YFl(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }
        });
        return arrayList;
    }
}
