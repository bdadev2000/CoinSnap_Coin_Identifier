package com.glority.purchase.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.purchase.ui.R;

/* loaded from: classes9.dex */
public abstract class MemshipMemo26284aActivityManageMemberShipBinding extends ViewDataBinding {
    public final ScrollView aScrollView;
    public final TextView bEndDate;
    public final ImageView bIvClose;
    public final TextView bPayType;
    public final TextView bPremium;
    public final TextView bStartDate;
    public final TextView bTextDate;
    public final TextView bTvChange;
    public final TextView bTvKeep;

    /* JADX INFO: Access modifiers changed from: protected */
    public MemshipMemo26284aActivityManageMemberShipBinding(Object obj, View view, int i, ScrollView scrollView, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.aScrollView = scrollView;
        this.bEndDate = textView;
        this.bIvClose = imageView;
        this.bPayType = textView2;
        this.bPremium = textView3;
        this.bStartDate = textView4;
        this.bTextDate = textView5;
        this.bTvChange = textView6;
        this.bTvKeep = textView7;
    }

    public static MemshipMemo26284aActivityManageMemberShipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MemshipMemo26284aActivityManageMemberShipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (MemshipMemo26284aActivityManageMemberShipBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.memship_memo26284a_activity_manage_member_ship, viewGroup, z, obj);
    }

    public static MemshipMemo26284aActivityManageMemberShipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MemshipMemo26284aActivityManageMemberShipBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (MemshipMemo26284aActivityManageMemberShipBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.memship_memo26284a_activity_manage_member_ship, null, false, obj);
    }

    public static MemshipMemo26284aActivityManageMemberShipBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MemshipMemo26284aActivityManageMemberShipBinding bind(View view, Object obj) {
        return (MemshipMemo26284aActivityManageMemberShipBinding) bind(obj, view, R.layout.memship_memo26284a_activity_manage_member_ship);
    }
}
