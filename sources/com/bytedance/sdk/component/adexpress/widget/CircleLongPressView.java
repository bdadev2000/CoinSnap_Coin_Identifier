package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class CircleLongPressView extends FrameLayout {
    private RingProgressView COT;
    private AnimatorSet HWF;
    private ImageView KS;
    private TextView jU;
    private ImageView lMd;
    private Context zp;

    public CircleLongPressView(Context context) {
        super(context);
        this.HWF = new AnimatorSet();
        this.zp = context;
        COT();
        HWF();
    }

    private void COT() {
        FrameLayout frameLayout = new FrameLayout(this.zp);
        this.COT = new RingProgressView(this.zp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 95.0f), (int) QR.zp(this.zp, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.COT, layoutParams);
        ImageView imageView = new ImageView(this.zp);
        this.lMd = imageView;
        imageView.setImageResource(cz.jU(this.zp, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 75.0f), (int) QR.zp(this.zp, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.lMd, layoutParams2);
        ImageView imageView2 = new ImageView(this.zp);
        this.KS = imageView2;
        imageView2.setImageResource(cz.jU(this.zp, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 63.0f), (int) QR.zp(this.zp, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.KS, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.zp);
        this.jU = textView;
        textView.setTextColor(-1);
        this.jU.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.jU, layoutParams4);
    }

    private void HWF() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.KS, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.KS, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.HWF.setDuration(800L);
        this.HWF.playTogether(ofFloat, ofFloat2);
    }

    public void KS() {
        this.COT.zp();
    }

    public void jU() {
        this.COT.lMd();
        this.COT.KS();
    }

    public void lMd() {
        this.HWF.cancel();
    }

    public void setGuideText(String str) {
        this.jU.setText(str);
    }

    public void zp() {
        this.HWF.start();
    }
}
