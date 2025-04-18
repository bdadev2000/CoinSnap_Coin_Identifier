package com.bytedance.sdk.openadsdk.tN;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.tN.nc;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.List;

/* loaded from: classes.dex */
public class NjR extends com.bytedance.sdk.openadsdk.core.wN.tN implements nc.AlY, nc.Sg, nc.YFl, nc.tN {
    private final nc AlY;
    private eT DSW;
    private int GA;
    private View NjR;
    private int Sg;
    vc YFl;
    private int YoT;
    private com.bytedance.sdk.openadsdk.core.wN.qsH eT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wN.AlY f10806nc;
    private FilterWord pDU;
    private View qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private TextView f10807vc;
    private com.bytedance.sdk.openadsdk.core.wN.qsH wN;

    public NjR(Context context, nc ncVar) {
        this(context, ncVar, null);
    }

    private boolean AlY() {
        if (this.YoT == 0) {
            tN();
        }
        return this.YoT < this.GA;
    }

    private com.bytedance.sdk.openadsdk.core.wN.qsH Sg(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AlY() ? this.Sg : GS.tN(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.tN);
        int rgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(rgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.tN);
        gradientDrawable2.setColor(rgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i10 = this.tN;
        qsh.setPadding(0, i10, 0, i10);
        qsh.setGravity(17);
        qsh.setBackground(stateListDrawable);
        qsh.setTextColor(-1);
        qsh.setTextSize(16.0f);
        qsh.setText(qO.YFl(context, "tt_suggestion_commit"));
        qsh.setEnabled(false);
        qsh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.tN.NjR.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NjR.this.AlY.AlY();
            }
        });
        qsh.setLayoutParams(layoutParams);
        return qsh;
    }

    private void tN() {
        if (this.YoT > 0) {
            return;
        }
        this.YoT = GS.tN(getContext());
        int AlY = GS.AlY(getContext());
        this.GA = AlY;
        this.AlY.YFl(this.YoT, AlY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wN.tN, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.YoT == 0) {
                tN();
            }
            layoutParams.width = Math.min(this.YoT, this.GA) - (GS.tN(getContext(), 16.0f) * 2);
        }
    }

    public NjR(Context context, nc ncVar, List<FilterWord> list) {
        super(context);
        this.AlY = ncVar;
        ncVar.YFl((nc.tN) this);
        ncVar.YFl((nc.Sg) this);
        ncVar.YFl((nc.AlY) this);
        ncVar.YFl((nc.YFl) this);
        tN();
        YFl(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        Sg(list);
    }

    private void YFl(Context context) {
        this.tN = GS.tN(context, 8.0f);
        this.Sg = GS.tN(context, 20.0f);
        int tN = GS.tN(context, 56.0f);
        int tN2 = GS.tN(context, 30.0f);
        int tN3 = GS.tN(context, 12.0f);
        if (AlY()) {
            tN3 = this.Sg;
        }
        if (!AlY()) {
            tN = tN2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, GS.tN(getContext(), 98.0f));
        view.setBackground(qO.tN(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.tN);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        int tN4 = GS.tN(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(tN4, tN4);
        layoutParams3.setMargins(0, tN3, tN3, 0);
        layoutParams3.gravity = 8388661;
        alY.setImageDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_titlebar_close_seletor"));
        addView(alY, layoutParams3);
        alY.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.tN.NjR.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                NjR.this.AlY.wN();
            }
        });
        com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        this.f10806nc = alY2;
        alY2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.tN.NjR.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                NjR.this.Sg();
            }
        });
        this.f10806nc.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tN4, tN4);
        layoutParams4.setMargins(tN3, tN3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable YFl = com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_leftbackicon_selector");
        YFl.setAutoMirrored(true);
        this.f10806nc.setImageDrawable(YFl);
        addView(this.f10806nc, layoutParams4);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(tN3, tN, tN3, tN3);
        wNVar.setOrientation(1);
        addView(wNVar, layoutParams5);
        View tN5 = tN(context);
        this.qsH = tN5;
        wNVar.addView(tN5);
        View AlY = AlY(context);
        this.NjR = AlY;
        wNVar.addView(AlY);
        com.bytedance.sdk.openadsdk.core.wN.qsH Sg = Sg(context);
        this.wN = Sg;
        wNVar.addView(Sg);
    }

    private View AlY(Context context) {
        int tN;
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setOrientation(1);
        if (!AlY()) {
            tN = GS.tN(context, 200.0f);
        } else {
            tN = GS.tN(context, 358.0f);
        }
        wNVar.setLayoutParams(new LinearLayout.LayoutParams(-1, tN));
        TextView textView = new TextView(context);
        textView.setText(qO.YFl(context, "tt_select_reason"));
        textView.setTextSize(AlY() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = GS.tN(context, AlY() ? 24.0f : 4.0f);
        wNVar.addView(textView, layoutParams);
        vc vcVar = new vc(context, this.AlY);
        this.YFl = vcVar;
        wNVar.addView(vcVar);
        if (rkt.JwO().iY()) {
            com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
            this.eT = qsh;
            qsh.setId(GA.MZ);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = AlY() ? this.Sg : GS.tN(context, 6.0f);
            layoutParams2.gravity = 17;
            this.eT.setLayoutParams(layoutParams2);
            this.eT.setFocusable(false);
            this.eT.setHint(qO.YFl(context, "tt_add_bad_reason"));
            this.eT.setHintTextColor(Color.parseColor("#57000000"));
            this.eT.setTextColor(Color.rgb(22, 24, 35));
            this.eT.setTextSize(15.0f);
            this.eT.setGravity(8388615);
            this.eT.setVisibility(0);
            this.eT.setPadding(0, GS.tN(context, 15.0f), 0, GS.tN(context, 14.0f));
            this.eT.setEllipsize(TextUtils.TruncateAt.END);
            this.eT.setSingleLine();
            this.eT.setMaxLines(1);
            this.eT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.tN.NjR.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NjR.this.AlY.vc();
                }
            });
            wNVar.addView(this.eT, layoutParams2);
            wNVar.addView(new eT(context, Color.argb(128, 0, 0, 0)));
        }
        wNVar.setVisibility(8);
        return wNVar;
    }

    private View tN(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        wNVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(qO.YFl(context, "tt_like_this_ad"));
        textView.setTextSize(AlY() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        wNVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(qO.YFl(context, "tt_feel_hint"));
        textView2.setTextSize(AlY() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (AlY()) {
            layoutParams2.topMargin = GS.tN(context, 4.0f);
        }
        wNVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int tN = GS.tN(context, 16.0f);
        int tN2 = GS.tN(context, 12.0f);
        int tN3 = GS.tN(context, 8.0f);
        if (AlY()) {
            layoutParams3.topMargin = tN;
            layoutParams3.bottomMargin = tN;
        } else {
            layoutParams3.topMargin = tN2;
            layoutParams3.bottomMargin = tN3;
        }
        wNVar.addView(wNVar2, layoutParams3);
        wNVar2.addView(new wN(context, 1, this.AlY));
        wN wNVar3 = new wN(context, 2, this.AlY);
        ViewGroup.LayoutParams layoutParams4 = wNVar3.getLayoutParams();
        boolean z10 = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z10) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = tN;
        layoutParams7.rightMargin = tN;
        wNVar2.addView(wNVar3, layoutParams5);
        wNVar2.addView(new wN(context, 3, this.AlY));
        eT eTVar = new eT(context);
        this.DSW = eTVar;
        wNVar.addView(eTVar);
        this.f10807vc = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!AlY()) {
            tN = tN3;
        }
        layoutParams8.topMargin = tN;
        this.f10807vc.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10807vc.setPadding(tN2, tN3, tN2, tN3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(tN3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.f10807vc.setBackground(gradientDrawable);
        this.f10807vc.setText(qO.YFl(context, "tt_report_this_ad"));
        this.f10807vc.setTextSize(AlY() ? 14 : 12);
        Drawable tN4 = qO.tN(context, "tt_report_ad_arrow");
        tN4.setBounds(0, 0, tN2, tN2);
        this.f10807vc.setCompoundDrawables(null, null, tN4, null);
        this.f10807vc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.tN.NjR.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NjR.this.YFl();
            }
        });
        wNVar.addView(this.f10807vc, layoutParams8);
        return wNVar;
    }

    private void Sg(List<FilterWord> list) {
        this.YFl.YFl(list);
    }

    public void Sg() {
        View view = this.NjR;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.qsH;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = this.f10806nc;
        if (alY != null) {
            alY.setVisibility(8);
        }
        nc ncVar = this.AlY;
        if (ncVar != null) {
            FilterWord filterWord = this.pDU;
            if (filterWord != null) {
                ncVar.YFl(filterWord);
            } else {
                ncVar.YFl(nc.YFl);
            }
            this.AlY.tN(null);
        }
    }

    public void YFl() {
        View view = this.NjR;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.qsH;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = this.f10806nc;
        if (alY != null) {
            alY.setVisibility(0);
        }
        nc ncVar = this.AlY;
        if (ncVar == null || !ncVar.tN()) {
            return;
        }
        this.pDU = this.AlY.Sg();
    }

    @Override // com.bytedance.sdk.openadsdk.tN.nc.tN
    public void YFl(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.wN != null && TextUtils.isEmpty(this.AlY.DSW())) {
            this.wN.setEnabled(!nc.YFl.equals(filterWord));
        }
        if (wN.YFl.equals(filterWord) || wN.Sg.equals(filterWord)) {
            this.f10807vc.setVisibility(8);
            this.DSW.setVisibility(8);
        }
        if (wN.tN.equals(filterWord) || nc.YFl.equals(filterWord)) {
            this.f10807vc.setVisibility(0);
            this.DSW.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tN.nc.Sg
    public void YFl(int i10) {
        if (nc.tN == i10) {
            this.pDU = null;
            Sg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tN.nc.AlY
    public void YFl(String str) {
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh;
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = this.eT;
        if (qsh2 != null) {
            qsh2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            nc ncVar = this.AlY;
            if (ncVar == null || (qsh = this.wN) == null) {
                return;
            }
            qsh.setEnabled(ncVar.tN());
            return;
        }
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = this.wN;
        if (qsh3 != null) {
            qsh3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tN.nc.YFl
    public void YFl(List<FilterWord> list) {
        Sg(list);
    }
}
