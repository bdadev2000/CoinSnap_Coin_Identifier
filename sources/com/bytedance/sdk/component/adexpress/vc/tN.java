package com.bytedance.sdk.component.adexpress.vc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class tN extends FrameLayout {
    private TextView AlY;
    private ImageView Sg;
    private Context YFl;
    private ImageView tN;

    /* renamed from: vc, reason: collision with root package name */
    private AnimatorSet f10428vc;
    private lG wN;

    public tN(Context context) {
        super(context);
        this.f10428vc = new AnimatorSet();
        this.YFl = context;
        wN();
        vc();
    }

    private void vc() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.tN, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.tN, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f10428vc.setDuration(800L);
        this.f10428vc.playTogether(ofFloat, ofFloat2);
    }

    private void wN() {
        FrameLayout frameLayout = new FrameLayout(this.YFl);
        this.wN = new lG(this.YFl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 95.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.wN, layoutParams);
        this.Sg = new ImageView(this.YFl);
        int YFl = com.bytedance.sdk.component.utils.UZM.YFl(this.YFl, 60.0f);
        this.Sg.setImageDrawable(com.bytedance.sdk.component.adexpress.AlY.NjR.YFl(1, null, null, new int[]{YFl, YFl}, Integer.valueOf(com.bytedance.sdk.component.utils.UZM.YFl(this.YFl, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 75.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.Sg, layoutParams2);
        this.tN = new ImageView(this.YFl);
        int YFl2 = com.bytedance.sdk.component.utils.UZM.YFl(this.YFl, 50.0f);
        this.tN.setImageDrawable(com.bytedance.sdk.component.adexpress.AlY.NjR.YFl(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{YFl2, YFl2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 63.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.tN, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.YFl);
        this.AlY = textView;
        textView.setTextColor(-1);
        this.AlY.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.AlY, layoutParams4);
    }

    public void AlY() {
        this.wN.Sg();
        this.wN.tN();
    }

    public void Sg() {
        this.f10428vc.cancel();
    }

    public void YFl() {
        this.f10428vc.start();
    }

    public void setGuideText(String str) {
        this.AlY.setText(str);
    }

    public void tN() {
        this.wN.YFl();
    }
}
