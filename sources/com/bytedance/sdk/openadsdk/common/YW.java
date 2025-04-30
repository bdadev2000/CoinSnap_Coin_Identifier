package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YW extends Dialog {
    private static final String[] lMd = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private Button COT;
    private ImageView HWF;
    private String KS;
    private TextView jU;
    private final Handler zp;

    public YW(@NonNull Context context) {
        super(context, cz.HWF(context, "tt_privacy_dialog_theme_ad_report"));
        this.zp = new Handler(Looper.getMainLooper());
        this.KS = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(zp(getContext()), new ViewGroup.LayoutParams(WNy.KS(getContext()), (int) (WNy.jU(getContext()) * 0.9d)));
        lMd();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.zp.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.YW.3
                @Override // java.lang.Runnable
                public void run() {
                    YW.this.jU.setText(YW.this.KS);
                }
            }, 1000L);
        } catch (Exception e4) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e4);
        }
    }

    private void lMd() {
        final String COT = YhE.COT();
        final String QR = YhE.QR();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.COT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.YW.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) YW.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, COT, QR, str, str2, YW.this.KS};
                    for (int i9 = 0; i9 < YW.lMd.length; i9++) {
                        sb.append(YW.lMd[i9]);
                        sb.append(": ");
                        sb.append(strArr[i9]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.HWF.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.YW.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YW.this.jU.setText("loading ...");
                YW.this.cancel();
            }
        });
    }

    public void zp(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.KS = com.bytedance.sdk.component.utils.zp.zp(new JSONObject(str)).toString();
        } catch (JSONException e4) {
            tG.zp("TTPrivacyAdReportDialog", e4.getMessage());
        }
    }

    private View zp(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_ad_report_info_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, zp(44.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(zp(191.0f), zp(24.0f));
        layoutParams2.addRule(13);
        pAGTextView.setGravity(17);
        pAGTextView.setText("Ad Report");
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(1, 17.0f);
        pAGTextView.setLayoutParams(layoutParams2);
        this.HWF = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(zp(40.0f), zp(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = zp(8.0f);
        this.HWF.setPadding(zp(12.0f), zp(14.0f), zp(12.0f), zp(14.0f));
        this.HWF.setImageResource(cz.jU(context, "tt_ad_xmark"));
        this.HWF.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, zp(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = zp(16.0f);
        layoutParams5.rightMargin = zp(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(zp(16.0f));
        layoutParams5.setMarginEnd(zp(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        String COT = YhE.COT();
        String QR = YhE.QR();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        PAGLinearLayout zp = zp(context, "SDK version", BuildConfig.VERSION_NAME);
        PAGLinearLayout zp2 = zp(context, "App", COT);
        PAGLinearLayout zp3 = zp(context, "App version", QR);
        PAGLinearLayout zp4 = zp(context, "OS", str);
        PAGLinearLayout zp5 = zp(context, "Device", str2);
        PAGLinearLayout zp6 = zp(context, "Creative info", "loading ...");
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, zp(76.0f));
        pAGLinearLayout3.setBackgroundColor(Color.parseColor("#ffffff"));
        pAGLinearLayout3.setLayoutParams(layoutParams7);
        this.COT = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int zp7 = zp(16.0f);
        layoutParams8.setMargins(zp7, zp7, zp7, zp7);
        this.COT.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_ad_report_info_button_bg"));
        this.COT.setText("copy all");
        this.COT.setTextColor(Color.parseColor("#333333"));
        this.COT.setTextSize(14.0f);
        this.COT.setLayoutParams(layoutParams8);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGRelativeLayout.addView(pAGTextView);
        pAGRelativeLayout.addView(this.HWF);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(scrollView);
        scrollView.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(zp);
        pAGLinearLayout2.addView(zp2);
        pAGLinearLayout2.addView(zp3);
        pAGLinearLayout2.addView(zp4);
        pAGLinearLayout2.addView(zp5);
        pAGLinearLayout2.addView(zp6);
        pAGLinearLayout.addView(pAGLinearLayout3);
        pAGLinearLayout3.addView(this.COT);
        return pAGLinearLayout;
    }

    private PAGLinearLayout zp(Context context, String str, String str2) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : zp(74.0f));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(0, zp(16.0f), 0, zp(16.0f));
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = zp(7.0f);
        pAGTextView.setIncludeFontPadding(false);
        pAGTextView.setText(str);
        pAGTextView.setTextColor(Color.parseColor("#333333"));
        pAGTextView.setTextSize(16.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(1));
        pAGTextView.setLayoutParams(layoutParams2);
        pAGLinearLayout.addView(pAGTextView);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        if (str.equals("Creative info")) {
            this.jU = pAGTextView2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        pAGTextView2.setIncludeFontPadding(false);
        pAGTextView2.setTextColor(Color.parseColor("#666666"));
        pAGTextView2.setText(str2);
        pAGTextView2.setTextSize(14.0f);
        pAGTextView2.setLayoutParams(layoutParams3);
        pAGLinearLayout.addView(pAGTextView2);
        return pAGLinearLayout;
    }

    private int zp(float f9) {
        return WNy.lMd(getContext(), f9);
    }
}
