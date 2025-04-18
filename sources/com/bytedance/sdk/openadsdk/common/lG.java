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
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.pDU;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class lG {
    private final Context DSW;
    private TextView NjR;
    TTAdDislikeToast Sg;
    pDU YFl;
    private boolean YoT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wN.vc f10563nc;
    private ImageView qsH;

    /* renamed from: vc, reason: collision with root package name */
    private final Wwa f10564vc;
    private final RelativeLayout wN;
    final AtomicBoolean tN = new AtomicBoolean(false);
    final AtomicBoolean AlY = new AtomicBoolean(false);
    private final int eT = GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl(), 44.0f);

    public lG(Context context, RelativeLayout relativeLayout, Wwa wwa) {
        this.DSW = context;
        this.wN = relativeLayout;
        this.f10564vc = wwa;
        wN();
    }

    private void DSW() {
        this.Sg.show(TTAdDislikeToast.getDislikeTip());
    }

    private void vc() {
        try {
            if (this.YFl == null) {
                pDU pdu = new pDU(this.DSW, this.f10564vc);
                this.YFl = pdu;
                pdu.setDislikeSource("landing_page");
                this.YFl.setCallback(new pDU.YFl() { // from class: com.bytedance.sdk.openadsdk.common.lG.6
                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void Sg(View view) {
                        lG.this.tN.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void YFl(View view) {
                        lG.this.tN.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void YFl(FilterWord filterWord) {
                        if (lG.this.AlY.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        lG.this.AlY.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.wN.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.YFl);
            if (this.Sg == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.DSW);
                this.Sg = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th2);
        }
    }

    private void wN() {
        String Hjb;
        this.qsH = (ImageView) this.wN.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Vmj);
        this.NjR = (TextView) this.wN.findViewById(com.bytedance.sdk.openadsdk.utils.GA.in);
        ImageView imageView = (ImageView) this.wN.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Bn);
        this.f10563nc = (com.bytedance.sdk.openadsdk.core.wN.vc) this.wN.findViewById(com.bytedance.sdk.openadsdk.utils.GA.uGS);
        Wwa wwa = this.f10564vc;
        if (wwa != null) {
            TextView textView = this.NjR;
            if (TextUtils.isEmpty(wwa.Hjb())) {
                Hjb = qO.YFl(this.DSW, "tt_web_title_default");
            } else {
                Hjb = this.f10564vc.Hjb();
            }
            textView.setText(Hjb);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.lG.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                lG.this.AlY();
            }
        });
    }

    public void AlY() {
        if (this.AlY.get()) {
            DSW();
            return;
        }
        if (this.YFl == null) {
            vc();
        }
        pDU pdu = this.YFl;
        if (pdu != null) {
            pdu.YFl();
        }
    }

    public void Sg() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.wN.getLayoutParams();
            if (!this.YoT && marginLayoutParams.topMargin == 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, -this.eT);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.lG.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        lG.this.wN.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.lG.5
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        lG.this.YoT = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        lG.this.YoT = true;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public ImageView tN() {
        return this.qsH;
    }

    public void YFl(int i10) {
        if (i10 == 100) {
            this.f10563nc.setVisibility(8);
        } else {
            this.f10563nc.setVisibility(0);
            this.f10563nc.setProgress(i10);
        }
    }

    public void YFl() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.wN.getLayoutParams();
            if (this.YoT) {
                return;
            }
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.eT;
            if (i10 == (-i11)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(-i11, 0);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.lG.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        lG.this.wN.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.lG.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        lG.this.YoT = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        lG.this.YoT = true;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }
}
