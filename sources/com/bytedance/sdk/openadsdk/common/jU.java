package com.bytedance.sdk.openadsdk.common;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.KVG;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class jU extends HWF {
    private LinearLayout YW;
    private AnimatorSet ku;
    ObjectAnimator zp;

    public jU(Context context, String str, String[] strArr, rV rVVar, KVG kvg) {
        super(context, str, strArr, rVVar, kvg);
    }

    private View HWF() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this.HWF);
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this.HWF);
        this.YW = linearLayout;
        linearLayout.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, WNy.lMd(this.HWF, 60.0f));
        this.YW.setGravity(17);
        this.YW.setOrientation(0);
        pAGLinearLayout.addView(this.YW, layoutParams);
        int lMd = WNy.lMd(this.HWF, 17.0f);
        int lMd2 = WNy.lMd(this.HWF, 35.0f);
        int lMd3 = WNy.lMd(this.HWF, 1.5f);
        View view = new View(this.HWF);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(lMd, lMd2);
        int i9 = -lMd3;
        layoutParams2.rightMargin = i9;
        view.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this.HWF, "tt_ad_landing_loading_three_left"));
        this.YW.addView(view, layoutParams2);
        View view2 = new View(this.HWF);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(lMd, lMd2);
        layoutParams3.rightMargin = i9;
        view2.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this.HWF, "tt_ad_landing_loading_three_mid"));
        this.YW.addView(view2, layoutParams3);
        View view3 = new View(this.HWF);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(lMd, lMd2);
        view3.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this.HWF, "tt_ad_landing_loading_three_mid"));
        this.YW.addView(view3, layoutParams4);
        View view4 = new View(this.HWF);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(lMd, lMd2);
        layoutParams5.leftMargin = i9;
        view4.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this.HWF, "tt_ad_landing_loading_three_mid"));
        this.YW.addView(view4, layoutParams5);
        View view5 = new View(this.HWF);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(lMd, lMd2);
        layoutParams6.leftMargin = i9;
        view5.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this.HWF, "tt_ad_landing_loading_three_right"));
        this.YW.addView(view5, layoutParams6);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this.HWF);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = WNy.lMd(this.HWF, 10.0f);
        pAGLinearLayout2.setGravity(17);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams7);
        PAGTextView pAGTextView = new PAGTextView(this.HWF);
        pAGTextView.setId(vDp.VTk);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.gravity = 17;
        pAGTextView.setGravity(17);
        pAGTextView.setPadding(WNy.lMd(this.HWF, 10.0f), 0, 0, 0);
        pAGTextView.setText(cz.zp(this.HWF, "tt_loading_language"));
        pAGTextView.setTextColor(Color.parseColor("#80161823"));
        pAGTextView.setTextSize(14.0f);
        pAGLinearLayout2.addView(pAGTextView, layoutParams8);
        KVG kvg = this.QR;
        if (kvg != null) {
            pAGTextView.setText(kvg.COT());
        }
        return pAGLinearLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void KS() {
        ObjectAnimator objectAnimator = this.zp;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet = this.ku;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void jU() {
        super.jU();
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void lMd() {
        float f9;
        this.ku = new AnimatorSet();
        LinearLayout linearLayout = this.YW;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            this.zp = duration;
            duration.setRepeatMode(2);
            this.zp.setRepeatCount(-1);
            AnimatorSet.Builder play = this.ku.play(this.zp);
            for (int i9 = 1; i9 < this.YW.getChildCount(); i9++) {
                if (i9 % 2 == 0) {
                    f9 = 9.0f;
                } else {
                    f9 = -9.0f;
                }
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.YW.getChildAt(i9), "translationY", -f9, f9).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.ku.start();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void zp(int i9) {
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void zp() {
        this.COT = HWF();
    }
}
