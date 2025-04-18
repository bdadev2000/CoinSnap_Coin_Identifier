package com.bytedance.sdk.openadsdk.tN;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.tN.nc;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class wN extends com.bytedance.sdk.openadsdk.core.wN.wN implements View.OnClickListener, nc.tN {
    private StateListDrawable DSW;
    private final int qsH;

    /* renamed from: vc, reason: collision with root package name */
    private FilterWord f10812vc;
    private final nc wN;
    public static FilterWord YFl = new FilterWord("100:1", "GOOD");
    public static FilterWord Sg = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord tN = new FilterWord("100:3", "BAD");
    public static List<wN> AlY = new ArrayList(3);

    public wN(@NonNull Context context, int i10, nc ncVar) {
        super(context);
        this.qsH = i10;
        this.wN = ncVar;
        if (ncVar != null) {
            ncVar.YFl(this);
        }
        YFl(i10);
        YFl();
        Sg();
        AlY.add(this);
    }

    private void Sg() {
        int i10;
        float f10;
        int i11;
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(getContext());
        if (this.wN.NjR()) {
            i10 = 40;
        } else {
            i10 = 30;
        }
        qsh.setTextSize(i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Context context = getContext();
        if (this.wN.NjR()) {
            f10 = 8.0f;
        } else {
            f10 = 4.0f;
        }
        layoutParams.setMargins(0, GS.tN(getContext(), 12.0f), 0, GS.tN(context, f10));
        addView(qsh, layoutParams);
        YFl yFl = new YFl(getContext());
        if (this.wN.NjR()) {
            i11 = 17;
        } else {
            i11 = 12;
        }
        yFl.setTextSize(i11);
        yFl.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        yFl.setMaxLines(1);
        yFl.setSingleLine();
        yFl.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, GS.tN(getContext(), 12.0f));
        addView(yFl, layoutParams2);
        int i12 = this.qsH;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    yFl.setText(qO.YFl(getContext(), "tt_bad"));
                    qsh.setText("😡");
                    return;
                }
                return;
            }
            yFl.setText(qO.YFl(getContext(), "tt_not_bad"));
            qsh.setText("😐");
            return;
        }
        qsh.setText("😍");
        yFl.setText(qO.YFl(getContext(), "tt_good"));
    }

    private void YFl(int i10) {
        if (i10 == 1) {
            this.f10812vc = YFl;
        } else if (i10 == 2) {
            this.f10812vc = Sg;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f10812vc = tN;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.wN.YFl(nc.YFl);
        } else {
            this.wN.YFl(this.f10812vc);
        }
    }

    private void YFl() {
        if (this.DSW == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(GS.tN(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(GS.tN(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(GS.tN(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.DSW = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.DSW.addState(new int[0], gradientDrawable);
        }
        setBackground(this.DSW);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.tN.nc.tN
    public void YFl(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.f10812vc) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
