package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.recognize.R;

/* loaded from: classes5.dex */
public abstract class ActivityCoreBinding extends ViewDataBinding {
    public final FragmentContainerView fcv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityCoreBinding(Object obj, View view, int i, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.fcv = fragmentContainerView;
    }

    public static ActivityCoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivityCoreBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_core, viewGroup, z, obj);
    }

    public static ActivityCoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCoreBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivityCoreBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_core, null, false, obj);
    }

    public static ActivityCoreBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCoreBinding bind(View view, Object obj) {
        return (ActivityCoreBinding) bind(obj, view, R.layout.activity_core);
    }
}
