package com.bytedance.sdk.openadsdk.core.tN;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.core.qsH.lG;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.core.qsH.qsH;
import com.bytedance.sdk.openadsdk.core.widget.GA;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.YoT;
import com.bytedance.sdk.openadsdk.core.widget.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.List;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.openadsdk.core.qsH.YFl {
    public static lG[] YFl = {new lG(1, 6.4f, 320, 50), new lG(4, 1.2f, 300, 250)};
    private String EH;
    private C0133YFl GA;
    private qO pDU;
    private PAGBannerAdWrapperListener rkt;

    public YFl(@NonNull Context context) {
        super(context);
        this.Sg = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.rkt = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.EH = str;
    }

    private void AlY() {
        TextView textView;
        Wwa wwa = this.tN;
        if (wwa != null) {
            int ZLB = wwa.ZLB();
            float tN = (this.qsH * 1.0f) / GS.tN(this.Sg, 250.0f);
            if (this.tN.BPI() == null) {
                C0133YFl vc2 = vc();
                this.GA = vc2;
                GA ga2 = vc2.YFl;
                ImageView imageView = vc2.tN;
                TextView textView2 = vc2.Sg;
                TextView textView3 = vc2.DSW;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (GS.tN(this.Sg, 45.0f) * tN);
                    layoutParams.height = (int) (GS.tN(this.Sg, 45.0f) * tN);
                }
                textView2.setTextSize(2, GS.Sg(this.Sg, textView2.getTextSize()) * tN);
                textView3.setTextSize(2, GS.Sg(this.Sg, textView3.getTextSize()) * tN);
                View view = this.GA.f10753vc;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.YFl.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.YFl(((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).Sg, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).tN, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).f10726vc);
                        }
                    });
                }
                if (ZLB == 33) {
                    ga2.setRatio(1.0f);
                } else {
                    ga2.setRatio(1.91f);
                }
                List<EH> VB = this.tN.VB();
                if (VB != null && !VB.isEmpty()) {
                    com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(VB.get(0), ga2, this.tN);
                    com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(VB.get(0).YFl(), this.GA.wN);
                }
                if (this.tN.dGX() == null || TextUtils.isEmpty(this.tN.dGX().YFl())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.tN.dGX().YFl(), this.tN.dGX().Sg(), this.tN.dGX().tN(), imageView, this.tN);
                }
                textView.setText(this.tN.Hjb());
                if (!TextUtils.isEmpty(this.tN.lL())) {
                    textView3.setText(this.tN.lL());
                } else {
                    textView3.setVisibility(8);
                }
                GS.YFl((TextView) null, this.GA.AlY, this.tN);
                YFl((View) ga2, true);
                ga2.setTag(520093762, Boolean.TRUE);
                YFl((View) this, true);
                YFl((View) textView3, true);
                return;
            }
            C0133YFl DSW = DSW();
            this.GA = DSW;
            TextView textView4 = DSW.Sg;
            TextView textView5 = DSW.DSW;
            YoT yoT = DSW.qsH;
            textView4.setTextSize(2, GS.Sg(this.Sg, textView4.getTextSize()) * tN);
            textView5.setTextSize(2, GS.Sg(this.Sg, textView5.getTextSize()) * tN);
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.tN.BPI().f23461f, this.GA.wN);
            View view2 = this.GA.f10753vc;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.YFl.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.YFl(((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).Sg, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).tN, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).f10726vc);
                    }
                });
            }
            if (ZLB == 15) {
                yoT.setRatio(0.5625f);
            } else if (ZLB == 5) {
                yoT.setRatio(1.7777778f);
            } else {
                yoT.setRatio(1.0f);
            }
            yoT.removeAllViews();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.GA.Sg.vc videoView = getVideoView();
            if (videoView != null) {
                qO qOVar = this.pDU;
                if (qOVar instanceof com.bytedance.sdk.openadsdk.core.qsH.Wwa) {
                    videoView.setVideoAdInteractionListener((com.bytedance.sdk.openadsdk.core.qsH.Wwa) qOVar);
                }
                yoT.addView(videoView, layoutParams2);
                videoView.setAdCreativeClickListener(new vc.YFl() { // from class: com.bytedance.sdk.openadsdk.core.tN.YFl.4
                    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc.YFl
                    public void YFl(View view3, int i10) {
                        if (YFl.this.rkt != null) {
                            YFl.this.rkt.onAdClicked();
                        }
                    }
                });
                qsH clickCreativeListener = this.pDU.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.YFl(videoView.getNativeVideoController());
                }
            }
            if (this.tN.dGX() != null && !TextUtils.isEmpty(this.tN.dGX().YFl())) {
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.tN.dGX().YFl(), this.tN.dGX().Sg(), this.tN.dGX().tN(), this.GA.tN, this.tN);
            }
            textView4.setText(this.tN.Hjb());
            GS.YFl((TextView) null, this.GA.AlY, this.tN);
            if (!TextUtils.isEmpty(this.tN.lL())) {
                textView5.setText(this.tN.lL());
            } else {
                textView5.setVisibility(8);
            }
            YFl((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            YFl((View) this, true);
            YFl((View) textView5, true);
            YFl(yoT);
        }
    }

    private C0133YFl DSW() {
        int tN = GS.tN(this.Sg, 8.0f);
        int tN2 = GS.tN(this.Sg, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.Sg);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(tN, tN, tN, tN2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.Sg);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        com.bytedance.sdk.openadsdk.core.widget.lG lGVar = new com.bytedance.sdk.openadsdk.core.widget.lG(this.Sg);
        lGVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(GS.tN(this.Sg, 52.0f), GS.tN(this.Sg, 52.0f));
        lGVar.setScaleType(ImageView.ScaleType.FIT_XY);
        lGVar.setLayoutParams(layoutParams3);
        linearLayout.addView(lGVar);
        LinearLayout linearLayout2 = new LinearLayout(this.Sg);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = tN;
        layoutParams4.rightMargin = tN;
        layoutParams4.setMarginStart(tN);
        layoutParams4.setMarginEnd(tN);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.Sg);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        rkt rktVar = new rkt(this.Sg);
        rktVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = GS.tN(this.Sg, 4.0f);
        linearLayout2.addView(rktVar, layoutParams6);
        TextView textView2 = new TextView(this.Sg);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(GS.tN(this.Sg, 76.0f), GS.tN(this.Sg, 36.0f));
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this.Sg, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.qO.YFl(this.Sg, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.Sg);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = tN2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        YoT yoT = new YoT(this.Sg);
        yoT.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        yoT.setLayoutParams(layoutParams9);
        frameLayout.addView(yoT);
        View pAGLogoView = new PAGLogoView(this.Sg);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(tN, tN, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams10);
        relativeLayout.addView(pAGLogoView);
        return new C0133YFl(lGVar, pAGLogoView, textView2, textView, yoT, rktVar, frameLayout);
    }

    private void Sg() {
        lG YFl2 = YFl(this.pDU.getExpectExpressWidth(), this.pDU.getExpectExpressHeight());
        if (this.pDU.getExpectExpressWidth() > 0 && this.pDU.getExpectExpressHeight() > 0) {
            this.DSW = GS.tN(this.Sg, this.pDU.getExpectExpressWidth());
            this.qsH = GS.tN(this.Sg, this.pDU.getExpectExpressHeight());
        } else {
            int tN = GS.tN(this.Sg);
            this.DSW = tN;
            this.qsH = Float.valueOf(tN / YFl2.Sg).intValue();
        }
        int i10 = this.DSW;
        if (i10 > 0 && i10 > GS.tN(this.Sg)) {
            this.DSW = GS.tN(this.Sg);
            this.qsH = Float.valueOf(this.qsH * (GS.tN(this.Sg) / this.DSW)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.DSW, this.qsH);
        }
        layoutParams.width = this.DSW;
        layoutParams.height = this.qsH;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (YFl2.YFl == 1) {
            tN();
        } else {
            AlY();
        }
    }

    private void tN() {
        float tN = (this.qsH * 1.0f) / GS.tN(this.Sg, 50.0f);
        float f10 = this.qsH * 1.0f;
        int i10 = this.DSW;
        if (f10 / i10 > 0.21875f) {
            tN = (i10 * 1.0f) / GS.tN(this.Sg, 320.0f);
        }
        C0133YFl wN = wN();
        this.GA = wN;
        ImageView imageView = wN.tN;
        TextView textView = wN.Sg;
        rkt rktVar = wN.AlY;
        TextView textView2 = wN.DSW;
        textView.setTextSize(2, GS.Sg(this.Sg, textView.getTextSize()) * tN);
        textView2.setTextSize(2, GS.Sg(this.Sg, textView2.getTextSize()) * tN);
        View view = this.GA.f10753vc;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.YFl.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.YFl(((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).Sg, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).tN, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).f10726vc);
                }
            });
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (GS.tN(this.Sg, 38.0f) * tN);
            layoutParams.height = (int) (GS.tN(this.Sg, 38.0f) * tN);
        }
        if (this.tN.dGX() != null && !TextUtils.isEmpty(this.tN.dGX().YFl())) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.tN.dGX().YFl(), this.tN.dGX().Sg(), this.tN.dGX().tN(), imageView, this.tN);
        }
        textView.setText(this.tN.Hjb());
        if (!TextUtils.isEmpty(this.tN.lL())) {
            textView2.setText(this.tN.lL());
        } else {
            textView2.setVisibility(8);
        }
        GS.YFl((TextView) null, rktVar, this.tN);
        YFl((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        YFl((View) this, true);
        YFl((View) textView2, true);
    }

    private C0133YFl vc() {
        int tN = GS.tN(this.Sg, 8.0f);
        int tN2 = GS.tN(this.Sg, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.Sg);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(tN, tN, tN, tN2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.Sg);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        com.bytedance.sdk.openadsdk.core.widget.lG lGVar = new com.bytedance.sdk.openadsdk.core.widget.lG(this.Sg);
        lGVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(GS.tN(this.Sg, 52.0f), GS.tN(this.Sg, 52.0f));
        lGVar.setScaleType(ImageView.ScaleType.FIT_XY);
        lGVar.setLayoutParams(layoutParams3);
        linearLayout.addView(lGVar);
        LinearLayout linearLayout2 = new LinearLayout(this.Sg);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = tN;
        layoutParams4.rightMargin = tN;
        layoutParams4.setMarginStart(tN);
        layoutParams4.setMarginEnd(tN);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.Sg);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        rkt rktVar = new rkt(this.Sg);
        rktVar.setId(520093735);
        linearLayout2.addView(rktVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.Sg);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(GS.tN(this.Sg, 76.0f), GS.tN(this.Sg, 36.0f));
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this.Sg, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.qO.YFl(this.Sg, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.Sg);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = tN2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        GA ga2 = new GA(this.Sg);
        ga2.setId(520093736);
        ga2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(ga2, layoutParams8);
        View pAGLogoView = new PAGLogoView(this.Sg);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(tN, tN, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams9);
        relativeLayout.addView(pAGLogoView);
        return new C0133YFl(lGVar, pAGLogoView, textView2, textView, ga2, rktVar, frameLayout);
    }

    private C0133YFl wN() {
        int tN = GS.tN(this.Sg, 38.0f);
        int tN2 = (int) (GS.tN(this.Sg, 25.0f) / 5.0d);
        int tN3 = GS.tN(this.Sg, 10.0f);
        int tN4 = GS.tN(this.Sg, 2.0f);
        int tN5 = GS.tN(this.Sg, 6.0f);
        int tN6 = GS.tN(this.Sg, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.Sg);
        addView(relativeLayout, -1, -1);
        com.bytedance.sdk.openadsdk.core.widget.lG lGVar = new com.bytedance.sdk.openadsdk.core.widget.lG(this.Sg);
        lGVar.setId(520093738);
        TextView textView = new TextView(this.Sg);
        textView.setId(520093730);
        rkt rktVar = new rkt(this.Sg);
        rktVar.setId(520093735);
        View pAGLogoView = new PAGLogoView(this.Sg);
        pAGLogoView.setId(520093739);
        TextView textView2 = new TextView(this.Sg);
        textView2.setId(520093703);
        C0133YFl c0133YFl = new C0133YFl(lGVar, textView, rktVar, pAGLogoView, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tN, tN);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(tN5);
        layoutParams.setMargins(tN5, 0, 0, 0);
        lGVar.setLayoutParams(layoutParams);
        lGVar.setBackgroundColor(-1);
        lGVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(lGVar);
        LinearLayout linearLayout = new LinearLayout(this.Sg);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, lGVar.getId());
        layoutParams2.setMarginStart(tN6);
        layoutParams2.setMarginEnd(tN6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, lGVar.getId());
        layoutParams2.setMargins(tN6, 0, tN6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = tN4;
        rktVar.setLayoutParams(layoutParams4);
        linearLayout.addView(rktVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        pAGLogoView.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoView);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(tN5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = tN5;
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this.Sg, 12));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(tN3, tN2, tN3, tN2);
        textView2.setText(com.bytedance.sdk.component.utils.qO.YFl(this.Sg, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return c0133YFl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.YFl
    public void YFl(View view, int i10, pDU pdu) {
        qO qOVar = this.pDU;
        if (qOVar != null) {
            qOVar.YFl(view, i10, pdu);
        }
    }

    public void YFl(Wwa wwa, qO qOVar, com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc vcVar) {
        setBackgroundColor(-1);
        this.tN = wwa;
        this.pDU = qOVar;
        this.f10726vc = "banner_ad";
        qOVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        Sg();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.tN.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0133YFl {
        rkt AlY;
        TextView DSW;
        public TextView Sg;
        public GA YFl;
        private YoT qsH;
        ImageView tN;

        /* renamed from: vc, reason: collision with root package name */
        View f10753vc;
        FrameLayout wN;

        public C0133YFl(ImageView imageView, TextView textView, rkt rktVar, View view, TextView textView2) {
            this.tN = imageView;
            this.Sg = textView;
            this.AlY = rktVar;
            this.f10753vc = view;
            this.DSW = textView2;
        }

        public C0133YFl(ImageView imageView, View view, TextView textView, TextView textView2, GA ga2, rkt rktVar, FrameLayout frameLayout) {
            this.tN = imageView;
            this.f10753vc = view;
            this.DSW = textView;
            this.Sg = textView2;
            this.YFl = ga2;
            this.AlY = rktVar;
            this.wN = frameLayout;
        }

        public C0133YFl(ImageView imageView, View view, TextView textView, TextView textView2, YoT yoT, rkt rktVar, FrameLayout frameLayout) {
            this.tN = imageView;
            this.f10753vc = view;
            this.DSW = textView;
            this.Sg = textView2;
            this.qsH = yoT;
            this.AlY = rktVar;
            this.wN = frameLayout;
        }
    }

    public static lG YFl(int i10, int i11) {
        try {
            return ((double) i11) >= Math.floor((((double) i10) * 450.0d) / 600.0d) ? YFl[1] : YFl[0];
        } catch (Throwable unused) {
            return YFl[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.YFl
    public void YFl() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.wN;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.tN.tN tNVar = this.AlY;
        if (tNVar != null) {
            tNVar.YFl();
        } else {
            TTDelegateActivity.YFl(this.tN, this.EH);
        }
    }
}
