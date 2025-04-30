package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class dT {
    private final RelativeLayout COT;
    private final woN HWF;
    private final Context QR;
    private TextView YW;
    private PAGProgressBar dT;
    private ImageView ku;
    TTAdDislikeToast lMd;
    private boolean vDp;
    TTAdDislikeDialog zp;
    final AtomicBoolean KS = new AtomicBoolean(false);
    final AtomicBoolean jU = new AtomicBoolean(false);
    private final int Bj = WNy.lMd(KVG.zp(), 44.0f);

    public dT(Context context, RelativeLayout relativeLayout, woN won) {
        this.QR = context;
        this.COT = relativeLayout;
        this.HWF = won;
        COT();
    }

    private void COT() {
        String rCC;
        this.ku = (ImageView) this.COT.findViewById(vDp.Np);
        this.YW = (TextView) this.COT.findViewById(vDp.YcG);
        ImageView imageView = (ImageView) this.COT.findViewById(vDp.zpV);
        this.dT = (PAGProgressBar) this.COT.findViewById(vDp.REM);
        woN won = this.HWF;
        if (won != null) {
            TextView textView = this.YW;
            if (TextUtils.isEmpty(won.rCC())) {
                rCC = cz.zp(this.QR, "tt_web_title_default");
            } else {
                rCC = this.HWF.rCC();
            }
            textView.setText(rCC);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.dT.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dT.this.jU();
            }
        });
    }

    private void HWF() {
        try {
            if (this.zp == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.QR, this.HWF);
                this.zp = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.zp() { // from class: com.bytedance.sdk.openadsdk.common.dT.6
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void lMd(View view) {
                        dT.this.KS.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void zp(View view) {
                        dT.this.KS.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void zp(int i9, FilterWord filterWord) {
                        if (dT.this.jU.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        dT.this.jU.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.COT.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.zp);
            if (this.lMd == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.QR);
                this.lMd = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void QR() {
        this.lMd.zp(TTAdDislikeToast.getDislikeTip());
    }

    public ImageView KS() {
        return this.ku;
    }

    public void jU() {
        if (this.jU.get()) {
            QR();
            return;
        }
        if (this.zp == null) {
            HWF();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.zp;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.zp();
        }
    }

    public void lMd() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.COT.getLayoutParams();
            if (!this.vDp && marginLayoutParams.topMargin == 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, -this.Bj);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.dT.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        dT.this.COT.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.dT.5
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        dT.this.vDp = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        dT.this.vDp = true;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void zp(int i9) {
        if (i9 == 100) {
            this.dT.setVisibility(8);
        } else {
            this.dT.setVisibility(0);
            this.dT.setProgress(i9);
        }
    }

    public void zp() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.COT.getLayoutParams();
            if (this.vDp) {
                return;
            }
            int i9 = marginLayoutParams.topMargin;
            int i10 = this.Bj;
            if (i9 == (-i10)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(-i10, 0);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.dT.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        dT.this.COT.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.dT.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        dT.this.vDp = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        dT.this.vDp = true;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }
}
