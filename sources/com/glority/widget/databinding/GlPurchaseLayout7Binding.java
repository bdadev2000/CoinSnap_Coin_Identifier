package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPurchaseLayout7Binding implements ViewBinding {
    public final GlTextView billedMonthly;
    public final GlTextView billedWeek;
    public final CardView ll7DayFree;
    public final ConstraintLayout ll7DayFreeBg;
    public final CardView llMonthly;
    public final ConstraintLayout llMonthlyBg;
    public final CardView llWeekly;
    public final ConstraintLayout llWeeklyBg;
    public final GlTextView monthlyTitle;
    private final LinearLayout rootView;
    public final TextView tv7DayFreeTrial;
    public final TextView tvContinue;
    public final TextView tvMonthlyPrice;
    public final GlTextView tvSpecialOffer;
    public final TextView tvWeeklyPrice;
    public final GlTextView weeklyTitle;

    private GlPurchaseLayout7Binding(LinearLayout linearLayout, GlTextView glTextView, GlTextView glTextView2, CardView cardView, ConstraintLayout constraintLayout, CardView cardView2, ConstraintLayout constraintLayout2, CardView cardView3, ConstraintLayout constraintLayout3, GlTextView glTextView3, TextView textView, TextView textView2, TextView textView3, GlTextView glTextView4, TextView textView4, GlTextView glTextView5) {
        this.rootView = linearLayout;
        this.billedMonthly = glTextView;
        this.billedWeek = glTextView2;
        this.ll7DayFree = cardView;
        this.ll7DayFreeBg = constraintLayout;
        this.llMonthly = cardView2;
        this.llMonthlyBg = constraintLayout2;
        this.llWeekly = cardView3;
        this.llWeeklyBg = constraintLayout3;
        this.monthlyTitle = glTextView3;
        this.tv7DayFreeTrial = textView;
        this.tvContinue = textView2;
        this.tvMonthlyPrice = textView3;
        this.tvSpecialOffer = glTextView4;
        this.tvWeeklyPrice = textView4;
        this.weeklyTitle = glTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout7Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout7Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout7, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout7Binding bind(View view) {
        int i = R.id.billed_monthly;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            i = R.id.billed_week;
            GlTextView glTextView2 = (GlTextView) view.findViewById(i);
            if (glTextView2 != null) {
                i = R.id.ll_7_day_free;
                CardView cardView = (CardView) view.findViewById(i);
                if (cardView != null) {
                    i = R.id.ll_7_day_free_bg;
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                    if (constraintLayout != null) {
                        i = R.id.ll_monthly;
                        CardView cardView2 = (CardView) view.findViewById(i);
                        if (cardView2 != null) {
                            i = R.id.ll_monthly_bg;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(i);
                            if (constraintLayout2 != null) {
                                i = R.id.ll_weekly;
                                CardView cardView3 = (CardView) view.findViewById(i);
                                if (cardView3 != null) {
                                    i = R.id.ll_weekly_bg;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(i);
                                    if (constraintLayout3 != null) {
                                        i = R.id.monthly_title;
                                        GlTextView glTextView3 = (GlTextView) view.findViewById(i);
                                        if (glTextView3 != null) {
                                            i = R.id.tv_7_day_free_trial;
                                            TextView textView = (TextView) view.findViewById(i);
                                            if (textView != null) {
                                                i = R.id.tv_continue;
                                                TextView textView2 = (TextView) view.findViewById(i);
                                                if (textView2 != null) {
                                                    i = R.id.tv_monthly_price;
                                                    TextView textView3 = (TextView) view.findViewById(i);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_special_offer;
                                                        GlTextView glTextView4 = (GlTextView) view.findViewById(i);
                                                        if (glTextView4 != null) {
                                                            i = R.id.tv_weekly_price;
                                                            TextView textView4 = (TextView) view.findViewById(i);
                                                            if (textView4 != null) {
                                                                i = R.id.weekly_title;
                                                                GlTextView glTextView5 = (GlTextView) view.findViewById(i);
                                                                if (glTextView5 != null) {
                                                                    return new GlPurchaseLayout7Binding((LinearLayout) view, glTextView, glTextView2, cardView, constraintLayout, cardView2, constraintLayout2, cardView3, constraintLayout3, glTextView3, textView, textView2, textView3, glTextView4, textView4, glTextView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
