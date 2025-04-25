package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.base.databinding.LayoutToolbarBinding;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class CustomFragmentFaqAndHelpBinding extends ViewDataBinding {
    public final MaterialButton btnContactUs;
    public final LayoutToolbarBinding naviBar;
    public final RecyclerView rvFaq;

    /* JADX INFO: Access modifiers changed from: protected */
    public CustomFragmentFaqAndHelpBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton btnContactUs, LayoutToolbarBinding naviBar, RecyclerView rvFaq) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnContactUs = btnContactUs;
        this.naviBar = naviBar;
        this.rvFaq = rvFaq;
    }

    public static CustomFragmentFaqAndHelpBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomFragmentFaqAndHelpBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CustomFragmentFaqAndHelpBinding) ViewDataBinding.inflateInternal(inflater, R.layout.custom_fragment_faq_and_help, root, attachToRoot, component);
    }

    public static CustomFragmentFaqAndHelpBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomFragmentFaqAndHelpBinding inflate(LayoutInflater inflater, Object component) {
        return (CustomFragmentFaqAndHelpBinding) ViewDataBinding.inflateInternal(inflater, R.layout.custom_fragment_faq_and_help, null, false, component);
    }

    public static CustomFragmentFaqAndHelpBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomFragmentFaqAndHelpBinding bind(View view, Object component) {
        return (CustomFragmentFaqAndHelpBinding) bind(component, view, R.layout.custom_fragment_faq_and_help);
    }
}
