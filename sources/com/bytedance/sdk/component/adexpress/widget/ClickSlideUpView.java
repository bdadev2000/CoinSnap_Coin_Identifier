package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.KS.zp;
import com.bytedance.sdk.component.adexpress.jU.QR;

/* loaded from: classes.dex */
public class ClickSlideUpView extends SlideUpView {
    private AnimatorSet KS;
    private View lMd;
    private TextView zp;

    public ClickSlideUpView(Context context) {
        super(context);
        this.KS = new AnimatorSet();
        lMd(context);
    }

    private void jU() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.lMd, "translationY", 0.0f, QR.zp(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.lMd, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.KS.playTogether(ofFloat, ofFloat2);
        this.KS.setDuration(1000L);
        this.KS.start();
    }

    private void lMd(Context context) {
        View zp = zp.zp(context);
        this.lMd = zp;
        addView(zp);
        setClipChildren(false);
        this.zp = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.zp != null && !TextUtils.isEmpty(str)) {
            this.zp.setText(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void zp(Context context) {
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void zp() {
        jU();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void lMd() {
        this.KS.cancel();
    }
}
