package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentCollectionDistributionListBinding extends ViewDataBinding {
    public final ComposeView composeView;
    public final AppCompatImageView ivClose;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCollectionDistributionListBinding(Object _bindingComponent, View _root, int _localFieldCount, ComposeView composeView, AppCompatImageView ivClose) {
        super(_bindingComponent, _root, _localFieldCount);
        this.composeView = composeView;
        this.ivClose = ivClose;
    }

    public static FragmentCollectionDistributionListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionDistributionListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCollectionDistributionListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_distribution_list, root, attachToRoot, component);
    }

    public static FragmentCollectionDistributionListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionDistributionListBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCollectionDistributionListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_distribution_list, null, false, component);
    }

    public static FragmentCollectionDistributionListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionDistributionListBinding bind(View view, Object component) {
        return (FragmentCollectionDistributionListBinding) bind(component, view, R.layout.fragment_collection_distribution_list);
    }
}
