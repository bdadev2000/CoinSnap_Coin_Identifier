package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class rkt {
    private final int AlY;
    private AnimatorSet DSW;
    private final com.bytedance.sdk.openadsdk.core.model.Wwa Sg;
    com.bytedance.sdk.openadsdk.core.widget.NjR YFl;
    private final Context tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.qsH f10599vc;
    private final YFl wN;

    public rkt(YFl yFl) {
        this.tN = yFl.BPI;
        this.Sg = yFl.Sg;
        this.AlY = yFl.Cqy;
        this.wN = yFl;
    }

    public View AlY() {
        return this.f10599vc;
    }

    public void Sg() {
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 80);
        ofInt.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.rkt.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.NjR njR = rkt.this.YFl;
                if (njR != null) {
                    njR.setProgress(intValue);
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(81, 99);
        ofInt2.setDuration(3000L);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.rkt.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.NjR njR = rkt.this.YFl;
                if (njR != null) {
                    njR.setProgress(intValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.DSW = animatorSet;
        animatorSet.play(ofInt).before(ofInt2);
        this.DSW.start();
    }

    public void YFl() {
        try {
            if (Ne.tN(this.Sg)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.qsH qsh = new com.bytedance.sdk.openadsdk.core.widget.qsH(this.tN);
            this.f10599vc = qsh;
            this.YFl = qsh.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.wN.qsH downloadButton = this.f10599vc.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.wN.dXO.wN());
            }
            this.f10599vc.YFl(this.Sg, this.AlY);
        } catch (Throwable unused) {
        }
    }

    public void tN() {
        AnimatorSet animatorSet = this.DSW;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
