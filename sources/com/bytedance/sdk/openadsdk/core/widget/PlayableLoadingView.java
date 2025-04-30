package com.bytedance.sdk.openadsdk.core.widget;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.Locale;

/* loaded from: classes.dex */
public class PlayableLoadingView extends PAGFrameLayout {
    private long COT;
    private boolean HWF;
    private TextView KS;
    private long jU;
    private TextView lMd;
    private PAGProgressBar zp;

    public PlayableLoadingView(@NonNull Context context) {
        super(context);
        setVisibility(8);
    }

    private void jU() {
        if (this.HWF) {
            return;
        }
        this.HWF = true;
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        Context context = getContext();
        int lMd = WNy.lMd(context, 80.0f);
        int lMd2 = WNy.lMd(context, 10.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(lMd, WNy.lMd(context, 53.0f));
        layoutParams2.gravity = 17;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(cz.jU(context, "tt_pangle_logo_white"));
        linearLayout.addView(imageView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = lMd2;
        layoutParams3.gravity = 17;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout.addView(linearLayout2);
        this.zp = new PAGProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(lMd, WNy.lMd(context, 3.0f));
        layoutParams4.gravity = 17;
        this.zp.setProgress(1);
        this.zp.setProgressDrawable(ku.zp(context, "tt_playable_progress_style"));
        this.zp.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.zp);
        this.lMd = new TextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = lMd2;
        this.lMd.setGravity(16);
        int parseColor = Color.parseColor("#EEEEEE");
        this.lMd.setTextColor(parseColor);
        this.lMd.setTextSize(12.0f);
        this.lMd.setLayoutParams(layoutParams5);
        linearLayout2.addView(this.lMd);
        int lMd3 = WNy.lMd(context, 24.0f);
        int lMd4 = WNy.lMd(context, 8.0f);
        TextView textView = new TextView(context);
        this.KS = textView;
        textView.setId(vDp.ea);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = WNy.lMd(context, 72.0f);
        layoutParams6.gravity = 17;
        this.KS.setBackground(ku.zp(context, "tt_playable_btn_bk"));
        this.KS.setClickable(true);
        this.KS.setPadding(lMd3, lMd4, lMd3, lMd4);
        this.KS.setMaxLines(1);
        this.KS.setEllipsize(TextUtils.TruncateAt.END);
        this.KS.setTextColor(parseColor);
        this.KS.setTextSize(14.0f);
        this.KS.setText(cz.zp(context, "tt_try_now"));
        this.KS.setLayoutParams(layoutParams6);
        linearLayout.addView(this.KS);
        addView(linearLayout);
    }

    public boolean KS() {
        if (this.jU > 0 && this.COT > 0) {
            return true;
        }
        return false;
    }

    public long getDisplayDuration() {
        if (this.jU == 0) {
            return 0L;
        }
        if (this.COT == 0) {
            this.COT = SystemClock.elapsedRealtime();
        }
        return this.COT - this.jU;
    }

    @Nullable
    public TextView getPlayView() {
        return this.KS;
    }

    public void lMd() {
        if (isShown()) {
            return;
        }
        jU();
        setVisibility(0);
        this.jU = SystemClock.elapsedRealtime();
    }

    public void setProgress(int i9) {
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 > 100) {
            i9 = 100;
        }
        PAGProgressBar pAGProgressBar = this.zp;
        if (pAGProgressBar != null) {
            pAGProgressBar.setProgress(i9);
        }
        TextView textView = this.lMd;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i9)));
        }
    }

    public void zp() {
        setVisibility(8);
        if (this.jU != 0) {
            this.COT = SystemClock.elapsedRealtime();
        }
    }
}
