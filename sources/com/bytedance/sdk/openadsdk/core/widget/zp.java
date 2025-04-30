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
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGButton;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;

/* loaded from: classes.dex */
public class zp extends Dialog {
    private String Bj;
    private PAGButton COT;
    private PAGButton HWF;
    private PAGTextView KS;
    private View QR;
    private String YW;
    private String dT;
    private PAGTextView jU;
    private final Context ku;
    private PAGImageView lMd;
    private boolean rV;
    private int tG;
    private String vDp;
    public InterfaceC0120zp zp;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0120zp {
        void lMd();

        void zp();
    }

    public zp(Context context) {
        super(context, cz.HWF(context, "tt_custom_dialog"));
        this.tG = -1;
        this.rV = false;
        this.ku = context;
    }

    private void lMd() {
        if (!TextUtils.isEmpty(this.dT)) {
            this.KS.setText(this.dT);
            this.KS.setVisibility(0);
        } else {
            this.KS.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.YW)) {
            this.jU.setText(this.YW);
        }
        if (!TextUtils.isEmpty(this.Bj)) {
            this.HWF.setText(this.Bj);
        } else {
            this.HWF.setText(cz.zp(KVG.zp(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.vDp)) {
            this.COT.setText(this.vDp);
        } else {
            this.COT.setText(cz.zp(KVG.zp(), "tt_negtive_txt"));
        }
        int i9 = this.tG;
        if (i9 != -1) {
            this.lMd.setImageResource(i9);
            this.lMd.setVisibility(0);
        } else {
            this.lMd.setVisibility(8);
        }
        if (this.rV) {
            this.QR.setVisibility(8);
            this.COT.setVisibility(8);
        } else {
            this.COT.setVisibility(0);
            this.QR.setVisibility(0);
        }
    }

    private void zp() {
        this.HWF.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0120zp interfaceC0120zp = zp.this.zp;
                if (interfaceC0120zp != null) {
                    interfaceC0120zp.zp();
                }
            }
        });
        this.COT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0120zp interfaceC0120zp = zp.this.zp;
                if (interfaceC0120zp != null) {
                    interfaceC0120zp.lMd();
                }
            }
        });
    }

    public zp KS(String str) {
        this.vDp = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(zp(this.ku));
        setCanceledOnTouchOutside(false);
        lMd();
        zp();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        lMd();
    }

    private View zp(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        pAGLinearLayout.setMinimumWidth(zp(260.0f));
        pAGLinearLayout.setPadding(0, zp(32.0f), 0, 0);
        pAGLinearLayout.setBackground(ku.zp(context, "tt_custom_dialog_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        this.KS = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = zp(16.0f);
        layoutParams2.rightMargin = zp(16.0f);
        layoutParams2.bottomMargin = zp(16.0f);
        this.KS.setGravity(17);
        this.KS.setVisibility(0);
        this.KS.setTextColor(Color.parseColor("#333333"));
        this.KS.setTextSize(18.0f);
        this.KS.setLayoutParams(layoutParams2);
        this.lMd = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = zp(16.0f);
        layoutParams3.rightMargin = zp(16.0f);
        layoutParams3.bottomMargin = zp(10.0f);
        this.lMd.setMaxHeight(zp(150.0f));
        this.lMd.setMaxWidth(zp(150.0f));
        this.lMd.setVisibility(0);
        this.lMd.setLayoutParams(layoutParams3);
        this.jU = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = zp(20.0f);
        layoutParams4.rightMargin = zp(20.0f);
        this.jU.setGravity(17);
        this.jU.setLineSpacing(zp(3.0f), 1.2f);
        this.jU.setTextSize(18.0f);
        this.jU.setTextColor(Color.parseColor("#000000"));
        this.jU.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = zp(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        PAGButton pAGButton = new PAGButton(context);
        this.COT = pAGButton;
        pAGButton.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = zp(10.0f);
        layoutParams7.weight = 1.0f;
        this.COT.setPadding(0, zp(16.0f), 0, zp(16.0f));
        this.COT.setBackground(null);
        this.COT.setGravity(17);
        this.COT.setSingleLine(true);
        this.COT.setTextColor(Color.parseColor("#999999"));
        this.COT.setTextSize(16.0f);
        this.COT.setLayoutParams(layoutParams7);
        this.QR = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.QR.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.QR.setLayoutParams(layoutParams8);
        this.HWF = new PAGButton(context);
        this.COT.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = zp(10.0f);
        layoutParams9.weight = 1.0f;
        this.HWF.setPadding(0, zp(16.0f), 0, zp(16.0f));
        this.HWF.setBackground(null);
        this.HWF.setGravity(17);
        this.HWF.setSingleLine(true);
        this.HWF.setTextColor(Color.parseColor("#38ADFF"));
        this.HWF.setTextSize(16.0f);
        this.HWF.setLayoutParams(layoutParams9);
        pAGRelativeLayout.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.KS);
        pAGLinearLayout.addView(this.lMd);
        pAGLinearLayout.addView(this.jU);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.COT);
        pAGLinearLayout2.addView(this.QR);
        pAGLinearLayout2.addView(this.HWF);
        return pAGRelativeLayout;
    }

    public zp lMd(String str) {
        this.Bj = str;
        return this;
    }

    private int zp(float f9) {
        return WNy.lMd(getContext(), f9);
    }

    public zp zp(InterfaceC0120zp interfaceC0120zp) {
        this.zp = interfaceC0120zp;
        return this;
    }

    public zp zp(String str) {
        this.YW = str;
        return this;
    }
}
