package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.settings.databinding.LayoutSettingToolbarBinding;

/* loaded from: classes2.dex */
public abstract class FragmentAboutBinding extends ViewDataBinding {
    public final TextView aboutDesc;
    public final TextView aboutInfo;
    public final CardView clContactEmail;
    public final CardView cvContentContainer;
    public final TextView email;
    public final LayoutSettingToolbarBinding naviBar;
    public final TextView tvVersion;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentAboutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView aboutDesc, TextView aboutInfo, CardView clContactEmail, CardView cvContentContainer, TextView email, LayoutSettingToolbarBinding naviBar, TextView tvVersion) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aboutDesc = aboutDesc;
        this.aboutInfo = aboutInfo;
        this.clContactEmail = clContactEmail;
        this.cvContentContainer = cvContentContainer;
        this.email = email;
        this.naviBar = naviBar;
        this.tvVersion = tvVersion;
    }

    public static FragmentAboutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAboutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentAboutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_about, root, attachToRoot, component);
    }

    public static FragmentAboutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAboutBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentAboutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_about, null, false, component);
    }

    public static FragmentAboutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAboutBinding bind(View view, Object component) {
        return (FragmentAboutBinding) bind(component, view, R.layout.fragment_about);
    }
}
