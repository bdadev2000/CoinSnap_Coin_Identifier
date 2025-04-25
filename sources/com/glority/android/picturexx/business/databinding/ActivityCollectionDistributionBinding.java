package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ActivityCollectionDistributionBinding extends ViewDataBinding {
    public final FrameLayout fragmentContainer;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityCollectionDistributionBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout fragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentContainer = fragmentContainer;
    }

    public static ActivityCollectionDistributionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCollectionDistributionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityCollectionDistributionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_collection_distribution, root, attachToRoot, component);
    }

    public static ActivityCollectionDistributionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCollectionDistributionBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityCollectionDistributionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_collection_distribution, null, false, component);
    }

    public static ActivityCollectionDistributionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCollectionDistributionBinding bind(View view, Object component) {
        return (ActivityCollectionDistributionBinding) bind(component, view, R.layout.activity_collection_distribution);
    }
}
