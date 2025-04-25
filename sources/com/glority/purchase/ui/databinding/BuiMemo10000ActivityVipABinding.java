package com.glority.purchase.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.purchase.ui.R;

/* loaded from: classes9.dex */
public final class BuiMemo10000ActivityVipABinding implements ViewBinding {
    public final LinearLayout container;
    public final FrameLayout content;
    public final ImageView ivClose;
    public final LinearLayout ll7DayFree;
    public final FrameLayout llMask;
    public final LinearLayout llMonthly;
    public final LinearLayout llYearly;
    private final FrameLayout rootView;
    public final ScrollView svTop;
    public final TextView tvContinue;
    public final TextView tvDataPolicy;
    public final TextView tvMonthlyPrice;
    public final TextView tvRestore;
    public final TextView tvSpecialOffer;
    public final TextView tvThenYearPrice;
    public final TextView tvYearlyPrice;

    private BuiMemo10000ActivityVipABinding(FrameLayout frameLayout, LinearLayout linearLayout, FrameLayout frameLayout2, ImageView imageView, LinearLayout linearLayout2, FrameLayout frameLayout3, LinearLayout linearLayout3, LinearLayout linearLayout4, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = frameLayout;
        this.container = linearLayout;
        this.content = frameLayout2;
        this.ivClose = imageView;
        this.ll7DayFree = linearLayout2;
        this.llMask = frameLayout3;
        this.llMonthly = linearLayout3;
        this.llYearly = linearLayout4;
        this.svTop = scrollView;
        this.tvContinue = textView;
        this.tvDataPolicy = textView2;
        this.tvMonthlyPrice = textView3;
        this.tvRestore = textView4;
        this.tvSpecialOffer = textView5;
        this.tvThenYearPrice = textView6;
        this.tvYearlyPrice = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static BuiMemo10000ActivityVipABinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BuiMemo10000ActivityVipABinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bui_memo10000_activity_vip_a, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BuiMemo10000ActivityVipABinding bind(View view) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ll_7_day_free;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.ll_mask;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        i = R.id.ll_monthly;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout3 != null) {
                            i = R.id.ll_yearly;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout4 != null) {
                                i = R.id.sv_top;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    i = R.id.tv_continue;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.tv_data_policy;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.tv_monthly_price;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.tv_restore;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = R.id.tv_special_offer;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = R.id.tv_then_year_price;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView6 != null) {
                                                            i = R.id.tv_yearly_price;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView7 != null) {
                                                                return new BuiMemo10000ActivityVipABinding(frameLayout, linearLayout, frameLayout, imageView, linearLayout2, frameLayout2, linearLayout3, linearLayout4, scrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
