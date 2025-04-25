package com.glority.android.guide.memo51261.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.guide.memo51261.R;

/* loaded from: classes3.dex */
public abstract class BuiMemo51261ActivityVipLayoutBinding extends ViewDataBinding {
    public final FrameLayout content;
    public final ImageView ivClose;
    public final FrameLayout llMask;
    public final LinearLayout llMonthly;
    public final LinearLayout llWeekly;
    public final LinearLayout llYearly;
    public final ScrollView svTop;
    public final TextView tv17000Local;
    public final TextView tv80Scholars;
    public final AppCompatTextView tvContinue;
    public final TextView tvDataPolicy;
    public final TextView tvMonthlyPrice;
    public final TextView tvNearly5Years;
    public final TextView tvPricePerMonth;
    public final TextView tvRestore;
    public final TextView tvSavePercent;
    public final TextView tvSubtitle;
    public final TextView tvWeeklyPrice;
    public final TextView tvYearlyPrice;

    /* JADX INFO: Access modifiers changed from: protected */
    public BuiMemo51261ActivityVipLayoutBinding(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ScrollView scrollView, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        super(obj, view, i);
        this.content = frameLayout;
        this.ivClose = imageView;
        this.llMask = frameLayout2;
        this.llMonthly = linearLayout;
        this.llWeekly = linearLayout2;
        this.llYearly = linearLayout3;
        this.svTop = scrollView;
        this.tv17000Local = textView;
        this.tv80Scholars = textView2;
        this.tvContinue = appCompatTextView;
        this.tvDataPolicy = textView3;
        this.tvMonthlyPrice = textView4;
        this.tvNearly5Years = textView5;
        this.tvPricePerMonth = textView6;
        this.tvRestore = textView7;
        this.tvSavePercent = textView8;
        this.tvSubtitle = textView9;
        this.tvWeeklyPrice = textView10;
        this.tvYearlyPrice = textView11;
    }

    public static BuiMemo51261ActivityVipLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo51261ActivityVipLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BuiMemo51261ActivityVipLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_memo51261_activity_vip_layout, viewGroup, z, obj);
    }

    public static BuiMemo51261ActivityVipLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo51261ActivityVipLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BuiMemo51261ActivityVipLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bui_memo51261_activity_vip_layout, null, false, obj);
    }

    public static BuiMemo51261ActivityVipLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BuiMemo51261ActivityVipLayoutBinding bind(View view, Object obj) {
        return (BuiMemo51261ActivityVipLayoutBinding) bind(obj, view, R.layout.bui_memo51261_activity_vip_layout);
    }
}
