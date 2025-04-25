package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewMeCollectionPageSwitchBinding extends ViewDataBinding {
    public final ConstraintLayout clRoot;
    public final AppCompatTextView tvAll;
    public final AppCompatTextView tvSets;
    public final AppCompatTextView tvSummary;
    public final View vBackground;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewMeCollectionPageSwitchBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clRoot, AppCompatTextView tvAll, AppCompatTextView tvSets, AppCompatTextView tvSummary, View vBackground) {
        super(_bindingComponent, _root, _localFieldCount);
        this.clRoot = clRoot;
        this.tvAll = tvAll;
        this.tvSets = tvSets;
        this.tvSummary = tvSummary;
        this.vBackground = vBackground;
    }

    public static ViewMeCollectionPageSwitchBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionPageSwitchBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewMeCollectionPageSwitchBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_page_switch, root, attachToRoot, component);
    }

    public static ViewMeCollectionPageSwitchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionPageSwitchBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewMeCollectionPageSwitchBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_page_switch, null, false, component);
    }

    public static ViewMeCollectionPageSwitchBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionPageSwitchBinding bind(View view, Object component) {
        return (ViewMeCollectionPageSwitchBinding) bind(component, view, R.layout.view_me_collection_page_switch);
    }
}
