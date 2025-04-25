package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class FragmentCustomIdentificationResultsBinding extends ViewDataBinding {
    public final ConstraintLayout bottomContainer;
    public final ImageView ivClose;
    public final ViewPager2 mainImageVp;
    public final TextView pagerIndex;
    public final LinearLayout retakeLl;
    public final MaterialButton retakeTv;
    public final RecyclerView rv;
    public final View rvTop;
    public final FrameLayout topImgFl;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomIdentificationResultsBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout bottomContainer, ImageView ivClose, ViewPager2 mainImageVp, TextView pagerIndex, LinearLayout retakeLl, MaterialButton retakeTv, RecyclerView rv, View rvTop, FrameLayout topImgFl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.bottomContainer = bottomContainer;
        this.ivClose = ivClose;
        this.mainImageVp = mainImageVp;
        this.pagerIndex = pagerIndex;
        this.retakeLl = retakeLl;
        this.retakeTv = retakeTv;
        this.rv = rv;
        this.rvTop = rvTop;
        this.topImgFl = topImgFl;
    }

    public static FragmentCustomIdentificationResultsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomIdentificationResultsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomIdentificationResultsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_identification_results, root, attachToRoot, component);
    }

    public static FragmentCustomIdentificationResultsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomIdentificationResultsBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomIdentificationResultsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_identification_results, null, false, component);
    }

    public static FragmentCustomIdentificationResultsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomIdentificationResultsBinding bind(View view, Object component) {
        return (FragmentCustomIdentificationResultsBinding) bind(component, view, R.layout.fragment_custom_identification_results);
    }
}
