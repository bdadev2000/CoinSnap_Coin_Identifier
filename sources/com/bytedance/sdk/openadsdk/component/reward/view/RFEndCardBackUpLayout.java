package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.core.widget.rkt;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.wN.tN {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.YFl.YFl adContext;
    private PAGLogoView adLogo;
    private lG ivIcon;
    private boolean mInit;
    private rkt rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.wN.qsH tvDesc;
    private com.bytedance.sdk.openadsdk.core.wN.qsH tvDownload;
    private TextView tvTitle;

    /* loaded from: classes.dex */
    public static final class YFl extends Drawable {
        private final Drawable Sg;
        Path YFl = new Path();
        private final int tN;

        public YFl(Context context) {
            this.Sg = qO.tN(context, "tt_ad_bg_header_gradient");
            this.tN = GS.tN(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.clipPath(this.YFl);
            canvas.drawColor(-1);
            this.Sg.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13);
            float f10 = i12;
            this.Sg.setBounds(i10, i11, i12, (int) (((1.0f * f10) / this.Sg.getIntrinsicWidth()) * this.Sg.getIntrinsicHeight()));
            this.YFl.reset();
            Path path = this.YFl;
            RectF rectF = new RectF(0.0f, 0.0f, f10, i13);
            int i14 = this.tN;
            path.addRoundRect(rectF, i14, i14, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(GA.qjy);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.wN.qsH qsh, Wwa wwa) {
        if (qsh == null) {
            return;
        }
        String dd2 = wwa.dd();
        if (!TextUtils.isEmpty(dd2)) {
            qsh.setText(dd2);
        }
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.wN.AlY alY, Wwa wwa) {
        if (alY != null && wwa.dGX() != null && !TextUtils.isEmpty(wwa.dGX().YFl())) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(wwa.dGX(), alY, wwa);
        }
    }

    private void bindTitleData(TextView textView, Wwa wwa, String str) {
        if (textView != null) {
            if (wwa.in() != null && !TextUtils.isEmpty(wwa.in().Sg())) {
                textView.setText(wwa.in().Sg());
            } else {
                textView.setText(str);
            }
        }
    }

    private void initData(Wwa wwa, com.bytedance.sdk.openadsdk.core.wN.qsH qsh) {
        setDownloadButtonData(qsh, wwa, -1);
        bindIconData(this.ivIcon, wwa);
        lG lGVar = this.ivIcon;
        if (lGVar != null) {
            lGVar.setOnClickListener(this.adContext.dXO.wN());
        }
        rkt rktVar = this.rbScore;
        if (rktVar != null) {
            GS.YFl((TextView) null, rktVar, wwa);
            if (wwa.in() != null) {
                this.rbScore.setVisibility(0);
            }
            this.rbScore.setOnClickListener(this.adContext.dXO.wN());
        }
        if (this.tvTitle != null) {
            if (wwa.in() != null && !TextUtils.isEmpty(wwa.in().Sg())) {
                this.tvTitle.setText(wwa.in().Sg());
            } else if (!TextUtils.isEmpty(wwa.zG())) {
                this.tvTitle.setText(wwa.zG());
            } else {
                this.tvTitle.setVisibility(8);
            }
            this.tvTitle.setOnClickListener(this.adContext.dXO.wN());
        }
        if (this.tvDesc != null) {
            String Hjb = wwa.Hjb();
            if (!TextUtils.isEmpty(Hjb)) {
                this.tvDesc.setText(Hjb);
            } else {
                this.tvDesc.setVisibility(8);
            }
            this.tvDesc.setOnClickListener(this.adContext.dXO.wN());
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.YFl(RFEndCardBackUpLayout.this.adContext.UI, RFEndCardBackUpLayout.this.adContext.Sg, RFEndCardBackUpLayout.this.adContext.wN);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(GS.tN(context, 16.0f), 0, GS.tN(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(wNVar, layoutParams);
        if (this.adContext.Cqy == 2) {
            com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
            wNVar2.setOrientation(0);
            wNVar.addView(wNVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(wNVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(wNVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(wNVar);
        }
        View pAGLogoView = new PAGLogoView(this.adContext.UI);
        pAGLogoView.setId(520093757);
        wNVar.addView(pAGLogoView);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.YFl(RFEndCardBackUpLayout.this.adContext.UI, RFEndCardBackUpLayout.this.adContext.Sg, RFEndCardBackUpLayout.this.adContext.wN);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.wN.wN wNVar) {
        Wwa wwa = this.adContext.Sg;
        if (wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) {
            List<Wwa> tN = ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).rQ().tN();
            for (int i10 = 0; i10 < tN.size() && i10 < 3; i10++) {
                initSingleCardInThreeCardStyle(wNVar, tN.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.wN.wN wNVar) {
        Wwa wwa = this.adContext.Sg;
        if (wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) {
            List<Wwa> tN = ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).rQ().tN();
            for (int i10 = 0; i10 < tN.size() && i10 < 2; i10++) {
                initSingleCardInTwoCardStyle(wNVar, tN.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.wN.wN wNVar, int i10) {
        Wwa wwa = this.adContext.Sg;
        if (wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) {
            List<Wwa> tN = ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).rQ().tN();
            for (int i11 = 0; i11 < tN.size() && i11 < i10 && i11 < 3; i11++) {
                initSingleCardInTwoCardStyleLandscape(wNVar, tN.get(i11), i11, i10);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.wN.wN wNVar, Wwa wwa, int i10) {
        int i11;
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar2.setOrientation(1);
        wNVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (i10 > 0) {
            i11 = GS.tN(context, 12.0f);
        } else {
            i11 = 0;
        }
        layoutParams.setMargins(0, i11, 0, 0);
        wNVar2.setBackground(new YFl(context));
        wNVar.addView(wNVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar3 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar3.setOrientation(0);
        wNVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = GS.tN(context, 20.0f);
        layoutParams2.leftMargin = GS.tN(context, 17.0f);
        layoutParams2.rightMargin = GS.tN(context, 30.0f);
        wNVar2.addView(wNVar3, layoutParams2);
        lG lGVar = new lG(context);
        wNVar3.addView(lGVar, new FrameLayout.LayoutParams(GS.tN(context, 70.0f), GS.tN(context, 63.0f)));
        bindIconData(lGVar, wwa);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar4 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = GS.tN(context, 7.0f);
        wNVar3.addView(wNVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setSingleLine(true);
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        qsh.setTextSize(18.0f);
        qsh.setTextColor(Color.parseColor("#161823"));
        qsh.setGravity(8388611);
        qsh.setTypeface(null, 1);
        wNVar4.addView(qsh, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(qsh, wwa, wwa.zG());
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh2.setSingleLine(true);
        qsh2.setEllipsize(TextUtils.TruncateAt.END);
        qsh2.setTextSize(16.0f);
        qsh2.setTextColor(Color.parseColor("#80161823"));
        wNVar4.addView(qsh2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(qsh2, wwa);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar5 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar5.setOrientation(0);
        wNVar5.setGravity(16);
        wNVar4.addView(wNVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh3.setTextSize(16.0f);
        qsh3.setTextColor(Color.parseColor("#80161823"));
        wNVar5.addView(qsh3, new ViewGroup.LayoutParams(-2, -2));
        rkt rktVar = new rkt(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = GS.tN(context, 8.0f);
        wNVar5.addView(rktVar, layoutParams4);
        GS.YFl(qsh3, rktVar, wwa, 18);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh4 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh4.setGravity(17);
        qsh4.setId(520093707);
        qsh4.setText(qO.YFl(context, "tt_video_download_apk"));
        qsh4.setTextColor(-1);
        qsh4.setTextSize(2, 16.0f);
        qsh4.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, GS.tN(context, 36.0f));
        layoutParams5.setMargins(GS.tN(context, 20.0f), GS.tN(context, 22.0f), GS.tN(context, 20.0f), GS.tN(context, 20.0f));
        wNVar2.addView(qsh4, layoutParams5);
        setDownloadButtonData(qsh4, wwa, i10);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.wN.wN wNVar, Wwa wwa, int i10) {
        int i11;
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar2.setOrientation(1);
        wNVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (i10 > 0) {
            i11 = GS.tN(context, 12.0f);
        } else {
            i11 = 0;
        }
        layoutParams.setMargins(0, i11, 0, 0);
        wNVar2.setBackground(new YFl(context));
        wNVar.addView(wNVar2, layoutParams);
        lG lGVar = new lG(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(GS.tN(context, 70.0f), GS.tN(context, 63.0f));
        layoutParams2.setMargins(0, GS.tN(context, 24.0f), 0, GS.tN(context, 12.0f));
        wNVar2.addView(lGVar, layoutParams2);
        bindIconData(lGVar, wwa);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setSingleLine(true);
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        qsh.setTextSize(18.0f);
        qsh.setTextColor(Color.parseColor("#161823"));
        qsh.setGravity(17);
        qsh.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(GS.tN(context, 56.0f), 0, GS.tN(context, 56.0f), 0);
        wNVar2.addView(qsh, layoutParams3);
        bindTitleData(qsh, wwa, wwa.zG());
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh2.setSingleLine(true);
        qsh2.setEllipsize(TextUtils.TruncateAt.END);
        qsh2.setTextSize(16.0f);
        qsh2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(GS.tN(context, 56.0f), GS.tN(context, 4.0f), GS.tN(context, 56.0f), 0);
        wNVar2.addView(qsh2, layoutParams4);
        bindDescData(qsh2, wwa);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar3 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar3.setOrientation(0);
        wNVar3.setGravity(16);
        wNVar2.addView(wNVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh3.setTextSize(16.0f);
        qsh3.setTextColor(Color.parseColor("#80161823"));
        wNVar3.addView(qsh3, new ViewGroup.LayoutParams(-2, -2));
        rkt rktVar = new rkt(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = GS.tN(context, 8.0f);
        wNVar3.addView(rktVar, layoutParams5);
        GS.YFl(qsh3, rktVar, wwa, 18);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh4 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh4.setGravity(17);
        qsh4.setId(520093707);
        qsh4.setText(qO.YFl(context, "tt_video_download_apk"));
        qsh4.setTextColor(-1);
        qsh4.setTextSize(2, 16.0f);
        qsh4.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, GS.tN(context, 36.0f));
        layoutParams6.setMargins(GS.tN(context, 20.0f), GS.tN(context, 36.0f), GS.tN(context, 20.0f), GS.tN(context, 20.0f));
        wNVar2.addView(qsh4, layoutParams6);
        setDownloadButtonData(qsh4, wwa, i10);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.wN.wN wNVar, Wwa wwa, int i10, int i11) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar2.setOrientation(1);
        wNVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i10 > 0) {
            layoutParams.setMargins(GS.tN(context, 12.0f), 0, 0, 0);
        }
        wNVar2.setBackground(new YFl(context));
        wNVar.addView(wNVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar3 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar3.setOrientation(0);
        wNVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = GS.tN(context, 20.0f);
        layoutParams2.leftMargin = GS.tN(context, 17.0f);
        layoutParams2.rightMargin = GS.tN(context, 30.0f);
        wNVar2.addView(wNVar3, layoutParams2);
        lG lGVar = new lG(context);
        wNVar3.addView(lGVar, new FrameLayout.LayoutParams(GS.tN(context, 44.0f), GS.tN(context, 44.0f)));
        bindIconData(lGVar, wwa);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar4 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = GS.tN(context, 7.0f);
        wNVar3.addView(wNVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setSingleLine(true);
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        qsh.setTextSize(18.0f);
        qsh.setTextColor(Color.parseColor("#161823"));
        qsh.setGravity(8388611);
        qsh.setTypeface(null, 1);
        wNVar4.addView(qsh, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(qsh, wwa, wwa.zG());
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar5 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar5.setOrientation(0);
        wNVar5.setGravity(16);
        wNVar4.addView(wNVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh2.setTextSize(16.0f);
        qsh2.setTextColor(Color.parseColor("#80161823"));
        wNVar5.addView(qsh2, new ViewGroup.LayoutParams(-2, -2));
        rkt rktVar = new rkt(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = GS.tN(context, 8.0f);
        wNVar5.addView(rktVar, layoutParams4);
        GS.YFl(qsh2, rktVar, wwa, 18);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        if (i11 == 2) {
            qsh3.setSingleLine(true);
        } else {
            qsh3.setLines(2);
        }
        qsh3.setEllipsize(TextUtils.TruncateAt.END);
        qsh3.setTextSize(16.0f);
        qsh3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i12 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i12;
        layoutParams5.leftMargin = i12;
        layoutParams5.topMargin = GS.tN(context, 12.0f);
        wNVar2.addView(qsh3, layoutParams5);
        bindDescData(qsh3, wwa);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh4 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh4.setGravity(17);
        qsh4.setId(520093707);
        qsh4.setText(qO.YFl(context, "tt_video_download_apk"));
        qsh4.setTextColor(-1);
        qsh4.setTextSize(2, 16.0f);
        qsh4.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, GS.tN(context, 36.0f));
        layoutParams6.setMargins(GS.tN(context, 20.0f), GS.tN(context, 22.0f), GS.tN(context, 20.0f), GS.tN(context, 20.0f));
        wNVar2.addView(qsh4, layoutParams6);
        setDownloadButtonData(qsh4, wwa, i10);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        if (this.adContext.Sg.blt() && this.shownAdCount > 1) {
            initOneSlotMultipleAdsLayout();
            return;
        }
        Wwa wwa = this.adContext.Sg;
        if (wwa.yn()) {
            initViewsForVast();
        } else {
            initViewsDefault();
            initData(wwa, this.tvDownload);
        }
    }

    private void initViewsDefault() {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        if (this.adContext.Sg.SVa() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setGravity(1);
        wNVar.setOrientation(1);
        if (z10) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(GS.tN(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int tN = GS.tN(context, 24.0f);
        layoutParams.rightMargin = tN;
        layoutParams.leftMargin = tN;
        addView(wNVar, layoutParams);
        lG lGVar = new lG(context);
        this.ivIcon = lGVar;
        lGVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(GS.tN(context, 80.0f), GS.tN(context, 80.0f));
        layoutParams2.bottomMargin = GS.tN(context, 12.0f);
        wNVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.tvTitle = qsh;
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(GS.tN(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        wNVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.tvDesc = qsh2;
        qsh2.setEllipsize(TextUtils.TruncateAt.END);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = GS.tN(context, 8.0f);
        wNVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new rkt(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, GS.tN(context, 16.0f));
        layoutParams4.topMargin = GS.tN(context, 12.0f);
        this.rbScore.setVisibility(8);
        wNVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.tvDownload = qsh3;
        qsh3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(qO.YFl(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, GS.tN(context, 44.0f));
        layoutParams5.topMargin = GS.tN(context, 54.0f);
        wNVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = new PAGLogoView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, GS.tN(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = GS.tN(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = GS.tN(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = GS.tN(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setId(GA.qsH);
        alY.setVisibility(8);
        addView(alY, new FrameLayout.LayoutParams(-1, -1));
        View alY2 = new com.bytedance.sdk.component.NjR.AlY(context, true);
        alY2.setVisibility(8);
        alY2.setId(GA.NjR);
        addView(alY2, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.wN.qsH qsh, Wwa wwa, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.adContext;
        com.bytedance.sdk.openadsdk.core.Sg.wN YFl2 = yFl.dXO.YFl(yFl, wwa);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.adContext;
        YFl2.YFl(com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(yFl2.UI, wwa, yFl2.wN));
        if (i10 != -1) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_order", Integer.valueOf(i10 + 1));
            YFl2.YFl(hashMap);
        }
        qsh.setOnClickListener(YFl2);
        qsh.setOnTouchListener(YFl2);
        CharSequence lL = wwa.lL();
        if (!TextUtils.isEmpty(lL)) {
            qsh.setText(lL);
        }
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.adContext = yFl;
        if (yFl.Sg.yn()) {
            initViews();
        }
    }

    public void setShownAdCount(int i10) {
        this.shownAdCount = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            initViews();
        }
    }
}
