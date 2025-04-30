package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class TTAdDislikeToast extends PAGFrameLayout {
    private static String COT;
    private static String KS;
    private static String jU;
    private TextView lMd;
    private final Handler zp;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (COT == null) {
            Context zp = KVG.zp();
            COT = cz.zp(zp, "tt_feedback_thank_text") + "\n" + cz.zp(zp, "tt_feedback_experience_text");
        }
        return COT;
    }

    public static String getDislikeTip() {
        if (KS == null) {
            KS = cz.zp(KVG.zp(), "tt_feedback_submit_text");
        }
        return KS;
    }

    public static String getSkipText() {
        if (jU == null) {
            jU = cz.zp(KVG.zp(), "tt_txt_skip");
        }
        return jU;
    }

    public void KS() {
        setVisibility(8);
        this.zp.removeCallbacksAndMessages(null);
    }

    public void lMd() {
        setVisibility(8);
        this.zp.removeCallbacksAndMessages(null);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void zp() {
        Context zp = KVG.zp();
        jU = cz.zp(zp, "tt_txt_skip");
        KS = cz.zp(zp, "tt_feedback_submit_text");
        COT = cz.zp(zp, "tt_feedback_thank_text") + "\n" + cz.zp(zp, "tt_feedback_experience_text");
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.zp = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        zp(context);
    }

    private void zp(Context context) {
        TextView textView = new TextView(context);
        this.lMd = textView;
        textView.setClickable(false);
        this.lMd.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int lMd = WNy.lMd(KVG.zp(), 20.0f);
        int lMd2 = WNy.lMd(KVG.zp(), 12.0f);
        this.lMd.setPadding(lMd, lMd2, lMd, lMd2);
        this.lMd.setLayoutParams(layoutParams);
        this.lMd.setTextColor(-1);
        this.lMd.setTextSize(16.0f);
        this.lMd.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(WNy.lMd(KVG.zp(), 6.0f));
        this.lMd.setBackgroundDrawable(gradientDrawable);
        addView(this.lMd);
    }

    public void zp(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zp.removeCallbacksAndMessages(null);
        this.zp.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.lMd != null) {
                    TTAdDislikeToast.this.lMd.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.zp.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
