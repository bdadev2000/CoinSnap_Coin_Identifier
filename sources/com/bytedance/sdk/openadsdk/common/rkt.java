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
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rkt extends Dialog {
    private static final String[] Sg = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private TextView AlY;
    private final Handler YFl;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private ImageView f10566vc;
    private Button wN;

    public rkt(@NonNull Context context) {
        super(context, qO.vc(context, "tt_privacy_dialog_theme_ad_report"));
        this.YFl = new Handler(Looper.getMainLooper());
        this.tN = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(YFl(getContext()), new ViewGroup.LayoutParams(GS.tN(getContext()), (int) (GS.AlY(getContext()) * 0.9d)));
        Sg();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.YFl.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.rkt.3
                @Override // java.lang.Runnable
                public void run() {
                    rkt.this.AlY.setText(rkt.this.tN);
                }
            }, 1000L);
        } catch (Exception e2) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e2);
        }
    }

    private void Sg() {
        final String wN = Sco.wN();
        final String DSW = Sco.DSW();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.wN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.rkt.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) rkt.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, wN, DSW, str, str2, rkt.this.tN};
                    for (int i10 = 0; i10 < rkt.Sg.length; i10++) {
                        sb2.append(rkt.Sg[i10]);
                        sb2.append(": ");
                        sb2.append(strArr[i10]);
                        sb2.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb2));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.f10566vc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.rkt.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                rkt.this.AlY.setText("loading ...");
                rkt.this.cancel();
            }
        });
    }

    public void YFl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.tN = com.bytedance.sdk.component.utils.YFl.YFl(new JSONObject(str)).toString();
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTPrivacyAdReportDialog", e2.getMessage());
        }
    }

    private View YFl(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wNVar.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_ad_report_info_bg"));
        wNVar.setOrientation(1);
        wNVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        dsw.setLayoutParams(new ViewGroup.LayoutParams(-1, YFl(44.0f)));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(YFl(191.0f), YFl(24.0f));
        layoutParams2.addRule(13);
        qsh.setGravity(17);
        qsh.setText("Ad Report");
        qsh.setTextColor(Color.parseColor("#161823"));
        qsh.setTextSize(1, 17.0f);
        qsh.setLayoutParams(layoutParams2);
        this.f10566vc = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(YFl(40.0f), YFl(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = YFl(8.0f);
        this.f10566vc.setPadding(YFl(12.0f), YFl(14.0f), YFl(12.0f), YFl(14.0f));
        this.f10566vc.setImageResource(qO.AlY(context, "tt_ad_xmark"));
        this.f10566vc.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, YFl(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = YFl(16.0f);
        layoutParams5.rightMargin = YFl(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(YFl(16.0f));
        layoutParams5.setMarginEnd(YFl(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        wNVar2.setOrientation(1);
        wNVar2.setLayoutParams(layoutParams6);
        String wN = Sco.wN();
        String DSW = Sco.DSW();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.wN.wN YFl = YFl(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.wN.wN YFl2 = YFl(context, "App", wN);
        com.bytedance.sdk.openadsdk.core.wN.wN YFl3 = YFl(context, "App version", DSW);
        com.bytedance.sdk.openadsdk.core.wN.wN YFl4 = YFl(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.wN.wN YFl5 = YFl(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.wN.wN YFl6 = YFl(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar3 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, YFl(76.0f));
        wNVar3.setBackgroundColor(-1);
        wNVar3.setLayoutParams(layoutParams7);
        this.wN = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int YFl7 = YFl(16.0f);
        layoutParams8.setMargins(YFl7, YFl7, YFl7, YFl7);
        this.wN.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_ad_report_info_button_bg"));
        this.wN.setText("copy all");
        this.wN.setTextColor(Color.parseColor("#333333"));
        this.wN.setTextSize(14.0f);
        this.wN.setLayoutParams(layoutParams8);
        wNVar.addView(dsw);
        dsw.addView(qsh);
        dsw.addView(this.f10566vc);
        wNVar.addView(view);
        wNVar.addView(scrollView);
        scrollView.addView(wNVar2);
        wNVar2.addView(YFl);
        wNVar2.addView(YFl2);
        wNVar2.addView(YFl3);
        wNVar2.addView(YFl4);
        wNVar2.addView(YFl5);
        wNVar2.addView(YFl6);
        wNVar.addView(wNVar3);
        wNVar3.addView(this.wN);
        return wNVar;
    }

    private com.bytedance.sdk.openadsdk.core.wN.wN YFl(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : YFl(74.0f));
        wNVar.setOrientation(1);
        wNVar.setPadding(0, YFl(16.0f), 0, YFl(16.0f));
        wNVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = YFl(7.0f);
        qsh.setIncludeFontPadding(false);
        qsh.setText(str);
        qsh.setTextColor(Color.parseColor("#333333"));
        qsh.setTextSize(16.0f);
        qsh.setTypeface(Typeface.defaultFromStyle(1));
        qsh.setLayoutParams(layoutParams2);
        wNVar.addView(qsh);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        if (str.equals("Creative info")) {
            this.AlY = qsh2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        qsh2.setIncludeFontPadding(false);
        qsh2.setTextColor(Color.parseColor("#666666"));
        qsh2.setText(str2);
        qsh2.setTextSize(14.0f);
        qsh2.setLayoutParams(layoutParams3);
        wNVar.addView(qsh2);
        return wNVar;
    }

    private int YFl(float f10) {
        return GS.tN(getContext(), f10);
    }
}
