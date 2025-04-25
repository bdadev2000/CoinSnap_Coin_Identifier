package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.ui.base.FixedWebView;
import com.glority.base.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes6.dex */
public abstract class FragmentCommonWebBinding extends ViewDataBinding {
    public final LinearLayout llContainer;
    public final Toolbar ntb;
    public final LinearProgressIndicator progressHorizontal;
    public final FixedWebView wv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCommonWebBinding(Object obj, View view, int i, LinearLayout linearLayout, Toolbar toolbar, LinearProgressIndicator linearProgressIndicator, FixedWebView fixedWebView) {
        super(obj, view, i);
        this.llContainer = linearLayout;
        this.ntb = toolbar;
        this.progressHorizontal = linearProgressIndicator;
        this.wv = fixedWebView;
    }

    public static FragmentCommonWebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCommonWebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentCommonWebBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_common_web, viewGroup, z, obj);
    }

    public static FragmentCommonWebBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCommonWebBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentCommonWebBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_common_web, null, false, obj);
    }

    public static FragmentCommonWebBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCommonWebBinding bind(View view, Object obj) {
        return (FragmentCommonWebBinding) bind(obj, view, R.layout.fragment_common_web);
    }
}
