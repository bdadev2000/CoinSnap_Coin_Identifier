package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.HWF;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.tG;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class BannerExpressBackupView extends BackupView {
    private String KVG;
    private NativeExpressView dQp;
    private zp rV;
    private PAGBannerAdWrapperListener woN;
    public static tG[] zp = {new tG(1, 6.4f, 320, 50), new tG(4, 1.2f, 300, 250)};
    private static final AtomicInteger tG = new AtomicInteger(1);

    public BannerExpressBackupView(@NonNull Context context) {
        super(context);
        this.lMd = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.woN = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.KVG = str;
    }

    private zp COT() {
        int lMd = WNy.lMd(this.lMd, 45.0f);
        int lMd2 = WNy.lMd(this.lMd, 25.0f);
        int i9 = (int) (lMd2 / 5.0d);
        int lMd3 = WNy.lMd(this.lMd, 10.0f);
        int lMd4 = WNy.lMd(this.lMd, 2.0f);
        int lMd5 = WNy.lMd(this.lMd, 3.0f);
        WNy.lMd(this.lMd, 11.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.lMd);
        addView(relativeLayout, -1, -1);
        ImageView imageView = new ImageView(this.lMd);
        imageView.setId(520093738);
        TextView textView = new TextView(this.lMd);
        textView.setId(520093730);
        TextView textView2 = new TextView(this.lMd);
        textView2.setId(520093731);
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(this.lMd, null);
        tTRatingBar2.setId(520093735);
        View pAGLogoView = new PAGLogoView(this.lMd);
        pAGLogoView.setId(520093739);
        TextView textView3 = new TextView(this.lMd);
        textView3.setId(520093703);
        ImageView imageView2 = new ImageView(this.lMd);
        imageView2.setId(520093697);
        zp zpVar = new zp(imageView, textView, textView2, tTRatingBar2, pAGLogoView, textView3, imageView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(lMd, lMd);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundColor(cz.ku(this.lMd, "tt_white"));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        relativeLayout.addView(imageView);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, lMd2);
        layoutParams2.setMarginStart(lMd3);
        layoutParams2.addRule(16, textView3.getId());
        layoutParams2.addRule(17, imageView.getId());
        textView.setTextDirection(5);
        layoutParams2.leftMargin = lMd3;
        layoutParams2.addRule(0, textView3.getId());
        layoutParams2.addRule(1, imageView.getId());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, lMd2);
        layoutParams3.addRule(3, textView.getId());
        layoutParams3.setMarginStart(lMd3);
        layoutParams3.addRule(17, imageView.getId());
        layoutParams3.leftMargin = lMd3;
        layoutParams3.topMargin = lMd4;
        layoutParams3.addRule(1, imageView.getId());
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setTextColor(Color.parseColor("#FF333333"));
        textView2.setTextSize(12.0f);
        textView2.setTypeface(Typeface.defaultFromStyle(1));
        textView2.setLayoutParams(layoutParams3);
        relativeLayout.addView(textView2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = lMd4;
        layoutParams4.addRule(3, textView.getId());
        layoutParams4.addRule(6, textView2.getId());
        layoutParams4.setMarginStart(lMd4);
        layoutParams4.addRule(17, textView2.getId());
        layoutParams4.addRule(16, textView3.getId());
        layoutParams4.leftMargin = lMd4;
        layoutParams4.addRule(1, textView2.getId());
        layoutParams4.addRule(0, textView3.getId());
        tTRatingBar2.setLayoutParams(layoutParams4);
        relativeLayout.addView(tTRatingBar2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(21);
        layoutParams5.setMarginEnd(lMd5);
        layoutParams5.addRule(11);
        layoutParams5.addRule(12);
        layoutParams5.topMargin = lMd5;
        layoutParams5.rightMargin = lMd5;
        pAGLogoView.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoView);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(lMd2);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = lMd2;
        textView3.setBackground(ku.zp(this.lMd, "tt_backup_btn_1"));
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setMaxLines(1);
        textView3.setPadding(lMd3, i9, lMd3, i9);
        textView3.setText(cz.zp(this.lMd, "tt_video_download_apk"));
        textView3.setTextColor(Color.parseColor("#f0f0f0"));
        textView3.setTextSize(10.0f);
        textView3.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView3);
        int i10 = lMd5 * 5;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams7.addRule(21);
        layoutParams7.setMarginEnd(lMd5);
        layoutParams7.addRule(11);
        layoutParams7.topMargin = lMd5;
        layoutParams7.rightMargin = lMd5;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(cz.jU(this.lMd, "tt_dislike_icon"));
        imageView2.setLayoutParams(layoutParams7);
        relativeLayout.addView(imageView2);
        return zpVar;
    }

    private zp HWF() {
        float lMd = WNy.lMd(this.lMd, 5.0f);
        float lMd2 = WNy.lMd(this.lMd, 7.0f);
        float lMd3 = WNy.lMd(this.lMd, 8.0f);
        float lMd4 = WNy.lMd(this.lMd, 18.0f);
        float lMd5 = WNy.lMd(this.lMd, 15.0f);
        float lMd6 = WNy.lMd(this.lMd, 45.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.lMd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int i9 = (int) lMd3;
        relativeLayout.setPadding(i9, i9, i9, i9);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        TextView textView = new TextView(this.lMd);
        textView.setId(520093730);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -1;
        layoutParams2.setMarginEnd((int) lMd4);
        textView.setTextDirection(5);
        int i10 = (int) lMd4;
        layoutParams2.rightMargin = i10;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(8388611);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        TextView textView2 = new TextView(this.lMd);
        textView2.setId(520093733);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -1;
        layoutParams3.addRule(3, textView.getId());
        layoutParams3.topMargin = (int) (lMd3 / 2.0f);
        layoutParams3.setMarginEnd(i10);
        textView2.setTextDirection(5);
        layoutParams3.rightMargin = i10;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(8388611);
        textView2.setMaxLines(2);
        textView2.setTextColor(Color.parseColor("#FFAEAEAE"));
        textView2.setTextSize(12.0f);
        textView2.setLayoutParams(layoutParams3);
        relativeLayout.addView(textView2);
        ImageView imageView = new ImageView(this.lMd);
        imageView.setId(520093697);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int i11 = (int) lMd5;
        layoutParams4.width = i11;
        layoutParams4.height = i11;
        layoutParams4.addRule(21);
        layoutParams4.addRule(11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(cz.jU(this.lMd, "tt_titlebar_close_press_for_dark"));
        imageView.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView);
        LinearLayout linearLayout = new LinearLayout(this.lMd);
        linearLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(3, textView2.getId());
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        relativeLayout.addView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(this.lMd);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -1);
        layoutParams6.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams6);
        linearLayout.addView(frameLayout);
        RatioImageView ratioImageView = new RatioImageView(this.lMd);
        ratioImageView.setId(520093736);
        ratioImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        frameLayout.addView(ratioImageView, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(this.lMd);
        linearLayout2.setId(520093737);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1);
        layoutParams7.weight = 1.0f;
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams7);
        linearLayout.addView(linearLayout2);
        ImageView imageView2 = new ImageView(this.lMd);
        imageView2.setId(520093738);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        int i12 = (int) lMd6;
        layoutParams8.width = i12;
        layoutParams8.height = i12;
        imageView2.setScaleType(scaleType);
        imageView2.setLayoutParams(layoutParams8);
        linearLayout2.addView(imageView2);
        TextView textView3 = new TextView(this.lMd);
        textView3.setId(520093730);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.topMargin = (int) lMd2;
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setMaxLines(1);
        textView3.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView3.setTextSize(12.0f);
        textView3.setLayoutParams(layoutParams9);
        linearLayout2.addView(textView3);
        TextView textView4 = new TextView(this.lMd);
        textView4.setId(520093703);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams10.topMargin = (int) (lMd3 * 2.0f);
        textView4.setBackground(ku.zp(this.lMd, "tt_backup_btn_1"));
        textView4.setEllipsize(truncateAt);
        textView4.setMaxLines(1);
        int i13 = (int) (lMd * 2.0f);
        int i14 = (int) lMd;
        textView4.setPadding(i13, i14, i13, i14);
        textView4.setText(cz.zp(this.lMd, "tt_video_download_apk"));
        textView4.setTextColor(cz.ku(this.lMd, "tt_white"));
        textView4.setTextSize(10.0f);
        textView4.setLayoutParams(layoutParams10);
        linearLayout2.addView(textView4);
        View pAGLogoView = new PAGLogoView(this.lMd);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(12);
        pAGLogoView.setLayoutParams(layoutParams11);
        relativeLayout.addView(pAGLogoView);
        return new zp(imageView2, textView, pAGLogoView, textView4, imageView, textView3, textView2, ratioImageView);
    }

    private void KS() {
        float lMd = (this.ku * 1.0f) / WNy.lMd(this.lMd, 50.0f);
        float f9 = this.ku * 1.0f;
        int i9 = this.QR;
        if (f9 / i9 > 0.21875f) {
            lMd = (i9 * 1.0f) / WNy.lMd(this.lMd, 320.0f);
        }
        zp COT = COT();
        this.rV = COT;
        ImageView imageView = COT.dT;
        ImageView imageView2 = COT.jU;
        TextView textView = COT.COT;
        TextView textView2 = COT.HWF;
        TTRatingBar2 tTRatingBar2 = COT.QR;
        TextView textView3 = COT.YW;
        textView.setTextSize(2, WNy.zp(this.lMd, textView.getTextSize()) * lMd);
        textView2.setTextSize(2, WNy.zp(this.lMd, textView2.getTextSize()) * lMd);
        textView3.setTextSize(2, WNy.zp(this.lMd, textView3.getTextSize()) * lMd);
        View view = this.rV.ku;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.zp(((BackupView) BannerExpressBackupView.this).lMd, ((BackupView) BannerExpressBackupView.this).KS, ((BackupView) BannerExpressBackupView.this).HWF);
                }
            });
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BannerExpressBackupView.this.zp();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (WNy.lMd(this.lMd, 45.0f) * lMd);
            layoutParams.height = (int) (WNy.lMd(this.lMd, 45.0f) * lMd);
        }
        if (this.KS.BO() != null && !TextUtils.isEmpty(this.KS.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.KS.BO().zp(), this.KS.BO().lMd(), this.KS.BO().KS(), imageView2, this.KS);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.KS.oB())) {
            textView3.setText(this.KS.oB());
        } else {
            textView3.setVisibility(8);
        }
        WNy.zp(textView2, tTRatingBar2, this.KS);
        zp((View) imageView2, true);
        imageView2.setTag(520093762, Boolean.TRUE);
        zp((View) this, true);
        zp((View) textView3, true);
    }

    private zp QR() {
        float lMd = WNy.lMd(this.lMd, 4.0f);
        float lMd2 = WNy.lMd(this.lMd, 5.0f);
        float lMd3 = WNy.lMd(this.lMd, 8.0f);
        float lMd4 = WNy.lMd(this.lMd, 15.0f);
        float lMd5 = WNy.lMd(this.lMd, 18.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.lMd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int i9 = (int) lMd3;
        relativeLayout.setPadding(i9, i9, i9, i9);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        TextView textView = new TextView(this.lMd);
        textView.setId(520093730);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.width = -1;
        layoutParams2.setMarginEnd((int) lMd5);
        textView.setTextDirection(5);
        layoutParams2.rightMargin = (int) lMd5;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(8388611);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        ImageView imageView = new ImageView(this.lMd);
        imageView.setId(520093697);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        int i10 = (int) lMd4;
        layoutParams3.width = i10;
        layoutParams3.height = i10;
        layoutParams3.addRule(21);
        layoutParams3.addRule(11);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(cz.jU(this.lMd, "tt_titlebar_close_press_for_dark"));
        imageView.setLayoutParams(layoutParams3);
        relativeLayout.addView(imageView);
        TextView textView2 = new TextView(this.lMd);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        textView2.setId(520093703);
        layoutParams4.addRule(11);
        layoutParams4.addRule(21);
        layoutParams4.addRule(12);
        layoutParams4.topMargin = i9;
        textView2.setBackground(ku.zp(this.lMd, "tt_backup_btn_1"));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        int i11 = (int) (2.0f * lMd2);
        int i12 = (int) lMd2;
        textView2.setPadding(i11, i12, i11, i12);
        textView2.setText(cz.zp(this.lMd, "tt_video_download_apk"));
        textView2.setTextColor(cz.ku(this.lMd, "tt_white"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(textView2);
        TextView textView3 = new TextView(this.lMd);
        textView3.setId(520093733);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(4, textView2.getId());
        layoutParams5.addRule(20);
        layoutParams5.addRule(16, textView2.getId());
        textView3.setTextDirection(5);
        layoutParams5.addRule(12);
        layoutParams5.rightMargin = (int) lMd;
        layoutParams5.addRule(0, textView2.getId());
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(8388611);
        textView3.setMaxLines(1);
        textView3.setTextColor(Color.parseColor("#FFAEAEAE"));
        textView3.setTextSize(12.0f);
        textView3.setLayoutParams(layoutParams5);
        relativeLayout.addView(textView3);
        FrameLayout frameLayout = new FrameLayout(this.lMd);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(2, textView2.getId());
        layoutParams6.addRule(3, textView.getId());
        layoutParams6.topMargin = i9;
        frameLayout.setLayoutParams(layoutParams6);
        relativeLayout.addView(frameLayout);
        RatioFrameLayout ratioFrameLayout = new RatioFrameLayout(this.lMd);
        ratioFrameLayout.setId(520093736);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams7.gravity = 17;
        ratioFrameLayout.setLayoutParams(layoutParams7);
        frameLayout.addView(ratioFrameLayout);
        View pAGLogoView = new PAGLogoView(this.lMd);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, textView2.getId());
        pAGLogoView.setLayoutParams(layoutParams8);
        relativeLayout.addView(pAGLogoView);
        return new zp(textView, pAGLogoView, textView2, imageView, textView3, ratioFrameLayout);
    }

    private void jU() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        woN won = this.KS;
        if (won != null) {
            int mW = won.mW();
            float lMd = (this.ku * 1.0f) / WNy.lMd(this.lMd, 250.0f);
            if (this.KS.eWG() == null) {
                zp HWF = HWF();
                this.rV = HWF;
                ImageView imageView = HWF.dT;
                RatioImageView ratioImageView = HWF.zp;
                ImageView imageView2 = HWF.jU;
                TextView textView4 = HWF.COT;
                TextView textView5 = HWF.lMd;
                TextView textView6 = HWF.KS;
                TextView textView7 = HWF.YW;
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (WNy.lMd(this.lMd, 45.0f) * lMd);
                    layoutParams.height = (int) (WNy.lMd(this.lMd, 45.0f) * lMd);
                }
                textView4.setTextSize(2, WNy.zp(this.lMd, textView4.getTextSize()) * lMd);
                textView5.setTextSize(2, WNy.zp(this.lMd, textView5.getTextSize()) * lMd);
                textView6.setTextSize(2, WNy.zp(this.lMd, textView6.getTextSize()) * lMd);
                textView7.setTextSize(2, WNy.zp(this.lMd, textView7.getTextSize()) * lMd);
                try {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView4.getLayoutParams();
                    float f9 = lMd - 1.0f;
                    if (f9 > 0.0f) {
                        layoutParams2.topMargin = WNy.lMd(this.lMd, f9 * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView7.getLayoutParams()).setMargins(0, (int) (WNy.lMd(this.lMd, 16.0f) * lMd), 0, 0);
                } catch (Throwable unused) {
                }
                View view = this.rV.ku;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.zp(((BackupView) BannerExpressBackupView.this).lMd, ((BackupView) BannerExpressBackupView.this).KS, ((BackupView) BannerExpressBackupView.this).HWF);
                        }
                    });
                }
                if (mW == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    if (ratioImageView.getParent() instanceof FrameLayout) {
                        ((LinearLayout.LayoutParams) ((FrameLayout) ratioImageView.getParent()).getLayoutParams()).weight = 2.5f;
                    }
                    ratioImageView.setRatio(1.91f);
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        BannerExpressBackupView.this.zp();
                    }
                });
                int lMd2 = WNy.lMd(this.lMd, 15.0f);
                WNy.zp(imageView, lMd2, lMd2, lMd2, lMd2);
                zp((ImageView) ratioImageView);
                if (this.KS.BO() == null || TextUtils.isEmpty(this.KS.BO().zp())) {
                    textView = textView6;
                    textView2 = textView5;
                    textView3 = textView4;
                } else {
                    textView = textView6;
                    textView2 = textView5;
                    textView3 = textView4;
                    com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.KS.BO().zp(), this.KS.BO().lMd(), this.KS.BO().KS(), imageView2, this.KS);
                }
                textView.setText(getNameOrSource());
                textView3.setText(getNameOrSource());
                textView2.setText(getDescription());
                if (!TextUtils.isEmpty(this.KS.oB())) {
                    textView7.setText(this.KS.oB());
                } else {
                    textView7.setVisibility(8);
                }
                zp((View) ratioImageView, true);
                ratioImageView.setTag(520093762, Boolean.TRUE);
                zp((View) this, true);
                zp((View) textView7, true);
                return;
            }
            zp QR = QR();
            this.rV = QR;
            ImageView imageView3 = QR.dT;
            TextView textView8 = QR.COT;
            TextView textView9 = QR.lMd;
            TextView textView10 = QR.YW;
            RatioFrameLayout ratioFrameLayout = QR.Bj;
            textView8.setTextSize(2, WNy.zp(this.lMd, textView8.getTextSize()) * lMd);
            textView9.setTextSize(2, WNy.zp(this.lMd, textView9.getTextSize()) * lMd);
            textView10.setTextSize(2, WNy.zp(this.lMd, textView10.getTextSize()) * lMd);
            View view2 = this.rV.ku;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.zp(((BackupView) BannerExpressBackupView.this).lMd, ((BackupView) BannerExpressBackupView.this).KS, ((BackupView) BannerExpressBackupView.this).HWF);
                    }
                });
            }
            if (mW == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (mW == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            NativeVideoTsView videoView = getVideoView();
            if (videoView != null) {
                NativeExpressView nativeExpressView = this.dQp;
                if (nativeExpressView instanceof NativeExpressVideoView) {
                    videoView.setVideoAdInteractionListener((NativeExpressVideoView) nativeExpressView);
                }
                ratioFrameLayout.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new NativeVideoTsView.zp() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.6
                    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.zp
                    public void zp(View view3, int i9) {
                        if (BannerExpressBackupView.this.woN != null) {
                            BannerExpressBackupView.this.woN.onAdClicked();
                        }
                    }
                });
                HWF clickCreativeListener = this.dQp.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.zp(videoView.getNativeVideoController());
                }
            }
            textView8.setText(getNameOrSource());
            textView9.setText(getDescription());
            if (!TextUtils.isEmpty(this.KS.oB())) {
                textView10.setText(this.KS.oB());
            } else {
                textView10.setVisibility(8);
            }
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    BannerExpressBackupView.this.zp();
                }
            });
            int lMd3 = WNy.lMd(this.lMd, 15.0f);
            WNy.zp(imageView3, lMd3, lMd3, lMd3, lMd3);
            zp((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            zp((View) this, true);
            zp((View) textView10, true);
            zp(ratioFrameLayout);
        }
    }

    private void lMd() {
        tG zp2 = zp(this.dQp.getExpectExpressWidth(), this.dQp.getExpectExpressHeight());
        if (this.dQp.getExpectExpressWidth() > 0 && this.dQp.getExpectExpressHeight() > 0) {
            this.QR = WNy.lMd(this.lMd, this.dQp.getExpectExpressWidth());
            this.ku = WNy.lMd(this.lMd, this.dQp.getExpectExpressHeight());
        } else {
            int KS = WNy.KS(this.lMd);
            this.QR = KS;
            this.ku = Float.valueOf(KS / zp2.lMd).intValue();
        }
        int i9 = this.QR;
        if (i9 > 0 && i9 > WNy.KS(this.lMd)) {
            this.QR = WNy.KS(this.lMd);
            this.ku = Float.valueOf(this.ku * (WNy.KS(this.lMd) / this.QR)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.QR, this.ku);
        }
        layoutParams.width = this.QR;
        layoutParams.height = this.ku;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (zp2.zp == 1) {
            KS();
        } else {
            jU();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void zp(View view, int i9, com.bytedance.sdk.openadsdk.core.model.tG tGVar) {
        zp zpVar;
        NativeExpressView nativeExpressView = this.dQp;
        if (nativeExpressView != null) {
            if ((i9 == 1 || i9 == 2) && (zpVar = this.rV) != null) {
                ImageView imageView = zpVar.dT;
                if (i9 == 1) {
                    nativeExpressView.getClickListener().lMd(imageView);
                } else {
                    nativeExpressView.getClickCreativeListener().lMd(imageView);
                }
            }
            this.dQp.zp(view, i9, tGVar);
        }
    }

    /* loaded from: classes.dex */
    public static class zp {
        private RatioFrameLayout Bj;
        TextView COT;
        TextView HWF;
        public TextView KS;
        TTRatingBar2 QR;
        TextView YW;
        ImageView dT;
        ImageView jU;
        View ku;
        public TextView lMd;
        public RatioImageView zp;

        public zp(ImageView imageView, TextView textView, TextView textView2, TTRatingBar2 tTRatingBar2, View view, TextView textView3, ImageView imageView2) {
            this.jU = imageView;
            this.COT = textView;
            this.HWF = textView2;
            this.QR = tTRatingBar2;
            this.ku = view;
            this.YW = textView3;
            this.dT = imageView2;
        }

        public zp(ImageView imageView, TextView textView, View view, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4, RatioImageView ratioImageView) {
            this(imageView, textView, null, null, view, textView2, imageView2);
            this.KS = textView3;
            this.lMd = textView4;
            this.zp = ratioImageView;
        }

        public zp(TextView textView, View view, TextView textView2, ImageView imageView, TextView textView3, RatioFrameLayout ratioFrameLayout) {
            this(null, textView, null, null, view, textView2, imageView);
            this.lMd = textView3;
            this.Bj = ratioFrameLayout;
        }
    }

    public void zp(woN won, NativeExpressView nativeExpressView, com.com.bytedance.overseas.sdk.zp.KS ks) {
        setBackgroundColor(-1);
        this.KS = won;
        this.dQp = nativeExpressView;
        this.HWF = "banner_ad";
        nativeExpressView.addView(this, new ViewGroup.LayoutParams(-2, -2));
        lMd();
    }

    private void zp(ImageView imageView) {
        com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.KS.Rg().get(0), imageView, this.KS);
    }

    public static tG zp(int i9, int i10) {
        try {
            return ((double) i10) >= Math.floor((((double) i9) * 450.0d) / 600.0d) ? zp[1] : zp[0];
        } catch (Throwable unused) {
            return zp[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void zp() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.COT;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.lMd lmd = this.jU;
        if (lmd != null) {
            lmd.zp();
        } else {
            TTDelegateActivity.zp(this.KS, this.KVG);
        }
    }
}
