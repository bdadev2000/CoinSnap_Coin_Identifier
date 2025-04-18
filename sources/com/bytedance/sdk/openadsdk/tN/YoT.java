package com.bytedance.sdk.openadsdk.tN;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.Locale;

/* loaded from: classes.dex */
public class YoT extends Dialog {
    private com.bytedance.sdk.openadsdk.core.wN.qsH AlY;
    private String DSW;
    private String NjR;
    private YFl Sg;
    private com.bytedance.sdk.openadsdk.core.wN.wN YFl;

    /* renamed from: nc, reason: collision with root package name */
    private final nc f10808nc;
    private String qsH;
    private com.bytedance.sdk.openadsdk.core.wN.Sg tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wN.AlY f10809vc;
    private com.bytedance.sdk.openadsdk.core.wN.qsH wN;

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg();

        void YFl();

        void YFl(int i10, FilterWord filterWord, String str);

        void tN();
    }

    public YoT(@NonNull Context context, nc ncVar) {
        super(context, qO.vc(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.f10808nc = ncVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Sg();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.wN.wN YFl2 = YFl(lG.YFl());
        this.YFl = YFl2;
        setContentView(YFl2);
        YFl(this.YFl);
        tN();
        YFl();
        AlY();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        YFl yFl = this.Sg;
        if (yFl != null) {
            yFl.YFl();
        }
    }

    private void AlY() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.tN.YoT.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (YoT.this.Sg != null) {
                    YoT.this.Sg.tN();
                }
            }
        });
    }

    private void YFl(View view) {
        YFl((EditText) this.tN);
        nc ncVar = this.f10808nc;
        if (ncVar != null) {
            String DSW = ncVar.DSW();
            if (!TextUtils.isEmpty(DSW)) {
                this.tN.setText(DSW);
                this.AlY.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(DSW.length()), "/200"));
            }
            this.wN.setEnabled(!TextUtils.isEmpty(DSW));
        }
        this.wN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.tN.YoT.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String obj = YoT.this.tN.getText().toString();
                if (YoT.this.Sg != null) {
                    YoT.this.Sg.YFl(4, nc.YFl, obj);
                }
                YoT.this.dismiss();
            }
        });
        this.f10809vc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.tN.YoT.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (YoT.this.Sg != null) {
                    YoT.this.Sg.Sg();
                }
                YoT.this.dismiss();
            }
        });
        this.tN.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.tN.YoT.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                com.bytedance.sdk.openadsdk.core.wN.qsH qsh;
                int round = Math.round(charSequence.length());
                YoT.this.AlY.setText(round + "/200");
                boolean z10 = true;
                if (round <= 0) {
                    qsh = YoT.this.wN;
                    if (YoT.this.f10808nc == null || TextUtils.isEmpty(YoT.this.f10808nc.DSW())) {
                        z10 = false;
                    }
                } else if (!YoT.this.wN.isEnabled()) {
                    qsh = YoT.this.wN;
                } else {
                    return;
                }
                qsh.setEnabled(z10);
            }
        });
    }

    private void tN() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    public void Sg() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.wN.Sg sg2 = this.tN;
        if (sg2 == null || (inputMethodManager = (InputMethodManager) sg2.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.YFl.getWindowToken(), 0);
    }

    public static void YFl(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.tN.YoT.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                while (i10 < i11) {
                    int type = Character.getType(charSequence.charAt(i10));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i10++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void YFl(YFl yFl) {
        this.Sg = yFl;
    }

    public void YFl() {
        com.bytedance.sdk.openadsdk.core.wN.Sg sg2 = this.tN;
        if (sg2 == null) {
            return;
        }
        sg2.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void YFl(String str, String str2) {
        this.DSW = str;
        this.qsH = str2;
        nc ncVar = this.f10808nc;
        if (ncVar != null) {
            ncVar.AlY(str2);
        }
    }

    public void YFl(String str) {
        this.NjR = str;
    }

    private com.bytedance.sdk.openadsdk.core.wN.wN YFl(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        wNVar.setOrientation(1);
        wNVar.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        dsw.setLayoutParams(new LinearLayout.LayoutParams(-1, GS.tN(context, 48.0f)));
        this.f10809vc = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        int tN = GS.tN(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tN, tN);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int tN2 = GS.tN(context, 10.0f);
        layoutParams.topMargin = tN2;
        layoutParams.rightMargin = tN2;
        this.f10809vc.setLayoutParams(layoutParams);
        this.f10809vc.setClickable(true);
        this.f10809vc.setFocusable(true);
        this.f10809vc.setImageDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = GS.tN(context, 12.0f);
        qsh.setLayoutParams(layoutParams2);
        qsh.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        qsh.setGravity(17);
        qsh.setSingleLine(true);
        qsh.setText(qO.YFl(context, "tt_other_reason"));
        qsh.setTextColor(Color.parseColor("#161823"));
        qsh.setTextSize(15.0f);
        qsh.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, GS.tN(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        wNVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.wN.Sg sg2 = new com.bytedance.sdk.openadsdk.core.wN.Sg(context);
        this.tN = sg2;
        sg2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = GS.tN(context, 16.0f);
        layoutParams3.rightMargin = GS.tN(context, 16.0f);
        layoutParams3.topMargin = GS.tN(context, 11.5f);
        this.tN.setLayoutParams(layoutParams3);
        this.tN.setLines(4);
        this.tN.setGravity(48);
        this.tN.setHint(qO.YFl(context, "tt_suggestion_description"));
        this.tN.setTextSize(15.0f);
        this.tN.setTextColor(Color.rgb(22, 24, 35));
        this.tN.setHintTextColor(Color.parseColor("#57161823"));
        this.tN.setBackground(null);
        this.tN.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar3 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int tN3 = GS.tN(context, 16.0f);
        int tN4 = GS.tN(context, 17.0f);
        wNVar3.setPadding(tN3, tN4, tN3, tN4);
        wNVar3.setLayoutParams(layoutParams4);
        wNVar3.setOrientation(0);
        this.AlY = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 8388611;
        this.AlY.setLayoutParams(layoutParams5);
        this.AlY.setText(String.format("0%s", "/200"));
        this.AlY.setGravity(8388611);
        this.AlY.setTextColor(Color.parseColor("#57161823"));
        this.AlY.setTextSize(15.0f);
        this.wN = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388613;
        this.wN.setLayoutParams(layoutParams6);
        this.wN.setTextSize(14.0f);
        this.wN.setTextColor(-1);
        this.wN.setVisibility(0);
        this.wN.setSingleLine(true);
        int tN5 = GS.tN(context, 27.0f);
        int tN6 = GS.tN(context, 5.0f);
        this.wN.setPadding(tN5, tN6, tN5, tN6);
        int tN7 = GS.tN(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = tN7;
        gradientDrawable.setCornerRadius(f10);
        int rgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(rgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(rgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.wN.setBackground(stateListDrawable);
        this.wN.setText(qO.YFl(context, "tt_done"));
        this.wN.setEnabled(false);
        wNVar.addView(dsw);
        wNVar.addView(view);
        wNVar.addView(wNVar2);
        dsw.addView(this.f10809vc);
        dsw.addView(qsh);
        wNVar2.addView(this.tN);
        wNVar2.addView(wNVar3);
        wNVar3.addView(this.AlY);
        wNVar3.addView(this.wN);
        return wNVar;
    }
}
