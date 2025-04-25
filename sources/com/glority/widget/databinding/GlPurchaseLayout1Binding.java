package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPurchaseLayout1Binding implements ViewBinding {
    public final GlTextView billedMonthly;
    public final GlTextView billedWeek;
    public final GlTextView billedYearly;
    public final ConstraintLayout ll7DayFree;
    public final ConstraintLayout llMonthly;
    public final ConstraintLayout llWeekly;
    public final GlTextView monthlyTitle;
    private final LinearLayout rootView;
    public final GlTextView tv7DayFreeTrial;
    public final TextView tvContinue;
    public final TextView tvMonthlyPrice;
    public final TextView tvSpecialOffer;
    public final GlTextView tvThenYearPrice;
    public final TextView tvWeeklyPrice;
    public final GlTextView weeklyTitle;

    private GlPurchaseLayout1Binding(LinearLayout linearLayout, GlTextView glTextView, GlTextView glTextView2, GlTextView glTextView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, GlTextView glTextView4, GlTextView glTextView5, TextView textView, TextView textView2, TextView textView3, GlTextView glTextView6, TextView textView4, GlTextView glTextView7) {
        this.rootView = linearLayout;
        this.billedMonthly = glTextView;
        this.billedWeek = glTextView2;
        this.billedYearly = glTextView3;
        this.ll7DayFree = constraintLayout;
        this.llMonthly = constraintLayout2;
        this.llWeekly = constraintLayout3;
        this.monthlyTitle = glTextView4;
        this.tv7DayFreeTrial = glTextView5;
        this.tvContinue = textView;
        this.tvMonthlyPrice = textView2;
        this.tvSpecialOffer = textView3;
        this.tvThenYearPrice = glTextView6;
        this.tvWeeklyPrice = textView4;
        this.weeklyTitle = glTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout1Binding bind(View view) {
        int i = R.id.billed_monthly;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            i = R.id.billed_week;
            GlTextView glTextView2 = (GlTextView) view.findViewById(i);
            if (glTextView2 != null) {
                i = R.id.billed_yearly;
                GlTextView glTextView3 = (GlTextView) view.findViewById(i);
                if (glTextView3 != null) {
                    i = R.id.ll_7_day_free;
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                    if (constraintLayout != null) {
                        i = R.id.ll_monthly;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(i);
                        if (constraintLayout2 != null) {
                            i = R.id.ll_weekly;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(i);
                            if (constraintLayout3 != null) {
                                i = R.id.monthly_title;
                                GlTextView glTextView4 = (GlTextView) view.findViewById(i);
                                if (glTextView4 != null) {
                                    i = R.id.tv_7_day_free_trial;
                                    GlTextView glTextView5 = (GlTextView) view.findViewById(i);
                                    if (glTextView5 != null) {
                                        i = R.id.tv_continue;
                                        TextView textView = (TextView) view.findViewById(i);
                                        if (textView != null) {
                                            i = R.id.tv_monthly_price;
                                            TextView textView2 = (TextView) view.findViewById(i);
                                            if (textView2 != null) {
                                                i = R.id.tv_special_offer;
                                                TextView textView3 = (TextView) view.findViewById(i);
                                                if (textView3 != null) {
                                                    i = R.id.tv_then_year_price;
                                                    GlTextView glTextView6 = (GlTextView) view.findViewById(i);
                                                    if (glTextView6 != null) {
                                                        i = R.id.tv_weekly_price;
                                                        TextView textView4 = (TextView) view.findViewById(i);
                                                        if (textView4 != null) {
                                                            i = R.id.weekly_title;
                                                            GlTextView glTextView7 = (GlTextView) view.findViewById(i);
                                                            if (glTextView7 != null) {
                                                                return new GlPurchaseLayout1Binding((LinearLayout) view, glTextView, glTextView2, glTextView3, constraintLayout, constraintLayout2, constraintLayout3, glTextView4, glTextView5, textView, textView2, textView3, glTextView6, textView4, glTextView7);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
