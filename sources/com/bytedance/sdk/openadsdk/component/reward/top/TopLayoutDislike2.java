package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.core.wN.AlY;
import com.bytedance.sdk.openadsdk.core.wN.wN;
import com.bytedance.sdk.openadsdk.core.widget.DSW;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.qsH;

/* loaded from: classes.dex */
public class TopLayoutDislike2 extends wN implements YFl<TopLayoutDislike2> {
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private AlY mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private CharSequence mProgressStr;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private Sg mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(@NonNull Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        AlY alY = new AlY(getContext());
        int tN = GS.tN(getContext(), 5.0f);
        alY.setPadding(tN, tN, tN, tN);
        alY.setScaleType(ImageView.ScaleType.CENTER);
        alY.setBackground(com.bytedance.sdk.openadsdk.core.widget.AlY.YFl());
        return alY;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.tN(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable YFl;
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    if (TopLayoutDislike2.this.mSkipIV != null) {
                        if (TopLayoutDislike2.this.mIsSoundMute) {
                            YFl = qO.tN(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute");
                        } else {
                            YFl = qO.tN(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                        }
                    } else if (TopLayoutDislike2.this.mIsSoundMute) {
                        YFl = qsH.YFl(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper");
                    } else {
                        YFl = qsH.YFl(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(YFl);
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.Sg(view2);
                    }
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.YFl(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.YFl(view2);
                        }
                    }
                });
            }
        }
        AlY alY = this.mCloseBtn;
        if (alY != null) {
            alY.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.AlY(view2);
                    }
                }
            });
        }
    }

    private void initView() {
        int tN = GS.tN(getContext(), 16.0f);
        int tN2 = GS.tN(getContext(), 20.0f);
        int tN3 = GS.tN(getContext(), 28.0f);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tN3, tN3);
        layoutParams.leftMargin = tN;
        layoutParams.topMargin = tN2;
        this.mImgSound.setLayoutParams(layoutParams);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tN3, tN3);
        layoutParams2.topMargin = tN2;
        layoutParams2.leftMargin = tN;
        this.mImgDislike.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(getContext());
        this.mTextViewCountDown = qsh;
        qsh.setBackground(com.bytedance.sdk.openadsdk.core.widget.AlY.Sg());
        this.mTextViewCountDown.setId(520093714);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, GS.tN(getContext(), 28.0f));
        layoutParams4.topMargin = GS.tN(getContext(), 20.0f);
        int tN4 = GS.tN(getContext(), 16.0f);
        layoutParams2.rightMargin = tN4;
        layoutParams4.rightMargin = tN4;
        int tN5 = GS.tN(getContext(), 12.0f);
        GS.tN(getContext(), 5.0f);
        this.mTextViewCountDown.setPadding(tN5, 0, tN5, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        this.mSkipIV = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(tN3, tN3);
        layoutParams5.topMargin = tN2;
        layoutParams5.rightMargin = tN;
        this.mSkipIV.setLayoutParams(layoutParams5);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AlY Sg = DSW.Sg(getContext());
        this.mCloseBtn = Sg;
        Sg.setId(520093708);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388661;
        layoutParams6.topMargin = GS.tN(getContext(), 20.0f);
        layoutParams6.rightMargin = GS.tN(getContext(), 24.0f);
        this.mCloseBtn.setLayoutParams(layoutParams6);
        this.mCloseBtn.setContentDescription(qO.YFl(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        addView(this.mImgSound);
        addView(this.mImgDislike);
        addView(view);
        addView(this.mTextViewCountDown);
        addView(this.mSkipIV);
        addView(this.mCloseBtn);
    }

    private void updateTime(boolean z10) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z10) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void clickSound() {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setListener(Sg sg2) {
        this.mTopListener = sg2;
    }

    public void setShouldShowSkipTime(boolean z10) {
        this.shouldShowSkipTime = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setShowDislike(boolean z10) {
        int i10;
        View view = this.mImgDislike;
        if (view != null && !this.isVast) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setShowSkip(boolean z10) {
        int i10;
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z10) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z10;
        ImageView imageView = this.mSkipIV;
        int i11 = 0;
        if (z10 && this.hasCutDown) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        boolean z11 = z10 & (!TextUtils.isEmpty(this.mTextViewCountDown.getText()));
        TextView textView2 = this.mTextViewCountDown;
        if (!z11) {
            i11 = 8;
        }
        textView2.setVisibility(i11);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setShowSound(boolean z10) {
        int i10;
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSkipEnable(boolean z10) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z10);
            this.mSkipIV.setClickable(z10);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z10);
            this.mTextViewCountDown.setClickable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSoundMute(boolean z10) {
        Drawable YFl;
        this.mIsSoundMute = z10;
        if (this.mSkipIV != null) {
            if (z10) {
                YFl = qO.tN(getContext(), "tt_reward_full_mute");
            } else {
                YFl = qO.tN(getContext(), "tt_reward_full_unmute");
            }
        } else if (z10) {
            YFl = qsH.YFl(getContext(), "tt_mute_wrapper");
        } else {
            YFl = qsH.YFl(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(YFl);
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    @SuppressLint({"SetTextI18n"})
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        int parseInt;
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i10 = this.skipTime;
            if (i10 == 0) {
                parseInt = Integer.parseInt(str);
            } else {
                parseInt = i10 - (this.videoDuration - Integer.parseInt(str));
            }
            if (parseInt > 0) {
                if (this.skipTime == 0) {
                    updateTime(false);
                    return;
                }
                this.mTextViewCountDown.setText(parseInt + "s");
                updateTime(true);
                return;
            }
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2 load(@NonNull Wwa wwa) {
        initView();
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(qO.AlY(lG.YFl(), "tt_reward_full_feedback"));
        if (rkt.JwO().pDU(String.valueOf(wwa.kU())) && wwa.rkt() != 5 && wwa.rkt() != 6) {
            this.mSkipIV.setImageResource(qO.AlY(lG.YFl(), "tt_skip_btn"));
        } else {
            this.mSkipIV.setImageResource(qO.AlY(lG.YFl(), "tt_close_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = wwa.BPI() == null ? 0 : ((int) wwa.BPI().f23459d) * wwa.BPI().f23473r;
        if (com.bytedance.sdk.openadsdk.core.model.rkt.tN(wwa) && wwa.NjR() != null) {
            this.videoDuration = (int) wwa.NjR().Sg();
        } else if (com.bytedance.sdk.openadsdk.core.model.rkt.AlY(wwa) && wwa.NjR() != null) {
            this.videoDuration = (int) wwa.NjR().AlY();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (wwa.Uv() == 8 && wwa.pq() != null) {
            this.skipTime = lG.AlY().qO(wwa.pq().getCodeId());
        } else {
            this.skipTime = lG.AlY().nc(wwa.pq().getCodeId());
        }
        if (Ne.tN(wwa)) {
            this.skipTime = lG.AlY().YFl(String.valueOf(wwa.kU()), wwa.TMt());
            this.videoDuration = wwa.VJb();
        }
        int i10 = this.skipTime;
        this.shouldShowSkipTime = i10 == -1 || i10 >= this.videoDuration;
        if (wwa.yn()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mProgressStr = "";
        setOrientation(0);
    }
}
