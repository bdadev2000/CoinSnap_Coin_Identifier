package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlPurchaseLayout8Binding implements ViewBinding {
    public final GlTextView billedMonthly;
    public final GlTextView billedWeek;
    public final CardView ll7DayFree;
    public final ConstraintLayout ll7DayFreeBg;
    public final CardView llMonthly;
    public final ConstraintLayout llMonthlyBg;
    public final CardView llWeekly;
    public final ConstraintLayout llWeeklyBg;
    public final GlTextView monthlyTitle;
    public final ImageView rightTopIcon;
    private final FrameLayout rootView;
    public final GlTextView tv7DayFreeTrial;
    public final TextView tvContinue;
    public final TextView tvLimited;
    public final TextView tvMonthlyPrice;
    public final TextView tvSpecialOffer;
    public final TextView tvWeeklyPrice;
    public final GlTextView weeklyTitle;

    private GlPurchaseLayout8Binding(FrameLayout frameLayout, GlTextView glTextView, GlTextView glTextView2, CardView cardView, ConstraintLayout constraintLayout, CardView cardView2, ConstraintLayout constraintLayout2, CardView cardView3, ConstraintLayout constraintLayout3, GlTextView glTextView3, ImageView imageView, GlTextView glTextView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, GlTextView glTextView5) {
        this.rootView = frameLayout;
        this.billedMonthly = glTextView;
        this.billedWeek = glTextView2;
        this.ll7DayFree = cardView;
        this.ll7DayFreeBg = constraintLayout;
        this.llMonthly = cardView2;
        this.llMonthlyBg = constraintLayout2;
        this.llWeekly = cardView3;
        this.llWeeklyBg = constraintLayout3;
        this.monthlyTitle = glTextView3;
        this.rightTopIcon = imageView;
        this.tv7DayFreeTrial = glTextView4;
        this.tvContinue = textView;
        this.tvLimited = textView2;
        this.tvMonthlyPrice = textView3;
        this.tvSpecialOffer = textView4;
        this.tvWeeklyPrice = textView5;
        this.weeklyTitle = glTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout8Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout8Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout8, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout8Binding bind(View view) {
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
                                            i = R.id.right_top_icon;
                                            ImageView imageView = (ImageView) view.findViewById(i);
                                            if (imageView != null) {
                                                i = R.id.tv_7_day_free_trial;
                                                GlTextView glTextView4 = (GlTextView) view.findViewById(i);
                                                if (glTextView4 != null) {
                                                    i = R.id.tv_continue;
                                                    TextView textView = (TextView) view.findViewById(i);
                                                    if (textView != null) {
                                                        i = R.id.tv_limited;
                                                        TextView textView2 = (TextView) view.findViewById(i);
                                                        if (textView2 != null) {
                                                            i = R.id.tv_monthly_price;
                                                            TextView textView3 = (TextView) view.findViewById(i);
                                                            if (textView3 != null) {
                                                                i = R.id.tv_special_offer;
                                                                TextView textView4 = (TextView) view.findViewById(i);
                                                                if (textView4 != null) {
                                                                    i = R.id.tv_weekly_price;
                                                                    TextView textView5 = (TextView) view.findViewById(i);
                                                                    if (textView5 != null) {
                                                                        i = R.id.weekly_title;
                                                                        GlTextView glTextView5 = (GlTextView) view.findViewById(i);
                                                                        if (glTextView5 != null) {
                                                                            return new GlPurchaseLayout8Binding((FrameLayout) view, glTextView, glTextView2, cardView, constraintLayout, cardView2, constraintLayout2, cardView3, constraintLayout3, glTextView3, imageView, glTextView4, textView, textView2, textView3, textView4, textView5, glTextView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
