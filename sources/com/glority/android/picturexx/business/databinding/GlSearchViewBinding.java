package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class GlSearchViewBinding extends ViewDataBinding {
    public final ImageView backIv;
    public final ImageView deleteIv;
    public final ImageView deleteRecentIv;
    public final EditText et;
    public final FrameLayout noSearchLayout;
    public final ConstraintLayout recentLl;
    public final RecyclerView recentRv;
    public final RecyclerView rv;
    public final GlTextView tv1;

    /* JADX INFO: Access modifiers changed from: protected */
    public GlSearchViewBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView backIv, ImageView deleteIv, ImageView deleteRecentIv, EditText et, FrameLayout noSearchLayout, ConstraintLayout recentLl, RecyclerView recentRv, RecyclerView rv, GlTextView tv1) {
        super(_bindingComponent, _root, _localFieldCount);
        this.backIv = backIv;
        this.deleteIv = deleteIv;
        this.deleteRecentIv = deleteRecentIv;
        this.et = et;
        this.noSearchLayout = noSearchLayout;
        this.recentLl = recentLl;
        this.recentRv = recentRv;
        this.rv = rv;
        this.tv1 = tv1;
    }

    public static GlSearchViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static GlSearchViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (GlSearchViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.gl_search_view, root, attachToRoot, component);
    }

    public static GlSearchViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static GlSearchViewBinding inflate(LayoutInflater inflater, Object component) {
        return (GlSearchViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.gl_search_view, null, false, component);
    }

    public static GlSearchViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static GlSearchViewBinding bind(View view, Object component) {
        return (GlSearchViewBinding) bind(component, view, R.layout.gl_search_view);
    }
}
