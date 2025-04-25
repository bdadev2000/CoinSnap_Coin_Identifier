package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewMeCollectionFunctionZoneBinding extends ViewDataBinding {
    public final AppCompatImageView ivMeCollectionHistory;
    public final AppCompatImageView ivMeCollectionSearch;
    public final AppCompatImageView ivMeCollectionSettings;
    public final AppCompatImageView ivMeCollectionWish;

    @Bindable
    protected Boolean mRedDotVisible;

    public abstract void setRedDotVisible(Boolean redDotVisible);

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewMeCollectionFunctionZoneBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivMeCollectionHistory, AppCompatImageView ivMeCollectionSearch, AppCompatImageView ivMeCollectionSettings, AppCompatImageView ivMeCollectionWish) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivMeCollectionHistory = ivMeCollectionHistory;
        this.ivMeCollectionSearch = ivMeCollectionSearch;
        this.ivMeCollectionSettings = ivMeCollectionSettings;
        this.ivMeCollectionWish = ivMeCollectionWish;
    }

    public Boolean getRedDotVisible() {
        return this.mRedDotVisible;
    }

    public static ViewMeCollectionFunctionZoneBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionFunctionZoneBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewMeCollectionFunctionZoneBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_function_zone, root, attachToRoot, component);
    }

    public static ViewMeCollectionFunctionZoneBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionFunctionZoneBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewMeCollectionFunctionZoneBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_function_zone, null, false, component);
    }

    public static ViewMeCollectionFunctionZoneBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionFunctionZoneBinding bind(View view, Object component) {
        return (ViewMeCollectionFunctionZoneBinding) bind(component, view, R.layout.view_me_collection_function_zone);
    }
}
