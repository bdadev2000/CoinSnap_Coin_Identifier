package com.bytedance.sdk.component.adexpress.vc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* loaded from: classes.dex */
public class DSW extends Ne {
    private View Sg;
    private TextView YFl;
    private AnimatorSet tN;

    public DSW(Context context) {
        super(context);
        this.tN = new AnimatorSet();
        Sg(context);
    }

    private void AlY() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Sg, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Sg, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.tN.playTogether(ofFloat, ofFloat2);
        this.tN.setDuration(1000L);
        this.tN.start();
    }

    private void Sg(Context context) {
        View YFl = com.bytedance.sdk.component.adexpress.tN.YFl.YFl(context);
        this.Sg = YFl;
        addView(YFl);
        setClipChildren(false);
        this.YFl = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.Ne
    public void YFl(Context context) {
    }

    public void setButtonText(String str) {
        if (this.YFl != null && !TextUtils.isEmpty(str)) {
            this.YFl.setText(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.Ne
    public void YFl() {
        AlY();
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.Ne
    public void Sg() {
        this.tN.cancel();
    }
}
