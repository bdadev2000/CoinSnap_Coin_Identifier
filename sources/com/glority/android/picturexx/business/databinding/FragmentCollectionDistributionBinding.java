package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentCollectionDistributionBinding extends ViewDataBinding {
    public final ComposeView composeView;
    public final AppCompatImageView ivClose;
    public final FragmentContainerView mapViewFragment;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCollectionDistributionBinding(Object _bindingComponent, View _root, int _localFieldCount, ComposeView composeView, AppCompatImageView ivClose, FragmentContainerView mapViewFragment) {
        super(_bindingComponent, _root, _localFieldCount);
        this.composeView = composeView;
        this.ivClose = ivClose;
        this.mapViewFragment = mapViewFragment;
    }

    public static FragmentCollectionDistributionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionDistributionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCollectionDistributionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_distribution, root, attachToRoot, component);
    }

    public static FragmentCollectionDistributionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionDistributionBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCollectionDistributionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_distribution, null, false, component);
    }

    public static FragmentCollectionDistributionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionDistributionBinding bind(View view, Object component) {
        return (FragmentCollectionDistributionBinding) bind(component, view, R.layout.fragment_collection_distribution);
    }
}
