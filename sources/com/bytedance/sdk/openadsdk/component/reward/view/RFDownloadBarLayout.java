package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.lMd.QR;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.KS;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RFDownloadBarLayout extends PAGRelativeLayout {
    private TextView COT;
    private boolean HWF;
    private TextView KS;
    private com.bytedance.sdk.openadsdk.component.reward.zp.zp QR;
    private TTRoundRectImageView jU;
    private TextView ku;
    private TextView lMd;
    private TTRatingBar2 zp;

    public RFDownloadBarLayout(@NonNull Context context) {
        super(context);
        setVisibility(8);
    }

    private void COT() {
        Context context = getContext();
        TTRoundRectImageView zp = zp(context);
        this.jU = zp;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) zp.getLayoutParams();
        int lMd = WNy.lMd(context, 52.0f);
        layoutParams.height = lMd;
        layoutParams.width = lMd;
        addView(this.jU);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(17);
        int i9 = vDp.HWF;
        pAGLinearLayout.setId(i9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(WNy.lMd(context, 100.0f), WNy.lMd(context, 45.0f));
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        layoutParams2.rightMargin = WNy.lMd(context, 15.0f);
        addView(pAGLinearLayout, layoutParams2);
        this.KS = jU(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, WNy.lMd(context, 41.0f));
        layoutParams3.bottomMargin = WNy.lMd(context, 3.0f);
        pAGLinearLayout.addView(this.KS, layoutParams3);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(0, i9);
        layoutParams4.addRule(1, vDp.lMd);
        addView(pAGLinearLayout2, layoutParams4);
        TextView lMd2 = lMd(context);
        this.COT = lMd2;
        lMd2.setTextColor(Color.parseColor("#222222"));
        this.COT.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.COT.getLayoutParams();
        layoutParams5.width = -1;
        layoutParams5.height = WNy.lMd(context, 22.0f);
        layoutParams5.leftMargin = WNy.lMd(context, 10.0f);
        pAGLinearLayout2.addView(this.COT);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.ku = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.ku.setSingleLine(true);
        this.ku.setTextColor(Color.parseColor("#4A4A4A"));
        this.ku.setTextSize(2, 14.0f);
        this.ku.setId(vDp.QR);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, WNy.lMd(context, 16.0f));
        layoutParams6.leftMargin = WNy.lMd(context, 10.0f);
        layoutParams6.topMargin = WNy.lMd(context, 5.0f);
        pAGLinearLayout2.addView(this.ku, layoutParams6);
    }

    private void HWF() {
        Context context = getContext();
        TTRoundRectImageView zp = zp(context);
        this.jU = zp;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) zp.getLayoutParams();
        int lMd = WNy.lMd(context, 52.0f);
        layoutParams.height = lMd;
        layoutParams.width = lMd;
        addView(this.jU);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        int i9 = vDp.HWF;
        pAGLinearLayout.setId(i9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(WNy.lMd(context, 76.0f), WNy.lMd(context, 45.0f));
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        layoutParams2.rightMargin = WNy.lMd(context, 15.0f);
        int[] iArr = {Color.parseColor("#0070FF")};
        com.bytedance.sdk.openadsdk.core.widget.KS.zp(pAGLinearLayout, new KS.zp().zp(iArr[0]).lMd(Color.parseColor("#80000000")).zp(iArr).KS(WNy.lMd(context, 17.0f)).jU(0).COT(WNy.lMd(context, 3.0f)));
        addView(pAGLinearLayout, layoutParams2);
        this.KS = jU(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.bottomMargin = WNy.lMd(context, 3.0f);
        pAGLinearLayout.addView(this.KS, layoutParams3);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(16, i9);
        layoutParams4.addRule(0, i9);
        int i10 = vDp.lMd;
        layoutParams4.addRule(1, i10);
        layoutParams4.addRule(17, i10);
        addView(pAGLinearLayout2, layoutParams4);
        TextView lMd2 = lMd(context);
        this.COT = lMd2;
        lMd2.setTextColor(Color.parseColor("#222222"));
        this.COT.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.COT.getLayoutParams();
        layoutParams5.width = -1;
        layoutParams5.height = WNy.lMd(context, 22.0f);
        layoutParams5.leftMargin = WNy.lMd(context, 10.0f);
        pAGLinearLayout2.addView(this.COT);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setGravity(16);
        pAGLinearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = WNy.lMd(context, 14.0f);
        layoutParams6.topMargin = WNy.lMd(context, 5.0f);
        pAGLinearLayout2.addView(pAGLinearLayout3, layoutParams6);
        TTRatingBar2 zp2 = zp(context, -1);
        this.zp = zp2;
        ((LinearLayout.LayoutParams) zp2.getLayoutParams()).height = WNy.lMd(context, 12.0f);
        pAGLinearLayout3.addView(this.zp);
        TextView KS = KS(context);
        this.lMd = KS;
        KS.setTextColor(Color.parseColor("#4A4A4A"));
        this.lMd.setTextSize(2, 14.0f);
        this.lMd.setMaxWidth(WNy.lMd(context, 83.0f));
        ((LinearLayout.LayoutParams) this.lMd.getLayoutParams()).height = WNy.lMd(context, 20.0f);
        pAGLinearLayout3.addView(this.lMd);
    }

    private void QR() {
        Context context = getContext();
        TTRoundRectImageView zp = zp(context);
        this.jU = zp;
        addView(zp);
        TextView jU = jU(context);
        this.KS = jU;
        jU.setBackground(ku.zp(context, "tt_download_corner_bg"));
        this.KS.setMaxWidth(WNy.lMd(context, 105.0f));
        this.KS.setText(cz.lMd(context, "tt_video_download_apk"));
        this.KS.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, WNy.lMd(context, 36.0f));
        layoutParams.addRule(21);
        layoutParams.addRule(11);
        layoutParams.addRule(15);
        layoutParams.rightMargin = WNy.lMd(context, 15.0f);
        addView(this.KS, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(0, this.KS.getId());
        layoutParams2.addRule(16, this.KS.getId());
        layoutParams2.addRule(1, this.jU.getId());
        layoutParams2.addRule(17, this.jU.getId());
        addView(pAGLinearLayout, layoutParams2);
        TextView lMd = lMd(context);
        this.COT = lMd;
        lMd.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        pAGLinearLayout.addView(this.COT);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = WNy.lMd(context, 14.0f);
        layoutParams3.topMargin = WNy.lMd(context, 5.0f);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams3);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        TTRatingBar2 zp2 = zp(context, 17);
        this.zp = zp2;
        pAGLinearLayout2.addView(zp2);
        TextView KS = KS(context);
        this.lMd = KS;
        KS.setTextColor(Color.parseColor("#4A4A4A"));
        this.lMd.setTextSize(2, 11.0f);
        pAGLinearLayout2.addView(this.lMd);
    }

    private String getCnOrEnBtnText() {
        if (this.QR.zp.oKZ() != 4) {
            return "View";
        }
        return "Install";
    }

    private static TextView jU(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setGravity(17);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setLines(1);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        pAGTextView.setBackground(ku.zp(context, "tt_reward_video_download_btn_bg"));
        pAGTextView.setId(520093705);
        pAGTextView.setPadding(WNy.lMd(context, 10.0f), 0, WNy.lMd(context, 10.0f), 0);
        pAGTextView.setText(cz.lMd(context, "tt_video_mobile_go_detail"));
        return pAGTextView;
    }

    public String getButtonTextForNewStyleBar() {
        boolean z8;
        String oB;
        String QR = YhE.QR(this.QR.fgJ);
        if (QR == null) {
            QR = "";
        }
        try {
            z8 = QR.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            z8 = false;
        }
        if (TextUtils.isEmpty(this.QR.zp.oB())) {
            oB = this.QR.zp.oKZ() != 4 ? "View" : "Install";
        } else {
            oB = this.QR.zp.oB();
            if (oB != null && YhE.HWF(oB) && oB.length() > 2) {
                if (z8) {
                    oB = getCnOrEnBtnText();
                }
            } else if (oB != null && !YhE.HWF(oB) && oB.length() > 7 && z8) {
                oB = getCnOrEnBtnText();
            }
        }
        if (z8 && !YhE.HWF(oB)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.KS.getLayoutParams();
            layoutParams.bottomMargin = WNy.lMd(this.QR.fgJ, 4.0f);
            this.KS.setLayoutParams(layoutParams);
        }
        return oB;
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0 && !this.HWF) {
            KS();
        }
    }

    private static TextView KS(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setSingleLine(true);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 13.0f);
        pAGTextView.setId(vDp.jU);
        pAGTextView.setMaxWidth(WNy.lMd(context, 72.0f));
        pAGTextView.setText(cz.lMd(context, "tt_comment_num"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = WNy.lMd(context, 10.0f);
        pAGTextView.setLayoutParams(layoutParams);
        return pAGTextView;
    }

    private static TextView lMd(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(16);
        pAGTextView.setSingleLine(true);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 17.0f);
        pAGTextView.setId(vDp.KS);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 27.0f));
        layoutParams.leftMargin = WNy.lMd(context, 14.0f);
        pAGTextView.setLayoutParams(layoutParams);
        return pAGTextView;
    }

    private static TTRoundRectImageView zp(Context context) {
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setBackgroundColor(0);
        tTRoundRectImageView.setId(vDp.lMd);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(WNy.lMd(context, 69.0f), WNy.lMd(context, 69.0f));
        layoutParams.addRule(20);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        tTRoundRectImageView.setLayoutParams(layoutParams);
        return tTRoundRectImageView;
    }

    private void jU() {
        Context context = getContext();
        TTRoundRectImageView zp = zp(context);
        this.jU = zp;
        addView(zp);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        int i9 = vDp.lMd;
        layoutParams.addRule(1, i9);
        layoutParams.addRule(17, i9);
        addView(pAGLinearLayout, layoutParams);
        TextView lMd = lMd(context);
        this.COT = lMd;
        lMd.setMaxWidth(WNy.lMd(context, 176.0f));
        pAGLinearLayout.addView(this.COT);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = WNy.lMd(context, 14.0f);
        layoutParams2.topMargin = WNy.lMd(context, 10.0f);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams2);
        TTRatingBar2 zp2 = zp(context, 17);
        this.zp = zp2;
        pAGLinearLayout2.addView(zp2);
        TextView KS = KS(context);
        this.lMd = KS;
        pAGLinearLayout2.addView(KS);
    }

    private static TTRatingBar2 zp(Context context, int i9) {
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        tTRatingBar2.setId(vDp.COT);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 14.0f));
        layoutParams.gravity = i9;
        tTRatingBar2.setLayoutParams(layoutParams);
        return tTRatingBar2;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void lMd() {
        com.bytedance.sdk.openadsdk.core.lMd.COT COT = this.QR.oKZ.COT();
        final View.OnClickListener jU = this.QR.oKZ.jU();
        final woN won = this.QR.zp;
        if (won.irS() == null) {
            return;
        }
        if (won.Gzh() != 5 && this.KS != null) {
            if (won.irS().COT) {
                this.KS.setOnClickListener(COT);
                this.KS.setOnTouchListener(COT);
            } else {
                this.KS.setOnClickListener(jU);
            }
        }
        if (won.Gzh() == 1) {
            if (won.irS().zp) {
                WNy.zp((View) this, (View.OnClickListener) COT, "TTBaseVideoActivity#mRlDownloadBar");
                WNy.zp((View) this, (View.OnTouchListener) COT, "TTBaseVideoActivity#mRlDownloadBar");
                this.COT.setOnClickListener(COT);
                this.COT.setOnTouchListener(COT);
                this.lMd.setOnClickListener(COT);
                this.lMd.setOnTouchListener(COT);
                this.zp.setOnClickListener(COT);
                this.zp.setOnTouchListener(COT);
                this.jU.setOnClickListener(COT);
                this.jU.setOnTouchListener(COT);
                return;
            }
            WNy.zp(this, jU, "TTBaseVideoActivity#mRlDownloadBar");
            this.COT.setOnClickListener(jU);
            this.lMd.setOnClickListener(jU);
            this.zp.setOnClickListener(jU);
            this.jU.setOnClickListener(jU);
            return;
        }
        if (won.Gzh() == 5) {
            String str = "VAST_ICON";
            if (won.irS().COT) {
                QR qr = new QR("VAST_ACTION_BUTTON", won.xg(), COT) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.4
                };
                QR qr2 = new QR(str, won.xg(), COT) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.5
                };
                TextView textView = this.KS;
                if (textView != null) {
                    textView.setOnClickListener(qr);
                    this.KS.setOnTouchListener(qr);
                }
                TTRoundRectImageView tTRoundRectImageView = this.jU;
                if (tTRoundRectImageView != null) {
                    tTRoundRectImageView.setOnClickListener(qr2);
                    this.jU.setOnTouchListener(qr2);
                }
                TextView textView2 = this.COT;
                if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                    this.COT.setOnClickListener(qr);
                    this.COT.setOnTouchListener(qr);
                }
                TextView textView3 = this.ku;
                if (textView3 == null || TextUtils.isEmpty(textView3.getText())) {
                    return;
                }
                this.ku.setOnClickListener(qr);
                this.ku.setOnTouchListener(qr);
                return;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = jU;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view != null && "VAST_ICON".equals(view.getTag(570425345))) {
                        if (won.xg() != null && won.xg().lMd() != null) {
                            won.xg().lMd().zp(RFDownloadBarLayout.this.QR.UPs.QR());
                            return;
                        }
                        return;
                    }
                    if (won.xg() != null) {
                        won.xg().zp().QR(RFDownloadBarLayout.this.QR.UPs.QR());
                    }
                }
            };
            TextView textView4 = this.KS;
            if (textView4 != null) {
                textView4.setOnClickListener(onClickListener);
            }
            TextView textView5 = this.COT;
            if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                this.COT.setOnClickListener(onClickListener);
            }
            TextView textView6 = this.ku;
            if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                this.ku.setOnClickListener(onClickListener);
            }
            TTRoundRectImageView tTRoundRectImageView2 = this.jU;
            if (tTRoundRectImageView2 != null) {
                tTRoundRectImageView2.setTag(570425345, "VAST_ICON");
                this.jU.setOnClickListener(jU);
                return;
            }
            return;
        }
        if (won.irS().KS) {
            WNy.zp((View) this, (View.OnClickListener) COT, "TTBaseVideoActivity#mRlDownloadBar");
            WNy.zp((View) this, (View.OnTouchListener) COT, "TTBaseVideoActivity#mRlDownloadBar");
        } else {
            WNy.zp(this, jU, "TTBaseVideoActivity#mRlDownloadBar");
        }
    }

    private void KS() {
        TextView textView;
        this.HWF = true;
        Context context = getContext();
        int Gzh = this.QR.zp.Gzh();
        if (Gzh == 1) {
            jU();
        } else if (Gzh == 3) {
            HWF();
        } else if (Gzh != 5) {
            QR();
        } else {
            COT();
        }
        if (this.KS == null) {
            this.KS = (TextView) this.QR.oB.findViewById(520093705);
        }
        final woN won = this.QR.zp;
        TextView textView2 = this.KS;
        if (textView2 != null) {
            textView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                    int width = ((ViewGroup) RFDownloadBarLayout.this.KS.getParent()).getWidth();
                    if (width > 0) {
                        RFDownloadBarLayout.this.KS.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (won.Fm()) {
                if (won.xg() != null && TextUtils.isEmpty(won.xg().HWF())) {
                    WNy.zp((View) this.KS, 8);
                }
            } else {
                this.KS.setText(won.Gzh() == 3 ? getButtonTextForNewStyleBar() : won.oB());
            }
        }
        if (this.jU != null && won.BO() != null && !TextUtils.isEmpty(won.BO().zp())) {
            final String zp = won.BO().zp();
            if (won.Fm()) {
                com.bytedance.sdk.openadsdk.HWF.jU.zp(won.BO()).KS(2).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, won.BO().zp(), new KVG<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.2
                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(Bj<Bitmap> bj) {
                        if (bj == null || bj.lMd() == null) {
                            return;
                        }
                        if (RFDownloadBarLayout.this.jU != null) {
                            RFDownloadBarLayout.this.jU.setImageBitmap(bj.lMd());
                        }
                        com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, RFDownloadBarLayout.this.QR.QR, "load_vast_icon_success", (JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(int i9, String str, @Nullable Throwable th) {
                        RFDownloadBarLayout.this.zp(i9, str, zp);
                    }
                }));
                if (won.xg() != null && won.xg().lMd() != null) {
                    won.xg().lMd().lMd(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(won.BO(), this.jU, won);
            }
        }
        if (this.COT != null) {
            if (this.QR.dT == 1 && won.Vjb() != null && !TextUtils.isEmpty(won.Vjb().lMd())) {
                this.COT.setText(won.Vjb().lMd());
            } else {
                this.COT.setText(won.rCC());
            }
        }
        TextView textView3 = this.lMd;
        if (textView3 != null) {
            WNy.zp(textView3, won, this.QR.fgJ, "tt_comment_num");
        }
        if (this.QR.dT == 1) {
            TextView textView4 = this.COT;
            if (textView4 != null) {
                textView4.setMaxWidth(WNy.lMd(context, 153.0f));
            }
        } else {
            TextView textView5 = this.COT;
            if (textView5 != null) {
                textView5.setMaxWidth(WNy.lMd(context, 404.0f));
            }
        }
        TTRatingBar2 tTRatingBar2 = this.zp;
        if (tTRatingBar2 != null) {
            WNy.zp((TextView) null, tTRatingBar2, won);
        }
        if (won.Fm() && (textView = this.ku) != null) {
            textView.setText(won.MBR());
        }
        if (this.QR.dT == 2 && won.Gzh() == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.KS.getLayoutParams();
            layoutParams.height = WNy.lMd(this.QR.fgJ, 55.0f);
            layoutParams.topMargin = WNy.lMd(this.QR.fgJ, 20.0f);
            this.KS.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = WNy.lMd(this.QR.fgJ, 12.0f);
            setLayoutParams(layoutParams2);
        }
        lMd();
    }

    public void zp() {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
    }

    public void zp(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.QR = zpVar;
        if (zpVar.zp.Gzh() == 1) {
            KS();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final int i9, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.lMd.KS.zp(new com.bytedance.sdk.component.ku.ku("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i9);
                    jSONObject.put("description", i9 + ":" + str);
                    jSONObject.put("url", str2);
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(RFDownloadBarLayout.this.QR.zp, RFDownloadBarLayout.this.QR.QR, "load_vast_icon_fail", jSONObject);
            }
        });
    }
}
