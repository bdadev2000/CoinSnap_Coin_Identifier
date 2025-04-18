package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class Sg extends Dialog {
    private com.bytedance.sdk.openadsdk.core.wN.qsH AlY;
    private View DSW;
    private int GA;
    private String NjR;
    private com.bytedance.sdk.openadsdk.core.wN.AlY Sg;
    public YFl YFl;
    private String YoT;
    private String eT;

    /* renamed from: nc, reason: collision with root package name */
    private String f10757nc;
    private boolean pDU;
    private final Context qsH;
    private com.bytedance.sdk.openadsdk.core.wN.qsH tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wN.YFl f10758vc;
    private com.bytedance.sdk.openadsdk.core.wN.YFl wN;

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg();

        void YFl();
    }

    public Sg(Context context) {
        super(context, com.bytedance.sdk.component.utils.qO.vc(context, "tt_custom_dialog"));
        this.GA = -1;
        this.pDU = false;
        this.qsH = context;
    }

    private void Sg() {
        if (!TextUtils.isEmpty(this.f10757nc)) {
            this.tN.setText(this.f10757nc);
            this.tN.setVisibility(0);
        } else {
            this.tN.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.NjR)) {
            this.AlY.setText(this.NjR);
        }
        if (!TextUtils.isEmpty(this.eT)) {
            this.f10758vc.setText(this.eT);
        } else {
            this.f10758vc.setText(com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.YoT)) {
            this.wN.setText(this.YoT);
        } else {
            this.wN.setText(com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), "tt_negtive_txt"));
        }
        int i10 = this.GA;
        if (i10 != -1) {
            this.Sg.setImageResource(i10);
            this.Sg.setVisibility(0);
        } else {
            this.Sg.setVisibility(8);
        }
        if (this.pDU) {
            this.DSW.setVisibility(8);
            this.wN.setVisibility(8);
        } else {
            this.wN.setVisibility(0);
            this.DSW.setVisibility(0);
        }
    }

    private void YFl() {
        this.f10758vc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Sg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YFl yFl = Sg.this.YFl;
                if (yFl != null) {
                    yFl.YFl();
                }
            }
        });
        this.wN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Sg.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YFl yFl = Sg.this.YFl;
                if (yFl != null) {
                    yFl.Sg();
                }
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(YFl(this.qsH));
        setCanceledOnTouchOutside(false);
        Sg();
        YFl();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Sg();
    }

    public Sg tN(String str) {
        this.YoT = str;
        return this;
    }

    private View YFl(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        dsw.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        wNVar.setMinimumWidth(YFl(260.0f));
        wNVar.setPadding(0, YFl(32.0f), 0, 0);
        wNVar.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_custom_dialog_bg"));
        wNVar.setOrientation(1);
        wNVar.setLayoutParams(layoutParams);
        this.tN = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = YFl(16.0f);
        layoutParams2.rightMargin = YFl(16.0f);
        layoutParams2.bottomMargin = YFl(16.0f);
        this.tN.setGravity(17);
        this.tN.setVisibility(0);
        this.tN.setTextColor(Color.parseColor("#333333"));
        this.tN.setTextSize(18.0f);
        this.tN.setLayoutParams(layoutParams2);
        this.Sg = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = YFl(16.0f);
        layoutParams3.rightMargin = YFl(16.0f);
        layoutParams3.bottomMargin = YFl(10.0f);
        this.Sg.setMaxHeight(YFl(150.0f));
        this.Sg.setMaxWidth(YFl(150.0f));
        this.Sg.setVisibility(0);
        this.Sg.setLayoutParams(layoutParams3);
        this.AlY = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = YFl(20.0f);
        layoutParams4.rightMargin = YFl(20.0f);
        this.AlY.setGravity(17);
        this.AlY.setLineSpacing(YFl(3.0f), 1.2f);
        this.AlY.setTextSize(18.0f);
        this.AlY.setTextColor(Color.parseColor("#000000"));
        this.AlY.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = YFl(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        wNVar2.setOrientation(0);
        wNVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.wN.YFl yFl = new com.bytedance.sdk.openadsdk.core.wN.YFl(context);
        this.wN = yFl;
        yFl.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = YFl(10.0f);
        layoutParams7.weight = 1.0f;
        this.wN.setPadding(0, YFl(16.0f), 0, YFl(16.0f));
        this.wN.setBackground(null);
        this.wN.setGravity(17);
        this.wN.setSingleLine(true);
        this.wN.setTextColor(Color.parseColor("#999999"));
        this.wN.setTextSize(16.0f);
        this.wN.setLayoutParams(layoutParams7);
        this.DSW = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.DSW.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.DSW.setLayoutParams(layoutParams8);
        this.f10758vc = new com.bytedance.sdk.openadsdk.core.wN.YFl(context);
        this.wN.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = YFl(10.0f);
        layoutParams9.weight = 1.0f;
        this.f10758vc.setPadding(0, YFl(16.0f), 0, YFl(16.0f));
        this.f10758vc.setBackground(null);
        this.f10758vc.setGravity(17);
        this.f10758vc.setSingleLine(true);
        this.f10758vc.setTextColor(Color.parseColor("#38ADFF"));
        this.f10758vc.setTextSize(16.0f);
        this.f10758vc.setLayoutParams(layoutParams9);
        dsw.addView(wNVar);
        wNVar.addView(this.tN);
        wNVar.addView(this.Sg);
        wNVar.addView(this.AlY);
        wNVar.addView(view);
        wNVar.addView(wNVar2);
        wNVar2.addView(this.wN);
        wNVar2.addView(this.DSW);
        wNVar2.addView(this.f10758vc);
        return dsw;
    }

    public Sg Sg(String str) {
        this.eT = str;
        return this;
    }

    private int YFl(float f10) {
        return GS.tN(getContext(), f10);
    }

    public Sg YFl(YFl yFl) {
        this.YFl = yFl;
        return this;
    }

    public Sg YFl(String str) {
        this.NjR = str;
        return this;
    }
}
