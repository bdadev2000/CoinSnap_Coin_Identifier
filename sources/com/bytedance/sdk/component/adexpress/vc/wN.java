package com.bytedance.sdk.component.adexpress.vc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class wN extends FrameLayout {
    private AnimatorSet Sg;
    private ImageView YFl;

    public wN(Context context) {
        super(context);
        tN();
        AlY();
    }

    private void AlY() {
        this.Sg = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.YFl, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.YFl, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.Sg.playTogether(ofFloat, ofFloat2);
    }

    private void tN() {
        ImageView imageView = new ImageView(getContext());
        this.YFl = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_white_hand"));
        int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(YFl, YFl);
        layoutParams.gravity = 17;
        addView(this.YFl, layoutParams);
    }

    public void Sg() {
        AnimatorSet animatorSet = this.Sg;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void YFl() {
        AnimatorSet animatorSet = this.Sg;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
