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
public final class GlPurchaseLayout6Binding implements ViewBinding {
    public final TextView containerV;
    public final LinearLayout llMonthly;
    public final LinearLayout llWeekly;
    public final LinearLayout llYearly;
    private final FrameLayout rootView;
    public final GlTextView tvInfo;
    public final TextView tvMonthlyPrice;
    public final TextView tvPrice1;
    public final TextView tvPrice2;
    public final TextView tvPrice3;
    public final TextView tvWeeklyPrice;

    private GlPurchaseLayout6Binding(FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, GlTextView glTextView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = frameLayout;
        this.containerV = textView;
        this.llMonthly = linearLayout;
        this.llWeekly = linearLayout2;
        this.llYearly = linearLayout3;
        this.tvInfo = glTextView;
        this.tvMonthlyPrice = textView2;
        this.tvPrice1 = textView3;
        this.tvPrice2 = textView4;
        this.tvPrice3 = textView5;
        this.tvWeeklyPrice = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout6Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout6Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout6, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout6Binding bind(View view) {
        int i = R.id.container_v;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.ll_monthly;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = R.id.ll_weekly;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null) {
                    i = R.id.ll_yearly;
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                    if (linearLayout3 != null) {
                        i = R.id.tv_info;
                        GlTextView glTextView = (GlTextView) view.findViewById(i);
                        if (glTextView != null) {
                            i = R.id.tv_monthly_price;
                            TextView textView2 = (TextView) view.findViewById(i);
                            if (textView2 != null) {
                                i = R.id.tv_price1;
                                TextView textView3 = (TextView) view.findViewById(i);
                                if (textView3 != null) {
                                    i = R.id.tv_price2;
                                    TextView textView4 = (TextView) view.findViewById(i);
                                    if (textView4 != null) {
                                        i = R.id.tv_price3;
                                        TextView textView5 = (TextView) view.findViewById(i);
                                        if (textView5 != null) {
                                            i = R.id.tv_weekly_price;
                                            TextView textView6 = (TextView) view.findViewById(i);
                                            if (textView6 != null) {
                                                return new GlPurchaseLayout6Binding((FrameLayout) view, textView, linearLayout, linearLayout2, linearLayout3, glTextView, textView2, textView3, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
