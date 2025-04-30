package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.KS.zp;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class ClickSlideUpView2 extends SlideUpView {
    private int COT;
    private AnimatorSet HWF;
    private ImageView KS;
    private ImageView jU;
    private ImageView lMd;
    private TextView zp;

    public ClickSlideUpView2(Context context) {
        super(context);
        this.HWF = new AnimatorSet();
        lMd(context);
    }

    private void jU() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    private void lMd(Context context) {
        addView(zp.lMd(context));
        this.lMd = (ImageView) findViewById(2097610751);
        this.KS = (ImageView) findViewById(2097610750);
        this.jU = (ImageView) findViewById(2097610749);
        this.zp = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.COT;
    }

    public void setAlphaColor(int i9) {
        if (i9 >= 0 && i9 <= 60) {
            int i10 = i9 + 195;
            ImageView imageView = this.jU;
            int rgb = Color.rgb(i10, i10, i10);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(rgb, mode);
            int i11 = ((i9 + 20) % 60) + 195;
            this.KS.setColorFilter(Color.rgb(i11, i11, i11), mode);
            int i12 = ((i9 + 40) % 60) + 195;
            this.lMd.setColorFilter(Color.rgb(i12, i12, i12), mode);
        }
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
        this.HWF.cancel();
    }
}
