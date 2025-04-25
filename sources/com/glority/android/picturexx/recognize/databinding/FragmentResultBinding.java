package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.recognize.R;

/* loaded from: classes5.dex */
public abstract class FragmentResultBinding extends ViewDataBinding {
    public final FragmentContainerView fcv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentResultBinding(Object obj, View view, int i, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.fcv = fragmentContainerView;
    }

    public static FragmentResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_result, viewGroup, z, obj);
    }

    public static FragmentResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_result, null, false, obj);
    }

    public static FragmentResultBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResultBinding bind(View view, Object obj) {
        return (FragmentResultBinding) bind(obj, view, R.layout.fragment_result);
    }
}
