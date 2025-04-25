package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPurchaseLayout11Binding implements ViewBinding {
    public final TextView containerV;
    public final LinearLayout llContinue;
    public final LinearLayout llWeekly;
    public final LinearLayout llYearly;
    private final FrameLayout rootView;
    public final GlTextView tvWeeklyPrice;
    public final GlTextView tvYearPrice;

    private GlPurchaseLayout11Binding(FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, GlTextView glTextView, GlTextView glTextView2) {
        this.rootView = frameLayout;
        this.containerV = textView;
        this.llContinue = linearLayout;
        this.llWeekly = linearLayout2;
        this.llYearly = linearLayout3;
        this.tvWeeklyPrice = glTextView;
        this.tvYearPrice = glTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout11Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout11Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout11, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout11Binding bind(View view) {
        int i = R.id.container_v;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.ll_continue;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = R.id.ll_weekly;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null) {
                    i = R.id.ll_yearly;
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                    if (linearLayout3 != null) {
                        i = R.id.tv_weekly_price;
                        GlTextView glTextView = (GlTextView) view.findViewById(i);
                        if (glTextView != null) {
                            i = R.id.tv_year_price;
                            GlTextView glTextView2 = (GlTextView) view.findViewById(i);
                            if (glTextView2 != null) {
                                return new GlPurchaseLayout11Binding((FrameLayout) view, textView, linearLayout, linearLayout2, linearLayout3, glTextView, glTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
