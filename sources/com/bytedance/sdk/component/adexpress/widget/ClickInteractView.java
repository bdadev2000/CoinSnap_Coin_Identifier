package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class ClickInteractView extends FrameLayout {
    private AnimatorSet lMd;
    private ImageView zp;

    public ClickInteractView(Context context) {
        super(context);
        KS();
        jU();
    }

    private void KS() {
        ImageView imageView = new ImageView(getContext());
        this.zp = imageView;
        imageView.setImageResource(cz.jU(getContext(), "tt_white_hand"));
        int zp = (int) QR.zp(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(zp, zp);
        layoutParams.gravity = 17;
        addView(this.zp, layoutParams);
    }

    private void jU() {
        this.lMd = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.zp, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.zp, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.lMd.playTogether(ofFloat, ofFloat2);
    }

    public void lMd() {
        AnimatorSet animatorSet = this.lMd;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void zp() {
        AnimatorSet animatorSet = this.lMd;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
