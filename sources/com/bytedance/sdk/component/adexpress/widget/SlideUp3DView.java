package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.jU;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class SlideUp3DView extends FrameLayout {
    private AnimationDrawable COT;
    private TextView KS;
    private TextView jU;
    private ImageView lMd;
    private Context zp;

    public SlideUp3DView(Context context) {
        super(context);
        this.zp = context;
        zp();
    }

    private void jU() {
        this.COT = new AnimationDrawable();
        zp(100, "tt_slide_up_1");
        zp(100, "tt_slide_up_2");
        zp(100, "tt_slide_up_3");
        zp(100, "tt_slide_up_4");
        zp(100, "tt_slide_up_5");
        zp(100, "tt_slide_up_6");
        zp(100, "tt_slide_up_7");
        zp(100, "tt_slide_up_8");
        zp(100, "tt_slide_up_9");
        zp(100, "tt_slide_up_10");
        zp(120, "tt_slide_up_11");
        zp(120, "tt_slide_up_12");
        zp(120, "tt_slide_up_13");
        zp(120, "tt_slide_up_14");
        zp(120, "tt_slide_up_15");
        this.COT.setOneShot(false);
    }

    public void KS() {
        AnimationDrawable animationDrawable = this.COT;
        if (animationDrawable != null) {
            animationDrawable.stop();
            this.COT = null;
        }
    }

    public void lMd() {
        if (this.COT == null) {
            jU();
        }
        this.lMd.setImageDrawable(this.COT);
        this.COT.start();
    }

    public void setGuideText(String str) {
        this.KS.setText(str);
    }

    public void zp() {
        this.lMd = new ImageView(this.zp);
        this.jU = new TextView(this.zp);
        this.KS = new TextView(this.zp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 200.0f), (int) QR.zp(this.zp, 200.0f));
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = (int) QR.zp(this.zp, 70.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) QR.zp(this.zp, 25.0f);
        this.jU.setText(cz.lMd(this.zp, "tt_slide_up_3d"));
        this.jU.setTextColor(-1);
        this.jU.setTextSize(24.0f);
        this.jU.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        this.KS.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        this.KS.setTextColor(-1);
        this.KS.setTextSize(14.0f);
        addView(this.lMd, layoutParams);
        if (!jU.lMd()) {
            addView(this.jU, layoutParams2);
        }
        addView(this.KS, layoutParams3);
    }

    private void zp(int i9, String str) {
        this.COT.addFrame(cz.KS(this.zp, str), i9);
    }
}
