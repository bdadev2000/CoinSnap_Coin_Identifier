package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.KS.zp;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;

/* loaded from: classes.dex */
public class DynamicBrushMaskView extends FrameLayout {
    private ObjectAnimator COT;
    private ImageView HWF;
    private TextView KS;
    private ImageView QR;
    private volatile boolean YW;
    private volatile boolean dT;
    private Context jU;
    private FrameLayout ku;
    private BrushMaskView lMd;
    private RelativeLayout zp;

    public DynamicBrushMaskView(Context context) {
        super(context);
        this.dT = false;
        this.jU = context;
        addView(zp.COT(context));
        KS();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            try {
                ObjectAnimator objectAnimator = this.COT;
                if (objectAnimator != null && (objectAnimator.isStarted() || this.COT.isRunning() || this.dT)) {
                    return;
                }
                BrushMaskView brushMaskView = this.lMd;
                if (brushMaskView != null) {
                    brushMaskView.zp();
                }
                RelativeLayout relativeLayout = this.zp;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                jU();
            } catch (Exception e4) {
                tG.zp("DynamicBrushMaskView", e4.getMessage());
            }
        }
    }

    public void setBrushText(String str) {
        if (this.KS != null && !TextUtils.isEmpty(str)) {
            this.KS.setText(str);
        }
    }

    private void KS() {
        this.lMd = (BrushMaskView) findViewById(2097610740);
        this.zp = (RelativeLayout) findViewById(2097610737);
        this.HWF = (ImageView) findViewById(2097610739);
        this.ku = (FrameLayout) findViewById(2097610741);
        this.QR = (ImageView) findViewById(2097610736);
        this.ku.setClipChildren(false);
        this.KS = (TextView) findViewById(2097610738);
        BrushMaskView brushMaskView = this.lMd;
        if (brushMaskView != null) {
            brushMaskView.setWatermark(cz.jU(this.jU, "tt_splash_brush_bg"));
            this.lMd.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBrushMaskView.this.COT != null && DynamicBrushMaskView.this.COT.isStarted()) {
                            return;
                        }
                        DynamicBrushMaskView.this.jU();
                    } catch (Exception e4) {
                        e4.getMessage();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU() {
        if (this.lMd != null) {
            this.YW = false;
            int zp = QR.zp(this.jU);
            int i9 = (zp * 336) / 375;
            int i10 = (i9 * 80) / 336;
            this.ku.setLayoutParams(new RelativeLayout.LayoutParams(i9, i10));
            float f9 = i9;
            final float f10 = f9 - (f9 / 3.0f);
            this.lMd.setEraserSize((this.lMd.getHeight() * 3) / 5.0f);
            float zp2 = QR.zp(getContext(), 15.0f);
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f10, i10 / 2);
            int i11 = i10 / 4;
            layoutParams.topMargin = i11;
            float f11 = f9 / 6.0f;
            int i12 = (int) f11;
            layoutParams.leftMargin = i12;
            layoutParams.setMarginStart(i12);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            this.HWF.setLayoutParams(layoutParams);
            int i13 = (zp * 58) / 375;
            this.QR.setLayoutParams(new RelativeLayout.LayoutParams(500, 500));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i13, (i13 * 76) / 58);
            layoutParams2.topMargin = (int) (i11 + zp2);
            int i14 = (int) (f11 - (zp2 * 1.5f));
            layoutParams2.leftMargin = i14;
            layoutParams2.setMarginStart(i14);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.zp.setLayoutParams(layoutParams2);
            this.lMd.zp(this.lMd.getWidth() / 6.0f, this.lMd.getHeight() / 2.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.zp, "translationX", 0.0f, f10);
            this.COT = ofFloat;
            ofFloat.setDuration(1000L);
            this.COT.setRepeatMode(1);
            this.COT.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (DynamicBrushMaskView.this.HWF != null) {
                        layoutParams.width = (int) (f10 * animatedFraction);
                        DynamicBrushMaskView.this.HWF.setLayoutParams(layoutParams);
                    }
                }
            });
            this.COT.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (DynamicBrushMaskView.this.lMd != null) {
                        if (DynamicBrushMaskView.this.HWF != null) {
                            layoutParams.width = 0;
                            DynamicBrushMaskView.this.HWF.setLayoutParams(layoutParams);
                        }
                        if (!DynamicBrushMaskView.this.YW) {
                            DynamicBrushMaskView.this.dT = true;
                            DynamicBrushMaskView.this.lMd.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    DynamicBrushMaskView.this.dT = false;
                                    if (!DynamicBrushMaskView.this.YW) {
                                        DynamicBrushMaskView.this.COT.start();
                                    }
                                }
                            }, 100L);
                        }
                    }
                }
            });
            ObjectAnimator objectAnimator = this.COT;
            if (objectAnimator == null || objectAnimator.isStarted() || this.COT.isRunning() || this.dT) {
                return;
            }
            this.COT.start();
        }
    }

    public void lMd() {
        clearAnimation();
    }

    public void zp() {
        if (this.YW) {
            return;
        }
        this.YW = true;
        ObjectAnimator objectAnimator = this.COT;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            RelativeLayout relativeLayout = this.zp;
            if (relativeLayout != null) {
                relativeLayout.clearAnimation();
                this.zp.setVisibility(4);
            }
            this.lMd.zp();
        }
        BrushMaskView brushMaskView = this.lMd;
        if (brushMaskView != null) {
            brushMaskView.setEraserSize(brushMaskView.getHeight());
            this.lMd.zp(0.0f, r0.getHeight() / 2.0f);
            this.lMd.lMd();
        }
    }
}
