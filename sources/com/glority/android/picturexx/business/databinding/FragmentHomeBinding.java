package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentHomeBinding extends ViewDataBinding {
    public final LinearLayout backToTopLl;
    public final ImageView homeBg;
    public final RecyclerView rv;
    public final ImageView searchIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout backToTopLl, ImageView homeBg, RecyclerView rv, ImageView searchIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.backToTopLl = backToTopLl;
        this.homeBg = homeBg;
        this.rv = rv;
        this.searchIv = searchIv;
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentHomeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentHomeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_home, null, false, component);
    }

    public static FragmentHomeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeBinding bind(View view, Object component) {
        return (FragmentHomeBinding) bind(component, view, R.layout.fragment_home);
    }
}
