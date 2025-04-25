package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.settings.R;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes5.dex */
public abstract class FragmentFaqAndHelpBinding extends ViewDataBinding {
    public final Button btnContactUs;
    public final LayoutToolbarBinding naviBar;
    public final RecyclerView rvFaq;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentFaqAndHelpBinding(Object obj, View view, int i, Button button, LayoutToolbarBinding layoutToolbarBinding, RecyclerView recyclerView) {
        super(obj, view, i);
        this.btnContactUs = button;
        this.naviBar = layoutToolbarBinding;
        this.rvFaq = recyclerView;
    }

    public static FragmentFaqAndHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFaqAndHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentFaqAndHelpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_faq_and_help, viewGroup, z, obj);
    }

    public static FragmentFaqAndHelpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFaqAndHelpBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentFaqAndHelpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_faq_and_help, null, false, obj);
    }

    public static FragmentFaqAndHelpBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFaqAndHelpBinding bind(View view, Object obj) {
        return (FragmentFaqAndHelpBinding) bind(obj, view, R.layout.fragment_faq_and_help);
    }
}
