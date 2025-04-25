package com.glority.android.guide.memo51262.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.guide.memo51262.R;

/* loaded from: classes3.dex */
public abstract class BuiMemo512621PurchaseLayoutBinding extends ViewDataBinding {
    public final FrameLayout continueFl;
    public final AppCompatTextView continueTv;
    public final LottieAnimationView ivAnima;
    public final LottieAnimationView ivAnima2;
    public final ImageView ivClose;
    public final LinearLayout llRootContainer;
    public final LinearLayout llYearlyWeeklyItem;
    public final LinearLayout llYearlyYearlyItem;

    @Bindable
    protected String mPercentage;

    @Bindable
    protected Integer mSelectedIndex;

    @Bindable
    protected Integer mTrialDays;
    public final TextView policyTv;
    public final ScrollView sv;
    public final TextView tv17000Local;
    public final TextView tv80Scholars;
    public final TextView tvNearly5Years;
    public final AppCompatTextView tvPricePerWeek1;
    public final AppCompatTextView tvPricePerWeek2;
    public final AppCompatTextView tvRestore;
    public final AppCompatTextView tvSavePercentage;
    public final AppCompatTextView tvYearlyCost;

    public abstract void setPercentage(String str);

    public abstract void setSelectedIndex(Integer num);

    public abstract void setTrialDays(Integer num);

    /* JADX INFO: Access modifiers changed from: protected */
    public BuiMemo512621PurchaseLayoutBinding(Object obj, View view, int i, FrameLayout frameLayout, AppCompatTextView appCompatTextView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, ScrollView scrollView, TextView textView2, TextView textView3, TextView textView4, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        super(obj, view, i);
        this.continueFl = frameLayout;
        this.continueTv = appCompatTextView;
        this.ivAnima = lottieAnimationView;
        this.ivAnima2 = lottieAnimationView2;
        this.ivClose = imageView;
        this.llRootContainer = linearLayout;
        this.llYearlyWeeklyItem = linearLayout2;
        this.llYearlyYearlyItem = linearLayout3;
        this.policyTv = textView;
        this.sv = scrollView;
        this.tv17000Local = textView2;
        this.tv80Scholars = textView3;
        this.tvNearly5Years = textView4;
        this.tvPricePerWeek1 = appCompatTextView2;
        this.tvPricePerWeek2 = appCompatTextView3;
        this.tvRestore = appCompatTextView4;
        this.tvSavePercentage = appCompatTextView5;
        this.tvYearlyCost = appCompatTextView6;
    }

    public Integer getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public Integer getTrialDays() {
        return this.mTrialDays;
    }

    public String getPercentage() {
        return this.mPercentage;
    }

    public static BuiMemo512621PurchaseLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo512621PurchaseLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BuiMemo512621PurchaseLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_memo512621_purchase_layout, viewGroup, z, obj);
    }

    public static BuiMemo512621PurchaseLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo512621PurchaseLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BuiMemo512621PurchaseLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_memo512621_purchase_layout, null, false, obj);
    }

    public static BuiMemo512621PurchaseLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo512621PurchaseLayoutBinding bind(View view, Object obj) {
        return (BuiMemo512621PurchaseLayoutBinding) bind(obj, view, R.layout.bui_memo512621_purchase_layout);
    }
}
