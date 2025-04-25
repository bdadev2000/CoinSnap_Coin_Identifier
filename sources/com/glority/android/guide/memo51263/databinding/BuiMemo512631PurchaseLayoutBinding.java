package com.glority.android.guide.memo51263.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.guide.memo51263.R;

/* loaded from: classes3.dex */
public abstract class BuiMemo512631PurchaseLayoutBinding extends ViewDataBinding {
    public final ConstraintLayout clWeeklyItem;
    public final ConstraintLayout clYearlyItem;
    public final FrameLayout continueFl;
    public final AppCompatTextView continueTv;
    public final LottieAnimationView ivAnima;
    public final LottieAnimationView ivAnima2;
    public final ImageView ivClose;
    public final LinearLayout llRootContainer;

    @Bindable
    protected String mPercentage;

    @Bindable
    protected String mPricePerWeek;

    @Bindable
    protected Integer mSelectedIndex;

    @Bindable
    protected Integer mTrialDays;

    @Bindable
    protected String mWeeklyPrice;

    @Bindable
    protected String mYearlyPrice;
    public final TextView policyTv;
    public final LinearLayout reminderLayout;
    public final ScrollView sv;
    public final SwitchCompat switch1;
    public final TextView tv17000Local;
    public final TextView tv80Scholars;
    public final TextView tvNearly5Years;
    public final AppCompatTextView tvReminderGuide;
    public final AppCompatTextView tvRestore;
    public final AppCompatTextView tvYearlyPrice;

    public abstract void setPercentage(String str);

    public abstract void setPricePerWeek(String str);

    public abstract void setSelectedIndex(Integer num);

    public abstract void setTrialDays(Integer num);

    public abstract void setWeeklyPrice(String str);

    public abstract void setYearlyPrice(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public BuiMemo512631PurchaseLayoutBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, AppCompatTextView appCompatTextView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, ImageView imageView, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, ScrollView scrollView, SwitchCompat switchCompat, TextView textView2, TextView textView3, TextView textView4, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i);
        this.clWeeklyItem = constraintLayout;
        this.clYearlyItem = constraintLayout2;
        this.continueFl = frameLayout;
        this.continueTv = appCompatTextView;
        this.ivAnima = lottieAnimationView;
        this.ivAnima2 = lottieAnimationView2;
        this.ivClose = imageView;
        this.llRootContainer = linearLayout;
        this.policyTv = textView;
        this.reminderLayout = linearLayout2;
        this.sv = scrollView;
        this.switch1 = switchCompat;
        this.tv17000Local = textView2;
        this.tv80Scholars = textView3;
        this.tvNearly5Years = textView4;
        this.tvReminderGuide = appCompatTextView2;
        this.tvRestore = appCompatTextView3;
        this.tvYearlyPrice = appCompatTextView4;
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

    public String getWeeklyPrice() {
        return this.mWeeklyPrice;
    }

    public String getYearlyPrice() {
        return this.mYearlyPrice;
    }

    public String getPricePerWeek() {
        return this.mPricePerWeek;
    }

    public static BuiMemo512631PurchaseLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo512631PurchaseLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BuiMemo512631PurchaseLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_memo512631_purchase_layout, viewGroup, z, obj);
    }

    public static BuiMemo512631PurchaseLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo512631PurchaseLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BuiMemo512631PurchaseLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_memo512631_purchase_layout, null, false, obj);
    }

    public static BuiMemo512631PurchaseLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo512631PurchaseLayoutBinding bind(View view, Object obj) {
        return (BuiMemo512631PurchaseLayoutBinding) bind(obj, view, R.layout.bui_memo512631_purchase_layout);
    }
}
