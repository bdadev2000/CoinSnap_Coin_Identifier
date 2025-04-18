package com.bytedance.sdk.component.adexpress.vc;

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
import com.bytedance.sdk.component.utils.bZ;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class YFl extends TextSwitcher implements ViewSwitcher.ViewFactory, bZ.YFl {
    private final int AlY;
    private int DSW;
    private int GA;
    private float NjR;
    private List<String> Sg;
    Animation.AnimationListener YFl;
    private int YoT;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private int f10415nc;
    private Handler pDU;
    private int qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private TextView f10416vc;
    private Context wN;

    public YFl(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.Sg = new ArrayList();
        this.tN = 0;
        this.AlY = 1;
        this.pDU = new com.bytedance.sdk.component.utils.bZ(Looper.getMainLooper(), this);
        this.YFl = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.vc.YFl.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (YFl.this.f10416vc != null) {
                    YFl.this.f10416vc.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.wN = context;
        this.qsH = i10;
        this.NjR = f10;
        this.f10415nc = i11;
        this.GA = i12;
        tN();
    }

    private void tN() {
        setFactory(this);
    }

    public void Sg() {
        List<String> list = this.Sg;
        if (list != null && list.size() > 0) {
            int i10 = this.tN;
            this.tN = i10 + 1;
            this.eT = i10;
            setText(this.Sg.get(i10));
            if (this.tN > this.Sg.size() - 1) {
                this.tN = 0;
            }
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f10416vc = textView;
        textView.setTextColor(this.qsH);
        this.f10416vc.setTextSize(this.NjR);
        this.f10416vc.setMaxLines(this.f10415nc);
        this.f10416vc.setTextAlignment(this.GA);
        return this.f10416vc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.pDU.sendEmptyMessageDelayed(1, this.DSW);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.pDU.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.wN.eT.Sg(this.Sg.get(this.eT), this.NjR, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.DSW = i10;
    }

    public void setAnimationText(List<String> list) {
        this.Sg = list;
    }

    public void setAnimationType(int i10) {
        this.YoT = i10;
    }

    public void setMaxLines(int i10) {
        this.f10415nc = i10;
    }

    public void setTextColor(int i10) {
        this.qsH = i10;
    }

    public void setTextSize(float f10) {
        this.NjR = f10;
    }

    public void YFl() {
        int i10 = this.YoT;
        if (i10 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.qO.NjR(this.wN, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.qO.NjR(this.wN, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.qO.NjR(this.wN, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.qO.NjR(this.wN, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.YFl);
            getOutAnimation().setAnimationListener(this.YFl);
        }
        this.pDU.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        if (message.what != 1) {
            return;
        }
        Sg();
        this.pDU.sendEmptyMessageDelayed(1, this.DSW);
    }
}
