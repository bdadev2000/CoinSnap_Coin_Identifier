package com.bytedance.sdk.openadsdk.component.reward.lMd;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class QR extends lMd {
    private PAGTextView FP;
    private String Gzh;
    private final int KVG;
    private PAGRelativeLayout Lij;
    private PAGLogoView RCv;
    private PAGTextView cz;
    private boolean dQp;
    private PAGTextView ot;
    private PAGTextView ox;
    private TTRoundRectImageView pvr;
    private RatioImageView vwr;
    private View woN;
    private TTRatingBar2 yRU;

    public QR(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        super(zpVar);
        boolean z8;
        this.Gzh = "fullscreen_interstitial_ad";
        this.KVG = this.lMd.mW();
        if (this.zp.dT == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.dQp = z8;
    }

    private void BO() {
        woN won;
        PAGTextView pAGTextView = this.ot;
        if (pAGTextView != null && (won = this.lMd) != null) {
            WNy.zp(pAGTextView, won, this.zp.oB, "tt_comment_num_backup");
        }
    }

    private com.com.bytedance.overseas.sdk.zp.KS COT(woN won) {
        if (won.oKZ() == 4) {
            return new com.com.bytedance.overseas.sdk.zp.lMd(KVG.zp(), won, this.Gzh);
        }
        return null;
    }

    private boolean Iv() {
        woN won = this.lMd;
        if (won == null || won.cz() != 2) {
            return false;
        }
        return true;
    }

    private void Pxi() {
        if (this.woN == null) {
            return;
        }
        final TTBaseVideoActivity tTBaseVideoActivity = this.zp.oB;
        zp((View) this.vwr);
        zp((View) this.pvr);
        zp(this.cz);
        zp(this.FP);
        zp(this.ot);
        zp((View) this.yRU);
        zp(this.ox);
        this.RCv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.QR.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTBaseVideoActivity tTBaseVideoActivity2 = tTBaseVideoActivity;
                    QR qr = QR.this;
                    TTWebsiteActivity.zp(tTBaseVideoActivity2, qr.lMd, qr.Gzh);
                } catch (Throwable th) {
                    tG.zp("TTAD.RFTI", th.getMessage());
                }
            }
        });
    }

    private void UPs() {
        this.woN = jU(this.zp.oB);
        Pxi();
    }

    private void WNy() {
        final TTBaseVideoActivity tTBaseVideoActivity = this.zp.oB;
        this.woN = lMd(tTBaseVideoActivity);
        zp(this.vwr);
        zp(this.pvr);
        zp(this.cz);
        zp(this.FP);
        zp(this.ot);
        zp(this.ox);
        this.RCv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.QR.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTBaseVideoActivity tTBaseVideoActivity2 = tTBaseVideoActivity;
                    QR qr = QR.this;
                    TTWebsiteActivity.zp(tTBaseVideoActivity2, qr.lMd, qr.Gzh);
                } catch (Throwable th) {
                    tG.zp("TTAD.RFTI", th.getMessage());
                }
            }
        });
        this.ox.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.QR.2
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup.LayoutParams layoutParams;
                int i9;
                int width = QR.this.Lij.getWidth() / 2;
                if (width >= WNy.KS(KVG.zp(), 90.0f) && (i9 = (layoutParams = QR.this.ox.getLayoutParams()).width) > 0) {
                    layoutParams.width = Math.min(width, i9);
                    QR.this.ox.setLayoutParams(layoutParams);
                }
            }
        });
    }

    private void YhE() {
        this.woN = KS(this.zp.oB);
        Pxi();
    }

    private void cW() {
        boolean z8;
        if (this.zp.dT == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.dQp = z8;
        int i9 = this.KVG;
        if (z8) {
            if (i9 != 3) {
                if (i9 != 33) {
                    eWG();
                    return;
                } else {
                    fRl();
                    return;
                }
            }
            WNy();
            return;
        }
        if (i9 != 3) {
            if (i9 != 33) {
                ffE();
                return;
            } else {
                UPs();
                return;
            }
        }
        YhE();
    }

    private void eWG() {
        this.woN = zp(this.zp.oB, 2);
        Pxi();
    }

    private void fRl() {
        this.woN = zp(this.zp.oB, 0);
        Pxi();
    }

    private void ffE() {
        final TTBaseVideoActivity tTBaseVideoActivity = this.zp.oB;
        this.woN = COT(tTBaseVideoActivity);
        zp(this.vwr);
        zp(this.pvr);
        zp(this.cz);
        zp(this.FP);
        zp(this.ox);
        this.RCv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.QR.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTBaseVideoActivity tTBaseVideoActivity2 = tTBaseVideoActivity;
                    QR qr = QR.this;
                    TTWebsiteActivity.zp(tTBaseVideoActivity2, qr.lMd, qr.Gzh);
                } catch (Throwable th) {
                    tG.zp("TTAD.RFTI", th.getMessage());
                }
            }
        });
    }

    private void jU(woN won) {
        if (won == null) {
            return;
        }
        RatioImageView ratioImageView = this.vwr;
        if (ratioImageView != null) {
            int i9 = this.KVG;
            if (i9 == 33) {
                ratioImageView.setRatio(1.0f);
            } else if (i9 == 3) {
                ratioImageView.setRatio(1.91f);
            } else {
                ratioImageView.setRatio(0.56f);
            }
            zp((ImageView) this.vwr);
        }
        if (this.pvr != null && this.lMd.BO() != null && !TextUtils.isEmpty(this.lMd.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.lMd.BO().zp(), this.lMd.BO().lMd(), this.lMd.BO().KS(), this.pvr, this.lMd);
        }
        PAGTextView pAGTextView = this.cz;
        if (pAGTextView != null) {
            pAGTextView.setText(zp(this.lMd));
        }
        PAGTextView pAGTextView2 = this.FP;
        if (pAGTextView2 != null) {
            pAGTextView2.setText(lMd(this.lMd));
        }
        oKZ();
        BO();
    }

    private void oKZ() {
        TTRatingBar2 tTRatingBar2 = this.yRU;
        if (tTRatingBar2 == null) {
            return;
        }
        WNy.zp((TextView) null, tTRatingBar2, this.lMd);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean HWF() {
        return Iv();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void QR() {
        this.HWF.jU(8);
        this.HWF.KS(8);
        this.ku.KS(false);
        this.ku.jU(false);
        if (this.lMd.cz() == 2) {
            this.ku.zp(false);
            this.HWF.HWF(8);
            return;
        }
        this.ku.zp(this.lMd.bQm());
        Message obtain = Message.obtain();
        obtain.what = 700;
        obtain.arg1 = (int) (this.zp.UPs.Gzh() * 1000.0d);
        this.zp.qtv.sendMessage(obtain);
    }

    public static boolean KS(woN won) {
        return !woN.COT(won) && won.CZ() == 100.0f;
    }

    public String lMd(woN won) {
        if (won == null) {
            return "";
        }
        if (!TextUtils.isEmpty(won.rCC())) {
            return won.rCC();
        }
        if (TextUtils.isEmpty(won.MBR())) {
            return "";
        }
        return won.MBR();
    }

    public String zp(woN won) {
        if (won == null) {
            return "";
        }
        if (won.Vjb() != null && !TextUtils.isEmpty(won.Vjb().lMd())) {
            return won.Vjb().lMd();
        }
        if (!TextUtils.isEmpty(won.Pxi())) {
            return won.Pxi();
        }
        if (TextUtils.isEmpty(won.rCC())) {
            return "";
        }
        return won.rCC();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean COT() {
        return Iv() || cz.lMd(this.lMd);
    }

    private View COT(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.vwr = new RatioImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.vwr.setScaleType(ImageView.ScaleType.FIT_XY);
        this.vwr.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        this.Lij = pAGRelativeLayout2;
        int i9 = vDp.VuU;
        pAGRelativeLayout2.setId(i9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, zp(100.0f));
        layoutParams2.addRule(12);
        layoutParams2.setMargins(zp(15.0f), zp(15.0f), zp(15.0f), zp(15.0f));
        this.Lij.setBackgroundColor(Color.parseColor("#E4FFFFFF"));
        this.Lij.setGravity(16);
        this.Lij.setPadding(zp(15.0f), 0, 0, 0);
        this.Lij.setLayoutParams(layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.pvr = tTRoundRectImageView;
        int i10 = vDp.Fm;
        tTRoundRectImageView.setId(i10);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(zp(69.0f), zp(69.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.pvr.setBackgroundColor(0);
        this.pvr.setLayoutParams(layoutParams3);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(1, i10);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        this.cz = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, zp(27.0f));
        layoutParams5.leftMargin = zp(14.0f);
        PAGTextView pAGTextView = this.cz;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        this.cz.setGravity(16);
        this.cz.setMaxWidth(zp(153.0f));
        this.cz.setSingleLine(true);
        this.cz.setTextColor(Color.parseColor("#ff000000"));
        this.cz.setTextSize(15.0f);
        this.cz.setLayoutParams(layoutParams5);
        this.FP = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = zp(14.0f);
        this.FP.setEllipsize(truncateAt);
        this.FP.setGravity(16);
        this.FP.setMaxWidth(zp(153.0f));
        this.FP.setSingleLine(true);
        this.FP.setTextColor(Color.parseColor("#4A4A4A"));
        this.FP.setTextSize(14.0f);
        this.FP.setLayoutParams(layoutParams6);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.ox = pAGTextView2;
        pAGTextView2.setId(vDp.xg);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(zp(80.0f), zp(36.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = zp(15.0f);
        this.ox.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_download_corner_bg"));
        this.ox.setGravity(17);
        this.ox.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_video_download_apk"));
        this.ox.setTextColor(Color.parseColor("#ffffff"));
        this.ox.setTextSize(15.0f);
        this.ox.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.RCv = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, zp(14.0f));
        layoutParams8.addRule(2, i9);
        layoutParams8.leftMargin = zp(16.0f);
        layoutParams8.bottomMargin = zp(10.0f);
        this.RCv.setPadding(zp(2.0f), 0, 0, 0);
        this.RCv.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(this.vwr);
        pAGRelativeLayout.addView(this.Lij);
        this.Lij.addView(this.pvr);
        this.Lij.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.cz);
        pAGLinearLayout.addView(this.FP);
        this.Lij.addView(this.ox);
        pAGRelativeLayout.addView(this.RCv);
        return pAGRelativeLayout;
    }

    private View KS(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams2);
        RatioImageView ratioImageView = new RatioImageView(context);
        this.vwr = ratioImageView;
        int i9 = vDp.zR;
        ratioImageView.setId(i9);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        this.vwr.setScaleType(ImageView.ScaleType.FIT_XY);
        this.vwr.setLayoutParams(layoutParams3);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.RCv = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, zp(14.0f));
        layoutParams4.addRule(8, i9);
        this.RCv.setPadding(zp(2.0f), 0, 0, 0);
        this.RCv.setLayoutParams(layoutParams4);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.weight = 2.0f;
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams5);
        this.pvr = new TTRoundRectImageView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(zp(80.0f), zp(80.0f));
        this.pvr.setBackgroundColor(0);
        this.pvr.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.pvr);
        this.cz = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, zp(28.0f));
        PAGTextView pAGTextView = this.cz;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        this.cz.setMaxWidth(zp(180.0f));
        this.cz.setSingleLine(true);
        this.cz.setTextColor(Color.parseColor("#ffffff"));
        this.cz.setTextSize(20.0f);
        this.cz.setLayoutParams(layoutParams7);
        this.FP = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.leftMargin = zp(40.0f);
        layoutParams8.topMargin = zp(20.0f);
        layoutParams8.rightMargin = zp(40.0f);
        this.FP.setGravity(17);
        this.FP.setTextColor(Color.parseColor("#ffffff"));
        this.FP.setTextSize(20.0f);
        this.FP.setLayoutParams(layoutParams8);
        this.ot = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, zp(20.0f));
        layoutParams9.topMargin = zp(50.0f);
        this.ot.setEllipsize(truncateAt);
        this.ot.setSingleLine(true);
        this.ot.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_comment_num_backup"));
        this.ot.setTextColor(Color.parseColor("#ff93959a"));
        this.ot.setTextSize(14.0f);
        this.ot.setLayoutParams(layoutParams9);
        this.yRU = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, zp(16.0f));
        layoutParams10.gravity = 17;
        layoutParams10.topMargin = zp(12.0f);
        this.yRU.setLayoutParams(layoutParams10);
        this.ox = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, zp(40.0f));
        layoutParams11.leftMargin = zp(40.0f);
        layoutParams11.rightMargin = zp(40.0f);
        layoutParams11.topMargin = zp(30.0f);
        this.ox.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_reward_video_download_btn_bg"));
        this.ox.setGravity(17);
        this.ox.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_video_download_apk"));
        this.ox.setTextColor(Color.parseColor("#ffffff"));
        this.ox.setTextSize(15.0f);
        this.ox.setLayoutParams(layoutParams11);
        linearLayout.addView(pAGRelativeLayout);
        pAGRelativeLayout.addView(this.vwr);
        pAGRelativeLayout.addView(this.RCv);
        linearLayout.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.cz);
        pAGLinearLayout.addView(this.FP);
        pAGLinearLayout.addView(this.ot);
        pAGLinearLayout.addView(this.yRU);
        pAGLinearLayout.addView(this.ox);
        return linearLayout;
    }

    private View lMd(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.vwr = new RatioImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.vwr.setScaleType(ImageView.ScaleType.FIT_XY);
        this.vwr.setLayoutParams(layoutParams);
        pAGRelativeLayout.addView(this.vwr);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.RCv = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, zp(14.0f));
        int i9 = vDp.VuU;
        layoutParams2.addRule(2, i9);
        this.RCv.setPadding(zp(2.0f), 0, 0, 0);
        this.RCv.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(this.RCv);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        this.Lij = pAGRelativeLayout2;
        pAGRelativeLayout2.setId(i9);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, zp(90.0f));
        layoutParams3.addRule(12);
        this.Lij.setBackgroundColor(Color.parseColor("#E4FFFFFF"));
        this.Lij.setGravity(16);
        this.Lij.setLayoutParams(layoutParams3);
        pAGRelativeLayout.addView(this.Lij);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.pvr = tTRoundRectImageView;
        int i10 = vDp.Fm;
        tTRoundRectImageView.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(zp(69.0f), zp(69.0f));
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.pvr.setBackgroundColor(0);
        this.pvr.setLayoutParams(layoutParams4);
        this.Lij.addView(this.pvr);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams5.addRule(1, i10);
        int i11 = vDp.xg;
        layoutParams5.addRule(0, i11);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams5);
        this.Lij.addView(pAGLinearLayout);
        this.cz = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, zp(27.0f));
        layoutParams6.leftMargin = zp(14.0f);
        PAGTextView pAGTextView = this.cz;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        this.cz.setGravity(16);
        this.cz.setMaxWidth(zp(153.0f));
        this.cz.setSingleLine(true);
        this.cz.setTextColor(Color.parseColor("#ff000000"));
        this.cz.setTextSize(17.0f);
        this.cz.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.cz);
        this.FP = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.leftMargin = zp(14.0f);
        layoutParams7.topMargin = zp(5.0f);
        this.FP.setEllipsize(truncateAt);
        this.FP.setSingleLine(true);
        this.FP.setTextColor(Color.parseColor("#4A4A4A"));
        this.FP.setTextSize(15.0f);
        this.FP.setLayoutParams(layoutParams7);
        pAGLinearLayout.addView(this.FP);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.ox = pAGTextView2;
        pAGTextView2.setId(i11);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, zp(36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = zp(15.0f);
        this.ox.setMinWidth(zp(90.0f));
        this.ox.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_download_corner_bg"));
        this.ox.setGravity(17);
        this.ox.setSingleLine(true);
        this.ox.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_video_download_apk"));
        this.ox.setTextColor(Color.parseColor("#ffffff"));
        this.ox.setTextSize(17.0f);
        this.ox.setLayoutParams(layoutParams8);
        this.Lij.addView(this.ox);
        return pAGRelativeLayout;
    }

    private void zp(ImageView imageView) {
        List<rV> Rg;
        rV rVVar;
        woN won = this.lMd;
        if (won == null || (Rg = won.Rg()) == null || Rg.size() <= 0 || (rVVar = Rg.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.HWF.jU.zp(Rg.get(0)).KS(2).zp(com.bytedance.sdk.openadsdk.HWF.KS.zp(this.lMd, rVVar.zp(), imageView));
    }

    public void zp(View view) {
        if (view == null || this.zp.oB == null || this.lMd == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = this.vDp;
        if (zpVar == null) {
            TTBaseVideoActivity tTBaseVideoActivity = this.zp.oB;
            woN won = this.lMd;
            String str = this.Gzh;
            zpVar = new com.bytedance.sdk.openadsdk.core.lMd.zp(tTBaseVideoActivity, won, str, YhE.zp(str));
            zpVar.zp(COT(this.lMd));
            HashMap hashMap = new HashMap();
            if (cz.Bj(this.lMd)) {
                hashMap.put("click_scence", 3);
            } else {
                hashMap.put("click_scence", 1);
            }
            zpVar.zp(hashMap);
        }
        Activity activity = this.zp.oB;
        if (activity != null) {
            zpVar.zp(activity);
        }
        view.setOnTouchListener(zpVar);
        view.setOnClickListener(zpVar);
    }

    private View jU(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        int i9 = vDp.HaA;
        pAGRelativeLayout2.setId(i9);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zp(70.0f));
        layoutParams.topMargin = zp(45.0f);
        layoutParams.leftMargin = zp(20.0f);
        layoutParams.rightMargin = zp(20.0f);
        pAGRelativeLayout2.setLayoutParams(layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.pvr = tTRoundRectImageView;
        int i10 = vDp.Fm;
        tTRoundRectImageView.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(zp(65.0f), zp(65.0f));
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        this.pvr.setBackgroundColor(0);
        this.pvr.setLayoutParams(layoutParams2);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(1, i10);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams3);
        this.cz = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, zp(27.0f));
        layoutParams4.leftMargin = zp(14.0f);
        PAGTextView pAGTextView = this.cz;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        this.cz.setGravity(16);
        this.cz.setMaxWidth(zp(176.0f));
        this.cz.setSingleLine(true);
        this.cz.setTextColor(Color.parseColor("#ffffffff"));
        this.cz.setTextSize(17.0f);
        this.cz.setLayoutParams(layoutParams4);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = zp(10.0f);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams5);
        this.yRU = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = zp(14.0f);
        layoutParams6.gravity = 17;
        this.yRU.setLayoutParams(layoutParams6);
        this.ot = new PAGTextView(context);
        new LinearLayout.LayoutParams(-2, -2).leftMargin = zp(10.0f);
        this.ot.setEllipsize(truncateAt);
        this.ot.setMaxWidth(zp(170.0f));
        this.ot.setSingleLine(true);
        this.ot.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_comment_num"));
        this.ot.setTextColor(Color.parseColor("#ffffffff"));
        this.ot.setTextSize(13.0f);
        RatioImageView ratioImageView = new RatioImageView(context);
        this.vwr = ratioImageView;
        int i11 = vDp.zR;
        ratioImageView.setId(i11);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = zp(31.0f);
        layoutParams7.addRule(3, i9);
        this.vwr.setScaleType(ImageView.ScaleType.FIT_XY);
        this.vwr.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.RCv = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, zp(14.0f));
        layoutParams8.addRule(8, i11);
        layoutParams8.leftMargin = zp(5.0f);
        layoutParams8.bottomMargin = zp(5.0f);
        this.RCv.setGravity(17);
        this.RCv.setPadding(zp(2.0f), 0, 0, 0);
        this.RCv.setLayoutParams(layoutParams8);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.FP = pAGTextView2;
        int i12 = vDp.PI;
        pAGTextView2.setId(i12);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(3, i11);
        layoutParams9.leftMargin = zp(40.0f);
        layoutParams9.topMargin = zp(20.0f);
        layoutParams9.rightMargin = zp(40.0f);
        this.FP.setGravity(17);
        this.FP.setTextColor(Color.parseColor("#ffffff"));
        this.FP.setTextSize(17.0f);
        this.FP.setLayoutParams(layoutParams9);
        this.ox = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, zp(40.0f));
        layoutParams10.addRule(3, i12);
        layoutParams10.addRule(13);
        layoutParams10.leftMargin = zp(40.0f);
        layoutParams10.topMargin = zp(35.0f);
        layoutParams10.rightMargin = zp(40.0f);
        this.ox.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_reward_video_download_btn_bg"));
        this.ox.setGravity(17);
        this.ox.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_video_download_apk"));
        this.ox.setTextColor(Color.parseColor("#ffffff"));
        this.ox.setTextSize(15.0f);
        this.ox.setLayoutParams(layoutParams10);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        pAGRelativeLayout2.addView(this.pvr);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.cz);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.yRU);
        pAGLinearLayout2.addView(this.ot);
        pAGRelativeLayout.addView(this.vwr);
        pAGRelativeLayout.addView(this.RCv);
        pAGRelativeLayout.addView(this.FP);
        pAGRelativeLayout.addView(this.ox);
        return pAGRelativeLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(FrameLayout frameLayout) {
        cW();
        jU(this.lMd);
        frameLayout.addView(this.woN);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(RewardFullBaseLayout rewardFullBaseLayout) {
        if (dQp.lMd(this.lMd)) {
            KS.KS(rewardFullBaseLayout);
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
            zpVar.fs.zp((long) (zpVar.UPs.Gzh() * 1000.0d));
        } else {
            if (!dQp.KS(this.lMd) && !dQp.jU(this.lMd)) {
                super.zp(rewardFullBaseLayout);
                return;
            }
            KS.jU(rewardFullBaseLayout);
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.zp;
            zpVar2.fs.zp((long) (zpVar2.UPs.Gzh() * 1000.0d));
        }
    }

    private View zp(Context context, int i9) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RatioImageView ratioImageView = new RatioImageView(context);
        this.vwr = ratioImageView;
        int i10 = vDp.zR;
        ratioImageView.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        this.vwr.setScaleType(ImageView.ScaleType.FIT_XY);
        this.vwr.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        int i11 = vDp.HaA;
        pAGRelativeLayout2.setId(i11);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, zp(70.0f));
        if (i9 == 0) {
            layoutParams2.leftMargin = zp(20.0f);
        } else if (i9 == 2) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, zp(100.0f));
            layoutParams2.leftMargin = zp(25.0f);
        }
        layoutParams2.topMargin = zp(60.0f);
        layoutParams2.addRule(1, i10);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.pvr = tTRoundRectImageView;
        int i12 = vDp.Fm;
        tTRoundRectImageView.setId(i12);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(zp(69.0f), zp(69.0f));
        if (i9 == 2) {
            layoutParams3 = new RelativeLayout.LayoutParams(zp(80.0f), zp(80.0f));
        }
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.pvr.setBackgroundColor(0);
        this.pvr.setLayoutParams(layoutParams3);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        if (i9 == 2) {
            layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams4.addRule(1, i12);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        this.cz = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, zp(27.0f));
        if (i9 == 2) {
            layoutParams5 = new LinearLayout.LayoutParams(-2, zp(33.0f));
        }
        layoutParams5.leftMargin = zp(14.0f);
        PAGTextView pAGTextView = this.cz;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        this.cz.setGravity(16);
        this.cz.setMaxWidth(zp(176.0f));
        this.cz.setSingleLine(true);
        this.cz.setTextColor(Color.parseColor("#ffffffff"));
        this.cz.setTextSize(17.0f);
        this.cz.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = zp(14.0f);
        layoutParams6.topMargin = zp(10.0f);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        this.yRU = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, zp(14.0f));
        if (i9 == 2) {
            layoutParams7 = new LinearLayout.LayoutParams(-2, zp(20.0f));
        }
        layoutParams7.gravity = 17;
        this.yRU.setLayoutParams(layoutParams7);
        if (i9 == 2) {
            this.ot = new PAGTextView(context);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams8.leftMargin = zp(10.0f);
            this.ot.setEllipsize(truncateAt);
            this.ot.setMaxWidth(zp(170.0f));
            this.ot.setSingleLine(true);
            this.ot.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_comment_num"));
            this.ot.setTextColor(Color.parseColor("#ffffffff"));
            this.ot.setTextSize(15.0f);
            this.ot.setLayoutParams(layoutParams8);
        }
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.FP = pAGTextView2;
        int i13 = vDp.PI;
        pAGTextView2.setId(i13);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(3, i11);
        layoutParams9.topMargin = zp(30.0f);
        layoutParams9.addRule(1, i10);
        if (i9 == 0) {
            layoutParams9.leftMargin = zp(20.0f);
            this.FP.setGravity(17);
        } else if (i9 == 2) {
            layoutParams9.leftMargin = zp(20.0f);
        }
        this.FP.setTextColor(Color.parseColor("#ffffff"));
        this.FP.setTextSize(17.0f);
        this.FP.setLayoutParams(layoutParams9);
        this.ox = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, zp(40.0f));
        layoutParams10.addRule(3, i13);
        layoutParams10.addRule(14);
        layoutParams10.addRule(15);
        if (i9 == 0) {
            layoutParams10.leftMargin = zp(40.0f);
            layoutParams10.topMargin = zp(80.0f);
            layoutParams10.rightMargin = zp(40.0f);
        } else if (i9 == 2) {
            layoutParams10.leftMargin = zp(25.0f);
            layoutParams10.topMargin = zp(60.0f);
            layoutParams10.rightMargin = zp(25.0f);
        }
        layoutParams10.addRule(1, i10);
        this.ox.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_reward_video_download_btn_bg"));
        this.ox.setGravity(17);
        this.ox.setText(com.bytedance.sdk.component.utils.cz.zp(context, "tt_video_download_apk"));
        this.ox.setTextColor(Color.parseColor("#ffffff"));
        this.ox.setTextSize(15.0f);
        this.ox.setLayoutParams(layoutParams10);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.RCv = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, zp(14.0f));
        layoutParams11.addRule(9);
        layoutParams11.addRule(12);
        layoutParams11.leftMargin = zp(16.0f);
        layoutParams11.bottomMargin = zp(20.0f);
        this.RCv.setGravity(17);
        this.RCv.setPadding(zp(2.0f), 0, 0, 0);
        this.RCv.setLayoutParams(layoutParams11);
        pAGRelativeLayout.addView(this.vwr);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        pAGRelativeLayout2.addView(this.pvr);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.cz);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.yRU);
        if (i9 == 2) {
            pAGLinearLayout2.addView(this.ot);
        }
        pAGRelativeLayout.addView(this.FP);
        pAGRelativeLayout.addView(this.ox);
        pAGRelativeLayout.addView(this.RCv);
        return pAGRelativeLayout;
    }

    private int zp(float f9) {
        return WNy.lMd(this.zp.oB, f9);
    }
}
