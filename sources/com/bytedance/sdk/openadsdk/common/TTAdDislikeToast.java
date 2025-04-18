package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.wN.tN {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context YFl = com.bytedance.sdk.openadsdk.core.lG.YFl();
            sDislikeSendTip = qO.YFl(YFl, "tt_feedback_thank_text") + "\n" + qO.YFl(YFl, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = qO.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = qO.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = GS.tN(getContext(), 75.0f);
        int tN = GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl(), 16.0f);
        int tN2 = GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl(), 12.0f);
        this.mTextView.setPadding(tN, tN2, tN, tN2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(8388611);
        Drawable tN3 = qO.tN(getContext(), "tt_dislike_toast");
        int tN4 = GS.tN(getContext(), 16.0f);
        tN3.setBounds(0, 0, tN4, tN4);
        this.mTextView.setCompoundDrawablePadding(tN4 / 2);
        this.mTextView.setCompoundDrawables(tN3, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context YFl = com.bytedance.sdk.openadsdk.core.lG.YFl();
        sSkipText = qO.YFl(YFl, "tt_reward_screen_skip_tx");
        sDislikeTip = qO.YFl(YFl, "tt_feedback_submit_text");
        sDislikeSendTip = qO.YFl(YFl, "tt_feedback_thank_text") + "\n" + qO.YFl(YFl, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }
}
