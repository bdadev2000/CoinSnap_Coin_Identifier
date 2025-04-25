package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class FragmentAboutBinding extends ViewDataBinding {
    public final TextView aboutDesc;
    public final TextView aboutInfo;
    public final CardView clContactEmail;
    public final CardView cvContentContainer;
    public final TextView email;
    public final LayoutSettingToolbarBinding naviBar;
    public final TextView tvVersion;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentAboutBinding(Object obj, View view, int i, TextView textView, TextView textView2, CardView cardView, CardView cardView2, TextView textView3, LayoutSettingToolbarBinding layoutSettingToolbarBinding, TextView textView4) {
        super(obj, view, i);
        this.aboutDesc = textView;
        this.aboutInfo = textView2;
        this.clContactEmail = cardView;
        this.cvContentContainer = cardView2;
        this.email = textView3;
        this.naviBar = layoutSettingToolbarBinding;
        this.tvVersion = textView4;
    }

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentAboutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_about, viewGroup, z, obj);
    }

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentAboutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_about, null, false, obj);
    }

    public static FragmentAboutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAboutBinding bind(View view, Object obj) {
        return (FragmentAboutBinding) bind(obj, view, R.layout.fragment_about);
    }
}
