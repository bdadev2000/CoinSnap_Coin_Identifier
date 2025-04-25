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
public final class GlPurchaseLayout5Binding implements ViewBinding {
    public final GlTextView billedPurchase1;
    public final GlTextView billedPurchase3;
    public final CardView llPurchase1;
    public final ConstraintLayout llPurchase1Bg;
    public final CardView llPurchase2;
    public final ConstraintLayout llPurchase2Bg;
    public final CardView llPurchase3;
    public final ConstraintLayout llPurchase3Bg;
    public final GlTextView purchase1Title;
    public final GlTextView purchase3Info;
    public final GlTextView purchase3Title;
    private final LinearLayout rootView;
    public final GlTextView tv7DayFreeTrial;
    public final TextView tvContinue;
    public final TextView tvPurchase1Price;
    public final TextView tvPurchase3Price;
    public final GlTextView tvSpecialOffer;
    public final TextView tvThenYearPrice;

    private GlPurchaseLayout5Binding(LinearLayout linearLayout, GlTextView glTextView, GlTextView glTextView2, CardView cardView, ConstraintLayout constraintLayout, CardView cardView2, ConstraintLayout constraintLayout2, CardView cardView3, ConstraintLayout constraintLayout3, GlTextView glTextView3, GlTextView glTextView4, GlTextView glTextView5, GlTextView glTextView6, TextView textView, TextView textView2, TextView textView3, GlTextView glTextView7, TextView textView4) {
        this.rootView = linearLayout;
        this.billedPurchase1 = glTextView;
        this.billedPurchase3 = glTextView2;
        this.llPurchase1 = cardView;
        this.llPurchase1Bg = constraintLayout;
        this.llPurchase2 = cardView2;
        this.llPurchase2Bg = constraintLayout2;
        this.llPurchase3 = cardView3;
        this.llPurchase3Bg = constraintLayout3;
        this.purchase1Title = glTextView3;
        this.purchase3Info = glTextView4;
        this.purchase3Title = glTextView5;
        this.tv7DayFreeTrial = glTextView6;
        this.tvContinue = textView;
        this.tvPurchase1Price = textView2;
        this.tvPurchase3Price = textView3;
        this.tvSpecialOffer = glTextView7;
        this.tvThenYearPrice = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlPurchaseLayout5Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlPurchaseLayout5Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_purchase_layout5, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlPurchaseLayout5Binding bind(View view) {
        int i = R.id.billed_purchase1;
        GlTextView glTextView = (GlTextView) view.findViewById(i);
        if (glTextView != null) {
            i = R.id.billed_purchase3;
            GlTextView glTextView2 = (GlTextView) view.findViewById(i);
            if (glTextView2 != null) {
                i = R.id.ll_purchase1;
                CardView cardView = (CardView) view.findViewById(i);
                if (cardView != null) {
                    i = R.id.ll_purchase1_bg;
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                    if (constraintLayout != null) {
                        i = R.id.ll_purchase2;
                        CardView cardView2 = (CardView) view.findViewById(i);
                        if (cardView2 != null) {
                            i = R.id.ll_purchase2_bg;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(i);
                            if (constraintLayout2 != null) {
                                i = R.id.ll_purchase3;
                                CardView cardView3 = (CardView) view.findViewById(i);
                                if (cardView3 != null) {
                                    i = R.id.ll_purchase3_bg;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(i);
                                    if (constraintLayout3 != null) {
                                        i = R.id.purchase1_title;
                                        GlTextView glTextView3 = (GlTextView) view.findViewById(i);
                                        if (glTextView3 != null) {
                                            i = R.id.purchase3_info;
                                            GlTextView glTextView4 = (GlTextView) view.findViewById(i);
                                            if (glTextView4 != null) {
                                                i = R.id.purchase3_title;
                                                GlTextView glTextView5 = (GlTextView) view.findViewById(i);
                                                if (glTextView5 != null) {
                                                    i = R.id.tv_7_day_free_trial;
                                                    GlTextView glTextView6 = (GlTextView) view.findViewById(i);
                                                    if (glTextView6 != null) {
                                                        i = R.id.tv_continue;
                                                        TextView textView = (TextView) view.findViewById(i);
                                                        if (textView != null) {
                                                            i = R.id.tv_purchase1_price;
                                                            TextView textView2 = (TextView) view.findViewById(i);
                                                            if (textView2 != null) {
                                                                i = R.id.tv_purchase3_price;
                                                                TextView textView3 = (TextView) view.findViewById(i);
                                                                if (textView3 != null) {
                                                                    i = R.id.tv_special_offer;
                                                                    GlTextView glTextView7 = (GlTextView) view.findViewById(i);
                                                                    if (glTextView7 != null) {
                                                                        i = R.id.tv_then_year_price;
                                                                        TextView textView4 = (TextView) view.findViewById(i);
                                                                        if (textView4 != null) {
                                                                            return new GlPurchaseLayout5Binding((LinearLayout) view, glTextView, glTextView2, cardView, constraintLayout, cardView2, constraintLayout2, cardView3, constraintLayout3, glTextView3, glTextView4, glTextView5, glTextView6, textView, textView2, textView3, glTextView7, textView4);
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
