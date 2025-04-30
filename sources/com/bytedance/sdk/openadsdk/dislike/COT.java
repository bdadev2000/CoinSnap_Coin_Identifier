package com.bytedance.sdk.openadsdk.dislike;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
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
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGEditText;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class COT extends Dialog {
    private PAGTextView COT;
    private PAGImageView HWF;
    private PAGEditText KS;
    private String QR;
    private PAGTextView jU;
    private String ku;
    private zp lMd;
    private PAGLinearLayout zp;

    /* loaded from: classes.dex */
    public interface zp {
        void KS();

        void lMd();

        void zp();

        void zp(int i9, FilterWord filterWord);
    }

    public COT(@NonNull Context context) {
        super(context, cz.HWF(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        lMd();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PAGLinearLayout zp2 = zp(KVG.zp());
        this.zp = zp2;
        setContentView(zp2);
        zp(this.zp);
        KS();
        zp();
        jU();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        zp zpVar = this.lMd;
        if (zpVar != null) {
            zpVar.zp();
        }
    }

    private void KS() {
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

    private void jU() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.dislike.COT.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (COT.this.lMd != null) {
                    COT.this.lMd.KS();
                }
            }
        });
    }

    private void zp(View view) {
        zp((EditText) this.KS);
        this.COT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.COT.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String obj = COT.this.KS.getText().toString();
                if (obj.length() > 0 && !obj.isEmpty()) {
                    FilterWord filterWord = new FilterWord("0:00", obj);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(filterWord);
                    com.bytedance.sdk.openadsdk.dislike.zp.zp().zp(COT.this.QR, arrayList, COT.this.ku, obj);
                    if (COT.this.lMd != null) {
                        COT.this.lMd.zp(4, filterWord);
                    }
                    COT.this.dismiss();
                }
            }
        });
        this.HWF.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.COT.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (COT.this.lMd != null) {
                    COT.this.lMd.lMd();
                }
                COT.this.dismiss();
            }
        });
        this.KS.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.dislike.COT.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                int round = Math.round(charSequence.length());
                COT.this.jU.setText(String.valueOf(round));
                if (round > 0) {
                    COT.this.COT.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    COT.this.COT.setClickable(true);
                } else {
                    COT.this.COT.setTextColor(-7829368);
                    COT.this.COT.setClickable(false);
                }
            }
        });
    }

    public void lMd() {
        InputMethodManager inputMethodManager;
        PAGEditText pAGEditText = this.KS;
        if (pAGEditText == null || (inputMethodManager = (InputMethodManager) pAGEditText.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.zp.getWindowToken(), 0);
    }

    public static void zp(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.dislike.COT.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
                while (i9 < i10) {
                    int type = Character.getType(charSequence.charAt(i9));
                    if (type != 19 && type != 28) {
                        i9++;
                    } else {
                        return "";
                    }
                }
                return null;
            }
        }, new InputFilter.LengthFilter(500)});
    }

    public void zp(zp zpVar) {
        this.lMd = zpVar;
    }

    public void zp() {
        PAGEditText pAGEditText = this.KS;
        if (pAGEditText == null) {
            return;
        }
        pAGEditText.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void zp(String str, String str2) {
        this.QR = str;
        this.ku = str2;
    }

    private PAGLinearLayout zp(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setBackground(ku.zp(context, "tt_dislike_dialog_bg"));
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, WNy.lMd(context, 48.0f)));
        this.HWF = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(16);
        layoutParams.topMargin = WNy.lMd(context, 12.0f);
        layoutParams.leftMargin = WNy.lMd(context, 12.0f);
        this.HWF.setLayoutParams(layoutParams);
        this.HWF.setClickable(true);
        this.HWF.setFocusable(true);
        this.HWF.setImageDrawable(ku.zp(context, "tt_titlebar_close_seletor"));
        PAGTextView pAGTextView = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = WNy.lMd(context, 12.0f);
        pAGTextView.setLayoutParams(layoutParams2);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pAGTextView.setGravity(17);
        pAGTextView.setSingleLine(true);
        pAGTextView.setText(cz.zp(context, "tt_display_error"));
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(15.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(0));
        this.COT = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(16);
        layoutParams3.topMargin = WNy.lMd(context, 12.0f);
        layoutParams3.leftMargin = WNy.lMd(context, 5.0f);
        layoutParams3.rightMargin = WNy.lMd(context, 12.0f);
        this.COT.setLayoutParams(layoutParams3);
        this.COT.setPadding(0, 0, WNy.lMd(context, 12.0f), 0);
        this.COT.setTextSize(14.0f);
        this.COT.setTextColor(-7829368);
        this.COT.setClickable(false);
        this.COT.setVisibility(0);
        this.COT.setGravity(5);
        this.COT.setSingleLine(true);
        this.COT.setText(cz.zp(context, "tt_suggestion_commit"));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, WNy.lMd(context, 0.5f)));
        view.setBackgroundColor(Color.parseColor("#0F161823"));
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        pAGLinearLayout2.setOrientation(0);
        this.KS = new PAGEditText(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 15.0f;
        layoutParams4.leftMargin = WNy.lMd(context, 12.0f);
        layoutParams4.topMargin = WNy.lMd(context, 11.5f);
        this.KS.setLayoutParams(layoutParams4);
        this.KS.setLines(7);
        this.KS.setHint(cz.zp(context, "tt_suggestion_description"));
        this.KS.setGravity(3);
        this.KS.setTextSize(15.0f);
        this.KS.setTextColor(Color.parseColor("#161823"));
        this.KS.setHintTextColor(Color.parseColor("#57161823"));
        this.KS.setBackground(null);
        this.KS.setImeOptions(268435456);
        this.jU = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.rightMargin = WNy.lMd(context, 12.0f);
        layoutParams5.bottomMargin = WNy.lMd(context, 6.0f);
        layoutParams5.gravity = 80;
        this.jU.setLayoutParams(layoutParams5);
        this.jU.setText("0");
        this.jU.setGravity(5);
        this.jU.setTextColor(Color.parseColor("#BF161823"));
        this.jU.setHintTextColor(Color.parseColor("#57161823"));
        this.jU.setTextSize(12.0f);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGRelativeLayout.addView(this.HWF);
        pAGRelativeLayout.addView(pAGTextView);
        pAGRelativeLayout.addView(this.COT);
        pAGLinearLayout2.addView(this.KS);
        pAGLinearLayout2.addView(this.jU);
        return pAGLinearLayout;
    }
}
