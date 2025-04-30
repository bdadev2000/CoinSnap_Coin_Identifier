package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGLoadingBaseLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingFourLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingOneLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingThreeLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingTwoLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vDp {
    private TwoSemicirclesView Bj;
    private final woN COT;
    private final Context HWF;
    PAGProgressBar KS;
    private AnimatorSet KVG;
    private int QR = 0;
    private LinearLayout YW;
    private AnimatorSet dQp;
    private TwoSemicirclesView dT;
    TextView jU;
    private PAGLoadingBaseLayout ku;
    TextView lMd;
    private final int rV;
    private final String tG;
    private PAGLogoView vDp;
    TTRoundRectImageView zp;

    public vDp(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.HWF = zpVar.fgJ;
        this.COT = zpVar.zp;
        this.tG = zpVar.QR;
        this.rV = zpVar.dT;
    }

    private void Bj() {
        float f9;
        this.dQp = new AnimatorSet();
        LinearLayout linearLayout = this.YW;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.dQp.play(duration);
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
            this.dQp.start();
        }
        rV();
    }

    private void COT() {
        PAGPAGLoadingOneLayout pAGPAGLoadingOneLayout = new PAGPAGLoadingOneLayout(this.HWF);
        this.ku = pAGPAGLoadingOneLayout;
        this.zp = pAGPAGLoadingOneLayout.getLoadingIcon();
        this.lMd = this.ku.getLoadingAppName();
        this.KS = this.ku.getLoadingProgressBar();
        this.jU = this.ku.getLoadingProgressNumber();
        this.vDp = this.ku.getLoadingLogo();
        if (this.rV == 1 && this.COT.Vjb() != null && !TextUtils.isEmpty(this.COT.Vjb().lMd())) {
            this.lMd.setText(this.COT.Vjb().lMd());
        } else if (!TextUtils.isEmpty(this.COT.rCC())) {
            this.lMd.setText(this.COT.rCC());
        } else {
            this.lMd.setVisibility(8);
        }
        tG();
        this.vDp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.vDp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.zp(vDp.this.HWF, vDp.this.COT, vDp.this.tG);
            }
        });
    }

    private void HWF() {
        PAGPAGLoadingTwoLayout pAGPAGLoadingTwoLayout = new PAGPAGLoadingTwoLayout(this.HWF);
        this.ku = pAGPAGLoadingTwoLayout;
        this.zp = pAGPAGLoadingTwoLayout.getLoadingIcon();
        this.jU = this.ku.getLoadingProgressNumber();
        this.vDp = this.ku.getLoadingLogo();
        tG();
        this.vDp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.vDp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.zp(vDp.this.HWF, vDp.this.COT, vDp.this.tG);
            }
        });
    }

    private void QR() {
        PAGPAGLoadingThreeLayout pAGPAGLoadingThreeLayout = new PAGPAGLoadingThreeLayout(this.HWF);
        this.ku = pAGPAGLoadingThreeLayout;
        this.YW = pAGPAGLoadingThreeLayout.getWaveContainer();
        this.jU = this.ku.getLoadingProgressNumber();
        PAGLogoView loadingLogo = this.ku.getLoadingLogo();
        this.vDp = loadingLogo;
        loadingLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.vDp.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.zp(vDp.this.HWF, vDp.this.COT, vDp.this.tG);
            }
        });
    }

    private void YW() {
        rV();
    }

    private void dT() {
        Context context = this.HWF;
        this.zp.setAnimation(AnimationUtils.loadAnimation(context, cz.dT(context, "tt_loading_two_icon_scale")));
        rV();
    }

    private void ku() {
        PAGPAGLoadingFourLayout pAGPAGLoadingFourLayout = new PAGPAGLoadingFourLayout(this.HWF);
        this.ku = pAGPAGLoadingFourLayout;
        this.dT = pAGPAGLoadingFourLayout.getInnerCircle();
        this.Bj = this.ku.getOuterCircle();
        this.dT.setRadius(WNy.lMd(this.HWF, 80.0f));
        Paint paintTwo = this.dT.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.dT.setPaintTwo(paintTwo);
        this.Bj.setRadius(WNy.lMd(this.HWF, 95.0f));
        Paint paintTwo2 = this.Bj.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.Bj.setPaintTwo(paintTwo2);
        this.jU = this.ku.getLoadingProgressNumber();
        PAGLogoView loadingLogo = this.ku.getLoadingLogo();
        this.vDp = loadingLogo;
        loadingLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.vDp.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.zp(vDp.this.HWF, vDp.this.COT, vDp.this.tG);
            }
        });
    }

    private void rV() {
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 80);
        ofInt.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.vDp.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                PAGProgressBar pAGProgressBar = vDp.this.KS;
                if (pAGProgressBar != null) {
                    pAGProgressBar.setProgress(intValue);
                }
                vDp.this.jU.setText(String.valueOf(intValue));
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(81, 99);
        ofInt2.setDuration(3000L);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.vDp.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                PAGProgressBar pAGProgressBar = vDp.this.KS;
                if (pAGProgressBar != null) {
                    pAGProgressBar.setProgress(intValue);
                }
                vDp.this.jU.setText(String.valueOf(intValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.KVG = animatorSet;
        animatorSet.play(ofInt).before(ofInt2);
        this.KVG.start();
    }

    private void tG() {
        if (this.COT.BO() != null && !TextUtils.isEmpty(this.COT.BO().zp())) {
            try {
                com.bytedance.sdk.component.COT.dT zp2 = com.bytedance.sdk.openadsdk.HWF.jU.zp(this.COT.BO());
                woN won = this.COT;
                zp2.zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, won.BO().zp(), new zp(this.zp)));
                return;
            } catch (Throwable unused) {
            }
        }
        this.zp.setVisibility(8);
    }

    private void vDp() {
        this.dQp = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.dT, "rotation", 0.0f, 360.0f).setDuration(1500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.Bj, "rotation", 0.0f, 360.0f).setDuration(2500L);
        duration2.setRepeatCount(-1);
        this.dQp.playTogether(duration, duration2);
        this.dQp.start();
        rV();
    }

    public View jU() {
        return this.ku;
    }

    public void KS() {
        AnimatorSet animatorSet = this.dQp;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.KVG;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public void lMd() {
        try {
            int i9 = this.QR;
            if (i9 == 1) {
                YW();
                return;
            }
            if (i9 == 2) {
                dT();
            } else if (i9 == 3) {
                Bj();
            } else {
                if (i9 != 4) {
                    return;
                }
                vDp();
            }
        } catch (Throwable unused) {
        }
    }

    public void zp() {
        try {
            if (!woN.COT(this.COT) || com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.COT)) {
                return;
            }
            try {
                this.QR = new JSONObject(this.COT.fRl().dT()).optInt("loading_page_type", 0);
            } catch (JSONException unused) {
            }
            int i9 = this.QR;
            if (i9 == 1) {
                COT();
                return;
            }
            if (i9 == 2) {
                HWF();
            } else if (i9 == 3) {
                QR();
            } else {
                if (i9 != 4) {
                    return;
                }
                ku();
            }
        } catch (Throwable unused2) {
        }
    }

    /* loaded from: classes.dex */
    public static class zp implements KVG<Bitmap> {
        private final WeakReference<ImageView> zp;

        public zp(ImageView imageView) {
            this.zp = new WeakReference<>(imageView);
        }

        @Override // com.bytedance.sdk.component.COT.KVG
        public void zp(com.bytedance.sdk.component.COT.Bj<Bitmap> bj) {
            ImageView imageView = this.zp.get();
            if (imageView == null) {
                return;
            }
            if (bj != null) {
                try {
                    if (bj.lMd() != null) {
                        imageView.setImageBitmap(bj.lMd());
                        return;
                    }
                } catch (Throwable unused) {
                    imageView.setVisibility(8);
                    return;
                }
            }
            imageView.setVisibility(8);
        }

        @Override // com.bytedance.sdk.component.COT.KVG
        public void zp(int i9, String str, @Nullable Throwable th) {
            ImageView imageView = this.zp.get();
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }
}
