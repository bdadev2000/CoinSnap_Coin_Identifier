package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.jU.Bj;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.cz;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, RCv.zp {
    private int Bj;
    private Context COT;
    private TextView HWF;
    private int KS;
    private int QR;
    private float YW;
    private int dT;
    private final int jU;
    private int ku;
    private List<String> lMd;
    private Handler rV;
    private int tG;
    private int vDp;
    Animation.AnimationListener zp;

    public AnimationText(Context context, int i9, float f9, int i10, int i11) {
        super(context);
        this.lMd = new ArrayList();
        this.KS = 0;
        this.jU = 1;
        this.rV = new RCv(Looper.getMainLooper(), this);
        this.zp = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.AnimationText.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (AnimationText.this.HWF != null) {
                    AnimationText.this.HWF.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.COT = context;
        this.ku = i9;
        this.YW = f9;
        this.dT = i10;
        this.tG = i11;
        KS();
    }

    private void KS() {
        setFactory(this);
    }

    public void lMd() {
        List<String> list = this.lMd;
        if (list != null && list.size() > 0) {
            int i9 = this.KS;
            this.KS = i9 + 1;
            this.Bj = i9;
            setText(this.lMd.get(i9));
            if (this.KS > this.lMd.size() - 1) {
                this.KS = 0;
            }
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.HWF = textView;
        textView.setTextColor(this.ku);
        this.HWF.setTextSize(this.YW);
        this.HWF.setMaxLines(this.dT);
        this.HWF.setTextAlignment(this.tG);
        return this.HWF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rV.sendEmptyMessageDelayed(1, this.QR);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rV.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Bj.lMd(this.lMd.get(this.Bj), this.YW, false)[0], 1073741824), i9);
        } catch (Exception unused) {
            super.onMeasure(i9, i10);
        }
    }

    public void setAnimationDuration(int i9) {
        this.QR = i9;
    }

    public void setAnimationText(List<String> list) {
        this.lMd = list;
    }

    public void setAnimationType(int i9) {
        this.vDp = i9;
    }

    public void setMaxLines(int i9) {
        this.dT = i9;
    }

    public void setTextColor(int i9) {
        this.ku = i9;
    }

    public void setTextSize(float f9) {
        this.YW = f9;
    }

    public void zp() {
        int i9 = this.vDp;
        if (i9 == 1) {
            setInAnimation(getContext(), cz.dT(this.COT, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), cz.dT(this.COT, "tt_text_animation_y_out"));
        } else if (i9 == 0) {
            setInAnimation(getContext(), cz.dT(this.COT, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), cz.dT(this.COT, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.zp);
            getOutAnimation().setAnimationListener(this.zp);
        }
        this.rV.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        if (message.what != 1) {
            return;
        }
        lMd();
        this.rV.sendEmptyMessageDelayed(1, this.QR);
    }
}
