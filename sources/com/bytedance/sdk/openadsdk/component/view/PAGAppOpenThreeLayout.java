package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class PAGAppOpenThreeLayout extends PAGAppOpenOneLayout {
    public PAGAppOpenThreeLayout(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenOneLayout
    public View zp(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, WNy.lMd(context, 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = WNy.lMd(context, 60.0f);
        pAGLinearLayout.setLayoutParams(layoutParams);
        pAGLinearLayout.setOrientation(0);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = WNy.lMd(context, 53.0f);
        view.setLayoutParams(layoutParams2);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = WNy.lMd(context, 47.0f);
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        ButtonFlash buttonFlash = new ButtonFlash(context);
        this.COT = buttonFlash;
        buttonFlash.setId(520093717);
        this.COT.setLayoutParams(new LinearLayout.LayoutParams(WNy.lMd(context, 236.0f), WNy.lMd(context, 48.0f)));
        this.COT.setBackground(cz.KS(context, "tt_button_back"));
        this.COT.setEllipsize(TextUtils.TruncateAt.END);
        this.COT.setGravity(17);
        this.COT.setLines(1);
        this.COT.setText(cz.lMd(context, "tt_video_download_apk"));
        this.COT.setTextColor(Color.parseColor("#FFFFFF"));
        this.COT.setTextSize(1, 16.0f);
        this.COT.setTag("open_ad_click_button_tag");
        pAGLinearLayout2.addView(this.COT);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        return pAGLinearLayout;
    }
}
